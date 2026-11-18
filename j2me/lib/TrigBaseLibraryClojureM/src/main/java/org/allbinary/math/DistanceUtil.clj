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

(ns DistanceUtil)

(JR/register 'DistanceUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DistanceUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :mathUtil nil)
    (JR/fset this :mathUtil (JR/scall 'MathUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DistanceUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DistanceUtil/jstatic_instance)))

    
(defn jm_getDistance_4 [this p_x1 p_y1 p_x2 p_y2]
  (let [ l_x1 (volatile! p_x1) l_y1 (volatile! p_y1) l_x2 (volatile! p_x2) l_y2 (volatile! p_y2) l_dx (volatile! nil) l_dy (volatile! nil)]
        (vreset! l_dx (unchecked-int (unchecked-subtract @l_x1 @l_x2)))
        (vreset! l_dy (unchecked-int (unchecked-subtract @l_y1 @l_y2)))
        (JR/invoke (JR/fget this :mathUtil) :jm_sqrt_1 (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply @l_dx @l_dx)) (unchecked-int (unchecked-multiply @l_dy @l_dy)))))))



