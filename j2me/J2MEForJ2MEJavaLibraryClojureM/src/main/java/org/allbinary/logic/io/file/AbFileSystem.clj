;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2026 AllBinary 
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

;;J2MEForJ2ME
(ns AbFileSystem)

(JR/register 'AbFileSystem nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AbFileSystem/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AbFileSystem)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AbFileSystem/jstatic_instance)))

    
(defn jm_isDirectoryOrFile_1 [this p_path]
  (let [ l_path (volatile! p_path)]
        false))

    
(defn jm_isDirectory_1 [this p_path]
  (let [ l_path (volatile! p_path)]
        false))

    
(defn jm_getFilesAsStringArrayForPath_1 [this p_currentDirPath]
  (let [ l_currentDirPath (volatile! p_currentDirPath)]
        (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0)))

    
(defn jm_readAsString_1 [this p_fileName]
  (let [ l_fileName (volatile! p_fileName) l_bytes (volatile! nil)]
        (vreset! l_bytes (JR/anew "BYTE" 1 1000000))
        (JR/invoke this :jm_readAsString_2 @l_fileName @l_bytes)))

    
(defn jm_readAsString_2 [this p_fileName p_bytes]
  (let [ l_fileName (volatile! p_fileName) l_bytes (volatile! p_bytes)]
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_close_1 [this p_closeable]
  (let [ l_closeable (volatile! p_closeable) l_inputStream (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (if (some? @l_closeable)
                (do
                (vreset! l_inputStream @l_closeable)
                (JR/invoke @l_inputStream :jm_close_0)))
            (JR/jreturn true))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :CLOSE) @l_e)
            (JR/jreturn false)) :else (throw jt))))))))



