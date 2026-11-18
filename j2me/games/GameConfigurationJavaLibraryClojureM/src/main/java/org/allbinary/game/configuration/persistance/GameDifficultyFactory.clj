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
;; package org.allbinary.game.configuration.persistance

(ns GameDifficultyFactory)

(JR/register 'GameDifficultyFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameDifficultyFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :level 0)
    (JR/fset this :level 0)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameDifficultyFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameDifficultyFactory/jstatic_instance)))

    
(defn jm_setLevel_1 [this p_level]
  (let [ l_level (volatile! p_level)]
        (JR/fset this :level @l_level)))

    
(defn jm_getLevel_0 [this]
  (let []
        (JR/fget this :level)))



