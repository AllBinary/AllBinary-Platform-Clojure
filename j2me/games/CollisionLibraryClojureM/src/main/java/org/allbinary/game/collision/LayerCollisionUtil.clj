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
;; package org.allbinary.game.collision

(ns LayerCollisionUtil)

(JR/register 'LayerCollisionUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LayerCollisionUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :collisionProcessor nil)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LayerCollisionUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_features (volatile! nil) l_gameFeatureFactory (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_gameFeatureFactory (JR/scall 'GameFeatureFactory :jm_getInstance_0))
        (if (and (JR/invoke (JR/scall 'OpenGLFeatureUtil :jm_getInstance_0) :jm_isAnyThreed_0) (not (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_gameFeatureFactory :COLLISIONS_FORCED_TWO_DIMENSIONAL))))
            (do
            (JR/fset this :collisionProcessor (CollisionThreedProcessor/jnew_0)))
            (do
            (JR/fset this :collisionProcessor (Collision2DProcessor/jnew_0)))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LayerCollisionUtil)] (jinit_0 o) o))

    
(defn jm_isCollision_2 [this p_myLayer p_myLayer2]
  (let [ l_myLayer (volatile! p_myLayer) l_myLayer2 (volatile! p_myLayer2)]
        (JR/invoke (JR/fget this :collisionProcessor) :jm_isCollision_2 @l_myLayer @l_myLayer2)))



