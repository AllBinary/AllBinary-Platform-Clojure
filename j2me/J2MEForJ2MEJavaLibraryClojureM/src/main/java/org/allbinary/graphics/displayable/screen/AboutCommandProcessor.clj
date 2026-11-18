;;
;; AllBinary Open License Version 1
;; Copyright (c) 2022 AllBinary
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
;; package org.allbinary.graphics.displayable.screen

(ns AboutCommandProcessor)

(JR/register 'AboutCommandProcessor nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AboutCommandProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AboutCommandProcessor)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AboutCommandProcessor/jstatic_instance)))

    
(defn jm_process_3 [this p_midletCommandListener p_command p_canvas]
  (let [ l_midletCommandListener (volatile! p_midletCommandListener) l_command (volatile! p_command) l_canvas (volatile! p_canvas)]
        (JR/invoke @l_midletCommandListener :jm_commandAction_2 @l_command @l_canvas)))



