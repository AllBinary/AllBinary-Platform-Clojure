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
;; package org.allbinary.image.opengles

(ns OpenGLImageUtilBase)

(JR/register 'OpenGLImageUtilBase nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'OpenGLImageUtilBase)] (jinit_0 o) o))

    
(defn jm_paint_3 [this p_alphaBitmap p_originalBitmap p_index]
  (let [ l_alphaBitmap (volatile! p_alphaBitmap) l_originalBitmap (volatile! p_originalBitmap) l_index (volatile! p_index)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_paint_4 [this p_colorBitmap p_originalBitmap p_alpha p_basicColor]
  (let [ l_colorBitmap (volatile! p_colorBitmap) l_originalBitmap (volatile! p_originalBitmap) l_alpha (volatile! p_alpha) l_basicColor (volatile! p_basicColor)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_createImage_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_createImageFromInputStream_1 [this p_inputStream]
  (let [ l_inputStream (volatile! p_inputStream)]
        (JR/jthrow (new java.lang.RuntimeException))))



