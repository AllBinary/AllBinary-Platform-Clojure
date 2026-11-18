;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form

(ns ScreenInfo)

(JR/register 'ScreenInfo nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ScreenInfo/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SMALL_WIDTH 0)
  (JR/fset this :SMALL_HEIGHT 0)
  (JR/fset this :MEDIUM_WIDTH 0)
  (JR/fset this :MEDIUM_HEIGHT 0)
    (JR/fset this :SMALL_WIDTH 320)
    (JR/fset this :SMALL_HEIGHT 240)
    (JR/fset this :MEDIUM_WIDTH 800)
    (JR/fset this :MEDIUM_HEIGHT 600)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ScreenInfo)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ScreenInfo/jstatic_instance)))



