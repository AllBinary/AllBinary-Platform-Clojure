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

(ns VectorMirrorGenerator)

(JR/register 'VectorMirrorGenerator nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (VectorMirrorGenerator/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :vectorAnimationUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :vectorAnimationUtil (JR/scall 'VectorAnimationUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (VectorMirrorGenerator/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'VectorMirrorGenerator)] (jinit_0 o) o))

    
(defn jm_getInstance_2 [this p_points p_width]
  (let [ l_points (volatile! p_points) l_width (volatile! p_width) l_pointFactory (volatile! nil) l_pointBasicArrayList (volatile! nil) l_nextPoints (volatile! nil) l_size2 (volatile! nil) l_size (volatile! nil) l_pointsBasicArrayList (volatile! nil) l_index (volatile! nil) l_frame (volatile! nil) l_newPoints (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
            (vreset! l_pointBasicArrayList nil)
            (vreset! l_nextPoints nil)
            (vreset! l_size2 0)
            (vreset! l_size (JR/alen @l_points))
            (vreset! l_pointsBasicArrayList (BasicArrayListS/jnew_1 @l_size))
            (do (vreset! l_frame 0)
                (JR/jfor false false (< @l_frame @l_size) (do (JR/vinc l_frame 1 :int false))
                (vreset! l_nextPoints (JR/aget* @l_points @l_frame))
                (vreset! l_size2 (JR/alen @l_nextPoints))
                (vreset! l_pointBasicArrayList (BasicArrayListS/jnew_1 @l_size2))
                (do (vreset! l_index 0)
                    (JR/jfor false false (< @l_index @l_size2) (do (JR/vinc l_index 1 :int false))
                    (JR/invoke @l_pointBasicArrayList :jm_add_1 (JR/invoke @l_pointFactory :jm_createXY_2 (JR/aget* (JR/aget* @l_nextPoints @l_index) 0) (JR/aget* (JR/aget* @l_nextPoints @l_index) 1)))))
                (JR/invoke @l_pointsBasicArrayList :jm_add_1 @l_pointBasicArrayList)))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index (JR/alen @l_points)) (do (JR/vinc l_index 1 :int false))
                (JR/invoke @l_pointsBasicArrayList :jm_add_1 (JR/invoke this :jm_getInstance_2 (JR/aget* (JR/fget @l_pointsBasicArrayList :objectArray) @l_index) @l_width))))
            (vreset! l_newPoints (JR/invoke (JR/fget this :vectorAnimationUtil) :jm_toAnimationArrayFromListOfPointList_1 @l_pointsBasicArrayList))
            (JR/jreturn @l_newPoints))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)
            (JR/jreturn (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY_ARRAY_ARRAY))) :else (throw jt))))))))

    
(defn jm_getInstance_2 [this p_pointBasicArrayList p_width]
  (let [ l_pointBasicArrayList (volatile! p_pointBasicArrayList) l_width (volatile! p_width) l_graphicsPipe (volatile! nil)]
        (vreset! l_graphicsPipe (BasicGraphicsPipeline/jnew_1 @l_pointBasicArrayList))
        (JR/invoke @l_graphicsPipe :jm_createMatrix_0)
        (JR/invoke @l_graphicsPipe :jm_mirror_1 @l_width)
        (JR/invoke @l_graphicsPipe :jm_getMatrix_0)))



