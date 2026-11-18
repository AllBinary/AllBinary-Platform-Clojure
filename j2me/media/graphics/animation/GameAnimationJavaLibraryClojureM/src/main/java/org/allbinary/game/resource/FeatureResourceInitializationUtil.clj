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
;; package org.allbinary.game.resource

(ns FeatureResourceInitializationUtil)

(JR/register 'FeatureResourceInitializationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (FeatureResourceInitializationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'FeatureResourceInitializationUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FeatureResourceInitializationUtil/jstatic_instance)))

    
(defn jm_init_1 [this p_level]
  (let [ l_level (volatile! p_level) l_commonStrings (volatile! nil) l_featuredResourceFactory (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget @l_commonStrings :START) this (JR/fget @l_commonStrings :INIT))
        (vreset! l_featuredResourceFactory (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0))
        (JR/invoke @l_featuredResourceFactory :jm_init_1 @l_level)
        (JR/invoke (JR/scall 'FeaturedResourceRelativeRelationshipFactory :jm_getInstance_0) :jm_init_1 @l_level)))



