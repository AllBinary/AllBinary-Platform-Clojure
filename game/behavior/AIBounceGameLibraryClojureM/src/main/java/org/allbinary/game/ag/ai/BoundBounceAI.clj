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
;; package org.allbinary.game.ag.ai

(ns BoundBounceAI)

(JR/register 'BoundBounceAI 'BasicAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :currentRelativeAngle 0)
  (JR/fset this :layerBounds nil)
  (JR/fset this :boundsVisitorInterface nil)
    (JR/fset this :currentRelativeAngle 0)
  this)

    
(defn jinit_4 [this p_ownerLayerInterface p_gameInput p_layerBounds p_boundsVisitorInterface]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_layerBounds (volatile! p_layerBounds) l_boundsVisitorInterface (volatile! p_boundsVisitorInterface)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :layerBounds @l_layerBounds)
        (JR/fset this :boundsVisitorInterface @l_boundsVisitorInterface))
  this)

(defn jnew_4 [p_ownerLayerInterface p_gameInput p_layerBounds p_boundsVisitorInterface ]
  (let [o (JR/alloc 'BoundBounceAI)] (jinit_4 o p_ownerLayerInterface p_gameInput p_layerBounds p_boundsVisitorInterface) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_rectange (volatile! nil)]
        (vreset! l_rectange (JR/invoke (JR/fget this :layerBounds) :jm_getRectangleP_0))
        (JR/invoke @l_graphics :jm_drawRect_4 (JR/invoke (JR/invoke @l_rectange :jm_getPoint_0) :jm_getX_0) (JR/invoke (JR/invoke @l_rectange :jm_getPoint_0) :jm_getY_0) (JR/invoke @l_rectange :jm_getWidth_0) (JR/invoke @l_rectange :jm_getHeight_0))))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (JR/invoke (JR/fget this :layerBounds) :jm_visit_1 (JR/fget this :boundsVisitorInterface))))



