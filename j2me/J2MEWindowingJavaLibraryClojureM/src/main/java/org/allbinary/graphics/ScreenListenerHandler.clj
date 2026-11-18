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

(ns ScreenListenerHandler)

(JR/register 'ScreenListenerHandler nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ScreenListenerHandler/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :screenListenerInterface nil)
    (JR/fset this :screenListenerInterface (ScreenEmptyListener/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ScreenListenerHandler)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ScreenListenerHandler/jstatic_instance)))

    
(defn jm_setListener_1 [this p_screenListenerInterface]
  (let [ l_screenListenerInterface (volatile! p_screenListenerInterface)]
        (JR/fset this :screenListenerInterface @l_screenListenerInterface)))

    
(defn jm_fireWithState_1 [this p_isFullScreen]
  (let [ l_isFullScreen (volatile! p_isFullScreen)]
        (JR/invoke (JR/fget this :screenListenerInterface) :jm_onFullScreen_1 @l_isFullScreen)))

    
(defn jm_fire_0 [this]
  (let []
        (JR/invoke (JR/fget this :screenListenerInterface) :jm_onFullScreenDisplay_0)))



