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
;; package org.allbinary.game.midlet

(ns LicenseLoadingTypeFactory)

(JR/register 'LicenseLoadingTypeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LicenseLoadingTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :INITIAL_LOADING nil)
  (JR/fset this :GAME_START nil)
  (JR/fset this :LOGIN nil)
  (JR/fset this :OTHER nil)
    (JR/fset this :INITIAL_LOADING (LicenseLoadingType/jnew_1 "Initial Loading"))
    (JR/fset this :GAME_START (LicenseLoadingType/jnew_1 "Game Start"))
    (JR/fset this :LOGIN (LicenseLoadingType/jnew_1 "Login"))
    (JR/fset this :OTHER (LicenseLoadingType/jnew_1 "Other/Usually The First Non Demo Level"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LicenseLoadingTypeFactory)] (jinit_0 o) o))

    
(defn jm_getIntance_0 []
  (let [this nil]
        (LicenseLoadingTypeFactory/jstatic_instance)))



