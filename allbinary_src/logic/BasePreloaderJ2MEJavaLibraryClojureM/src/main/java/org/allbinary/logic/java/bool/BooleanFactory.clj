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
;; package org.allbinary.logic.java.bool

(ns BooleanFactory)

(JR/register 'BooleanFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BooleanFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :TRUE nil)
  (JR/fset this :FALSE nil)
  (JR/fset this :TRUE_STRING nil)
  (JR/fset this :FALSE_STRING nil)
  (JR/fset this :YES nil)
  (JR/fset this :NO nil)
    (JR/fset this :TRUE true)
    (JR/fset this :FALSE false)
    (JR/fset this :TRUE_STRING (JR/to-string-of (JR/fget this :TRUE)))
    (JR/fset this :FALSE_STRING (JR/to-string-of (JR/fget this :FALSE)))
    (JR/fset this :YES "yes")
    (JR/fset this :NO "no")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BooleanFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BooleanFactory/jstatic_instance)))

    
(defn jm_toStringb_1 [this p_bool]
  (let [ l_bool (volatile! p_bool)]
        (if @l_bool
            (do
            (JR/fget this :TRUE_STRING))
            (do
            (JR/fget this :FALSE_STRING)))))



