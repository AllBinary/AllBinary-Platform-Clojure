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

(ns InputFeatureFactory)

(JR/register 'InputFeatureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (InputFeatureFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :REMOVE_DUPLICATE_KEY_PRESSES nil)
  (JR/fset this :INPUT_MAPPING nil)
  (JR/fset this :MULTI_KEY_PRESS nil)
  (JR/fset this :SINGLE_KEY_REPEAT_PRESS nil)
  (JR/fset this :SINGLE_KEY_PRESS nil)
    (JR/fset this :REMOVE_DUPLICATE_KEY_PRESSES (InputFeature/jnew_1 "Remove Duplicate Key Presses"))
    (JR/fset this :INPUT_MAPPING (InputFeature/jnew_1 "Input Mapping"))
    (JR/fset this :MULTI_KEY_PRESS (InputFeature/jnew_1 "Multi Key Press"))
    (JR/fset this :SINGLE_KEY_REPEAT_PRESS (InputFeature/jnew_1 "Single Key Repeat Press"))
    (JR/fset this :SINGLE_KEY_PRESS (InputFeature/jnew_1 "Single Key Press"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (InputFeatureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'InputFeatureFactory)] (jinit_0 o) o))

    
(defn jm_isSingleKeyProcessing_0 [this]
  (let [ l_features (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (or (JR/invoke @l_features :jm_isFeature_1 (JR/fget this :SINGLE_KEY_REPEAT_PRESS)) (JR/invoke @l_features :jm_isFeature_1 (JR/fget this :SINGLE_KEY_PRESS)))
            (do
            true)
            (do
            false))))



