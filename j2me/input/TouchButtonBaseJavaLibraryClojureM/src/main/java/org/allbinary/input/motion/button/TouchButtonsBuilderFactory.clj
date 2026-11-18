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
;; package org.allbinary.input.motion.button

(ns TouchButtonsBuilderFactory)

(JR/register 'TouchButtonsBuilderFactory nil '[])

(def jsv_NO_TOUCH_BUTTON_BUILDER_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NO_TOUCH_BUTTON_BUILDER_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_NO_TOUCH_BUTTON_BUILDER_FACTORY)
(defn jstatic_set_NO_TOUCH_BUTTON_BUILDER_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NO_TOUCH_BUTTON_BUILDER_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NO_TOUCH_BUTTON_BUILDER_FACTORY (TouchButtonsBuilderFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'TouchButtonsBuilderFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 [this]
  (let []
        (JR/scall 'NoButtonsTouchInputFactory :jm_getInstance_0)))



