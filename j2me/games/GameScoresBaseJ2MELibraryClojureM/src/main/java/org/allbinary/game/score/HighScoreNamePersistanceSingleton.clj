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

(ns HighScoreNamePersistanceSingleton)

(JR/register 'HighScoreNamePersistanceSingleton nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (HighScoreNamePersistanceSingleton/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :tsUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :platformRecordIdUtil nil)
  (JR/fset this :RECORD_ID nil)
  (JR/fset this :name nil)
  (JR/fset this :nameBasicArrayList nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :platformRecordIdUtil (JR/scall 'PlatformRecordIdUtil :jm_getInstance_0))
    (JR/fset this :RECORD_ID "_SN")
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :nameBasicArrayList (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'HighScoreNamePersistanceSingleton)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (HighScoreNamePersistanceSingleton/jstatic_SINGLETON)))

    
(defn jm_clear_0 [this]
  (let []
        (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))))

    
(defn jm_deleteAll_2 [this p_abeClientInformation p_gameInfo]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_gameInfo (volatile! p_gameInfo) l_size (volatile! nil) l_integer (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke (JR/fget this :nameBasicArrayList) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_integer (JR/aget* (JR/fget (JR/fget this :nameBasicArrayList) :objectArray) @l_index))
            (JR/invoke this :jm_delete_3 @l_abeClientInformation @l_gameInfo (JR/invoke @l_integer :jm_intValue_0))))
        (JR/invoke this :jm_clear_0)))

    
(defn jm_getRecordId_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke (JR/fget this :platformRecordIdUtil) :jm_getRecordId_2 @l_abeClientInformation (JR/fget this :RECORD_ID))))

    
(defn jm_delete_3 [this p_abeClientInformation p_gameInfo p_deleteId]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_gameInfo (volatile! p_gameInfo) l_deleteId (volatile! p_deleteId) l_recordStore (volatile! nil) l_e (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Deleting: ") :jm_appendint_1 @l_deleteId)) this (JR/fget (JR/fget this :commonStrings) :delete))
            (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation) true))
            (JR/invoke @l_recordStore :jm_deleteRecord_1 @l_deleteId))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow @l_e)) :else (throw jt))))
            (finally
            (if (some? @l_recordStore)
                (do
                (JR/scall 'PreLogUtil :jm_put_3 "Closing RecordStore" this (JR/fget (JR/fget this :commonStrings) :delete))
                (JR/invoke @l_recordStore :jm_closeRecordStore_0)))))))

    
(defn jm_getIds_0 [this]
  (let []
        (JR/fget this :nameBasicArrayList)))

    
(defn jm_load_2 [this p_abeClientInformation p_gameInfo]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_gameInfo (volatile! p_gameInfo) l_recordStore (volatile! nil) l_e (volatile! nil) l_LOADING_ID (volatile! nil) l_recordEnum (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil) l_recordAsBytes (volatile! nil) l_byteArrayInputStream (volatile! nil) l_inputStream (volatile! nil) l_id (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (if (JR/eq (JR/fget this :name) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
                (do
                (vreset! l_LOADING_ID "Loading id: ")
                (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation) true))
                (vreset! l_recordEnum (JR/invoke @l_recordStore :jm_enumerateRecords_3 (JR/sget 'NullRecordFilter "NULL_RECORD_FILTER") (JR/sget 'NullRecordComparator "NULL_RECORD_COMPARATOR") true))
                (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
                (vreset! l_recordAsBytes nil)
                (vreset! l_byteArrayInputStream nil)
                (vreset! l_inputStream nil)
                (JR/jwhile false false (JR/invoke @l_recordEnum :jm_hasNextElement_0)
                    (vreset! l_id (JR/invoke @l_recordEnum :jm_nextRecordId_0))
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_LOADING_ID) :jm_appendint_1 @l_id)) this (JR/fget (JR/fget this :commonStrings) :LOAD))
                    (vreset! l_recordAsBytes (JR/invoke (JR/fget this :tsUtil) :jm_getRecord_2 @l_recordStore @l_id))
                    (vreset! l_byteArrayInputStream (new java.io.ByteArrayInputStream @l_recordAsBytes))
                    (vreset! l_inputStream (new java.io.DataInputStream @l_byteArrayInputStream))
                    (JR/jwhile false false (> (JR/invoke @l_inputStream :jm_available_0) 0)
                        (JR/fset this :name (JR/invoke @l_inputStream :jm_readUTF_0)))
                    (JR/invoke (JR/fget this :nameBasicArrayList) :jm_add_1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 @l_id))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke this :jm_save_3 @l_abeClientInformation @l_gameInfo (JR/fget this :name))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :EXCEPTION_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'ExceptionUtil :jm_getInstance_0) :jm_getStackTrace_1 @l_e))) this (JR/fget (JR/fget this :commonStrings) :LOAD))) :else (throw jt))))
            (finally
            (try (do
                (if (some? @l_recordStore)
                    (do
                    (JR/scall 'PreLogUtil :jm_put_3 "Closing RecordStore" this (JR/fget (JR/fget this :commonStrings) :LOAD))
                    (JR/invoke @l_recordStore :jm_closeRecordStore_0))))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je 'RecordStoreException) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :LOAD) @l_e)) :else (throw jt)))))))
        (JR/fget this :name)))

    
(defn jm_save_3 [this p_abeClientInformation p_gameInfo p_name]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_gameInfo (volatile! p_gameInfo) l_name (volatile! p_name) l_recordStore (volatile! nil) l_e (volatile! nil) l_byteArrayOutputStream (volatile! nil) l_outputStream (volatile! nil) l_savedGameBytes (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Saving: ") :jm_append_1 @l_name)) this (JR/fget (JR/fget this :commonStrings) :SAVE))
            (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation) true))
            (vreset! l_byteArrayOutputStream (new java.io.ByteArrayOutputStream))
            (vreset! l_outputStream (new java.io.DataOutputStream @l_byteArrayOutputStream))
            (JR/invoke @l_outputStream :jm_writeUTF_1 @l_name)
            (vreset! l_savedGameBytes (JR/invoke @l_byteArrayOutputStream :jm_toByteArray_0))
            (JR/invoke @l_recordStore :jm_addRecord_3 @l_savedGameBytes 0 (JR/alen @l_savedGameBytes))
            (JR/fset this :name @l_name))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :SAVE) @l_e)) :else (throw jt))))
            (finally
            (try (do
                (if (some? @l_recordStore)
                    (do
                    (JR/scall 'PreLogUtil :jm_put_3 "Closing RecordStore" this (JR/fget (JR/fget this :commonStrings) :SAVE))
                    (JR/invoke @l_recordStore :jm_closeRecordStore_0))))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je 'RecordStoreException) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :SAVE) @l_e)) :else (throw jt)))))))))



