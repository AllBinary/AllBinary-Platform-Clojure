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

(ns HighScoresHelper)

(JR/register 'HighScoresHelper 'HighScoresHelperBase '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :lastIndex 0)
    (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstanceAt_2 0 0))
    (JR/fset this :lastIndex (unchecked-int (unchecked-negate (JR/c2i 1))))
  this)

(defn jinit_0 [this]
  (HighScoresHelperBase/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'HighScoresHelper)] (jinit_0 o) o))

    
(defn jm_setHighScoresArray_1 [this p_highScoresArrayP]
  (let [ l_highScoresArrayP (volatile! p_highScoresArrayP)]
        (JR/invoke-super 'HighScoresHelperBase this :jm_setHighScoresArray_1 @l_highScoresArrayP)
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_setSize_1 (JR/alen (JR/fget this :highScoresArrayP)))))

    
(defn jm_getNextHighScores_0 [this]
  (let [ l_highScores (volatile! nil) l_index (volatile! nil)]
        (vreset! l_highScores (JR/aget* (JR/fget this :highScoresArrayP) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))
        (vreset! l_index 0)
        (JR/jwhile false false (and (or (< (JR/invoke @l_highScores :jm_getTotal_0) 1) (== (JR/fget this :lastIndex) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))) (< @l_index (JR/alen (JR/fget this :highScoresArrayP))))
            (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)
            (vreset! l_highScores (JR/aget* (JR/fget this :highScoresArrayP) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))
            (JR/vinc l_index 1 :int false))
        (JR/fset this :lastIndex (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        @l_highScores))

    
(defn jm_isAnyHighScores_0 [this]
  (let [ l_anyScores (volatile! nil) l_highScores (volatile! nil) l_index (volatile! nil)](JR/method
        (if (< (JR/alen (JR/fget this :highScoresArrayP)) 1)
            (do
            (JR/jreturn false)))
        (vreset! l_anyScores false)
        (vreset! l_highScores nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :highScoresArrayP)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_highScores (JR/aget* (JR/fget this :highScoresArrayP) @l_index))
            (if (> (JR/invoke @l_highScores :jm_getTotal_0) 0)
                (do
                (vreset! l_anyScores true)))))
        @l_anyScores)))



