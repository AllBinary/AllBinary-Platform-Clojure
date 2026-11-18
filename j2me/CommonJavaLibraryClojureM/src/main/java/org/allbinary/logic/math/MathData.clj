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
;; package org.allbinary.logic.math

(ns MathData)

(JR/register 'MathData nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MathData/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EQUALS nil)
  (JR/fset this :PLUS nil)
  (JR/fset this :GREATER_THAN nil)
  (JR/fset this :MINUS nil)
  (JR/fset this :DIVIDE nil)
  (JR/fset this :MULTIPLY nil)
    (JR/fset this :PLUS "+")
    (JR/fset this :GREATER_THAN ">")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MathData/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_commonSeps (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/fset this :EQUALS (JR/fget @l_commonSeps :EQUALS))
        (JR/fset this :MINUS (JR/fget @l_commonSeps :DASH))
        (JR/fset this :DIVIDE (JR/fget @l_commonSeps :FORWARD_SLASH))
        (JR/fset this :MULTIPLY (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :STAR)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MathData)] (jinit_0 o) o))



