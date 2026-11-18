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
;; package org.allbinary.thirdparty.store

(ns ThirdPartyMessageFactory)

(JR/register 'ThirdPartyMessageFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ThirdPartyMessageFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :AUTHORIZED nil)
  (JR/fset this :NOT_AUTHORIZED nil)
  (JR/fset this :LINKAGE_ERROR nil)
    (JR/fset this :AUTHORIZED "Authorized")
    (JR/fset this :NOT_AUTHORIZED "Not Authorized")
    (JR/fset this :LINKAGE_ERROR "Linkage Error")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ThirdPartyMessageFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ThirdPartyMessageFactory/jstatic_instance)))



