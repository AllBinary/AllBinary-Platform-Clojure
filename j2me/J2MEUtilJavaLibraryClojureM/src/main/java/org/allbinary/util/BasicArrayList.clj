;; Generated Code Do Not Modify
;; package org.allbinary.util

;;This is a very fast and simple resizable list.
(ns BasicArrayList)

(JR/register 'BasicArrayList nil '[])

(def jsv_SIZE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SIZE [] (JR/ensure-init jclinit-state jclinit) @jsv_SIZE)
(defn jstatic_set_SIZE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SIZE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SIZE ", Size: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :arrayUtil nil)
  (JR/fset this :objectArray nil)
  (JR/fset this :currentIndex 0)
    (JR/fset this :arrayUtil (JR/scall 'ArrayUtil :jm_getInstance_0))
    (JR/fset this :currentIndex 0)
  this)

    
(defn jinit_1 [this p_objectArray]
  (let [ l_objectArray (volatile! p_objectArray)]
    nil (jinitfields this)
        (JR/fset this :objectArray @l_objectArray))
  this)

(defn jnew_1 [p_objectArray ]
  (let [o (JR/alloc 'BasicArrayList)] (jinit_1 o p_objectArray) o))

    
(defn jm_addAt_2 [this p_index p_element]
  (let [ l_index (volatile! p_index) l_element (volatile! p_element) l_stringBuffer (volatile! nil)]
        (if (or (> @l_index (JR/fget this :currentIndex)) (< @l_index 0))
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :INDEX_LABEL))
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
            (JR/invoke @l_stringBuffer :jm_append_1 (BasicArrayList/jstatic_SIZE))
            (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :currentIndex))
            (JR/jthrow (new java.lang.IndexOutOfBoundsException (JR/to-string-of @l_stringBuffer)))))
        (JR/invoke this :jm_ensureCapacity_1 (unchecked-int (unchecked-add (JR/fget this :currentIndex) 1)))
        (JR/arraycopy (JR/fget this :objectArray) @l_index (JR/fget this :objectArray) (unchecked-int (unchecked-add @l_index 1)) (unchecked-int (unchecked-subtract (JR/fget this :currentIndex) @l_index)))
        (JR/aset* (JR/fget this :objectArray) @l_index @l_element)
        (JR/finc this :currentIndex 1 :int false)))

    
(defn jm_add_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke this :jm_ensureCapacity_1 (unchecked-int (unchecked-add (JR/fget this :currentIndex) 1)))
        (JR/aset* (JR/fget this :objectArray) (JR/finc this :currentIndex 1 :int true) @l_anyType)
        true))

    
(defn jm_removeAt_1 [this p_index]
  (let [ l_index (volatile! p_index) l_stringBuffer (volatile! nil) l_oldValue (volatile! nil) l_numMoved (volatile! nil)]
        (if (>= @l_index (JR/fget this :currentIndex))
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :INDEX_LABEL))
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
            (JR/invoke @l_stringBuffer :jm_append_1 (BasicArrayList/jstatic_SIZE))
            (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :currentIndex))
            (JR/jthrow (new java.lang.IndexOutOfBoundsException (JR/to-string-of @l_stringBuffer)))))
        (vreset! l_oldValue (JR/aget* (JR/fget this :objectArray) @l_index))
        (vreset! l_numMoved (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/fget this :currentIndex) @l_index)) 1)))
        (if (> @l_numMoved 0)
            (do
            (JR/arraycopy (JR/fget this :objectArray) (unchecked-int (unchecked-add @l_index 1)) (JR/fget this :objectArray) @l_index @l_numMoved)))
        (JR/aset* (JR/fget this :objectArray) (JR/finc this :currentIndex -1 :int false) nil)
        @l_oldValue))

    
(defn jm_remove_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType) l_numMoved (volatile! nil) l_index (volatile! nil)](JR/method
        (if (nil? @l_anyType)
            (do
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index (JR/fget this :currentIndex)) (do (JR/vinc l_index 1 :int false))
                (if (nil? (JR/aget* (JR/fget this :objectArray) @l_index))
                    (do
                    (vreset! l_numMoved (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/fget this :currentIndex) @l_index)) 1)))
                    (if (> @l_numMoved 0)
                        (do
                        (JR/arraycopy (JR/fget this :objectArray) (unchecked-int (unchecked-add @l_index 1)) (JR/fget this :objectArray) @l_index @l_numMoved)))
                    (JR/aset* (JR/fget this :objectArray) (JR/finc this :currentIndex -1 :int false) nil)
                    (JR/jreturn true))))))
            (do
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index (JR/fget this :currentIndex)) (do (JR/vinc l_index 1 :int false))
                (if (or (JR/eq @l_anyType (JR/aget* (JR/fget this :objectArray) @l_index)) (JR/invoke @l_anyType :jm_equals_1 (JR/aget* (JR/fget this :objectArray) @l_index)))
                    (do
                    (vreset! l_numMoved (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/fget this :currentIndex) @l_index)) 1)))
                    (if (> @l_numMoved 0)
                        (do
                        (JR/arraycopy (JR/fget this :objectArray) (unchecked-int (unchecked-add @l_index 1)) (JR/fget this :objectArray) @l_index @l_numMoved)))
                    (JR/aset* (JR/fget this :objectArray) (JR/finc this :currentIndex -1 :int false) nil)
                    (JR/jreturn true)))))))
        false)))

    
(defn jm_removeAll2_1 [this p_list]
  (let [ l_list (volatile! p_list) l_result (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_result true)
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (if (JR/invoke this :jm_remove_1 (JR/invoke @l_list :jm_get_1 @l_index))
                (do
                nil)
                (do
                (vreset! l_result false)))))
        @l_result))

    
(defn jm_addAll2_1 [this p_list]
  (let [ l_list (volatile! p_list) l_listSize (volatile! nil) l_index (volatile! nil)]
        (JR/invoke this :jm_ensureCapacity_1 (+ (JR/fget this :currentIndex) (JR/fget @l_list :currentIndex)))
        (vreset! l_listSize (JR/fget @l_list :currentIndex))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_listSize) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :objectArray) (JR/finc this :currentIndex 1 :int true) (JR/aget* (JR/fget @l_list :objectArray) @l_index))))
        true))

    
(defn jm_addAllList_1 [this p_list]
  (let [ l_list (volatile! p_list) l_newObjectArray (volatile! nil)]
        (vreset! l_newObjectArray (JR/invoke @l_list :jm_toArray_0))
        (JR/invoke this :jm_addAll_1 @l_newObjectArray)))

    
(defn jm_addAll_1 [this p_newObjectArray]
  (let [ l_newObjectArray (volatile! p_newObjectArray) l_numSize (volatile! nil)]
        (vreset! l_numSize (JR/alen @l_newObjectArray))
        (JR/invoke this :jm_ensureCapacity_1 (unchecked-int (unchecked-add (JR/fget this :currentIndex) @l_numSize)))
        (JR/arraycopy @l_newObjectArray 0 (JR/fget this :objectArray) (JR/fget this :currentIndex) @l_numSize)
        (JR/fset this :currentIndex (unchecked-int (unchecked-add (JR/fget this :currentIndex) @l_numSize)))
        (not (== @l_numSize 0))))

    
(defn jm_ensureCapacity_1 [this p_minSize]
  (let [ l_minSize (volatile! p_minSize) l_oldCapacity (volatile! nil) l_newCapacity (volatile! nil)]
        (vreset! l_oldCapacity (JR/alen (JR/fget this :objectArray)))
        (if (> @l_minSize @l_oldCapacity)
            (do
            (vreset! l_newCapacity (unchecked-int (unchecked-add (JR/ishr (unchecked-int (unchecked-multiply @l_oldCapacity 3)) 1) 1)))
            (if (< @l_newCapacity @l_minSize)
                (do
                (vreset! l_newCapacity @l_minSize)))
            (JR/fset this :objectArray (JR/invoke (JR/fget this :arrayUtil) :jm_copyOf_2 (JR/fget this :objectArray) @l_newCapacity))))))

    
(defn jm_trimToSize_0 [this]
  (let [ l_oldCapacity (volatile! nil)]
        (vreset! l_oldCapacity (JR/alen (JR/fget this :objectArray)))
        (if (< (JR/fget this :currentIndex) @l_oldCapacity)
            (do
            (JR/fset this :objectArray (JR/invoke (JR/fget this :arrayUtil) :jm_copyOf_2 (JR/fget this :objectArray) (JR/fget this :currentIndex)))))))

    
(defn jm_indexOf_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType) l_i (volatile! nil)](JR/method
        (if (nil? @l_anyType)
            (do
            (do (vreset! l_i 0)
                (JR/jfor false false (< @l_i (JR/fget this :currentIndex)) (do (JR/vinc l_i 1 :int false))
                (if (nil? (JR/aget* (JR/fget this :objectArray) @l_i))
                    (do
                    (JR/jreturn @l_i))))))
            (do
            (do (vreset! l_i 0)
                (JR/jfor false false (< @l_i (JR/fget this :currentIndex)) (do (JR/vinc l_i 1 :int false))
                (if (JR/invoke @l_anyType :jm_equals_1 (JR/aget* (JR/fget this :objectArray) @l_i))
                    (do
                    (JR/jreturn @l_i)))))))
        (unchecked-int (unchecked-negate (JR/c2i 1))))))

    
(defn jm_lastIndexOf_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType) l_i (volatile! nil)](JR/method
        (if (nil? @l_anyType)
            (do
            (do (vreset! l_i (unchecked-int (unchecked-subtract (JR/fget this :currentIndex) 1)))
                (JR/jfor false false (>= @l_i 0) (do (JR/vinc l_i -1 :int false))
                (if (nil? (JR/aget* (JR/fget this :objectArray) @l_i))
                    (do
                    (JR/jreturn @l_i))))))
            (do
            (do (vreset! l_i (unchecked-int (unchecked-subtract (JR/fget this :currentIndex) 1)))
                (JR/jfor false false (>= @l_i 0) (do (JR/vinc l_i -1 :int false))
                (if (JR/invoke @l_anyType :jm_equals_1 (JR/aget* (JR/fget this :objectArray) @l_i))
                    (do
                    (JR/jreturn @l_i)))))))
        (unchecked-int (unchecked-negate (JR/c2i 1))))))

    
(defn jm_get_1 [this p_index]
  (let [ l_index (volatile! p_index) l_stringBuffer (volatile! nil)]
        (if (>= @l_index (JR/fget this :currentIndex))
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :INDEX_LABEL))
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
            (JR/invoke @l_stringBuffer :jm_append_1 (BasicArrayList/jstatic_SIZE))
            (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :currentIndex))
            (JR/jthrow (new java.lang.IndexOutOfBoundsException (JR/to-string-of @l_stringBuffer)))))
        (JR/aget* (JR/fget this :objectArray) @l_index)))

    
(defn jm_set_2 [this p_index p_element]
  (let [ l_index (volatile! p_index) l_element (volatile! p_element) l_stringBuffer (volatile! nil) l_oldValue (volatile! nil)]
        (if (>= @l_index (JR/fget this :currentIndex))
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :INDEX_LABEL))
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
            (JR/invoke @l_stringBuffer :jm_append_1 (BasicArrayList/jstatic_SIZE))
            (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :currentIndex))
            (JR/jthrow (new java.lang.IndexOutOfBoundsException (JR/to-string-of @l_stringBuffer)))))
        (vreset! l_oldValue (JR/aget* (JR/fget this :objectArray) @l_index))
        (JR/aset* (JR/fget this :objectArray) @l_index @l_element)
        @l_oldValue))

    
(defn jm_clear_0 [this]
  (let [ l_i (volatile! nil)]
        (do (vreset! l_i 0)
            (JR/jfor false false (< @l_i (JR/fget this :currentIndex)) (do (JR/vinc l_i 1 :int false))
            (JR/aset* (JR/fget this :objectArray) @l_i nil)))
        (JR/fset this :currentIndex 0)))

    
(defn jm_size_0 [this]
  (let []
        (JR/fget this :currentIndex)))

    
(defn jm_isEmpty_0 [this]
  (let []
        (== (JR/fget this :currentIndex) 0)))

    
(defn jm_contains_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (>= (JR/invoke this :jm_indexOf_1 @l_anyType) 0)))

    
(defn jm_toArray_0 [this]
  (let []
        (JR/invoke (JR/fget this :arrayUtil) :jm_copyOf_2 (JR/fget this :objectArray) (JR/fget this :currentIndex))))

    
(defn jm_toArrayType_1 [this p_objectArray]
  (let [ l_objectArray (volatile! p_objectArray)](JR/method
        (if (< (JR/alen @l_objectArray) (JR/fget this :currentIndex))
            (do
            (JR/jreturn (JR/invoke (JR/fget this :arrayUtil) :jm_copyOfType_3 (JR/fget this :objectArray) (JR/fget this :currentIndex) (JR/class-name @l_objectArray)))))
        (JR/arraycopy (JR/fget this :objectArray) 0 @l_objectArray 0 (JR/fget this :currentIndex))
        (if (> (JR/alen @l_objectArray) (JR/fget this :currentIndex))
            (do
            (JR/aset* @l_objectArray (JR/fget this :currentIndex) nil)))
        @l_objectArray)))

    
(defn jm_clone_0 [this]
  (let [ l_size (volatile! nil) l_list (volatile! nil) l_anyType (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke this :jm_size_0))
        (vreset! l_list (BasicArrayListS/jnew_1 @l_size))
        (vreset! l_anyType nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_anyType (JR/aget* (JR/fget this :objectArray) @l_index))
            (JR/invoke @l_list :jm_add_1 @l_anyType)))
        @l_list))

    
(defn jm_toString_0 [this]
  (let [ l_COMMA_SEP (volatile! nil) l_stringBuffer (volatile! nil) l_index (volatile! nil)]
        (vreset! l_COMMA_SEP (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COMMA_SEP))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :currentIndex)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/aget* (JR/fget this :objectArray) @l_index)))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_COMMA_SEP)))
        (JR/to-string-of @l_stringBuffer)))



