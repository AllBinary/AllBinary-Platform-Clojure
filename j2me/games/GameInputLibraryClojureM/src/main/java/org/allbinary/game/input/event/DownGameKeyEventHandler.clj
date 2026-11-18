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

(ns DownGameKeyEventHandler)

(JR/register 'DownGameKeyEventHandler 'DownGameKeyEventHandlerBase '[])

(def jsv_instance (atom nil))
(def jsv_instanceArray (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))
(defn jstatic_instanceArray [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceArray)
(defn jstatic_set_instanceArray [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceArray v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DownGameKeyEventHandler/jnew_0))
    (reset! jsv_instanceArray (JR/afrom "Object" 1 [(DownGameKeyEventHandlerBase/jnew_0) (DownGameKeyEventHandlerBase/jnew_0) (DownGameKeyEventHandlerBase/jnew_0) (DownGameKeyEventHandlerBase/jnew_0) (DownGameKeyEventHandlerBase/jnew_0) (DownGameKeyEventHandlerBase/jnew_0)]))
    nil))

(defn jinitfields [this]
  (JR/fset this :playerInputIdFactory nil)
    (JR/fset this :playerInputIdFactory (JR/scall 'LocalPlayerInputIdFactory :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DownGameKeyEventHandler/jstatic_instance)))

    
(defn jm_getInstanceForDevice_1 [this p_deviceId]
  (let [ l_deviceId (volatile! p_deviceId) l_playerInputId (volatile! nil)]
        (vreset! l_playerInputId (JR/invoke (JR/fget this :playerInputIdFactory) :jm_getPlayerForDevice_1 @l_deviceId))
        (JR/aget* (DownGameKeyEventHandler/jstatic_instanceArray) @l_playerInputId)))

    
(defn jm_getInstanceForPlayer_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId)]
        (JR/aget* (DownGameKeyEventHandler/jstatic_instanceArray) @l_playerInputId)))

    
(defn jinit_0 [this]
  (let []
    (DownGameKeyEventHandlerBase/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DownGameKeyEventHandler)] (jinit_0 o) o))

    
(defn jm_removeAllListeners_0 [this]
  (let [ l_index (volatile! nil)]
        (JR/invoke-super 'DownGameKeyEventHandlerBase this :jm_removeAllListeners_0)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (DownGameKeyEventHandler/jstatic_instanceArray)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/invoke (JR/aget* (DownGameKeyEventHandler/jstatic_instanceArray) @l_index) :jm_removeAllListeners_0)))))

    
(defn jm_removeListenerSingleThreaded_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface) l_index (volatile! nil)]
        (JR/invoke-super 'DownGameKeyEventHandlerBase this :jm_removeListenerSingleThreaded_1 @l_eventListenerInterface)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (DownGameKeyEventHandler/jstatic_instanceArray)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/invoke (JR/aget* (DownGameKeyEventHandler/jstatic_instanceArray) @l_index) :jm_removeListenerSingleThreaded_1 @l_eventListenerInterface)))))

    
(defn jm_removeListener_1 [this p_eventListenerInterface]
  (let [ l_eventListenerInterface (volatile! p_eventListenerInterface) l_index (volatile! nil)]
        (JR/invoke-super 'DownGameKeyEventHandlerBase this :jm_removeListener_1 @l_eventListenerInterface)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (DownGameKeyEventHandler/jstatic_instanceArray)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/invoke (JR/aget* (DownGameKeyEventHandler/jstatic_instanceArray) @l_index) :jm_removeListener_1 @l_eventListenerInterface)))))



