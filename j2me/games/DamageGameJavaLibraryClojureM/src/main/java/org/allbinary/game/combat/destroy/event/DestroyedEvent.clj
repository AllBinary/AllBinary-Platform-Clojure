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
;; package org.allbinary.game.combat.destroy.event

(ns DestroyedEvent)

(JR/register 'DestroyedEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :allBinaryGameCanvas nil)
  (JR/fset this :allBinaryLayerInterface nil)
    (JR/fset this :allBinaryGameCanvas (JR/scall 'NullGameCanvas :jm_getInstance_0))
    (JR/fset this :allBinaryLayerInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
  this)

    
(defn jinit_1 [this p_combatGameCanvas]
  (let [ l_combatGameCanvas (volatile! p_combatGameCanvas)]
        (AllBinaryEventObject/jinit_1 this (JR/scall 'DestroyedEventHandler :jm_getInstance_0)) (jinitfields this)
        (JR/invoke this :jm_setAllBinaryGameCanvas_1 @l_combatGameCanvas))
  this)

(defn jnew_1 [p_combatGameCanvas ]
  (let [o (JR/alloc 'DestroyedEvent)] (jinit_1 o p_combatGameCanvas) o))

    
(defn jm_getAllBinaryGameCanvas_0 [this]
  (let []
        (JR/fget this :allBinaryGameCanvas)))

    
(defn jm_getLayerInterface_0 [this]
  (let []
        (JR/fget this :allBinaryLayerInterface)))

    
(defn jm_setAllBinaryGameCanvas_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/fset this :allBinaryGameCanvas @l_allBinaryGameCanvas)))

    
(defn jm_setLayerInterfaceForCircularStaticPool_1 [this p_allBinaryLayerInterface]
  (let [ l_allBinaryLayerInterface (volatile! p_allBinaryLayerInterface)]
        (JR/fset this :allBinaryLayerInterface @l_allBinaryLayerInterface)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "DestroyedEvent: \n")
        (JR/invoke @l_stringBuffer :jm_append_1 "AllBinaryLayerInterface: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :allBinaryLayerInterface)))
        (JR/invoke @l_stringBuffer :jm_append_1 "\nAllBinaryGameCanvas: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke this :jm_getAllBinaryGameCanvas_0)))
        (JR/to-string-of @l_stringBuffer)))



