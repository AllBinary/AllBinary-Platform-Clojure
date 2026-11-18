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

(ns AdjustedCircleAnimation)

(JR/register 'AdjustedCircleAnimation 'CircleAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :xAdjustment 0)
  (JR/fset this :yAdjustment 0)
  this)

    
(defn jm_createAnimation_5 [p_width p_height p_xAdjustment p_yAdjustment p_basicColor]
  (let [this nil l_width (volatile! p_width) l_height (volatile! p_height) l_xAdjustment (volatile! p_xAdjustment) l_yAdjustment (volatile! p_yAdjustment) l_basicColor (volatile! p_basicColor) l_adjustedCircleAnimation (volatile! nil)]
        (vreset! l_adjustedCircleAnimation (AdjustedCircleAnimation/jnew_3 @l_width @l_height @l_basicColor))
        (JR/invoke @l_adjustedCircleAnimation :jm_initXY_2 @l_xAdjustment @l_yAdjustment)
        @l_adjustedCircleAnimation))

    
(defn jm_createW_4 [p_width p_height p_innerWidth p_basicColor]
  (let [this nil l_width (volatile! p_width) l_height (volatile! p_height) l_innerWidth (volatile! p_innerWidth) l_basicColor (volatile! p_basicColor) l_adjustedCircleAnimation (volatile! nil)]
        (vreset! l_adjustedCircleAnimation (AdjustedCircleAnimation/jnew_3 @l_width @l_height @l_basicColor))
        (JR/invoke @l_adjustedCircleAnimation :jm_init_1 @l_innerWidth)
        @l_adjustedCircleAnimation))

    
(defn jinit_3 [this p_width p_height p_basicColor]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_basicColor (volatile! p_basicColor)]
        (CircleAnimation/jinit_3 this @l_width @l_height @l_basicColor) (jinitfields this))
  this)

(defn jnew_3 [p_width p_height p_basicColor ]
  (let [o (JR/alloc 'AdjustedCircleAnimation)] (jinit_3 o p_width p_height p_basicColor) o))

    
(defn jm_initXY_2 [this p_xAdjustment p_yAdjustment]
  (let [ l_xAdjustment (volatile! p_xAdjustment) l_yAdjustment (volatile! p_yAdjustment)]
        (JR/fset this :xAdjustment @l_xAdjustment)
        (JR/fset this :yAdjustment @l_yAdjustment)))

    
(defn jm_init_1 [this p_innerWidth]
  (let [ l_innerWidth (volatile! p_innerWidth) l_widthPortion (volatile! nil)]
        (if (JR/scall 'AndroidUtil :jm_isAndroid_0)
            (do
            (vreset! l_widthPortion (JR/idiv (unchecked-int (unchecked-multiply (JR/idiv @l_innerWidth 3) 10)) 7))
            (JR/fset this :xAdjustment (- (- (JR/ishr (JR/fget this :width) 1) @l_widthPortion)))
            (JR/fset this :yAdjustment (JR/fget this :xAdjustment)))
            (do
            (JR/fset this :xAdjustment (- (- (JR/ishr (JR/fget this :width) 1) @l_innerWidth)))
            (JR/fset this :yAdjustment (JR/fget this :xAdjustment))))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/invoke this :jm_getBasicColorP_0) (JR/invoke this :jm_getColor_0))
        (JR/invoke @l_graphics :jm_drawArc_6 (unchecked-int (unchecked-add @l_x (JR/fget this :xAdjustment))) (unchecked-int (unchecked-add @l_y (JR/fget this :yAdjustment))) (JR/fget this :width) (JR/fget this :height) 0 (JR/fget this :TOTAL_ANGLE))))



