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

;;GameInputNoPersistanceLibrary
(ns PersistentInputMapping)

(JR/register 'PersistentInputMapping nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :enumerationUtil nil)
  (JR/fset this :inputMapping nil)
  (JR/fset this :inputMappingEventListenerInterface nil)
  (JR/fset this :inputPersistance nil)
  (JR/fset this :inputMappingEvent nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :enumerationUtil (JR/scall 'EnumerationUtil :jm_getInstance_0))
    (JR/fset this :inputMapping (InputToGameKeyMapping/jnew_0))
    (JR/fset this :inputMappingEventListenerInterface (JR/sget 'NullInputMappingEventListener "NULL_INPUT_MAPPING_EVENT_LISTENER"))
    (JR/fset this :inputMappingEvent (InputMappingEvent/jnew_1 this))
  this)

    
(defn jm_getNullInstance_0 []
  (let [this nil]
        (if (JR/eq (PersistentInputMapping/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (PersistentInputMapping/jstatic_set_instance (PersistentInputMapping/jnew_1 (JR/fget (JR/scall 'GamePersistanceStrings :jm_getInstance_0) :SAVED_INPUT_CONFIGURATION_RECORD_ID)))))
        (PersistentInputMapping/jstatic_instance)))

    
(defn jinit_1 [this p_name]
  (let [ l_name (volatile! p_name)]
    nil (jinitfields this)
        (JR/fset this :inputPersistance (InputPersistance/jnew_1 @l_name)))
  this)

(defn jnew_1 [p_name ]
  (let [o (JR/alloc 'PersistentInputMapping)] (jinit_1 o p_name) o))

    
(defn jm_getTotalMapped_0 [this]
  (let []
        (JR/invoke (JR/invoke (JR/invoke this :jm_getInputMapping_0) :jm_getHashtable_0) :jm_size_0)))

    
(defn jm_isDefaultNew_0 [this]
  (let []
        false))

    
(defn jm_getDefault_0 [this]
  (let []
        (JR/scall 'InputToGameKeyMapping :jm_getNullInstance_0)))

    
(defn jm_setDefault_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke (JR/invoke this :jm_getInputMapping_0) :jm_removeAll_0)
        (JR/invoke (JR/invoke this :jm_getInputMapping_0) :jm_addMapping_1 (JR/invoke this :jm_getDefault_0))
        (JR/invoke this :jm_save_1 @l_abeClientInformation)))

    
(defn jm_update_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke (JR/fget this :inputPersistance) :jm_deleteAll_1 @l_abeClientInformation)
        (JR/invoke this :jm_save_1 @l_abeClientInformation)))

    
(defn jm_save_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke (JR/fget this :inputPersistance) :jm_save_2 @l_abeClientInformation (JR/invoke (JR/invoke this :jm_getInputMapping_0) :jm_getHashtable_0))
        (JR/invoke (JR/fget this :inputMappingEvent) :jm_setInputToGameKeyMapping_1 (JR/invoke this :jm_getInputMapping_0))
        (if (some? (JR/invoke this :jm_getInputMappingEventListenerInterface_0))
            (do
            (JR/invoke (JR/invoke this :jm_getInputMappingEventListenerInterface_0) :jm_onInputMappingEvent_1 (JR/fget this :inputMappingEvent))))))

    
(defn jm_init_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_e (volatile! nil) l_list (volatile! nil) l_totalMappedTo (volatile! nil) l_size (volatile! nil) l_hashtable (volatile! nil) l_enumeration (volatile! nil) l_mappedToInput (volatile! nil) l_gameActionInput (volatile! nil) l_index (volatile! nil) l_stringBuffer (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :INIT))
        (try (do
            (JR/invoke (JR/fget this :inputPersistance) :jm_loadAll_1 @l_abeClientInformation))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :INIT) @l_e)
            (JR/invoke (JR/fget this :inputPersistance) :jm_deleteRecoreStore_1 @l_abeClientInformation)
            (JR/invoke this :jm_setDefault_1 @l_abeClientInformation)
            (JR/invoke (JR/fget this :inputPersistance) :jm_loadAll_1 @l_abeClientInformation)) :else (throw jt)))))
        (vreset! l_list (JR/invoke (JR/fget this :inputPersistance) :jm_getList_0))
        (vreset! l_totalMappedTo 0)
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_hashtable nil)
        (vreset! l_enumeration nil)
        (vreset! l_mappedToInput nil)
        (vreset! l_gameActionInput nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_hashtable (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (vreset! l_enumeration (JR/invoke @l_hashtable :jm_keys_0))
            (JR/jwhile false false (JR/invoke (JR/fget this :enumerationUtil) :jm_hasMoreElements_1 @l_enumeration)
                (vreset! l_mappedToInput (JR/invoke (JR/fget this :enumerationUtil) :jm_nextElement_1 @l_enumeration))
                (vreset! l_gameActionInput (JR/invoke @l_hashtable :jm_get_1 @l_mappedToInput))
                (JR/vinc l_totalMappedTo 1 :int false)
                (JR/invoke (JR/invoke this :jm_getInputMapping_0) :jm_add_2 @l_gameActionInput @l_mappedToInput))))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "End - Total Loaded Keys Mapped: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getTotalMapped_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " to: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_totalMappedTo)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget (JR/fget this :commonStrings) :INIT))))

    
(defn jm_setInputMappingEventListenerInterface_1 [this p_inputMappingEventListenerInterface]
  (let [ l_inputMappingEventListenerInterface (volatile! p_inputMappingEventListenerInterface)]
        (JR/fset this :inputMappingEventListenerInterface @l_inputMappingEventListenerInterface)))

    
(defn jm_getInputMappingEventListenerInterface_0 [this]
  (let []
        (JR/fget this :inputMappingEventListenerInterface)))

    
(defn jm_getInputMapping_0 [this]
  (let []
        (JR/fget this :inputMapping)))

    
(defn jm_isDelete_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_isSystemInput_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))



