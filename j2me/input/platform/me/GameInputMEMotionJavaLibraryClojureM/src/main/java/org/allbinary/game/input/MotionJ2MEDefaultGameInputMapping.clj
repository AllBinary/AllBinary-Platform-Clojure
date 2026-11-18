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

(ns MotionJ2MEDefaultGameInputMapping)

(JR/register 'MotionJ2MEDefaultGameInputMapping 'PersistentInputMapping '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let [ l_inputToGameKeyMapping (volatile! nil) l_gameKeyFactory (volatile! nil) l_basicTouchInputFactory (volatile! nil)]
        (PersistentInputMapping/jinit_1 this (JR/fget (JR/scall 'GamePersistanceStrings :jm_getInstance_0) :DEFAULT_INPUT_MAPPING_RECORD_ID)) (jinitfields this)
        (vreset! l_inputToGameKeyMapping (JR/invoke this :jm_getInputMapping_0))
        (vreset! l_gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_gameKeyFactory :KEY_NUM2))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_gameKeyFactory :KEY_NUM4))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_gameKeyFactory :KEY_NUM6))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_gameKeyFactory :KEY_NUM8))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_gameKeyFactory :GAME_A))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM3) (JR/fget @l_gameKeyFactory :GAME_B))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM7) (JR/fget @l_gameKeyFactory :GAME_C))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM9) (JR/fget @l_gameKeyFactory :GAME_D))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEVEL_DOWN) (JR/fget @l_gameKeyFactory :LEVEL_DOWN))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEVEL_UP) (JR/fget @l_gameKeyFactory :LEVEL_UP))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_gameKeyFactory :UP))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_gameKeyFactory :DOWN))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_gameKeyFactory :LEFT))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_gameKeyFactory :RIGHT))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_POUND) (JR/fget @l_gameKeyFactory :KEY_POUND))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_STAR) (JR/fget @l_gameKeyFactory :KEY_STAR))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_gameKeyFactory :KEY_NUM1))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM3) (JR/fget @l_gameKeyFactory :KEY_NUM3))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM5) (JR/fget @l_gameKeyFactory :KEY_NUM5))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM7) (JR/fget @l_gameKeyFactory :KEY_NUM7))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM9) (JR/fget @l_gameKeyFactory :KEY_NUM9))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM0) (JR/fget @l_gameKeyFactory :KEY_NUM0))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_gameKeyFactory :FIRE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :UP))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :DOWN))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :LEFT))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :RIGHT))
        (vreset! l_basicTouchInputFactory (JR/scall 'BasicTouchInputFactory :jm_getInstance_0))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_basicTouchInputFactory :UP))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_basicTouchInputFactory :LEFT))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_basicTouchInputFactory :RIGHT))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_basicTouchInputFactory :DOWN))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM0) (JR/fget @l_basicTouchInputFactory :SPECIAL_BUTTON_FIVE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM7) (JR/fget @l_basicTouchInputFactory :SPECIAL_BUTTON_FOUR))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM9) (JR/fget @l_basicTouchInputFactory :SPECIAL_BUTTON_THREE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_basicTouchInputFactory :SPECIAL_BUTTON_TWO))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM3) (JR/fget @l_basicTouchInputFactory :SPECIAL_BUTTON_ONE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM2) (JR/fget @l_basicTouchInputFactory :SPECIAL_BUTTON_SIX)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MotionJ2MEDefaultGameInputMapping)] (jinit_0 o) o))



