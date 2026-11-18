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

(ns DemoCanvasBasicStartInputProcessor)

(JR/register 'DemoCanvasBasicStartInputProcessor 'BasicMenuInputProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_gameKeyEventList p_gameCanvas]
  (let [ l_gameKeyEventList (volatile! p_gameKeyEventList) l_gameCanvas (volatile! p_gameCanvas)]
        (BasicMenuInputProcessor/jinit_3 this @l_gameKeyEventList (unchecked-int (unchecked-negate (JR/c2i 1))) @l_gameCanvas) (jinitfields this))
  this)

(defn jnew_2 [p_gameKeyEventList p_gameCanvas ]
  (let [o (JR/alloc 'DemoCanvasBasicStartInputProcessor)] (jinit_2 o p_gameKeyEventList p_gameCanvas) o))

    
(defn jm_processInputList_0 [this]
  (let [ l_list (volatile! nil) l_size (volatile! nil) l_gameKeyEvent (volatile! nil) l_index (volatile! nil)]
        (vreset! l_list (JR/invoke this :jm_getGameKeyEventList_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_gameKeyEvent nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_gameKeyEvent (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Start GameKey: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_gameKeyEvent))) this (JR/fget (JR/scall 'GameInputStrings :jm_getInstance_0) :PROCESS_INPUT))))
        (JR/invoke (JR/invoke (JR/invoke this :jm_getCanvas_0) :jm_getCustomCommandListener_0) :jm_commandAction_2 (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :START_COMMAND) (JR/sget 'NullCanvas "NULL_CANVAS"))
        @l_size))



