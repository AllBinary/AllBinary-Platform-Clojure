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

;;ActualPlatform
(ns PreLogUtil)

(JR/register 'PreLogUtil nil '[])

(def jsv_LOG_SUCCESS (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_LOG_SUCCESS [] (JR/ensure-init jclinit-state jclinit) @jsv_LOG_SUCCESS)
(defn jstatic_set_LOG_SUCCESS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_LOG_SUCCESS v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_LOG_SUCCESS "org.allbinary: ")
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'PreLogUtil)] (jinit_0 o) o))

    
(defn jm_put_3 [p_specialMessage p_anyType p_functionName]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName)]
        (PreLogUtil/jm_putOE_4 @l_specialMessage @l_anyType @l_functionName (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))))

    
(defn jm_putOE_4 [p_specialMessage p_anyType p_functionName p_exception]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName) l_exception (volatile! p_exception) l_className (volatile! nil) l_message (volatile! nil)]
        (vreset! l_className (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :EMPTY))
        (if (some? (JR/class-name @l_anyType))
            (do
            (vreset! l_className (JR/new-string (JR/class-name @l_anyType)))))
        (vreset! l_message (JR/invoke (JR/scall 'LogFormatUtil :jm_getInstance_0) :jm_get_4 @l_className @l_functionName @l_specialMessage @l_exception))
        (JR/print* (PreLogUtil/jstatic_LOG_SUCCESS))
        (JR/println* @l_message)))

    
(defn jm_putS_3 [p_specialMessage p_className p_functionName]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_className (volatile! p_className) l_functionName (volatile! p_functionName)]
        (PreLogUtil/jm_putSE_4 @l_specialMessage @l_className @l_functionName (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))))

    
(defn jm_putSE_4 [p_specialMessage p_className p_functionName p_exception]
  (let [this nil l_specialMessage (volatile! p_specialMessage) l_className (volatile! p_className) l_functionName (volatile! p_functionName) l_exception (volatile! p_exception) l_message (volatile! nil)]
        (vreset! l_message (JR/invoke (JR/scall 'LogFormatUtil :jm_getInstance_0) :jm_get_4 @l_className @l_functionName @l_specialMessage @l_exception))
        (JR/print* (PreLogUtil/jstatic_LOG_SUCCESS))
        (JR/println* @l_message)))



