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
;; package org.allbinary.game.midlet

(ns DemoRunnable)

(JR/register 'DemoRunnable nil '[java.lang.Runnable])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :demoGameMidlet nil)
  (JR/fset this :startDemoGameMidletEvent nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_demoGameMidlet]
  (let [ l_demoGameMidlet (volatile! p_demoGameMidlet)]
    nil (jinitfields this)
        (JR/fset this :demoGameMidlet @l_demoGameMidlet)
        (JR/fset this :startDemoGameMidletEvent (DemoGameMidletEvent/jnew_2 (JR/fget this :demoGameMidlet) (JR/fget (JR/scall 'DemoGameMidletStateFactory :jm_getInstance_0) :START_DEMO))))
  this)

(defn jnew_1 [p_demoGameMidlet ]
  (let [o (JR/alloc 'DemoRunnable)] (jinit_1 o p_demoGameMidlet) o))

    
(defn jm_run_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 "GameCanvasRunnableInterface")) this (JR/fget (JR/fget this :commonStrings) :RUN))
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_commandAction_2 (JR/fget (JR/scall 'MyCommandsFactory :jm_getInstance_0) :SET_DISPLAYABLE) (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_setGameCanvasRunnableInterface_1 (JR/invoke (JR/fget this :demoGameMidlet) :jm_createDemoGameCanvasRunnableInterface_0))
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_demoSetup_0)
            (JR/invoke (JR/scall 'DemoGameMidletEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :startDemoGameMidletEvent))
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_startGameCanvasRunnableInterface_0)
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_postDemoSetup_0)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)) :else (throw jt)))))))



