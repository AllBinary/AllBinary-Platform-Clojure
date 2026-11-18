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
;; package org.allbinary.business.init

(ns LicenseInitInfoUtil)

(JR/register 'LicenseInitInfoUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LicenseInitInfoUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :stringUtil nil)
  (JR/fset this :INITFILENAME nil)
  (JR/fset this :ABOUT nil)
  (JR/fset this :PRIVACY_POLICY nil)
  (JR/fset this :filePath nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
    (JR/fset this :INITFILENAME "licenseinitdata.dat")
    (JR/fset this :ABOUT "about")
    (JR/fset this :PRIVACY_POLICY "privacy_policy")
    (JR/fset this :filePath (JR/fget (JR/fget this :stringUtil) :EMPTY_STRING))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LicenseInitInfoUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LicenseInitInfoUtil/jstatic_instance)))

    
(defn jm_setFilePath_1 [this p_filePath]
  (let [ l_filePath (volatile! p_filePath)]
        (JR/fset this :filePath @l_filePath)))

    
(defn jm_write_1 [this p_initData]
  (let [ l_initData (volatile! p_initData) l_tsUtil (volatile! nil) l_dataOutputStream (volatile! nil) l_licenseIdCrypted (volatile! nil) l_numberOfLicenseServers (volatile! nil) l_licenseServerCrypted (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)]
        (if (JR/eq (JR/fget this :filePath) (JR/fget (JR/fget this :stringUtil) :EMPTY_STRING))
            (do
            (JR/fset this :filePath (str (JR/s (JR/scall 'URLGLOBALS :jm_getMainPath_0)) (JR/s (JR/fget (JR/scall 'PATH_GLOBALS :jm_getInstance_0) :INIT_PATH))))))
        (try (do
            (vreset! l_tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
            (vreset! l_dataOutputStream (JR/invoke (JR/scall 'DataOutputStreamFactory :jm_getInstance_0) :jm_getInstance_2 (JR/fget this :filePath) (JR/fget this :INITFILENAME)))
            (vreset! l_licenseIdCrypted (JR/invoke @l_tsUtil :jm_getByteArray_1 (JR/invoke (WeakCrypt/jnew_1 1) :jm_encrypt_1 (JR/invoke @l_initData :jm_getLicenseId_0))))
            (JR/invoke @l_dataOutputStream :jm_writeUTF_1 (JR/scall 'DatabaseEncoder :jm_encode_1 @l_licenseIdCrypted))
            (vreset! l_numberOfLicenseServers (JR/invoke @l_initData :jm_getNumberOfServers_0))
            (JR/invoke @l_dataOutputStream :jm_writeInt_1 @l_numberOfLicenseServers)
            (vreset! l_licenseServerCrypted nil)
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_numberOfLicenseServers) (do (JR/vinc l_index 1 :int false))
                (vreset! l_licenseServerCrypted (JR/invoke @l_tsUtil :jm_getByteArray_1 (JR/invoke (WeakCrypt/jnew_1 3) :jm_encrypt_1 (JR/invoke @l_initData :jm_getServer_1 @l_index))))
                (JR/invoke @l_dataOutputStream :jm_writeUTF_1 (JR/scall 'DatabaseEncoder :jm_encode_1 @l_licenseServerCrypted)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (str (JR/s "Command Failed: ") (JR/s (JR/fget this :INITFILENAME))) this "write" @l_e)
            (JR/invoke (JR/scall 'FileStreamFactory :jm_getInstance_0) :jm_delete_2 (JR/fget this :filePath) (JR/fget this :INITFILENAME))
            (JR/jthrow @l_e)) :else (throw jt)))))))

    
(defn jm_read_0 [this]
  (let []
        (JR/invoke this :jm_readAgain_1 0)))

    
(defn jm_readAgain_1 [this p_initializeCounter]
  (let [ l_initializeCounter (volatile! p_initializeCounter) l_METHOD_NAME (volatile! nil) l_fileStreamFactory (volatile! nil) l_iFile (volatile! nil) l_iData (volatile! nil) l_initInfo (volatile! nil) l_decodedByteArray (volatile! nil) l_licenseIdDecoded (volatile! nil) l_numberOfLicenseServers (volatile! nil) l_NEXT_FILE (volatile! nil) l_licenseServerDecoded (volatile! nil) l_index (volatile! nil) l_e2 (volatile! nil) l_e (volatile! nil)](JR/method
        (vreset! l_METHOD_NAME "readAgain")
        (if (JR/eq (JR/fget this :filePath) (JR/fget (JR/fget this :stringUtil) :EMPTY_STRING))
            (do
            (JR/fset this :filePath (str (JR/s (JR/scall 'URLGLOBALS :jm_getMainPath_0)) (JR/s (JR/fget (JR/scall 'PATH_GLOBALS :jm_getInstance_0) :INIT_PATH))))))
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (str (JR/s "LicenseInitInfo File: ") (JR/s (JR/fget this :INITFILENAME))) this @l_METHOD_NAME)
            (vreset! l_fileStreamFactory (JR/scall 'FileStreamFactory :jm_getInstance_0))
            (vreset! l_iFile (JR/invoke @l_fileStreamFactory :jm_getFileInputStreamInstance_2 (JR/fget this :filePath) (JR/fget this :INITFILENAME)))
            (if (some? @l_iFile)
                (do
                (vreset! l_iData (AbDataInputStream/jnew_1 @l_iFile))
                (vreset! l_initInfo (LicenseInitInfo/jnew_0))
                (vreset! l_decodedByteArray (JR/scall 'DatabaseEncoder :jm_decode_1 (JR/invoke @l_iData :jm_readUTF_0)))
                (vreset! l_licenseIdDecoded (JR/new-string @l_decodedByteArray))
                (JR/invoke @l_initInfo :jm_setLicenseId_1 (JR/invoke (WeakCrypt/jnew_1 1) :jm_decrypt_1 @l_licenseIdDecoded))
                (vreset! l_numberOfLicenseServers (JR/invoke @l_iData :jm_readInt_0))
                (vreset! l_NEXT_FILE (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :NEXT)) :jm_append_1 " License Server From File: ")))
                (vreset! l_licenseServerDecoded nil)
                (do (vreset! l_index 0)
                    (JR/jfor false false (< @l_index @l_numberOfLicenseServers) (do (JR/vinc l_index 1 :int false))
                    (vreset! l_decodedByteArray (JR/scall 'DatabaseEncoder :jm_decode_1 (JR/invoke @l_iData :jm_readUTF_0)))
                    (vreset! l_licenseServerDecoded (JR/new-string @l_decodedByteArray))
                    (JR/invoke @l_initInfo :jm_setServer_2 (JR/invoke (WeakCrypt/jnew_1 3) :jm_decrypt_1 @l_licenseServerDecoded) @l_index)
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (str (JR/s @l_NEXT_FILE) (JR/s (JR/invoke @l_initInfo :jm_getServer_1 @l_index))) this @l_METHOD_NAME)))
                (JR/jreturn @l_initInfo))
                (do
                (JR/jthrow (new java.lang.Exception (str (JR/s "Could Not Load License InitInfo: ") (JR/s (JR/fget this :INITFILENAME))))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (try (do
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (str (JR/s "Command Failed: ") (JR/s (JR/fget this :INITFILENAME))) this @l_METHOD_NAME @l_e))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e2 je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (str (JR/s "LicenseInitInfo Read Retry: ") (JR/s (JR/fget this :INITFILENAME))) this "readAgain()" @l_e2)) :else (throw jt)))))
            (JR/jthrow (new java.lang.Exception (str (JR/s "LicenseInitInfo Read Error: ") (JR/s (JR/fget this :INITFILENAME)))))) :else (throw jt))))))))

    
(defn jm_getFilePath_0 [this]
  (let []
        (JR/fget this :filePath)))



