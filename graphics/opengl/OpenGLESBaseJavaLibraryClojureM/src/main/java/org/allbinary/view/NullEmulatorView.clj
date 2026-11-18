;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.view

(ns NullEmulatorView)

(JR/register 'NullEmulatorView nil '[EmulatorViewInterface])

(def jsv_NULL_EMULATOR_VIEW (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_EMULATOR_VIEW [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_EMULATOR_VIEW)
(defn jstatic_set_NULL_EMULATOR_VIEW [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_EMULATOR_VIEW v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_EMULATOR_VIEW (NullEmulatorView/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullEmulatorView)] (jinit_0 o) o))

    
(defn jm_setMidlet_1 [this p_midlet]
  (let [ l_midlet (volatile! p_midlet)]
        nil))

    
(defn jm_onEmulatorInitComplete_1 [this p_midletActivity]
  (let [ l_midletActivity (volatile! p_midletActivity)]
        nil))

    
(defn jm_onSetDisplayable_1 [this p_displayable]
  (let [ l_displayable (volatile! p_displayable)]
        nil))



