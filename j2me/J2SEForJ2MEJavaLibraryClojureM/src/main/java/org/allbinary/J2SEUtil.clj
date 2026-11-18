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
;; package org.allbinary

;;J2SEForJ2ME
(ns J2SEUtil)

(JR/register 'J2SEUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (J2SEUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'J2SEUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (J2SEUtil/jstatic_instance)))

    
(defn jm_getHashMapAsArray_1 [this p_hashMap]
  (let [ l_hashMap (volatile! p_hashMap) l_objectArray (volatile! nil)]
        (vreset! l_objectArray (JR/invoke (JR/invoke @l_hashMap :jm_keySet_0) :jm_toArray_0))
        @l_objectArray))

    
(defn jm_getMapAsArray_1 [this p_map]
  (let [ l_map (volatile! p_map) l_objectArray (volatile! nil)]
        (vreset! l_objectArray (JR/invoke (JR/invoke @l_map :jm_keySet_0) :jm_toArray_0))
        @l_objectArray))

    
(defn jm_getSetAsArray_1 [this p_set]
  (let [ l_set (volatile! p_set) l_objectArray (volatile! nil)]
        (vreset! l_objectArray (JR/invoke @l_set :jm_toArray_0))
        @l_objectArray))



