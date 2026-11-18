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

(ns BufferedLineReader)

(JR/register 'BufferedLineReader nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :tmpIn nil)
  this)

    
(defn jinit_1 [this p_file]
  (let [ l_file (volatile! p_file)]
    nil (jinitfields this)
        (JR/fset this :tmpIn (new java.io.BufferedReader (new java.io.FileReader (JR/scall 'AbFileNativeUtil :jm_get_1 @l_file)))))
  this)

(defn jnew_1 [p_file ]
  (let [o (JR/alloc 'BufferedLineReader)] (jinit_1 o p_file) o))

    
(defn jm_readUpToLines_1 [this p_readAheadIndex]
  (let [ l_readAheadIndex (volatile! p_readAheadIndex)]
        nil))

    
(defn jm_readLine_0 [this]
  (let []
        (JR/invoke (JR/fget this :tmpIn) :jm_readLine_0)))

    
(defn jm_ready_0 [this]
  (let []
        (JR/invoke (JR/fget this :tmpIn) :jm_ready_0)))

    
(defn jm_getSize_0 [this]
  (let []
        0))

    
(defn jm_getCurrent_0 [this]
  (let []
        0))



