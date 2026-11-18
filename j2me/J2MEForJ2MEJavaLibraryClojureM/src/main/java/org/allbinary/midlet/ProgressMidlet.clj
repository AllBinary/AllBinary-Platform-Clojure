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
;; package org.allbinary.midlet

;;J2MEForJ2ME
(ns ProgressMidlet)

(JR/register 'ProgressMidlet 'AllBinaryMidlet '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :abeClientInformation nil)
  this)

    
(defn jinit_1 [this p_clientInformationFactory]
  (let [ l_clientInformationFactory (volatile! p_clientInformationFactory)]
    (AllBinaryMidlet/jinit_0 this) (jinitfields this)
        (JR/invoke this :jm_preInit_0)
        (JR/fset this :abeClientInformation (JR/invoke @l_clientInformationFactory :jm_getInstance_0)))
  this)

(defn jnew_1 [p_clientInformationFactory ]
  (let [o (JR/alloc 'ProgressMidlet)] (jinit_1 o p_clientInformationFactory) o))

    
(defn jm_preInit_0 [this]
  (let []
        nil))

    
(defn jm_exitProgress_1 [this p_isProgress]
  (let [ l_isProgress (volatile! p_isProgress) l_processor (volatile! nil) l_primaryThreadPool (volatile! nil) l_runnable (volatile! nil) l_e2 (volatile! nil) l_e (volatile! nil)]
        (vreset! l_processor (JR/invoke (JR/scall 'MidletExitProcessorFactory :jm_getInstance_0) :jm_getExitInstance_1 this))
        (try (do
            (vreset! l_primaryThreadPool (JR/scall 'PrimaryThreadPool :jm_getInstance_0))
            (vreset! l_runnable (ExitRunnable/jnew_3 this @l_processor @l_isProgress))
            (JR/invoke @l_primaryThreadPool :jm_runTask_1 @l_runnable))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "exit" @l_e)
            (try (do
                (JR/invoke @l_processor :jm_process_0))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e2 je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "exit" @l_e)) :else (throw jt)))))) :else (throw jt)))))))



