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
;; package org.allbinary.game.layer.resources

(ns OnDemandResources)

(JR/register 'OnDemandResources nil '[])

(def jsv_NULL_ON_DEMAND_RESOURCES (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ON_DEMAND_RESOURCES [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ON_DEMAND_RESOURCES)
(defn jstatic_set_NULL_ON_DEMAND_RESOURCES [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ON_DEMAND_RESOURCES v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ON_DEMAND_RESOURCES (OnDemandResources/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OnDemandResources)] (jinit_0 o) o))

    
(defn jm_waitFor_0 [this]
  (let []
        nil))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_initAt_5 [this p_imageCache p_resourceAnimationInterfaceFactoryInterfaceFactory p_portion p_loadingString p_index]
  (let [ l_imageCache (volatile! p_imageCache) l_resourceAnimationInterfaceFactoryInterfaceFactory (volatile! p_resourceAnimationInterfaceFactoryInterfaceFactory) l_portion (volatile! p_portion) l_loadingString (volatile! p_loadingString) l_index (volatile! p_index)]
        0))



