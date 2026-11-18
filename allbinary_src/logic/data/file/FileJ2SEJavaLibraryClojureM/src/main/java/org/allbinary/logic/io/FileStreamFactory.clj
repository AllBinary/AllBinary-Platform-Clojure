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

(ns FileStreamFactory)

(JR/register 'FileStreamFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (FileStreamFactory/jstatic_SINGLETON) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (FileStreamFactory/jstatic_set_SINGLETON (FileStreamFactory/jnew_0))))
        (FileStreamFactory/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'FileStreamFactory)] (jinit_0 o) o))

    
(defn jm_getFileInputStreamInstance_2 [this p_path p_fileName]
  (let [ l_path (volatile! p_path) l_fileName (volatile! p_fileName) l_FILEABPATH (volatile! nil) l_file (volatile! nil)]
        (vreset! l_FILEABPATH (AbPath/jnew_2 @l_path @l_fileName))
        (vreset! l_file (JR/scall 'AbFile :jm_createAbFileFromAbPath_1 @l_FILEABPATH))
        (JR/scall 'AbFileInputStream :jm_createFromAbFile_1 @l_file)))

    
(defn jm_getFileOutputStreamInstance_2 [this p_path p_fileName]
  (let [ l_path (volatile! p_path) l_fileName (volatile! p_fileName) l_FILEABPATH (volatile! nil) l_file (volatile! nil)]
        (vreset! l_FILEABPATH (AbPath/jnew_2 @l_path @l_fileName))
        (vreset! l_file (JR/scall 'AbFile :jm_createAbFileFromAbPath_1 @l_FILEABPATH))
        (if (JR/invoke @l_file :jm_exists_0)
            (do
            (JR/invoke @l_file :jm_delete_0)
            (JR/invoke @l_file :jm_createNewFile_0)))
        (JR/scall 'AbFileOutputStream :jm_createFromAbFile_1 @l_file)))

    
(defn jm_delete_2 [this p_path p_fileName]
  (let [ l_path (volatile! p_path) l_fileName (volatile! p_fileName) l_FILEABPATH (volatile! nil) l_file (volatile! nil)]
        (vreset! l_FILEABPATH (AbPath/jnew_2 @l_path @l_fileName))
        (vreset! l_file (JR/scall 'AbFile :jm_createAbFileFromAbPath_1 @l_FILEABPATH))
        (JR/invoke @l_file :jm_delete_0)))



