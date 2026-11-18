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

(ns CaptionAnimation)

(JR/register 'CaptionAnimation 'Animation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  (JR/fset this :overlayAnimationInterface nil)
  (JR/fset this :captionDx 0)
  (JR/fset this :captionDy 0)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  this)

    
(defn jinit_6 [this p_animationInterface p_overlayAnimationInterface p_captionDx p_captionDy p_dx p_dy]
  (let [ l_animationInterface (volatile! p_animationInterface) l_overlayAnimationInterface (volatile! p_overlayAnimationInterface) l_captionDx (volatile! p_captionDx) l_captionDy (volatile! p_captionDy) l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
    (Animation/jinit_0 this) (jinitfields this)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :overlayAnimationInterface @l_overlayAnimationInterface)
        (JR/fset this :captionDx @l_captionDx)
        (JR/fset this :captionDy @l_captionDy)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy))
  this)

(defn jnew_6 [p_animationInterface p_overlayAnimationInterface p_captionDx p_captionDy p_dx p_dy ]
  (let [o (JR/alloc 'CaptionAnimation)] (jinit_6 o p_animationInterface p_overlayAnimationInterface p_captionDx p_captionDy p_dx p_dy) o))

    
(defn jm_nextFrame_0 [this]
  (let []
        nil))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :captionDx))) (unchecked-int (unchecked-add @l_y (JR/fget this :captionDy))))
        (JR/invoke (JR/fget this :overlayAnimationInterface) :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_x (JR/fget this :captionDx))) (JR/fget this :dx))) (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_y (JR/fget this :captionDy))) (JR/fget this :dy))))))

    
(defn jm_paintThreedXYZ_4 [this p_graphics p_x p_y p_z]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintThreedXYZ_4 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :captionDx))) (unchecked-int (unchecked-add @l_y (JR/fget this :captionDy))) @l_z)
        (JR/invoke (JR/fget this :overlayAnimationInterface) :jm_paintThreedXYZ_4 @l_graphics (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_x (JR/fget this :captionDx))) (JR/fget this :dx))) (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_y (JR/fget this :captionDy))) (JR/fget this :dy))) @l_z)))



