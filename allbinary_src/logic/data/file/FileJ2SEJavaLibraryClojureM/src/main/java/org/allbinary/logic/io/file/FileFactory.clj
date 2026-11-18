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
;; package org.allbinary.logic.io.file

(ns FileFactory)

(JR/register 'FileFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (FileFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'FileFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FileFactory/jstatic_instance)))

    
(defn jm_getInstance_1 [this p_filePath]
  (let [ l_filePath (volatile! p_filePath)]
        (JR/scall 'AbFile :jm_createAbFileFromRawPath_1 @l_filePath)))

    
(defn jm_getInstance_2 [this p_file p_childFilePath]
  (let [ l_file (volatile! p_file) l_childFilePath (volatile! p_childFilePath)]
        (JR/scall 'AbFile :jm_createAbFileWithChild_2 @l_file @l_childFilePath)))

    
(defn jm_isFile_1 [this p_path]
  (let [ l_path (volatile! p_path) l_file (volatile! nil)]
        (vreset! l_file (JR/scall 'AbFile :jm_createAbFile_1 @l_path))
        (if (JR/invoke @l_file :jm_exists_0)
            (do
            true)
            (do
            false))))



