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

(ns FileWrapperUtil)

(JR/register 'FileWrapperUtil nil '[])

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
  (let [o (JR/alloc 'FileWrapperUtil)] (jinit_0 o) o))

    
(defn jm_wrapFiles_1 [p_files]
  (let [this nil l_files (volatile! p_files) l_abFileArray (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (vreset! l_abFileArray (JR/anew "Object" 1 (JR/alen @l_files)))
            (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen @l_files) 1)))
                (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
                (JR/aset* @l_abFileArray @l_index (AbFile/jnew_1 (JR/aget* @l_files @l_index)))))
            (JR/jreturn @l_abFileArray))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putSE_4 "Exception Wrapping Files" "FileWrapperUtil" "wrapFiles" @l_e)
            (JR/jreturn (JR/anew "Object" 1 0))) :else (throw jt))))))))

    
(defn jm_wrapFile_1 [p_file]
  (let [this nil l_file (volatile! p_file) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (AbFile/jnew_1 @l_file)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putSE_4 "Exception Wrapping File" "FileWrapperUtil" "wrapFile" @l_e)
            (JR/jreturn (JR/sget 'AbFile "NULL_FILE"))) :else (throw jt))))))))



