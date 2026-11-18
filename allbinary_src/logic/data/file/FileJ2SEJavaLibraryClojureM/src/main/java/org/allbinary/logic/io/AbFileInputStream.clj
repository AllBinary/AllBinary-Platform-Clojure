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
;; package org.allbinary.logic.io

(ns AbFileInputStream)

(JR/register 'AbFileInputStream 'java.io.FileInputStream '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/jsuper-init this 'java.io.FileInputStream [@l_name]) (jinitfields this))
  this)

(defn jnew_1 [p_name ]
  (let [o (JR/alloc 'AbFileInputStream)] (jinit_1 o p_name) o))

    
(defn jm_createFromAbFile_1 [p_file]
  (let [this nil l_file (volatile! p_file)]
        (AbFileInputStream/jnew_1 (JR/invoke (JR/scall 'AbFileNativeUtil :jm_get_1 @l_file) :jm_getPath_0))))

    
(defn jm_createFromFile_1 [p_file]
  (let [this nil l_file (volatile! p_file)]
        (AbFileInputStream/jnew_1 (JR/invoke @l_file :jm_getPath_0))))



