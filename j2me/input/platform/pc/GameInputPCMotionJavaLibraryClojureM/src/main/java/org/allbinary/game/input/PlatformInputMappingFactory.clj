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
;; package org.allbinary.game.input

(ns PlatformInputMappingFactory)

(JR/register 'PlatformInputMappingFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PlatformInputMappingFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :inputToGameKeyMapping nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :inputToGameKeyMapping (JR/scall 'PersistentInputMapping :jm_getNullInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformInputMappingFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PlatformInputMappingFactory/jstatic_instance)))

    
(defn jm_getPersistentInputMappingInstance_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (if (JR/eq (JR/fget this :inputToGameKeyMapping) (JR/scall 'PersistentInputMapping :jm_getNullInstance_0))
                (do
                (JR/fset this :inputToGameKeyMapping (MotionLaptopGameInputMapping/jnew_0)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)) :else (throw jt)))))
        (JR/fget this :inputToGameKeyMapping)))



