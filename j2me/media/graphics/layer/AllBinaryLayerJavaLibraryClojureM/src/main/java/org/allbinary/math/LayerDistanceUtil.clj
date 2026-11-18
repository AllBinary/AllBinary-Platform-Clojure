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

(ns LayerDistanceUtil)

(JR/register 'LayerDistanceUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LayerDistanceUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :mathUtil nil)
    (JR/fset this :mathUtil (JR/scall 'MathUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LayerDistanceUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LayerDistanceUtil/jstatic_instance)))

    
(defn jm_getDistance_2 [this p_layerInterface p_layerInterface2]
  (let [ l_layerInterface (volatile! p_layerInterface) l_layerInterface2 (volatile! p_layerInterface2) l_dx (volatile! nil) l_dy (volatile! nil)]
        (vreset! l_dx (unchecked-int (unchecked-subtract (unchecked-int (unchecked-add (JR/invoke @l_layerInterface :jm_getXP_0) (JR/invoke @l_layerInterface :jm_getHalfWidth_0))) (unchecked-int (unchecked-add (JR/invoke @l_layerInterface2 :jm_getXP_0) (JR/invoke @l_layerInterface2 :jm_getHalfWidth_0))))))
        (vreset! l_dy (unchecked-int (unchecked-subtract (unchecked-int (unchecked-add (JR/invoke @l_layerInterface :jm_getYP_0) (JR/invoke @l_layerInterface :jm_getHalfHeight_0))) (unchecked-int (unchecked-add (JR/invoke @l_layerInterface2 :jm_getYP_0) (JR/invoke @l_layerInterface2 :jm_getHalfHeight_0))))))
        (JR/invoke (JR/fget this :mathUtil) :jm_sqrt_1 (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply @l_dx @l_dx)) (unchecked-int (unchecked-multiply @l_dy @l_dy)))))))

    
(defn jm_getDistance3D_2 [this p_layerInterface p_layerInterface2]
  (let [ l_layerInterface (volatile! p_layerInterface) l_layerInterface2 (volatile! p_layerInterface2) l_dx (volatile! nil) l_dy (volatile! nil) l_dz (volatile! nil)]
        (vreset! l_dx (unchecked-int (unchecked-subtract (unchecked-int (unchecked-add (JR/invoke @l_layerInterface :jm_getXP_0) (JR/invoke @l_layerInterface :jm_getHalfWidth_0))) (unchecked-int (unchecked-add (JR/invoke @l_layerInterface2 :jm_getXP_0) (JR/invoke @l_layerInterface2 :jm_getHalfWidth_0))))))
        (vreset! l_dy (unchecked-int (unchecked-subtract (unchecked-int (unchecked-add (JR/invoke @l_layerInterface :jm_getYP_0) (JR/invoke @l_layerInterface :jm_getHalfHeight_0))) (unchecked-int (unchecked-add (JR/invoke @l_layerInterface2 :jm_getYP_0) (JR/invoke @l_layerInterface2 :jm_getHalfHeight_0))))))
        (vreset! l_dz (unchecked-int (unchecked-subtract (unchecked-int (unchecked-add (JR/invoke @l_layerInterface :jm_getZP_0) (JR/invoke @l_layerInterface :jm_getHalfDepth_0))) (unchecked-int (unchecked-add (JR/invoke @l_layerInterface2 :jm_getZP_0) (JR/invoke @l_layerInterface2 :jm_getHalfDepth_0))))))
        (JR/invoke (JR/fget this :mathUtil) :jm_sqrt_1 (unchecked-int (unchecked-add (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply @l_dx @l_dx)) (unchecked-int (unchecked-multiply @l_dy @l_dy)))) (unchecked-int (unchecked-multiply @l_dz @l_dz)))))))

    
(defn jm_getDistanceAt_2 [this p_layerInterface p_point]
  (let [ l_layerInterface (volatile! p_layerInterface) l_point (volatile! p_point) l_dx (volatile! nil) l_dy (volatile! nil)]
        (vreset! l_dx (unchecked-int (unchecked-subtract (JR/invoke @l_layerInterface :jm_getXP_0) (JR/invoke @l_point :jm_getX_0))))
        (vreset! l_dy (unchecked-int (unchecked-subtract (JR/invoke @l_layerInterface :jm_getYP_0) (JR/invoke @l_point :jm_getY_0))))
        (JR/invoke (JR/fget this :mathUtil) :jm_sqrt_1 (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply @l_dx @l_dx)) (unchecked-int (unchecked-multiply @l_dy @l_dy)))))))



