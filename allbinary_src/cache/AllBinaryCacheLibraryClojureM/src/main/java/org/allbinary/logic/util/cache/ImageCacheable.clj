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
;; package org.allbinary.logic.util.cache

(ns ImageCacheable)

(JR/register 'ImageCacheable nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_2 [this p_name p_anyType]
  (let [ l_name (volatile! p_name) l_anyType (volatile! p_anyType)]
    nil (jinitfields this)
        nil)
  this)

(defn jnew_2 [p_name p_anyType ]
  (let [o (JR/alloc 'ImageCacheable)] (jinit_2 o p_name p_anyType) o))

    
(defn jm_getKey_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget this :name)))



