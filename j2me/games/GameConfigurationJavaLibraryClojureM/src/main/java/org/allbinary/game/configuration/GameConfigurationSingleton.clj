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
;; package org.allbinary.game.configuration

(ns GameConfigurationSingleton)

(JR/register 'GameConfigurationSingleton nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (GameConfigurationSingleton/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
  (JR/fset this :hashtable nil)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameConfigurationSingleton/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :list (BasicArrayListD/jnew_0))
        (JR/fset this :hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameConfigurationSingleton)] (jinit_0 o) o))

    
(defn jm_getInstanceByName_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/invoke (JR/fget this :hashtable) :jm_get_1 @l_name)))

    
(defn jm_getOptionsBasicArrayList_0 [this]
  (let []
        (JR/fget this :list)))

    
(defn jm_add_1 [this p_gameConfiguration]
  (let [ l_gameConfiguration (volatile! p_gameConfiguration)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_gameConfiguration)))

    
(defn jm_getHashtable_0 [this]
  (let []
        (JR/fget this :hashtable)))



