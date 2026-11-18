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
;; package org.allbinary.graphics.form.item.validation

(ns TextItemNumberVisitor)

(JR/register 'TextItemNumberVisitor 'Visitor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    (Visitor/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TextItemNumberVisitor)] (jinit_0 o) o))

    
(defn jm_visit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType) l_value (volatile! nil) l_stringValidationUtil (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (vreset! l_value @l_anyType)
        (if (< (JR/slength @l_value) 2)
            (do
            (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
            (if (JR/invoke @l_stringValidationUtil :jm_isNumber_1 @l_value)
                (do
                (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :TRUE))
                (do
                (try (do
                    (JR/invoke (JR/scall 'TextNotificationUtil :jm_getInstance_0) :jm_fireError_1 "Numbers Only"))
                    (catch Throwable jt (let [je (JR/caught jt)] (cond
                        (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                    (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
                    (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :VISIT) @l_e)) :else (throw jt)))))
                (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE))))
            (do
            (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :FALSE)))))



