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
;; package org.allbinary.logic.communication.log

;;NoPlatform
(ns LogFormatUtil)

(JR/register 'LogFormatUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LogFormatUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LogFormatUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LogFormatUtil)] (jinit_0 o) o))

    
(defn jm_get_4 [this p_className p_functionName p_specialMessage p_exception]
  (let [ l_className (volatile! p_className) l_functionName (volatile! p_functionName) l_specialMessage (volatile! p_specialMessage) l_exception (volatile! p_exception)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getS_3 [this p_className p_functionName p_specialMessage]
  (let [ l_className (volatile! p_className) l_functionName (volatile! p_functionName) l_specialMessage (volatile! p_specialMessage)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getO_1 [this p_exception]
  (let [ l_exception (volatile! p_exception)]
        (JR/jthrow (new java.lang.RuntimeException))))



