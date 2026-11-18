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

(ns ReverseVelocityBoundsVisitor)

(JR/register 'ReverseVelocityBoundsVisitor nil '[BoundsVisitorInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :velocityInterface nil)
  (JR/fset this :layerInterface nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_velocityInterfaceCompositeInterface (volatile! nil)]
    nil (jinitfields this)
        (JR/fset this :layerInterface @l_layerInterface)
        (vreset! l_velocityInterfaceCompositeInterface @l_layerInterface)
        (JR/fset this :velocityInterface (JR/invoke @l_velocityInterfaceCompositeInterface :jm_getVelocityProperties_0)))
  this)

(defn jnew_1 [p_layerInterface ]
  (let [o (JR/alloc 'ReverseVelocityBoundsVisitor)] (jinit_1 o p_layerInterface) o))

    
(defn jm_getX_0 [this]
  (let []
        (JR/invoke (JR/fget this :layerInterface) :jm_getXP_0)))

    
(defn jm_getY_0 [this]
  (let []
        (JR/invoke (JR/fget this :layerInterface) :jm_getYP_0)))

    
(defn jm_minX_0 [this]
  (let []
        (if (< (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityXBasicDecimalP_0) :jm_getUnscaled_0) 0)
            (do
            (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityXBasicDecimalP_0) :jm_multiplyint_1 (unchecked-int (unchecked-negate (JR/c2i 1))))))))

    
(defn jm_maxX_0 [this]
  (let []
        (if (> (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityXBasicDecimalP_0) :jm_getUnscaled_0) 0)
            (do
            (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityXBasicDecimalP_0) :jm_multiplyint_1 (unchecked-int (unchecked-negate (JR/c2i 1))))))))

    
(defn jm_minY_0 [this]
  (let []
        (if (< (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityYBasicDecimalP_0) :jm_getUnscaled_0) 0)
            (do
            (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityYBasicDecimalP_0) :jm_multiplyint_1 (unchecked-int (unchecked-negate (JR/c2i 1))))))))

    
(defn jm_maxY_0 [this]
  (let []
        (if (> (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityYBasicDecimalP_0) :jm_getUnscaled_0) 0)
            (do
            (JR/invoke (JR/invoke (JR/fget this :velocityInterface) :jm_getVelocityYBasicDecimalP_0) :jm_multiplyint_1 (unchecked-int (unchecked-negate (JR/c2i 1))))))))



