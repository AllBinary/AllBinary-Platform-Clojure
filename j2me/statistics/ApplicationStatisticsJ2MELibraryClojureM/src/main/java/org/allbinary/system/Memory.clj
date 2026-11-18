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
;; package org.allbinary.system

;;ActualPlatform
(ns Memory)

(JR/register 'Memory nil '[])

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
  (let [o (JR/alloc 'Memory)] (jinit_0 o) o))

    
(defn jm_getInfo_0 []
  (let [this nil l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Memory: Free: ")
        (JR/invoke @l_stringBuffer :jm_appendlong_1 (JR/invoke (java.lang.Runtime/getRuntime) :jm_freeMemory_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " Total: ")
        (JR/invoke @l_stringBuffer :jm_appendlong_1 (JR/invoke (java.lang.Runtime/getRuntime) :jm_totalMemory_0))
        (JR/to-string-of @l_stringBuffer)))



