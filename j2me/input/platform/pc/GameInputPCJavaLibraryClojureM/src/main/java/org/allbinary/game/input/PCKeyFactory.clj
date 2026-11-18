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

(ns PCKeyFactory)

(JR/register 'PCKeyFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (PCKeyFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :keyEventWrapper nil)
  (JR/fset this :UNKNOWN nil)
  (JR/fset this :ENTER nil)
  (JR/fset this :_A nil)
  (JR/fset this :_B nil)
  (JR/fset this :_C nil)
  (JR/fset this :_D nil)
  (JR/fset this :_E nil)
  (JR/fset this :_F nil)
  (JR/fset this :_G nil)
  (JR/fset this :_H nil)
  (JR/fset this :_I nil)
  (JR/fset this :_J nil)
  (JR/fset this :_K nil)
  (JR/fset this :_L nil)
  (JR/fset this :_M nil)
  (JR/fset this :_N nil)
  (JR/fset this :_O nil)
  (JR/fset this :_P nil)
  (JR/fset this :_Q nil)
  (JR/fset this :_R nil)
  (JR/fset this :_S nil)
  (JR/fset this :_T nil)
  (JR/fset this :_U nil)
  (JR/fset this :_V nil)
  (JR/fset this :_W nil)
  (JR/fset this :_X nil)
  (JR/fset this :_Y nil)
  (JR/fset this :_Z nil)
  (JR/fset this :a nil)
  (JR/fset this :b nil)
  (JR/fset this :c nil)
  (JR/fset this :d nil)
  (JR/fset this :e nil)
  (JR/fset this :f nil)
  (JR/fset this :g nil)
  (JR/fset this :h nil)
  (JR/fset this :i nil)
  (JR/fset this :j nil)
  (JR/fset this :k nil)
  (JR/fset this :l nil)
  (JR/fset this :m nil)
  (JR/fset this :n nil)
  (JR/fset this :o nil)
  (JR/fset this :p nil)
  (JR/fset this :q nil)
  (JR/fset this :r nil)
  (JR/fset this :s nil)
  (JR/fset this :t nil)
  (JR/fset this :u nil)
  (JR/fset this :v nil)
  (JR/fset this :w nil)
  (JR/fset this :x nil)
  (JR/fset this :y nil)
  (JR/fset this :z nil)
  (JR/fset this :ZERO nil)
  (JR/fset this :ONE nil)
  (JR/fset this :TWO nil)
  (JR/fset this :THREE nil)
  (JR/fset this :FOUR nil)
  (JR/fset this :FIVE nil)
  (JR/fset this :SIX nil)
  (JR/fset this :SEVEN nil)
  (JR/fset this :EIGHT nil)
  (JR/fset this :NINE nil)
  (JR/fset this :DPAD_UP nil)
  (JR/fset this :DPAD_DOWN nil)
  (JR/fset this :DPAD_LEFT nil)
  (JR/fset this :DPAD_RIGHT nil)
  (JR/fset this :DPAD_UP2 nil)
  (JR/fset this :DPAD_DOWN2 nil)
  (JR/fset this :DPAD_LEFT2 nil)
  (JR/fset this :DPAD_RIGHT2 nil)
  (JR/fset this :COMMA nil)
  (JR/fset this :SPACE nil)
  (JR/fset this :DEL nil)
  (JR/fset this :STAR nil)
  (JR/fset this :QUESTION nil)
  (JR/fset this :PERIOD nil)
  (JR/fset this :ESCAPE nil)
  (JR/fset this :BACK_SPACE nil)
    (JR/fset this :keyEventWrapper (JR/scall 'ABKeyEventWrapper :jm_getInstance_0))
    (JR/fset this :UNKNOWN (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_UNDEFINED) "UNKNOWN"))
    (JR/fset this :ENTER (PCGameKey/jnew_2 5 "Enter"))
    (JR/fset this :_A (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_A) "A"))
    (JR/fset this :_B (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_B) "B"))
    (JR/fset this :_C (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_C) "C"))
    (JR/fset this :_D (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_D) "D"))
    (JR/fset this :_E (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_E) "E"))
    (JR/fset this :_F (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_F) "F"))
    (JR/fset this :_G (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_G) "G"))
    (JR/fset this :_H (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_H) "H"))
    (JR/fset this :_I (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_I) "I"))
    (JR/fset this :_J (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_J) "J"))
    (JR/fset this :_K (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_K) "K"))
    (JR/fset this :_L (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_L) "L"))
    (JR/fset this :_M (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_M) "M"))
    (JR/fset this :_N (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_N) "N"))
    (JR/fset this :_O (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_O) "O"))
    (JR/fset this :_P (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_P) "P"))
    (JR/fset this :_Q (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_Q) "Q"))
    (JR/fset this :_R (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_R) "R"))
    (JR/fset this :_S (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_S) "S"))
    (JR/fset this :_T (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_T) "T"))
    (JR/fset this :_U (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_U) "U"))
    (JR/fset this :_V (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_V) "V"))
    (JR/fset this :_W (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_W) "W"))
    (JR/fset this :_X (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_X) "X"))
    (JR/fset this :_Y (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_Y) "Y"))
    (JR/fset this :_Z (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_Z) "Z"))
    (JR/fset this :a (PCGameKey/jnew_2 97 "a"))
    (JR/fset this :b (PCGameKey/jnew_2 98 "b"))
    (JR/fset this :c (PCGameKey/jnew_2 99 "c"))
    (JR/fset this :d (PCGameKey/jnew_2 100 "d"))
    (JR/fset this :e (PCGameKey/jnew_2 101 "e"))
    (JR/fset this :f (PCGameKey/jnew_2 102 "f"))
    (JR/fset this :g (PCGameKey/jnew_2 103 "g"))
    (JR/fset this :h (PCGameKey/jnew_2 104 "h"))
    (JR/fset this :i (PCGameKey/jnew_2 105 "i"))
    (JR/fset this :j (PCGameKey/jnew_2 106 "j"))
    (JR/fset this :k (PCGameKey/jnew_2 107 "k"))
    (JR/fset this :l (PCGameKey/jnew_2 108 "l"))
    (JR/fset this :m (PCGameKey/jnew_2 109 "m"))
    (JR/fset this :n (PCGameKey/jnew_2 110 "n"))
    (JR/fset this :o (PCGameKey/jnew_2 111 "o"))
    (JR/fset this :p (PCGameKey/jnew_2 112 "p"))
    (JR/fset this :q (PCGameKey/jnew_2 113 "q"))
    (JR/fset this :r (PCGameKey/jnew_2 114 "r"))
    (JR/fset this :s (PCGameKey/jnew_2 115 "s"))
    (JR/fset this :t (PCGameKey/jnew_2 116 "t"))
    (JR/fset this :u (PCGameKey/jnew_2 117 "u"))
    (JR/fset this :v (PCGameKey/jnew_2 118 "v"))
    (JR/fset this :w (PCGameKey/jnew_2 119 "w"))
    (JR/fset this :x (PCGameKey/jnew_2 120 (JR/fget (JR/scall 'PositionStrings :jm_getInstance_0) :X)))
    (JR/fset this :y (PCGameKey/jnew_2 121 (JR/fget (JR/scall 'PositionStrings :jm_getInstance_0) :Y)))
    (JR/fset this :z (PCGameKey/jnew_2 122 "z"))
    (JR/fset this :ZERO (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_0) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :ZERO)))
    (JR/fset this :ONE (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_1) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :ONE)))
    (JR/fset this :TWO (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_2) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :TWO)))
    (JR/fset this :THREE (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_3) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :THREE)))
    (JR/fset this :FOUR (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_4) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :FOUR)))
    (JR/fset this :FIVE (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_5) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :FIVE)))
    (JR/fset this :SIX (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_6) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :SIX)))
    (JR/fset this :SEVEN (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_7) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :SEVEN)))
    (JR/fset this :EIGHT (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_8) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :EIGHT)))
    (JR/fset this :NINE (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_9) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :NINE)))
    (JR/fset this :DPAD_UP (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_UP) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :UP)))
    (JR/fset this :DPAD_DOWN (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_DOWN) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :DOWN)))
    (JR/fset this :DPAD_LEFT (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_LEFT) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :LEFT)))
    (JR/fset this :DPAD_RIGHT (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_RIGHT) (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :RIGHT)))
    (JR/fset this :DPAD_UP2 (JR/fget this :DPAD_UP))
    (JR/fset this :DPAD_DOWN2 (JR/fget this :DPAD_DOWN))
    (JR/fset this :DPAD_LEFT2 (JR/fget this :DPAD_LEFT))
    (JR/fset this :DPAD_RIGHT2 (JR/fget this :DPAD_RIGHT))
    (JR/fset this :COMMA (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_COMMA) "COMMA"))
    (JR/fset this :SPACE (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_SPACE) "SPACE"))
    (JR/fset this :DEL (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_DELETE) "DEL"))
    (JR/fset this :STAR (PCGameKey/jnew_2 42 (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :STAR)))
    (JR/fset this :QUESTION (PCGameKey/jnew_2 47 "?"))
    (JR/fset this :PERIOD (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_PERIOD) (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :PERIOD)))
    (JR/fset this :ESCAPE (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_ESCAPE) "Esc"))
    (JR/fset this :BACK_SPACE (PCGameKey/jnew_2 (JR/fget (JR/fget this :keyEventWrapper) :VK_BACK_SPACE) "Backspace"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PCKeyFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PCKeyFactory/jstatic_SINGLETON)))

    
(defn jm_isSubmission_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget this :ENTER))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isDelete_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget this :DEL))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isBackSpace_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget this :BACK_SPACE))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isUp_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (or (JR/eq @l_input (JR/fget this :DPAD_UP)) (JR/eq @l_input (JR/fget this :DPAD_UP2)))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isDown_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (or (JR/eq @l_input (JR/fget this :DPAD_DOWN)) (JR/eq @l_input (JR/fget this :DPAD_DOWN2)))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isLeft_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (or (JR/eq @l_input (JR/fget this :DPAD_LEFT)) (JR/eq @l_input (JR/fget this :DPAD_LEFT2)))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isRight_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (or (JR/eq @l_input (JR/fget this :DPAD_RIGHT)) (JR/eq @l_input (JR/fget this :DPAD_RIGHT2)))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isEnter_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget this :ENTER))
            (do
            (JR/jreturn true)))
        false)))



