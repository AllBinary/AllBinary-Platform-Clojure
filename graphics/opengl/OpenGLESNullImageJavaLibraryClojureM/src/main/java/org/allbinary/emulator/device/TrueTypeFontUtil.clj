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
;; package org.allbinary.emulator.device

(ns TrueTypeFontUtil)

(JR/register 'TrueTypeFontUtil 'TrueTypeFontUtilBase '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TrueTypeFontUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :fontImage nil)
    (JR/fset this :fontImage (JR/sget 'OpenGLESImage "NULL_OPENGL_IMAGE"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TrueTypeFontUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
        (TrueTypeFontUtilBase/jinit_1 this 1) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TrueTypeFontUtil)] (jinit_0 o) o))

    
(defn jm_getAsTextureSize_1 [this p_textureSize]
  (let [ l_textureSize (volatile! p_textureSize)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getCellSize_1 [this p_cellSize]
  (let [ l_cellSize (volatile! p_cellSize)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getFontBitmap_4 [this p_filename p_fontSize p_cellSize p_basicColor]
  (let [ l_filename (volatile! p_filename) l_fontSize (volatile! p_fontSize) l_cellSize (volatile! p_cellSize) l_basicColor (volatile! p_basicColor)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_saveFontAtlasAsFile_0 [this]
  (let []
        nil))

    
(defn jm_getFontBitmapGL_4 [this p_gl p_filename p_cellSize p_basicColor]
  (let [ l_gl (volatile! p_gl) l_filename (volatile! p_filename) l_cellSize (volatile! p_cellSize) l_basicColor (volatile! p_basicColor)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getFontWidths_2 [this p_filename p_fontSize]
  (let [ l_filename (volatile! p_filename) l_fontSize (volatile! p_fontSize)]
        (JR/jthrow (new java.lang.RuntimeException))))



