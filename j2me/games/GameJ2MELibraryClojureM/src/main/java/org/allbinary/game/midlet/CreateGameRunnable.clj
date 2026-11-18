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

(ns CreateGameRunnable)

(JR/register 'CreateGameRunnable nil '[java.lang.Runnable])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :demoGameMidlet nil)
  (JR/fset this :hashtable nil)
  (JR/fset this :startGameMidletEvent nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_demoGameMidlet p_hashtable]
  (let [ l_demoGameMidlet (volatile! p_demoGameMidlet) l_hashtable (volatile! p_hashtable)]
    nil (jinitfields this)
        (JR/fset this :demoGameMidlet @l_demoGameMidlet)
        (JR/fset this :hashtable @l_hashtable)
        (JR/fset this :startGameMidletEvent (DemoGameMidletEvent/jnew_2 this (JR/fget (JR/scall 'DemoGameMidletStateFactory :jm_getInstance_0) :START_GAME))))
  this)

(defn jnew_2 [p_demoGameMidlet p_hashtable ]
  (let [o (JR/alloc 'CreateGameRunnable)] (jinit_2 o p_demoGameMidlet p_hashtable) o))

    
(defn jm_run_0 [this]
  (let [ l_progressCanvas (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN))
            (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_commandAction_2 (JR/fget (JR/scall 'MyCommandsFactory :jm_getInstance_0) :SET_DISPLAYABLE) @l_progressCanvas)
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_stopGameCanvasRunnableInterface_0)
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_setGameCanvasRunnableInterface_1 (JR/invoke (JR/fget this :demoGameMidlet) :jm_createGameCanvasRunnableInterface_0))
            (JR/invoke (JR/invoke (JR/fget this :demoGameMidlet) :jm_getGameCanvasRunnableInterface_0) :jm_setLoadStateHashtable_1 (JR/fget this :hashtable))
            (JR/invoke (JR/fget this :demoGameMidlet) :jm_startGameCanvasRunnableInterface_0)
            (JR/invoke (JR/scall 'DemoGameMidletEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :startGameMidletEvent))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)) :else (throw jt)))))))



