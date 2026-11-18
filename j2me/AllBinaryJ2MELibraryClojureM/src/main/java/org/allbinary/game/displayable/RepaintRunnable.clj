;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.game.displayable

(ns RepaintRunnable)

(JR/register 'RepaintRunnable 'ARunnable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :canvas nil)
  this)

    
(defn jinit_1 [this p_canvas]
  (let [ l_canvas (volatile! p_canvas)]
    (ARunnable/jinit_0 this) (jinitfields this)
        (JR/fset this :canvas @l_canvas))
  this)

(defn jnew_1 [p_canvas ]
  (let [o (JR/alloc 'RepaintRunnable)] (jinit_1 o p_canvas) o))

    
(defn jm_run_0 [this]
  (let [ l_commonStrings (volatile! nil) l_logUtil (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :canvas) :jm_repaint_0)
            (JR/invoke (JR/scall 'DisplayInfoSingleton :jm_getInstance_0) :jm_process_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
            (JR/invoke @l_logUtil :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :RUN) @l_e)) :else (throw jt)))))))



