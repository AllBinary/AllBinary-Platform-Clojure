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

;;J2ME
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
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
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
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :NOT_IMPLEMENTED) this "setLoadingPaths")))

    
(defn jm_getResourceAsStream_1 [this p_resource]
  (let [ l_resource (volatile! p_resource) l_inputStream (volatile! nil) l_stringMaker (volatile! nil) l_index (volatile! nil) l_resourcePath (volatile! nil) l_RES (volatile! nil) l_COLON (volatile! nil) l_RESOURCE_STRING (volatile! nil)]
        (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resource))
        (if (nil? @l_inputStream)
            (do
            (vreset! l_inputStream (JR/invoke this :jm_getResourceAsStreamAtStart_2 @l_resource 2))
            (if (nil? @l_inputStream)
                (do
                (vreset! l_inputStream (JR/invoke this :jm_getResourceAsStreamAtStart_2 @l_resource 1))
                (if (nil? @l_inputStream)
                    (do
                    (vreset! l_stringMaker (StringMaker/jnew_0))
                    (vreset! l_index (JR/invoke @l_resource :jm_lastIndexOf_1 \/))
                    (vreset! l_resourcePath (JR/invoke @l_resource :jm_substring_1 (unchecked-int (unchecked-add @l_index 1))))
                    (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
                    (if (nil? @l_inputStream)
                        (do
                        (vreset! l_resourcePath (JR/invoke @l_resource :jm_substring_1 @l_index))
                        (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
                        (if (nil? @l_inputStream)
                            (do
                            (vreset! l_RES "res")
                            (vreset! l_resourcePath (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_RES) :jm_append_1 (JR/invoke @l_resource :jm_substring_1 @l_index))))
                            (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
                            (if (nil? @l_inputStream)
                                (do
                                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                                (vreset! l_resourcePath (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 "/") :jm_append_1 @l_RES) :jm_append_1 (JR/invoke @l_resource :jm_substring_1 @l_index))))
                                (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
                                (vreset! l_COLON (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COLON))
                                (if (nil? @l_inputStream)
                                    (do
                                    (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                                    (vreset! l_resourcePath (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_RES) :jm_append_1 @l_COLON) :jm_append_1 (JR/invoke @l_resource :jm_substring_1 @l_index))))
                                    (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
                                    (if (nil? @l_inputStream)
                                        (do
                                        (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                                        (vreset! l_resourcePath (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_RES) :jm_append_1 @l_COLON) :jm_append_1 (JR/invoke @l_resource :jm_substring_1 (unchecked-int (unchecked-add @l_index 1))))))
                                        (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
                                        (if (nil? @l_inputStream)
                                            (do
                                            (vreset! l_RESOURCE_STRING "resource")
                                            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                                            (vreset! l_resourcePath (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_RESOURCE_STRING) :jm_append_1 @l_COLON) :jm_append_1 (JR/invoke @l_resource :jm_substring_1 @l_index))))
                                            (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
                                            (if (nil? @l_inputStream)
                                                (do
                                                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                                                (vreset! l_resourcePath (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_RESOURCE_STRING) :jm_append_1 @l_COLON) :jm_append_1 (JR/invoke @l_resource :jm_substring_1 (unchecked-int (unchecked-add @l_index 1))))))
                                                (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
                                                (if (nil? @l_inputStream)
                                                    (do
                                                    (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                                                    (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 "Unable to obtain: ") :jm_append_1 @l_resource))))))))))))))))))))))))))
        @l_inputStream))

    
(defn jm_getResourceAsStreamAtStart_2 [this p_resource p_startIndex]
  (let [ l_resource (volatile! p_resource) l_startIndex (volatile! p_startIndex) l_stringMaker (volatile! nil) l_index (volatile! nil) l_resourcePath (volatile! nil) l_inputStream (volatile! nil)](JR/method
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_index (JR/invoke @l_resource :jm_indexOf_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COLON)))
        (vreset! l_resourcePath (JR/invoke @l_resource :jm_substring_1 (unchecked-int (unchecked-add @l_index @l_startIndex))))
        (vreset! l_inputStream (JR/invoke (JR/class-name @l_resource) :jm_getResourceAsStream_1 @l_resourcePath))
        (if (some? @l_inputStream)
            (do
            (JR/jreturn @l_inputStream)))
        @l_inputStream)))

    
(defn jm_addResource_2 [this p_resource p_value]
  (let [ l_resource (volatile! p_resource) l_value (volatile! p_value)]
        nil))



