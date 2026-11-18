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
;; package org.allbinary.graphics.displayable

(ns GameTickDisplayInfoSingleton)

(JR/register 'GameTickDisplayInfoSingleton nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameTickDisplayInfoSingleton/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :lastWidth 0)
  (JR/fset this :lastHeight 0)
  (JR/fset this :lastHalfWidth 0)
  (JR/fset this :lastHalfHeight 0)
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :lastWidth (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0))
    (JR/fset this :lastHeight (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHeight_0))
    (JR/fset this :lastHalfWidth (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfWidth_0))
    (JR/fset this :lastHalfHeight (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfHeight_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameTickDisplayInfoSingleton)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameTickDisplayInfoSingleton/jstatic_instance)))

    
(defn jm_update_0 [this]
  (let []
        (JR/fset this :lastWidth (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0))
        (JR/fset this :lastHeight (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHeight_0))
        (JR/fset this :lastHalfWidth (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfWidth_0))
        (JR/fset this :lastHalfHeight (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfHeight_0))))

    
(defn jm_getLastWidth_0 [this]
  (let []
        (JR/fget this :lastWidth)))

    
(defn jm_getLastHeight_0 [this]
  (let []
        (JR/fget this :lastHeight)))

    
(defn jm_getLastHalfWidth_0 [this]
  (let []
        (JR/fget this :lastHalfWidth)))

    
(defn jm_getLastHalfHeight_0 [this]
  (let []
        (JR/fget this :lastHalfHeight)))



