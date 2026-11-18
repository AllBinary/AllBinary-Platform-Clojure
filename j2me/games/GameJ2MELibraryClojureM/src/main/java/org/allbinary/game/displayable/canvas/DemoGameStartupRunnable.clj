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

(ns DemoGameStartupRunnable)

(JR/register 'DemoGameStartupRunnable 'ABRunnable '[])

(def jsv_TYPE (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_TYPE [] (JR/ensure-init jclinit-state jclinit) @jsv_TYPE)
(defn jstatic_set_TYPE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TYPE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_TYPE 4)
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :demoCanvas nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_demoCanvas]
  (let [ l_demoCanvas (volatile! p_demoCanvas)]
    (ABRunnable/jinit_0 this) (jinitfields this)
        (JR/fset this :demoCanvas @l_demoCanvas))
  this)

(defn jnew_1 [p_demoCanvas ]
  (let [o (JR/alloc 'DemoGameStartupRunnable)] (jinit_1 o p_demoCanvas) o))

    
(defn jm_run_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke this :jm_setRunning_1 true)
            (JR/invoke (JR/fget this :demoCanvas) :jm_stopGameDemo_0)
            (JR/invoke (JR/fget this :demoCanvas) :jm_create_0)
            (JR/invoke (JR/fget this :demoCanvas) :jm_start_0)
            (JR/invoke this :jm_setRunning_1 false))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke this :jm_setRunning_1 false)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :RUN) @l_e)) :else (throw jt)))))))

    
(defn jm_getType_0 [this]
  (let []
        (DemoGameStartupRunnable/jstatic_TYPE)))



