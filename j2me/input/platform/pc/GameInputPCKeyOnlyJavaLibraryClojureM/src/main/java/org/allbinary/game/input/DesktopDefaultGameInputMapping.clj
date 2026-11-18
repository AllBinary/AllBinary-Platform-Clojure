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

(ns DesktopDefaultGameInputMapping)

(JR/register 'DesktopDefaultGameInputMapping 'PersistentInputMapping '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let [ l_inputToGameKeyMapping (volatile! nil) l_pcKeyFactory (volatile! nil) l_gameKeyFactory (volatile! nil)]
        (PersistentInputMapping/jinit_1 this (JR/fget (JR/scall 'GamePersistanceStrings :jm_getInstance_0) :DEFAULT_INPUT_MAPPING_RECORD_ID)) (jinitfields this)
        (vreset! l_inputToGameKeyMapping (JR/invoke this :jm_getInputMapping_0))
        (vreset! l_pcKeyFactory (JR/scall 'PCKeyFactory :jm_getInstance_0))
        (vreset! l_gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :FIRE) (JR/fget @l_pcKeyFactory :ENTER))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_pcKeyFactory :FOUR))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_pcKeyFactory :_P))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_pcKeyFactory :p))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_pcKeyFactory :DPAD_UP))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_pcKeyFactory :DPAD_DOWN))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_pcKeyFactory :DPAD_LEFT))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_pcKeyFactory :DPAD_RIGHT))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_pcKeyFactory :FIVE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM7) (JR/fget @l_pcKeyFactory :_Y))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM9) (JR/fget @l_pcKeyFactory :_I))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_pcKeyFactory :_U))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_pcKeyFactory :_H))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_pcKeyFactory :_J))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_pcKeyFactory :_N))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM5) (JR/fget @l_pcKeyFactory :_M))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM7) (JR/fget @l_pcKeyFactory :y))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM9) (JR/fget @l_pcKeyFactory :i))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_pcKeyFactory :u))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_pcKeyFactory :h))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_pcKeyFactory :j))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_pcKeyFactory :n))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM5) (JR/fget @l_pcKeyFactory :m))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM7) (JR/fget @l_pcKeyFactory :_Q))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM9) (JR/fget @l_pcKeyFactory :_E))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_pcKeyFactory :_W))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_pcKeyFactory :_A))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_pcKeyFactory :_D))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_pcKeyFactory :_S))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM5) (JR/fget @l_pcKeyFactory :_X))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM7) (JR/fget @l_pcKeyFactory :q))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM9) (JR/fget @l_pcKeyFactory :e))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_pcKeyFactory :w))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_pcKeyFactory :a))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_pcKeyFactory :d))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_pcKeyFactory :s))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM5) (JR/fget @l_pcKeyFactory :x))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM3) (JR/fget @l_pcKeyFactory :THREE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM0) (JR/fget @l_pcKeyFactory :ZERO))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM0) (JR/fget @l_pcKeyFactory :ONE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM0) (JR/fget @l_pcKeyFactory :SPACE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_POUND) (JR/fget @l_pcKeyFactory :DEL))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_POUND) (JR/fget @l_pcKeyFactory :TWO))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_STAR) (JR/fget @l_pcKeyFactory :ESCAPE))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_STAR) (JR/fget @l_pcKeyFactory :STAR))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEVEL_DOWN) (JR/fget @l_pcKeyFactory :COMMA))
        (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEVEL_UP) (JR/fget @l_pcKeyFactory :PERIOD)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DesktopDefaultGameInputMapping)] (jinit_0 o) o))



