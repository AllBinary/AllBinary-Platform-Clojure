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
;; package org.allbinary.game.configuration.feature

(ns GameFeatureUtil)

(JR/register 'GameFeatureUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameFeatureUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :tsUtil nil)
  (JR/fset this :enumerationUtil nil)
  (JR/fset this :ON_GAME_FEATURE_CHANGE nil)
  (JR/fset this :GAME_FEATURE_CHANGED nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :enumerationUtil (JR/scall 'EnumerationUtil :jm_getInstance_0))
    (JR/fset this :ON_GAME_FEATURE_CHANGE "onGameFeatureChange")
    (JR/fset this :GAME_FEATURE_CHANGED "Game Feature Changed: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameFeatureUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameFeatureUtil/jstatic_instance)))

    
(defn jm_setDefault_1 [this p_choiceGroup]
  (let [ l_choiceGroup (volatile! p_choiceGroup) l_stringBuffer (volatile! nil) l_METHOD_NAME (volatile! nil) l_SELECTED_ARRAY_RETURN (volatile! nil) l_SELECTED_SEP (volatile! nil) l_selectedArray_return (volatile! nil) l_total (volatile! nil) l_features (volatile! nil) l_isSelected (volatile! nil) l_selectedChoiceLabel (volatile! nil) l_gameFeature (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_METHOD_NAME "setDefault")
        (vreset! l_SELECTED_ARRAY_RETURN "selectedArray_return[")
        (vreset! l_SELECTED_SEP "] = ")
        (vreset! l_selectedArray_return (JR/anew "BOOLEAN" 1 (JR/invoke @l_choiceGroup :jm_size_0)))
        (vreset! l_total (JR/invoke @l_choiceGroup :jm_getSelectedFlags_1 @l_selectedArray_return))
        (JR/invoke @l_stringBuffer :jm_append_1 "Multiple Total Choices: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_total)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this @l_METHOD_NAME)
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_selectedArray_return)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_isSelected (JR/aget* @l_selectedArray_return @l_index))
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_SELECTED_ARRAY_RETURN)
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
            (JR/invoke @l_stringBuffer :jm_append_1 @l_SELECTED_SEP)
            (JR/invoke @l_stringBuffer :jm_appendboolean_1 @l_isSelected)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this @l_METHOD_NAME)
            (vreset! l_selectedChoiceLabel (JR/invoke @l_choiceGroup :jm_getString_1 @l_index))
            (vreset! l_gameFeature (JR/scall 'Feature :jm_getInstance_1 @l_selectedChoiceLabel))
            (if (JR/invoke @l_features :jm_isDefault_1 @l_gameFeature)
                (do
                (JR/invoke @l_features :jm_add_1 @l_gameFeature)
                (JR/invoke @l_choiceGroup :jm_setSelectedIndex_2 @l_index true))
                (do
                (JR/invoke @l_features :jm_remove_1 @l_gameFeature)
                (JR/invoke @l_choiceGroup :jm_setSelectedIndex_2 @l_index false)))))))

    
(defn jm_updateMultiple_1 [this p_choiceGroup]
  (let [ l_choiceGroup (volatile! p_choiceGroup) l_stringBuffer (volatile! nil) l_METHOD_NAME (volatile! nil) l_SELECTED_ARRAY_RETURN (volatile! nil) l_SELECTED_SEP (volatile! nil) l_selectedArray_return (volatile! nil) l_total (volatile! nil) l_features (volatile! nil) l_isSelected (volatile! nil) l_selectedChoiceLabel (volatile! nil) l_gameFeature (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_METHOD_NAME "updateMultiple")
        (vreset! l_SELECTED_ARRAY_RETURN "selectedArray_return[")
        (vreset! l_SELECTED_SEP "] = ")
        (vreset! l_selectedArray_return (JR/anew "BOOLEAN" 1 (JR/invoke @l_choiceGroup :jm_size_0)))
        (vreset! l_total (JR/invoke @l_choiceGroup :jm_getSelectedFlags_1 @l_selectedArray_return))
        (JR/invoke @l_stringBuffer :jm_append_1 "Multiple Total Choices: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_total)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this @l_METHOD_NAME)
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_selectedArray_return)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_isSelected (JR/aget* @l_selectedArray_return @l_index))
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_SELECTED_ARRAY_RETURN)
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
            (JR/invoke @l_stringBuffer :jm_append_1 @l_SELECTED_SEP)
            (JR/invoke @l_stringBuffer :jm_appendboolean_1 @l_isSelected)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this @l_METHOD_NAME)
            (vreset! l_selectedChoiceLabel (JR/invoke @l_choiceGroup :jm_getString_1 @l_index))
            (vreset! l_gameFeature (JR/scall 'Feature :jm_getInstance_1 @l_selectedChoiceLabel))
            (if (and (not @l_isSelected) (JR/invoke @l_features :jm_isFeature_1 @l_gameFeature))
                (do
                (JR/invoke @l_features :jm_remove_1 @l_gameFeature))
                (if (and @l_isSelected (not (JR/invoke @l_features :jm_isFeature_1 @l_gameFeature)))
                (do
                (JR/invoke @l_features :jm_add_1 @l_gameFeature))))))))

    
(defn jm_updateExclusiveForChoiceGroup_1 [this p_choiceGroup]
  (let [ l_choiceGroup (volatile! p_choiceGroup) l_stringBuffer (volatile! nil) l_METHOD_NAME (volatile! nil) l_SELECTED_ARRAY_RETURN (volatile! nil) l_SELECTED_SEP (volatile! nil) l_selectedArray_return (volatile! nil) l_total (volatile! nil) l_isSelected (volatile! nil) l_selectedChoiceLabel (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_METHOD_NAME "updateExclusive")
        (vreset! l_SELECTED_ARRAY_RETURN "selectedArray_return[")
        (vreset! l_SELECTED_SEP "] = ")
        (vreset! l_selectedArray_return (JR/anew "BOOLEAN" 1 (JR/invoke @l_choiceGroup :jm_size_0)))
        (vreset! l_total (JR/invoke @l_choiceGroup :jm_getSelectedFlags_1 @l_selectedArray_return))
        (JR/invoke @l_stringBuffer :jm_append_1 "Exclusive Total Choices: 1==")
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_total)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this @l_METHOD_NAME)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_selectedArray_return)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_isSelected (JR/aget* @l_selectedArray_return @l_index))
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_SELECTED_ARRAY_RETURN)
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
            (JR/invoke @l_stringBuffer :jm_append_1 @l_SELECTED_SEP)
            (JR/invoke @l_stringBuffer :jm_appendboolean_1 @l_isSelected)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this @l_METHOD_NAME)
            (if @l_isSelected
                (do
                (vreset! l_selectedChoiceLabel (JR/invoke @l_choiceGroup :jm_getString_1 @l_index))
                (JR/invoke this :jm_updateExclusive_1 @l_selectedChoiceLabel)))))))

    
(defn jm_isExclusive_1 [this p_itemLabel]
  (let [ l_itemLabel (volatile! p_itemLabel) l_enumeration (volatile! nil) l_name (volatile! nil)](JR/method
        (vreset! l_enumeration (JR/invoke (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_get_0) :jm_keys_0))
        (vreset! l_name nil)
        (JR/jwhile false false (JR/invoke (JR/fget this :enumerationUtil) :jm_hasMoreElements_1 @l_enumeration)
            (vreset! l_name (JR/invoke (JR/fget this :enumerationUtil) :jm_nextElement_1 @l_enumeration))
            (if (== (JR/invoke (JR/fget this :tsUtil) :jm_compareTo_2 @l_itemLabel @l_name) 0)
                (do
                (JR/jreturn true))))
        false)))

    
(defn jm_updateExclusive_1 [this p_selectedChoiceLabel]
  (let [ l_selectedChoiceLabel (volatile! p_selectedChoiceLabel) l_gameFeature (volatile! nil) l_hashtable (volatile! nil) l_objectArray (volatile! nil) l_basicArrayList (volatile! nil) l_anyType (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :ITEM_LABEL)) :jm_append_1 @l_selectedChoiceLabel)) this "updateExclusive")
        (vreset! l_gameFeature (JR/scall 'Feature :jm_getInstance_1 @l_selectedChoiceLabel))
        (vreset! l_hashtable (JR/invoke (JR/scall 'GameFeatureChoiceGroups :jm_getExclusiveInstance_0) :jm_get_0))
        (vreset! l_objectArray (JR/invoke (JR/scall 'HashtableUtil :jm_getInstance_0) :jm_getKeysAsArray_1 @l_hashtable))
        (vreset! l_basicArrayList nil)
        (vreset! l_anyType nil)
        (vreset! l_size (JR/alen @l_objectArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_anyType (JR/aget* @l_objectArray @l_index))
            (vreset! l_basicArrayList (JR/invoke @l_hashtable :jm_get_1 @l_anyType))
            (JR/invoke this :jm_updateExclusiveList_2 @l_gameFeature @l_basicArrayList)))))

    
(defn jm_updateExclusiveList_2 [this p_gameFeature p_list]
  (let [ l_gameFeature (volatile! p_gameFeature) l_list (volatile! p_list) l_features (volatile! nil) l_addIndex (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (if (JR/invoke @l_list :jm_contains_1 @l_gameFeature)
            (do
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (vreset! l_addIndex (JR/invoke @l_list :jm_indexOf_1 @l_gameFeature))
            (vreset! l_size (JR/invoke @l_list :jm_size_0))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (if (not (== @l_addIndex @l_index))
                    (do
                    (JR/invoke @l_features :jm_remove_1 (JR/aget* (JR/fget @l_list :objectArray) @l_index)))
                    (do
                    (JR/invoke @l_features :jm_add_1 (JR/aget* (JR/fget @l_list :objectArray) @l_index))))))))))



