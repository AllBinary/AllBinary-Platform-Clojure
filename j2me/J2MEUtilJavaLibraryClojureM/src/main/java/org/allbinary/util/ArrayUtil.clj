;; Generated Code Do Not Modify
;; package org.allbinary.util

(ns ArrayUtil)

(JR/register 'ArrayUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ArrayUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :mathUtil nil)
    (JR/fset this :mathUtil (JR/scall 'MathUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ArrayUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ArrayUtil/jstatic_instance)))

    
(defn jm_copyOf_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength)]
        (JR/invoke this :jm_copyOfType_3 @l_original @l_newLength (JR/class-name @l_original))))

    
(defn jm_copyOfType_3 [this p_original p_newLength p_newType]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_newType (volatile! p_newType) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "Object" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_copyOfbyte_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "BYTE" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_copyOfshort_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "SHORT" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_copyOfint_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "INT" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_copyOflong_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "LONG" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_copyOfchar_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "CHAR" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_copyOffloat_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "FLOAT" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_copyOfdouble_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "DOUBLE" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_copyOfboolean_2 [this p_original p_newLength]
  (let [ l_original (volatile! p_original) l_newLength (volatile! p_newLength) l_copy (volatile! nil)]
        (vreset! l_copy (JR/anew "BOOLEAN" 1 @l_newLength))
        (JR/arraycopy @l_original 0 @l_copy 0 (JR/invoke (JR/fget this :mathUtil) :jm_min_2 (JR/alen @l_original) @l_newLength))
        @l_copy))

    
(defn jm_reverse_1 [this p_intArray]
  (let [ l_intArray (volatile! p_intArray) l_length (volatile! nil) l_temp (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_length (unchecked-int (unchecked-subtract (JR/alen @l_intArray) 1)))
        (vreset! l_temp 0)
        (vreset! l_size (JR/idiv @l_length 2))
        (do (vreset! l_index 0)
            (JR/jfor false false (<= @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_temp (JR/aget* @l_intArray @l_index))
            (JR/aset* @l_intArray @l_index (JR/aget* @l_intArray (unchecked-int (unchecked-subtract @l_length @l_index))))
            (JR/aset* @l_intArray (unchecked-int (unchecked-subtract @l_length @l_index)) @l_temp)))))

    
(defn jm_flip_3 [this p_intArray p_width p_height]
  (let [ l_intArray (volatile! p_intArray) l_width (volatile! p_width) l_height (volatile! p_height) l_length (volatile! nil) l_temp (volatile! nil) l_index (volatile! nil) l_rowIndex (volatile! nil) l_x (volatile! nil) l_y (volatile! nil)]
        (vreset! l_length (unchecked-int (unchecked-subtract @l_height 1)))
        (vreset! l_temp 0)
        (vreset! l_index 0)
        (vreset! l_rowIndex 0)
        (do (vreset! l_y 0)
            (JR/jfor false false (<= @l_y (JR/idiv @l_length 2)) (do (JR/vinc l_y 1 :int false))
            (do (vreset! l_x 0)
                (JR/jfor false false (< @l_x @l_width) (do (JR/vinc l_x 1 :int false))
                (vreset! l_rowIndex (unchecked-int (unchecked-multiply (unchecked-int (unchecked-subtract @l_length @l_y)) @l_width)))
                (vreset! l_index (unchecked-int (unchecked-add @l_x (unchecked-int (unchecked-multiply @l_y @l_width)))))
                (vreset! l_temp (JR/aget* @l_intArray @l_index))
                (JR/aset* @l_intArray @l_index (JR/aget* @l_intArray (unchecked-int (unchecked-add @l_rowIndex @l_x))))
                (JR/aset* @l_intArray (unchecked-int (unchecked-add @l_rowIndex @l_x)) @l_temp)))))))

    
(defn jm_toStringFromTwoDimensionaArray_1 [this p_twoDimensionalIntArray]
  (let [ l_twoDimensionalIntArray (volatile! p_twoDimensionalIntArray) l_stringBuffer (volatile! nil) l_commonSeps (volatile! nil) l_endIndex (volatile! nil) l_endIndex2 (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (vreset! l_endIndex (JR/alen @l_twoDimensionalIntArray))
        (vreset! l_endIndex2 (JR/alen (JR/aget* @l_twoDimensionalIntArray 0)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_endIndex) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :BRACE_OPEN))
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 @l_endIndex2) (do (JR/vinc l_index2 1 :int false))
                (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/aget* (JR/aget* @l_twoDimensionalIntArray @l_index) @l_index2)))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :BRACE_CLOSE))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :NEW_LINE))))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_toStringFromObjectArray_1 [this p_objectArray]
  (let [ l_objectArray (volatile! p_objectArray) l_stringBuffer (volatile! nil) l_commonSeps (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_objectArray)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/aget* @l_objectArray @l_index)))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_toStringFromByteArray_1 [this p_byteArray]
  (let [ l_byteArray (volatile! p_byteArray) l_stringBuffer (volatile! nil) l_commonSeps (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_byteArray)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_stringBuffer :jm_appendbyte_1 (JR/aget* @l_byteArray @l_index))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))))
        (JR/to-string-of @l_stringBuffer)))



