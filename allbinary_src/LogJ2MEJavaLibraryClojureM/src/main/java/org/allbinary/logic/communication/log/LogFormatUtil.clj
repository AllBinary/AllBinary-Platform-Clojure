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
  (JR/fset this :timeStampUtil nil)
  (JR/fset this :commonSeps nil)
  (JR/fset this :NONE nil)
  (JR/fset this :LOG_ERROR nil)
  (JR/fset this :EMPTY nil)
  (JR/fset this :STACK_TRACE nil)
  (JR/fset this :TIME nil)
  (JR/fset this :CLASS_NAME nil)
  (JR/fset this :FUNCTION_CALL nil)
  (JR/fset this :SPECIAL_MESSAGE nil)
  (JR/fset this :stringUtil nil)
  (JR/fset this :exceptionUtil nil)
  (JR/fset this :nullUtil nil)
    (JR/fset this :timeStampUtil (JR/scall 'TimeStampUtil :jm_getInstance_0))
    (JR/fset this :commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
    (JR/fset this :NONE "None")
    (JR/fset this :LOG_ERROR "\nLog-Error: ")
    (JR/fset this :EMPTY "Empty")
    (JR/fset this :STACK_TRACE "\nStack Trace: ")
    (JR/fset this :TIME "Time: ")
    (JR/fset this :CLASS_NAME (JR/fget (JR/fget this :commonSeps) :SPACE))
    (JR/fset this :FUNCTION_CALL (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :COLON_SEP))
    (JR/fset this :SPECIAL_MESSAGE "> ")
    (JR/fset this :stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
    (JR/fset this :exceptionUtil (JR/scall 'ExceptionUtil :jm_getInstance_0))
    (JR/fset this :nullUtil (JR/scall 'NullUtil :jm_getInstance_0))
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
  (let [ l_className (volatile! p_className) l_functionName (volatile! p_functionName) l_specialMessage (volatile! p_specialMessage) l_exception (volatile! p_exception) l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (JR/invoke this :jm_getF_2 @l_className @l_functionName))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getO_1 @l_exception))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :SPECIAL_MESSAGE))
        (JR/invoke @l_stringBuffer :jm_append_1 @l_specialMessage)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :NEW_LINE))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getS_3 [this p_className p_functionName p_specialMessage]
  (let [ l_className (volatile! p_className) l_functionName (volatile! p_functionName) l_specialMessage (volatile! p_specialMessage) l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (JR/invoke this :jm_getF_2 @l_className @l_functionName))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :SPECIAL_MESSAGE))
        (JR/invoke @l_stringBuffer :jm_append_1 @l_specialMessage)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :NEW_LINE))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getF_2 [this p_className p_functionName]
  (let [ l_className (volatile! p_className) l_functionName (volatile! p_functionName) l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :TIME))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :timeStampUtil) :jm_getAsString_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :CLASS_NAME))
        (JR/invoke @l_stringBuffer :jm_append_1 @l_className)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :FUNCTION_CALL))
        (JR/invoke @l_stringBuffer :jm_append_1 @l_functionName)
        @l_stringBuffer))

    
(defn jm_getO_1 [this p_exception]
  (let [ l_exception (volatile! p_exception) l_stringBuffer (volatile! nil) l_exceptionAsString (volatile! nil)]
        (if (not (JR/eq @l_exception (JR/fget (JR/fget this :nullUtil) :NULL_OBJECT)))
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :LOG_ERROR))
            (vreset! l_exceptionAsString (JR/to-string-of @l_exception))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_exceptionAsString)
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :STACK_TRACE))
            (if (not (JR/eq @l_exception (JR/fget (JR/fget this :nullUtil) :NULL_OBJECT)))
                (do
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :exceptionUtil) :jm_getStackTrace_1 @l_exception)))
                (do
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :stringUtil) :NULL_STRING))))
            (JR/to-string-of @l_stringBuffer))
            (do
            (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))))



