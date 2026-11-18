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

(ns AbFileOutputStream)

(JR/register 'AbFileOutputStream 'java.io.FileOutputStream '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_createFromAbFile_1 [p_file]
  (let [this nil l_file (volatile! p_file)]
        (AbFileOutputStream/jnew_2 (JR/invoke @l_file :jm_getPath_0) false)))

    
(defn jm_createFromAbFileAppend_2 [p_file p_append]
  (let [this nil l_file (volatile! p_file) l_append (volatile! p_append)]
        (AbFileOutputStream/jnew_2 (JR/invoke @l_file :jm_getPath_0) @l_append)))

    
(defn jm_createFromFilePath_1 [p_name]
  (let [this nil l_name (volatile! p_name)]
        (AbFileOutputStream/jnew_2 @l_name false)))

    
(defn jm_createFromFilePathAppend_2 [p_name p_append]
  (let [this nil l_name (volatile! p_name) l_append (volatile! p_append)]
        (AbFileOutputStream/jnew_2 @l_name @l_append)))

    
(defn jinit_2 [this p_name p_append]
  (let [ l_name (volatile! p_name) l_append (volatile! p_append)]
        (JR/jsuper-init this 'java.io.FileOutputStream [@l_name @l_append]) (jinitfields this))
  this)

(defn jnew_2 [p_name p_append ]
  (let [o (JR/alloc 'AbFileOutputStream)] (jinit_2 o p_name p_append) o))



