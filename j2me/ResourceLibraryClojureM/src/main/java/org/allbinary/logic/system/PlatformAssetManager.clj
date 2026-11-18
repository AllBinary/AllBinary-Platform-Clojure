;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.logic.system

(ns PlatformAssetManager)

(JR/register 'PlatformAssetManager nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PlatformAssetManager/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformAssetManager)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PlatformAssetManager/jstatic_instance)))

    
(defn jm_getResourceAsStream_1 [this p_resource]
  (let [ l_resource (volatile! p_resource) l_resourceUtil (volatile! nil) l_inputStream (volatile! nil)]
        (vreset! l_resourceUtil (JR/scall 'ResourceUtil :jm_getInstance_0))
        (vreset! l_inputStream (JR/invoke @l_resourceUtil :jm_getResourceAsStream_1 @l_resource))
        @l_inputStream))



