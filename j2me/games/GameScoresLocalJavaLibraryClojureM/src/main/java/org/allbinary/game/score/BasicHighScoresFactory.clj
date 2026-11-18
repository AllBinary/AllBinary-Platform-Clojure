;; Generated Code Do Not Modify
;; package org.allbinary.game.score

(ns BasicHighScoresFactory)

(JR/register 'BasicHighScoresFactory 'HighScoresBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :abeClientInformation nil)
  (JR/fset this :highScoresArray nil)
  (JR/fset this :TOP nil)
  (JR/fset this :SCORES nil)
  (JR/fset this :PERSONAL_HIGH_SCORES nil)
  (JR/fset this :FETCH nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :highScoresArray (JR/anew "Object" 1 1))
    (JR/fset this :TOP "Top")
    (JR/fset this :SCORES "Scores")
    (JR/fset this :PERSONAL_HIGH_SCORES "Personal Top Scores")
    (JR/fset this :FETCH "fetchHighScores")
  this)

    
(defn jinit_2 [this p_abeClientInformation p_softwareInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_softwareInformation (volatile! p_softwareInformation)]
    (HighScoresBase/jinit_0 this) (jinitfields this)
        (JR/fset this :abeClientInformation @l_abeClientInformation))
  this)

(defn jnew_2 [p_abeClientInformation p_softwareInformation ]
  (let [o (JR/alloc 'BasicHighScoresFactory)] (jinit_2 o p_abeClientInformation p_softwareInformation) o))

    
(defn jm_fetchHighScores_2 [this p_gameInfo p_highScoresResultsListener]
  (let [ l_gameInfo (volatile! p_gameInfo) l_highScoresResultsListener (volatile! p_highScoresResultsListener)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Getting Local HighScores" this (JR/fget this :FETCH))
        (JR/invoke this :jm_fetchHighScoresPreload_3 @l_gameInfo @l_highScoresResultsListener true)))

    
(defn jm_fetchHighScoresPreload_3 [this p_gameInfo p_highScoresResultsListener p_preload]
  (let [ l_gameInfo (volatile! p_gameInfo) l_highScoresResultsListener (volatile! p_highScoresResultsListener) l_preload (volatile! p_preload) l_e (volatile! nil)]
        (try (do
            (JR/aset* (JR/fget this :highScoresArray) 0 (JR/scall 'RecordStoreHighScores :jm_getInstance_6 (JR/fget this :abeClientInformation) @l_gameInfo (JR/fget this :TOP) (JR/fget this :PERSONAL_HIGH_SCORES) (JR/fget this :SCORES) (ScoreComparator/jnew_1 true)))
            (JR/invoke @l_highScoresResultsListener :jm_setHighScoresArray_1 (JR/fget this :highScoresArray)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget this :FETCH) @l_e)) :else (throw jt)))))))

    
(defn jm_createHighScoresHelper_0 [this]
  (let []
        (HighScoresHelper2/jnew_0)))

    
(defn jm_loaded_1 [p_index2]
  (let [this nil l_index2 (volatile! p_index2)](JR/method
        (if (>= @l_index2 0)
            (do
            (JR/jreturn true)))
        false)))



