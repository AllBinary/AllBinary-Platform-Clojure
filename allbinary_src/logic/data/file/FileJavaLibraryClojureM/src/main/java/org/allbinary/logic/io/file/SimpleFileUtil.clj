;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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

(ns SimpleFileUtil)

(JR/register 'SimpleFileUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SimpleFileUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :NULL_WRITER nil)
  (JR/fset this :NULL_READER nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :nullUtil nil)
  (JR/fset this :streamUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :NULL_WRITER (SimpleFileUtil/jm_nullWriter_0))
    (JR/fset this :NULL_READER (SimpleFileUtil/jm_nullReader_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :nullUtil (JR/scall 'NullUtil :jm_getInstance_0))
    (JR/fset this :streamUtil (JR/scall 'StreamUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'SimpleFileUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SimpleFileUtil/jstatic_instance)))

    
(defn jm_nullOutputStream_0 []
  (let [this nil]
        (JR/sget 'NullOutputStream "NULL_OUTPUT_STREAM")))

    
(defn jm_nullWriter_0 []
  (let [this nil]
        (JR/sget 'NullWriter "NULL_WRITER")))

    
(defn jm_nullReader_0 []
  (let [this nil]
        (JR/sget 'NullReader "NULL_READER")))

    
(defn jm_loadFileAsList_3 [this p_inputStream p_max p_byteArray1]
  (let [ l_inputStream (volatile! p_inputStream) l_max (volatile! p_max) l_byteArray1 (volatile! p_byteArray1)]
        (JR/invoke this :jm_loadFileAsListReturnLine_4 @l_inputStream @l_max @l_byteArray1 0)))

    
(defn jm_loadFileAsListReturnLine_4 [this p_inputStream p_max p_byteArray1 p_includeReturnLine]
  (let [ l_inputStream (volatile! p_inputStream) l_max (volatile! p_max) l_byteArray1 (volatile! p_byteArray1) l_includeReturnLine (volatile! p_includeReturnLine) l_stringList (volatile! nil) l_byteArray (volatile! nil) l_outputStream2 (volatile! nil) l_e (volatile! nil) l_size (volatile! nil) l_index (volatile! nil) l_startIndex (volatile! nil) l_returnLine (volatile! nil) l_s (volatile! nil)](JR/method
        (vreset! l_stringList (BasicArrayListD/jnew_0))
        (if (nil? @l_inputStream)
            (do
            (JR/jreturn @l_stringList)))
        (vreset! l_byteArray (JR/fget (JR/fget this :nullUtil) :NULL_BYTE_ARRAY))
        (try (do
            (vreset! l_outputStream2 (new java.io.ByteArrayOutputStream @l_max))
            (vreset! l_byteArray (JR/invoke (JR/fget this :streamUtil) :jm_getByteArray_3 @l_inputStream @l_outputStream2 @l_byteArray1))
            (JR/invoke (JR/fget this :streamUtil) :jm_close_1 @l_inputStream))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :streamUtil) :jm_close_1 @l_inputStream)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :ADD) @l_e)) :else (throw jt)))))
        (if (nil? @l_byteArray)
            (do
            (JR/jreturn @l_stringList)))
        (vreset! l_size (JR/alen @l_byteArray))
        (vreset! l_index 0)
        (vreset! l_startIndex 0)
        (vreset! l_returnLine 0)
        (JR/jwhile false false (< @l_index @l_size)
            (vreset! l_startIndex @l_index)
            (JR/jwhile false false (and (< @l_index (unchecked-int (unchecked-subtract @l_size 1))) (not (== (JR/aget* @l_byteArray @l_index) (JR/i8 \newline))))
                (JR/vinc l_index 1 :int false))
            (if (== @l_includeReturnLine 0)
                (do
                (if (and (> @l_index 0) (== (JR/aget* @l_byteArray (unchecked-int (unchecked-subtract @l_index 1))) (JR/i8 \return)))
                    (do
                    (vreset! l_returnLine 1))
                    (do
                    (vreset! l_returnLine 0)))))
            (vreset! l_s (JR/new-string @l_byteArray @l_startIndex (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract (unchecked-int (unchecked-add @l_index @l_includeReturnLine)) @l_returnLine)) @l_startIndex))))
            (JR/invoke @l_stringList :jm_add_1 @l_s)
            (JR/vinc l_index 1 :int false))
        @l_stringList)))

    
(defn jm_createStringFromArrayOfStrings_1 [this p_stringArray]
  (let [ l_stringArray (volatile! p_stringArray) l_stringMaker (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_size (JR/alen @l_stringArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_stringMaker :jm_append_1 (JR/aget* @l_stringArray @l_index))))
        (JR/to-string-of @l_stringMaker)))



