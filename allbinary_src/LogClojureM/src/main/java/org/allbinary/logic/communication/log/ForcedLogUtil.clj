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
;; package org.allbinary.logic.communication.log

(ns ForcedLogUtil)

(JR/register 'ForcedLogUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ForcedLogUtil)] (jinit_0 o) o))

    
(defn jm_log_2 [p_message p_anyType]
  (let [this nil l_message (volatile! p_message) l_anyType (volatile! p_anyType) l_e (volatile! nil)]
        (try (do
            (JR/jthrow (new java.lang.Exception @l_message)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :EXCEPTION) @l_anyType "log" @l_e)) :else (throw jt)))))))



