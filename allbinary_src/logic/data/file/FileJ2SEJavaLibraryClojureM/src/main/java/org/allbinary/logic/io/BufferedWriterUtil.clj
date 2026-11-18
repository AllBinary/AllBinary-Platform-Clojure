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

(ns BufferedWriterUtil)

(JR/register 'BufferedWriterUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BufferedWriterUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :commonLabels nil)
  (JR/fset this :REMOVING_OLD nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
    (JR/fset this :REMOVING_OLD "Remove old for overwriting: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BufferedWriterUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BufferedWriterUtil/jstatic_instance)))

    
(defn jm_overwrite_2 [this p_path p_data]
  (let [ l_path (volatile! p_path) l_data (volatile! p_data) l_abFile (volatile! nil) l_name (volatile! nil) l_abFileDirectory (volatile! nil) l_stringBuilder (volatile! nil) l_result (volatile! nil)]
        (vreset! l_abFile (JR/scall 'AbFile :jm_createAbFile_1 @l_path))
        (if (JR/invoke @l_abFile :jm_exists_0)
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (str (JR/s (JR/fget this :REMOVING_OLD)) (JR/s @l_path)) this (JR/fget (JR/fget this :commonStrings) :CREATE))
            (JR/invoke @l_abFile :jm_delete_0))
            (do
            (vreset! l_name (JR/invoke (JR/scall 'AbPathData :jm_getInstance_0) :jm_removeNameFromPath_1 @l_path))
            (vreset! l_abFileDirectory (JR/scall 'AbFile :jm_createAbFile_1 @l_name))
            (if (JR/invoke @l_abFileDirectory :jm_exists_0)
                (do
                nil)
                (do
                (vreset! l_stringBuilder (StringMaker/jnew_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringBuilder :jm_append_1 (JR/fget (JR/fget this :commonStrings) :CREATE)) :jm_append_1 (JR/fget (JR/fget this :commonLabels) :COLON_SEP)) :jm_append_1 @l_name)) this (JR/fget (JR/fget this :commonStrings) :CREATE))
                (vreset! l_result (JR/invoke @l_abFileDirectory :jm_mkdirs_0))
                (JR/invoke @l_stringBuilder :jm_delete_2 0 (JR/invoke @l_stringBuilder :jm_length_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringBuilder :jm_append_1 (JR/fget (JR/fget this :commonLabels) :RESULT_)) :jm_appendboolean_1 @l_result)) this (JR/fget (JR/fget this :commonStrings) :CREATE))))))
        (JR/invoke this :jm_write_2 @l_abFile @l_data)))

    
(defn jm_overwrite_2 [this p_abFile p_data]
  (let [ l_abFile (volatile! p_abFile) l_data (volatile! p_data) l_name (volatile! nil) l_abFileDirectory (volatile! nil) l_stringBuilder (volatile! nil) l_result (volatile! nil)]
        (if (JR/invoke @l_abFile :jm_exists_0)
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (str (JR/s (JR/fget this :REMOVING_OLD)) (JR/s (JR/invoke @l_abFile :jm_getPath_0))) this (JR/fget (JR/fget this :commonStrings) :CREATE))
            (JR/invoke @l_abFile :jm_delete_0))
            (do
            (vreset! l_name (JR/invoke (JR/scall 'AbPathData :jm_getInstance_0) :jm_removeNameFromPath_1 (JR/invoke @l_abFile :jm_getAbsolutePath_0)))
            (vreset! l_abFileDirectory (JR/scall 'AbFile :jm_createAbFile_1 @l_name))
            (if (JR/invoke @l_abFileDirectory :jm_exists_0)
                (do
                nil)
                (do
                (vreset! l_stringBuilder (StringMaker/jnew_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringBuilder :jm_append_1 (JR/fget (JR/fget this :commonStrings) :CREATE)) :jm_append_1 (JR/fget (JR/fget this :commonLabels) :COLON_SEP)) :jm_append_1 @l_name)) this (JR/fget (JR/fget this :commonStrings) :CREATE))
                (vreset! l_result (JR/invoke @l_abFileDirectory :jm_mkdirs_0))
                (JR/invoke @l_stringBuilder :jm_delete_2 0 (JR/invoke @l_stringBuilder :jm_length_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringBuilder :jm_append_1 (JR/fget (JR/fget this :commonLabels) :RESULT_)) :jm_appendboolean_1 @l_result)) this (JR/fget (JR/fget this :commonStrings) :CREATE))))))
        (JR/invoke this :jm_write_2 @l_abFile @l_data)))

    
(defn jm_write_2 [this p_abFile p_data]
  (let [ l_abFile (volatile! p_abFile) l_data (volatile! p_data) l_fileOut (volatile! nil)]
        (vreset! l_fileOut (new java.io.BufferedWriter (new java.io.FileWriter (JR/scall 'AbFileNativeUtil :jm_get_1 @l_abFile))))
        (JR/invoke @l_fileOut :jm_write_3 @l_data 0 (JR/slength @l_data))
        (JR/invoke @l_fileOut :jm_newLine_0)
        (JR/invoke @l_fileOut :jm_flush_0)))



