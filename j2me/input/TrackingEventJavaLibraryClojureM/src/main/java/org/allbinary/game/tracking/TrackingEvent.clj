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
;; package org.allbinary.game.tracking

(ns TrackingEvent)

(JR/register 'TrackingEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :layerInterface nil)
    (JR/fset this :layerInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
  this)

    
(defn jinit_1 [this p_allBinaryLayerInterface]
  (let [ l_allBinaryLayerInterface (volatile! p_allBinaryLayerInterface)]
        (AllBinaryEventObject/jinit_1 this @l_allBinaryLayerInterface) (jinitfields this)
        (if (not (JR/eq @l_allBinaryLayerInterface (JR/scall 'TrackingEventHandler :jm_getInstance_0)))
            (do
            (JR/invoke this :jm_setLayerInterface_1 @l_allBinaryLayerInterface))))
  this)

(defn jnew_1 [p_allBinaryLayerInterface ]
  (let [o (JR/alloc 'TrackingEvent)] (jinit_1 o p_allBinaryLayerInterface) o))

    
(defn jm_init_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke this :jm_setSource_1 @l_anyType)))

    
(defn jm_getLayerInterface_0 [this]
  (let []
        (JR/fget this :layerInterface)))

    
(defn jm_setLayerInterface_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/fset this :layerInterface @l_layerInterface)))

    
(defn jm_setLayerInterfaceForCircularStaticPool_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/fset this :layerInterface @l_layerInterface)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "TrackingEvent: \n")
        (JR/invoke @l_stringBuffer :jm_append_1 "LayerInterface: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :layerInterface)))
        (JR/to-string-of @l_stringBuffer)))



