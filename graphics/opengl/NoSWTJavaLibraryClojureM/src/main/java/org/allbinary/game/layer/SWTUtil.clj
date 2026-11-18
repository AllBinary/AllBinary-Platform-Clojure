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
;; package org.allbinary.game.layer

(ns SWTUtil)

(JR/register 'SWTUtil nil '[])

(def jsv_isSWT (atom false))
(def jsv_SWT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_isSWT [] (JR/ensure-init jclinit-state jclinit) @jsv_isSWT)
(defn jstatic_set_isSWT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_isSWT v))
(defn jstatic_SWT [] (JR/ensure-init jclinit-state jclinit) @jsv_SWT)
(defn jstatic_set_SWT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SWT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_isSWT false)
    (reset! jsv_SWT "SWT")
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'SWTUtil)] (jinit_0 o) o))



