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
;; package org.allbinary.graphics

(ns ItemColorFactory)

(JR/register 'ItemColorFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ItemColorFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :INVERT_PAINT 0)
  (JR/fset this :PAINT 0)
  (JR/fset this :TEXT_FIELD_NO_FOCUS 0)
    (JR/fset this :INVERT_PAINT (unchecked-int 0xFF000000))
    (JR/fset this :PAINT (unchecked-int 0xFFe07718))
    (JR/fset this :TEXT_FIELD_NO_FOCUS (unchecked-int 0x7F7F7F))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ItemColorFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ItemColorFactory/jstatic_instance)))



