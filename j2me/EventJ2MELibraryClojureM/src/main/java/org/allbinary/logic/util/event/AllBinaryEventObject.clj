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
;; package org.allbinary.logic.util.event

(ns AllBinaryEventObject)

(JR/register 'AllBinaryEventObject nil '[])

(def jsv_NULL_EVENT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_EVENT [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_EVENT)
(defn jstatic_set_NULL_EVENT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_EVENT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_EVENT (AllBinaryEventObject/jnew_1 (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT)))
    nil))

(defn jinitfields [this]
  (JR/fset this :source nil)
  this)

    
(defn jinit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
    nil (jinitfields this)
        (JR/fset this :source @l_anyType))
  this)

(defn jnew_1 [p_anyType ]
  (let [o (JR/alloc 'AllBinaryEventObject)] (jinit_1 o p_anyType) o))

    
(defn jm_getSource_0 [this]
  (let []
        (JR/fget this :source)))

    
(defn jm_setSource_1 [this p_source]
  (let [ l_source (volatile! p_source)]
        (JR/fset this :source @l_source)))



