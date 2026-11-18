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
;; package org.allbinary.logic.io.file

;;Used to correct user input for paths
(ns FilePathUtil)

(JR/register 'FilePathUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'FilePathUtil)] (jinit_0 o) o))

    
(defn jm_adjust_1 [p_path]
  (let [this nil l_path (volatile! p_path) l_abPathData (volatile! nil) l_stringValidationUtil (volatile! nil) l_filePathData (volatile! nil)](JR/method
        (vreset! l_abPathData (JR/scall 'AbPathData :jm_getInstance_0))
        (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
        (vreset! l_filePathData (JR/scall 'FilePathData :jm_getInstance_0))
        (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 @l_path)
            (do
            (JR/jreturn (JR/fget @l_filePathData :PATH_START))))
        (vreset! l_path (JR/invoke @l_path :jm_replace_2 (JR/fget @l_abPathData :SEPARATORCHAR) (JR/fget @l_filePathData :SEPARATORCHAR)))
        @l_path)))



