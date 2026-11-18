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
;; package org.allbinary.game.combat.destroy

(ns DestroyableBaseBehavior)

(JR/register 'DestroyableBaseBehavior nil '[DestroyableInterface])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DestroyableBaseBehavior/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DestroyableBaseBehavior)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DestroyableBaseBehavior/jstatic_instance)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/class-name this)))

    
(defn jm_isDestroyed_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :NOT_IMPLEMENTED)))))

    
(defn jm_setDestroyed_1 [this p_destroyed]
  (let [ l_destroyed (volatile! p_destroyed)]
        nil))



