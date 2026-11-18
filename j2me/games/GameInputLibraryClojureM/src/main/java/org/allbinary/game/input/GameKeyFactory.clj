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

(ns GameKeyFactory)

(JR/register 'GameKeyFactory nil '[])

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
  (JR/fset this :NONE nil)
  (JR/fset this :UP nil)
  (JR/fset this :DOWN nil)
  (JR/fset this :LEFT nil)
  (JR/fset this :RIGHT nil)
  (JR/fset this :KEY_POUND nil)
  (JR/fset this :KEY_STAR nil)
  (JR/fset this :KEY_NUM0 nil)
  (JR/fset this :KEY_NUM1 nil)
  (JR/fset this :KEY_NUM2 nil)
  (JR/fset this :KEY_NUM3 nil)
  (JR/fset this :KEY_NUM4 nil)
  (JR/fset this :KEY_NUM5 nil)
  (JR/fset this :KEY_NUM6 nil)
  (JR/fset this :KEY_NUM7 nil)
  (JR/fset this :KEY_NUM8 nil)
  (JR/fset this :KEY_NUM9 nil)
  (JR/fset this :GAME_A nil)
  (JR/fset this :GAME_B nil)
  (JR/fset this :GAME_C nil)
  (JR/fset this :GAME_D nil)
  (JR/fset this :FIRE nil)
  (JR/fset this :LEVEL_DOWN nil)
  (JR/fset this :LEVEL_UP nil)
    (JR/fset this :NONE (GameKey/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 1)) "None"))
    (JR/fset this :UP (GameKey/jnew_2 (JR/sget 'Canvas "UP") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :UP)))
    (JR/fset this :DOWN (GameKey/jnew_2 (JR/sget 'Canvas "DOWN") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :DOWN)))
    (JR/fset this :LEFT (GameKey/jnew_2 (JR/sget 'Canvas "LEFT") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :LEFT)))
    (JR/fset this :RIGHT (GameKey/jnew_2 (JR/sget 'Canvas "RIGHT") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :RIGHT)))
    (JR/fset this :KEY_POUND (GameKey/jnew_2 (JR/sget 'Canvas "KEY_POUND") "POUND"))
    (JR/fset this :KEY_STAR (GameKey/jnew_2 (JR/sget 'Canvas "KEY_STAR") "STAR"))
    (JR/fset this :KEY_NUM0 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM0") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :ZERO)))
    (JR/fset this :KEY_NUM1 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM1") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :ONE)))
    (JR/fset this :KEY_NUM2 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM2") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :TWO)))
    (JR/fset this :KEY_NUM3 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM3") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :THREE)))
    (JR/fset this :KEY_NUM4 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM4") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :FOUR)))
    (JR/fset this :KEY_NUM5 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM5") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :FIVE)))
    (JR/fset this :KEY_NUM6 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM6") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :SIX)))
    (JR/fset this :KEY_NUM7 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM7") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :SEVEN)))
    (JR/fset this :KEY_NUM8 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM8") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :EIGHT)))
    (JR/fset this :KEY_NUM9 (GameKey/jnew_2 (JR/sget 'Canvas "KEY_NUM9") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :NINE)))
    (JR/fset this :GAME_A (GameKey/jnew_2 (JR/sget 'Canvas "GAME_A") "Game A"))
    (JR/fset this :GAME_B (GameKey/jnew_2 (JR/sget 'Canvas "GAME_B") "Game B"))
    (JR/fset this :GAME_C (GameKey/jnew_2 (JR/sget 'Canvas "GAME_C") "Game C"))
    (JR/fset this :GAME_D (GameKey/jnew_2 (JR/sget 'Canvas "GAME_D") "Game D"))
    (JR/fset this :FIRE (GameKey/jnew_2 (JR/sget 'Canvas "FIRE") (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :FIRE)))
    (JR/fset this :LEVEL_DOWN (GameKey/jnew_2 (+ (JR/sget 'Canvas "KEY_NUM9") 1) "Cheat Level Up"))
    (JR/fset this :LEVEL_UP (GameKey/jnew_2 (+ (JR/sget 'Canvas "KEY_NUM9") 2) "Cheat Level Down"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameKeyFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (GameKeyFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (GameKeyFactory/jstatic_set_instance (GameKeyFactory/jnew_0))))
        (GameKeyFactory/jstatic_instance)))



