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
;; package org.allbinary.animation.image.sprite

(ns ImageCaptionIndexedAnimationFactory)

(JR/register 'ImageCaptionIndexedAnimationFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationFactoryImageScaleUtil nil)
  (JR/fset this :animationFactorySpriteScaleUtil nil)
  (JR/fset this :captionImage nil)
  (JR/fset this :spriteMovieImage nil)
  (JR/fset this :frameWidth 0)
  (JR/fset this :frameHeight 0)
  (JR/fset this :captionDx 0)
  (JR/fset this :captionDy 0)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  (JR/fset this :time 0)
  (JR/fset this :soundInterface nil)
  (JR/fset this :scaleProperties nil)
  (JR/fset this :animationBehaviorFactory nil)
    (JR/fset this :animationFactoryImageScaleUtil (JR/scall 'AnimationFactoryImageScaleUtil :jm_getInstance_0))
    (JR/fset this :animationFactorySpriteScaleUtil (JR/scall 'AnimationFactorySpriteScaleUtil :jm_getInstance_0))
    (JR/fset this :scaleProperties (JR/sget 'ScaleProperties "instance"))
  this)

    
(defn jinit_11 [this p_captionImage p_spriteMovieImage p_soundInterface p_frameWidth p_frameHeight p_captionDx p_captionDy p_dx p_dy p_time p_animationBehaviorFactory]
  (let [ l_captionImage (volatile! p_captionImage) l_spriteMovieImage (volatile! p_spriteMovieImage) l_soundInterface (volatile! p_soundInterface) l_frameWidth (volatile! p_frameWidth) l_frameHeight (volatile! p_frameHeight) l_captionDx (volatile! p_captionDx) l_captionDy (volatile! p_captionDy) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_time (volatile! p_time) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
    nil (jinitfields this)
        (if (JR/eq @l_animationBehaviorFactory (JR/scall 'AnimationBehaviorFactory :jm_getInstance_0))
            (do
            (JR/scall 'ForcedLogUtil :jm_log_2 "Using default AnimationBehaviorFactory with IndexedAnimationFactory" this)))
        (JR/fset this :captionImage @l_captionImage)
        (JR/fset this :spriteMovieImage @l_spriteMovieImage)
        (JR/fset this :frameWidth @l_frameWidth)
        (JR/fset this :frameHeight @l_frameHeight)
        (JR/fset this :captionDx @l_captionDx)
        (JR/fset this :captionDy @l_captionDy)
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy)
        (JR/fset this :time @l_time)
        (JR/fset this :soundInterface @l_soundInterface)
        (JR/fset this :animationBehaviorFactory @l_animationBehaviorFactory))
  this)

(defn jnew_11 [p_captionImage p_spriteMovieImage p_soundInterface p_frameWidth p_frameHeight p_captionDx p_captionDy p_dx p_dy p_time p_animationBehaviorFactory ]
  (let [o (JR/alloc 'ImageCaptionIndexedAnimationFactory)] (jinit_11 o p_captionImage p_spriteMovieImage p_soundInterface p_frameWidth p_frameHeight p_captionDx p_captionDy p_dx p_dy p_time p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_scaledImage (volatile! nil) l_animationInterface (volatile! nil) l_sprite (volatile! nil) l_movieIndexedAnimationInterface (volatile! nil) l_player (volatile! nil)]
        (vreset! l_scaledImage (JR/invoke (JR/fget this :animationFactoryImageScaleUtil) :jm_createImage_5 (JR/fget this :captionImage) (JR/invoke (JR/fget this :captionImage) :jm_getWidth_0) (JR/invoke (JR/fget this :captionImage) :jm_getHeight_0) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (vreset! l_animationInterface (ImageAnimation/jnew_2 @l_scaledImage (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
        (vreset! l_sprite (JR/invoke (JR/fget this :animationFactorySpriteScaleUtil) :jm_createImage_5 (JR/fget this :spriteMovieImage) (JR/fget this :frameWidth) (JR/fget this :frameHeight) (JR/fget (JR/fget this :scaleProperties) :scaleWidth) (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (vreset! l_movieIndexedAnimationInterface (SpriteIndexedAnimation/jnew_4 @l_sprite (JR/fget this :spriteMovieImage) (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ZERO_ARRAY) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0)))
        (vreset! l_player (JR/invoke (JR/fget this :soundInterface) :jm_getPlayerP_0))
        (if (nil? @l_player)
            (do
            (JR/jthrow (new java.lang.Exception "Sound Was not Initialized"))))
        (CaptionIndexedAnimation/jnew_9 @l_animationInterface @l_movieIndexedAnimationInterface @l_player (JR/fget this :captionDx) (JR/fget this :captionDy) (JR/fget this :dx) (JR/fget this :dy) (JR/fget this :time) (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        (JR/fset this :scaleProperties @l_scaleProperties)))



