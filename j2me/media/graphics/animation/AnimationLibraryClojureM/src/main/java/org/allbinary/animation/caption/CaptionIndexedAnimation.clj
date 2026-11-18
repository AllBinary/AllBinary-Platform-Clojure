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
;; package org.allbinary.animation.caption

(ns CaptionIndexedAnimation)

(JR/register 'CaptionIndexedAnimation 'IndexedAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  (JR/fset this :movieIndexedAnimationInterface nil)
  (JR/fset this :captionDx 0)
  (JR/fset this :captionDy 0)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  (JR/fset this :time 0)
  (JR/fset this :END_EVENT nil)
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :player nil)
  this)

    
(defn jinit_9 [this p_animationInterface p_movieIndexedAnimationInterface p_player p_captionDx p_captionDy p_dx p_dy p_time p_animationBehavior]
  (let [ l_animationInterface (volatile! p_animationInterface) l_movieIndexedAnimationInterface (volatile! p_movieIndexedAnimationInterface) l_player (volatile! p_player) l_captionDx (volatile! p_captionDx) l_captionDy (volatile! p_captionDy) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_time (volatile! p_time) l_animationBehavior (volatile! p_animationBehavior) l_timePerFrame (volatile! nil)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :movieIndexedAnimationInterface @l_movieIndexedAnimationInterface)
        (JR/fset this :captionDx @l_captionDx)
        (JR/fset this :captionDy @l_captionDy)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy)
        (JR/fset this :time @l_time)
        (JR/fset this :END_EVENT (AllBinaryEventObject/jnew_1 this))
        (vreset! l_timePerFrame (JR/idiv (JR/fget this :time) (JR/invoke this :jm_getSize_0)))
        (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 @l_timePerFrame))
        (JR/fset this :player @l_player)
        (JR/invoke (JR/fget this :player) :jm_start_0))
  this)

(defn jnew_9 [p_animationInterface p_movieIndexedAnimationInterface p_player p_captionDx p_captionDy p_dx p_dy p_time p_animationBehavior ]
  (let [o (JR/alloc 'CaptionIndexedAnimation)] (jinit_9 o p_animationInterface p_movieIndexedAnimationInterface p_player p_captionDx p_captionDy p_dx p_dy p_time p_animationBehavior) o))

    
(defn jm_nextFrame_0 [this]
  (let []
        (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTime_1 (JR/fget (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0) :startTime))
            (do
            (JR/invoke (JR/fget this :movieIndexedAnimationInterface) :jm_nextFrame_0)))
        (if (JR/invoke this :jm_isLastFrame_0)
            (do
            (JR/invoke (JR/scall 'AnimationEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :END_EVENT))))))

    
(defn jm_isLastFrame_0 [this]
  (let []
        (if (JR/eq (JR/invoke (JR/fget this :movieIndexedAnimationInterface) :jm_getFrame_0) (unchecked-int (unchecked-subtract (JR/invoke this :jm_getSize_0) 1)))
            (do
            true)
            (do
            false))))

    
(defn jm_previousFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :movieIndexedAnimationInterface) :jm_previousFrame_0)))

    
(defn jm_setFrame_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/invoke (JR/fget this :movieIndexedAnimationInterface) :jm_setFrame_1 @l_index)))

    
(defn jm_getFrame_0 [this]
  (let []
        (JR/invoke (JR/fget this :movieIndexedAnimationInterface) :jm_getFrame_0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/fget this :movieIndexedAnimationInterface) :jm_getSize_0)))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :captionDx))) (unchecked-int (unchecked-add @l_y (JR/fget this :captionDy))))
        (JR/invoke (JR/fget this :movieIndexedAnimationInterface) :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_x (JR/fget this :captionDx))) (JR/fget this :dx))) (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_y (JR/fget this :captionDy))) (JR/fget this :dy))))))

    
(defn jm_paintThreedXYZ_4 [this p_graphics p_x p_y p_z]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintThreedXYZ_4 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :captionDx))) (unchecked-int (unchecked-add @l_y (JR/fget this :captionDy))) @l_z)
        (JR/invoke (JR/fget this :movieIndexedAnimationInterface) :jm_paintThreedXYZ_4 @l_graphics (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_x (JR/fget this :captionDx))) (JR/fget this :dx))) (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_y (JR/fget this :captionDy))) (JR/fget this :dy))) @l_z)))



