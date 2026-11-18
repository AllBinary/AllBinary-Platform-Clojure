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
;; package org.allbinary.graphics.form

(ns ItemPaintableFactory)

(JR/register 'ItemPaintableFactory 'ItemPaintable '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ItemPaintableFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (ItemPaintable/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ItemPaintableFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ItemPaintableFactory/jstatic_instance)))

    
(defn jm_getInstanceItemPaintable_1 [this p_paintableForm]
  (let [ l_paintableForm (volatile! p_paintableForm)]
        (ItemPaintableFactory/jstatic_instance)))



