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
;; package org.allbinary.animation

(ns Animation)

(JR/register 'Animation nil '[AnimationInterface OpenGLSurfaceChangedInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :basicSetColorUtil nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :colorP 0)
  (JR/fset this :changeBasicColorP nil)
  (JR/fset this :changeColorP 0)
  (JR/fset this :alphaP 0)
    (JR/fset this :basicSetColorUtil (JR/scall 'BasicColorSetUtil :jm_getInstance_0))
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE))
    (JR/fset this :changeBasicColorP (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :NULL_COLOR))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'Animation)] (jinit_0 o) o))

    
(defn jm_setAlpha_1 [this p_alpha]
  (let [ l_alpha (volatile! p_alpha)]
        (JR/fset this :alphaP @l_alpha)))

    
(defn jm_nextFrame_0 [this]
  (let []
        nil))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/invoke this :jm_getBasicColorP_0) (JR/invoke this :jm_getColor_0))))

    
(defn jm_paintThreedXYZ_4 [this p_graphics p_x p_y p_z]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_isThreed_0 [this]
  (let []
        false))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)
        (JR/fset this :colorP (JR/invoke (JR/fget this :basicColor) :jm_intValue_0))))

    
(defn jm_setBackgroundBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        nil))

    
(defn jm_getChangeBasicColor_0 [this]
  (let []
        (JR/fget this :changeBasicColorP)))

    
(defn jm_changeBasicColor_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :changeBasicColorP @l_basicColor)
        (JR/fset this :changeColorP (JR/invoke (JR/fget this :changeBasicColorP) :jm_intValue_0))))

    
(defn jm_getChangeColor_0 [this]
  (let []
        (JR/fget this :changeColorP)))

    
(defn jm_getColor_0 [this]
  (let []
        (JR/fget this :colorP)))

    
(defn jm_setScale_2 [this p_scaleX p_scaleY]
  (let [ l_scaleX (volatile! p_scaleX) l_scaleY (volatile! p_scaleY)]
        nil))

    
(defn jm_setMaxScale_2 [this p_maxScaleX p_maxScaleY]
  (let [ l_maxScaleX (volatile! p_maxScaleX) l_maxScaleY (volatile! p_maxScaleY)]
        nil))

    
(defn jm_set_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        nil))

    
(defn jm_setDx_1 [this p_dx]
  (let [ l_dx (volatile! p_dx)]
        nil))

    
(defn jm_getDx_0 [this]
  (let []
        0))

    
(defn jm_setDy_1 [this p_dy]
  (let [ l_dy (volatile! p_dy)]
        nil))

    
(defn jm_getDy_0 [this]
  (let []
        0))



