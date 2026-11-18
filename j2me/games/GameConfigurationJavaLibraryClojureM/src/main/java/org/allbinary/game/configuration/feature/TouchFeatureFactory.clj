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

(ns TouchFeatureFactory)

(JR/register 'TouchFeatureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TouchFeatureFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :TOUCH_ENABLED nil)
  (JR/fset this :SHOW_SCREEN_BUTTONS nil)
  (JR/fset this :AUTO_HIDE_SHOW_SCREEN_BUTTONS nil)
  (JR/fset this :HIDE_SCREEN_BUTTONS nil)
    (JR/fset this :TOUCH_ENABLED (TouchFeature/jnew_1 "Touch Enabled"))
    (JR/fset this :SHOW_SCREEN_BUTTONS (TouchFeature/jnew_1 "Show"))
    (JR/fset this :AUTO_HIDE_SHOW_SCREEN_BUTTONS (TouchFeature/jnew_1 "Auto Hide (One Level)"))
    (JR/fset this :HIDE_SCREEN_BUTTONS (TouchFeature/jnew_1 "Hide"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TouchFeatureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchFeatureFactory)] (jinit_0 o) o))



