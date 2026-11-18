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

(ns BasicPersitance)

(JR/register 'BasicPersitance nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :persistanceStrings nil)
  (JR/fset this :platformRecordIdUtil nil)
  (JR/fset this :recordId nil)
  (JR/fset this :valueList nil)
  (JR/fset this :idList nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :persistanceStrings (JR/scall 'PersistanceStrings :jm_getInstance_0))
    (JR/fset this :platformRecordIdUtil (JR/scall 'PlatformRecordIdUtil :jm_getInstance_0))
    (JR/fset this :valueList (BasicArrayListD/jnew_0))
    (JR/fset this :idList (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_1 [this p_recordId]
  (let [ l_recordId (volatile! p_recordId)]
    nil (jinitfields this)
        (JR/fset this :recordId @l_recordId))
  this)

(defn jnew_1 [p_recordId ]
  (let [o (JR/alloc 'BasicPersitance)] (jinit_1 o p_recordId) o))

    
(defn jm_deleteRecoreStore_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/scall 'RecordStore :jm_deleteRecordStore_1 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation))))

    
(defn jm_deleteAll_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_size (volatile! nil) l_integer (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke (JR/fget this :idList) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_integer (JR/aget* (JR/fget (JR/fget this :idList) :objectArray) @l_index))
            (JR/invoke this :jm_delete_2 @l_abeClientInformation (JR/invoke @l_integer :jm_intValue_0))))
        (JR/invoke this :jm_clear_0)))

    
(defn jm_delete_2 [this p_abeClientInformation p_deleteId]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_deleteId (volatile! p_deleteId) l_recordStore (volatile! nil) l_e (volatile! nil)]
        (vreset! l_recordStore (JR/sget 'NullRecordStore "NULL_RECORD_STORE"))
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :persistanceStrings) :DELETING_WITH_ID)) :jm_appendint_1 @l_deleteId)) this (JR/fget (JR/fget this :commonStrings) :delete))
            (vreset! l_recordStore (JR/scall 'RecordStore :jm_openRecordStore_2 (JR/invoke this :jm_getRecordId_1 @l_abeClientInformation) true))
            (JR/invoke @l_recordStore :jm_deleteRecord_1 @l_deleteId))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow @l_e)) :else (throw jt))))
            (finally
            (if (some? @l_recordStore)
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :persistanceStrings) :CLOSING_RECORDSTORE) this (JR/fget (JR/fget this :commonStrings) :delete))
                (JR/invoke @l_recordStore :jm_closeRecordStore_0)))))))

    
(defn jm_getRecordId_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke (JR/fget this :platformRecordIdUtil) :jm_getRecordId_2 @l_abeClientInformation (JR/fget this :recordId))))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :valueList)))

    
(defn jm_getIds_0 [this]
  (let []
        (JR/fget this :idList)))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :valueList) :jm_clear_0)
        (JR/invoke (JR/fget this :idList) :jm_clear_0)))



