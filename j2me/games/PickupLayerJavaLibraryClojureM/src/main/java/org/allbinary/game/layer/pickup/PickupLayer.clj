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
;; package org.allbinary.game.layer.pickup

(ns PickupLayer)

(JR/register 'PickupLayer 'MultiPlayerGameLayer '[PickedUpLayerInterface PickupableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :pickedUpLayerInterfaceFactoryInterface nil)
  (JR/fset this :destroyed false)
  (JR/fset this :animationInterface nil)
    (JR/fset this :pickedUpLayerInterfaceFactoryInterface (JR/sget 'CountedPickedUpLayerInterfaceFactory "NULL_COUNTED_PICKUP_LAYER_FACTORY"))
    (JR/fset this :animationInterface (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0))
  this)

    
(defn jinit_7 [this p_name p_remoteInfo p_total p_pickedUpLayerInterfaceFactoryInterface p_animationInterface p_rectangle p_viewPosition]
  (let [ l_name (volatile! p_name) l_remoteInfo (volatile! p_remoteInfo) l_total (volatile! p_total) l_pickedUpLayerInterfaceFactoryInterface (volatile! p_pickedUpLayerInterfaceFactoryInterface) l_animationInterface (volatile! p_animationInterface) l_rectangle (volatile! p_rectangle) l_viewPosition (volatile! p_viewPosition)]
        (MultiPlayerGameLayer/jinit_5 this @l_remoteInfo (JR/fget (JR/scall 'BasicGroupFactory :jm_getInstance_0) :NONE_ARRAY) @l_name @l_rectangle @l_viewPosition) (jinitfields this)
        (JR/invoke this :jm_setCollidableInferface_1 (JR/invoke (JR/scall 'CollidableAlwaysPickupNeverCollideBehaviorFactory :jm_getInstance_0) :jm_createBehavior_0))
        (JR/invoke this :jm_setLayerWidth_1 10)
        (JR/invoke this :jm_setLayerHeight_1 10)
        (JR/invoke this :jm_init_2 @l_pickedUpLayerInterfaceFactoryInterface @l_animationInterface))
  this)

(defn jnew_7 [p_name p_remoteInfo p_total p_pickedUpLayerInterfaceFactoryInterface p_animationInterface p_rectangle p_viewPosition ]
  (let [o (JR/alloc 'PickupLayer)] (jinit_7 o p_name p_remoteInfo p_total p_pickedUpLayerInterfaceFactoryInterface p_animationInterface p_rectangle p_viewPosition) o))

    
(defn jm_init_2 [this p_pickedUpLayerInterfaceFactoryInterface p_animationInterface]
  (let [ l_pickedUpLayerInterfaceFactoryInterface (volatile! p_pickedUpLayerInterfaceFactoryInterface) l_animationInterface (volatile! p_animationInterface)]
        (JR/fset this :pickedUpLayerInterfaceFactoryInterface @l_pickedUpLayerInterfaceFactoryInterface)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/invoke this :jm_setDestroyed_1 false)))

    
(defn jm_initXYZ_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/invoke this :jm_setPosition_3 @l_x @l_y @l_z)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_viewPosition (volatile! nil) l_viewX (volatile! nil) l_viewY (volatile! nil)]
        (vreset! l_viewPosition (JR/invoke this :jm_getViewPosition_0))
        (vreset! l_viewX (JR/invoke @l_viewPosition :jm_getX_0))
        (vreset! l_viewY (JR/invoke @l_viewPosition :jm_getY_0))
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics @l_viewX @l_viewY)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_viewPosition (volatile! nil) l_viewX (volatile! nil) l_viewY (volatile! nil)]
        (vreset! l_viewPosition (JR/invoke this :jm_getViewPosition_0))
        (vreset! l_viewX (JR/invoke @l_viewPosition :jm_getX_0))
        (vreset! l_viewY (JR/invoke @l_viewPosition :jm_getY_0))
        (JR/invoke (JR/fget this :animationInterface) :jm_paintThreedXYZ_4 @l_graphics @l_viewX @l_viewY 3)))

    
(defn jm_getPickedUpLayerInterfaceFactoryInterface_0 [this]
  (let []
        (JR/fget this :pickedUpLayerInterfaceFactoryInterface)))

    
(defn jm_setPickedUp_0 [this]
  (let []
        (JR/invoke this :jm_setDestroyed_1 true)))

    
(defn jm_isDestroyed_0 [this]
  (let []
        (JR/fget this :destroyed)))

    
(defn jm_setDestroyed_1 [this p_destroyed]
  (let [ l_destroyed (volatile! p_destroyed)]
        (JR/fset this :destroyed @l_destroyed)
        (if (JR/invoke this :jm_isDestroyed_0)
            (do
            (JR/invoke (JR/scall 'DestroyedLayerProcessor :jm_getInstance_0) :jm_add_1 this)))))

    
(defn jm_damage_2 [this p_damage p_damageType]
  (let [ l_damage (volatile! p_damage) l_damageType (volatile! p_damageType)]
        nil))

    
(defn jm_getDamage_1 [this p_damageType]
  (let [ l_damageType (volatile! p_damageType)]
        0))

    
(defn jm_set_1 [this p_gl]
  (let [ l_gl (volatile! p_gl) l_openGLSurfaceChangedInterface (volatile! nil)]
        (vreset! l_openGLSurfaceChangedInterface (JR/fget this :animationInterface))
        (JR/invoke @l_openGLSurfaceChangedInterface :jm_set_1 @l_gl)))



