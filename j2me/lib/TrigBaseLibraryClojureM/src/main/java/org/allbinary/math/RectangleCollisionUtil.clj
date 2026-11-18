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

(ns RectangleCollisionUtil)

(JR/register 'RectangleCollisionUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (RectangleCollisionUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (RectangleCollisionUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'RectangleCollisionUtil)] (jinit_0 o) o))

    
(defn jm_isCollision_8 [this p_rectX1 p_rectY1 p_rectX2 p_rectY2 p_rect2X1 p_rect2Y1 p_rect2X2 p_rect2Y2]
  (let [ l_rectX1 (volatile! p_rectX1) l_rectY1 (volatile! p_rectY1) l_rectX2 (volatile! p_rectX2) l_rectY2 (volatile! p_rectY2) l_rect2X1 (volatile! p_rect2X1) l_rect2Y1 (volatile! p_rect2Y1) l_rect2X2 (volatile! p_rect2X2) l_rect2Y2 (volatile! p_rect2Y2)]
        (if (or (or (or (>= @l_rect2X1 @l_rectX2) (>= @l_rect2Y1 @l_rectY2)) (<= @l_rect2X2 @l_rectX1)) (<= @l_rect2Y2 @l_rectY1))
            (do
            false)
            (do
            true))))

    
(defn jm_isInside_6 [this p_rectX1 p_rectY1 p_rectX2 p_rectY2 p_x p_y]
  (let [ l_rectX1 (volatile! p_rectX1) l_rectY1 (volatile! p_rectY1) l_rectX2 (volatile! p_rectX2) l_rectY2 (volatile! p_rectY2) l_x (volatile! p_x) l_y (volatile! p_y)]
        (if (or (or (or (>= @l_x @l_rectX2) (>= @l_y @l_rectY2)) (<= @l_x @l_rectX1)) (<= @l_y @l_rectY1))
            (do
            false)
            (do
            true))))



