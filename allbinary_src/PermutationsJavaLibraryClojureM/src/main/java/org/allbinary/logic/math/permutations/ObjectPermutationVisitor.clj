;; Generated Code Do Not Modify
;; package org.allbinary.logic.math.permutations

(ns ObjectPermutationVisitor)

(JR/register 'ObjectPermutationVisitor 'Visitor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :data nil)
  (JR/fset this :stringBuilder nil)
    (JR/fset this :stringBuilder (StringMaker/jnew_0))
  this)

    
(defn jinit_1 [this p_data]
  (let [ l_data (volatile! p_data)]
    (Visitor/jinit_0 this) (jinitfields this)
        (JR/fset this :data @l_data))
  this)

(defn jnew_1 [p_data ]
  (let [o (JR/alloc 'ObjectPermutationVisitor)] (jinit_1 o p_data) o))

    
(defn jm_visit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
        (JR/invoke this :jm_print_2 (JR/fget this :data) (JR/fget this :stringBuilder))
        (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT)))

    
(defn jm_print_1 [this p_data]
  (let [ l_data (volatile! p_data) l_stringBuilder (volatile! nil)]
        (vreset! l_stringBuilder (StringMaker/jnew_0))
        (JR/invoke this :jm_print_2 @l_data @l_stringBuilder)))

    
(defn jm_print_2 [this p_data p_stringBuilder]
  (let [ l_data (volatile! p_data) l_stringBuilder (volatile! p_stringBuilder) l_tsUtil (volatile! nil) l_size (volatile! nil) l_i (volatile! nil)]
        (vreset! l_tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
        (vreset! l_size (JR/alen @l_data))
        (do (vreset! l_i 0)
            (JR/jfor false false (< @l_i @l_size) (do (JR/vinc l_i 1 :int false))
            (JR/invoke @l_stringBuilder :jm_appendint_1 (JR/invoke @l_tsUtil :jm_hashCode_1 (JR/aget* @l_data @l_i)))
            (JR/invoke @l_stringBuilder :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))))
        (JR/println* (JR/to-string-of @l_stringBuilder))))



