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
;; package org.allbinary.animation

(ns AnimationInterfaceFactoryInterfaceComposite)

(JR/register 'AnimationInterfaceFactoryInterfaceComposite nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterfaceFactoryInterfaceArray nil)
  this)

    
(defn jinit_1 [this p_basicAnimationInterfaceFactoryInterfaceArray]
  (let [ l_basicAnimationInterfaceFactoryInterfaceArray (volatile! p_basicAnimationInterfaceFactoryInterfaceArray)]
    nil (jinitfields this)
        (JR/fset this :animationInterfaceFactoryInterfaceArray @l_basicAnimationInterfaceFactoryInterfaceArray))
  this)

(defn jnew_1 [p_basicAnimationInterfaceFactoryInterfaceArray ]
  (let [o (JR/alloc 'AnimationInterfaceFactoryInterfaceComposite)] (jinit_1 o p_basicAnimationInterfaceFactoryInterfaceArray) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0)))

    
(defn jm_getAnimationInterfaceFactoryInterfaceArray_0 [this]
  (let []
        (JR/fget this :animationInterfaceFactoryInterfaceArray)))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



