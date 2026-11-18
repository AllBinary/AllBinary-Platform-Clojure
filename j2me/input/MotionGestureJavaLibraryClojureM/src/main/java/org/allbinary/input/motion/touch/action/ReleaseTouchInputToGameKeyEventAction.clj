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
;; package org.allbinary.input.motion.touch.action

(ns ReleaseTouchInputToGameKeyEventAction)

(JR/register 'ReleaseTouchInputToGameKeyEventAction 'GameKeyCompleteMotionGestureInputEvent '[])

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
    (JR/fset this :NONE (JR/fget (JR/scall 'GameKeyFactory :jm_getInstance_0) :NONE))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (ReleaseTouchInputToGameKeyEventAction/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (ReleaseTouchInputToGameKeyEventAction/jstatic_set_instance (ReleaseTouchInputToGameKeyEventAction/jnew_0))))
        (ReleaseTouchInputToGameKeyEventAction/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (GameKeyCompleteMotionGestureInputEvent/jinit_3 this "Release Action" (JR/fget (JR/scall 'TouchMotionGestureFactory :jm_getInstance_0) :RELEASED) (JR/invoke (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0) :jm_getInputMapping_0)) (jinitfields this)
        (try (do
            (JR/invoke this :jm_setGameKey_1 (JR/fget this :NONE))
            (JR/invoke this :jm_setGameKeyEvent_1 (JR/invoke (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :jm_getInstanceForInput_2 this (JR/fget this :NONE))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :CONSTRUCTOR) @l_e)) :else (throw jt))))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ReleaseTouchInputToGameKeyEventAction)] (jinit_0 o) o))

    
(defn jm_update_0 [this]
  (let []
        nil))



