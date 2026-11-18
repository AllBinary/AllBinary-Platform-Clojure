;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2002 AllBinary 
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
;; package org.allbinary.graphics.displayable.screen

(ns CommandForm)

(JR/register 'CommandForm 'Form '[MyCommandInterface MenuListener])

(def jsv_NULL_COMMAND_FORM (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_COMMAND_FORM [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_COMMAND_FORM)
(defn jstatic_set_NULL_COMMAND_FORM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_COMMAND_FORM v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_COMMAND_FORM (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :repaintProcessor nil)
  (JR/fset this :commandStack nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :repaintProcessor (JR/invoke (JR/scall 'ScreenRepaintProcessorFactory :jm_getInstance_0) :jm_create_1 this))
  this)

    
(defn jm_getNullCommandForm_0 []
  (let [this nil]
        (if (JR/eq (CommandForm/jstatic_NULL_COMMAND_FORM) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (CommandForm/jstatic_set_NULL_COMMAND_FORM (CommandForm/jnew_4 (JR/sget 'NullCommandListener "NULL_COMMAND_LISTENER") (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))))
        (CommandForm/jstatic_NULL_COMMAND_FORM)))

    
(defn jinit_4 [this p_commandListener p_formTitle p_backgrounBasicColor p_foregroundBasicColor]
  (let [ l_commandListener (volatile! p_commandListener) l_formTitle (volatile! p_formTitle) l_backgrounBasicColor (volatile! p_backgrounBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_e (volatile! nil)]
        (Form/jinit_1 this @l_formTitle) (jinitfields this)
        (JR/fset this :commandStack (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createStack_0))
        (try (do
            (JR/invoke (JR/fget this :repaintProcessor) :jm_process_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR) @l_e)) :else (throw jt))))))
  this)

(defn jnew_4 [p_commandListener p_formTitle p_backgrounBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'CommandForm)] (jinit_4 o p_commandListener p_formTitle p_backgrounBasicColor p_foregroundBasicColor) o))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        nil))

    
(defn jm_open_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "open")))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CLOSE))))

    
(defn jm_update_0 [this]
  (let []
        (JR/invoke (JR/fget this :repaintProcessor) :jm_process_0)))

    
(defn jm_getSourceId_0 [this]
  (let []
        0))

    
(defn jm_addCommand_1 [this p_command]
  (let [ l_command (volatile! p_command)]
        (JR/invoke (JR/fget this :commandStack) :jm_push_1 @l_command)
        (JR/invoke-super 'Form this :jm_addCommand_1 @l_command)))

    
(defn jm_removeAllCommands_0 [this]
  (let [ l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke (JR/fget this :commandStack) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke-super 'Form this :jm_removeCommand_1 (JR/invoke (JR/fget this :commandStack) :jm_pop_0))))))



