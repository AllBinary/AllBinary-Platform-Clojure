;;
;; AllBinary Open License Version 1
;; Copyright (c) 2023 AllBinary
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

(ns ImageJ2MEScaleUtil)

(JR/register 'ImageJ2MEScaleUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ImageJ2MEScaleUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageJ2MEScaleUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ImageJ2MEScaleUtil)] (jinit_0 o) o))

    
(defn jm_scaleArray_3 [this p_images p_width p_height]
  (let [ l_images (volatile! p_images) l_width (volatile! p_width) l_height (volatile! p_height) l_scaledImages (volatile! nil) l_index (volatile! nil)]
        (vreset! l_scaledImages (JR/anew "Object" 1 (JR/alen @l_images)))
        (do (vreset! l_index (JR/alen @l_images))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/aset* @l_scaledImages @l_index (JR/invoke this :jm_scale_3 (JR/aget* @l_images @l_index) @l_width @l_height))))
        @l_scaledImages))

    
(defn jm_scale_3 [this p_image p_width p_height]
  (let [ l_image (volatile! p_image) l_width (volatile! p_width) l_height (volatile! p_height) l_sourceWidth (volatile! nil) l_sourceHeight (volatile! nil) l_originalData (volatile! nil) l_scaledData (volatile! nil) l_heightRatioFactor (volatile! nil) l_widthRatioFactor (volatile! nil) l_scaledIndex (volatile! nil) l_dx (volatile! nil) l_dy (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil) l_scaledImage (volatile! nil)]
        (vreset! l_sourceWidth (JR/invoke @l_image :jm_getWidth_0))
        (vreset! l_sourceHeight (JR/invoke @l_image :jm_getHeight_0))
        (vreset! l_originalData (JR/anew "INT" 1 (* (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0))))
        (JR/invoke @l_image :jm_getRGB_7 @l_originalData 0 (JR/invoke @l_image :jm_getWidth_0) 0 0 (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0))
        (vreset! l_scaledData (JR/anew "INT" 1 (unchecked-int (unchecked-multiply @l_width @l_height))))
        (vreset! l_heightRatioFactor (JR/idiv (unchecked-int (unchecked-multiply 8 @l_sourceHeight)) @l_height))
        (vreset! l_widthRatioFactor (JR/idiv (unchecked-int (unchecked-multiply 8 @l_sourceWidth)) @l_width))
        (vreset! l_scaledIndex (unchecked-int (unchecked-subtract (JR/alen @l_scaledData) 1)))
        (vreset! l_dx 0)
        (vreset! l_dy 0)
        (do (vreset! l_index @l_height)
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_dy (JR/ishr (unchecked-int (unchecked-multiply @l_index @l_heightRatioFactor)) 3))
            (do (vreset! l_index2 @l_width)
                (JR/jfor false false (>= (JR/vinc l_index2 -1 :int false) 0) (do )
                (vreset! l_dx (JR/ishr (unchecked-int (unchecked-multiply @l_index2 @l_widthRatioFactor)) 3))
                (JR/aset* @l_scaledData (JR/vinc l_scaledIndex -1 :int true) (JR/aget* @l_originalData (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply @l_sourceWidth @l_dy)) @l_dx))))))))
        (vreset! l_scaledImage (JR/scall 'Image :jm_createRGBImage_4 @l_scaledData @l_width @l_height true))
        @l_scaledImage))



