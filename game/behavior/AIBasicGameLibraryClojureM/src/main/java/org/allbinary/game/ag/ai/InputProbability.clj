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
;; package org.allbinary.game.ag.ai

(ns InputProbability)

(JR/register 'InputProbability nil '[])

(def jsv_INPUT_PROBABILITY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_INPUT_PROBABILITY [] (JR/ensure-init jclinit-state jclinit) @jsv_INPUT_PROBABILITY)
(defn jstatic_set_INPUT_PROBABILITY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_INPUT_PROBABILITY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_INPUT_PROBABILITY (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :likelyhoodIntegerArray nil)
  (JR/fset this :repeatLikelyhoodIntegerArray nil)
  (JR/fset this :max 0)
  (JR/fset this :timeDelayHelper nil)
  this)

    
(defn jinit_4 [this p_likelyhoodIntegerArray p_repeatLikelyhoodIntegerArray p_max p_timeDelayHelper]
  (let [ l_likelyhoodIntegerArray (volatile! p_likelyhoodIntegerArray) l_repeatLikelyhoodIntegerArray (volatile! p_repeatLikelyhoodIntegerArray) l_max (volatile! p_max) l_timeDelayHelper (volatile! p_timeDelayHelper)]
    nil (jinitfields this)
        (JR/fset this :likelyhoodIntegerArray @l_likelyhoodIntegerArray)
        (JR/fset this :repeatLikelyhoodIntegerArray @l_repeatLikelyhoodIntegerArray)
        (JR/fset this :max @l_max)
        (JR/fset this :timeDelayHelper @l_timeDelayHelper))
  this)

(defn jnew_4 [p_likelyhoodIntegerArray p_repeatLikelyhoodIntegerArray p_max p_timeDelayHelper ]
  (let [o (JR/alloc 'InputProbability)] (jinit_4 o p_likelyhoodIntegerArray p_repeatLikelyhoodIntegerArray p_max p_timeDelayHelper) o))

    
(defn jm_getLikelyhoodIntegerArray_0 [this]
  (let []
        (JR/fget this :likelyhoodIntegerArray)))

    
(defn jm_getRepeatLikelyhoodIntegerArray_0 [this]
  (let []
        (JR/fget this :repeatLikelyhoodIntegerArray)))

    
(defn jm_getMax_0 [this]
  (let []
        (JR/fget this :max)))

    
(defn jm_getTimeDelayHelper_0 [this]
  (let []
        (JR/fget this :timeDelayHelper)))

    
(defn jm_toHashtable_0 [this]
  (let [ l_hashtable (volatile! nil)]
        (vreset! l_hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
        (JR/invoke @l_hashtable :jm_put_2 (InputProbability/jstatic_INPUT_PROBABILITY) this)
        @l_hashtable))



