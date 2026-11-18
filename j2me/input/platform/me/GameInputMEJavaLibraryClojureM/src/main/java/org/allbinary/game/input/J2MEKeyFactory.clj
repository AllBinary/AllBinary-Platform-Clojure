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

(ns J2MEKeyFactory)

(JR/register 'J2MEKeyFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (J2MEKeyFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :gameKeyFactory nil)
    (JR/fset this :gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (J2MEKeyFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'J2MEKeyFactory)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let [ l_gameKeyArray (volatile! nil) l_inputFactory (volatile! nil) l_index (volatile! nil)]
        (vreset! l_gameKeyArray (JR/afrom "Object" 1 [(JR/fget (JR/fget this :gameKeyFactory) :DOWN) (JR/fget (JR/fget this :gameKeyFactory) :FIRE) (JR/fget (JR/fget this :gameKeyFactory) :GAME_A) (JR/fget (JR/fget this :gameKeyFactory) :GAME_B) (JR/fget (JR/fget this :gameKeyFactory) :GAME_C) (JR/fget (JR/fget this :gameKeyFactory) :GAME_D) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM0) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM1) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM2) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM3) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM4) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM5) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM6) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM7) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM8) (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM9) (JR/fget (JR/fget this :gameKeyFactory) :KEY_POUND) (JR/fget (JR/fget this :gameKeyFactory) :KEY_STAR) (JR/fget (JR/fget this :gameKeyFactory) :LEFT) (JR/fget (JR/fget this :gameKeyFactory) :LEVEL_DOWN) (JR/fget (JR/fget this :gameKeyFactory) :LEVEL_UP) (JR/fget (JR/fget this :gameKeyFactory) :NONE) (JR/fget (JR/fget this :gameKeyFactory) :RIGHT) (JR/fget (JR/fget this :gameKeyFactory) :UP)]))
        (vreset! l_inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
        (do (vreset! l_index (JR/alen @l_gameKeyArray))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke @l_inputFactory :jm_add_2 (JR/invoke (JR/aget* @l_gameKeyArray @l_index) :jm_getId_0) (JR/aget* @l_gameKeyArray @l_index))))))

    
(defn jm_isSubmission_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget (JR/fget this :gameKeyFactory) :FIRE))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isDelete_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget (JR/fget this :gameKeyFactory) :GAME_D))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isBackSpace_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        false))

    
(defn jm_isUp_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget (JR/fget this :gameKeyFactory) :UP))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isDown_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget (JR/fget this :gameKeyFactory) :DOWN))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isLeft_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget (JR/fget this :gameKeyFactory) :LEFT))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isRight_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget (JR/fget this :gameKeyFactory) :RIGHT))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isEnter_1 [this p_input]
  (let [ l_input (volatile! p_input)](JR/method
        (if (JR/eq @l_input (JR/fget (JR/fget this :gameKeyFactory) :FIRE))
            (do
            (JR/jreturn true)))
        false)))



