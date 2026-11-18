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
;; package org.allbinary.game.displayable.canvas

(ns TitleResource)

(JR/register 'TitleResource nil '[])

(def jsv_RESOURCE_TITLE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_RESOURCE_TITLE [] (JR/ensure-init jclinit-state jclinit) @jsv_RESOURCE_TITLE)
(defn jstatic_set_RESOURCE_TITLE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_RESOURCE_TITLE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_RESOURCE_TITLE "/title_sprite_100_by_100.png")
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TitleResource)] (jinit_0 o) o))



