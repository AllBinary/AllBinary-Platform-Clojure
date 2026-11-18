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
;; package org.allbinary.game.input.event

(ns UpKeyEventHandlerBase)

(JR/register 'UpKeyEventHandlerBase 'BasicEventHandler '[])

(def jsv_TOTAL_LISTENERS (atom nil))
(def jsv_LISTENER_LABEL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_TOTAL_LISTENERS [] (JR/ensure-init jclinit-state jclinit) @jsv_TOTAL_LISTENERS)
(defn jstatic_set_TOTAL_LISTENERS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TOTAL_LISTENERS v))
(defn jstatic_LISTENER_LABEL [] (JR/ensure-init jclinit-state jclinit) @jsv_LISTENER_LABEL)
(defn jstatic_set_LISTENER_LABEL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_LISTENER_LABEL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_TOTAL_LISTENERS " Total PlayerGameInput Listeners: ")
    (reset! jsv_LISTENER_LABEL " PlayerGameInput Listener: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    (BasicEventHandler/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'UpKeyEventHandlerBase)] (jinit_0 o) o))

    
(defn jm_addListener_1 [this p_playerGameInput]
  (let [ l_playerGameInput (volatile! p_playerGameInput)]
        (if (not (JR/invoke (JR/fget this :list) :jm_contains_1 @l_playerGameInput))
            (do
            (JR/invoke (JR/fget this :list) :jm_add_1 @l_playerGameInput)))))

    
(defn jm_removeAllListeners_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_clear_0)
        (JR/invoke-super 'BasicEventHandler this :jm_removeAllListeners_0)))

    
(defn jm_removeListenerSingleThreaded_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke (JR/fget this :list) :jm_remove_1 @l_eventListenerInterface)
        (JR/invoke-super 'BasicEventHandler this :jm_removeListenerSingleThreaded_1 @l_eventListenerInterface)))

    
(defn jm_removeListener_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke (JR/fget this :list) :jm_remove_1 @l_eventListenerInterface)
        (JR/invoke-super 'BasicEventHandler this :jm_removeListener_1 @l_eventListenerInterface)))

    
(defn jm_fireEventForInteger_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject) l_playerGameInput (volatile! nil) l_e (volatile! nil) l_index (volatile! nil) l_eventListenerInterface (volatile! nil)]
        (do (vreset! l_index (JR/invoke (JR/fget this :list) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (try (do
                (vreset! l_playerGameInput (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
                (JR/invoke @l_playerGameInput :jm_onUpKeyEvent_1 @l_eventObject))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :FIRE_EVENT) @l_e)) :else (throw jt)))))))
        (vreset! l_index 0)
        (vreset! l_eventListenerInterface nil)
        (JR/jwhile false false (< @l_index (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_size_0))
            (try (do
                (vreset! l_eventListenerInterface (JR/invoke (JR/fget this :eventListenerInterfaceList) :jm_get_1 @l_index))
                (JR/invoke this :jm_processForInteger_2 @l_eventObject @l_eventListenerInterface))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :FIRE_EVENT) @l_e)) :else (throw jt)))))
            (JR/vinc l_index 1 :int false))))

    
(defn jm_processForInteger_2 [this p_eventObject p_eventListenerInterface]
  (let [ l_eventObject (volatile! p_eventObject) l_eventListenerInterface (volatile! p_eventListenerInterface) l_upKeyEventListenerInterface (volatile! nil)]
        (vreset! l_upKeyEventListenerInterface @l_eventListenerInterface)
        (JR/invoke @l_upKeyEventListenerInterface :jm_onUpKeyEvent_1 @l_eventObject)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_eventListenerInterface (volatile! nil) l_e (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of this))
        (JR/invoke @l_stringBuffer :jm_append_1 (UpKeyEventHandlerBase/jstatic_TOTAL_LISTENERS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke (JR/fget this :list) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/invoke (JR/fget this :list) :jm_size_0)) (do (JR/vinc l_index 1 :int false))
            (try (do
                (vreset! l_eventListenerInterface (JR/invoke (JR/fget this :list) :jm_get_1 @l_index))
                (JR/invoke @l_stringBuffer :jm_append_1 (UpKeyEventHandlerBase/jstatic_LISTENER_LABEL))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of @l_eventListenerInterface)))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :TOSTRING) @l_e)) :else (throw jt)))))))
        (JR/to-string-of @l_stringBuffer)))



