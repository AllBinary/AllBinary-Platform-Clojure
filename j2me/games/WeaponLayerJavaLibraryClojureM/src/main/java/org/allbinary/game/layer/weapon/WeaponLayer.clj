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
;; package org.allbinary.game.layer.weapon

(ns WeaponLayer)

(JR/register 'WeaponLayer 'MultiPlayerGameLayer '[TickableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  (JR/fset this :initAnimationInterface nil)
  (JR/fset this :destroyedAnimationInterface nil)
  (JR/fset this :sourceLayerInterface nil)
  (JR/fset this :totalDamage 0)
  (JR/fset this :initDamage 0)
  (JR/fset this :destroyed false)
  (JR/fset this :scoreableInterface nil)
  (JR/fset this :movement nil)
  (JR/fset this :weaponProperties nil)
  (JR/fset this :multiPlayerType 0)
  (JR/fset this :collidableWeaponBehavior nil)
    (JR/fset this :animationInterface (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0))
    (JR/fset this :sourceLayerInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
    (JR/fset this :destroyed true)
    (JR/fset this :scoreableInterface (JR/scall 'NoScoreable :jm_getInstance_0))
    (JR/fset this :weaponProperties (JR/sget 'WeaponProperties "NULL_WEAPON_PROPERTIES"))
    (JR/fset this :collidableWeaponBehavior (JR/scall 'CollidableWeaponBehavior :jm_getNullInstance_0))
  this)

    
(defn jinit_8 [this p_name p_remoteInfo p_multiPlayerType p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition]
  (let [ l_name (volatile! p_name) l_remoteInfo (volatile! p_remoteInfo) l_multiPlayerType (volatile! p_multiPlayerType) l_movement (volatile! p_movement) l_animationInterface (volatile! p_animationInterface) l_destroyedAnimationInterface (volatile! p_destroyedAnimationInterface) l_rectangle (volatile! p_rectangle) l_viewPosition (volatile! p_viewPosition)]
        (MultiPlayerGameLayer/jinit_5 this @l_remoteInfo (JR/fget (JR/scall 'BasicGroupFactory :jm_getInstance_0) :NONE_ARRAY) @l_name @l_rectangle @l_viewPosition) (jinitfields this)
        (JR/fset this :initAnimationInterface @l_animationInterface)
        (JR/invoke this :jm_setAnimationInterface_1 @l_animationInterface)
        (JR/fset this :destroyedAnimationInterface @l_destroyedAnimationInterface)
        (JR/fset this :movement @l_movement)
        (JR/fset this :multiPlayerType @l_multiPlayerType))
  this)

(defn jnew_8 [p_name p_remoteInfo p_multiPlayerType p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition ]
  (let [o (JR/alloc 'WeaponLayer)] (jinit_8 o p_name p_remoteInfo p_multiPlayerType p_movement p_animationInterface p_destroyedAnimationInterface p_rectangle p_viewPosition) o))

    
(defn jm_setCollidableInferface_1 [this p_collidableInferface]
  (let [ l_collidableInferface (volatile! p_collidableInferface)]
        (JR/invoke-super 'MultiPlayerGameLayer this :jm_setCollidableInferface_1 @l_collidableInferface)
        (JR/fset this :collidableWeaponBehavior (JR/invoke this :jm_getCollidableInferface_0))))

    
(defn jm_initXYZ_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/fset this :x @l_x)
        (JR/fset this :y @l_y)
        (JR/fset this :z @l_z)))

    
(defn jm_init_5 [this p_sourceLayerInterface p_angle p_otherAngle p_weaponProperties p_scoreable]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_weaponProperties (volatile! p_weaponProperties) l_scoreable (volatile! p_scoreable)]
        (JR/invoke this :jm_setWeaponPropertiesP_1 @l_weaponProperties)
        (JR/invoke this :jm_setReadyForExplosion_1 false)
        (JR/invoke this :jm_setAnimationInterface_1 (JR/invoke this :jm_getInitAnimationInterfaceP_0))
        (JR/invoke this :jm_setOwnerLayerInterface_1 @l_sourceLayerInterface)
        (JR/invoke (JR/fget this :collidableWeaponBehavior) :jm_init_1 @l_sourceLayerInterface)
        (JR/invoke this :jm_setGroupInterfaces_0)
        (if (some? @l_scoreable)
            (do
            (JR/fset this :scoreableInterface @l_scoreable)))
        (JR/fset this :totalDamage 0)
        (JR/fset this :initDamage (JR/invoke @l_weaponProperties :jm_getDamage_0))
        (JR/invoke this :jm_setDestroyed_1 false)
        (JR/invoke (JR/fget this :movement) :jm_init_3 (JR/invoke @l_weaponProperties :jm_getSpeed_0) @l_angle @l_otherAngle)))

    
(defn jm_setGroupInterfaces_0 [this]
  (let [ l_basicGroupFactory (volatile! nil)]
        (vreset! l_basicGroupFactory (JR/scall 'BasicGroupFactory :jm_getInstance_0))
        (if (JR/eq (JR/aget* (JR/invoke (JR/fget this :sourceLayerInterface) :jm_getGroupInterface_0) 0) (JR/fget @l_basicGroupFactory :ENEMY))
            (do
            (JR/invoke this :jm_setGroupInterface_1 (JR/fget @l_basicGroupFactory :ENEMY_ARRAY)))
            (do
            (JR/invoke this :jm_setGroupInterface_1 (JR/invoke (JR/fget this :sourceLayerInterface) :jm_getGroupInterface_0))))))

    
(defn jm_processTick_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_collidableWeaponBehavior (volatile! nil) l_indexedAnimationInterface (volatile! nil) l_currentFrame (volatile! nil)]
        (if (and (JR/invoke this :jm_isExhausted_0) (not (JR/invoke this :jm_isDestroyed_0)))
            (do
            (if (JR/invoke this :jm_isReadyForExplosion_0)
                (do
                (vreset! l_indexedAnimationInterface (JR/invoke this :jm_getAnimationInterface_0))
                (vreset! l_currentFrame (JR/invoke @l_indexedAnimationInterface :jm_getFrame_0))
                (if (< @l_currentFrame (unchecked-int (unchecked-subtract (JR/invoke @l_indexedAnimationInterface :jm_getAnimationSize_0) 1)))
                    (do
                    (JR/invoke @l_indexedAnimationInterface :jm_nextFrame_0))
                    (do
                    (JR/invoke this :jm_setDestroyed_1 true))))
                (do
                (vreset! l_collidableWeaponBehavior (JR/invoke this :jm_getCollidableInferface_0))
                (if (JR/invoke @l_collidableWeaponBehavior :jm_isCollided_0)
                    (do
                    (JR/invoke this :jm_setAnimationInterface_1 (JR/fget this :destroyedAnimationInterface))
                    (JR/invoke (JR/invoke this :jm_getMovement_0) :jm_stop_0)
                    (JR/invoke this :jm_setReadyForExplosion_1 true))
                    (do
                    (JR/invoke this :jm_setDestroyed_1 true)))))))
        (JR/invoke (JR/fget this :movement) :jm_process_1 this)
        (JR/fset this :totalDamage (unchecked-int (unchecked-add (JR/fget this :totalDamage) (JR/invoke (JR/fget this :weaponProperties) :jm_getDissipation_0))))))

    
(defn jm_isDestroyed_0 [this]
  (let []
        (JR/fget this :destroyed)))

    
(defn jm_damage_2 [this p_damage p_damageType]
  (let [ l_damage (volatile! p_damage) l_damageType (volatile! p_damageType)]
        (JR/fset this :totalDamage (unchecked-int (unchecked-add (JR/fget this :totalDamage) (unchecked-int (unchecked-multiply @l_damage @l_damage)))))))

    
(defn jm_givePoints_1 [this p_total]
  (let [ l_total (volatile! p_total)]
        (JR/invoke (JR/fget this :scoreableInterface) :jm_addPoints_1 (unchecked-int (unchecked-multiply (JR/invoke (JR/scall 'GameConfigurationUtil :jm_getInstance_0) :jm_getCompetitionValue_0) @l_total)))))

    
(defn jm_isExhausted_0 [this]
  (let []
        (if (or (> (JR/fget this :totalDamage) (JR/invoke this :jm_getInitDamage_0)) (< (JR/fget this :totalDamage) 0))
            (do
            true)
            (do
            false))))

    
(defn jm_getDamage_1 [this p_damageType]
  (let [ l_damageType (volatile! p_damageType) l_total (volatile! nil)](JR/method
        (if (not (JR/invoke this :jm_isExhausted_0))
            (do
            (vreset! l_total (unchecked-int (unchecked-subtract (JR/invoke this :jm_getInitDamage_0) (JR/fget this :totalDamage))))
            (JR/invoke this :jm_givePoints_1 @l_total)
            (JR/jreturn @l_total)))
        0)))

    
(defn jm_setDestroyed_1 [this p_destroyed]
  (let [ l_destroyed (volatile! p_destroyed)]
        (JR/fset this :destroyed @l_destroyed)
        (if (JR/invoke this :jm_isDestroyed_0)
            (do
            (JR/fset this :scoreableInterface (JR/scall 'NoScoreable :jm_getInstance_0))
            (JR/invoke (JR/scall 'DestroyedLayerProcessor :jm_getInstance_0) :jm_add_1 this)))))

    
(defn jm_getInitDamage_0 [this]
  (let []
        (JR/fget this :initDamage)))

    
(defn jm_setAnimationInterface_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/fset this :animationInterface @l_animationInterface)))

    
(defn jm_getAnimationInterface_0 [this]
  (let []
        (JR/fget this :animationInterface)))

    
(defn jm_getInitAnimationInterfaceP_0 [this]
  (let []
        (JR/fget this :initAnimationInterface)))

    
(defn jm_setInitAnimationInterfaceP_1 [this p_initAnimationInterface]
  (let [ l_initAnimationInterface (volatile! p_initAnimationInterface)]
        (JR/fset this :initAnimationInterface @l_initAnimationInterface)))

    
(defn jm_getDestroyedAnimationInterface_0 [this]
  (let []
        (JR/fget this :destroyedAnimationInterface)))

    
(defn jm_getOwnerLayerInterface_0 [this]
  (let []
        (JR/fget this :sourceLayerInterface)))

    
(defn jm_setOwnerLayerInterface_1 [this p_sourceLayerInterface]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface)]
        (JR/fset this :sourceLayerInterface @l_sourceLayerInterface)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_viewPosition (volatile! nil)]
        (vreset! l_viewPosition (JR/invoke this :jm_getViewPosition_0))
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-subtract (JR/invoke @l_viewPosition :jm_getX_0) (JR/invoke this :jm_getHalfWidth_0))) (unchecked-int (unchecked-subtract (JR/invoke @l_viewPosition :jm_getY_0) (JR/invoke this :jm_getHalfHeight_0))))))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_viewPosition (volatile! nil)]
        (vreset! l_viewPosition (JR/invoke this :jm_getViewPosition_0))
        (JR/invoke (JR/fget this :animationInterface) :jm_paintThreedXYZ_4 @l_graphics (unchecked-int (unchecked-subtract (JR/invoke @l_viewPosition :jm_getX_0) (JR/invoke this :jm_getHalfWidth_0))) (unchecked-int (unchecked-subtract (JR/invoke @l_viewPosition :jm_getY_0) (JR/invoke this :jm_getHalfHeight_0))) (unchecked-int (unchecked-subtract (JR/invoke @l_viewPosition :jm_getZ_0) (JR/invoke this :jm_getHalfDepth_0))))))

    
(defn jm_getMovement_0 [this]
  (let []
        (JR/fget this :movement)))

    
(defn jm_setMovement_1 [this p_movement]
  (let [ l_movement (volatile! p_movement)]
        (JR/fset this :movement @l_movement)))

    
(defn jm_getType_0 [this]
  (let []
        (WeaponLayer/jm_getStaticType_0)))

    
(defn jm_getStaticType_0 []
  (let [this nil]
        0))

    
(defn jm_getMultiPlayerType_0 [this]
  (let []
        (JR/fget this :multiPlayerType)))

    
(defn jm_setWeaponPropertiesP_1 [this p_weaponProperties]
  (let [ l_weaponProperties (volatile! p_weaponProperties)]
        (JR/fset this :weaponProperties @l_weaponProperties)))

    
(defn jm_getWeaponPropertiesP_0 [this]
  (let []
        (JR/fget this :weaponProperties)))

    
(defn jm_implmentsTickableInterface_0 [this]
  (let []
        true))

    
(defn jm_set_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        (JR/invoke (JR/fget this :initAnimationInterface) :jm_set_1 @l_gl)))



