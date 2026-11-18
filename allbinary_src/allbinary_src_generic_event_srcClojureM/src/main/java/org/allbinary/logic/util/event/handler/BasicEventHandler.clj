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
;; package org.allbinary.logic.util.event.handler

(ns BasicEventHandler)

(JR/register 'BasicEventHandler nil '[BasicEventHandlerInterface])

(def jsv_PERFORMANCE_MESSAGE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_PERFORMANCE_MESSAGE [] (JR/ensure-init jclinit-state jclinit) @jsv_PERFORMANCE_MESSAGE)
(defn jstatic_set_PERFORMANCE_MESSAGE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_PERFORMANCE_MESSAGE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_PERFORMANCE_MESSAGE "Use Custom onEvent Methods for needed optimization")
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :eventListenerInterfaceList nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :eventListenerInterfaceList (BasicArrayListD/jnew_0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicEventHandler)] (jinit_0 o) o))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_LISTENER (volatile! nil) l_eventListenerInterface (volatile! nil) l_index (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_LISTENER " Listener: ")
        (JR/invoke @l_stringBuffer :jm_append_1 "Total Listeners: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_size_0))
        (vreset! l_eventListenerInterface nil)
        (vreset! l_index 0)
        (JR/jwhile false false (< @l_index (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_size_0))
            (try (do
                (vreset! l_eventListenerInterface (JR/aget* (JR/fget (JR/fget this :eventListenerInterfaceList) :objectArray) @l_index))
                (JR/invoke @l_stringBuffer :jm_append_1 @l_LISTENER)
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_eventListenerInterface)))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :TOSTRING) @l_e)) :else (throw jt)))))
            (JR/vinc l_index 1 :int false))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_removeAllListeners_0 [this]
  (let []
        (JR/fset this :eventListenerInterfaceList (BasicArrayListD/jnew_0))))

    
(defn jm_addListenerSingleThreaded_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (if (not (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_contains_1 @l_eventListenerInterface))
            (do
            (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_add_1 @l_eventListenerInterface)))))

    
(defn jm_addListenerInterface_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (if (not (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_contains_1 @l_eventListenerInterface))
            (do
            (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_add_1 @l_eventListenerInterface)))))

    
(defn jm_removeListenerSingleThreaded_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_remove_1 @l_eventListenerInterface)))

    
(defn jm_removeListener_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_remove_1 @l_eventListenerInterface)))

    
(defn jm_fireEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject) l_index (volatile! nil) l_eventListenerInterface (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (vreset! l_index 0)
        (vreset! l_eventListenerInterface nil)
        (JR/jwhile false false (< @l_index (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_size_0))
            (try (do
                (vreset! l_eventListenerInterface (JR/aget* (JR/fget (JR/fget this :eventListenerInterfaceList) :objectArray) @l_index))
                (JR/invoke this :jm_process_2 @l_eventObject @l_eventListenerInterface))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :FIRE_EVENT) @l_e)) :else (throw jt)))))
            (JR/vinc l_index 1 :int false))))

    
(defn jm_process_2 [this p_eventObject p_eventListenerInterface]
  (let [ l_eventObject (volatile! p_eventObject) l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke @l_eventListenerInterface :jm_onEvent_1 @l_eventObject)))

    
(defn jm_getEventListenerInterfaceListP_0 [this]
  (let []
        (JR/fget this :eventListenerInterfaceList)))



