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
;; package org.allbinary.game.displayable.canvas

(ns GameCanvasInputProcessor)

(JR/register 'GameCanvasInputProcessor 'InputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :allBinaryGameCanvas nil)
  (JR/fset this :downGameKeyEventHandler nil)
  (JR/fset this :upGameKeyEventHandler nil)
  (JR/fset this :downKeyEventHandler nil)
  (JR/fset this :smallIntegerSingletonFactory nil)
  (JR/fset this :inputToGameKeyMapping nil)
  (JR/fset this :NONE nil)
  (JR/fset this :gameKeyEventFactory nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :downGameKeyEventHandler (JR/scall 'DownGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :upGameKeyEventHandler (JR/scall 'UpGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :downKeyEventHandler (JR/scall 'DownKeyEventHandler :jm_getInstance_0))
    (JR/fset this :smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
    (JR/fset this :inputToGameKeyMapping (JR/invoke (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0) :jm_getInputMapping_0))
    (JR/fset this :NONE (JR/fget (JR/scall 'GameKeyFactory :jm_getInstance_0) :NONE))
    (JR/fset this :gameKeyEventFactory (JR/scall 'GameKeyEventFactory :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
    (InputProcessor/jinit_0 this) (jinitfields this)
        (JR/fset this :allBinaryGameCanvas @l_allBinaryGameCanvas)
        (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_init_1 (JR/fget this :allBinaryGameCanvas)))
  this)

(defn jnew_1 [p_allBinaryGameCanvas ]
  (let [o (JR/alloc 'GameCanvasInputProcessor)] (jinit_1 o p_allBinaryGameCanvas) o))

    
(defn jm_keyPressedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_gameKey (volatile! nil) l_gameKeyEvent (volatile! nil) l_keyCodeAsInteger (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameKey (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_getInstanceForCanvas_2 (JR/fget this :allBinaryGameCanvas) @l_keyCode))
            (if (not (JR/eq @l_gameKey (JR/fget this :NONE)))
                (do
                (vreset! l_gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 (JR/fget this :allBinaryGameCanvas) @l_gameKey))
                (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_fireEvent_1 @l_gameKeyEvent)
                (JR/invoke (JR/invoke (JR/fget this :downGameKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEvent_1 @l_gameKeyEvent))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameInputStrings) :NO_KEY)) :jm_appendint_1 @l_keyCode)) this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT))))
            (vreset! l_keyCodeAsInteger (JR/invoke (JR/fget this :smallIntegerSingletonFactory) :jm_getAtNoThrow_1 @l_keyCode))
            (JR/invoke (JR/fget this :downKeyEventHandler) :jm_fireEventI_1 @l_keyCodeAsInteger)
            (JR/invoke (JR/invoke (JR/fget this :downKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEventI_1 @l_keyCodeAsInteger))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Key Event Error" this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_keyReleasedByDevice_3 [this p_canvas p_keyCode p_deviceId]
  (let [ l_canvas (volatile! p_canvas) l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        (JR/invoke this :jm_removeGameKeyEvent_4 @l_canvas @l_keyCode @l_deviceId false)))

    
(defn jm_removeGameKeyEvent_4 [this p_canvas p_keyCode p_deviceId p_repeated]
  (let [ l_canvas (volatile! p_canvas) l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_repeated (volatile! p_repeated) l_gameKey (volatile! nil) l_gameKeyEventSourceInterface (volatile! nil) l_gameKeyEvent (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameKey (JR/invoke (JR/fget this :inputToGameKeyMapping) :jm_getInstanceForCanvas_2 @l_canvas @l_keyCode))
            (if (not (JR/eq @l_gameKey (JR/fget this :NONE)))
                (do
                (vreset! l_gameKeyEventSourceInterface @l_canvas)
                (vreset! l_gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 @l_gameKeyEventSourceInterface @l_gameKey))
                (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_fireEvent_1 @l_gameKeyEvent)
                (JR/invoke (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEvent_1 @l_gameKeyEvent))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :gameInputStrings) :NO_KEY)) :jm_appendint_1 @l_keyCode)) this (JR/fget (JR/fget this :gameInputStrings) :REMOVE_KEY_EVENT)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Key Event Error" this (JR/fget (JR/fget this :gameInputStrings) :REMOVE_KEY_EVENT) @l_e)) :else (throw jt)))))))



