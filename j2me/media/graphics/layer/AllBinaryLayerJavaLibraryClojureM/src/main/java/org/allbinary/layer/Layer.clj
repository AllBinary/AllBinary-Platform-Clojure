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
;; package org.allbinary.layer

(ns Layer)

(JR/register 'Layer nil '[])

(def jsv_ID (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_ID [] (JR/ensure-init jclinit-state jclinit) @jsv_ID)
(defn jstatic_set_ID [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ID v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_ID (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :x 0)
  (JR/fset this :y 0)
  (JR/fset this :z 0)
  (JR/fset this :width 0)
  (JR/fset this :height 0)
  (JR/fset this :visible false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :z 3)
    (JR/fset this :visible true)
  this)

    
(defn jinit_2 [this p_width p_height]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height)]
    nil (jinitfields this)
        (JR/invoke this :jm_setLayerWidth_1 @l_width)
        (JR/invoke this :jm_setLayerHeight_1 @l_height))
  this)

(defn jnew_2 [p_width p_height ]
  (let [o (JR/alloc 'Layer)] (jinit_2 o p_width p_height) o))

    
(defn jm_setPosition_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/fset this :x @l_x)
        (JR/fset this :y @l_y)
        (JR/fset this :z @l_z)))

    
(defn jm_moveDXY_2 [this p_dx p_dy]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/fset this :x (unchecked-int (unchecked-add (JR/fget this :x) @l_dx)))
        (JR/fset this :y (unchecked-int (unchecked-add (JR/fget this :y) @l_dy)))))

    
(defn jm_moveDXYZ_3 [this p_dx p_dy p_dz]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_dz (volatile! p_dz)]
        (JR/fset this :x (unchecked-int (unchecked-add (JR/fget this :x) @l_dx)))
        (JR/fset this :y (unchecked-int (unchecked-add (JR/fget this :y) @l_dy)))
        (JR/fset this :z (unchecked-int (unchecked-add (JR/fget this :z) @l_dz)))))

    
(defn jm_getXP_0 [this]
  (let []
        (JR/fget this :x)))

    
(defn jm_getYP_0 [this]
  (let []
        (JR/fget this :y)))

    
(defn jm_getZP_0 [this]
  (let []
        (JR/fget this :z)))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/fget this :width)))

    
(defn jm_getHeight_0 [this]
  (let []
        (JR/fget this :height)))

    
(defn jm_getDepth_0 [this]
  (let []
        0))

    
(defn jm_setVisible_1 [this p_visible]
  (let [ l_visible (volatile! p_visible)]
        (JR/fset this :visible @l_visible)))

    
(defn jm_isVisible_0 [this]
  (let []
        (JR/fget this :visible)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_commonStrings (volatile! nil) l_canvasStrings (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (vreset! l_canvasStrings (JR/scall 'CanvasStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget @l_commonStrings :NOT_IMPLEMENTED) this (JR/fget @l_canvasStrings :PAINT))))

    
(defn jm_setLayerWidth_1 [this p_width]
  (let [ l_width (volatile! p_width)]
        (if (< @l_width 0)
            (do
            (JR/jthrow (new java.lang.IllegalArgumentException))))
        (JR/fset this :width @l_width)))

    
(defn jm_setLayerHeight_1 [this p_height]
  (let [ l_height (volatile! p_height)]
        (if (< @l_height 0)
            (do
            (JR/jthrow (new java.lang.IllegalArgumentException))))
        (JR/fset this :height @l_height)))

    
(defn jm_toStringAppend_1 [this p_stringBuffer]
  (let [ l_stringBuffer (volatile! p_stringBuffer)]
        nil))



