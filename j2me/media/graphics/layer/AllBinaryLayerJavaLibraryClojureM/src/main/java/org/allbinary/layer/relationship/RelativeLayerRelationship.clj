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
;; package org.allbinary.layer.relationship

(ns RelativeLayerRelationship)

(JR/register 'RelativeLayerRelationship 'RelativeRelationship '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :layer nil)
    (JR/fset this :layer (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
  this)

    
(defn jinit_3 [this p_layer p_point p_typesAllowedList]
  (let [ l_layer (volatile! p_layer) l_point (volatile! p_point) l_typesAllowedList (volatile! p_typesAllowedList)]
        (RelativeRelationship/jinit_2 this @l_point @l_typesAllowedList) (jinitfields this)
        (JR/fset this :layer @l_layer))
  this)

(defn jnew_3 [p_layer p_point p_typesAllowedList ]
  (let [o (JR/alloc 'RelativeLayerRelationship)] (jinit_3 o p_layer p_point p_typesAllowedList) o))

    
(defn jm_getX_0 [this]
  (let []
        (+ (JR/invoke (JR/fget this :layer) :jm_getXP_0) (JR/invoke-super 'RelativeRelationship this :jm_getX_0))))

    
(defn jm_getY_0 [this]
  (let []
        (+ (JR/invoke (JR/fget this :layer) :jm_getYP_0) (JR/invoke-super 'RelativeRelationship this :jm_getY_0))))

    
(defn jm_getZ_0 [this]
  (let []
        (+ (JR/invoke (JR/fget this :layer) :jm_getZP_0) (JR/invoke-super 'RelativeRelationship this :jm_getZ_0))))



