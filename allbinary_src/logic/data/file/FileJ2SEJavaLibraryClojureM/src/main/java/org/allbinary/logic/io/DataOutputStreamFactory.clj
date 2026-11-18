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
;; package org.allbinary.logic.io

(ns DataOutputStreamFactory)

(JR/register 'DataOutputStreamFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DataOutputStreamFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DataOutputStreamFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DataOutputStreamFactory/jstatic_instance)))

    
(defn jm_getInstanceForAbFile_1 [this p_file]
  (let [ l_file (volatile! p_file) l_idFileOutputStream (volatile! nil) l_idOutData (volatile! nil)]
        (vreset! l_idFileOutputStream (JR/scall 'AbFileOutputStream :jm_createFromAbFile_1 @l_file))
        (vreset! l_idOutData (AbDataOutputStream/jnew_1 @l_idFileOutputStream))
        @l_idOutData))

    
(defn jm_getInstance_2 [this p_filePath p_fileName]
  (let [ l_filePath (volatile! p_filePath) l_fileName (volatile! p_fileName) l_fileStreamFactory (volatile! nil) l_fileOutputStream (volatile! nil) l_idOutData (volatile! nil)]
        (vreset! l_fileStreamFactory (JR/scall 'FileStreamFactory :jm_getInstance_0))
        (vreset! l_fileOutputStream (JR/invoke @l_fileStreamFactory :jm_getFileOutputStreamInstance_2 @l_filePath @l_fileName))
        (vreset! l_idOutData (AbDataOutputStream/jnew_1 @l_fileOutputStream))
        @l_idOutData))



