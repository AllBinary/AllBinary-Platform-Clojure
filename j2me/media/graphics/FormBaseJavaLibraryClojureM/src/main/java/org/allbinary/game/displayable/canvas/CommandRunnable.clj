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

(ns CommandRunnable)

(JR/register 'CommandRunnable nil '[java.lang.Runnable])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :commandFormInputProcessor nil)
  (JR/fset this :command nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_commandFormInputProcessor p_command]
  (let [ l_commandFormInputProcessor (volatile! p_commandFormInputProcessor) l_command (volatile! p_command)]
    nil (jinitfields this)
        (JR/fset this :commandFormInputProcessor @l_commandFormInputProcessor)
        (JR/fset this :command @l_command))
  this)

(defn jnew_2 [p_commandFormInputProcessor p_command ]
  (let [o (JR/alloc 'CommandRunnable)] (jinit_2 o p_commandFormInputProcessor p_command) o))

    
(defn jm_run_0 [this]
  (let [ l_canvas (volatile! nil) l_commandListener (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN))
            (vreset! l_canvas (JR/invoke (JR/fget this :commandFormInputProcessor) :jm_getCanvas_0))
            (vreset! l_commandListener (JR/invoke @l_canvas :jm_getCustomCommandListener_0))
            (JR/invoke @l_commandListener :jm_commandAction_2 (JR/fget this :command) @l_canvas)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)) :else (throw jt)))))))



