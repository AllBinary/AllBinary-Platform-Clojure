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

(ns TopUBoundBounceAIFactory)

(JR/register 'TopUBoundBounceAIFactory nil '[ArtificialIntelligenceInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TopUBoundBounceAIFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_velocityInterfaceCompositeInterface (volatile! nil) l_velocityInterface (volatile! nil) l_maxDistancePerTick (volatile! nil) l_halfWidth (volatile! nil) l_halfHeight (volatile! nil) l_point (volatile! nil) l_displayInfo (volatile! nil) l_rectangle (volatile! nil)]
        (vreset! l_velocityInterfaceCompositeInterface @l_ownerLayerInterface)
        (vreset! l_velocityInterface (JR/invoke @l_velocityInterfaceCompositeInterface :jm_getVelocityProperties_0))
        (vreset! l_maxDistancePerTick (JR/ishr (JR/invoke @l_velocityInterface :jm_getMaxForwardVelocity_0) (JR/invoke (JR/invoke @l_velocityInterface :jm_getVelocityXBasicDecimalP_0) :jm_getScaledFactor_0)))
        (vreset! l_halfWidth (unchecked-int (unchecked-add (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply (JR/invoke @l_ownerLayerInterface :jm_getWidth_0) 2)) @l_maxDistancePerTick)) 1)))
        (vreset! l_halfHeight (unchecked-int (unchecked-add (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply (JR/invoke @l_ownerLayerInterface :jm_getHeight_0) 2)) @l_maxDistancePerTick)) 1)))
        (vreset! l_point (JR/invoke (JR/scall 'PointFactory :jm_getInstance_0) :jm_createXY_2 @l_halfWidth (unchecked-int (unchecked-add @l_halfHeight 60))))
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_rectangle (Rectangle/jnew_3 @l_point (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastWidth_0) @l_halfWidth)) (JR/invoke @l_point :jm_getX_0))) (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHeight_0) @l_halfHeight)) (JR/invoke @l_point :jm_getY_0)))))
        (BoundBounceAI/jnew_4 @l_ownerLayerInterface @l_gameInput (TopULayerBounds/jnew_1 @l_rectangle) (ReverseVelocityBoundsVisitor/jnew_1 @l_ownerLayerInterface))))



