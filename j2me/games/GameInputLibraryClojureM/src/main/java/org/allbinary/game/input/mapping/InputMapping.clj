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
;; package org.allbinary.game.input.mapping

(ns InputMapping)

(JR/register 'InputMapping nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :hashtable nil)
  (JR/fset this :mappedList nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
    (JR/fset this :mappedList (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'InputMapping)] (jinit_0 o) o))

    
(defn jm_getTotalMapped_0 [this]
  (let []
        (JR/invoke (JR/fget this :hashtable) :jm_size_0)))

    
(defn jm_isDefaultNew_0 [this]
  (let []
        false))

    
(defn jm_getDefault_0 [this]
  (let []
        (JR/scall 'InputToGameKeyMapping :jm_getNullInstance_0)))

    
(defn jm_removeAll_0 [this]
  (let []
        (JR/invoke (JR/fget this :hashtable) :jm_clear_0)
        (JR/invoke (JR/fget this :mappedList) :jm_clear_0)))

    
(defn jm_remove_2 [this p_input p_mappedToInput]
  (let [ l_input (volatile! p_input) l_mappedToInput (volatile! p_mappedToInput) l_stringBuffer (volatile! nil) l_stringUtil (volatile! nil) l_list (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 @l_input))
        (JR/invoke @l_stringBuffer :jm_append_1 " == ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 @l_mappedToInput))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this "InputMapping::remove")
        (vreset! l_list (JR/invoke this :jm_getMappedInput_1 @l_input))
        (if (JR/invoke @l_list :jm_contains_1 @l_mappedToInput)
            (do
            (JR/invoke @l_list :jm_remove_1 @l_mappedToInput)
            (JR/invoke (JR/fget this :mappedList) :jm_remove_1 @l_mappedToInput)
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/invoke @l_stringBuffer :jm_append_1 "Removed: ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 @l_input))
            (JR/invoke @l_stringBuffer :jm_append_1 " == ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 @l_mappedToInput))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this "InputMapping::remove"))
            (do
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/invoke @l_stringBuffer :jm_append_1 "Not Deleted: ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 @l_input))
            (JR/invoke @l_stringBuffer :jm_append_1 " == ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 @l_mappedToInput))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this "InputMapping::remove")))))

    
(defn jm_addMapping_1 [this p_inputToGameKeyMapping]
  (let [ l_inputToGameKeyMapping (volatile! p_inputToGameKeyMapping)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_add_2 [this p_input p_mappedToInput]
  (let [ l_input (volatile! p_input) l_mappedToInput (volatile! p_mappedToInput) l_list (volatile! nil)]
        (vreset! l_list (JR/invoke this :jm_getMappedInput_1 @l_input))
        (if (not (JR/invoke @l_list :jm_contains_1 @l_mappedToInput))
            (do
            (JR/invoke @l_list :jm_add_1 @l_mappedToInput)
            (JR/invoke (JR/fget this :mappedList) :jm_add_1 @l_mappedToInput)))))

    
(defn jm_isMapped_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/fget this :mappedList) :jm_contains_1 @l_input)))

    
(defn jm_getMappedInput_1 [this p_id]
  (let [ l_id (volatile! p_id) l_mappingInputCanBeNullList (volatile! nil) l_list (volatile! nil)](JR/method
        (vreset! l_mappingInputCanBeNullList (JR/invoke (JR/fget this :hashtable) :jm_get_1 @l_id))
        (if (nil? @l_mappingInputCanBeNullList)
            (do
            (vreset! l_list (BasicArrayListD/jnew_0))
            (JR/invoke (JR/fget this :hashtable) :jm_put_2 @l_id @l_list)
            (JR/jreturn @l_list)))
        @l_mappingInputCanBeNullList)))

    
(defn jm_getHashtable_0 [this]
  (let []
        (JR/fget this :hashtable)))



