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

(ns CaptionAnimationHelper)

(JR/register 'CaptionAnimationHelper 'CaptionAnimationHelperBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :timeHelper nil)
  (JR/fset this :textAnimation nil)
  (JR/fset this :captionAnimation nil)
  (JR/fset this :animation nil)
    (JR/fset this :timeHelper (TimeDelayHelper/jnew_1 620))
    (JR/fset this :textAnimation (TextAnimation/jnew_2 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/scall 'AnimationBehavior :jm_getInstance_0)))
    (JR/fset this :animation (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0))
  this)

    
(defn jinit_5 [this p_captionAnimation p_captionDx p_captionDy p_dx p_dy]
  (let [ l_captionAnimation (volatile! p_captionAnimation) l_captionDx (volatile! p_captionDx) l_captionDy (volatile! p_captionDy) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
    (CaptionAnimationHelperBase/jinit_0 this) (jinitfields this)
        (JR/fset this :captionAnimation (CaptionAnimation/jnew_6 @l_captionAnimation (JR/fget this :textAnimation) @l_captionDx @l_captionDy @l_dx @l_dy)))
  this)

(defn jnew_5 [p_captionAnimation p_captionDx p_captionDy p_dx p_dy ]
  (let [o (JR/alloc 'CaptionAnimationHelper)] (jinit_5 o p_captionAnimation p_captionDx p_captionDy p_dx p_dy) o))

    
(defn jm_isShowing_0 [this]
  (let []
        (if (JR/eq (JR/fget this :animation) (JR/fget this :captionAnimation))
            (do
            true)
            (do
            false))))

    
(defn jm_tick_0 [this]
  (let []
        (if (JR/invoke (JR/fget this :timeHelper) :jm_isTime_1 (JR/fget (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0) :startTime))
            (do
            (JR/fset this :animation (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0))))))

    
(defn jm_update_2 [this p_message p_basicColor]
  (let [ l_message (volatile! p_message) l_basicColor (volatile! p_basicColor)]
        (JR/invoke (JR/fget this :textAnimation) :jm_setBasicColorP_1 @l_basicColor)
        (JR/invoke (JR/fget this :textAnimation) :jm_setText_1 @l_message)
        (JR/fset this :animation (JR/fget this :captionAnimation))
        (JR/invoke (JR/fget this :timeHelper) :jm_setStartTimeTNT_0)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :animation) :jm_paintXY_3 @l_graphics @l_x @l_y)))



