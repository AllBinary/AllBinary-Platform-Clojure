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
;; package org.allbinary.logic.system.security.licensing

(ns InApplicationPurchaseFactory)

(JR/register 'InApplicationPurchaseFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (InApplicationPurchaseFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (InApplicationPurchaseFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'InApplicationPurchaseFactory)] (jinit_0 o) o))

    
(defn jm_init_2 [this p_anyType p_stateObject]
  (let [ l_anyType (volatile! p_anyType) l_stateObject (volatile! p_stateObject)]
        nil))

    
(defn jm_onCreate_2 [this p_anyType p_stateObject]
  (let [ l_anyType (volatile! p_anyType) l_stateObject (volatile! p_stateObject)]
        nil))

    
(defn jm_onStart_0 [this]
  (let []
        nil))

    
(defn jm_onResult_3 [this p_requestCode p_resultCode p_data]
  (let [ l_requestCode (volatile! p_requestCode) l_resultCode (volatile! p_resultCode) l_data (volatile! p_data)]
        nil))

    
(defn jm_onSaveState_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        nil))

    
(defn jm_onStop_0 [this]
  (let []
        nil))

    
(defn jm_onDestroy_0 [this]
  (let []
        nil))

    
(defn jm_purchase_1 [this p_lockableFeature]
  (let [ l_lockableFeature (volatile! p_lockableFeature)]
        nil))

    
(defn jm_isPurchased_1 [this p_lockableFeature]
  (let [ l_lockableFeature (volatile! p_lockableFeature)]
        false))

    
(defn jm_add_1 [this p_lockableFeature]
  (let [ l_lockableFeature (volatile! p_lockableFeature)]
        nil))

    
(defn jm_getUserName_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_isEnabled_0 [this]
  (let []
        false))



