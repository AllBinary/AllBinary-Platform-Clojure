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

(ns PartnerIdentifierFileUtil)

(JR/register 'PartnerIdentifierFileUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PartnerIdentifierFileUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :FILE_NAME nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :FILE_NAME "partner.txt")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PartnerIdentifierFileUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PartnerIdentifierFileUtil/jstatic_instance)))

    
(defn jm_get_0 [this]
  (let [ l_resourceUtil (volatile! nil) l_inputStream (volatile! nil) l_inputStreamReader (volatile! nil) l_chars (volatile! nil) l_size (volatile! nil) l_partnerString (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_resourceUtil (JR/scall 'ResourceUtil :jm_getInstance_0))
            (vreset! l_inputStream (JR/invoke @l_resourceUtil :jm_getResourceAsStream_1 (JR/fget this :FILE_NAME)))
            (vreset! l_inputStreamReader (new java.io.InputStreamReader @l_inputStream))
            (vreset! l_chars (JR/anew "CHAR" 1 30))
            (vreset! l_size (JR/invoke @l_inputStreamReader :jm_read_1 @l_chars))
            (vreset! l_partnerString (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
            (if (> @l_size 0)
                (do
                (vreset! l_partnerString (JR/new-string @l_chars 0 @l_size))))
            (JR/invoke @l_inputStreamReader :jm_close_0)
            (JR/jreturn @l_partnerString))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :GET) @l_e)
            (JR/jreturn (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING))) :else (throw jt))))))))



