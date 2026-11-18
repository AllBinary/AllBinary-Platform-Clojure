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
;; package org.allbinary.game.tick

(ns NullTickable)

(JR/register 'NullTickable nil '[TickableInterface])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (NullTickable/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NAME nil)
    (JR/fset this :NAME "NulLTickable")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullTickable)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NullTickable/jstatic_SINGLETON)))

    
(defn jm_processTick_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        nil))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :NAME)))



