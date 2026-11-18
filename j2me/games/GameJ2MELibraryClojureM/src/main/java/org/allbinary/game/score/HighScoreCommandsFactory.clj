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
;; package org.allbinary.game.score

(ns HighScoreCommandsFactory)

(JR/register 'HighScoreCommandsFactory 'HighScoreCommandsBaseFactory '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (HighScoreCommandsFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (HighScoreCommandsFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
        (HighScoreCommandsBaseFactory/jinit_1 this (JR/afrom "Object" 1 [(JR/fget (JR/scall 'HighScoreCommands :jm_getInstance_0) :PERSONAL) (JR/fget (JR/scall 'HighScoreCommands :jm_getInstance_0) :WORLD)])) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'HighScoreCommandsFactory)] (jinit_0 o) o))



