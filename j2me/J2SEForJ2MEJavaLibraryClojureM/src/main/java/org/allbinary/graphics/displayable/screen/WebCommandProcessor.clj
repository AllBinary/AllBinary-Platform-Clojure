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

(ns WebCommandProcessor)

(JR/register 'WebCommandProcessor nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (WebCommandProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :aboutCommandProcessor nil)
  (JR/fset this :list nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :aboutCommandProcessor (JR/scall 'AboutCommandProcessor :jm_getInstance_0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'WebCommandProcessor)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (WebCommandProcessor/jstatic_instance)))

    
(defn jm_process_3 [this p_midletCommandListener p_command p_canvas]
  (let [ l_midletCommandListener (volatile! p_midletCommandListener) l_command (volatile! p_command) l_canvas (volatile! p_canvas) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (if (and (java.awt.Desktop/isDesktopSupported) (JR/invoke (java.awt.Desktop/getDesktop) :jm_isSupported_1 java.awt.Desktop$Action/BROWSE))
                (do
                (JR/invoke (java.awt.Desktop/getDesktop) :jm_browse_1 (new java.net.URI (JR/invoke (JR/fget this :list) :jm_removeAt_1 0))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :PROCESS) @l_e)) :else (throw jt)))))))



