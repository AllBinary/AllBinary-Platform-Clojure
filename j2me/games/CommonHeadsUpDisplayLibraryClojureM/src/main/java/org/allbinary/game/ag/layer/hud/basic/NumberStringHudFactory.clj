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
;; package org.allbinary.game.ag.layer.hud.basic

(ns NumberStringHudFactory)

(JR/register 'NumberStringHudFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/scall 'NullUtil :jm_getInstance_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NULL_NUMBER_STRING_HUD nil)
    (JR/fset this :NULL_NUMBER_STRING_HUD (JR/invoke this :jm_createHud_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NumberStringHudFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (NumberStringHudFactory/jstatic_instance) (JR/scall 'NullUtil :jm_getInstance_0))
            (do
            (NumberStringHudFactory/jstatic_set_instance (NumberStringHudFactory/jnew_0))))
        (NumberStringHudFactory/jstatic_instance)))

    
(defn jm_createHud_0 [this]
  (let [ l_logUtil (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (NumberStringHud/jnew_6 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) 9 (JR/fget (JR/scall 'BasicHudFactory :jm_getInstance_0) :ABSOLUTE) 1 0 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :NULL_COLOR))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke @l_logUtil :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :CONSTRUCTOR) @l_e)
            (JR/jthrow (new java.lang.RuntimeException))) :else (throw jt))))))))



