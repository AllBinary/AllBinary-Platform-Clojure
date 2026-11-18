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
;; package org.allbinary.logic.io.path

(ns AbFilePath)

(JR/register 'AbFilePath 'AbPath '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_aPath]
  (let [ l_aPath (volatile! p_aPath) l_pathData (volatile! nil) l_abPathUtil (volatile! nil)]
        (AbPath/jinit_2 this (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)) (jinitfields this)
        (vreset! l_pathData (JR/scall 'AbPathData :jm_getInstance_0))
        (vreset! l_abPathUtil (JR/scall 'PathUtil :jm_getInstance_0))
        (JR/fset this :schema (JR/invoke this :jm_getSchema_1 @l_aPath))
        (JR/invoke this :jm_setName_1 (JR/invoke @l_pathData :jm_getNameFromPath_1 @l_aPath))
        (JR/invoke this :jm_setPath_1 (JR/invoke @l_abPathUtil :jm_adjust_1 (JR/invoke this :jm_getPathFromPath_1 (JR/to-string-of (JR/invoke @l_abPathUtil :jm_removeNameFromPath_1 @l_aPath))))))
  this)

(defn jnew_1 [p_aPath ]
  (let [o (JR/alloc 'AbFilePath)] (jinit_1 o p_aPath) o))



