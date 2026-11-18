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

(ns GameKeyEventHandler)

(JR/register 'GameKeyEventHandler nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameKeyEventHandler/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :pressGameKeyEventHandler nil)
  (JR/fset this :upGameKeyEventHandler nil)
  (JR/fset this :downGameKeyEventHandler nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :pressGameKeyEventHandler (JR/scall 'PressGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :upGameKeyEventHandler (JR/scall 'UpGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :downGameKeyEventHandler (JR/scall 'DownGameKeyEventHandler :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameKeyEventHandler)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameKeyEventHandler/jstatic_instance)))

    
(defn jm_removeAllListeners_0 [this]
  (let []
        (JR/invoke (JR/fget this :pressGameKeyEventHandler) :jm_removeAllListeners_0)
        (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_removeAllListeners_0)
        (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_removeAllListeners_0)))

    
(defn jm_addListenerForPlayer_2 [this p_eventListenerInterface p_playerInputId]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface) l_playerInputId (volatile! p_playerInputId)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_eventListenerInterface) this (JR/fget (JR/fget this :commonStrings) :ADD_LISTENER))
        (JR/invoke (JR/fget this :pressGameKeyEventHandler) :jm_addListenerSingleThreaded_1 @l_eventListenerInterface)
        (JR/invoke (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_getInstanceForPlayer_1 @l_playerInputId) :jm_addListenerSingleThreaded_1 @l_eventListenerInterface)
        (JR/invoke (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_getInstanceForPlayer_1 @l_playerInputId) :jm_addListenerSingleThreaded_1 @l_eventListenerInterface)))

    
(defn jm_addListener_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_eventListenerInterface) this (JR/fget (JR/fget this :commonStrings) :ADD_LISTENER))
        (JR/invoke (JR/fget this :pressGameKeyEventHandler) :jm_addListenerSingleThreaded_1 @l_eventListenerInterface)
        (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_addListenerSingleThreaded_1 @l_eventListenerInterface)
        (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_addListenerSingleThreaded_1 @l_eventListenerInterface)))

    
(defn jm_removeListener_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_eventListenerInterface) this (JR/fget (JR/fget this :commonStrings) :REMOVE_LISTENER))
        (JR/invoke (JR/fget this :pressGameKeyEventHandler) :jm_removeListenerSingleThreaded_1 @l_eventListenerInterface)
        (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_removeListenerSingleThreaded_1 @l_eventListenerInterface)
        (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_removeListenerSingleThreaded_1 @l_eventListenerInterface)))



