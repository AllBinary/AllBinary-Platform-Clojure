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

(ns BufferedIOUtil)

(JR/register 'BufferedIOUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BufferedIOUtil)] (jinit_0 o) o))

    
(defn jm_copy_2 [p_backupFile p_backupFileBak]
  (let [this nil l_backupFile (volatile! p_backupFile) l_backupFileBak (volatile! p_backupFileBak) l_line (volatile! nil) l_tmpOut (volatile! nil) l_tmpIn (volatile! nil)]
        (vreset! l_line (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
        (vreset! l_tmpOut (new java.io.BufferedWriter (new java.io.FileWriter (JR/scall 'AbFileNativeUtil :jm_get_1 @l_backupFileBak))))
        (vreset! l_tmpIn (new java.io.BufferedReader (new java.io.FileReader (JR/scall 'AbFileNativeUtil :jm_get_1 @l_backupFile))))
        (JR/jwhile false false (JR/invoke @l_tmpIn :jm_ready_0)
            (vreset! l_line (JR/invoke @l_tmpIn :jm_readLine_0))
            (JR/invoke @l_tmpOut :jm_write_3 @l_line 0 (JR/slength @l_line))
            (JR/invoke @l_tmpOut :jm_newLine_0))
        (JR/invoke @l_tmpOut :jm_flush_0)))



