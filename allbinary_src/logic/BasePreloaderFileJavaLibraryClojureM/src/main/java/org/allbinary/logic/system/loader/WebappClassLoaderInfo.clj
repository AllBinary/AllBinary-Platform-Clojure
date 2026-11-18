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
;; package org.allbinary.logic.system.loader

(ns WebappClassLoaderInfo)

(JR/register 'WebappClassLoaderInfo nil '[])

(def jsv_classLoader (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_classLoader [] (JR/ensure-init jclinit-state jclinit) @jsv_classLoader)
(defn jstatic_set_classLoader [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_classLoader v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_classLoader (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'WebappClassLoaderInfo)] (jinit_0 o) o))

    
(defn jm_setLoader_1 [p_classLoader]
  (let [this nil l_classLoader (volatile! p_classLoader)]
        (WebappClassLoaderInfo/jstatic_set_classLoader @l_classLoader)))

    
(defn jm_getLoader_0 []
  (let [this nil]
        (WebappClassLoaderInfo/jstatic_classLoader)))



