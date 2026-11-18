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

(ns CachePolicyFactory)

(JR/register 'CachePolicyFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CachePolicyFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NAME nil)
  (JR/fset this :MAX_TIME_THOUSAND_MAX nil)
  (JR/fset this :THIRTY_MINUTES_TEN_THOUSAND_MAX nil)
  (JR/fset this :THIRTY_MINUTES_FIFTY_THOUSAND_MAX nil)
  (JR/fset this :ONE_MINUTE_FIVE_MAX nil)
  (JR/fset this :ONE_MINUTE_TEN_MAX nil)
  (JR/fset this :ONE_MINUTE_ONE_HUNDRED_MAX nil)
    (JR/fset this :NAME "lru")
    (JR/fset this :MAX_TIME_THOUSAND_MAX (CachePolicy/jnew_3 (JR/fget this :NAME) java.lang.Long/MAX_VALUE 1000))
    (JR/fset this :THIRTY_MINUTES_TEN_THOUSAND_MAX (CachePolicy/jnew_3 (JR/fget this :NAME) (unchecked-int (unchecked-multiply (unchecked-int (unchecked-multiply 1000 60)) 30)) 10000))
    (JR/fset this :THIRTY_MINUTES_FIFTY_THOUSAND_MAX (CachePolicy/jnew_3 (JR/fget this :NAME) (unchecked-int (unchecked-multiply (unchecked-int (unchecked-multiply 1000 60)) 30)) 100000))
    (JR/fset this :ONE_MINUTE_FIVE_MAX (CachePolicy/jnew_3 (JR/fget this :NAME) (unchecked-int (unchecked-multiply (unchecked-int (unchecked-multiply 1000 60)) 1)) 5))
    (JR/fset this :ONE_MINUTE_TEN_MAX (CachePolicy/jnew_3 (JR/fget this :NAME) (unchecked-int (unchecked-multiply (unchecked-int (unchecked-multiply 1000 60)) 1)) 10))
    (JR/fset this :ONE_MINUTE_ONE_HUNDRED_MAX (CachePolicy/jnew_3 (JR/fget this :NAME) (unchecked-int (unchecked-multiply (unchecked-int (unchecked-multiply 1000 60)) 1)) 100))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CachePolicyFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CachePolicyFactory/jstatic_instance)))



