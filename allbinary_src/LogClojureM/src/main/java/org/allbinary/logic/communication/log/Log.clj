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

(ns Log)

(JR/register 'Log nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logFormatUtil nil)
  (JR/fset this :specialMessage nil)
  (JR/fset this :anyType nil)
  (JR/fset this :functionName nil)
  (JR/fset this :exception nil)
    (JR/fset this :logFormatUtil (JR/scall 'LogFormatUtil :jm_getInstance_0))
  this)

    
(defn jinit_4 [this p_specialMessage p_anyType p_functionName p_exception]
  (let [ l_specialMessage (volatile! p_specialMessage) l_anyType (volatile! p_anyType) l_functionName (volatile! p_functionName) l_exception (volatile! p_exception)]
    nil (jinitfields this)
        (JR/fset this :specialMessage @l_specialMessage)
        (JR/fset this :anyType @l_anyType)
        (JR/fset this :functionName @l_functionName)
        (JR/fset this :exception @l_exception))
  this)

(defn jnew_4 [p_specialMessage p_anyType p_functionName p_exception ]
  (let [o (JR/alloc 'Log)] (jinit_4 o p_specialMessage p_anyType p_functionName p_exception) o))

    
(defn jm_getSpecialMessage_0 [this]
  (let []
        (JR/fget this :specialMessage)))

    
(defn jm_getObject_0 [this]
  (let []
        (JR/fget this :anyType)))

    
(defn jm_getFunctionName_0 [this]
  (let []
        (JR/fget this :functionName)))

    
(defn jm_getThrowable_0 [this]
  (let []
        (JR/fget this :exception)))

    
(defn jm_toString_0 [this]
  (let [ l_className (volatile! nil) l_clazz (volatile! nil)]
        (vreset! l_className (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :EMPTY))
        (vreset! l_clazz (JR/class-name (JR/fget this :anyType)))
        (if (some? (JR/invoke @l_clazz :jm_getName_0))
            (do
            (vreset! l_className (JR/invoke @l_clazz :jm_getName_0))))
        (JR/invoke (JR/fget this :logFormatUtil) :jm_get_4 @l_className (JR/fget this :functionName) (JR/fget this :specialMessage) (JR/fget this :exception))))



