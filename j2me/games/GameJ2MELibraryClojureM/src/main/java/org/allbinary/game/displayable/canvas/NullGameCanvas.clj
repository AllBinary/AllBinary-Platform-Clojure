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

(ns NullGameCanvas)

(JR/register 'NullGameCanvas 'AllBinaryGameCanvas '[])

(def jsv_instance (atom nil))
(def jsv_NO_GAME (atom nil))
(def jsv_TYPE (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))
(defn jstatic_NO_GAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NO_GAME)
(defn jstatic_set_NO_GAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NO_GAME v))
(defn jstatic_TYPE [] (JR/ensure-init jclinit-state jclinit) @jsv_TYPE)
(defn jstatic_set_TYPE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TYPE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    (reset! jsv_NO_GAME "No Background Game")
    (reset! jsv_TYPE 1)
    nil))

(defn jinitfields [this]
  (JR/fset this :runningNull false)
    (JR/fset this :runningNull true)
  this)

    
(defn jm_createNull_0 []
  (let [this nil l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (NullGameCanvas/jnew_1 (JR/scall 'AllBinaryGameLayerManager :jm_getNullInstance_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/scall 'LogUtil :jm_getInstance_0) :jm_put_4 (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :EXCEPTION) "NullGameCanvas" (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :GET_INSTANCE) @l_e)
            (JR/jthrow (new java.lang.RuntimeException))) :else (throw jt))))))))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (NullGameCanvas/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (NullGameCanvas/jstatic_set_instance (NullGameCanvas/jm_createNull_0))))
        (NullGameCanvas/jstatic_instance)))

    
(defn jm_createCanvas_1 [p_gameLayerManager]
  (let [this nil l_gameLayerManager (volatile! p_gameLayerManager) l_nullGameCanvas (volatile! nil)]
        (vreset! l_nullGameCanvas (NullGameCanvas/jnew_1 @l_gameLayerManager))
        (JR/invoke @l_nullGameCanvas :jm_setInitialized_1 true)
        (JR/invoke @l_nullGameCanvas :jm_setTitle_1 (NullGameCanvas/jstatic_NO_GAME))
        @l_nullGameCanvas))

    
(defn jinit_1 [this p_gameLayerManager]
  (let [ l_gameLayerManager (volatile! p_gameLayerManager)]
        (AllBinaryGameCanvas/jinit_5 this (JR/sget 'NullCommandListener "NULL_COMMAND_LISTENER") @l_gameLayerManager (JR/scall 'NoHighScoresFactory :jm_getInstance_0) (JR/sget 'BasicBuildGameInitializerFactory "NULL_BASE_BUILD_GMAE_INITIALIZER_FACTORY") false) (jinitfields this)
        (JR/invoke-super 'AllBinaryGameCanvas this :jm_setWait_1 1200))
  this)

(defn jnew_1 [p_gameLayerManager ]
  (let [o (JR/alloc 'NullGameCanvas)] (jinit_1 o p_gameLayerManager) o))

    
(defn jm_isGameOver_0 [this]
  (let []
        false))

    
(defn jm_setRunning_1 [this p_running]
  (let [ l_running (volatile! p_running)]
        (JR/fset this :runningNull @l_running)))

    
(defn jm_isRunning_0 [this]
  (let []
        (JR/fget this :runningNull)))

    
(defn jm_pause_0 [this]
  (let []
        (JR/invoke this :jm_setPaused_1 true)))

    
(defn jm_unPause_0 [this]
  (let []
        (JR/invoke this :jm_setPaused_1 false)))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_buildGameInit_1 [this p_isProgress]
  (let [ l_isProgress (volatile! p_isProgress)]
        nil))

    
(defn jm_draw_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_run_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)) :else (throw jt)))))))

    
(defn jm_getType_0 [this]
  (let []
        (NullGameCanvas/jstatic_TYPE)))



