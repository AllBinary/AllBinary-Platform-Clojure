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

(ns BaseSoundsFactory)

(JR/register 'BaseSoundsFactory nil '[SoundsFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :initialized false)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BaseSoundsFactory)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_getSoundInterfaceArray_0 [this]
  (let []
        (JR/anew "Object" 1 0)))

    
(defn jm_setInitialized_1 [this p_initialized]
  (let [ l_initialized (volatile! p_initialized)]
        (JR/fset this :initialized @l_initialized)))

    
(defn jm_isInitialized_0 [this]
  (let []
        (JR/fget this :initialized)))



