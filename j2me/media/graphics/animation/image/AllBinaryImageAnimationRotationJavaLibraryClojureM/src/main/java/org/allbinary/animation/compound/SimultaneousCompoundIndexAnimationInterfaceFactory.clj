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
;; package org.allbinary.animation.compound

(ns SimultaneousCompoundIndexAnimationInterfaceFactory)

(JR/register 'SimultaneousCompoundIndexAnimationInterfaceFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :basicAnimationInterfaceFactoryInterfaceArray nil)
  (JR/fset this :animationBehaviorFactory nil)
  this)

    
(defn jinit_2 [this p_basicAnimationInterfaceFactoryInterfaceArray p_animationBehaviorFactory]
  (let [ l_basicAnimationInterfaceFactoryInterfaceArray (volatile! p_basicAnimationInterfaceFactoryInterfaceArray) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
    nil (jinitfields this)
        (JR/fset this :basicAnimationInterfaceFactoryInterfaceArray @l_basicAnimationInterfaceFactoryInterfaceArray)
        (JR/fset this :animationBehaviorFactory @l_animationBehaviorFactory))
  this)

(defn jnew_2 [p_basicAnimationInterfaceFactoryInterfaceArray p_animationBehaviorFactory ]
  (let [o (JR/alloc 'SimultaneousCompoundIndexAnimationInterfaceFactory)] (jinit_2 o p_basicAnimationInterfaceFactoryInterfaceArray p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_size (volatile! nil) l_animationInterfaceArray (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/alen (JR/fget this :basicAnimationInterfaceFactoryInterfaceArray)))
        (vreset! l_animationInterfaceArray (JR/anew "Object" 1 @l_size))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_animationInterfaceArray @l_index (JR/invoke (JR/aget* (JR/fget this :basicAnimationInterfaceFactoryInterfaceArray) @l_index) :jm_getInstance_1 @l_instanceId))))
        (JR/invoke this :jm_getOrCreate_1 @l_animationInterfaceArray)))

    
(defn jm_getOrCreate_1 [this p_animationInterfaceArray]
  (let [ l_animationInterfaceArray (volatile! p_animationInterfaceArray)]
        (SimultaneousCompoundIndexAnimation/jnew_2 @l_animationInterfaceArray (JR/invoke (JR/fget this :animationBehaviorFactory) :jm_getOrCreateInstance_0))))

    
(defn jm_getBasicAnimationInterfaceFactoryInterfaceArray_0 [this]
  (let []
        (JR/fget this :basicAnimationInterfaceFactoryInterfaceArray)))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        nil))



