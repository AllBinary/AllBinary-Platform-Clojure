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
;; package org.allbinary.game.ai

(ns BasicAI)

(JR/register 'BasicAI 'ArtificialIntelligence '[GameKeyEventSourceInterface])

(def jsv_AI_VISITOR (atom nil))
(def jsv_ID (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_AI_VISITOR [] (JR/ensure-init jclinit-state jclinit) @jsv_AI_VISITOR)
(defn jstatic_set_AI_VISITOR [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_AI_VISITOR v))
(defn jstatic_ID [] (JR/ensure-init jclinit-state jclinit) @jsv_ID)
(defn jstatic_set_ID [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ID v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_AI_VISITOR (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 2))
    (reset! jsv_ID (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 1))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :gameKeyEventFactory nil)
  (JR/fset this :ownerLayerInterface nil)
  (JR/fset this :gameInput nil)
  (JR/fset this :lastKey 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :gameKeyEventFactory (JR/scall 'GameKeyEventFactory :jm_getInstance_0))
    (JR/fset this :lastKey (unchecked-int (unchecked-negate (JR/c2i 1))))
  this)

    
(defn jinit_2 [this p_ownerLayerInterface p_gameInput]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
    (ArtificialIntelligence/jinit_0 this) (jinitfields this)
        (JR/fset this :ownerLayerInterface @l_ownerLayerInterface)
        (JR/fset this :gameInput @l_gameInput))
  this)

(defn jnew_2 [p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'BasicAI)] (jinit_2 o p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_processKeyAI_1 [this p_key]
  (let [ l_key (volatile! p_key)]
        (if (not (== @l_key (unchecked-int (unchecked-negate (JR/c2i 1)))))
            (do
            (JR/invoke (JR/fget this :gameInput) :jm_add_1 (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForKey_2 this @l_key))))))

    
(defn jm_setLastKey_1 [this p_lastKey]
  (let [ l_lastKey (volatile! p_lastKey)]
        (JR/fset this :lastKey @l_lastKey)))

    
(defn jm_getLastKey_0 [this]
  (let []
        (JR/fget this :lastKey)))

    
(defn jm_getOwnerLayerInterface_0 [this]
  (let []
        (JR/fget this :ownerLayerInterface)))

    
(defn jm_getGameInput_0 [this]
  (let []
        (JR/fget this :gameInput)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/class-name this)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :NEW_LINE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " LastKey: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/scall 'CanvasUtil :jm_getKeyName_1 (JR/invoke this :jm_getLastKey_0)))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getSourceId_0 [this]
  (let []
        1))



