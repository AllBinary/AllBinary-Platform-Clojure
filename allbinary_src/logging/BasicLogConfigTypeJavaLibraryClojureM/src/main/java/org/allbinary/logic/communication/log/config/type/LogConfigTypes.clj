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
;; package org.allbinary.logic.communication.log.config.type

(ns LogConfigTypes)

(JR/register 'LogConfigTypes nil '[])

(def jsv_LOGGING (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_LOGGING [] (JR/ensure-init jclinit-state jclinit) @jsv_LOGGING)
(defn jstatic_set_LOGGING [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_LOGGING v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_LOGGING (BasicArrayListD/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LogConfigTypes)] (jinit_0 o) o))



