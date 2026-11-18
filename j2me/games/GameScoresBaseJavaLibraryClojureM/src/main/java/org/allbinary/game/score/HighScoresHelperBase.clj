;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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

(ns HighScoresHelperBase)

(JR/register 'HighScoresHelperBase nil '[HighScoresHelperBaseInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :highScoresArrayP nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :highScoresArrayP (JR/fget (JR/scall 'LastFetchHighScoresFactory :jm_getInstance_0) :highScoresArray))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'HighScoresHelperBase)] (jinit_0 o) o))

    
(defn jm_setHighScoresArray_1 [this p_highScoresArrayP]
  (let [ l_highScoresArrayP (volatile! p_highScoresArrayP) l_commonStrings (volatile! nil)]
        (if (some? @l_highScoresArrayP)
            (do
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget @l_commonStrings :START)) :jm_appendint_1 (JR/alen @l_highScoresArrayP))) this "setHighScoresArray"))
            (do
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget @l_commonStrings :START) this "setHighScoresArray")))
        (JR/fset this :highScoresArrayP @l_highScoresArrayP)))

    
(defn jm_getNextHighScores_0 [this]
  (let []
        (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0)))

    
(defn jm_isAnyHighScores_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_setSelectedHighScores_1 [this p_selectedHighScores]
  (let [ l_selectedHighScores (volatile! p_selectedHighScores)]
        nil))

    
(defn jm_getSelectedHighScores_0 [this]
  (let []
        (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0)))

    
(defn jm_getHighScoresArray_0 [this]
  (let []
        (JR/fget this :highScoresArrayP)))

    
(defn jm_selectHighScores_0 [this]
  (let []
        nil))



