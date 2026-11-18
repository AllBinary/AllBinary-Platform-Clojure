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

(ns RelativeRelationship)

(JR/register 'RelativeRelationship nil '[])

(def jsv_NULL_RELATIVE_RELATIONSHIP (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_RELATIVE_RELATIONSHIP [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_RELATIVE_RELATIONSHIP)
(defn jstatic_set_NULL_RELATIVE_RELATIONSHIP [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_RELATIVE_RELATIONSHIP v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_RELATIVE_RELATIONSHIP (RelativeRelationship/jnew_2 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0)))
    nil))

(defn jinitfields [this]
  (JR/fset this :typesAllowedList nil)
  (JR/fset this :x 0)
  (JR/fset this :y 0)
  (JR/fset this :z 0)
  this)

    
(defn jinit_2 [this p_point p_typesAllowedList]
  (let [ l_point (volatile! p_point) l_typesAllowedList (volatile! p_typesAllowedList)]
    nil (jinitfields this)
        (JR/fset this :x (JR/invoke @l_point :jm_getX_0))
        (JR/fset this :y (JR/invoke @l_point :jm_getY_0))
        (JR/fset this :z (JR/invoke @l_point :jm_getZ_0))
        (JR/fset this :typesAllowedList @l_typesAllowedList))
  this)

(defn jnew_2 [p_point p_typesAllowedList ]
  (let [o (JR/alloc 'RelativeRelationship)] (jinit_2 o p_point p_typesAllowedList) o))

    
(defn jm_getX_0 [this]
  (let []
        (JR/fget this :x)))

    
(defn jm_getY_0 [this]
  (let []
        (JR/fget this :y)))

    
(defn jm_getZ_0 [this]
  (let []
        (JR/fget this :z)))

    
(defn jm_getTypesAllowedList_0 [this]
  (let []
        (JR/fget this :typesAllowedList)))

    
(defn jm_setTypesAllowedList_1 [this p_typesAllowedList]
  (let [ l_typesAllowedList (volatile! p_typesAllowedList)]
        (JR/fset this :typesAllowedList @l_typesAllowedList)))



