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
;; package org.allbinary.midlet

(ns ExitRunnable)

(JR/register 'ExitRunnable nil '[java.lang.Runnable])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :midlet nil)
  (JR/fset this :processor nil)
  (JR/fset this :isProgress false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_midlet p_processor p_isProgress]
  (let [ l_midlet (volatile! p_midlet) l_processor (volatile! p_processor) l_isProgress (volatile! p_isProgress)]
    nil (jinitfields this)
        (JR/fset this :midlet @l_midlet)
        (JR/fset this :isProgress @l_isProgress)
        (JR/fset this :processor @l_processor))
  this)

(defn jnew_3 [p_midlet p_processor p_isProgress ]
  (let [o (JR/alloc 'ExitRunnable)] (jinit_3 o p_midlet p_processor p_isProgress) o))

    
(defn jm_run_0 [this]
  (let [ l_e2 (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN))
            (JR/invoke (JR/fget this :midlet) :jm_destroyAppInRunnable_2 false (JR/fget this :isProgress))
            (JR/invoke (JR/fget this :midlet) :jm_setDisplay_1 (JR/sget 'NullCanvas "NULL_CANVAS"))
            (JR/invoke (JR/fget this :midlet) :jm_notifyDestroyed_0)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END_RUNNABLE) this (JR/fget (JR/fget this :commonStrings) :RUN))
            (JR/invoke (JR/fget this :processor) :jm_process_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)
            (try (do
                (JR/invoke (JR/fget this :processor) :jm_process_0))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e2 je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :RUN) @l_e)) :else (throw jt)))))) :else (throw jt)))))))



