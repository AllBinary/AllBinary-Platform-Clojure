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
;; package org.allbinary.input.event

(ns VirtualKeyboardEventHandler)

(JR/register 'VirtualKeyboardEventHandler 'BasicEventHandler '[])

(def jsv_gameKeyEventHandler (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_gameKeyEventHandler [] (JR/ensure-init jclinit-state jclinit) @jsv_gameKeyEventHandler)
(defn jstatic_set_gameKeyEventHandler [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_gameKeyEventHandler v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_gameKeyEventHandler (VirtualKeyboardEventHandler/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SHOW_EVENT nil)
  (JR/fset this :HIDE_EVENT nil)
    (JR/fset this :SHOW_EVENT (VirtualKeyboardEvent/jnew_1 (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :TRUE)))
    (JR/fset this :HIDE_EVENT (VirtualKeyboardEvent/jnew_1 (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE)))
  this)

    
(defn jinit_0 [this]
  (let []
    (BasicEventHandler/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'VirtualKeyboardEventHandler)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (VirtualKeyboardEventHandler/jstatic_gameKeyEventHandler)))

    
(defn jm_process_2 [this p_eventObject p_eventListenerInterface]
  (let [ l_eventObject (volatile! p_eventObject) l_eventListenerInterface (volatile! p_eventListenerInterface) l_virtualKeyboardEventListenerInterface (volatile! nil)]
        (vreset! l_virtualKeyboardEventListenerInterface @l_eventListenerInterface)
        (JR/invoke @l_virtualKeyboardEventListenerInterface :jm_onVirtualKeyboardEvent_1 @l_eventObject)))

    
(defn jm_open_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (java.lang.Thread/sleep 120)
            (JR/invoke this :jm_fireEvent_1 (JR/fget this :SHOW_EVENT)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "open" @l_e)) :else (throw jt)))))))

    
(defn jm_close_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (java.lang.Thread/sleep 120)
            (JR/invoke this :jm_fireEvent_1 (JR/fget this :HIDE_EVENT)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :CLOSE) @l_e)) :else (throw jt)))))))



