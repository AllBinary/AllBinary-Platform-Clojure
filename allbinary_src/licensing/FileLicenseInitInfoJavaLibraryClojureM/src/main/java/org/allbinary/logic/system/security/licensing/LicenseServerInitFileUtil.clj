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
;; package org.allbinary.logic.system.security.licensing

(ns LicenseServerInitFileUtil)

(JR/register 'LicenseServerInitFileUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :NULL_OUTPUT_STREAM nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :NULL_OUTPUT_STREAM (JR/scall 'SimpleFileUtil :jm_nullOutputStream_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LicenseServerInitFileUtil)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let [ l_filePath (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_filePath (JR/fget (JR/scall 'LicenseInitInfoUtil :jm_getInstance_0) :INITFILENAME))
            (JR/invoke (JR/scall 'LicenseInitInfoUtil :jm_getInstance_0) :jm_setFilePath_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
            (if (JR/invoke (JR/scall 'FileFactory :jm_getInstance_0) :jm_isFile_1 @l_filePath)
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Using Existing License File" this (JR/fget (JR/fget this :commonStrings) :INIT)))
                (do
                (JR/invoke this :jm_write_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :INIT) @l_e)) :else (throw jt)))))))

    
(defn jm_write_0 [this]
  (let [ l_fileOutputStream (volatile! nil) l_resourceUtil (volatile! nil) l_filePath (volatile! nil) l_inputStream (volatile! nil) l_fileStreamFactory (volatile! nil) l_b (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)]
        (vreset! l_fileOutputStream (JR/fget this :NULL_OUTPUT_STREAM))
        (try (do
            (vreset! l_resourceUtil (JR/scall 'ResourceUtil :jm_getInstance_0))
            (vreset! l_filePath (JR/fget (JR/scall 'LicenseInitInfoUtil :jm_getInstance_0) :INITFILENAME))
            (vreset! l_inputStream (JR/invoke @l_resourceUtil :jm_getResourceAsStream_1 @l_filePath))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Writing Default License File" this (JR/fget (JR/fget this :commonStrings) :INIT))
            (vreset! l_fileStreamFactory (JR/scall 'FileStreamFactory :jm_getInstance_0))
            (vreset! l_fileOutputStream (JR/invoke @l_fileStreamFactory :jm_getFileOutputStreamInstance_2 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) @l_filePath))
            (vreset! l_b 0)
            (vreset! l_index 0)
            (JR/jwhile true false true
                (vreset! l_b (JR/invoke @l_inputStream :jm_read_0))
                (if (== @l_b (unchecked-int (unchecked-negate (JR/c2i 1))))
                    (do
                    (JR/jbreak)))
                (JR/invoke @l_fileOutputStream :jm_write_1 @l_b)
                (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (str (JR/s "Wrote Bytes: ") (JR/s @l_index)) this (JR/fget (JR/fget this :commonStrings) :INIT))
            (JR/invoke @l_fileOutputStream :jm_flush_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :INIT) @l_e)) :else (throw jt))))
            (finally
            (JR/invoke (JR/scall 'StreamUtil :jm_getInstance_0) :jm_close_1 @l_fileOutputStream)))))



