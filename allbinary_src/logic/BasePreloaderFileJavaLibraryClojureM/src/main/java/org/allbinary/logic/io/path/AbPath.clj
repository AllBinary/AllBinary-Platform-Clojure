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

(ns AbPath)

(JR/register 'AbPath nil '[])

(def jsv_NETWORK_SEP (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NETWORK_SEP [] (JR/ensure-init jclinit-state jclinit) @jsv_NETWORK_SEP)
(defn jstatic_set_NETWORK_SEP [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NETWORK_SEP v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NETWORK_SEP ":/")
    nil))

(defn jinitfields [this]
  (JR/fset this :commonSeps nil)
  (JR/fset this :abPathData nil)
  (JR/fset this :abPathUtil nil)
  (JR/fset this :EMPTY_STRING nil)
  (JR/fset this :schema nil)
  (JR/fset this :path nil)
  (JR/fset this :nameP nil)
  (JR/fset this :hasSchemaP false)
  (JR/fset this :numberOfSeps 0)
    (JR/fset this :commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
    (JR/fset this :abPathData (JR/scall 'AbPathData :jm_getInstance_0))
    (JR/fset this :abPathUtil (JR/scall 'PathUtil :jm_getInstance_0))
    (JR/fset this :EMPTY_STRING (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :schema (JR/fget this :EMPTY_STRING))
    (JR/fset this :path (JR/fget this :EMPTY_STRING))
    (JR/fset this :nameP (JR/fget this :EMPTY_STRING))
    (JR/fset this :hasSchemaP false)
    (JR/fset this :numberOfSeps 0)
  this)

    
(defn jm_createAbPath_0 []
  (let [this nil l_EMPTY_STRING (volatile! nil) l_ex (volatile! nil)](JR/method
        (try (do
            (vreset! l_EMPTY_STRING (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
            (JR/jreturn (AbPath/jnew_2 @l_EMPTY_STRING @l_EMPTY_STRING)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_ex je)
            (JR/jthrow (new java.lang.RuntimeException))) :else (throw jt))))))))

    
(defn jinit_2 [this p_aPath p_name]
  (let [ l_aPath (volatile! p_aPath) l_name (volatile! p_name) l_stringValidationUtil (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
        (if (not (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 @l_aPath))
            (do
            (JR/fset this :schema (JR/invoke this :jm_getSchema_1 @l_aPath))
            (JR/fset this :nameP @l_name)
            (JR/fset this :path (JR/invoke (JR/fget this :abPathUtil) :jm_adjustEnd_1 (JR/invoke (JR/fget this :abPathUtil) :jm_adjust_1 (JR/invoke this :jm_getPathFromPath_1 @l_aPath)))))
            (do
            (JR/invoke this :jm_init_0)
            (if (not (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 @l_name))
                (do
                (JR/fset this :nameP @l_name))))))
  this)

(defn jnew_2 [p_aPath p_name ]
  (let [o (JR/alloc 'AbPath)] (jinit_2 o p_aPath p_name) o))

    
(defn jm_init_0 [this]
  (let []
        (JR/fset this :schema (JR/fget this :EMPTY_STRING))
        (JR/invoke this :jm_setPath_1 (JR/fget (JR/fget this :abPathData) :SEPARATOR))
        (JR/fset this :nameP (JR/fget this :EMPTY_STRING))))

    
(defn jm_getSchema_1 [this p_aPath]
  (let [ l_aPath (volatile! p_aPath) l_beginIndex (volatile! nil)](JR/method
        (vreset! l_beginIndex (JR/invoke @l_aPath :jm_indexOf_1 (JR/fget (JR/fget this :commonSeps) :COLON)))
        (if (>= @l_beginIndex 0)
            (do
            (JR/fset this :hasSchemaP true)
            (JR/jreturn (JR/invoke @l_aPath :jm_substring_2 0 @l_beginIndex))))
        (JR/fset this :hasSchemaP false)
        (JR/fget this :EMPTY_STRING))))

    
(defn jm_hasSchema_0 [this]
  (let []
        (JR/fget this :hasSchemaP)))

    
(defn jm_getPathFromPath_1 [this p_aPath]
  (let [ l_aPath (volatile! p_aPath) l_filePathData (volatile! nil) l_tempPath (volatile! nil) l_beginIndex (volatile! nil)]
        (vreset! l_filePathData (JR/scall 'FilePathData :jm_getInstance_0))
        (vreset! l_tempPath @l_aPath)
        (if (not (JR/invoke this :jm_hasSchema_0))
            (do
            (vreset! l_tempPath (JR/invoke (JR/fget this :abPathUtil) :jm_adjustStart_1 @l_tempPath)))
            (do
            (vreset! l_beginIndex (JR/invoke @l_tempPath :jm_indexOf_1 (JR/fget (JR/fget this :commonSeps) :COLON)))
            (if (>= @l_beginIndex 0)
                (do
                (JR/vinc l_beginIndex 1 :int false)
                (JR/jwhile false false (or (== (JR/c2i (JR/char-at @l_tempPath @l_beginIndex)) (JR/c2i (JR/fget (JR/fget this :abPathData) :SEPARATORCHAR))) (== (JR/c2i (JR/char-at @l_tempPath @l_beginIndex)) (JR/c2i (JR/fget @l_filePathData :SEPARATORCHAR))))
                    (JR/vinc l_beginIndex 1 :int false)
                    (JR/finc this :numberOfSeps 1 :int false)
                    (if (> (JR/fget this :numberOfSeps) 2)
                        (do
                        (JR/jthrow (new java.lang.Exception "Should Not Have More Than Two Seps")))))
                (vreset! l_tempPath (JR/invoke @l_tempPath :jm_substring_2 @l_beginIndex (JR/slength @l_tempPath)))))))
        @l_tempPath))

    
(defn jm_setName_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/fset this :nameP @l_name)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :nameP)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (if (JR/invoke this :jm_hasSchema_0)
            (do
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :schema))
            (JR/invoke @l_stringBuffer :jm_append_1 (AbPath/jstatic_NETWORK_SEP))))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getPath_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :nameP))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_toFileSystemString_0 [this]
  (let [ l_filePathData (volatile! nil) l_stringBuffer (volatile! nil)]
        (if (JR/invoke this :jm_hasSchema_0)
            (do
            (vreset! l_filePathData (JR/scall 'FilePathData :jm_getInstance_0))
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :schema))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :COLON))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_filePathData :PATH_START))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/scall 'FilePathUtil :jm_adjust_1 (JR/invoke this :jm_getPath_0)))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :nameP))
            (JR/to-string-of @l_stringBuffer))
            (do
            (str (JR/s (JR/scall 'FilePathUtil :jm_adjust_1 (JR/invoke this :jm_getPath_0))) (JR/s (JR/fget this :nameP)))))))

    
(defn jm_getPath_0 [this]
  (let []
        (JR/fget this :path)))

    
(defn jm_setPath_1 [this p_path]
  (let [ l_path (volatile! p_path)]
        (JR/fset this :path @l_path)))



