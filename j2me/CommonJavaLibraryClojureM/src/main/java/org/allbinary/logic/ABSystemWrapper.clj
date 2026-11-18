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

(ns ABSystemWrapper)

(JR/register 'ABSystemWrapper nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ABSystemWrapper/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ABSystemWrapper)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ABSystemWrapper/jstatic_instance)))

    
(defn jm_arraycopy_5 [this p_src p_srcPos p_dest p_destPos p_length]
  (let [ l_src (volatile! p_src) l_srcPos (volatile! p_srcPos) l_dest (volatile! p_dest) l_destPos (volatile! p_destPos) l_length (volatile! p_length)]
        (JR/arraycopy @l_src @l_srcPos @l_dest @l_destPos @l_length)))

    
(defn jm_currentTimeMillis_0 [this]
  (let []
        (java.lang.System/currentTimeMillis)))



