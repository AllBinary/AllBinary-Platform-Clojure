;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2007 AllBinary 
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

(ns CacheType)

(JR/register 'CacheType nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :vendor nil)
  (JR/fset this :type nil)
  this)

    
(defn jinit_2 [this p_vendor p_type]
  (let [ l_vendor (volatile! p_vendor) l_type (volatile! p_type)]
    nil (jinitfields this)
        (JR/fset this :vendor @l_vendor)
        (JR/fset this :type @l_type))
  this)

(defn jnew_2 [p_vendor p_type ]
  (let [o (JR/alloc 'CacheType)] (jinit_2 o p_vendor p_type) o))

    
(defn jm_getVendor_0 [this]
  (let []
        (JR/fget this :vendor)))

    
(defn jm_getType_0 [this]
  (let []
        (JR/fget this :type)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "CacheType: Vendor: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getVendor_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " Type: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getType_0))
        (JR/to-string-of @l_stringBuffer)))



