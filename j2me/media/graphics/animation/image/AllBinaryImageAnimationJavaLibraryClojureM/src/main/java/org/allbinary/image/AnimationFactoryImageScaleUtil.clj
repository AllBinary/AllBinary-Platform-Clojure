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
;; package org.allbinary.image

(ns AnimationFactoryImageScaleUtil)

(JR/register 'AnimationFactoryImageScaleUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AnimationFactoryImageScaleUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :imageScaleUtil nil)
    (JR/fset this :imageScaleUtil (JR/scall 'ImageJ2MEScaleUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AnimationFactoryImageScaleUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AnimationFactoryImageScaleUtil/jstatic_instance)))

    
(defn jm_createImage_5 [this p_image p_width p_height p_scaleWidth p_scaleHeight]
  (let [ l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_scaleWidth (volatile! p_scaleWidth) l_scaleHeight (volatile! p_scaleHeight) l_scaledImage (volatile! nil) l_scaleX (volatile! nil) l_scaleY (volatile! nil) l_scaledWidth (volatile! nil) l_scaledHeight (volatile! nil)]
        (vreset! l_scaledImage nil)
        (if (and (not (== @l_scaleWidth 0)) (not (== @l_scaleHeight 0)))
            (do
            (vreset! l_scaleX (/ (double (JR/f32 @l_scaleWidth)) (JR/f32 @l_width)))
            (vreset! l_scaleY (/ (double (JR/f32 @l_scaleHeight)) (JR/f32 @l_height)))
            (if (or (and (== @l_scaleX 1.0) (== @l_scaleY 1.0)) (or (== @l_scaleX 0.0) (== @l_scaleY 0.0)))
                (do
                (vreset! l_scaledImage @l_image))
                (do
                (vreset! l_scaledWidth (JR/d2i (* @l_scaleX (JR/f32 @l_width))))
                (vreset! l_scaledHeight (JR/d2i (* @l_scaleY (JR/f32 @l_height))))
                (vreset! l_scaledImage (JR/invoke (JR/fget this :imageScaleUtil) :jm_scale_3 @l_image @l_scaledWidth @l_scaledHeight)))))
            (do
            (vreset! l_scaledImage @l_image)))
        @l_scaledImage))

    
(defn jm_processAdjust_1 [this p_baseImageAnimationFactory]
  (let [ l_baseImageAnimationFactory (volatile! p_baseImageAnimationFactory) l_scaleProperties (volatile! nil) l_animationFactoryInitializationVisitor (volatile! nil) l_scaleX (volatile! nil) l_scaleY (volatile! nil)]
        (vreset! l_scaleProperties (JR/invoke @l_baseImageAnimationFactory :jm_getScalePropertiesP_0))
        (if (and (not (== (JR/fget @l_scaleProperties :scaleWidth) 0)) (not (== (JR/fget @l_scaleProperties :scaleHeight) 0)))
            (do
            (vreset! l_animationFactoryInitializationVisitor (JR/invoke @l_baseImageAnimationFactory :jm_getAnimationFactoryInitializationVisitorP_0))
            (vreset! l_scaleX (/ (double (JR/f32 (JR/fget @l_scaleProperties :scaleWidth))) (JR/f32 (JR/fget @l_animationFactoryInitializationVisitor :width))))
            (vreset! l_scaleY (/ (double (JR/f32 (JR/fget @l_scaleProperties :scaleHeight))) (JR/f32 (JR/fget @l_animationFactoryInitializationVisitor :height))))
            (if (or (and (== @l_scaleX 1.0) (== @l_scaleY 1.0)) (or (== @l_scaleX 0.0) (== @l_scaleY 0.0)))
                (do
                nil)
                (do
                (JR/fset @l_animationFactoryInitializationVisitor :dx (JR/d2i (* (JR/f32 (JR/fget @l_animationFactoryInitializationVisitor :originalDx)) @l_scaleX)))
                (JR/fset @l_animationFactoryInitializationVisitor :dy (JR/d2i (* (JR/f32 (JR/fget @l_animationFactoryInitializationVisitor :originalDy)) @l_scaleY))))))
            (do
            nil))))



