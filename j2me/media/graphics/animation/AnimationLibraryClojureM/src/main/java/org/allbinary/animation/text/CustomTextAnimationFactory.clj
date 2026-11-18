;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.animation.text

(ns CustomTextAnimationFactory)

(JR/register 'CustomTextAnimationFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :animationBehaviorFactory nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :text nil)
  (JR/fset this :initScaleHeight 0)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  (JR/fset this :font nil)
  (JR/fset this :scaleProperties nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK))
    (JR/fset this :dx 0)
    (JR/fset this :dy 0)
  this)

    
(defn jm_createDXY_5 [p_text p_fontSize p_dx p_dy p_animationBehaviorFactory]
  (let [this nil l_text (volatile! p_text) l_fontSize (volatile! p_fontSize) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory) l_customTextAnimationFactory (volatile! nil)]
        (vreset! l_customTextAnimationFactory (CustomTextAnimationFactory/jnew_3 @l_text @l_fontSize @l_animationBehaviorFactory))
        (JR/fset @l_customTextAnimationFactory :dx @l_dx)
        (JR/fset @l_customTextAnimationFactory :dy @l_dy)
        @l_customTextAnimationFactory))

    
(defn jinit_3 [this p_text p_fontSize p_animationBehaviorFactory]
  (let [ l_text (volatile! p_text) l_fontSize (volatile! p_fontSize) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
    nil (jinitfields this)
        (JR/fset this :scaleProperties (ScaleProperties/jnew_0))
        (JR/fset this :text @l_text)
        (JR/fset (JR/fget this :scaleProperties) :scaleHeight (unchecked-int (unchecked-subtract @l_fontSize (JR/idiv @l_fontSize 4))))
        (JR/fset this :initScaleHeight (JR/fget (JR/fget this :scaleProperties) :scaleHeight))
        (JR/fset this :animationBehaviorFactory @l_animationBehaviorFactory)
        (JR/fset this :font (JR/scall 'Font :jm_getFont_3 (JR/sget 'Font "FACE_SYSTEM") (JR/sget 'Font "STYLE_PLAIN") (JR/fget this :initScaleHeight))))
  this)

(defn jnew_3 [p_text p_fontSize p_animationBehaviorFactory ]
  (let [o (JR/alloc 'CustomTextAnimationFactory)] (jinit_3 o p_text p_fontSize p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_customTextAnimation (volatile! nil)]
        (vreset! l_customTextAnimation nil)
        (if (or (not (== (JR/fget this :dx) 0)) (not (== (JR/fget this :dy) 0)))
            (do
            (vreset! l_customTextAnimation (AdjustCustomTextAnimation/jnew_5 (JR/fget this :text) (JR/fget (JR/fget this :scaleProperties) :scaleHeight) (JR/fget this :dx) (JR/fget this :dy) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))
            (do
            (vreset! l_customTextAnimation (CustomTextAnimation/jnew_3 (JR/fget this :text) (JR/fget (JR/fget this :scaleProperties) :scaleHeight) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))))
        (JR/invoke @l_customTextAnimation :jm_setBasicColorP_1 (JR/fget this :basicColor))
        @l_customTextAnimation))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/invoke (JR/fget this :font) :jm_stringWidth_1 (JR/fget this :text))))

    
(defn jm_getHeight_0 [this]
  (let []
        (JR/invoke (JR/fget this :font) :jm_getHeight_0)))



