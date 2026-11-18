;;
;; AllBinary Open License Version 1
;; Copyright (c) 2011 AllBinary
;; 
;; By agreeing to this license you and any business entity you represent are
;; legally bound to the AllBinary Open License Version 1 legal agreement.
;; 
;; You may obtain the AllBinary Open License Version 1 legal agreement from
;; AllBinary or the root directory of AllBinary's AllBinary Platform repository.
;; 
;; Created By: Travis Berthelot
;;  
;; Generated Code Do Not Modify
;; package org.allbinary.image

(ns ImageCacheBase)

(JR/register 'ImageCacheBase nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :imageFactory nil)
  (JR/fset this :hashtable nil)
  (JR/fset this :SIZE 0)
  (JR/fset this :widths nil)
  (JR/fset this :heights nil)
  (JR/fset this :listOfList nil)
  (JR/fset this :availableListOfList nil)
  (JR/fset this :volume 0)
  (JR/fset this :nextIndex 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :imageFactory (JR/scall 'ImageFactory :jm_getInstance_0))
    (JR/fset this :hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
    (JR/fset this :SIZE 128)
    (JR/fset this :widths (JR/anew "INT" 1 (JR/fget this :SIZE)))
    (JR/fset this :heights (JR/anew "INT" 1 (JR/fget this :SIZE)))
    (JR/fset this :listOfList (JR/anew "Object" 1 (JR/fget this :SIZE)))
    (JR/fset this :availableListOfList (JR/anew "Object" 1 (JR/fget this :SIZE)))
    (JR/fset this :volume 0)
    (JR/fset this :nextIndex 0)
  this)

    
(defn jinit_0 [this]
  (let [ l_index (volatile! nil)]
    nil (jinitfields this)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :listOfList)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :listOfList) @l_index (BasicArrayListD/jnew_0))))
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :availableListOfList)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :availableListOfList) @l_index (BasicArrayListD/jnew_0)))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ImageCacheBase)] (jinit_0 o) o))

    
(defn jm_getImage_1 [this p_resourceId]
  (let [ l_resourceId (volatile! p_resourceId) l_imageCanBeNull (volatile! nil)](JR/method
        (vreset! l_imageCanBeNull (JR/invoke (JR/fget this :hashtable) :jm_get_1 @l_resourceId))
        (if (nil? @l_imageCanBeNull)
            (do
            (JR/jreturn (JR/sget 'NullImage "NULL_IMAGE"))))
        @l_imageCanBeNull)))

    
(defn jm_releaseAll_0 [this]
  (let [ l_index (volatile! nil)]
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :listOfList)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/invoke (JR/aget* (JR/fget this :availableListOfList) @l_index) :jm_clear_0)
            (JR/invoke (JR/aget* (JR/fget this :availableListOfList) @l_index) :jm_addAllList_1 (JR/aget* (JR/fget this :listOfList) @l_index))))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "ImageCache: ") :jm_append_1 (JR/to-string-of this))) this "releaseAll")))

    
(defn jm_getIndexWH_2 [this p_width p_height]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_foundIndex (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_foundIndex (unchecked-int (unchecked-negate (JR/c2i 1))))
        (vreset! l_size (JR/alen (JR/fget this :widths)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (if (and (== (JR/aget* (JR/fget this :widths) @l_index) @l_width) (== (JR/aget* (JR/fget this :heights) @l_index) @l_height))
                (do
                (vreset! l_foundIndex @l_index)
                (JR/jreturn @l_foundIndex)))))
        @l_foundIndex)))

    
(defn jm_getFromAvailable_3 [this p_foundIndex p_width p_height]
  (let [ l_foundIndex (volatile! p_foundIndex) l_width (volatile! p_width) l_height (volatile! p_height) l_list (volatile! nil)](JR/method
        (if (not (== @l_foundIndex (unchecked-int (unchecked-negate (JR/c2i 1)))))
            (do
            (if (> (JR/invoke (JR/aget* (JR/fget this :availableListOfList) @l_foundIndex) :jm_size_0) 0)
                (do
                (vreset! l_list (JR/aget* (JR/fget this :availableListOfList) @l_foundIndex))
                (JR/jreturn (JR/invoke @l_list :jm_removeAt_1 (unchecked-int (unchecked-subtract (JR/invoke @l_list :jm_size_0) 1))))))))
        (JR/sget 'NullImage "NULL_IMAGE"))))

    
(defn jm_get_3 [this p_caller p_width p_height]
  (let [ l_caller (volatile! p_caller) l_width (volatile! p_width) l_height (volatile! p_height)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getWithKey_1 [this p_key]
  (let [ l_key (volatile! p_key)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_createImage_3 [this p_caller p_width p_height]
  (let [ l_caller (volatile! p_caller) l_width (volatile! p_width) l_height (volatile! p_height)]
        (JR/invoke (JR/fget this :imageFactory) :jm_createImage_3 @l_caller @l_width @l_height)))

    
(defn jm_createImageFromInputStream_2 [this p_key p_inputStream]
  (let [ l_key (volatile! p_key) l_inputStream (volatile! p_inputStream)]
        (JR/invoke (JR/fget this :imageFactory) :jm_createImageFromInputStream_2 @l_key @l_inputStream)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_width (volatile! nil) l_height (volatile! nil) l_total (volatile! nil) l_totalAvailable (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/fget this :nextIndex) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_width (JR/aget* (JR/fget this :widths) @l_index))
            (vreset! l_height (JR/aget* (JR/fget this :heights) @l_index))
            (vreset! l_total (JR/invoke (JR/aget* (JR/fget this :listOfList) @l_index) :jm_size_0))
            (vreset! l_totalAvailable (JR/invoke (JR/aget* (JR/fget this :availableListOfList) @l_index) :jm_size_0))
            (JR/invoke @l_stringBuffer :jm_append_1 " w: ")
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_width)
            (JR/invoke @l_stringBuffer :jm_append_1 " h: ")
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_height)
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :TOTAL_LABEL))
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_total)
            (JR/invoke @l_stringBuffer :jm_append_1 " available: ")
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_totalAvailable)))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getHashtableP_0 [this]
  (let []
        (JR/fget this :hashtable)))

    
(defn jm_init_1 [this p_image]
  (let [ l_image (volatile! p_image)]
        nil))

    
(defn jm_initProgress_0 [this]
  (let []
        nil))



