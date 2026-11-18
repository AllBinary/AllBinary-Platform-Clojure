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

(ns ThirdPartyInApplicationPurchase)

(JR/register 'ThirdPartyInApplicationPurchase nil '[ThirdPartyInApplicationPurchaseInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ThirdPartyInApplicationPurchase)] (jinit_0 o) o))

    
(defn jm_isPurchased_1 [this p_lockableFeature]
  (let [ l_lockableFeature (volatile! p_lockableFeature)]
        false))

    
(defn jm_onCreate_2 [this p_anyType p_stateObject]
  (let [ l_anyType (volatile! p_anyType) l_stateObject (volatile! p_stateObject)]
        nil))

    
(defn jm_onDestroy_0 [this]
  (let []
        nil))

    
(defn jm_onStart_0 [this]
  (let []
        nil))

    
(defn jm_onActivityResult_3 [this p_requestCode p_resultCode p_dataObject]
  (let [ l_requestCode (volatile! p_requestCode) l_resultCode (volatile! p_resultCode) l_dataObject (volatile! p_dataObject)]
        nil))

    
(defn jm_onSaveInstanceState_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        nil))

    
(defn jm_onStop_0 [this]
  (let []
        nil))

    
(defn jm_requestPurchase_1 [this p_lockableFeature]
  (let [ l_lockableFeature (volatile! p_lockableFeature)]
        nil))

    
(defn jm_requestReceipts_0 [this]
  (let []
        nil))

    
(defn jm_add_1 [this p_lockableFeature]
  (let [ l_lockableFeature (volatile! p_lockableFeature)]
        nil))

    
(defn jm_getUserName_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_isEnabled_0 [this]
  (let []
        false))

    
(defn jm_requestProducts_0 [this]
  (let []
        nil))



