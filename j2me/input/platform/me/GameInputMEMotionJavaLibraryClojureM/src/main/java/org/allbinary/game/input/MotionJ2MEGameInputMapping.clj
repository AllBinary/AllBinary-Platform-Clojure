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
;; package org.allbinary.game.input

(ns MotionJ2MEGameInputMapping)

(JR/register 'MotionJ2MEGameInputMapping 'J2MEGameInputMapping '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (J2MEGameInputMapping/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MotionJ2MEGameInputMapping)] (jinit_0 o) o))

    
(defn jm_getDefault_0 [this]
  (let []
        (JR/invoke (MotionJ2MEDefaultGameInputMapping/jnew_0) :jm_getInputMapping_0)))



