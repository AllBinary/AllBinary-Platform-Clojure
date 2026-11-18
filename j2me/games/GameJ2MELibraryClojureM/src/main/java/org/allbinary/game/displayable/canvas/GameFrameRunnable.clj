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

(ns GameFrameRunnable)

(JR/register 'GameFrameRunnable 'GameRunnable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :gameTickDisplayInfoSingleton nil)
  (JR/fset this :allBinaryGameCanvas nil)
  (JR/fset this :gameTickTimeDelayHelper nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :gameTickDisplayInfoSingleton (JR/scall 'GameTickDisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
    (GameRunnable/jinit_0 this) (jinitfields this)
        (JR/fset this :allBinaryGameCanvas @l_allBinaryGameCanvas))
  this)

(defn jnew_1 [p_allBinaryGameCanvas ]
  (let [o (JR/alloc 'GameFrameRunnable)] (jinit_1 o p_allBinaryGameCanvas) o))

    
(defn jm_run_0 [this]
  (let [ l_allBinaryGameCanvas (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_allBinaryGameCanvas (JR/fget this :allBinaryGameCanvas))
            (JR/invoke (JR/invoke @l_allBinaryGameCanvas :jm_getLoopTimeHelperP_0) :jm_setStartTime_1 (JR/invoke (JR/fget this :gameTickTimeDelayHelper) :jm_setStartTime_0))
            (JR/invoke (JR/fget this :gameTickDisplayInfoSingleton) :jm_update_0)
            (JR/invoke @l_allBinaryGameCanvas :jm_processGame_0)
            (if (or (not (JR/invoke @l_allBinaryGameCanvas :jm_isRunning_0)) (JR/invoke @l_allBinaryGameCanvas :jm_isPaused_0))
                (do
                (JR/invoke @l_allBinaryGameCanvas :jm_notifyDonePainting_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :RUN) @l_e)) :else (throw jt)))))))



