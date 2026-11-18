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
;; package org.allbinary.animation.vector

(ns LineAnimationFactory)

(JR/register 'LineAnimationFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :basicColor nil)
  this)

    
(defn jinit_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
    nil (jinitfields this)
        (JR/fset this :basicColor @l_basicColor))
  this)

(defn jnew_1 [p_basicColor ]
  (let [o (JR/alloc 'LineAnimationFactory)] (jinit_1 o p_basicColor) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (LineAnimation/jnew_1 (JR/fget this :basicColor))))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



