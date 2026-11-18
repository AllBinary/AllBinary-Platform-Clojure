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
;; package org.allbinary.game.configuration.feature

(ns Feature)

(JR/register 'Feature nil '[])

(def jsv_hashtable (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_hashtable [] (JR/ensure-init jclinit-state jclinit) @jsv_hashtable)
(defn jstatic_set_hashtable [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_hashtable v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  this)

    
(defn jinit_1 [this p_name]
  (let [ l_name (volatile! p_name)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (Feature/jm_add_2 @l_name this)
        (JR/invoke (JR/scall 'ChangedGameFeatureListener :jm_getInstance_0) :jm_add_1 this))
  this)

(defn jnew_1 [p_name ]
  (let [o (JR/alloc 'Feature)] (jinit_1 o p_name) o))

    
(defn jm_getInstance_1 [p_name]
  (let [this nil l_name (volatile! p_name)]
        (JR/invoke (Feature/jstatic_hashtable) :jm_get_1 @l_name)))

    
(defn jm_add_2 [p_name p_gameFeature]
  (let [this nil l_name (volatile! p_name) l_gameFeature (volatile! p_gameFeature)]
        (JR/invoke (Feature/jstatic_hashtable) :jm_put_2 @l_name @l_gameFeature)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/invoke this :jm_getName_0)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))



