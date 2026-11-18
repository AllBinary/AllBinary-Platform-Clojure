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
;; package org.allbinary.game

(ns GameTypeFactory)

(JR/register 'GameTypeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NULL_GAME_TYPE_ARRAY nil)
  (JR/fset this :NONE nil)
  (JR/fset this :SINGLE_PLAYER nil)
  (JR/fset this :MULTI_PLAYER nil)
  (JR/fset this :BOT nil)
    (JR/fset this :NULL_GAME_TYPE_ARRAY (JR/anew "Object" 1 0))
    (JR/fset this :NONE (GameType/jnew_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING)))
    (JR/fset this :SINGLE_PLAYER (GameType/jnew_1 "Single Player"))
    (JR/fset this :MULTI_PLAYER (GameType/jnew_1 "Multi Player"))
    (JR/fset this :BOT (GameType/jnew_1 "Artificial Player"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameTypeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameTypeFactory/jstatic_instance)))



