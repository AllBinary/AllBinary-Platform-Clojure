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

;;Used to correct user input for paths
(ns PathUtil)

(JR/register 'PathUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PathUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :abPathData nil)
  (JR/fset this :filePathData nil)
    (JR/fset this :abPathData (JR/scall 'AbPathData :jm_getInstance_0))
    (JR/fset this :filePathData (JR/scall 'FilePathData :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PathUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'PathUtil)] (jinit_0 o) o))

    
(defn jm_getExtensionWithAbFilePath_1 [this p_abFilePath]
  (let [ l_abFilePath (volatile! p_abFilePath)]
        (JR/invoke (JR/fget this :abPathData) :jm_getExtension_1 (JR/to-string-of @l_abFilePath))))

    
(defn jm_getExtensionWithAbPath_1 [this p_abPath]
  (let [ l_abPath (volatile! p_abPath)]
        (JR/invoke (JR/fget this :abPathData) :jm_getExtension_1 (JR/to-string-of @l_abPath))))

    
(defn jm_getWithoutExtensionWithAbFilePath_1 [this p_abFilePath]
  (let [ l_abFilePath (volatile! p_abFilePath)]
        (JR/invoke this :jm_getWithoutExtension_1 (JR/to-string-of @l_abFilePath))))

    
(defn jm_getWithoutExtensionWithAbPath_1 [this p_abPath]
  (let [ l_abPath (volatile! p_abPath)]
        (JR/invoke this :jm_getWithoutExtension_1 (JR/to-string-of @l_abPath))))

    
(defn jm_getWithoutExtension_1 [this p_filePath]
  (let [ l_filePath (volatile! p_filePath) l_indexOfFileExtensionDelmiter (volatile! nil) l_pathWithoutExtension (volatile! nil)]
        (vreset! l_indexOfFileExtensionDelmiter (JR/invoke (JR/fget this :abPathData) :jm_getExtensionIndex_1 @l_filePath))
        (vreset! l_pathWithoutExtension @l_filePath)
        (if (>= @l_indexOfFileExtensionDelmiter 0)
            (do
            (vreset! l_pathWithoutExtension (JR/invoke @l_filePath :jm_substring_2 0 @l_indexOfFileExtensionDelmiter))))
        @l_pathWithoutExtension))

    
(defn jm_isValid_1 [this p_path]
  (let [ l_path (volatile! p_path)](JR/method
        (if (JR/invoke this :jm_isValidStart_1 @l_path)
            (do
            (if (JR/invoke this :jm_isValidEnd_1 @l_path)
                (do
                (JR/jreturn true)))))
        false)))

    
(defn jm_isValidStart_1 [this p_path]
  (let [ l_path (volatile! p_path)]
        (if (or (== (JR/c2i (JR/char-at @l_path 0)) (JR/c2i (JR/fget (JR/fget this :abPathData) :SEPARATORCHAR))) (== (JR/c2i (JR/char-at @l_path 0)) (JR/c2i \.)))
            (do
            true)
            (do
            false))))

    
(defn jm_isValidEnd_1 [this p_path]
  (let [ l_path (volatile! p_path) l_stringValidationUtil (volatile! nil)](JR/method
        (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
        (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 @l_path)
            (do
            (JR/jreturn false)))
        (if (== (JR/c2i (JR/char-at @l_path (unchecked-int (unchecked-subtract (JR/slength @l_path) 1)))) (JR/c2i (JR/fget (JR/fget this :abPathData) :SEPARATORCHAR)))
            (do
            true)
            (do
            false)))))

    
(defn jm_adjustStart_1 [this p_path]
  (let [ l_path (volatile! p_path)]
        (if (not (JR/invoke this :jm_isValidStart_1 @l_path))
            (do
            (vreset! l_path (str (JR/s (JR/fget (JR/fget this :abPathData) :SEPARATOR)) (JR/s @l_path)))))
        @l_path))

    
(defn jm_adjustEnd_1 [this p_path]
  (let [ l_path (volatile! p_path)]
        (if (not (JR/invoke this :jm_isValidEnd_1 @l_path))
            (do
            (vreset! l_path (str (JR/s @l_path) (JR/s (JR/fget (JR/fget this :abPathData) :SEPARATOR))))))
        @l_path))

    
(defn jm_adjust_1 [this p_path]
  (let [ l_path (volatile! p_path) l_stringValidationUtil (volatile! nil)](JR/method
        (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
        (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 @l_path)
            (do
            (JR/jreturn (JR/fget (JR/fget this :abPathData) :SEPARATOR))))
        (if (>= (JR/invoke @l_path :jm_indexOf_1 "\\") 0)
            (do
            (vreset! l_path (JR/invoke @l_path :jm_replace_2 \\ (JR/fget (JR/fget this :abPathData) :SEPARATORCHAR)))))
        @l_path)))

    
(defn jm_removeNameFromPath_1 [this p_path]
  (let [ l_path (volatile! p_path) l_endIndex (volatile! nil) l_pathWithoutName (volatile! nil)](JR/method
        (vreset! l_endIndex (JR/invoke @l_path :jm_lastIndexOf_1 (JR/fget (JR/fget this :abPathData) :SEPARATOR)))
        (if (< @l_endIndex 0)
            (do
            (vreset! l_endIndex (JR/invoke @l_path :jm_lastIndexOf_1 (JR/fget (JR/fget this :filePathData) :SEPARATORCHAR)))))
        (if (< @l_endIndex 0)
            (do
            (JR/jreturn (JR/scall 'AbPath :jm_createAbPath_0))))
        (if (== (JR/slength @l_path) (unchecked-int (unchecked-add @l_endIndex 1)))
            (do
            (JR/invoke this :jm_removeNameFromPath_1 (JR/invoke @l_path :jm_substring_2 0 (unchecked-int (unchecked-subtract @l_endIndex 1)))))
            (do
            (vreset! l_pathWithoutName (JR/invoke @l_path :jm_substring_2 0 @l_endIndex))
            (AbPath/jnew_2 @l_pathWithoutName (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))))))



