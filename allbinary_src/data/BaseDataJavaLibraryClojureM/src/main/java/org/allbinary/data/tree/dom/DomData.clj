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
;; package org.allbinary.data.tree.dom

(ns DomData)

(JR/register 'DomData nil '[])

(def jsv_ID (atom nil))
(def jsv_CHILD (atom nil))
(def jsv_NAME (atom nil))
(def jsv_VALUE (atom nil))
(def jsv_INDEX (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_ID [] (JR/ensure-init jclinit-state jclinit) @jsv_ID)
(defn jstatic_set_ID [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ID v))
(defn jstatic_CHILD [] (JR/ensure-init jclinit-state jclinit) @jsv_CHILD)
(defn jstatic_set_CHILD [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_CHILD v))
(defn jstatic_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NAME)
(defn jstatic_set_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NAME v))
(defn jstatic_VALUE [] (JR/ensure-init jclinit-state jclinit) @jsv_VALUE)
(defn jstatic_set_VALUE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_VALUE v))
(defn jstatic_INDEX [] (JR/ensure-init jclinit-state jclinit) @jsv_INDEX)
(defn jstatic_set_INDEX [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_INDEX v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_ID "id")
    (reset! jsv_CHILD "child")
    (reset! jsv_NAME "name")
    (reset! jsv_VALUE "value")
    (reset! jsv_INDEX "index")
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DomData)] (jinit_0 o) o))



