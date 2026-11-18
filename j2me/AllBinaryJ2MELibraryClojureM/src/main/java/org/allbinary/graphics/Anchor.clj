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

(ns Anchor)

(JR/register 'Anchor nil '[])

(def jsv_TOP_LEFT (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_TOP_LEFT [] (JR/ensure-init jclinit-state jclinit) @jsv_TOP_LEFT)
(defn jstatic_set_TOP_LEFT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TOP_LEFT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_TOP_LEFT (bit-and (JR/sget 'Graphics "TOP") (JR/sget 'Graphics "LEFT")))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'Anchor)] (jinit_0 o) o))



