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
;; package org.allbinary.string

(ns CommonStateStrings)

(JR/register 'CommonStateStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CommonStateStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :CONTEXT nil)
  (JR/fset this :FINISH nil)
  (JR/fset this :CREATE nil)
  (JR/fset this :START nil)
  (JR/fset this :RESTART nil)
  (JR/fset this :RESUME nil)
  (JR/fset this :PAUSE nil)
  (JR/fset this :STOP nil)
  (JR/fset this :DESTROY nil)
  (JR/fset this :BIND nil)
  (JR/fset this :ON_SAVE_INSTANCE_STATE nil)
  (JR/fset this :ON_START_COMMAND nil)
    (JR/fset this :CONTEXT "Context: ")
    (JR/fset this :FINISH "finish")
    (JR/fset this :CREATE "onCreate")
    (JR/fset this :START "onStart")
    (JR/fset this :RESTART "onRestart")
    (JR/fset this :RESUME "onResume")
    (JR/fset this :PAUSE "onPause")
    (JR/fset this :STOP "onStop")
    (JR/fset this :DESTROY "onDestroy")
    (JR/fset this :BIND "onBind")
    (JR/fset this :ON_SAVE_INSTANCE_STATE "onSaveInstanceState")
    (JR/fset this :ON_START_COMMAND "onStartCommand")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CommonStateStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CommonStateStrings/jstatic_instance)))



