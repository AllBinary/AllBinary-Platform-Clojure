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
;; package org.allbinary.canvas

(ns GameGlobalsFactory)

(JR/register 'GameGlobalsFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameGlobalsFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :newCanvas false)
  (JR/fset this :newDisplaybleTime 0)
  (JR/fset this :point nil)
    (JR/fset this :newCanvas true)
    (JR/fset this :newDisplaybleTime java.lang.Integer/MIN_VALUE)
    (JR/fset this :point (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameGlobalsFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameGlobalsFactory/jstatic_instance)))



