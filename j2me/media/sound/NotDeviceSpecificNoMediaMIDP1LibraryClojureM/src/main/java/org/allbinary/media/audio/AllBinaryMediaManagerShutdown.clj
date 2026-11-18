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
;; package org.allbinary.media.audio

(ns AllBinaryMediaManagerShutdown)

(JR/register 'AllBinaryMediaManagerShutdown nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AllBinaryMediaManagerShutdown/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryMediaManagerShutdown)] (jinit_0 o) o))

    
(defn jm_shutdown_1 [p_soundsFactoryInterface]
  (let [this nil l_soundsFactoryInterface (volatile! p_soundsFactoryInterface) l_logUtil (volatile! nil) l_commonStrings (volatile! nil)]
        (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke @l_logUtil :jm_putF_3 (JR/fget @l_commonStrings :START) (AllBinaryMediaManagerShutdown/jstatic_instance) "shutdown")
        (JR/scall 'AllBinaryMediaManager :jm_shutdown_1 @l_soundsFactoryInterface)))



