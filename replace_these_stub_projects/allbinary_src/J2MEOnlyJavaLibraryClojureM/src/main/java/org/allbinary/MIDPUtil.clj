;;
;; AllBinary Open License Version 1
;; Copyright (c) 2026 AllBinary
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
;; package org.allbinary

;;like microemu-playn, so the languages without overloading can be generated. J2ME uses the MIDP overloads.
(ns MIDPUtil)

(JR/register 'MIDPUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MIDPUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MIDPUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MIDPUtil/jstatic_instance)))

    
(defn jm_createImageWH_2 [this p_width p_height]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height)]
        (JR/scall 'Image :jm_createImage_2 @l_width @l_height)))

    
(defn jm_createImageFromByteArray_3 [this p_imageData p_imageOffset p_imageLength]
  (let [ l_imageData (volatile! p_imageData) l_imageOffset (volatile! p_imageOffset) l_imageLength (volatile! p_imageLength)]
        (JR/scall 'Image :jm_createImage_3 @l_imageData @l_imageOffset @l_imageLength)))

    
(defn jm_createImageFromInputStream_1 [this p_inputStream]
  (let [ l_inputStream (volatile! p_inputStream)]
        (JR/scall 'Image :jm_createImage_1 @l_inputStream)))

    
(defn jm_createPlayerFromInputStream_2 [this p_inputStream p_type]
  (let [ l_inputStream (volatile! p_inputStream) l_type (volatile! p_type)]
        (JR/scall 'Manager :jm_createPlayer_2 @l_inputStream @l_type)))

    
(defn jm_appendItem_2 [this p_form p_item]
  (let [ l_form (volatile! p_form) l_item (volatile! p_item)]
        (JR/invoke @l_form :jm_append_1 @l_item)))



