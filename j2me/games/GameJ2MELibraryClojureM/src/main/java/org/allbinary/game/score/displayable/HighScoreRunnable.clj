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
;; package org.allbinary.game.score.displayable

(ns HighScoreRunnable)

(JR/register 'HighScoreRunnable 'ARunnable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :highScoresCanvas nil)
  this)

    
(defn jinit_1 [this p_highScoresCanvas]
  (let [ l_highScoresCanvas (volatile! p_highScoresCanvas)]
    (ARunnable/jinit_0 this) (jinitfields this)
        (JR/fset this :highScoresCanvas @l_highScoresCanvas))
  this)

(defn jnew_1 [p_highScoresCanvas ]
  (let [o (JR/alloc 'HighScoreRunnable)] (jinit_1 o p_highScoresCanvas) o))

    
(defn jm_run_0 [this]
  (let [ l_commonStrings (volatile! nil) l_logUtil (volatile! nil) l_highScoresCanvas (volatile! nil) l_isHTML (volatile! nil) l_stringMaker (volatile! nil) l_systemWrapper (volatile! nil) l_currentTimeMillis (volatile! nil) l_e (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
        (vreset! l_highScoresCanvas (JR/fget this :highScoresCanvas))
        (try (do
            (vreset! l_isHTML (JR/scall 'J2MEUtil :jm_isHTML_0))
            (if (not @l_isHTML)
                (do
                (JR/jwhile false false (not (JR/fget @l_highScoresCanvas :hasPainted))
                    nil)
                (JR/fset @l_highScoresCanvas :hasPainted false)))
            (vreset! l_stringMaker (StringMaker/jnew_0))
            (vreset! l_systemWrapper (JR/scall 'ABSystemWrapper :jm_getInstance_0))
            (vreset! l_currentTimeMillis (JR/invoke @l_systemWrapper :jm_currentTimeMillis_0))
            (JR/invoke @l_logUtil :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 "HighScoresCanvas - Request repaint to be sure: ") :jm_appendlong_1 @l_currentTimeMillis)) this (JR/fget @l_commonStrings :RUN))
            (JR/invoke (JR/fget @l_highScoresCanvas :repaintBehavior) :jm_onChangeRepaint_1 @l_highScoresCanvas)
            (if (not @l_isHTML)
                (do
                (JR/jwhile false false (not (JR/fget @l_highScoresCanvas :hasPainted))
                    nil)))
            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
            (JR/invoke @l_logUtil :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 "HighScoresCanvas - Now that the canvas has completed repaint go ahead and fetch the scores: ") :jm_appendlong_1 @l_currentTimeMillis)) this (JR/fget @l_commonStrings :RUN))
            (JR/invoke @l_highScoresCanvas :jm_executeUpdate_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke @l_logUtil :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :RUN) @l_e)) :else (throw jt)))))))



