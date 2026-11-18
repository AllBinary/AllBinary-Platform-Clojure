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
;; package org.allbinary.input

(ns DirectionalAnalogLocationInputProcessor)

(JR/register 'DirectionalAnalogLocationInputProcessor 'AnalogLocationInputProcessor '[GameKeyEventSourceInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :inputProcessorArray nil)
  (JR/fset this :gameKeyFactory nil)
  (JR/fset this :leftGameKeyEvent nil)
  (JR/fset this :rightGameKeyEvent nil)
  (JR/fset this :upGameKeyEvent nil)
  (JR/fset this :downGameKeyEvent nil)
  (JR/fset this :leftTriggerGameKeyEvent nil)
  (JR/fset this :rightTriggerGameKeyEvent nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
    (JR/fset this :leftGameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
    (JR/fset this :rightGameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
    (JR/fset this :upGameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
    (JR/fset this :downGameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
    (JR/fset this :leftTriggerGameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
    (JR/fset this :rightTriggerGameKeyEvent (JR/sget 'GameKeyEvent "NONE"))
  this)

    
(defn jinit_1 [this p_inputProcessorArray]
  (let [ l_inputProcessorArray (volatile! p_inputProcessorArray) l_commonStrings (volatile! nil) l_e (volatile! nil)]
    (AnalogLocationInputProcessor/jinit_0 this) (jinitfields this)
        (JR/fset this :inputProcessorArray @l_inputProcessorArray)
        (try (do
            (JR/fset this :leftGameKeyEvent (JR/invoke (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :jm_getInstanceForInput_2 this (JR/fget (JR/fget this :gameKeyFactory) :LEFT)))
            (JR/fset this :rightGameKeyEvent (JR/invoke (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :jm_getInstanceForInput_2 this (JR/fget (JR/fget this :gameKeyFactory) :RIGHT)))
            (JR/fset this :upGameKeyEvent (JR/invoke (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :jm_getInstanceForInput_2 this (JR/fget (JR/fget this :gameKeyFactory) :UP)))
            (JR/fset this :downGameKeyEvent (JR/invoke (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :jm_getInstanceForInput_2 this (JR/fget (JR/fget this :gameKeyFactory) :DOWN)))
            (JR/fset this :leftTriggerGameKeyEvent (JR/invoke (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :jm_getInstanceForInput_2 this (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM0)))
            (JR/fset this :rightTriggerGameKeyEvent (JR/invoke (JR/scall 'GameKeyEventFactory :jm_getInstance_0) :jm_getInstanceForInput_2 this (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM5))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :CONSTRUCTOR) @l_e)) :else (throw jt))))))
  this)

(defn jnew_1 [p_inputProcessorArray ]
  (let [o (JR/alloc 'DirectionalAnalogLocationInputProcessor)] (jinit_1 o p_inputProcessorArray) o))

    
(defn jm_process_2 [this p_allbinaryLayerManager p_analogLocationInput]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_analogLocationInput (volatile! p_analogLocationInput) l_customGPoint (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_leftTrigger (volatile! nil) l_rightTrigger (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_customGPoint nil)
            (vreset! l_customGPoint (JR/invoke @l_analogLocationInput :jm_getCustomGPoint_0))
            (vreset! l_x (JR/invoke @l_customGPoint :jm_getX_0))
            (vreset! l_y (JR/invoke @l_customGPoint :jm_getY_0))
            (vreset! l_leftTrigger (JR/invoke @l_analogLocationInput :jm_getLeftTrigger_0))
            (vreset! l_rightTrigger (JR/invoke @l_analogLocationInput :jm_getRightTrigger_0))
            (if (< @l_x 0)
                (do
                (JR/invoke (JR/aget* (JR/fget this :inputProcessorArray) (JR/invoke (JR/fget this :leftGameKeyEvent) :jm_getKey_0)) :jm_processAnalog_3 @l_allbinaryLayerManager (JR/fget this :leftGameKeyEvent) @l_x))
                (if (> @l_x 0)
                (do
                (JR/invoke (JR/aget* (JR/fget this :inputProcessorArray) (JR/invoke (JR/fget this :rightGameKeyEvent) :jm_getKey_0)) :jm_processAnalog_3 @l_allbinaryLayerManager (JR/fget this :rightGameKeyEvent) @l_x))))
            (if (< @l_y 0)
                (do
                (JR/invoke (JR/aget* (JR/fget this :inputProcessorArray) (JR/invoke (JR/fget this :downGameKeyEvent) :jm_getKey_0)) :jm_processAnalog_3 @l_allbinaryLayerManager (JR/fget this :downGameKeyEvent) @l_y))
                (if (> @l_y 0)
                (do
                (JR/invoke (JR/aget* (JR/fget this :inputProcessorArray) (JR/invoke (JR/fget this :upGameKeyEvent) :jm_getKey_0)) :jm_processAnalog_3 @l_allbinaryLayerManager (JR/fget this :upGameKeyEvent) @l_y))))
            (if (> @l_leftTrigger 0)
                (do
                (JR/invoke (JR/aget* (JR/fget this :inputProcessorArray) (JR/invoke (JR/fget this :leftTriggerGameKeyEvent) :jm_getKey_0)) :jm_processAnalog_3 @l_allbinaryLayerManager (JR/fget this :leftTriggerGameKeyEvent) @l_leftTrigger)))
            (if (> @l_rightTrigger 0)
                (do
                (JR/invoke (JR/aget* (JR/fget this :inputProcessorArray) (JR/invoke (JR/fget this :rightTriggerGameKeyEvent) :jm_getKey_0)) :jm_processAnalog_3 @l_allbinaryLayerManager (JR/fget this :rightTriggerGameKeyEvent) @l_rightTrigger))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Unable to process analog input" this (JR/fget @l_commonStrings :PROCESS) @l_e)) :else (throw jt)))))))

    
(defn jm_getSourceId_0 [this]
  (let []
        0))



