;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.util

;;ArkTs does not have this.  So this is for the ArkTs build.
(ns EnumerationUtil)

(JR/register 'EnumerationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (EnumerationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'EnumerationUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (EnumerationUtil/jstatic_instance)))

    
(defn jm_hasMoreElements_1 [this p_enumeration]
  (let [ l_enumeration (volatile! p_enumeration)]
        (JR/invoke @l_enumeration :jm_hasMoreElements_0)))

    
(defn jm_nextElement_1 [this p_enumeration]
  (let [ l_enumeration (volatile! p_enumeration)]
        (JR/invoke @l_enumeration :jm_nextElement_0)))

    
(defn jm_getAsArray_1 [this p_enumeration]
  (let [ l_enumeration (volatile! p_enumeration) l_basicArrayList (volatile! nil)]
        (vreset! l_basicArrayList (BasicArrayListD/jnew_0))
        (JR/jwhile false false (JR/invoke this :jm_hasMoreElements_1 @l_enumeration)
            (JR/invoke @l_basicArrayList :jm_add_1 (JR/invoke this :jm_nextElement_1 @l_enumeration)))
        (JR/invoke @l_basicArrayList :jm_toArray_0)))



