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
;; package org.allbinary.game.input.event

(ns GameKeyEvent)

(JR/register 'GameKeyEvent 'AllBinaryEventObject '[])

(def jsv_NONE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NONE [] (JR/ensure-init jclinit-state jclinit) @jsv_NONE)
(defn jstatic_set_NONE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NONE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NONE (GameKeyEvent/jnew_6 (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT) (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1))) false))
    nil))

(defn jinitfields [this]
  (JR/fset this :sourceId 0)
  (JR/fset this :repeated false)
  (JR/fset this :key 0)
  (JR/fset this :gameActionKey 0)
  (JR/fset this :originalKey 0)
  this)

    
(defn jm_createEvent_3 [p_anyType p_sourceId p_key]
  (let [this nil l_anyType (volatile! p_anyType) l_sourceId (volatile! p_sourceId) l_key (volatile! p_key)]
        (GameKeyEvent/jnew_6 @l_anyType @l_sourceId 0 0 @l_key false)))

    
(defn jinit_6 [this p_anyType p_sourceId p_originalKey p_gameActionKey p_key p_repeated]
  (let [ l_anyType (volatile! p_anyType) l_sourceId (volatile! p_sourceId) l_originalKey (volatile! p_originalKey) l_gameActionKey (volatile! p_gameActionKey) l_key (volatile! p_key) l_repeated (volatile! p_repeated)]
        (AllBinaryEventObject/jinit_1 this @l_anyType) (jinitfields this)
        (JR/fset this :sourceId @l_sourceId)
        (JR/invoke this :jm_setOriginalKey_1 @l_originalKey)
        (JR/fset this :key @l_key)
        (JR/invoke this :jm_setGameActionKey_1 @l_gameActionKey)
        (JR/invoke this :jm_setRepeatEvents_1 @l_repeated))
  this)

(defn jnew_6 [p_anyType p_sourceId p_originalKey p_gameActionKey p_key p_repeated ]
  (let [o (JR/alloc 'GameKeyEvent)] (jinit_6 o p_anyType p_sourceId p_originalKey p_gameActionKey p_key p_repeated) o))

    
(defn jm_init_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke this :jm_setSource_1 @l_anyType)))

    
(defn jm_setRepeatEvents_1 [this p_repeated]
  (let [ l_repeated (volatile! p_repeated)]
        (JR/fset this :repeated @l_repeated)))

    
(defn jm_hasRepeatEvents_0 [this]
  (let []
        (JR/fget this :repeated)))

    
(defn jm_getKey_0 [this]
  (let []
        (JR/fget this :key)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "\nKey: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getKey_0))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getOriginalKey_0 [this]
  (let []
        (JR/fget this :originalKey)))

    
(defn jm_setOriginalKey_1 [this p_originalKey]
  (let [ l_originalKey (volatile! p_originalKey)]
        (JR/fset this :originalKey @l_originalKey)))

    
(defn jm_getGameActionKey_0 [this]
  (let []
        (JR/fget this :gameActionKey)))

    
(defn jm_setGameActionKey_1 [this p_gameActionKey]
  (let [ l_gameActionKey (volatile! p_gameActionKey)]
        (JR/fset this :gameActionKey @l_gameActionKey)))

    
(defn jm_getSourceId_0 [this]
  (let []
        (JR/fget this :sourceId)))



