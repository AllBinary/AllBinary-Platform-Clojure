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
;; package org.allbinary.game.configuration.persistance

(ns KeyValuePersistance)

(JR/register 'KeyValuePersistance 'BasicPersitance '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :tsUtil nil)
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_recordId]
  (let [ l_recordId (volatile! p_recordId)]
        (BasicPersitance/jinit_1 this @l_recordId) (jinitfields this))
  this)

(defn jnew_1 [p_recordId ]
  (let [o (JR/alloc 'KeyValuePersistance)] (jinit_1 o p_recordId) o))

    
(defn jm_loadAll_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke this :jm_loadAllSize_2 @l_abeClientInformation 1)))

    
(defn jm_loadAllSize_2 [this p_abeClientInformation p_size]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_size (volatile! p_size) l_recordStore (volatile! nil) l_recordEnum (volatile! nil) l_hashtable (volatile! nil) l_name (volatile! nil) l_value (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil) l_stringBuffer (volatile! nil) l_recordAsBytes (volatile! nil) l_byteArrayInputStream (volatile! nil) l_inputStream (volatile! nil) l_id (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation) true))
            (vreset! l_recordEnum (JR/invoke @l_recordStore :jm_enumerateRecords_3 (JR/sget 'NullRecordFilter "NULL_RECORD_FILTER") (JR/sget 'NullRecordComparator "NULL_RECORD_COMPARATOR") true))
            (vreset! l_hashtable nil)
            (vreset! l_name nil)
            (vreset! l_value nil)
            (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (vreset! l_recordAsBytes nil)
            (vreset! l_byteArrayInputStream nil)
            (vreset! l_inputStream nil)
            (JR/jwhile false false (JR/invoke @l_recordEnum :jm_hasNextElement_0)
                (vreset! l_id (JR/invoke @l_recordEnum :jm_nextRecordId_0))
                (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :persistanceStrings) :LOADING_ID)) :jm_appendint_1 @l_id)) this (JR/fget (JR/fget this :persistanceStrings) :LOAD_ALL))
                (vreset! l_recordAsBytes (JR/invoke (JR/fget this :tsUtil) :jm_getRecord_2 @l_recordStore @l_id))
                (if (some? @l_recordAsBytes)
                    (do
                    (vreset! l_byteArrayInputStream (new java.io.ByteArrayInputStream @l_recordAsBytes))
                    (vreset! l_inputStream (new java.io.DataInputStream @l_byteArrayInputStream))
                    (vreset! l_hashtable (ABHashtable/jnew_0))
                    (do (vreset! l_index 0)
                        (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                        (vreset! l_name (JR/invoke @l_inputStream :jm_readUTF_0))
                        (JR/invoke @l_inputStream :jm_readUTF_0)
                        (vreset! l_value (JR/invoke @l_inputStream :jm_readUTF_0))
                        (JR/invoke @l_hashtable :jm_put_2 @l_name @l_value)))
                    (JR/invoke (JR/fget this :valueList) :jm_add_1 @l_hashtable)
                    (JR/invoke (JR/fget this :idList) :jm_add_1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 @l_id))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow @l_e)) :else (throw jt))))
            (finally
            (if (some? @l_recordStore)
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :persistanceStrings) :CLOSING_RECORDSTORE) this (JR/fget (JR/fget this :persistanceStrings) :LOAD_ALL))
                (JR/invoke @l_recordStore :jm_closeRecordStore_0)))))))

    
(defn jm_save_2 [this p_abeClientInformation p_hashtable]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_hashtable (volatile! p_hashtable) l_recordStore (volatile! nil) l_byteArrayOutputStream (volatile! nil) l_outputStream (volatile! nil) l_value (volatile! nil) l_commonSeps (volatile! nil) l_objectArray (volatile! nil) l_anyType (volatile! nil) l_size (volatile! nil) l_index (volatile! nil) l_tsUtil (volatile! nil) l_savedGameBytes (volatile! nil) l_e (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :persistanceStrings) :SAVING)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_hashtable))) this (JR/fget (JR/fget this :commonStrings) :SAVE))
            (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation) true))
            (vreset! l_byteArrayOutputStream (new java.io.ByteArrayOutputStream))
            (vreset! l_outputStream (new java.io.DataOutputStream @l_byteArrayOutputStream))
            (vreset! l_value nil)
            (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
            (vreset! l_objectArray (JR/invoke (JR/scall 'HashtableUtil :jm_getInstance_0) :jm_getKeysAsArray_1 @l_hashtable))
            (vreset! l_anyType nil)
            (vreset! l_size (JR/alen @l_objectArray))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (JR/invoke @l_outputStream :jm_writeUTF_1 (JR/aget* @l_objectArray @l_index))
                (JR/invoke @l_outputStream :jm_writeUTF_1 (JR/fget @l_commonSeps :EQUALS))
                (vreset! l_anyType (JR/aget* @l_objectArray @l_index))
                (vreset! l_value (JR/invoke @l_hashtable :jm_get_1 @l_anyType))
                (JR/invoke @l_outputStream :jm_writeUTF_1 @l_value)))
            (vreset! l_tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
            (vreset! l_savedGameBytes (JR/invoke @l_tsUtil :jm_getByteArray_1 (JR/to-string-of @l_byteArrayOutputStream)))
            (JR/invoke @l_recordStore :jm_addRecord_3 @l_savedGameBytes 0 (JR/alen @l_savedGameBytes)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow @l_e)) :else (throw jt))))
            (finally
            (if (some? @l_recordStore)
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :persistanceStrings) :CLOSING_RECORDSTORE) this (JR/fget (JR/fget this :commonStrings) :SAVE))
                (JR/invoke @l_recordStore :jm_closeRecordStore_0)))))))

    
(defn jm_get_1 [this p_index]
  (let [ l_index (volatile! p_index) l_hashtable (volatile! nil)]
        (vreset! l_hashtable (JR/aget* (JR/fget (JR/fget this :valueList) :objectArray) @l_index))
        @l_hashtable))



