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
;; package org.allbinary.math

(ns RectangleCollisionPointUtil)

(JR/register 'RectangleCollisionPointUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'RectangleCollisionPointUtil)] (jinit_0 o) o))

    
(defn jm_allPointsInside_5 [p_rectX1 p_rectY1 p_rectX2 p_rectY2 p_list]
  (let [this nil l_rectX1 (volatile! p_rectX1) l_rectY1 (volatile! p_rectY1) l_rectX2 (volatile! p_rectX2) l_rectY2 (volatile! p_rectY2) l_list (volatile! p_list) l_rectangleCollisionUtil (volatile! nil) l_point (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_rectangleCollisionUtil (JR/scall 'RectangleCollisionUtil :jm_getInstance_0))
        (vreset! l_point nil)
        (do (vreset! l_index (JR/invoke @l_list :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_point (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (if (not (JR/invoke @l_rectangleCollisionUtil :jm_isInside_6 @l_rectX1 @l_rectY1 @l_rectX2 @l_rectY2 (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0)))
                (do
                (JR/jreturn false)))))
        true)))

    
(defn jm_allPointsInsideCell_7 [p_rectX1 p_rectY1 p_rectX2 p_rectY2 p_list p_xCellSize p_yCellSize]
  (let [this nil l_rectX1 (volatile! p_rectX1) l_rectY1 (volatile! p_rectY1) l_rectX2 (volatile! p_rectX2) l_rectY2 (volatile! p_rectY2) l_list (volatile! p_list) l_xCellSize (volatile! p_xCellSize) l_yCellSize (volatile! p_yCellSize) l_rectangleCollisionUtil (volatile! nil) l_point (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_rectangleCollisionUtil (JR/scall 'RectangleCollisionUtil :jm_getInstance_0))
        (vreset! l_point nil)
        (do (vreset! l_index (JR/invoke @l_list :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_point (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (if (not (JR/invoke @l_rectangleCollisionUtil :jm_isInside_6 @l_rectX1 @l_rectY1 @l_rectX2 @l_rectY2 (unchecked-int (unchecked-multiply (JR/invoke @l_point :jm_getX_0) @l_xCellSize)) (unchecked-int (unchecked-multiply (JR/invoke @l_point :jm_getY_0) @l_yCellSize))))
                (do
                (JR/jreturn false)))))
        true)))



