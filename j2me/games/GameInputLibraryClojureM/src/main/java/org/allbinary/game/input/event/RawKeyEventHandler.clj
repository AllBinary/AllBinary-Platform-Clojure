;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.game.input.event

(ns RawKeyEventHandler)

(JR/register 'RawKeyEventHandler nil '[])

(def jsv_instance (atom nil))
(def jsv_TOTAL_LISTENERS (atom nil))
(def jsv_LISTENER_LABEL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))
(defn jstatic_TOTAL_LISTENERS [] (JR/ensure-init jclinit-state jclinit) @jsv_TOTAL_LISTENERS)
(defn jstatic_set_TOTAL_LISTENERS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TOTAL_LISTENERS v))
(defn jstatic_LISTENER_LABEL [] (JR/ensure-init jclinit-state jclinit) @jsv_LISTENER_LABEL)
(defn jstatic_set_LISTENER_LABEL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_LISTENER_LABEL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (RawKeyEventHandler/jnew_0))
    (reset! jsv_TOTAL_LISTENERS "Total Listeners: ")
    (reset! jsv_LISTENER_LABEL " Listener: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :eventListenerInterfaceList nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (RawKeyEventHandler/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :eventListenerInterfaceList (BasicArrayListD/jnew_0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'RawKeyEventHandler)] (jinit_0 o) o))

    
(defn jm_removeAllListeners_0 [this]
  (let []
        (JR/fset this :eventListenerInterfaceList (BasicArrayListD/jnew_0))))

    
(defn jm_addListeners_1 [this p_vector]
  (let [ l_vector (volatile! p_vector) l_eventListenerInterface (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_eventListenerInterface nil)
        (vreset! l_size (JR/invoke @l_vector :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_eventListenerInterface (JR/invoke @l_vector :jm_get_1 @l_index))
            (JR/invoke this :jm_addListener_1 @l_eventListenerInterface)))))

    
(defn jm_addListenerSingleThreaded_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (if (not (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_contains_1 @l_eventListenerInterface))
            (do
            (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_add_1 @l_eventListenerInterface)))))

    
(defn jm_addListener_1 [this p_eventListenerInterface]
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

    
(defn jm_fireEvent_3 [this p_keyCode p_deviceId p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_repeated (volatile! p_repeated) l_eventListenerInterface (volatile! nil) l_index (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (vreset! l_eventListenerInterface nil)
        (vreset! l_index 0)
        (JR/jwhile false false (< @l_index (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_size_0))
            (try (do
                (vreset! l_eventListenerInterface (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_get_1 @l_index))
                (JR/invoke this :jm_process_4 @l_keyCode @l_deviceId @l_repeated @l_eventListenerInterface))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :FIRE_EVENT) @l_e)) :else (throw jt)))))
            (JR/vinc l_index 1 :int false))))

    
(defn jm_process_4 [this p_keyCode p_deviceId p_repeated p_eventListenerInterface]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_repeated (volatile! p_repeated) l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke @l_eventListenerInterface :jm_onEventRaw_3 @l_keyCode @l_deviceId @l_repeated)))

    
(defn jm_getEventListenerInterfaceListP_0 [this]
  (let []
        (JR/fget this :eventListenerInterfaceList)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_eventListenerInterface (volatile! nil) l_index (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (RawKeyEventHandler/jstatic_TOTAL_LISTENERS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_size_0))
        (vreset! l_eventListenerInterface nil)
        (vreset! l_index 0)
        (JR/jwhile false false (< @l_index (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_size_0))
            (try (do
                (vreset! l_eventListenerInterface (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_get_1 @l_index))
                (JR/invoke @l_stringBuffer :jm_append_1 (RawKeyEventHandler/jstatic_LISTENER_LABEL))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of @l_eventListenerInterface)))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :TOSTRING) @l_e)) :else (throw jt)))))
            (JR/vinc l_index 1 :int false))
        (JR/to-string-of @l_stringBuffer)))



