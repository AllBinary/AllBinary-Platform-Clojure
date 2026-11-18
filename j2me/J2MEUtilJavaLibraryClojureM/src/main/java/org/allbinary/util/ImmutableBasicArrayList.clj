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
;; package org.allbinary.util

(ns ImmutableBasicArrayList)

(JR/register 'ImmutableBasicArrayList 'BasicArrayListS '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  this)

    
(defn jinit_2 [this p_name p_size]
  (let [ l_name (volatile! p_name) l_size (volatile! p_size)]
        (BasicArrayListS/jinit_1 this @l_size) (jinitfields this)
        (JR/fset this :name @l_name))
  this)

(defn jnew_2 [p_name p_size ]
  (let [o (JR/alloc 'ImmutableBasicArrayList)] (jinit_2 o p_name p_size) o))

    
(defn jm_add_1 [this p_e]
  (let [ l_e (volatile! p_e)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget this :name) this)
        true))

    
(defn jm_addAt_2 [this p_index p_element]
  (let [ l_index (volatile! p_index) l_element (volatile! p_element)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget this :name) this)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget this :name)))



