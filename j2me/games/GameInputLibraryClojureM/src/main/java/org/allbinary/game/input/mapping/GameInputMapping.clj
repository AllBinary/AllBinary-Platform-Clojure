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
;; package org.allbinary.game.input.mapping

(ns GameInputMapping)

(JR/register 'GameInputMapping nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :gameKey nil)
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :gameKey (JR/sget 'GameKey "NULL_GAME_KEY"))
  this)

    
(defn jinit_2 [this p_name p_gameKey]
  (let [ l_name (volatile! p_name) l_gameKey (volatile! p_gameKey)]
    nil (jinitfields this)
        (JR/invoke this :jm_setName_1 @l_name)
        (JR/invoke this :jm_setGameKey_1 @l_gameKey))
  this)

(defn jnew_2 [p_name p_gameKey ]
  (let [o (JR/alloc 'GameInputMapping)] (jinit_2 o p_name p_gameKey) o))

    
(defn jm_setGameKey_1 [this p_gameKey]
  (let [ l_gameKey (volatile! p_gameKey)]
        (JR/fset this :gameKey @l_gameKey)))

    
(defn jm_getGameKey_0 [this]
  (let []
        (JR/fget this :gameKey)))

    
(defn jm_setName_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/fset this :name @l_name)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))



