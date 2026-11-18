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
;; package org.allbinary.animation

(ns IndexedAnimation)

(JR/register 'IndexedAnimation 'Animation '[IndexedAnimationInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :animationBehaviorP nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_animationBehavior]
  (let [ l_animationBehavior (volatile! p_animationBehavior)]
    (Animation/jinit_0 this) (jinitfields this)
        (JR/fset this :animationBehaviorP @l_animationBehavior))
  this)

(defn jnew_1 [p_animationBehavior ]
  (let [o (JR/alloc 'IndexedAnimation)] (jinit_1 o p_animationBehavior) o))

    
(defn jm_getAnimationBehavior_0 [this]
  (let []
        (JR/fget this :animationBehaviorP)))

    
(defn jm_reset_0 [this]
  (let []
        (JR/invoke (JR/fget this :animationBehaviorP) :jm_reset_0)
        (JR/invoke this :jm_setFrame_1 0)))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        nil))

    
(defn jm_getFrame_0 [this]
  (let []
        0))

    
(defn jm_getAnimationSize_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_getSize_0 [this]
  (let []
        0))

    
(defn jm_previousFrame_0 [this]
  (let []
        nil))

    
(defn jm_isLastFrame_0 [this]
  (let []
        (if (== (JR/invoke this :jm_getFrame_0) (unchecked-int (unchecked-subtract (JR/invoke this :jm_getSize_0) 1)))
            (do
            true)
            (do
            false))))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_setState_1 [this p_indexedAnimation]
  (let [ l_indexedAnimation (volatile! p_indexedAnimation)]
        (JR/invoke this :jm_setFrame_1 (JR/invoke @l_indexedAnimation :jm_getFrame_0))
        (JR/invoke this :jm_setDx_1 (JR/invoke @l_indexedAnimation :jm_getDx_0))
        (JR/invoke this :jm_setDy_1 (JR/invoke @l_indexedAnimation :jm_getDy_0))))

    
(defn jm_getWidth_0 [this]
  (let []
        0))

    
(defn jm_getHeight_0 [this]
  (let []
        0))



