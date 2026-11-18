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

(ns HighScoresBase)

(JR/register 'HighScoresBase nil '[HighScoresFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'HighScoresBase)] (jinit_0 o) o))

    
(defn jm_fetchHighScores_2 [this p_gameInfo p_highScoresResultsListener]
  (let [ l_gameInfo (volatile! p_gameInfo) l_highScoresResultsListener (volatile! p_highScoresResultsListener)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_fetchHighScoresPreload_3 [this p_gameInfo p_highScoresResultsListener p_preload]
  (let [ l_gameInfo (volatile! p_gameInfo) l_highScoresResultsListener (volatile! p_highScoresResultsListener) l_preload (volatile! p_preload)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_createHighScoresHelper_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))



