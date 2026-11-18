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
;; package org.allbinary.animation.image

(ns ImageArraySpecialAnimation)

(JR/register 'ImageArraySpecialAnimation 'ImageArrayAnimation '[SpecialAnimationInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :loopCount 0)
  (JR/fset this :loopCountTotal 0)
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 270))
    (JR/fset this :loopCount 0)
    (JR/fset this :loopCountTotal 1)
  this)

    
(defn jinit_2 [this p_imageArray p_animationBehavior]
  (let [ l_imageArray (volatile! p_imageArray) l_animationBehavior (volatile! p_animationBehavior)]
        (ImageArrayAnimation/jinit_2 this @l_imageArray @l_animationBehavior) (jinitfields this)
        (JR/invoke this :jm_reset_0))
  this)

(defn jnew_2 [p_imageArray p_animationBehavior ]
  (let [o (JR/alloc 'ImageArraySpecialAnimation)] (jinit_2 o p_imageArray p_animationBehavior) o))

    
(defn jm_getLoopCount_0 [this]
  (let []
        (JR/fget this :loopCount)))

    
(defn jm_setLastFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_setIndex_1 (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :circularIndexUtil) :jm_getSize_0) 1)))))

    
(defn jm_reset_0 [this]
  (let []
        (JR/invoke this :jm_setFrame_1 (unchecked-int (unchecked-subtract (JR/invoke this :jm_getSize_0) 1)))
        (JR/fset this :loopCount 0)))

    
(defn jm_nextFrame_0 [this]
  (let []
        (if (> (JR/invoke this :jm_getFrame_0) 0)
            (do
            (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTime_1 (JR/fget (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0) :startTime))
                (do
                (JR/invoke this :jm_previousFrame_0)
                (if (== (JR/invoke this :jm_getFrame_0) 0)
                    (do
                    (JR/finc this :loopCount 1 :int false)))))))))

    
(defn jm_isComplete_0 [this]
  (let []
        (if (or (< (JR/fget this :loopCount) (JR/fget this :loopCountTotal)) (not (== (JR/invoke this :jm_getFrame_0) 0)))
            (do
            false)
            (do
            true))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (vreset! l_x (unchecked-int (unchecked-subtract (JR/invoke (JR/scall 'DisplayInfoSingleton :jm_getInstance_0) :jm_getLastHalfWidth_0) (JR/ishr (JR/invoke (JR/invoke this :jm_getImage_1 (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)) :jm_getWidth_0) 1))))
        (vreset! l_y 5)
        (JR/invoke-super 'ImageArrayAnimation this :jm_paintXY_3 @l_graphics @l_x @l_y)))



