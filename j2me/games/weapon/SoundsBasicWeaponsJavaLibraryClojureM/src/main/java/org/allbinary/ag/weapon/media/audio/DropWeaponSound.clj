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
;; package org.allbinary.ag.weapon.media.audio

(ns DropWeaponSound)

(JR/register 'DropWeaponSound 'CompositeSound '[])

(def jsv_soundInterface (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_soundInterface [] (JR/ensure-init jclinit-state jclinit) @jsv_soundInterface)
(defn jstatic_set_soundInterface [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_soundInterface v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_soundInterface (DropWeaponSound/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (CompositeSound/jinit_1 this "resource:/wav/mine.wav") (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DropWeaponSound)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DropWeaponSound/jstatic_soundInterface)))



