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

(ns GameRunnable)

(JR/register 'GameRunnable nil '[java.lang.Runnable])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :WAIT 0)
  (JR/fset this :FAST 0)
  (JR/fset this :waitInMillis 0)
    (JR/fset this :WAIT 240)
    (JR/fset this :FAST 60)
    (JR/fset this :waitInMillis (JR/fget this :WAIT))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameRunnable)] (jinit_0 o) o))

    
(defn jm_run_0 [this]
  (let []
        (JR/invoke (JR/scall 'DisplayInfoSingleton :jm_getInstance_0) :jm_process_0)))

    
(defn jm_processLoopSleep_0 [this]
  (let []
        (java.lang.Thread/sleep (JR/fget this :waitInMillis))))



