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
;; package org.allbinary.input.motion

(ns AllMotionRecognizer)

(JR/register 'AllMotionRecognizer nil '[])

(def jsv_index (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_index [] (JR/ensure-init jclinit-state jclinit) @jsv_index)
(defn jstatic_set_index [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_index v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_index 0)
    nil))

(defn jinitfields [this]
  (JR/fset this :id 0)
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :id (JR/ginc (fn [] (AllMotionRecognizer/jstatic_index)) (fn [v] (AllMotionRecognizer/jstatic_set_index v)) 1 :int true)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllMotionRecognizer)] (jinit_0 o) o))

    
(defn jm_processStartMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers)]
        nil))

    
(defn jm_processEndMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers)]
        nil))

    
(defn jm_processDraggedMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers)]
        nil))

    
(defn jm_processMovedMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers)]
        nil))

    
(defn jm_processScrolledMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers)]
        nil))

    
(defn jm_getId_0 [this]
  (let []
        (JR/fget this :id)))



