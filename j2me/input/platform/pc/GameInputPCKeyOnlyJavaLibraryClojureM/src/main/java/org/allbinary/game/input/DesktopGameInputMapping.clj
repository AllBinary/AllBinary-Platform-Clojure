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

(ns DesktopGameInputMapping)

(JR/register 'DesktopGameInputMapping 'PCGameInputMapping '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (PCGameInputMapping/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DesktopGameInputMapping)] (jinit_0 o) o))

    
(defn jm_getDefault_0 [this]
  (let []
        (JR/invoke (DesktopDefaultGameInputMapping/jnew_0) :jm_getInputMapping_0)))



