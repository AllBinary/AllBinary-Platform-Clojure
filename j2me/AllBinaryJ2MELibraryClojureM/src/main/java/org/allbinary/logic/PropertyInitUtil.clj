;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2026 AllBinary 
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
;; package org.allbinary.logic

(ns PropertyInitUtil)

(JR/register 'PropertyInitUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PropertyInitUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PropertyInitUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_1 [p_value]
  (let [this nil l_value (volatile! p_value) l_commonStrings (volatile! nil) l_logUtil (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
        (JR/invoke @l_logUtil :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "PropertyInitUtil: ") :jm_appendint_1 @l_value)) @l_logUtil (JR/fget @l_commonStrings :CONSTRUCTOR))
        (PropertyInitUtil/jstatic_instance)))



