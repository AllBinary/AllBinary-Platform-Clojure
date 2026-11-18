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

(ns CurrentlyPressedTouchButtonSingletonDebug)

(JR/register 'CurrentlyPressedTouchButtonSingletonDebug 'CurrentlyPressedTouchButtonSingleton '[])

(def jsv_instanceC (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instanceC [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceC)
(defn jstatic_set_instanceC [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceC v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instanceC (CurrentlyPressedTouchButtonSingletonDebug/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :string nil)
  (JR/fset this :listString nil)
  (JR/fset this :appendText nil)
  (JR/fset this :PRESSED_AND_FIRED nil)
  (JR/fset this :PRESSED_AND_NOT_FIRED nil)
  (JR/fset this :ASSOCIATED_RELEASED_AND_FIRED nil)
  (JR/fset this :RELEASED_AND_FIRED nil)
  (JR/fset this :RELEASED_AND_FIRED_2 nil)
  (JR/fset this :RELEASED_AND_NOT_FIRED nil)
    (JR/fset this :string (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :listString (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :appendText (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :PRESSED_AND_FIRED "pressed & fired")
    (JR/fset this :PRESSED_AND_NOT_FIRED "pressed in button but not fired")
    (JR/fset this :ASSOCIATED_RELEASED_AND_FIRED "assoc. rel & fired")
    (JR/fset this :RELEASED_AND_FIRED "rel & fired 1")
    (JR/fset this :RELEASED_AND_FIRED_2 "rel & fired 2")
    (JR/fset this :RELEASED_AND_NOT_FIRED "rel & not fired")
  this)

(defn jinit_0 [this]
  (CurrentlyPressedTouchButtonSingleton/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CurrentlyPressedTouchButtonSingletonDebug)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CurrentlyPressedTouchButtonSingletonDebug/jstatic_instanceC)))

    
(defn jm_appendTouchButtonInput_2 [this p_append p_touchButtonInput]
  (let [ l_append (volatile! p_append) l_touchButtonInput (volatile! p_touchButtonInput) l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of @l_touchButtonInput))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 @l_append)
        (JR/fset this :appendText (JR/to-string-of @l_stringBuffer))
        (JR/fset this :string (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :listString)) :jm_append_1 (JR/fget this :appendText))))))

    
(defn jm_append_1 [this p_append]
  (let [ l_append (volatile! p_append)]
        (JR/fset this :appendText (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :appendText)) :jm_append_1 @l_append)))
        (JR/fset this :string (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :listString)) :jm_append_1 (JR/fget this :appendText))))))

    
(defn jm_clearLog_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/fset this :appendText (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/scall 'GPoint :jm_toStringStatic_3 @l_x @l_y 0)) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))))
        (JR/fset this :string (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :listString)) :jm_append_1 (JR/fget this :appendText))))))

    
(defn jm_releaseAndNotFired_0 [this]
  (let []
        (JR/invoke this :jm_append_1 (JR/fget this :RELEASED_AND_NOT_FIRED))))

    
(defn jm_releaseAndFired_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke this :jm_appendTouchButtonInput_2 (JR/fget this :RELEASED_AND_FIRED) @l_touchButtonInput)))

    
(defn jm_releaseAndFired2_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke this :jm_appendTouchButtonInput_2 (JR/fget this :RELEASED_AND_FIRED_2) @l_touchButtonInput)))

    
(defn jm_releaseAndFiredAssociated_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke this :jm_appendTouchButtonInput_2 (JR/fget this :ASSOCIATED_RELEASED_AND_FIRED) @l_touchButtonInput)))

    
(defn jm_pressedAndFired_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke this :jm_appendTouchButtonInput_2 (JR/fget this :PRESSED_AND_FIRED) @l_touchButtonInput)))

    
(defn jm_pressedAndNotFired_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke this :jm_appendTouchButtonInput_2 (JR/fget this :PRESSED_AND_NOT_FIRED) @l_touchButtonInput)))

    
(defn jm_removeAt_1 [this p_index]
  (let [ l_index (volatile! p_index) l_touchButtonInput (volatile! nil)]
        (vreset! l_touchButtonInput (JR/invoke-super 'CurrentlyPressedTouchButtonSingleton this :jm_removeAt_1 @l_index))
        (JR/fset this :listString (JR/to-string-of (JR/fget this :list)))
        (JR/fset this :string (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :listString)) :jm_append_1 (JR/fget this :appendText))))
        @l_touchButtonInput))

    
(defn jm_remove_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput) l_isRemoved (volatile! nil)]
        (vreset! l_isRemoved (JR/invoke-super 'CurrentlyPressedTouchButtonSingleton this :jm_remove_1 @l_touchButtonInput))
        (JR/fset this :listString (JR/to-string-of (JR/fget this :list)))
        (JR/fset this :string (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :listString)) :jm_append_1 (JR/fget this :appendText))))
        @l_isRemoved))

    
(defn jm_add_1 [this p_touchButtonInput]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput)]
        (JR/invoke-super 'CurrentlyPressedTouchButtonSingleton this :jm_add_1 @l_touchButtonInput)
        (JR/fset this :listString (JR/to-string-of (JR/fget this :list)))
        (JR/fset this :string (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :listString)) :jm_append_1 (JR/fget this :appendText))))))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget this :string)))



