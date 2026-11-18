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

(ns HighScoresHelper2)

(JR/register 'HighScoresHelper2 'HighScoresHelperBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :selectedHighScores nil)
    (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstanceAt_2 0 0))
    (JR/fset this :selectedHighScores (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  (HighScoresHelperBase/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'HighScoresHelper2)] (jinit_0 o) o))

    
(defn jm_setSelectedHighScores_1 [this p_selectedHighScores]
  (let [ l_selectedHighScores (volatile! p_selectedHighScores)]
        (JR/fset this :selectedHighScores @l_selectedHighScores)))

    
(defn jm_getSelectedHighScores_0 [this]
  (let []
        (JR/fget this :selectedHighScores)))

    
(defn jm_setHighScoresArray_1 [this p_highScoresArrayP]
  (let [ l_highScoresArrayP (volatile! p_highScoresArrayP)]
        (JR/invoke-super 'HighScoresHelperBase this :jm_setHighScoresArray_1 @l_highScoresArrayP)
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_setSize_1 (JR/alen (JR/fget this :highScoresArrayP)))
        (JR/invoke this :jm_selectHighScores_0)))

    
(defn jm_selectHighScores_0 [this]
  (let [ l_highScores (volatile! nil) l_index (volatile! nil)](JR/method
        (if (== (JR/alen (JR/fget this :highScoresArrayP)) 0)
            (do
            (JR/invoke this :jm_setSelectedHighScores_1 (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0))
            (JR/jreturn)))
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)
        (vreset! l_highScores (JR/aget* (JR/fget this :highScoresArrayP) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))
        (vreset! l_index 0)
        (JR/jwhile false false (and (< (JR/invoke @l_highScores :jm_getTotal_0) 1) (< @l_index (JR/alen (JR/fget this :highScoresArrayP))))
            (vreset! l_highScores (JR/aget* (JR/fget this :highScoresArrayP) (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)))
            (JR/vinc l_index 1 :int false))
        (JR/invoke this :jm_setSelectedHighScores_1 @l_highScores))))



