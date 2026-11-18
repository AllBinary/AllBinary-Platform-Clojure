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

(ns StoreAppClientInformation)

(JR/register 'StoreAppClientInformation 'AbeClientInformation '[LongArrayIdentifierInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :longArrayIdentifier nil)
  this)

    
(defn jinit_5 [this p_name p_version p_specialName p_shortName p_longArrayIdentifier]
  (let [ l_name (volatile! p_name) l_version (volatile! p_version) l_specialName (volatile! p_specialName) l_shortName (volatile! p_shortName) l_longArrayIdentifier (volatile! p_longArrayIdentifier)]
        (AbeClientInformation/jinit_4 this @l_name @l_version @l_specialName @l_shortName) (jinitfields this)
        (JR/fset this :longArrayIdentifier @l_longArrayIdentifier))
  this)

(defn jnew_5 [p_name p_version p_specialName p_shortName p_longArrayIdentifier ]
  (let [o (JR/alloc 'StoreAppClientInformation)] (jinit_5 o p_name p_version p_specialName p_shortName p_longArrayIdentifier) o))

    
(defn jm_getLongArrayIdentifier_0 [this]
  (let []
        (JR/fget this :longArrayIdentifier)))



