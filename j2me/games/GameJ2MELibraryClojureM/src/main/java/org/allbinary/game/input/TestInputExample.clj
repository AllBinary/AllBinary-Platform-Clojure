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
;; package org.allbinary.game.input

(ns TestInputExample)

(JR/register 'TestInputExample nil '[TestInputInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :testValue 0)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TestInputExample)] (jinit_0 o) o))

    
(defn jm_up_0 [this]
  (let []
        nil))

    
(defn jm_down_0 [this]
  (let []
        nil))

    
(defn jm_left_0 [this]
  (let []
        (JR/finc this :testValue 1 :int false)))

    
(defn jm_right_0 [this]
  (let []
        (JR/finc this :testValue -1 :int false)))

    
(defn jm_strafeLeft_0 [this]
  (let []
        nil))

    
(defn jm_strafeRight_0 [this]
  (let []
        nil))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



