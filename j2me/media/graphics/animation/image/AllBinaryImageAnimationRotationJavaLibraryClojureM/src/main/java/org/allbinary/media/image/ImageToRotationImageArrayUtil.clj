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

(ns ImageToRotationImageArrayUtil)

(JR/register 'ImageToRotationImageArrayUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ImageToRotationImageArrayUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageToRotationImageArrayUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ImageToRotationImageArrayUtil)] (jinit_0 o) o))

    
(defn jm_generate_3 [this p_image p_angleIncrement p_totalAngle]
  (let [ l_image (volatile! p_image) l_angleIncrement (volatile! p_angleIncrement) l_totalAngle (volatile! p_totalAngle) l_imageRotationUtil (volatile! nil) l_totalFrames (volatile! nil) l_imageArray (volatile! nil) l_index (volatile! nil)]
        (vreset! l_imageRotationUtil (JR/scall 'ImageRotationUtil :jm_getInstance_0))
        (vreset! l_totalFrames (JR/idiv @l_totalAngle @l_angleIncrement))
        (vreset! l_imageArray (JR/anew "Object" 1 @l_totalFrames))
        (JR/aset* @l_imageArray 0 @l_image)
        (do (vreset! l_index 1)
            (JR/jfor false false (< @l_index @l_totalFrames) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_imageArray @l_index (JR/invoke @l_imageRotationUtil :jm_createRotatedImage_2 @l_image (unchecked-int (unchecked-multiply @l_index @l_angleIncrement))))))
        @l_imageArray))



