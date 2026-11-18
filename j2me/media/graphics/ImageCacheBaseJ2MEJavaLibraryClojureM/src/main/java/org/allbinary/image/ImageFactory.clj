;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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

;;ImageCacheBaseJavaLibrary - J2ME
(ns ImageFactory)

(JR/register 'ImageFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ImageFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ImageFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageFactory/jstatic_instance)))

    
(defn jm_createImageUrl_1 [this p_url]
  (let [ l_url (volatile! p_url)]
        (JR/scall 'Image :jm_createImage_1 @l_url)))

    
(defn jm_createImage_3 [this p_caller p_width p_height]
  (let [ l_caller (volatile! p_caller) l_width (volatile! p_width) l_height (volatile! p_height)]
        (JR/invoke (JR/scall 'MIDPUtil :jm_getInstance_0) :jm_createImageWH_2 @l_width @l_height)))

    
(defn jm_createImageFromInputStream_2 [this p_key p_inputStream]
  (let [ l_key (volatile! p_key) l_inputStream (volatile! p_inputStream) l_image (volatile! nil)]
        (vreset! l_image (JR/invoke (JR/scall 'MIDPUtil :jm_getInstance_0) :jm_createImageFromInputStream_1 @l_inputStream))
        @l_image))

    
(defn jm_createImageFromInputStream_1 [this p_inputStream]
  (let [ l_inputStream (volatile! p_inputStream)]
        (JR/invoke (JR/scall 'MIDPUtil :jm_getInstance_0) :jm_createImageFromInputStream_1 @l_inputStream)))



