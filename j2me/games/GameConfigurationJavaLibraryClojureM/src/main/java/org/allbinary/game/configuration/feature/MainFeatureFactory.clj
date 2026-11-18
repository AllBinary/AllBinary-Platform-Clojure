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
;; package org.allbinary.game.configuration.feature

(ns MainFeatureFactory)

(JR/register 'MainFeatureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MainFeatureFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :FULL_SCREEN nil)
  (JR/fset this :TITLE_BAR nil)
  (JR/fset this :STATIC nil)
  (JR/fset this :LOAD_ONDEMAND nil)
  (JR/fset this :LOAD_ALL nil)
    (JR/fset this :FULL_SCREEN (Feature/jnew_1 "Full Screen"))
    (JR/fset this :TITLE_BAR (Feature/jnew_1 "Title Bar"))
    (JR/fset this :STATIC (Feature/jnew_1 "Static Dependent Feature"))
    (JR/fset this :LOAD_ONDEMAND (Feature/jnew_1 "Load OnDemand"))
    (JR/fset this :LOAD_ALL (Feature/jnew_1 "Load All"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MainFeatureFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MainFeatureFactory/jstatic_instance)))



