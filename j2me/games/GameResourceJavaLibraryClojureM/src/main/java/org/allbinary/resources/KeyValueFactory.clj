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
;; package org.allbinary.resources

(ns KeyValueFactory)

(JR/register 'KeyValueFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (KeyValueFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :MAP nil)
    (JR/fset this :MAP (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'KeyValueFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (KeyValueFactory/jstatic_instance)))

    
(defn jm_get_1 [this p_key]
  (let [ l_key (volatile! p_key)](JR/method
        (if (not (JR/invoke (JR/fget this :MAP) :jm_containsKey_1 @l_key))
            (do
            (JR/jreturn @l_key)))
        (JR/invoke (JR/fget this :MAP) :jm_get_1 @l_key))))



