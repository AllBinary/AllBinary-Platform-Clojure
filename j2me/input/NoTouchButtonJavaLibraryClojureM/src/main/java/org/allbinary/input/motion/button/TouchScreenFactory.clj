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

(ns TouchScreenFactory)

(JR/register 'TouchScreenFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (TouchScreenFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :multiTouch false)
  (JR/fset this :touch false)
  (JR/fset this :touchScreenType nil)
    (JR/fset this :touchScreenType (JR/fget (JR/scall 'TouchScreenTypesFactory :jm_getInstance_0) :NOTOUCH))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchScreenFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TouchScreenFactory/jstatic_SINGLETON)))

    
(defn jm_isMultiTouch_0 [this]
  (let []
        (JR/fget this :multiTouch)))

    
(defn jm_setTouch_1 [this p_touch]
  (let [ l_touch (volatile! p_touch)]
        nil))

    
(defn jm_isTouch_0 [this]
  (let []
        (JR/fget this :touch)))

    
(defn jm_getTouchScreenType_0 [this]
  (let []
        (JR/fget this :touchScreenType)))



