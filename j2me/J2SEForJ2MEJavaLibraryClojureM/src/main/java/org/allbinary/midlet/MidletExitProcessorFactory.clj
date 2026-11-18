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
;; package org.allbinary.midlet

(ns MidletExitProcessorFactory)

(JR/register 'MidletExitProcessorFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MidletExitProcessorFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MidletExitProcessorFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MidletExitProcessorFactory/jstatic_instance)))

    
(defn jm_getExitInstance_1 [this p_midlet]
  (let [ l_midlet (volatile! p_midlet)]
        (if (or (JR/scall 'AppletUtil :jm_isAppletLoader_1 @l_midlet) (JR/scall 'J2MEUtil :jm_isJ2ME_0))
            (do
            (JR/scall 'Processor :jm_getInstance_0))
            (do
            (MidletExitProcessor/jnew_1 @l_midlet)))))



