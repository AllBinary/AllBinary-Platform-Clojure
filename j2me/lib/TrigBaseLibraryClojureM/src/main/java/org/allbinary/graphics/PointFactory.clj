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
;; package org.allbinary.graphics

(ns PointFactory)

(JR/register 'PointFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PointFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :ZERO_ZERO nil)
    (JR/fset this :ZERO_ZERO (JR/invoke this :jm_createXYZ_3 0 0 0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PointFactory/jstatic_instance)))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'PointFactory)] (jinit_0 o) o))

    
(defn jm_createXY_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        (GPoint/jnew_3 @l_x @l_y 0)))

    
(defn jm_createXYZ_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (GPoint/jnew_3 @l_x @l_y @l_z)))



