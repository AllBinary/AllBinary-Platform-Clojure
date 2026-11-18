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
;; package org.allbinary.canvas

(ns RunnableCanvas)

(JR/register 'RunnableCanvas 'MyCanvas '[RunnableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :nullUtil nil)
  (JR/fset this :stdUtil nil)
  (JR/fset this :systemWrapper nil)
  (JR/fset this :tsUtil nil)
  (JR/fset this :thread nil)
  (JR/fset this :currentThread nil)
  (JR/fset this :running false)
  (JR/fset this :loopTimeHelper nil)
  (JR/fset this :runnableCanvasRefreshHelper nil)
  (JR/fset this :commonLabels nil)
  (JR/fset this :threadObjectUtil nil)
  (JR/fset this :SET_RUNNING nil)
  (JR/fset this :IS_RUNNING nil)
  (JR/fset this :THREAD nil)
  (JR/fset this :NOT_EQUAL nil)
  (JR/fset this :PAUSE_SLEEP nil)
  (JR/fset this :START_PAUSE nil)
  (JR/fset this :END_PAUSE nil)
  (JR/fset this :PROCESS_LOOP_SLEEP nil)
  (JR/fset this :pauseWait 0)
  (JR/fset this :notified false)
    (JR/fset this :nullUtil (JR/scall 'NullUtil :jm_getInstance_0))
    (JR/fset this :stdUtil (JR/scall 'StdUtil :jm_getInstance_0))
    (JR/fset this :systemWrapper (JR/scall 'ABSystemWrapper :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :thread (JR/sget 'NullThread "NULL_THREAD"))
    (JR/fset this :currentThread (JR/sget 'NullThread "NULL_THREAD"))
    (JR/fset this :loopTimeHelper (TimeDelayHelper/jnew_1 (JR/fget (JR/scall 'NullWaitGameRunnable :jm_getInstance_0) :WAIT)))
    (JR/fset this :runnableCanvasRefreshHelper (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
    (JR/fset this :threadObjectUtil (JR/scall 'ThreadObjectUtil :jm_getInstance_0))
    (JR/fset this :SET_RUNNING "setRunning")
    (JR/fset this :IS_RUNNING "isRunning")
    (JR/fset this :THREAD "Thread: ")
    (JR/fset this :NOT_EQUAL " != ")
    (JR/fset this :PAUSE_SLEEP "pause sleep")
    (JR/fset this :START_PAUSE "start pause - game thread sleep at: ")
    (JR/fset this :END_PAUSE "end pause - game thread sleep at: ")
    (JR/fset this :PROCESS_LOOP_SLEEP "processLoopSleep")
    (JR/fset this :pauseWait 0)
    (JR/fset this :notified false)
  this)

    
(defn jinit_3 [this p_commandListener p_childNameList p_hasParam]
  (let [ l_commandListener (volatile! p_commandListener) l_childNameList (volatile! p_childNameList) l_hasParam (volatile! p_hasParam)]
        (MyCanvas/jinit_2 this (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :UNKNOWN) @l_childNameList) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "RunnableCanvas delay: ") :jm_appendint_1 (JR/fget (JR/fget this :loopTimeHelper) :delay))) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/fset this :runnableCanvasRefreshHelper (RunnableCanvasRefreshHelper/jnew_1 this))
        (if (some? @l_commandListener)
            (do
            (JR/invoke this :jm_initCommands_1 @l_commandListener))
            (if @l_hasParam
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "commandListener was null" this "initCommands")))))
  this)

(defn jnew_3 [p_commandListener p_childNameList p_hasParam ]
  (let [o (JR/alloc 'RunnableCanvas)] (jinit_3 o p_commandListener p_childNameList p_hasParam) o))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this "initCommands")))

    
(defn jm_isMainCanvas_0 [this]
  (let []
        (if (some? (JR/invoke this :jm_getCustomCommandListener_0))
            (do
            true)
            (do
            false))))

    
(defn jm_setThread_1 [this p_thread]
  (let [ l_thread (volatile! p_thread)]
        (JR/fset this :thread @l_thread)))

    
(defn jm_setRunning_1 [this p_running]
  (let [ l_running (volatile! p_running)]
        (JR/fset this :running @l_running)
        (if (not (JR/fget this :running))
            (do
            (JR/fset this :thread (JR/sget 'NullThread "NULL_THREAD"))
            (locking this
                (JR/invoke (JR/fget this :threadObjectUtil) :jm_notifyObject_1 this))))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :IS_RUNNING)) :jm_appendboolean_1 (JR/fget this :running))) this (JR/fget this :SET_RUNNING))))

    
(defn jm_isRunning_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (if (JR/eq (JR/fget this :thread) (JR/fget this :currentThread))
            (do
            (JR/fget this :running))
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :THREAD))
            (if (some? (JR/fget this :thread))
                (do
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :thread)))))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :NOT_EQUAL))
            (if (some? (JR/fget this :currentThread))
                (do
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/fget this :currentThread)))))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget this :IS_RUNNING))
            false))))

    
(defn jm_getLoopTimeHelperP_0 [this]
  (let []
        (JR/fget this :loopTimeHelper)))

    
(defn jm_setWait_1 [this p_wait]
  (let [ l_wait (volatile! p_wait)]
        (JR/fset (JR/fget this :loopTimeHelper) :delay @l_wait)
        (JR/fset this :pauseWait (unchecked-multiply @l_wait 3))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "setWait - delay: ") :jm_appendint_1 (JR/fget (JR/fget this :loopTimeHelper) :delay))) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))))

    
(defn jm_getWait_0 [this]
  (let []
        (JR/fget (JR/fget this :loopTimeHelper) :delay)))

    
(defn jm_setCurrentThread_0 [this]
  (let []
        (JR/fset this :currentThread (java.lang.Thread/currentThread))))

    
(defn jm_setCurrentThreadFake_0 [this]
  (let []
        (JR/fset this :currentThread (JR/fget this :thread))))

    
(defn jm_showNotify_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke this :jm_stopWaiting_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "showNotify" @l_e)) :else (throw jt)))))))

    
(defn jm_stopWaiting_0 [this]
  (let []
        (JR/fset this :notified true)
        (locking this
            (JR/invoke (JR/fget this :threadObjectUtil) :jm_notifyObject_1 this))
        (JR/invoke this :jm_repaint_0)))

    
(defn jm_waitOnNotify_1 [this p_wait]
  (let [ l_wait (volatile! p_wait)]
        (if (not (JR/fget this :notified))
            (do
            (if (> @l_wait 0)
                (do
                (JR/invoke (JR/fget this :threadObjectUtil) :jm_waitObjectFor_2 this @l_wait))
                (do
                (JR/invoke (JR/fget this :threadObjectUtil) :jm_waitObject_1 this)))))))

    
(defn jm_processSleep_0 [this]
  (let []
        (java.lang.Thread/sleep (JR/fget this :pauseWait))))

    
(defn jm_isPausable_0 [this]
  (let []
        false))

    
(defn jm_processGameSleep_1 [this p_sleep]
  (let [ l_sleep (volatile! p_sleep)]
        (java.lang.Thread/sleep @l_sleep)))

    
(defn jm_processLoopSleep_0 [this]
  (let [ l_stringMaker (volatile! nil) l_currentTimeMillis (volatile! nil) l_elapsedTime (volatile! nil) l_wait (volatile! nil)](JR/method
        (JR/invoke (JR/fget this :runnableCanvasRefreshHelper) :jm_process_0)
        (if (JR/invoke this :jm_isPaused_0)
            (do
            (vreset! l_stringMaker (StringMaker/jnew_0))
            (if (and (JR/invoke this :jm_isRunning_0) (not (JR/invoke this :jm_isSingleThread_0)))
                (do
                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                (vreset! l_currentTimeMillis (JR/invoke (JR/fget this :systemWrapper) :jm_currentTimeMillis_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :START_PAUSE)) :jm_appendlong_1 @l_currentTimeMillis) :jm_append_1 (JR/fget this :PAUSE_SLEEP)) :jm_appendlong_1 (JR/fget this :pauseWait))) this (JR/fget this :PROCESS_LOOP_SLEEP))
                (JR/jwhile false false (and (and (JR/invoke this :jm_isPaused_0) (JR/invoke this :jm_isRunning_0)) (not (JR/invoke this :jm_isSingleThread_0)))
                    (JR/invoke this :jm_processSleep_0)
                    (if (not (JR/invoke this :jm_isPausable_0))
                        (do
                        (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :END_PAUSE)) :jm_appendlong_1 @l_currentTimeMillis)) this (JR/fget this :PROCESS_LOOP_SLEEP))
                        (JR/jreturn))))))))
        (vreset! l_elapsedTime (JR/invoke (JR/fget this :loopTimeHelper) :jm_getElapsedTNT_0))
        (vreset! l_wait (JR/fget (JR/fget this :loopTimeHelper) :delay))
        (if (> @l_elapsedTime @l_wait)
            (do
            (vreset! l_elapsedTime @l_wait))
            (do
            (JR/invoke this :jm_processGameSleep_1 (unchecked-subtract @l_wait @l_elapsedTime)))))))

    
(defn jm_isSingleThread_0 [this]
  (let []
        false))

    
(defn jm_run_0 [this]
  (let []
        (JR/invoke this :jm_setCurrentThread_0)))

    
(defn jm_end2_0 [this]
  (let []
        nil))

    
(defn jm_getType_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))



