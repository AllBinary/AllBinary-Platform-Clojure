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
;; package org.allbinary.game.displayable.canvas

(ns NoMenuInputProcessor)

(JR/register 'NoMenuInputProcessor 'BasicMenuInputProcessor '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (NoMenuInputProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NoMenuInputProcessor/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
        (BasicMenuInputProcessor/jinit_3 this (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0) (unchecked-int (unchecked-negate (JR/c2i 1))) (JR/sget 'NullCanvas "NULL_CANVAS")) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoMenuInputProcessor)] (jinit_0 o) o))

    
(defn jm_onDownGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_onUpGameKeyEvent_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_onMotionGestureEvent_1 [this p_motionGestureEvent]
  (let [ l_motionGestureEvent (volatile! p_motionGestureEvent)]
        nil))



