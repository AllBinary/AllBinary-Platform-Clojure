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
;; package org.allbinary.logic.system.os

;;ActualPlatform
(ns SystemProperties)

(JR/register 'SystemProperties nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SystemProperties/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :OS_NAME nil)
  (JR/fset this :OS_ARCH nil)
  (JR/fset this :OS_VERSION nil)
  (JR/fset this :USER_HOME nil)
    (JR/fset this :OS_NAME "os.name")
    (JR/fset this :OS_ARCH "os.arch")
    (JR/fset this :OS_VERSION "os.version")
    (JR/fset this :USER_HOME "user.home")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SystemProperties/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'SystemProperties)] (jinit_0 o) o))

    
(defn jm_getName_0 [this]
  (let []
        (java.lang.System/getProperty (JR/fget this :OS_NAME))))

    
(defn jm_getArch_0 [this]
  (let []
        (java.lang.System/getProperty (JR/fget this :OS_ARCH))))

    
(defn jm_getVersion_0 [this]
  (let []
        (java.lang.System/getProperty (JR/fget this :OS_VERSION))))

    
(defn jm_getUserHomePath_0 [this]
  (let []
        (java.lang.System/getProperty (JR/fget this :USER_HOME))))



