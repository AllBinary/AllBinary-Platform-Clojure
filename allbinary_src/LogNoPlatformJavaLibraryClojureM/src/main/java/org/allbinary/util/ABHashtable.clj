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
;; package org.allbinary.util

(ns ABHashtable)

(JR/register 'ABHashtable 'java.util.Hashtable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_initialCapacity]
  (let [ l_initialCapacity (volatile! p_initialCapacity)]
        (JR/jsuper-init this 'java.util.Hashtable [@l_initialCapacity]) (jinitfields this))
  this)

(defn jnew_1 [p_initialCapacity ]
  (let [o (JR/alloc 'ABHashtable)] (jinit_1 o p_initialCapacity) o))

    
(defn jinit_0 [this]
  (let []
        (JR/jsuper-init this 'java.util.Hashtable []) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ABHashtable)] (jinit_0 o) o))



