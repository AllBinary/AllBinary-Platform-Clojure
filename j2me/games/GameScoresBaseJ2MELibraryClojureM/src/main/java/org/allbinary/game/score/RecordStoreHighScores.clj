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

(ns RecordStoreHighScores)

(JR/register 'RecordStoreHighScores 'HighScores '[])

(def jsv_hashTable (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_hashTable [] (JR/ensure-init jclinit-state jclinit) @jsv_hashTable)
(defn jstatic_set_hashTable [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_hashTable v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_hashTable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :platformRecordIdUtil nil)
  (JR/fset this :tsUtil nil)
  (JR/fset this :RECORD_ID nil)
  (JR/fset this :MAXHIGHSCORES 0)
  (JR/fset this :gameInfo nil)
  (JR/fset this :abeClientInformation nil)
  (JR/fset this :recordComparatorInterface nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :platformRecordIdUtil (JR/scall 'PlatformRecordIdUtil :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :RECORD_ID "_HS")
    (JR/fset this :MAXHIGHSCORES 100)
  this)

    
(defn jinit_6 [this p_abeClientInformation p_gameInfo p_name p_heading p_columnTwoHeading p_recordComparatorInterface]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_gameInfo (volatile! p_gameInfo) l_name (volatile! p_name) l_heading (volatile! p_heading) l_columnTwoHeading (volatile! p_columnTwoHeading) l_recordComparatorInterface (volatile! p_recordComparatorInterface)]
        (HighScores/jinit_3 this @l_name @l_heading @l_columnTwoHeading) (jinitfields this)
        (JR/fset this :abeClientInformation @l_abeClientInformation)
        (JR/fset this :gameInfo @l_gameInfo)
        (JR/fset this :recordComparatorInterface @l_recordComparatorInterface)
        (JR/invoke this :jm_load_0))
  this)

(defn jnew_6 [p_abeClientInformation p_gameInfo p_name p_heading p_columnTwoHeading p_recordComparatorInterface ]
  (let [o (JR/alloc 'RecordStoreHighScores)] (jinit_6 o p_abeClientInformation p_gameInfo p_name p_heading p_columnTwoHeading p_recordComparatorInterface) o))

    
(defn jm_getInstance_6 [p_abeClientInformation p_gameInfo p_highScoreName p_heading p_columnTwoHeading p_recordComparatorInterface]
  (let [this nil l_abeClientInformation (volatile! p_abeClientInformation) l_gameInfo (volatile! p_gameInfo) l_highScoreName (volatile! p_highScoreName) l_heading (volatile! p_heading) l_columnTwoHeading (volatile! p_columnTwoHeading) l_recordComparatorInterface (volatile! p_recordComparatorInterface) l_highScoresCanBeNull (volatile! nil) l_highScores (volatile! nil)](JR/method
        (vreset! l_highScoresCanBeNull (JR/invoke (RecordStoreHighScores/jstatic_hashTable) :jm_get_1 @l_highScoreName))
        (if (nil? @l_highScoresCanBeNull)
            (do
            (vreset! l_highScores (RecordStoreHighScores/jnew_6 @l_abeClientInformation @l_gameInfo @l_highScoreName @l_heading @l_columnTwoHeading @l_recordComparatorInterface))
            (JR/invoke (RecordStoreHighScores/jstatic_hashTable) :jm_put_2 (JR/invoke @l_highScores :jm_getName_0) @l_highScores)
            (JR/jreturn @l_highScores)))
        @l_highScoresCanBeNull)))

    
(defn jm_getRecordId_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke (JR/fget this :platformRecordIdUtil) :jm_getRecordId_2 @l_abeClientInformation (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :UNDERSCORE)) :jm_append_1 (JR/invoke this :jm_getName_0)) :jm_append_1 (JR/fget this :RECORD_ID))))))

    
(defn jm_addHighScore_1 [this p_newHighScore]
  (let [ l_newHighScore (volatile! p_newHighScore) l_recordStore (volatile! nil) l_e (volatile! nil) l_highScoreBytes (volatile! nil) l_recordId (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Adding HighScore: ") :jm_appendlong_1 (JR/invoke @l_newHighScore :jm_getScore_0))) this (JR/fget (JR/fget this :commonStrings) :ADD))
            (if (JR/invoke this :jm_isTooManyHighScores_0)
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Removing Lowest Score" this (JR/fget (JR/fget this :commonStrings) :ADD))
                (JR/invoke this :jm_removeLowestHighScore_0)))
            (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 (JR/fget this :abeClientInformation)) true))
            (vreset! l_highScoreBytes (JR/invoke @l_newHighScore :jm_getAsBytes_0))
            (vreset! l_recordId (JR/invoke @l_recordStore :jm_addRecord_3 @l_highScoreBytes 0 (JR/alen @l_highScoreBytes)))
            (JR/invoke this :jm_load_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je 'RecordStoreException) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :ADD) @l_e))
                (JR/instance-of je java.io.IOException) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :ADD) @l_e))
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :ADD) @l_e)) :else (throw jt))))
            (finally
            (try (do
                (if (some? @l_recordStore)
                    (do
                    (JR/scall 'PreLogUtil :jm_put_3 "Closing RecordStore" this (JR/fget (JR/fget this :commonStrings) :ADD))
                    (JR/invoke @l_recordStore :jm_closeRecordStore_0))))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je 'RecordStoreException) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :ADD) @l_e)) :else (throw jt)))))))))

    
(defn jm_removeLowestHighScore_0 [this]
  (let [ l_recordStore (volatile! nil) l_e (volatile! nil) l_recordEnum (volatile! nil) l_scoreComparator (volatile! nil) l_bestHighScore (volatile! nil) l_recordAsBytes (volatile! nil) l_byteArrayInputStream (volatile! nil) l_inputStream (volatile! nil) l_id (volatile! nil) l_name (volatile! nil) l_nextScore (volatile! nil) l_nextCurrentHighScore (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 (JR/fget this :abeClientInformation)) true))
            (vreset! l_recordEnum (JR/invoke @l_recordStore :jm_enumerateRecords_3 (JR/sget 'NullRecordFilter "NULL_RECORD_FILTER") (JR/sget 'NullRecordComparator "NULL_RECORD_COMPARATOR") true))
            (vreset! l_scoreComparator (JR/fget this :recordComparatorInterface))
            (vreset! l_bestHighScore (HighScore/jnew_4 (unchecked-int (unchecked-negate (JR/c2i 1))) "none" (JR/sget 'GameInfo "NONE") (JR/invoke @l_scoreComparator :jm_getBestScore_0)))
            (vreset! l_recordAsBytes nil)
            (vreset! l_byteArrayInputStream nil)
            (vreset! l_inputStream nil)
            (JR/jwhile false false (JR/invoke @l_recordEnum :jm_hasNextElement_0)
                (vreset! l_id (JR/invoke @l_recordEnum :jm_nextRecordId_0))
                (vreset! l_recordAsBytes (JR/invoke (JR/fget this :tsUtil) :jm_getRecord_2 @l_recordStore @l_id))
                (if (some? @l_recordAsBytes)
                    (do
                    (vreset! l_byteArrayInputStream (new java.io.ByteArrayInputStream @l_recordAsBytes))
                    (vreset! l_inputStream (new java.io.DataInputStream @l_byteArrayInputStream))
                    (vreset! l_name (JR/invoke @l_inputStream :jm_readUTF_0))
                    (vreset! l_nextScore (JR/invoke @l_inputStream :jm_readLong_0))
                    (vreset! l_nextCurrentHighScore (HighScore/jnew_4 @l_id @l_name (JR/sget 'GameInfo "NONE") @l_nextScore))
                    (if (JR/eq (JR/invoke (JR/fget this :recordComparatorInterface) :jm_compare_2 (JR/invoke @l_nextCurrentHighScore :jm_getAsBytes_0) (JR/invoke @l_bestHighScore :jm_getAsBytes_0)) (JR/sget 'RecordComparator "FOLLOWS"))
                        (do
                        (vreset! l_bestHighScore @l_nextCurrentHighScore))))))
            (if (not (== (JR/invoke @l_bestHighScore :jm_getId_0) (unchecked-int (unchecked-negate (JR/c2i 1)))))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Removing Lowest HighScore: ") :jm_appendlong_1 (JR/invoke @l_bestHighScore :jm_getScore_0))) this (JR/fget (JR/fget this :commonStrings) :LOAD))
                (JR/invoke @l_recordStore :jm_deleteRecord_1 (JR/invoke @l_bestHighScore :jm_getId_0)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je 'RecordStoreException) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "removeLowestHighScore" @l_e))
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "removeLowestHighScore" @l_e)) :else (throw jt))))
            (finally
            (try (do
                (if (some? @l_recordStore)
                    (do
                    (JR/scall 'PreLogUtil :jm_put_3 "Closing RecordStore" this "removeLowestHighScore")
                    (JR/invoke @l_recordStore :jm_closeRecordStore_0))))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je 'RecordStoreException) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "removeLowestHighScore" @l_e)) :else (throw jt)))))))))

    
(defn jm_load_0 [this]
  (let [ l_recordStore (volatile! nil) l_e (volatile! nil) l_recordEnum (volatile! nil) l_recordAsBytes (volatile! nil) l_byteArrayInputStream (volatile! nil) l_inputStream (volatile! nil) l_id (volatile! nil) l_name (volatile! nil) l_score (volatile! nil) l_newHighScore (volatile! nil) l_list (volatile! nil) l_size (volatile! nil) l_lastIndex (volatile! nil) l_highScore (volatile! nil) l_index (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 (JR/fget this :abeClientInformation)) true))
            (JR/invoke this :jm_setList_1 (BasicArrayListD/jnew_0))
            (vreset! l_recordEnum (JR/invoke @l_recordStore :jm_enumerateRecords_3 (JR/sget 'NullRecordFilter "NULL_RECORD_FILTER") (JR/sget 'NullRecordComparator "NULL_RECORD_COMPARATOR") true))
            (vreset! l_recordAsBytes nil)
            (vreset! l_byteArrayInputStream nil)
            (vreset! l_inputStream nil)
            (JR/jwhile false false (JR/invoke @l_recordEnum :jm_hasNextElement_0)
                (vreset! l_id (JR/invoke @l_recordEnum :jm_nextRecordId_0))
                (vreset! l_recordAsBytes (JR/invoke (JR/fget this :tsUtil) :jm_getRecord_2 @l_recordStore @l_id))
                (if (some? @l_recordAsBytes)
                    (do
                    (vreset! l_byteArrayInputStream (new java.io.ByteArrayInputStream @l_recordAsBytes))
                    (vreset! l_inputStream (new java.io.DataInputStream @l_byteArrayInputStream))
                    (try (do
                        (vreset! l_name (JR/invoke @l_inputStream :jm_readUTF_0))
                        (vreset! l_score (JR/invoke @l_inputStream :jm_readLong_0))
                        (vreset! l_newHighScore (HighScore/jnew_4 @l_id @l_name (JR/sget 'GameInfo "NONE") @l_score))
                        (vreset! l_list (JR/invoke this :jm_getList_0))
                        (vreset! l_size (JR/invoke @l_list :jm_size_0))
                        (vreset! l_lastIndex @l_size)
                        (do (vreset! l_index 0)
                            (JR/jfor true false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                            (vreset! l_highScore (JR/aget* (JR/fget @l_list :objectArray) @l_index))
                            (if (JR/eq (JR/invoke (JR/fget this :recordComparatorInterface) :jm_compare_2 (JR/invoke @l_newHighScore :jm_getAsBytes_0) (JR/invoke @l_highScore :jm_getAsBytes_0)) (JR/sget 'RecordComparator "PRECEDES"))
                                (do
                                (vreset! l_lastIndex @l_index)
                                (JR/jbreak)))))
                        (JR/invoke @l_list :jm_addAt_2 @l_lastIndex @l_newHighScore))
                        (catch Throwable jt (let [je (JR/caught jt)] (cond
                            (JR/instance-of je java.io.EOFException) (do (vreset! l_e je)
                        (JR/invoke (JR/fget this :logUtil) :jm_put_4 "EOF" this (JR/fget (JR/fget this :commonStrings) :LOAD) @l_e)
                        (JR/jthrow @l_e)) :else (throw jt)))))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je 'RecordStoreNotFoundException) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "No High Scores" this (JR/fget (JR/fget this :commonStrings) :LOAD) @l_e))
                (JR/instance-of je 'RecordStoreException) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :UNKNOWN) this (JR/fget (JR/fget this :commonStrings) :LOAD) @l_e))
                (JR/instance-of je java.io.IOException) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :UNKNOWN) this (JR/fget (JR/fget this :commonStrings) :LOAD) @l_e))
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :UNKNOWN) this (JR/fget (JR/fget this :commonStrings) :LOAD) @l_e)) :else (throw jt))))
            (finally
            (try (do
                (if (some? @l_recordStore)
                    (do
                    (JR/scall 'PreLogUtil :jm_put_3 "Closing RecordStore" this (JR/fget (JR/fget this :commonStrings) :LOAD))
                    (JR/invoke @l_recordStore :jm_closeRecordStore_0))))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je 'RecordStoreException) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :LOAD) @l_e)) :else (throw jt)))))))))

    
(defn jm_isTooManyHighScores_0 [this]
  (let []
        (if (and (some? (JR/invoke this :jm_getList_0)) (< (JR/invoke (JR/invoke this :jm_getList_0) :jm_size_0) (JR/fget this :MAXHIGHSCORES)))
            (do
            false)
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "HighScores RecordStore Max Reached: ") :jm_appendint_1 (JR/fget this :MAXHIGHSCORES))) this "isTooManyHighScores")
            true))))

    
(defn jm_isBestScore_1 [this p_newHighScore]
  (let [ l_newHighScore (volatile! p_newHighScore) l_list (volatile! nil) l_size (volatile! nil) l_highScore (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (if (not (JR/invoke this :jm_isTooManyHighScores_0))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Slot Available for a High Score" this "isBestScore")
                (JR/jreturn true))
                (do
                (vreset! l_list (JR/invoke this :jm_getList_0))
                (vreset! l_size (JR/invoke @l_list :jm_size_0))
                (do (vreset! l_index 0)
                    (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                    (vreset! l_highScore (JR/aget* (JR/fget @l_list :objectArray) @l_index))
                    (if (JR/eq (JR/invoke (JR/fget this :recordComparatorInterface) :jm_compare_2 (JR/invoke @l_newHighScore :jm_getAsBytes_0) (JR/invoke @l_highScore :jm_getAsBytes_0)) (JR/sget 'RecordComparator "FOLLOWS"))
                        (do
                        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Obtained a High Score" this "isBestScore")
                        (JR/jreturn true)))))))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Not a High Score" this "isBestScore")
            (JR/jreturn false))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :ADD) @l_e)
            (JR/jthrow @l_e)) :else (throw jt))))))))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_list (volatile! nil) l_size (volatile! nil) l_highScore (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of this))
        (vreset! l_list (JR/invoke this :jm_getList_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_highScore (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_highScore :jm_getScoreString_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COMMA_SEP))))
        (JR/to-string-of @l_stringBuffer)))



