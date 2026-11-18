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

(ns EarlySoundsFactory)

(JR/register 'EarlySoundsFactory 'BaseSoundsFactory '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (EarlySoundsFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (BaseSoundsFactory/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'EarlySoundsFactory)] (jinit_0 o) o))

    
(defn jm_getSoundInterfaceArray_0 [this]
  (let [ l_soundInterfaceArray (volatile! nil) l_index (volatile! nil)]
        (vreset! l_soundInterfaceArray (JR/anew "Object" 1 2))
        (vreset! l_index 0)
        (JR/aset* @l_soundInterfaceArray (JR/vinc l_index 1 :int true) (JR/scall 'SelectSound :jm_getInstance_0))
        (JR/aset* @l_soundInterfaceArray (JR/vinc l_index 1 :int true) (JR/scall 'ErrorSound :jm_getInstance_0))
        @l_soundInterfaceArray))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (EarlySoundsFactory/jstatic_instance)))



