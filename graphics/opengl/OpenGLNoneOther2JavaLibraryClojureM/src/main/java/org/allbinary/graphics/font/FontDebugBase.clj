;; Generated Code Do Not Modify
;; package org.allbinary.graphics.font

;;OpenGLNoneOther2JavaLibrary
(ns FontDebugBase)

(JR/register 'FontDebugBase nil '[])

(def jsv_instanceBase (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instanceBase [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceBase)
(defn jstatic_set_instanceBase [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceBase v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instanceBase (FontDebugBase/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SET_FONT nil)
    (JR/fset this :SET_FONT "setFont")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'FontDebugBase)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FontDebugBase/jstatic_instanceBase)))

    
(defn jm_debugMetrics_4 [this p_currentFont p_convertedTextSize p_displayMetrics p_stringBuffer]
  (let [ l_currentFont (volatile! p_currentFont) l_convertedTextSize (volatile! p_convertedTextSize) l_displayMetrics (volatile! p_displayMetrics) l_stringBuffer (volatile! p_stringBuffer)]
        nil))

    
(defn jm_debugDpi_2 [this p_densityDpi p_stringBuffer]
  (let [ l_densityDpi (volatile! p_densityDpi) l_stringBuffer (volatile! p_stringBuffer)]
        nil))

    
(defn jm_debugDimension_4 [this p_currentFont p_convertedTextSize p_longestDimensionTotalPixels p_stringBuffer]
  (let [ l_currentFont (volatile! p_currentFont) l_convertedTextSize (volatile! p_convertedTextSize) l_longestDimensionTotalPixels (volatile! p_longestDimensionTotalPixels) l_stringBuffer (volatile! p_stringBuffer)]
        nil))



