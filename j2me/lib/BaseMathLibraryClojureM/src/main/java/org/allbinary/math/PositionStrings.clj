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
;; package org.allbinary.math

(ns PositionStrings)

(JR/register 'PositionStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PositionStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :X nil)
  (JR/fset this :Y nil)
  (JR/fset this :X_LABEL nil)
  (JR/fset this :Y_LABEL nil)
  (JR/fset this :Z_LABEL nil)
  (JR/fset this :DX_LABEL nil)
  (JR/fset this :DY_LABEL nil)
  (JR/fset this :DZ_LABEL nil)
    (JR/fset this :X "x")
    (JR/fset this :Y "y")
    (JR/fset this :X_LABEL "x: ")
    (JR/fset this :Y_LABEL "y: ")
    (JR/fset this :Z_LABEL "z: ")
    (JR/fset this :DX_LABEL "dx: ")
    (JR/fset this :DY_LABEL "dy: ")
    (JR/fset this :DZ_LABEL "dz: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PositionStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PositionStrings/jstatic_instance)))



