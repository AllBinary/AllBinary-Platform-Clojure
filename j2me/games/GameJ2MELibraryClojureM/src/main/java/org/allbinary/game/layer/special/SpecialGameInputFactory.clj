;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.game.layer.special

(ns SpecialGameInputFactory)

(JR/register 'SpecialGameInputFactory nil '[])

(def jsv_NO_SPECIAL_GAME_INPUT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NO_SPECIAL_GAME_INPUT [] (JR/ensure-init jclinit-state jclinit) @jsv_NO_SPECIAL_GAME_INPUT)
(defn jstatic_set_NO_SPECIAL_GAME_INPUT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NO_SPECIAL_GAME_INPUT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NO_SPECIAL_GAME_INPUT (SpecialGameInput/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'SpecialGameInputFactory)] (jinit_0 o) o))



