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

(ns VectorAnimationUtil)

(JR/register 'VectorAnimationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (VectorAnimationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (VectorAnimationUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'VectorAnimationUtil)] (jinit_0 o) o))

    
(defn jm_toAnimationArrayFromListOfPointListWithPointsPerFrame_2 [this p_vector p_pointsPerFrame]
  (let [ l_vector (volatile! p_vector) l_pointsPerFrame (volatile! p_pointsPerFrame) l_size (volatile! nil) l_points (volatile! nil) l_nextBasicArrayList (volatile! nil) l_framePoints (volatile! nil) l_pointIndex (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke @l_vector :jm_size_0))
        (vreset! l_points (JR/anew "INT" 3 @l_size @l_pointsPerFrame 2))
        (vreset! l_nextBasicArrayList nil)
        (vreset! l_framePoints nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_nextBasicArrayList (JR/aget* (JR/fget @l_vector :objectArray) @l_index))
            (vreset! l_framePoints (JR/invoke this :jm_toFrameArrayFromPointBasicArrayList_1 @l_nextBasicArrayList))
            (do (vreset! l_pointIndex 0)
                (JR/jfor false false (< @l_pointIndex (JR/alen @l_framePoints)) (do (JR/vinc l_pointIndex 1 :int false))
                (JR/aset* (JR/aget* (JR/aget* @l_points @l_index) @l_pointIndex) 0 (JR/aget* (JR/aget* @l_framePoints @l_pointIndex) 0))
                (JR/aset* (JR/aget* (JR/aget* @l_points @l_index) @l_pointIndex) 1 (JR/aget* (JR/aget* @l_framePoints @l_pointIndex) 1))))))
        @l_points))

    
(defn jm_toAnimationArrayFromListOfPointList_1 [this p_vector]
  (let [ l_vector (volatile! p_vector) l_size (volatile! nil) l_points (volatile! nil) l_nextBasicArrayList (volatile! nil) l_framePoints (volatile! nil) l_pointIndex (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke @l_vector :jm_size_0))
        (vreset! l_points (JR/anew "INT" 3 @l_size 0 0))
        (vreset! l_nextBasicArrayList nil)
        (vreset! l_framePoints nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_nextBasicArrayList (JR/aget* (JR/fget @l_vector :objectArray) @l_index))
            (vreset! l_framePoints (JR/invoke this :jm_toFrameArrayFromPointBasicArrayList_1 @l_nextBasicArrayList))
            (JR/aset* @l_points @l_index (JR/anew "INT" 2 (JR/alen @l_framePoints) 2))
            (do (vreset! l_pointIndex 0)
                (JR/jfor false false (< @l_pointIndex (JR/alen @l_framePoints)) (do (JR/vinc l_pointIndex 1 :int false))
                (JR/aset* (JR/aget* (JR/aget* @l_points @l_index) @l_pointIndex) 0 (JR/aget* (JR/aget* @l_framePoints @l_pointIndex) 0))
                (JR/aset* (JR/aget* (JR/aget* @l_points @l_index) @l_pointIndex) 1 (JR/aget* (JR/aget* @l_framePoints @l_pointIndex) 1))))))
        @l_points))

    
(defn jm_toFrameArrayFromPointBasicArrayList_1 [this p_list]
  (let [ l_list (volatile! p_list) l_points (volatile! nil) l_size (volatile! nil) l_nextPoint (volatile! nil) l_index (volatile! nil)]
        (vreset! l_points (JR/anew "INT" 2 (JR/invoke @l_list :jm_size_0) 2))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_nextPoint (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/aset* (JR/aget* @l_points @l_index) 0 (JR/invoke @l_nextPoint :jm_getX_0))
            (JR/aset* (JR/aget* @l_points @l_index) 1 (JR/invoke @l_nextPoint :jm_getY_0))))
        @l_points))



