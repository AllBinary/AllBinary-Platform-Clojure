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

(ns ReleaseHelper)

(JR/register 'ReleaseHelper nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :touchButtonRecognizer nil)
  this)

    
(defn jinit_1 [this p_touchButtonRecognizer]
  (let [ l_touchButtonRecognizer (volatile! p_touchButtonRecognizer)]
    nil (jinitfields this)
        (JR/fset this :touchButtonRecognizer @l_touchButtonRecognizer))
  this)

(defn jnew_1 [p_touchButtonRecognizer ]
  (let [o (JR/alloc 'ReleaseHelper)] (jinit_1 o p_touchButtonRecognizer) o))

    
(defn jm_release_2 [this p_touchButtonInput p_deviceId]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput) l_deviceId (volatile! p_deviceId) l_nextTouchButtonInput (volatile! nil) l_gameKeyEvent (volatile! nil) l_index (volatile! nil)]
        (vreset! l_nextTouchButtonInput nil)
        (vreset! l_gameKeyEvent nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke (JR/fget (JR/fget this :touchButtonRecognizer) :currentlyPressedTouchButtonSingleton) :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_nextTouchButtonInput (JR/invoke (JR/fget (JR/fget this :touchButtonRecognizer) :currentlyPressedTouchButtonSingleton) :jm_get_1 @l_index))
            (vreset! l_gameKeyEvent (JR/invoke @l_nextTouchButtonInput :jm_getGameKeyEvent_0))
            (JR/invoke (JR/fget (JR/fget this :touchButtonRecognizer) :upGameKeyEventHandler) :jm_fireEvent_1 @l_gameKeyEvent)
            (JR/invoke (JR/invoke (JR/fget (JR/fget this :touchButtonRecognizer) :upGameKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEvent_1 @l_gameKeyEvent)
            (JR/invoke (JR/fget (JR/fget this :touchButtonRecognizer) :currentlyPressedTouchButtonSingleton) :jm_removeAt_1 @l_index)))))



