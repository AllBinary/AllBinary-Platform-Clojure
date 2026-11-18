#!/usr/bin/env bash

# Compiles the Clojure files the Clojure converter generated with clojure.main and jcheck.clj: the hand written runtime
# is loaded, every namespace of the dependencies (META-INF/clojure/src of their jars) and of this project is declared
# without being compiled (Java classes refer to each other in cycles), and then every file of this project is compiled.
# Only this project's files are compiled, so an error of a dependency or a class of an optional dependency (Maven does not
# add those, they are not transitive) does not fail this project. This project's sources are written to <output>/src.
# Arguments: source_dir output_dir object_dir dependency_dir runtime_dir compiler "flags" artifactId fail_on_error
# The compiler is the Clojure jar (java -cp it clojure.main).

set -uo pipefail

export PATH="/usr/local/bin:/usr/bin:/bin:$PATH"

source_dir="$(cygpath -u "$1")"
output_dir="$(cygpath -u "$2")"
object_dir="$(cygpath -u "$3")"
dependency_dir="$(cygpath -u "$4")"
runtime_dir="$(cygpath -u "$5")"
compiler="$(cygpath -w "$6")"
read -r -a compiler_flags <<< "$7"
artifact="$8"
fail_on_error="${9:-true}"
jcheck="G:/mnt/bc/mydev/work/allbinary_src/JavaAsXmlToLanguageLibraryM/planned_language_build/clojure/jcheck.clj"

if [ ! -d "$source_dir" ]; then
    echo "No Clojure sources: $source_dir"
    exit 0
fi

rm -rf "$output_dir" "$object_dir"
mkdir -p "$output_dir/src" "$object_dir"
cp -R "$source_dir/." "$output_dir/src/"
echo "Clojure files: $(find "$source_dir" -type f -name '*.clj' | wc -l)"

# A deep project folder plus a deep package can pass the Windows 260 character path limit, so the check runs in a short
# temporary copy
short_tree="$(mktemp -d /tmp/cljXXXXXX)"
trap 'rm -rf "$short_tree"' EXIT
mkdir -p "$short_tree/runtime" "$short_tree/dependencies" "$short_tree/project"
cp -R "$runtime_dir/." "$short_tree/runtime/"
if [ -d "$dependency_dir/src" ]; then
    cp -R "$dependency_dir/src/." "$short_tree/dependencies/"
fi
cp -R "$source_dir/." "$short_tree/project/"

output="$(java "${compiler_flags[@]}" -cp "$compiler" clojure.main "$jcheck" "$(cygpath -w "$short_tree/runtime")" "$(cygpath -w "$short_tree/dependencies")" "$(cygpath -w "$short_tree/project")" 2>&1)"
status=$?
echo "$output" | grep -E '^jcheck' | head -200
if [ "$status" = "0" ]; then
    echo "Clojure compiled: $artifact"
    exit 0
fi
echo "$output" | grep -v -E '^jcheck' | head -20
echo "Clojure build failed: $artifact" >&2
if [ "$fail_on_error" = "true" ]; then
    exit 1
fi
exit 0
