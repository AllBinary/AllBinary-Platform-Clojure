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

(ns NoHighScoresFactory)

(JR/register 'NoHighScoresFactory 'HighScoresBase '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (NoHighScoresFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :NO_HIGH_SCORES nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :NO_HIGH_SCORES (JR/anew "Object" 1 0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NoHighScoresFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    (HighScoresBase/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoHighScoresFactory)] (jinit_0 o) o))

    
(defn jm_fetchHighScores_2 [this p_gameInfo p_highScoresResultsListener]
  (let [ l_gameInfo (volatile! p_gameInfo) l_highScoresResultsListener (volatile! p_highScoresResultsListener)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Getting No HighScores" this "fetchHighScores")
        (JR/invoke @l_highScoresResultsListener :jm_setHighScoresArray_1 (JR/fget this :NO_HIGH_SCORES))))

    
(defn jm_createHighScoresHelper_0 [this]
  (let []
        (HighScoresHelperBase/jnew_0)))



