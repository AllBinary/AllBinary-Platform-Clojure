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
(ns LogUtil)

(JR/register 'LogUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LogUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logFormatUtil nil)
  (JR/fset this :LOG_SUCCESS nil)
    (JR/fset this :logFormatUtil (JR/scall 'LogFormatUtil :jm_getInstance_0))
    (JR/fset this :LOG_SUCCESS "org.allbinary: ")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LogUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LogUtil)] (jinit_0 o) o))

    
(defn jm_putL_1 [this p_log]
  (let [ l_log (volatile! p_log) l_exception (volatile! nil) l_specialMessage (volatile! nil) l_anyType (volatile! nil) l_functionName (volatile! nil)](JR/method
        (if (JR/eq @l_log (JR/sget 'LogFactory "LOG"))
            (do
            (JR/jreturn)))
        (vreset! l_exception (JR/invoke @l_log :jm_getThrowable_0))
        (if (nil? @l_exception)
            (do
            (JR/jreturn)))
        (vreset! l_specialMessage (JR/invoke @l_log :jm_getSpecialMessage_0))
        (vreset! l_anyType (JR/invoke @l_log :jm_getObject_0))
        (vreset! l_functionName (JR/invoke @l_log :jm_getFunctionName_0))
        (JR/invoke this :jm_put_4 @l_specialMessage @l_anyType @l_functionName @l_exception))))

    
(defn jm_putF_3 [this p_specialMessage p_anyType p_functionName]
  (let [ l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName)]
        nil))

    
(defn jm_putFS_3 [this p_specialMessage p_className p_functionName]
  (let [ l_specialMessage (volatile! p_specialMessage) l_className (volatile! p_className) l_functionName (volatile! p_functionName)]
        nil))

    
(defn jm_put_4 [this p_specialMessage p_anyType p_functionName p_exception]
  (let [ l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName) l_exception (volatile! p_exception) l_className (volatile! nil) l_message (volatile! nil)]
        (vreset! l_className (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :EMPTY))
        (if (some? (JR/class-name @l_anyType))
            (do
            (vreset! l_className (JR/new-string (JR/class-name @l_anyType)))))
        (vreset! l_message (JR/invoke (JR/fget this :logFormatUtil) :jm_get_4 @l_className @l_functionName @l_specialMessage @l_exception))
        (JR/print* (JR/fget this :LOG_SUCCESS))
        (JR/println* @l_message)))



