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
;; package org.allbinary.animation.vector

(ns CircleAnimation)

(JR/register 'CircleAnimation 'Animation '[ColorCompositeInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :TOTAL_ANGLE 0)
  (JR/fset this :width 0)
  (JR/fset this :height 0)
    (JR/fset this :TOTAL_ANGLE (JR/i32 (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE)))
  this)

    
(defn jinit_3 [this p_width p_height p_basicColor]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_basicColor (volatile! p_basicColor)]
    (Animation/jinit_0 this) (jinitfields this)
        (JR/fset this :width @l_width)
        (JR/fset this :height @l_height)
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor))
  this)

(defn jnew_3 [p_width p_height p_basicColor ]
  (let [o (JR/alloc 'CircleAnimation)] (jinit_3 o p_width p_height p_basicColor) o))

    
(defn jm_nextFrame_0 [this]
  (let []
        nil))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/invoke this :jm_getBasicColorP_0) (JR/invoke this :jm_getColor_0))
        (JR/invoke @l_graphics :jm_drawArc_6 @l_x @l_y (JR/fget this :width) (JR/fget this :height) 0 (JR/fget this :TOTAL_ANGLE))))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/invoke-super 'Animation this :jm_getBasicColorP_0)))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/invoke-super 'Animation this :jm_setBasicColorP_1 @l_basicColor)))



