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
;; package org.allbinary.game.ag.ai

(ns ThrustAIVisitor)

(JR/register 'ThrustAIVisitor 'Visitor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :TRUE nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :TRUE (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :TRUE))
  this)

    
(defn jinit_0 [this]
  (let []
    (Visitor/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ThrustAIVisitor)] (jinit_0 o) o))

    
(defn jm_visit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType) l_basicAI (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_basicAI @l_anyType)
            (JR/invoke @l_basicAI :jm_processKeyAI_1 (JR/sget 'Canvas "UP")))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :VISIT) @l_e)) :else (throw jt)))))
        (JR/fget this :TRUE)))



