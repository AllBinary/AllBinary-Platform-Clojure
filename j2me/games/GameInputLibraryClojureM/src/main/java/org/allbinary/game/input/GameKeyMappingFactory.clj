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

(ns GameKeyMappingFactory)

(JR/register 'GameKeyMappingFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :intKeyToGameKey nil)
    (JR/fset this :intKeyToGameKey (JR/anew "Object" 1 (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX)))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (GameKeyMappingFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (GameKeyMappingFactory/jstatic_set_instance (GameKeyMappingFactory/jnew_0))))
        (GameKeyMappingFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_gameKeyFactory (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :NONE))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :UP))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :DOWN))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :LEFT))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :RIGHT))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_POUND))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_STAR))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM0))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM1))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM2))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM3))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM4))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM5))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM6))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM7))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM8))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :KEY_NUM9))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :GAME_A))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :GAME_B))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :GAME_C))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :GAME_D))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :FIRE))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :LEVEL_DOWN))
        (JR/invoke this :jm_setGameKey_1 (JR/fget @l_gameKeyFactory :LEVEL_UP)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameKeyMappingFactory)] (jinit_0 o) o))

    
(defn jm_getGameKey_1 [this p_key]
  (let [ l_key (volatile! p_key)]
        (JR/aget* (JR/fget this :intKeyToGameKey) @l_key)))

    
(defn jm_setGameKey_1 [this p_gameKey]
  (let [ l_gameKey (volatile! p_gameKey)]
        (JR/aset* (JR/fget this :intKeyToGameKey) (JR/invoke @l_gameKey :jm_getId_0) @l_gameKey)))



