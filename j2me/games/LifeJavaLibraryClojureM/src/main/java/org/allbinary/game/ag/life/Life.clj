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
;; package org.allbinary.game.ag.life

(ns Life)

(JR/register 'Life nil '[LifeInterface])

(def jsv_NO_LIFE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NO_LIFE [] (JR/ensure-init jclinit-state jclinit) @jsv_NO_LIFE)
(defn jstatic_set_NO_LIFE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NO_LIFE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NO_LIFE (Life/jm_createLife_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :lives 0)
  (JR/fset this :startLives 0)
  (JR/fset this :maxlives 0)
  this)

    
(defn jm_createLife_0 []
  (let [this nil l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (Life/jnew_2 (JR/i16 0) (JR/i16 0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow (new java.lang.RuntimeException))) :else (throw jt))))))))

    
(defn jinit_2 [this p_lives p_maxlives]
  (let [ l_lives (volatile! p_lives) l_maxlives (volatile! p_maxlives)]
    nil (jinitfields this)
        (JR/fset this :maxlives @l_maxlives)
        (if (> @l_lives (JR/fget this :maxlives))
            (do
            (JR/jthrow (new java.lang.Exception "To Many Lives"))))
        (JR/fset this :lives @l_lives)
        (JR/fset this :startLives @l_lives))
  this)

(defn jnew_2 [p_lives p_maxlives ]
  (let [o (JR/alloc 'Life)] (jinit_2 o p_lives p_maxlives) o))

    
(defn jm_get_0 [this]
  (let []
        (JR/fget this :lives)))

    
(defn jm_set_1 [this p_lives]
  (let [ l_lives (volatile! p_lives)]
        (JR/fset this :lives @l_lives)))

    
(defn jm_reset_0 [this]
  (let []
        (JR/fset this :lives (JR/fget this :startLives))))

    
(defn jm_add_1 [this p_lives]
  (let [ l_lives (volatile! p_lives)]
        (if (not (JR/invoke this :jm_reachedLimit_0))
            (do
            (if (<= (unchecked-int (unchecked-add (JR/fget this :lives) @l_lives)) (JR/invoke this :jm_getMaxlives_0))
                (do
                (JR/fset this :lives (JR/i16 (unchecked-int (unchecked-add (JR/fget this :lives) @l_lives)))))
                (do
                (JR/fset this :lives (JR/invoke this :jm_getMaxlives_0))))))))

    
(defn jm_isAlive_0 [this]
  (let []
        (if (<= (JR/fget this :lives) 0)
            (do
            false)
            (do
            true))))

    
(defn jm_getMaxlives_0 [this]
  (let []
        (JR/fget this :maxlives)))

    
(defn jm_reachedLimit_0 [this]
  (let []
        (if (or (> (JR/fget this :lives) (JR/fget this :maxlives)) (< (JR/fget this :lives) 0))
            (do
            true)
            (do
            false))))

    
(defn jm_deaths_1 [this p_lives]
  (let [ l_lives (volatile! p_lives)]
        (if (not (JR/invoke this :jm_reachedLimit_0))
            (do
            (if (>= (unchecked-int (unchecked-subtract (JR/fget this :lives) @l_lives)) 0)
                (do
                (JR/fset this :lives (JR/i16 (unchecked-int (unchecked-subtract (JR/fget this :lives) @l_lives)))))
                (do
                (JR/fset this :lives 0)))))))

    
(defn jm_getStartLives_0 [this]
  (let []
        (JR/fget this :startLives)))

    
(defn jm_setStartLives_1 [this p_startLives]
  (let [ l_startLives (volatile! p_startLives)]
        (JR/fset this :startLives @l_startLives)))



