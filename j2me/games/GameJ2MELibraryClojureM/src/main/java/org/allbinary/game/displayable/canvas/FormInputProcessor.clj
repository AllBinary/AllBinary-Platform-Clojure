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

(ns FormInputProcessor)

(JR/register 'FormInputProcessor 'InputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :gameKeyEventFactory nil)
  (JR/fset this :downKeyEventHandler nil)
  (JR/fset this :upGameKeyEventHandler nil)
  (JR/fset this :inputFactory nil)
  (JR/fset this :platformKeyFactory nil)
  (JR/fset this :allBinaryGameCanvas nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :gameKeyEventFactory (JR/scall 'GameKeyEventFactory :jm_getInstance_0))
    (JR/fset this :downKeyEventHandler (JR/scall 'DownKeyEventHandler :jm_getInstance_0))
    (JR/fset this :upGameKeyEventHandler (JR/scall 'UpGameKeyEventHandler :jm_getInstance_0))
    (JR/fset this :inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
    (JR/fset this :platformKeyFactory (JR/scall 'PlatformKeyFactory :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
    (InputProcessor/jinit_0 this) (jinitfields this)
        (JR/fset this :allBinaryGameCanvas @l_allBinaryGameCanvas))
  this)

(defn jnew_1 [p_allBinaryGameCanvas ]
  (let [o (JR/alloc 'FormInputProcessor)] (jinit_1 o p_allBinaryGameCanvas) o))

    
(defn jm_keyPressedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_input (volatile! nil) l_gameKeyEvent (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :inputFactory) :KEY_CODE_LABEL)) :jm_appendint_1 @l_keyCode) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE)) :jm_append_1 (JR/fget (JR/fget this :inputFactory) :DEVICE_ID_LABEL)) :jm_appendint_1 @l_deviceId)) this (JR/fget (JR/fget this :gameInputStrings) :KEY_PRESSED))
            (vreset! l_input (JR/invoke (JR/fget this :inputFactory) :jm_getInstanceById_1 @l_keyCode))
            (vreset! l_gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 (JR/fget this :allBinaryGameCanvas) @l_input))
            (JR/invoke (JR/fget this :downKeyEventHandler) :jm_fireEventForGameKeyEvent_1 @l_gameKeyEvent))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT) @l_e)) :else (throw jt)))))))

    
(defn jm_keyReleasedByDevice_3 [this p_canvas p_keyCode p_deviceId]
  (let [ l_canvas (volatile! p_canvas) l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_input (volatile! nil) l_gameKey (volatile! nil) l_gameKeyEventSourceInterface (volatile! nil) l_gameKeyEvent (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_input (JR/invoke (JR/fget this :inputFactory) :jm_getInstanceById_1 @l_keyCode))
            (if (JR/invoke (JR/fget this :platformKeyFactory) :jm_isEnter_1 @l_input)
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :inputFactory) :KEY_CODE_LABEL)) :jm_appendint_1 @l_keyCode) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE)) :jm_append_1 (JR/fget (JR/fget this :inputFactory) :DEVICE_ID_LABEL)) :jm_appendint_1 @l_deviceId)) this (JR/fget (JR/fget this :gameInputStrings) :KEY_RELEASED))
                (vreset! l_gameKey (JR/fget (JR/scall 'GameKeyFactory :jm_getInstance_0) :KEY_NUM0))
                (vreset! l_gameKeyEventSourceInterface @l_canvas)
                (vreset! l_gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 @l_gameKeyEventSourceInterface @l_gameKey))
                (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_fireEvent_1 @l_gameKeyEvent)
                (JR/invoke (JR/invoke (JR/fget this :upGameKeyEventHandler) :jm_getInstanceForDevice_1 @l_deviceId) :jm_fireEvent_1 @l_gameKeyEvent))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :gameInputStrings) :ADD_KEY_EVENT) @l_e)) :else (throw jt)))))))



