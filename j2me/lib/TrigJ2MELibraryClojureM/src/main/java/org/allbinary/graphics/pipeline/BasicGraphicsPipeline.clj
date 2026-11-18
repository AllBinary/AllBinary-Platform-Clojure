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
;; package org.allbinary.graphics.pipeline

(ns BasicGraphicsPipeline)

(JR/register 'BasicGraphicsPipeline nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :pointBasicArrayList nil)
  (JR/fset this :noDecimalTrigTable nil)
    (JR/fset this :noDecimalTrigTable (JR/scall 'NoDecimalTrigTable :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_points]
  (let [ l_points (volatile! p_points)]
    nil (jinitfields this)
        (JR/fset this :pointBasicArrayList @l_points))
  this)

(defn jnew_1 [p_points ]
  (let [o (JR/alloc 'BasicGraphicsPipeline)] (jinit_1 o p_points) o))

    
(defn jm_setInitMatrix_1 [this p_points]
  (let [ l_points (volatile! p_points)]
        (JR/fset this :pointBasicArrayList @l_points)))

    
(defn jm_createMatrix_0 [this]
  (let []
        nil))

    
(defn jm_translate_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_newBasicArrayList (volatile! nil) l_size (volatile! nil) l_pointFactory (volatile! nil) l_secondPoint (volatile! nil) l_index (volatile! nil)]
        (vreset! l_newBasicArrayList (BasicArrayListD/jnew_0))
        (vreset! l_size (JR/invoke (JR/fget this :pointBasicArrayList) :jm_size_0))
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_secondPoint nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_secondPoint (JR/aget* (JR/fget (JR/fget this :pointBasicArrayList) :objectArray) @l_index))
            (if (not (== (JR/invoke @l_secondPoint :jm_getX_0) 1000))
                (do
                (JR/invoke @l_newBasicArrayList :jm_add_1 (JR/invoke @l_pointFactory :jm_createXY_2 (unchecked-int (unchecked-add (JR/invoke @l_secondPoint :jm_getX_0) @l_x)) (unchecked-int (unchecked-add (JR/invoke @l_secondPoint :jm_getY_0) @l_y)))))
                (do
                (JR/invoke @l_newBasicArrayList :jm_add_1 @l_secondPoint)))))
        (JR/fset this :pointBasicArrayList @l_newBasicArrayList)))

    
(defn jm_rotateToAngle_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)]
        (JR/invoke this :jm_rotate_1 (JR/invoke @l_angle :jm_getValue_0))))

    
(defn jm_rotate_1 [this p_angle]
  (let [ l_angle (volatile! p_angle) l_newBasicArrayList (volatile! nil) l_secondPoint (volatile! nil) l_y (volatile! nil) l_secondX (volatile! nil) l_secondY (volatile! nil) l_point (volatile! nil) l_pointFactory (volatile! nil) l_size (volatile! nil) l_sin (volatile! nil) l_cos (volatile! nil) l_index (volatile! nil)]
        (vreset! l_newBasicArrayList (BasicArrayListD/jnew_0))
        (vreset! l_secondPoint nil)
        (vreset! l_y 0)
        (vreset! l_secondX 0)
        (vreset! l_secondY 0)
        (vreset! l_point nil)
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_size (JR/invoke (JR/fget this :pointBasicArrayList) :jm_size_0))
        (vreset! l_sin 0)
        (vreset! l_cos 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_secondPoint (JR/aget* (JR/fget (JR/fget this :pointBasicArrayList) :objectArray) @l_index))
            (if (not (== (JR/invoke @l_secondPoint :jm_getX_0) 1000))
                (do
                (vreset! l_sin (JR/invoke (JR/fget this :noDecimalTrigTable) :jm_sin_1 @l_angle))
                (vreset! l_cos (JR/invoke (JR/fget this :noDecimalTrigTable) :jm_cos_1 @l_angle))
                (vreset! l_y (unchecked-multiply (JR/invoke @l_secondPoint :jm_getY_0) @l_sin))
                (vreset! l_secondX (unchecked-subtract (unchecked-multiply (JR/invoke @l_secondPoint :jm_getX_0) @l_cos) @l_y))
                (vreset! l_secondY (unchecked-add (unchecked-multiply (JR/invoke @l_secondPoint :jm_getX_0) @l_sin) (unchecked-multiply (JR/invoke @l_secondPoint :jm_getY_0) @l_cos)))
                (vreset! l_point (JR/invoke @l_pointFactory :jm_createXY_2 (JR/idiv (JR/i32 @l_secondX) 10000) (JR/idiv (JR/i32 @l_secondY) 10000)))
                (JR/invoke @l_newBasicArrayList :jm_add_1 @l_point))
                (do
                (JR/invoke @l_newBasicArrayList :jm_add_1 @l_secondPoint)))))
        (JR/fset this :pointBasicArrayList @l_newBasicArrayList)))

    
(defn jm_mirror_1 [this p_width]
  (let [ l_width (volatile! p_width) l_pointFactory (volatile! nil) l_halfWidth (volatile! nil) l_newBasicArrayList (volatile! nil) l_secondPoint (volatile! nil) l_newX (volatile! nil) l_point (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_halfWidth (JR/ishr @l_width 1))
        (vreset! l_newBasicArrayList (BasicArrayListD/jnew_0))
        (vreset! l_secondPoint nil)
        (vreset! l_newX 0)
        (vreset! l_point nil)
        (vreset! l_size (JR/invoke (JR/fget this :pointBasicArrayList) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_secondPoint (JR/aget* (JR/fget (JR/fget this :pointBasicArrayList) :objectArray) @l_index))
            (if (not (== (JR/invoke @l_secondPoint :jm_getX_0) 1000))
                (do
                (vreset! l_newX 0)
                (if (> (JR/invoke @l_secondPoint :jm_getX_0) @l_halfWidth)
                    (do
                    (vreset! l_newX (unchecked-int (unchecked-subtract @l_halfWidth (unchecked-int (unchecked-subtract (JR/invoke @l_secondPoint :jm_getX_0) @l_halfWidth))))))
                    (do
                    (vreset! l_newX (unchecked-int (unchecked-add @l_halfWidth (unchecked-int (unchecked-subtract @l_halfWidth (JR/invoke @l_secondPoint :jm_getX_0))))))))
                (vreset! l_point (JR/invoke @l_pointFactory :jm_createXY_2 @l_newX (JR/invoke @l_secondPoint :jm_getY_0)))
                (JR/invoke @l_newBasicArrayList :jm_add_1 @l_point))
                (do
                (JR/invoke @l_newBasicArrayList :jm_add_1 @l_secondPoint)))))
        (JR/fset this :pointBasicArrayList @l_newBasicArrayList)))

    
(defn jm_getMatrix_0 [this]
  (let []
        (JR/fget this :pointBasicArrayList)))



