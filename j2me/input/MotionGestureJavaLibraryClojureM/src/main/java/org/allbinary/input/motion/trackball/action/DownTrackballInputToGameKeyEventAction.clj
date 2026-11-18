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
;; package org.allbinary.input.motion.trackball.action

(ns DownTrackballInputToGameKeyEventAction)

(JR/register 'DownTrackballInputToGameKeyEventAction 'GameKeyCompleteMotionGestureInputEvent '[])

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
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (DownTrackballInputToGameKeyEventAction/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (DownTrackballInputToGameKeyEventAction/jstatic_set_instance (DownTrackballInputToGameKeyEventAction/jnew_0))))
        (DownTrackballInputToGameKeyEventAction/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
        (GameKeyCompleteMotionGestureInputEvent/jinit_3 this "Down Action" (JR/fget (JR/scall 'TrackballMotionGestureFactory :jm_getInstance_0) :DOWN) (JR/invoke (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0) :jm_getInputMapping_0)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DownTrackballInputToGameKeyEventAction)] (jinit_0 o) o))



