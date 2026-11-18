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
;; package org.allbinary.input.motion.button

(ns TouchButtonInput)

(JR/register 'TouchButtonInput 'Input '[GameKeyEventSourceInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :gameKeyEventFactory nil)
  (JR/fset this :TOUCH_BUTTON_SOURCE_ID 0)
  (JR/fset this :gameKeyEvent nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :gameKeyEventFactory (JR/scall 'GameKeyEventFactory :jm_getInstance_0))
    (JR/fset this :TOUCH_BUTTON_SOURCE_ID (JR/fget (JR/fget this :gameKeyEventFactory) :TOUCH_BUTTON_SOURCE_ID))
    (JR/fset this :gameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
  this)

    
(defn jinit_2 [this p_id p_name]
  (let [ l_id (volatile! p_id) l_name (volatile! p_name) l_inputFactory (volatile! nil)]
        (Input/jinit_2 this @l_id @l_name) (jinitfields this)
        (vreset! l_inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
        (JR/invoke @l_inputFactory :jm_add_2 (JR/invoke this :jm_getId_0) this))
  this)

(defn jnew_2 [p_id p_name ]
  (let [o (JR/alloc 'TouchButtonInput)] (jinit_2 o p_id p_name) o))

    
(defn jm_update_1 [this p_inputToGameKeyMapping]
  (let [ l_inputToGameKeyMapping (volatile! p_inputToGameKeyMapping) l_gameKey (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameKey (JR/invoke @l_inputToGameKeyMapping :jm_getInstance_1 (JR/invoke this :jm_getId_0)))
            (JR/fset this :gameKeyEvent (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForInput_2 this @l_gameKey)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :UPDATE) @l_e)) :else (throw jt)))))))

    
(defn jm_getSourceId_0 [this]
  (let []
        (JR/fget this :TOUCH_BUTTON_SOURCE_ID)))

    
(defn jm_getGameKeyEvent_0 [this]
  (let []
        (JR/fget this :gameKeyEvent)))



