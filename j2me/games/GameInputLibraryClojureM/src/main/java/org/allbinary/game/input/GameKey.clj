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

(ns GameKey)

(JR/register 'GameKey 'Input '[])

(def jsv_NULL_GAME_KEY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_GAME_KEY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_GAME_KEY)
(defn jstatic_set_NULL_GAME_KEY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_GAME_KEY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_GAME_KEY (GameKey/jnew_2 (unchecked-int (unchecked-negate (JR/c2i 1))) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING)))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_key p_name]
  (let [ l_key (volatile! p_key) l_name (volatile! p_name)]
        (Input/jinit_2 this @l_key @l_name) (jinitfields this))
  this)

(defn jnew_2 [p_key p_name ]
  (let [o (JR/alloc 'GameKey)] (jinit_2 o p_key p_name) o))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "GameKey ") :jm_append_1 (JR/to-string-of this)))))



