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
;; package org.allbinary.game.score

(ns Scoreable)

(JR/register 'Scoreable nil '[ScoreableInterface])

(def jsv_ID (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_ID [] (JR/ensure-init jclinit-state jclinit) @jsv_ID)
(defn jstatic_set_ID [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ID v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_ID (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 3))
    nil))

(defn jinitfields [this]
  (JR/fset this :points 0)
  this)

    
(defn jinit_1 [this p_points]
  (let [ l_points (volatile! p_points)]
    nil (jinitfields this)
        (JR/fset this :points @l_points))
  this)

(defn jnew_1 [p_points ]
  (let [o (JR/alloc 'Scoreable)] (jinit_1 o p_points) o))

    
(defn jm_addPoints_1 [this p_points]
  (let [ l_points (volatile! p_points)]
        (JR/fset this :points (unchecked-int (unchecked-add (JR/fget this :points) @l_points)))))

    
(defn jm_removePoints_1 [this p_points]
  (let [ l_points (volatile! p_points)]
        (JR/fset this :points (unchecked-int (unchecked-subtract (JR/fget this :points) @l_points)))))

    
(defn jm_setPoints_1 [this p_points]
  (let [ l_points (volatile! p_points)]
        (JR/fset this :points @l_points)))

    
(defn jm_getPoints_0 [this]
  (let []
        (JR/fget this :points)))



