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
;; package org.allbinary.media.image

(ns ImageCopyUtil)

(JR/register 'ImageCopyUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ImageCopyUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :imageCreationUtil nil)
  (JR/fset this :anchor 0)
  (JR/fset this :gameFeatureFactory nil)
  (JR/fset this :features nil)
  (JR/fset this :NO_COPY nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :imageCreationUtil (JR/scall 'ImageCreationUtil :jm_getInstance_0))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
    (JR/fset this :gameFeatureFactory (JR/scall 'GameFeatureFactory :jm_getInstance_0))
    (JR/fset this :features (JR/scall 'Features :jm_getInstance_0))
    (JR/fset this :NO_COPY "J2ME does not need to copy images after initial loading")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageCopyUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ImageCopyUtil)] (jinit_0 o) o))

    
(defn jm_createImageForRotation_1 [this p_originalImage]
  (let [ l_originalImage (volatile! p_originalImage)]
        (JR/invoke this :jm_createImage_1 @l_originalImage)))

    
(defn jm_createImage_1 [this p_originalImage]
  (let [ l_originalImage (volatile! p_originalImage) l_image (volatile! nil)](JR/method
        (if (not (JR/invoke (JR/fget this :features) :jm_isFeature_1 (JR/fget (JR/fget this :gameFeatureFactory) :POST_IMAGE_LOADING_MODIFICATION)))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget this :NO_COPY) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR) (new java.lang.Exception))
            (JR/jreturn @l_originalImage)))
        (vreset! l_image (JR/invoke (JR/fget this :imageCreationUtil) :jm_createImageWH_2 (JR/invoke @l_originalImage :jm_getWidth_0) (JR/invoke @l_originalImage :jm_getHeight_0)))
        (if (JR/invoke @l_image :jm_isMutable_0)
            (do
            (JR/invoke (JR/invoke @l_image :jm_getGraphics_0) :jm_drawImage_4 @l_originalImage 0 0 (JR/fget this :anchor))
            @l_image)
            (do
            (JR/jthrow (new java.lang.Exception "Not Mutable")))))))

    
(defn jm_createImageScale_3 [this p_originalImage p_canvasScale p_resize]
  (let [ l_originalImage (volatile! p_originalImage) l_canvasScale (volatile! p_canvasScale) l_resize (volatile! p_resize) l_newWidth (volatile! nil) l_newHeight (volatile! nil) l_image (volatile! nil) l_halfWidthDelta (volatile! nil) l_halfHeightDelta (volatile! nil) l_graphics (volatile! nil)](JR/method
        (if (not (JR/invoke (JR/fget this :features) :jm_isFeature_1 (JR/fget (JR/fget this :gameFeatureFactory) :POST_IMAGE_LOADING_MODIFICATION)))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget this :NO_COPY) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR) (new java.lang.Exception))
            (JR/jreturn @l_originalImage)))
        (vreset! l_newWidth (JR/i32 (* (JR/invoke @l_originalImage :jm_getWidth_0) @l_canvasScale)))
        (vreset! l_newHeight (JR/i32 (* (JR/invoke @l_originalImage :jm_getHeight_0) @l_canvasScale)))
        (if @l_resize
            (do
            (if (< @l_newWidth @l_newHeight)
                (do
                (vreset! l_newWidth @l_newHeight)))
            (if (< @l_newHeight @l_newWidth)
                (do
                (vreset! l_newHeight @l_newWidth)))))
        (vreset! l_image (JR/invoke (JR/fget this :imageCreationUtil) :jm_createImageWH_2 @l_newWidth @l_newHeight))
        (if (JR/invoke @l_image :jm_isMutable_0)
            (do
            (vreset! l_halfWidthDelta (JR/div (- @l_newWidth (JR/invoke @l_originalImage :jm_getWidth_0)) 2))
            (vreset! l_halfHeightDelta (JR/div (- @l_newHeight (JR/invoke @l_originalImage :jm_getHeight_0)) 2))
            (vreset! l_graphics (JR/invoke @l_image :jm_getGraphics_0))
            (JR/invoke @l_graphics :jm_drawImage_4 @l_originalImage @l_halfWidthDelta @l_halfHeightDelta (JR/fget this :anchor))
            @l_image)
            (do
            (JR/jthrow (new java.lang.Exception "Not Mutable")))))))



