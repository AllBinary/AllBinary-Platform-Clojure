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
;; package org.allbinary.game.init

(ns DefaultGameInitializationListener)

(JR/register 'DefaultGameInitializationListener nil '[GameInitializedListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :swtJOGLProcessor nil)
  (JR/fset this :firstTime false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :swtJOGLProcessor (JR/scall 'SWTJOGLProcessor :jm_getInstance_0))
    (JR/fset this :firstTime true)
  this)

    
(defn jinit_0 [this]
  (let [ l_gameInitializedEventHandler (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_gameInitializedEventHandler (JR/scall 'GameInitializedEventHandler :jm_getInstance_0))
        (JR/invoke @l_gameInitializedEventHandler :jm_removeAllListeners_0)
        (JR/invoke @l_gameInitializedEventHandler :jm_addListenerInterface_1 this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DefaultGameInitializationListener)] (jinit_0 o) o))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onGameInitialized_1 [this p_gameInitializedEvent]
  (let [ l_gameInitializedEvent (volatile! p_gameInitializedEvent) l_ON_GAME_INITIALIZED (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (vreset! l_ON_GAME_INITIALIZED "onGameInitialized")
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget @l_commonStrings :START) this @l_ON_GAME_INITIALIZED)
            (JR/jwhile false false (not (JR/invoke (JR/fget this :swtJOGLProcessor) :jm_isHolderCreated_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget @l_commonStrings :UPDATE) this @l_ON_GAME_INITIALIZED)
                (java.lang.Thread/sleep 20))
            (JR/invoke (JR/scall 'FeatureResourceInitializationUtil :jm_getInstance_0) :jm_init_1 (JR/invoke @l_gameInitializedEvent :jm_getLevel_0))
            (if (JR/fget this :firstTime)
                (do
                (JR/fset this :firstTime false))
                (do
                (JR/invoke (JR/fget this :swtJOGLProcessor) :jm_onSurfaceChanged_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this @l_ON_GAME_INITIALIZED @l_e)) :else (throw jt)))))))



