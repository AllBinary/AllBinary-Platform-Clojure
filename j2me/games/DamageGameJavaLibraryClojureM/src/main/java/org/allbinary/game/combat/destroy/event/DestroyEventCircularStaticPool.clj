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
;; package org.allbinary.game.combat.destroy.event

(ns DestroyEventCircularStaticPool)

(JR/register 'DestroyEventCircularStaticPool nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DestroyEventCircularStaticPool/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EVENT_POOL nil)
    (JR/fset this :EVENT_POOL (AllBinaryEventCircularPool/jnew_1 20))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DestroyEventCircularStaticPool/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DestroyEventCircularStaticPool)] (jinit_0 o) o))

    
(defn jm_init_1 [this p_combatGameCanvas]
  (let [ l_combatGameCanvas (volatile! p_combatGameCanvas)]
        (JR/invoke (JR/fget this :EVENT_POOL) :jm_initAllBinaryEventCircularPool_1 (DestroyEventFactory/jnew_1 @l_combatGameCanvas))))

    
(defn jm_getInstanceForLayer_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_destroyedEvent (volatile! nil)]
        (vreset! l_destroyedEvent (JR/invoke (JR/fget this :EVENT_POOL) :jm_getNextInstance_0))
        (JR/invoke @l_destroyedEvent :jm_setLayerInterfaceForCircularStaticPool_1 @l_layerInterface)
        @l_destroyedEvent))



