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

(ns GameFeatureFormUtil)

(JR/register 'GameFeatureFormUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameFeatureFormUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :meUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :meUtil (JR/scall 'MIDPUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameFeatureFormUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameFeatureFormUtil/jstatic_instance)))

    
(defn jm_getChoiceGroup_3 [this p_hashtable p_name p_option]
  (let [ l_hashtable (volatile! p_hashtable) l_name (volatile! p_name) l_option (volatile! p_option) l_stringMaker (volatile! nil) l_choiceGroup (volatile! nil) l_list (volatile! nil) l_features (volatile! nil) l_ADD_CHOICE (volatile! nil) l_GET_CHOICE_GROUP (volatile! nil) l_size (volatile! nil) l_gameFeature (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_choiceGroup (ChoiceGroup/jnew_4 @l_name @l_option (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0) (JR/sget 'NullImage "NULL_IMAGE_ARRAY")))
        (vreset! l_list (JR/invoke @l_hashtable :jm_get_1 @l_name))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_ADD_CHOICE ": Adding Choice: ")
        (vreset! l_GET_CHOICE_GROUP "getChoiceGroup")
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_gameFeature (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_name) :jm_append_1 @l_ADD_CHOICE) :jm_append_1 (JR/to-string-of @l_gameFeature))) this @l_GET_CHOICE_GROUP)
            (JR/invoke @l_choiceGroup :jm_append_2 (JR/to-string-of @l_gameFeature) (JR/sget 'NullImage "NULL_IMAGE"))
            (if (JR/invoke @l_features :jm_isFeature_1 @l_gameFeature)
                (do
                (JR/invoke @l_choiceGroup :jm_setSelectedIndex_2 @l_index true)))))
        @l_choiceGroup))

    
(defn jm_addChoiceGroup_3 [this p_form p_hashtable p_option]
  (let [ l_form (volatile! p_form) l_hashtable (volatile! p_hashtable) l_option (volatile! p_option) l_stringMaker (volatile! nil) l_ADDING_CHOICE_GROUP (volatile! nil) l_ADD_CHOICE_GROUP (volatile! nil) l_size (volatile! nil) l_objectArray (volatile! nil) l_name (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_ADDING_CHOICE_GROUP "Adding Choice Group: ")
        (vreset! l_ADD_CHOICE_GROUP "addChoiceGroup")
        (vreset! l_size (JR/invoke @l_hashtable :jm_size_0))
        (vreset! l_objectArray (JR/invoke (JR/scall 'HashtableUtil :jm_getInstance_0) :jm_getKeysAsArray_1 @l_hashtable))
        (vreset! l_name nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_name (JR/aget* @l_objectArray @l_index))
            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_ADDING_CHOICE_GROUP) :jm_append_1 @l_name)) this @l_ADD_CHOICE_GROUP)
            (JR/invoke (JR/fget this :meUtil) :jm_appendItem_2 @l_form (JR/invoke this :jm_getChoiceGroup_3 @l_hashtable @l_name @l_option))))))

    
(defn jm_setDefault_1 [this p_form]
  (let [ l_form (volatile! p_form) l_size (volatile! nil) l_item (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke @l_form :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_item (JR/invoke @l_form :jm_get_1 @l_index))
            (if (JR/instance-of @l_item 'GameConfigurationGauge)
                (do
                (JR/invoke (JR/scall 'GameConfigurationUtil :jm_getInstance_0) :jm_setDefault_1 @l_item))
                (if (JR/instance-of @l_item 'ChoiceGroup)
                (do
                (JR/invoke (JR/scall 'GameFeatureUtil :jm_getInstance_0) :jm_setDefault_1 @l_item))))))))



