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

(ns VectorRotationGenerator)

(JR/register 'VectorRotationGenerator nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (VectorRotationGenerator/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :vectorAnimationUtil nil)
  (JR/fset this :angleFactory nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :vectorAnimationUtil (JR/scall 'VectorAnimationUtil :jm_getInstance_0))
    (JR/fset this :angleFactory (JR/scall 'AngleFactory :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (VectorRotationGenerator/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'VectorRotationGenerator)] (jinit_0 o) o))

    
(defn jm_getInstance_1 [this p_vectorRotationInfo]
  (let [ l_vectorRotationInfo (volatile! p_vectorRotationInfo)]
        (JR/invoke this :jm_getInstanceFrames_4 (JR/invoke @l_vectorRotationInfo :jm_getWidth_0) (JR/invoke @l_vectorRotationInfo :jm_getHeight_0) (JR/invoke @l_vectorRotationInfo :jm_getPoints_0) (JR/invoke @l_vectorRotationInfo :jm_getTotalFrames_0))))

    
(defn jm_getInstanceFrames_4 [this p_width p_height p_points p_frames]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_points (volatile! p_points) l_frames (volatile! p_frames) l_totalAngle (volatile! nil) l_angleIncrement (volatile! nil) l_pointsBasicArrayList (volatile! nil) l_pointBasicArrayList (volatile! nil) l_pointFactory (volatile! nil) l_size (volatile! nil) l_index (volatile! nil) l_newPoints (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_totalAngle (JR/fget (JR/fget this :angleFactory) :TOTAL_ANGLE))
            (vreset! l_angleIncrement (JR/idiv @l_totalAngle @l_frames))
            (vreset! l_pointsBasicArrayList (BasicArrayListS/jnew_1 (JR/idiv @l_totalAngle @l_angleIncrement)))
            (vreset! l_pointBasicArrayList (BasicArrayListS/jnew_1 (JR/alen @l_points)))
            (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
            (vreset! l_size (JR/alen @l_points))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (JR/invoke @l_pointBasicArrayList :jm_add_1 (JR/invoke @l_pointFactory :jm_createXY_2 (JR/aget* (JR/aget* @l_points @l_index) 0) (JR/aget* (JR/aget* @l_points @l_index) 1)))))
            (vreset! l_index 0)
            (JR/jwhile false false (< @l_index @l_totalAngle)
                (JR/invoke @l_pointsBasicArrayList :jm_add_1 (JR/invoke this :jm_getListAtAngle_4 @l_width @l_height @l_pointBasicArrayList (JR/invoke (JR/fget this :angleFactory) :jm_getAt_1 @l_index)))
                (vreset! l_index (unchecked-int (unchecked-add @l_index @l_angleIncrement))))
            (vreset! l_newPoints (JR/invoke (JR/fget this :vectorAnimationUtil) :jm_toAnimationArrayFromListOfPointListWithPointsPerFrame_2 @l_pointsBasicArrayList (JR/invoke @l_pointBasicArrayList :jm_size_0)))
            (JR/jreturn @l_newPoints))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)
            (JR/jreturn (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY_ARRAY_ARRAY))) :else (throw jt))))))))

    
(defn jm_getListAtAngle_4 [this p_width p_height p_pointBasicArrayList p_angle]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_pointBasicArrayList (volatile! p_pointBasicArrayList) l_angle (volatile! p_angle) l_graphicsPipe (volatile! nil)]
        (vreset! l_graphicsPipe (BasicGraphicsPipeline/jnew_1 @l_pointBasicArrayList))
        (JR/invoke @l_graphicsPipe :jm_createMatrix_0)
        (JR/invoke @l_graphicsPipe :jm_translate_2 (unchecked-int (unchecked-negate (JR/c2i (JR/ishr @l_width 1)))) (unchecked-int (unchecked-negate (JR/c2i (JR/ishr @l_height 1)))))
        (JR/invoke @l_graphicsPipe :jm_rotateToAngle_1 @l_angle)
        (JR/invoke @l_graphicsPipe :jm_translate_2 (JR/ishr @l_width 1) (JR/ishr @l_height 1))
        (JR/invoke @l_graphicsPipe :jm_getMatrix_0)))



