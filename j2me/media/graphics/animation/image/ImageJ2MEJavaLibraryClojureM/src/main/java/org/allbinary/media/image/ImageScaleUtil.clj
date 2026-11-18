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

(ns ImageScaleUtil)

(JR/register 'ImageScaleUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ImageScaleUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageScaleUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ImageScaleUtil)] (jinit_0 o) o))

    
(defn jm_createImage2_7 [this p_imageCache p_originalImage p_scaleNominatorX p_scaleDenominatorX p_scaleNominatorY p_scaleDenominatorY p_cached]
  (let [ l_imageCache (volatile! p_imageCache) l_originalImage (volatile! p_originalImage) l_scaleNominatorX (volatile! p_scaleNominatorX) l_scaleDenominatorX (volatile! p_scaleDenominatorX) l_scaleNominatorY (volatile! p_scaleNominatorY) l_scaleDenominatorY (volatile! p_scaleDenominatorY) l_cached (volatile! p_cached)]
        (JR/invoke this :jm_createImage3_8 @l_imageCache @l_originalImage @l_scaleNominatorX @l_scaleDenominatorX @l_scaleNominatorY @l_scaleDenominatorY @l_cached true)))

    
(defn jm_createImage3_8 [this p_imageCache p_originalImage p_scaleNominatorX p_scaleDenominatorX p_scaleNominatorY p_scaleDenominatorY p_cached p_mutable]
  (let [ l_imageCache (volatile! p_imageCache) l_originalImage (volatile! p_originalImage) l_scaleNominatorX (volatile! p_scaleNominatorX) l_scaleDenominatorX (volatile! p_scaleDenominatorX) l_scaleNominatorY (volatile! p_scaleNominatorY) l_scaleDenominatorY (volatile! p_scaleDenominatorY) l_cached (volatile! p_cached) l_mutable (volatile! p_mutable)]
        @l_originalImage))



