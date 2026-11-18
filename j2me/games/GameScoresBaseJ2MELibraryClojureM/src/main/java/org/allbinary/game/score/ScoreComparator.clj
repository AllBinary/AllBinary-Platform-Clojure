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

(ns ScoreComparator)

(JR/register 'ScoreComparator nil '[RecordComparator])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :isHighestBest false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_isHighestBest]
  (let [ l_isHighestBest (volatile! p_isHighestBest)]
    nil (jinitfields this)
        (JR/fset this :isHighestBest @l_isHighestBest))
  this)

(defn jnew_1 [p_isHighestBest ]
  (let [o (JR/alloc 'ScoreComparator)] (jinit_1 o p_isHighestBest) o))

    
(defn jm_getBestScore_0 [this]
  (let []
        (if (JR/fget this :isHighestBest) java.lang.Long/MAX_VALUE 0)))

    
(defn jm_compare_2 [this p_recordOne p_recordTwo]
  (let [ l_recordOne (volatile! p_recordOne) l_recordTwo (volatile! p_recordTwo) l_byteArrayInputStreamOne (volatile! nil) l_inputStreamOne (volatile! nil) l_byteArrayInputStreamTwo (volatile! nil) l_inputStreamTwo (volatile! nil) l_scoreOne (volatile! nil) l_scoreTwo (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (vreset! l_byteArrayInputStreamOne (new java.io.ByteArrayInputStream @l_recordOne))
        (vreset! l_inputStreamOne (new java.io.DataInputStream @l_byteArrayInputStreamOne))
        (vreset! l_byteArrayInputStreamTwo (new java.io.ByteArrayInputStream @l_recordTwo))
        (vreset! l_inputStreamTwo (new java.io.DataInputStream @l_byteArrayInputStreamTwo))
        (vreset! l_scoreOne 0)
        (vreset! l_scoreTwo 0)
        (try (do
            (JR/invoke @l_inputStreamOne :jm_readUTF_0)
            (JR/invoke @l_inputStreamTwo :jm_readUTF_0)
            (vreset! l_scoreOne (JR/invoke @l_inputStreamOne :jm_readLong_0))
            (vreset! l_scoreTwo (JR/invoke @l_inputStreamTwo :jm_readLong_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.io.EOFException) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "compare" @l_e))
                (JR/instance-of je java.io.IOException) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "compare" @l_e))
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "compare" @l_e)) :else (throw jt)))))
        (if (JR/fget this :isHighestBest)
            (do
            (JR/invoke this :jm_getHighTooLow_2 @l_scoreOne @l_scoreTwo))
            (do
            (JR/invoke this :jm_getLowTooHigh_2 @l_scoreOne @l_scoreTwo)))))

    
(defn jm_getHighTooLow_2 [this p_scoreOne p_scoreTwo]
  (let [ l_scoreOne (volatile! p_scoreOne) l_scoreTwo (volatile! p_scoreTwo)]
        (if (> @l_scoreOne @l_scoreTwo)
            (do
            (JR/sget 'RecordComparator "PRECEDES"))
            (if (< @l_scoreOne @l_scoreTwo)
            (do
            (JR/sget 'RecordComparator "FOLLOWS"))
            (do
            (JR/sget 'RecordComparator "EQUIVALENT"))))))

    
(defn jm_getLowTooHigh_2 [this p_scoreOne p_scoreTwo]
  (let [ l_scoreOne (volatile! p_scoreOne) l_scoreTwo (volatile! p_scoreTwo)]
        (if (< @l_scoreOne @l_scoreTwo)
            (do
            (JR/sget 'RecordComparator "PRECEDES"))
            (if (> @l_scoreOne @l_scoreTwo)
            (do
            (JR/sget 'RecordComparator "FOLLOWS"))
            (do
            (JR/sget 'RecordComparator "EQUIVALENT"))))))



