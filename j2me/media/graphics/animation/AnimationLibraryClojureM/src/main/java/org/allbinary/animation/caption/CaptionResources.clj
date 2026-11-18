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
;; package org.allbinary.animation.caption

(ns CaptionResources)

(JR/register 'CaptionResources nil '[])

(def jsv_RESOURCE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_RESOURCE [] (JR/ensure-init jclinit-state jclinit) @jsv_RESOURCE)
(defn jstatic_set_RESOURCE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_RESOURCE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_RESOURCE "/character_message_bubbled_box.png")
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CaptionResources)] (jinit_0 o) o))



