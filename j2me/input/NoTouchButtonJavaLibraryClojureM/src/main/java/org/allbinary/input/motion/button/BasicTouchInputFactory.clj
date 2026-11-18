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
;; package org.allbinary.input.motion.button

(ns BasicTouchInputFactory)

(JR/register 'BasicTouchInputFactory nil '[])

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
  (JR/fset this :logUtil nil)
  (JR/fset this :SPECIAL_BUTTON_SIX nil)
  (JR/fset this :SPECIAL_BUTTON_FIVE nil)
  (JR/fset this :SPECIAL_BUTTON_FOUR nil)
  (JR/fset this :SPECIAL_BUTTON_THREE nil)
  (JR/fset this :SPECIAL_BUTTON_TWO nil)
  (JR/fset this :SPECIAL_BUTTON_ONE nil)
  (JR/fset this :UP nil)
  (JR/fset this :LEFT nil)
  (JR/fset this :RIGHT nil)
  (JR/fset this :DOWN nil)
  (JR/fset this :NONE nil)
  (JR/fset this :initialized false)
  (JR/fset this :list nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :SPECIAL_BUTTON_SIX (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 30)) "Button 6"))
    (JR/fset this :SPECIAL_BUTTON_FIVE (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 31)) "Button 5"))
    (JR/fset this :SPECIAL_BUTTON_FOUR (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 32)) "Button 4"))
    (JR/fset this :SPECIAL_BUTTON_THREE (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 33)) "Button 3"))
    (JR/fset this :SPECIAL_BUTTON_TWO (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 34)) "Button 2"))
    (JR/fset this :SPECIAL_BUTTON_ONE (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 35)) "Button 1"))
    (JR/fset this :UP (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 36)) "Up Button"))
    (JR/fset this :LEFT (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 37)) "Left Button"))
    (JR/fset this :RIGHT (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 38)) "Right Button"))
    (JR/fset this :DOWN (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 39)) "Down Button"))
    (JR/fset this :NONE (TouchButtonInput/jnew_2 (unchecked-int (unchecked-subtract (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX) 40)) "No Button"))
    (JR/fset this :initialized false)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicTouchInputFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (BasicTouchInputFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (BasicTouchInputFactory/jstatic_set_instance (BasicTouchInputFactory/jnew_0))))
        (BasicTouchInputFactory/jstatic_instance)))

    
(defn jm_init_1 [this p_inputToGameKeyMapping]
  (let [ l_inputToGameKeyMapping (volatile! p_inputToGameKeyMapping)]
        (if (not (JR/fget this :initialized))
            (do
            (JR/fset this :initialized true)
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :UP))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :LEFT))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :RIGHT))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :DOWN))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :SPECIAL_BUTTON_TWO))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :SPECIAL_BUTTON_FOUR))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :SPECIAL_BUTTON_THREE))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :SPECIAL_BUTTON_ONE))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :SPECIAL_BUTTON_FIVE))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :SPECIAL_BUTTON_SIX))
            (JR/invoke this :jm_updateAllList_2 (JR/fget this :list) @l_inputToGameKeyMapping)))))

    
(defn jm_updateAll_1 [this p_inputToGameKeyMapping]
  (let [ l_inputToGameKeyMapping (volatile! p_inputToGameKeyMapping)]
        (JR/invoke this :jm_updateAllList_2 (JR/invoke this :jm_getList_0) @l_inputToGameKeyMapping)))

    
(defn jm_updateAllList_2 [this p_list p_inputToGameKeyMapping]
  (let [ l_list (volatile! p_list) l_inputToGameKeyMapping (volatile! p_inputToGameKeyMapping) l_touchButtonInput (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START)) :jm_appendint_1 (JR/invoke @l_list :jm_size_0))) this "updateAll")
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke @l_list :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_touchButtonInput (JR/invoke @l_list :jm_get_1 @l_index))
            (JR/invoke @l_touchButtonInput :jm_update_1 @l_inputToGameKeyMapping)))))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :list)))



