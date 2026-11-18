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
;; package org.allbinary.game.input

;;GameInputNoPersistanceLibrary
(ns InputPersistance)

(JR/register 'InputPersistance 'BasicPersitance '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :hashtableUtil nil)
    (JR/fset this :hashtableUtil (JR/scall 'HashtableUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (BasicPersitance/jinit_1 this @l_name) (jinitfields this))
  this)

(defn jnew_1 [p_name ]
  (let [o (JR/alloc 'InputPersistance)] (jinit_1 o p_name) o))

    
(defn jm_loadAll_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_recordStore (volatile! nil) l_recordEnum (volatile! nil) l_hashtable (volatile! nil) l_stringBuffer (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil) l_id (volatile! nil)]
        (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation) true))
        (vreset! l_recordEnum (JR/invoke @l_recordStore :jm_enumerateRecords_3 (JR/sget 'NullRecordFilter "NULL_RECORD_FILTER") (JR/sget 'NullRecordComparator "NULL_RECORD_COMPARATOR") true))
        (vreset! l_hashtable nil)
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (vreset! l_id 0)
        (JR/jwhile false false (JR/invoke @l_recordEnum :jm_hasNextElement_0)
            (vreset! l_id (JR/invoke @l_recordEnum :jm_nextRecordId_0))
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :persistanceStrings) :LOADING_ID)) :jm_appendint_1 @l_id)) this (JR/fget (JR/fget this :persistanceStrings) :LOAD_ALL))
            (vreset! l_hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
            (JR/invoke (JR/fget this :valueList) :jm_add_1 @l_hashtable)
            (JR/invoke (JR/fget this :idList) :jm_add_1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 @l_id)))
        (JR/invoke @l_recordStore :jm_closeRecordStore_0)))

    
(defn jm_save_2 [this p_abeClientInformation p_hashtable]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_hashtable (volatile! p_hashtable) l_recordStore (volatile! nil) l_gameActionInput (volatile! nil) l_list (volatile! nil) l_input (volatile! nil) l_inputObjectArray (volatile! nil) l_size (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)]
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :persistanceStrings) :NOT_SAVING)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_hashtable))) this (JR/fget (JR/fget this :commonStrings) :SAVE))
        (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation) true))
        (vreset! l_gameActionInput nil)
        (vreset! l_list nil)
        (vreset! l_input nil)
        (vreset! l_inputObjectArray (JR/invoke (JR/fget this :hashtableUtil) :jm_getKeysAsArray_1 @l_hashtable))
        (vreset! l_size (JR/alen @l_inputObjectArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_gameActionInput (JR/aget* @l_inputObjectArray @l_index))
            (vreset! l_list (JR/invoke @l_hashtable :jm_get_1 (JR/aget* @l_inputObjectArray @l_index)))
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 (JR/invoke @l_list :jm_size_0)) (do (JR/vinc l_index2 1 :int false))
                (vreset! l_input (JR/invoke @l_list :jm_get_1 @l_index2))))))
        (JR/invoke @l_recordStore :jm_closeRecordStore_0)))



