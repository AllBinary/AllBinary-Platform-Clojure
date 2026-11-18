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

(ns VectorExplosionGenerator)

(JR/register 'VectorExplosionGenerator nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (VectorExplosionGenerator/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :RANDOM nil)
  (JR/fset this :ROTATION nil)
  (JR/fset this :vectorAnimationUtil nil)
  (JR/fset this :randomRotationFactory nil)
    (JR/fset this :RANDOM (VectorExplosionType/jnew_0))
    (JR/fset this :ROTATION (VectorExplosionType/jnew_0))
    (JR/fset this :vectorAnimationUtil (JR/scall 'VectorAnimationUtil :jm_getInstance_0))
    (JR/fset this :randomRotationFactory (JR/scall 'RandomRotationFactory :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (VectorExplosionGenerator/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'VectorExplosionGenerator)] (jinit_0 o) o))

    
(defn jm_createList_3 [this p_list p_howMuch p_type]
  (let [ l_list (volatile! p_list) l_howMuch (volatile! p_howMuch) l_type (volatile! p_type) l_point (volatile! nil) l_size (volatile! nil) l_points (volatile! nil) l_index (volatile! nil)]
        (vreset! l_point nil)
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_points (JR/anew "INT" 2 @l_size 2))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_point (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/aset* (JR/aget* @l_points @l_index) 0 (JR/invoke @l_point :jm_getX_0))
            (JR/aset* (JR/aget* @l_points @l_index) 1 (JR/invoke @l_point :jm_getY_0))))
        (JR/invoke this :jm_createListFromPoints_4 @l_list @l_points @l_howMuch @l_type)))

    
(defn jm_getInstance_3 [this p_points p_howMuch p_type]
  (let [ l_points (volatile! p_points) l_howMuch (volatile! p_howMuch) l_type (volatile! p_type) l_pointsBasicArrayList (volatile! nil) l_tempBasicArrayList (volatile! nil) l_newPoints (volatile! nil)]
        (vreset! l_pointsBasicArrayList (JR/invoke this :jm_getInstanceStartFrame_4 @l_points @l_howMuch @l_type true))
        (vreset! l_tempBasicArrayList (JR/aget* (JR/fget @l_pointsBasicArrayList :objectArray) 0))
        (vreset! l_newPoints (JR/invoke (JR/fget this :vectorAnimationUtil) :jm_toAnimationArrayFromListOfPointListWithPointsPerFrame_2 @l_pointsBasicArrayList (JR/invoke @l_tempBasicArrayList :jm_size_0)))
        @l_newPoints))

    
(defn jm_getInstanceStartFrame_4 [this p_points p_howMuch p_type p_startFrame]
  (let [ l_points (volatile! p_points) l_howMuch (volatile! p_howMuch) l_type (volatile! p_type) l_startFrame (volatile! p_startFrame) l_pointsBasicArrayList (volatile! nil) l_frameIndex (volatile! nil) l_tempBasicArrayList (volatile! nil) l_pointBasicArrayList (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_pointsBasicArrayList (BasicArrayListS/jnew_1 @l_howMuch))
            (JR/invoke @l_pointsBasicArrayList :jm_add_1 (JR/invoke this :jm_createPointsBasicArrayList_1 @l_points))
            (vreset! l_frameIndex 0)
            (vreset! l_tempBasicArrayList nil)
            (vreset! l_pointBasicArrayList nil)
            (JR/jwhile false false (< @l_frameIndex @l_howMuch)
                (vreset! l_tempBasicArrayList (JR/aget* (JR/fget @l_pointsBasicArrayList :objectArray) @l_frameIndex))
                (vreset! l_pointBasicArrayList (JR/invoke this :jm_createListFromPoints_4 @l_tempBasicArrayList @l_points @l_howMuch @l_type))
                (JR/invoke @l_pointsBasicArrayList :jm_add_1 @l_pointBasicArrayList)
                (JR/vinc l_frameIndex 1 :int false))
            (if (not @l_startFrame)
                (do
                (JR/invoke @l_pointsBasicArrayList :jm_removeAt_1 0)))
            (JR/jreturn @l_pointsBasicArrayList))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow @l_e)) :else (throw jt))))))))

    
(defn jm_createListFromPoints_4 [this p_tempBasicArrayList p_points p_howMuch p_type]
  (let [ l_tempBasicArrayList (volatile! p_tempBasicArrayList) l_points (volatile! p_points) l_howMuch (volatile! p_howMuch) l_type (volatile! p_type) l_index (volatile! nil) l_pointBasicArrayList (volatile! nil) l_sectionBasicArrayList (volatile! nil) l_size (volatile! nil) l_index2 (volatile! nil)]
        (vreset! l_index 0)
        (vreset! l_pointBasicArrayList (BasicArrayListD/jnew_0))
        (vreset! l_sectionBasicArrayList nil)
        (JR/jwhile true false (< @l_index (JR/alen @l_points))
            (vreset! l_sectionBasicArrayList (BasicArrayListD/jnew_0))
            (JR/jwhile true false (not (JR/eq (JR/aget* (JR/aget* @l_points @l_index) 0) 1000))
                (JR/invoke @l_sectionBasicArrayList :jm_add_1 (JR/aget* (JR/fget @l_tempBasicArrayList :objectArray) @l_index))
                (JR/vinc l_index 1 :int false)
                (if (>= @l_index (JR/alen @l_points))
                    (do
                    (JR/jbreak))))
            (vreset! l_sectionBasicArrayList (JR/scall 'RandomTranslation :jm_getInstance_2 @l_sectionBasicArrayList @l_howMuch))
            (if (JR/eq @l_type (JR/fget this :ROTATION))
                (do
                (vreset! l_sectionBasicArrayList (JR/invoke (JR/fget this :randomRotationFactory) :jm_getInstanceList_2 @l_sectionBasicArrayList @l_howMuch))))
            (vreset! l_size (JR/invoke @l_sectionBasicArrayList :jm_size_0))
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 @l_size) (do (JR/vinc l_index2 1 :int false))
                (JR/invoke @l_pointBasicArrayList :jm_add_1 (JR/aget* (JR/fget @l_sectionBasicArrayList :objectArray) @l_index2))))
            (if (>= @l_index (JR/alen @l_points))
                (do
                (JR/jbreak))
                (if (JR/eq (JR/aget* (JR/aget* @l_points @l_index) 0) 1000)
                (do
                (JR/invoke @l_pointBasicArrayList :jm_add_1 (JR/aget* (JR/fget @l_tempBasicArrayList :objectArray) @l_index))
                (JR/vinc l_index 1 :int false)))))
        @l_pointBasicArrayList))

    
(defn jm_createPointsBasicArrayList_1 [this p_points]
  (let [ l_points (volatile! p_points) l_firstPointBasicArrayList (volatile! nil) l_pointFactory (volatile! nil) l_index (volatile! nil)]
        (if (== (JR/alen @l_points) 0)
            (do
            (JR/jthrow (new java.lang.Exception "Not Points Provided"))))
        (vreset! l_firstPointBasicArrayList (BasicArrayListS/jnew_1 (JR/alen @l_points)))
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_points)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_firstPointBasicArrayList :jm_add_1 (JR/invoke @l_pointFactory :jm_createXY_2 (JR/aget* (JR/aget* @l_points @l_index) 0) (JR/aget* (JR/aget* @l_points @l_index) 1)))))
        @l_firstPointBasicArrayList))



