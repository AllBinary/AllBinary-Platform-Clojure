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

(ns AbPathData)

(JR/register 'AbPathData nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AbPathData/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EXTENSION_SEP nil)
  (JR/fset this :SEPARATORCHAR \u0000)
  (JR/fset this :SEPARATOR nil)
    (JR/fset this :EXTENSION_SEP (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :PERIOD))
    (JR/fset this :SEPARATORCHAR \/)
    (JR/fset this :SEPARATOR (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :FORWARD_SLASH))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AbPathData/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AbPathData)] (jinit_0 o) o))

    
(defn jm_getExtensionIndex_1 [this p_filePath]
  (let [ l_filePath (volatile! p_filePath) l_indexOfFileExtensionDelmiter (volatile! nil) l_indexOfLatDelimiter (volatile! nil)](JR/method
        (vreset! l_indexOfFileExtensionDelmiter (JR/invoke @l_filePath :jm_lastIndexOf_1 (JR/fget this :EXTENSION_SEP)))
        (vreset! l_indexOfLatDelimiter (JR/invoke @l_filePath :jm_lastIndexOf_1 (JR/fget this :SEPARATORCHAR)))
        (if (< @l_indexOfFileExtensionDelmiter 0)
            (do
            (JR/jreturn (unchecked-int (unchecked-negate (JR/c2i 1))))))
        (if (< @l_indexOfFileExtensionDelmiter @l_indexOfLatDelimiter)
            (do
            (JR/jreturn (unchecked-int (unchecked-negate (JR/c2i 1))))))
        @l_indexOfFileExtensionDelmiter)))

    
(defn jm_getExtensionWithDot_1 [this p_filePath]
  (let [ l_filePath (volatile! p_filePath) l_indexOfFileExtensionDelmiter (volatile! nil) l_extension (volatile! nil)]
        (vreset! l_indexOfFileExtensionDelmiter (JR/invoke this :jm_getExtensionIndex_1 @l_filePath))
        (vreset! l_extension (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
        (if (>= @l_indexOfFileExtensionDelmiter 0)
            (do
            (vreset! l_extension (JR/invoke @l_filePath :jm_substring_1 @l_indexOfFileExtensionDelmiter))))
        @l_extension))

    
(defn jm_getExtension_1 [this p_filePath]
  (let [ l_filePath (volatile! p_filePath) l_indexOfFileExtensionDelmiter (volatile! nil) l_extension (volatile! nil)]
        (vreset! l_indexOfFileExtensionDelmiter (JR/invoke this :jm_getExtensionIndex_1 @l_filePath))
        (vreset! l_extension (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
        (if (>= @l_indexOfFileExtensionDelmiter 0)
            (do
            (vreset! l_extension (JR/invoke @l_filePath :jm_substring_1 (unchecked-int (unchecked-add @l_indexOfFileExtensionDelmiter 1))))))
        @l_extension))

    
(defn jm_getNameFromPath_1 [this p_path]
  (let [ l_path (volatile! p_path) l_endIndex (volatile! nil) l_categoryName (volatile! nil)](JR/method
        (vreset! l_endIndex (JR/invoke @l_path :jm_lastIndexOf_1 (JR/fget this :SEPARATORCHAR)))
        (if (< @l_endIndex 0)
            (do
            (vreset! l_endIndex (JR/invoke @l_path :jm_lastIndexOf_1 (JR/fget (JR/scall 'FilePathData :jm_getInstance_0) :SEPARATORCHAR)))))
        (if (< @l_endIndex 0)
            (do
            (JR/jreturn @l_path)))
        (if (== (JR/slength @l_path) (unchecked-int (unchecked-add @l_endIndex 1)))
            (do
            (vreset! l_categoryName (JR/invoke @l_path :jm_substring_2 0 @l_endIndex))
            (JR/invoke this :jm_getNameFromPath_1 @l_categoryName))
            (do
            (vreset! l_categoryName (JR/invoke @l_path :jm_substring_1 (unchecked-int (unchecked-add @l_endIndex 1))))
            @l_categoryName)))))

    
(defn jm_removeNameFromPath_1 [this p_path]
  (let [ l_path (volatile! p_path) l_endIndex (volatile! nil) l_pathWithoutName (volatile! nil)](JR/method
        (vreset! l_endIndex (JR/invoke @l_path :jm_lastIndexOf_1 (JR/fget this :SEPARATORCHAR)))
        (if (< @l_endIndex 0)
            (do
            (vreset! l_endIndex (JR/invoke @l_path :jm_lastIndexOf_1 (JR/fget (JR/scall 'FilePathData :jm_getInstance_0) :SEPARATORCHAR)))))
        (if (< @l_endIndex 0)
            (do
            (JR/jreturn (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))))
        (if (== (JR/slength @l_path) (unchecked-int (unchecked-add @l_endIndex 1)))
            (do
            (JR/invoke this :jm_removeNameFromPath_1 (JR/invoke @l_path :jm_substring_2 0 (unchecked-int (unchecked-subtract @l_endIndex 1)))))
            (do
            (vreset! l_pathWithoutName (JR/invoke @l_path :jm_substring_2 0 @l_endIndex))
            @l_pathWithoutName)))))



