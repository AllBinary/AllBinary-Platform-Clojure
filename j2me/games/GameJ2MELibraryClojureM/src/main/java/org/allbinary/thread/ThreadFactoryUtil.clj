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
;; package org.allbinary.thread

(ns ThreadFactoryUtil)

(JR/register 'ThreadFactoryUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ThreadFactoryUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ThreadFactoryUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ThreadFactoryUtil/jstatic_instance)))

    
(defn jm_getInstanceGameCanvasRunnable_1 [this p_runnable]
  (let [ l_runnable (volatile! p_runnable)]
        (JR/invoke this :jm_getInstanceType_2 @l_runnable (JR/invoke @l_runnable :jm_getType_0))))

    
(defn jm_getInstanceForRunnable_1 [this p_runnable]
  (let [ l_runnable (volatile! p_runnable)]
        (JR/invoke this :jm_getInstanceType_2 @l_runnable (JR/invoke @l_runnable :jm_getType_0))))

    
(defn jm_getInstanceType_2 [this p_runnable p_type]
  (let [ l_runnable (volatile! p_runnable) l_type (volatile! p_type) l_commonStrings (volatile! nil) l_primaryThreadPool (volatile! nil) l_demoGameSingleThreadStartRunnable (volatile! nil) l_thread (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (if (JR/scall 'J2MEUtil :jm_isHTML_0)
            (do
            (if (or (== @l_type (JR/sget 'DemoCanvas "TYPE")) (== @l_type (JR/sget 'AllBinaryGameCanvas "TYPE")))
                (do
                (vreset! l_demoGameSingleThreadStartRunnable (RunnableCanvasSingleThreadStartRunnable/jnew_1 @l_runnable))
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Using Pseudo Thread for DemoCanvas/AllBinaryGameCanvas under PlayN/HTML5: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_runnable))) this (JR/fget @l_commonStrings :CONSTRUCTOR))
                (vreset! l_primaryThreadPool (JR/scall 'PrimaryThreadPool :jm_getInstance_0))
                (JR/invoke @l_primaryThreadPool :jm_runTask_1 @l_demoGameSingleThreadStartRunnable))
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Using Pseudo Thread for Runnable under PlayN/HTML5: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_runnable))) this (JR/fget @l_commonStrings :CONSTRUCTOR))
                (vreset! l_primaryThreadPool (JR/scall 'PrimaryThreadPool :jm_getInstance_0))
                (JR/invoke @l_primaryThreadPool :jm_runTask_1 @l_runnable)))))
        (vreset! l_thread (new java.lang.Thread @l_runnable (JR/to-string-of @l_runnable)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_thread) this (JR/fget @l_commonStrings :CONSTRUCTOR))
        @l_thread))

    
(defn jm_start_1 [this p_thread]
  (let [ l_thread (volatile! p_thread)]
        (JR/invoke @l_thread :jm_start_0)))



