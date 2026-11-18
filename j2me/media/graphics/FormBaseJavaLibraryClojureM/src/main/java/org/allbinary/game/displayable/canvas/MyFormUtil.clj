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
;; package org.allbinary.game.displayable.canvas

(ns MyFormUtil)

(JR/register 'MyFormUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MyFormUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :popupMenuRectangle nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :popupMenuRectangle (JR/sget 'RectangleFactory "SINGLETON"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MyFormUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MyFormUtil/jstatic_instance)))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_displayInfo (volatile! nil) l_features (volatile! nil) l_isOpenGL (volatile! nil) l_TOTAL_CHAR_WIDTH (volatile! nil) l_width (volatile! nil) l_pointFactory (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_isOpenGL (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL)))
        (vreset! l_TOTAL_CHAR_WIDTH (if (and (JR/invoke (JR/scall 'SWTJOGLProcessor :jm_getInstance_0) :jm_isJOGL_0) @l_isOpenGL) 2 3))
        (vreset! l_width (JR/scall 'MyFontProcessor :jm_defaultStringWidth_2 @l_font @l_TOTAL_CHAR_WIDTH))
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (if (< (JR/invoke @l_displayInfo :jm_getLastHeight_0) 320)
            (do
            (JR/fset this :popupMenuRectangle (Rectangle/jnew_3 (JR/invoke @l_pointFactory :jm_createXY_2 0 25) @l_width (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply (JR/invoke @l_font :jm_getHeight_0) 4)) 2)))))
            (do
            (JR/fset this :popupMenuRectangle (Rectangle/jnew_3 (JR/invoke @l_pointFactory :jm_createXY_2 0 (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHalfHeight_0) 70))) @l_width (unchecked-int (unchecked-multiply (JR/invoke @l_font :jm_getHeight_0) 5))))))))

    
(defn jm_getPopupMenuRectangle_0 [this]
  (let []
        (JR/fget this :popupMenuRectangle)))



