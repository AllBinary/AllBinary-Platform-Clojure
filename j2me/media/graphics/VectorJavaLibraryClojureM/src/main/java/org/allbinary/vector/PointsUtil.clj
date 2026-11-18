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
;; package org.allbinary.vector

(ns PointsUtil)

(JR/register 'PointsUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PointsUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PointsUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PointsUtil/jstatic_instance)))

    
(defn jm_adjustXY_3 [this p_points p_x p_y]
  (let [ l_points (volatile! p_points) l_x (volatile! p_x) l_y (volatile! p_y) l_size (volatile! nil) l_newPoints (volatile! nil) l_size2 (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/alen @l_points))
        (vreset! l_newPoints (JR/anew "INT" 3 @l_size 0 0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_size2 (JR/alen (JR/aget* @l_points @l_index)))
            (JR/aset* @l_newPoints @l_index (JR/anew "INT" 2 @l_size2 2))
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 @l_size2) (do (JR/vinc l_index2 1 :int false))
                (if (not (JR/eq (JR/aget* (JR/aget* (JR/aget* @l_points @l_index) @l_index2) 0) 1000))
                    (do
                    (JR/aset* (JR/aget* (JR/aget* @l_newPoints @l_index) @l_index2) 0 (+ (JR/aget* (JR/aget* (JR/aget* @l_points @l_index) @l_index2) 0) @l_x))
                    (JR/aset* (JR/aget* (JR/aget* @l_newPoints @l_index) @l_index2) 1 (+ (JR/aget* (JR/aget* (JR/aget* @l_points @l_index) @l_index2) 1) @l_y)))
                    (do
                    (JR/aset* (JR/aget* (JR/aget* @l_newPoints @l_index) @l_index2) 0 1000)
                    (JR/aset* (JR/aget* (JR/aget* @l_newPoints @l_index) @l_index2) 1 1000)))))))
        @l_newPoints))

    
(defn jm_adjust_2 [this p_points p_both]
  (let [ l_points (volatile! p_points) l_both (volatile! p_both)]
        (JR/invoke this :jm_adjust_3 @l_points @l_both @l_both)))

    
(defn jm_adjust_3 [this p_points p_x p_y]
  (let [ l_points (volatile! p_points) l_x (volatile! p_x) l_y (volatile! p_y) l_newPoints (volatile! nil) l_index2 (volatile! nil)]
        (vreset! l_newPoints (JR/anew "INT" 2 (JR/alen @l_points) 2))
        (do (vreset! l_index2 0)
            (JR/jfor false false (< @l_index2 (JR/alen @l_points)) (do (JR/vinc l_index2 1 :int false))
            (if (not (JR/eq (JR/aget* (JR/aget* @l_points @l_index2) 0) 1000))
                (do
                (JR/aset* (JR/aget* @l_newPoints @l_index2) 0 (+ (JR/aget* (JR/aget* @l_points @l_index2) 0) @l_x))
                (JR/aset* (JR/aget* @l_newPoints @l_index2) 1 (+ (JR/aget* (JR/aget* @l_points @l_index2) 1) @l_y)))
                (do
                (JR/aset* (JR/aget* @l_newPoints @l_index2) 0 1000)
                (JR/aset* (JR/aget* @l_newPoints @l_index2) 1 1000)))))
        @l_newPoints))



