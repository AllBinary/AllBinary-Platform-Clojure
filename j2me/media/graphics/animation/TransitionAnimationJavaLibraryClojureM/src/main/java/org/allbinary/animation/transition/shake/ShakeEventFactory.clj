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
;; package org.allbinary.animation.transition.shake

(ns ShakeEventFactory)

(JR/register 'ShakeEventFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ShakeEventFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :MICRO nil)
  (JR/fset this :SMALL nil)
  (JR/fset this :MEDIUM nil)
  (JR/fset this :LARGE nil)
    (JR/fset this :MICRO (ShakeEvent/jnew_0))
    (JR/fset this :SMALL (ShakeEvent/jnew_0))
    (JR/fset this :MEDIUM (ShakeEvent/jnew_0))
    (JR/fset this :LARGE (ShakeEvent/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ShakeEventFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ShakeEventFactory/jstatic_instance)))

    
(defn jm_init_0 [this]
  (let []
        nil))



