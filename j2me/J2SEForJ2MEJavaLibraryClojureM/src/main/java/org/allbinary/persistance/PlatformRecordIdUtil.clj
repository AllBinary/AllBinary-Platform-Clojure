;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.persistance

(ns PlatformRecordIdUtil)

(JR/register 'PlatformRecordIdUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PlatformRecordIdUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :PLATFORM_SHORT_NAME nil)
    (JR/fset this :PLATFORM_SHORT_NAME "JSE")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformRecordIdUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PlatformRecordIdUtil/jstatic_instance)))

    
(defn jm_getRecordId_2 [this p_abeClientInformation p_baseRecordId]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_baseRecordId (volatile! p_baseRecordId)]
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/invoke @l_abeClientInformation :jm_toShortString_0)) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :UNDERSCORE)) :jm_append_1 (JR/fget this :PLATFORM_SHORT_NAME)) :jm_append_1 @l_baseRecordId))))



