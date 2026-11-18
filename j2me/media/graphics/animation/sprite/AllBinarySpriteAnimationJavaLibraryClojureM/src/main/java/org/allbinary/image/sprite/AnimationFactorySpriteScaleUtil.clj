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
;; package org.allbinary.image.sprite

(ns AnimationFactorySpriteScaleUtil)

(JR/register 'AnimationFactorySpriteScaleUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AnimationFactorySpriteScaleUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :imageCache nil)
  (JR/fset this :imageScaleUtil nil)
  (JR/fset this :openGLUtil nil)
  (JR/fset this :j2seMath nil)
  (JR/fset this :openGLESImageExclusionUtil nil)
    (JR/fset this :imageCache (JR/scall 'ImageCacheFactory :jm_getInstance_0))
    (JR/fset this :imageScaleUtil (JR/scall 'ImageScaleUtil :jm_getInstance_0))
    (JR/fset this :openGLUtil (JR/scall 'OpenGLUtil :jm_getInstance_0))
    (JR/fset this :j2seMath (JR/scall 'J2SEMath :jm_getInstance_0))
    (JR/fset this :openGLESImageExclusionUtil (JR/scall 'OpenGLESImageExclusionUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AnimationFactorySpriteScaleUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AnimationFactorySpriteScaleUtil/jstatic_instance)))

    
(defn jm_createImage_5 [this p_image p_width p_height p_scaleWidth p_scaleHeight]
  (let [ l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_scaleWidth (volatile! p_scaleWidth) l_scaleHeight (volatile! p_scaleHeight) l_spriteFactory (volatile! nil) l_sprite (volatile! nil) l_scaledImage (volatile! nil) l_scaleX (volatile! nil) l_scaleY (volatile! nil) l_width2 (volatile! nil) l_height2 (volatile! nil) l_multiplesOf16Width (volatile! nil) l_by16Width (volatile! nil) l_multiplesOf16Height (volatile! nil) l_by16Height (volatile! nil)]
        (vreset! l_spriteFactory (JR/scall 'SpriteFactory :jm_getInstance_0))
        (vreset! l_sprite nil)
        (vreset! l_scaledImage nil)
        (if (and (not (== @l_scaleWidth 0)) (not (== @l_scaleHeight 0)))
            (do
            (vreset! l_scaleX (/ (double (JR/f32 @l_scaleWidth)) (JR/f32 @l_width)))
            (vreset! l_scaleY (/ (double (JR/f32 @l_scaleHeight)) (JR/f32 @l_height)))
            (if (or (and (== @l_scaleX 1.0) (== @l_scaleY 1.0)) (or (== @l_scaleX 0.0) (== @l_scaleY 0.0)))
                (do
                (vreset! l_scaledImage (JR/invoke (JR/fget this :openGLUtil) :jm_addImage_1 @l_image))
                (vreset! l_sprite (JR/invoke @l_spriteFactory :jm_createSprite_3 @l_scaledImage @l_width @l_height)))
                (do
                (if (JR/invoke (JR/fget this :openGLESImageExclusionUtil) :jm_isCustomScaling_1 @l_image)
                    (do
                    (vreset! l_width2 (JR/invoke (JR/fget this :j2seMath) :jm_round_1 (- (JR/f32 @l_scaleWidth) 0.5)))
                    (vreset! l_height2 (JR/invoke (JR/fget this :j2seMath) :jm_round_1 (- (JR/f32 @l_scaleHeight) 0.5)))
                    (vreset! l_multiplesOf16Width (JR/idiv @l_width2 16))
                    (vreset! l_by16Width (unchecked-int (unchecked-multiply @l_multiplesOf16Width 16)))
                    (vreset! l_scaleX (/ (double (JR/f32 @l_by16Width)) (JR/f32 @l_width)))
                    (vreset! l_multiplesOf16Height (JR/idiv @l_height2 16))
                    (vreset! l_by16Height (unchecked-int (unchecked-multiply @l_multiplesOf16Height 16)))
                    (vreset! l_scaleY (/ (double (JR/f32 @l_by16Height)) (JR/f32 @l_height)))
                    (if (< @l_scaleWidth @l_width)
                        (do
                        (vreset! l_scaleX (* @l_scaleX 2.35))))
                    (if (< @l_scaleHeight @l_height)
                        (do
                        (vreset! l_scaleY (* @l_scaleY 2.35))))))
                (vreset! l_scaledImage (JR/invoke (JR/fget this :imageScaleUtil) :jm_createImage2_7 (JR/fget this :imageCache) @l_image @l_scaleX 1.0 @l_scaleY 1.0 true))
                (vreset! l_sprite (JR/invoke @l_spriteFactory :jm_createSprite_3 @l_scaledImage (JR/d2i (* (JR/f32 @l_width) @l_scaleX)) (JR/d2i (* (JR/f32 @l_height) @l_scaleY)))))))
            (do
            (vreset! l_scaledImage (JR/invoke (JR/fget this :openGLUtil) :jm_addImage_1 @l_image))
            (vreset! l_sprite (JR/invoke @l_spriteFactory :jm_createSprite_3 @l_scaledImage @l_width @l_height))))
        @l_sprite))



