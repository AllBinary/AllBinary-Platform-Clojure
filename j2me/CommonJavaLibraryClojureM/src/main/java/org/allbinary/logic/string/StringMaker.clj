;; Generated Code Do Not Modify
;; package org.allbinary.logic.string

(ns StringMaker)

(JR/register 'StringMaker nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :charArray nil)
  (JR/fset this :currentLength 0)
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :charArray (JR/anew "CHAR" 1 20)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'StringMaker)] (jinit_0 o) o))

    
(defn jm_append_1 [this p_string]
  (let [ l_string (volatile! p_string) l_stringLength (volatile! nil)]
        (vreset! l_stringLength (JR/slength @l_string))
        (JR/invoke this :jm_ensureCapacity_1 (unchecked-int (unchecked-add (JR/fget this :currentLength) @l_stringLength)))
        (JR/invoke @l_string :jm_getChars_4 0 @l_stringLength (JR/fget this :charArray) (JR/fget this :currentLength))
        (JR/fset this :currentLength (unchecked-int (unchecked-add (JR/fget this :currentLength) @l_stringLength)))
        this))

    
(defn jm_appendchar_1 [this p_c]
  (let [ l_c (volatile! p_c)]
        (JR/invoke this :jm_ensureCapacity_1 (unchecked-int (unchecked-add (JR/fget this :currentLength) 1)))
        (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) @l_c)
        this))

    
(defn jm_appendCharArray_3 [this p_charArray p_start p_end]
  (let [ l_charArray (volatile! p_charArray) l_start (volatile! p_start) l_end (volatile! p_end) l_index (volatile! nil)]
        (JR/invoke this :jm_ensureCapacity_1 (unchecked-int (unchecked-add (JR/fget this :currentLength) (unchecked-int (unchecked-subtract @l_end @l_start)))))
        (do (vreset! l_index @l_start)
            (JR/jfor false false (< @l_index @l_end) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) (JR/aget* @l_charArray @l_index))))
        this))

    
(defn jm_appendbyte_1 [this p_b]
  (let [ l_b (volatile! p_b)]
        (JR/invoke this :jm_append_1 (JR/s @l_b))
        this))

    
(defn jm_appendshort_1 [this p_b]
  (let [ l_b (volatile! p_b)]
        (JR/invoke this :jm_append_1 (JR/s @l_b))
        this))

    
(defn jm_appendint_1 [this p_i]
  (let [ l_i (volatile! p_i)]
        (JR/invoke this :jm_append_1 (JR/s @l_i))
        this))

    
(defn jm_appendlong_1 [this p_l]
  (let [ l_l (volatile! p_l)]
        (JR/invoke this :jm_append_1 (JR/s @l_l))
        this))

    
(defn jm_appendfloat_1 [this p_f]
  (let [ l_f (volatile! p_f)]
        (JR/invoke this :jm_append_1 (JR/s @l_f))
        this))

    
(defn jm_appendboolean_1 [this p_bool]
  (let [ l_bool (volatile! p_bool)]
        (if @l_bool
            (do
            (JR/invoke this :jm_ensureCapacity_1 (unchecked-int (unchecked-add (JR/fget this :currentLength) 4)))
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \t)
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \r)
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \u)
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \e))
            (do
            (JR/invoke this :jm_ensureCapacity_1 (unchecked-int (unchecked-add (JR/fget this :currentLength) 5)))
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \f)
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \a)
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \l)
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \s)
            (JR/aset* (JR/fget this :charArray) (JR/finc this :currentLength 1 :int true) \e)))
        this))

    
(defn jm_ensureCapacity_1 [this p_minSize]
  (let [ l_minSize (volatile! p_minSize) l_oldCapacity (volatile! nil) l_newCapacity (volatile! nil) l_copy (volatile! nil) l_min (volatile! nil)]
        (vreset! l_oldCapacity (JR/alen (JR/fget this :charArray)))
        (if (> @l_minSize @l_oldCapacity)
            (do
            (vreset! l_newCapacity (unchecked-int (unchecked-multiply @l_oldCapacity 3)))
            (if (< @l_newCapacity @l_minSize)
                (do
                (vreset! l_newCapacity @l_minSize)))
            (vreset! l_copy (JR/anew "CHAR" 1 @l_newCapacity))
            (vreset! l_min (JR/invoke this :jm_min_2 (JR/alen (JR/fget this :charArray)) @l_newCapacity))
            (JR/arraycopy (JR/fget this :charArray) 0 @l_copy 0 @l_min)
            (JR/fset this :charArray @l_copy)))))

    
(defn jm_min_2 [this p_value p_value2]
  (let [ l_value (volatile! p_value) l_value2 (volatile! p_value2)]
        (if (<= @l_value @l_value2) @l_value @l_value2)))

    
(defn jm_delete_2 [this p_start p_end]
  (let [ l_start (volatile! p_start) l_end (volatile! p_end)]
        (JR/fset this :currentLength (unchecked-int (unchecked-subtract (JR/fget this :currentLength) (unchecked-int (unchecked-subtract @l_end @l_start)))))
        this))

    
(defn jm_length_0 [this]
  (let []
        (JR/fget this :currentLength)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/new-string (JR/fget this :charArray) 0 (JR/fget this :currentLength))))



