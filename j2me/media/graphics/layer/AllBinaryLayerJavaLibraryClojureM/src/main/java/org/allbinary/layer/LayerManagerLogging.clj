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
;; package org.allbinary.layer

(ns LayerManagerLogging)

(JR/register 'LayerManagerLogging 'LayerManagerLoggingBase '[])

(def jsv_instance (atom nil))
(def jsv_removeFailed (atom false))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))
(defn jstatic_removeFailed [] (JR/ensure-init jclinit-state jclinit) @jsv_removeFailed)
(defn jstatic_set_removeFailed [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_removeFailed v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LayerManagerLogging/jnew_0))
    (reset! jsv_removeFailed false)
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :stringBuilder nil)
  (JR/fset this :APPEND nil)
  (JR/fset this :APPEND_ nil)
  (JR/fset this :_AT_ nil)
  (JR/fset this :ATTEMPT_REMOVE_ nil)
  (JR/fset this :REMOVE_ nil)
  (JR/fset this :REMOVE nil)
  (JR/fset this :DID_NOT_REMOVE nil)
  (JR/fset this :CLEAR nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :stringBuilder (StringMaker/jnew_0))
    (JR/fset this :APPEND "append")
    (JR/fset this :APPEND_ " append: ")
    (JR/fset this :_AT_ " at: ")
    (JR/fset this :ATTEMPT_REMOVE_ " Remove Attempt: ")
    (JR/fset this :REMOVE_ " Remove: ")
    (JR/fset this :REMOVE "remove")
    (JR/fset this :DID_NOT_REMOVE " Did not remove: ")
    (JR/fset this :CLEAR " Clear List")
  this)

(defn jinit_0 [this]
  (LayerManagerLoggingBase/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LayerManagerLogging)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LayerManagerLogging/jstatic_instance)))

    
(defn jm_append_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)) :jm_append_1 (JR/fget this :APPEND_)) :jm_append_1 (JR/invoke @l_layerInterface :jm_getName_0))) this (JR/fget this :APPEND))))

    
(defn jm_appendAt_2 [this p_layerInterface p_index]
  (let [ l_layerInterface (volatile! p_layerInterface) l_index (volatile! p_index)]
        (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)) :jm_append_1 (JR/fget this :APPEND_)) :jm_append_1 (JR/invoke @l_layerInterface :jm_getName_0)) :jm_append_1 (JR/fget this :_AT_)) :jm_appendint_1 @l_index)) this (JR/fget this :APPEND))))

    
(defn jm_remove_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (if (nil? @l_layerInterface)
            (do
            (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)) :jm_append_1 (JR/fget this :ATTEMPT_REMOVE_)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_layerInterface))) this (JR/fget this :REMOVE)))
            (do
            (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)) :jm_append_1 (JR/fget this :ATTEMPT_REMOVE_)) :jm_append_1 (JR/invoke @l_layerInterface :jm_getName_0))) this (JR/fget this :REMOVE))))))

    
(defn jm_removeResult_3 [this p_layerManager p_layerInterface p_result]
  (let [ l_layerManager (volatile! p_layerManager) l_layerInterface (volatile! p_layerInterface) l_result (volatile! p_result)]
        (if (nil? @l_layerInterface)
            (do
            (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)) :jm_append_1 (JR/fget this :REMOVE_)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_layerInterface))) this (JR/fget this :REMOVE)))
            (if @l_result
            (do
            (if (LayerManagerLogging/jstatic_removeFailed)
                (do
                (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)) :jm_append_1 (JR/fget this :REMOVE_)) :jm_append_1 (JR/invoke @l_layerInterface :jm_getName_0))) this (JR/fget this :REMOVE)))))
            (do
            (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)) :jm_append_1 (JR/fget this :DID_NOT_REMOVE)) :jm_append_1 (JR/invoke @l_layerInterface :jm_getName_0))) this (JR/fget this :REMOVE))
            (LayerManagerLogging/jstatic_set_removeFailed true))))))

    
(defn jm_log_1 [this p_layerManager]
  (let [ l_layerManager (volatile! p_layerManager) l_size (volatile! nil) l_commonSeps (volatile! nil) l_allBinaryLayer (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
        (vreset! l_size (JR/invoke @l_layerManager :jm_getSize_0))
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_append_1 (java.lang.Integer/toHexString (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 @l_layerManager))) :jm_append_1 (JR/fget @l_commonSeps :COLON_SEP))
        (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 @l_size) :jm_append_1 (JR/fget @l_commonSeps :COLON_SEP))
        (vreset! l_allBinaryLayer nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_allBinaryLayer (JR/invoke @l_layerManager :jm_getLayerAt_1 @l_index))
            (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_append_1 (JR/invoke @l_allBinaryLayer :jm_getName_0)) :jm_append_1 (JR/fget @l_commonSeps :COMMA))))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/fget this :stringBuilder)) this (JR/fget this :REMOVE))))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :stringBuilder) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuilder) :jm_length_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/fget this :stringBuilder) :jm_appendint_1 (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)) :jm_append_1 (JR/fget this :CLEAR))) this (JR/fget this :CLEAR))))



