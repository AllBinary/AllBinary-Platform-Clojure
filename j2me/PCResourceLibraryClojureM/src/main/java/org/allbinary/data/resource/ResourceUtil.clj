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
;; package org.allbinary.data.resource

;;J2SE - PC
(ns ResourceUtil)

(JR/register 'ResourceUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ResourceUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :path nil)
  (JR/fset this :ext nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :path (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :ext (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ResourceUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ResourceUtil)] (jinit_0 o) o))

    
(defn jm_setLoadingPaths_2 [this p_path p_ext]
  (let [ l_path (volatile! p_path) l_ext (volatile! p_ext)]
        (JR/fset this :path @l_path)
        (JR/fset this :ext @l_ext)))

    
(defn jm_setClassLoader_1 [this p_classLoader]
  (let [ l_classLoader (volatile! p_classLoader)]
        nil))

    
(defn jm_getResourceAsStream_1 [this p_resource]
  (let [ l_resource (volatile! p_resource) l_inputStream (volatile! nil)]
        (vreset! l_inputStream (JR/invoke this :jm_getResourceAsStreamAtStart_2 @l_resource 2))
        (if (nil? @l_inputStream)
            (do
            (vreset! l_inputStream (JR/invoke this :jm_getResourceAsStreamAtStart_2 @l_resource 1))
            (if (nil? @l_inputStream)
                (do
                (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Unable to obtain: ") :jm_append_1 @l_resource))))))))
        @l_inputStream))

    
(defn jm_getResourceAsStreamAtStart_2 [this p_resource p_startIndex]
  (let [ l_resource (volatile! p_resource) l_startIndex (volatile! p_startIndex) l_inputStream (volatile! nil) l_byteArray (volatile! nil)](JR/method
        (vreset! l_inputStream (new java.io.FileInputStream (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :path)) :jm_append_1 @l_resource) :jm_append_1 (JR/fget this :ext)))))
        (if (some? @l_inputStream)
            (do
            (vreset! l_byteArray (JR/anew "BYTE" 1 (JR/invoke @l_inputStream :jm_available_0)))
            (JR/invoke (JR/scall 'StreamUtil :jm_getInstance_0) :jm_getByteArray_3 @l_inputStream (new java.io.ByteArrayOutputStream) @l_byteArray)
            (JR/jreturn (new java.io.ByteArrayInputStream @l_byteArray))))
        @l_inputStream)))

    
(defn jm_addResource_2 [this p_resource p_value]
  (let [ l_resource (volatile! p_resource) l_value (volatile! p_value)]
        nil))



