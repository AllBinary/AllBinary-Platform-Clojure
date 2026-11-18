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
;; package org.allbinary.game.part.weapon

(ns BasicProjectileWeaponPart)

(JR/register 'BasicProjectileWeaponPart 'BasicWeaponPart '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :weaponLayerCircularStaticPool nil)
  this)

    
(defn jm_createBasicProjectileWeaponPart_2 [p_animationInterface p_weaponLayerCircularStaticPool]
  (let [this nil l_animationInterface (volatile! p_animationInterface) l_weaponLayerCircularStaticPool (volatile! p_weaponLayerCircularStaticPool)]
        (BasicProjectileWeaponPart/jnew_6 @l_animationInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER") @l_weaponLayerCircularStaticPool (JR/sget 'WeaponProperties "NULL_WEAPON_PROPERTIES") (JR/scall 'NoScoreable :jm_getInstance_0) (JR/sget 'RelativeRelationship "NULL_RELATIVE_RELATIONSHIP"))))

    
(defn jinit_6 [this p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_weaponProperties p_scoreableInterface p_relativeRelationship]
  (let [ l_animationInterface (volatile! p_animationInterface) l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_weaponLayerCircularStaticPool (volatile! p_weaponLayerCircularStaticPool) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_relativeRelationship (volatile! p_relativeRelationship)]
        (BasicWeaponPart/jinit_5 this @l_animationInterface @l_sourceLayerInterface @l_weaponProperties @l_scoreableInterface @l_relativeRelationship) (jinitfields this)
        (JR/fset this :weaponLayerCircularStaticPool @l_weaponLayerCircularStaticPool))
  this)

(defn jnew_6 [p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_weaponProperties p_scoreableInterface p_relativeRelationship ]
  (let [o (JR/alloc 'BasicProjectileWeaponPart)] (jinit_6 o p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_weaponProperties p_scoreableInterface p_relativeRelationship) o))

    
(defn jm_processScore_5 [this p_allbinaryLayerManager p_angle p_otherAngle p_weaponProperties p_scoreableInterface]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_weaponLayer (volatile! nil)]
        (vreset! l_weaponLayer (JR/invoke (JR/fget this :weaponLayerCircularStaticPool) :jm_getInstanceWeaponLayer_8 (JR/invoke this :jm_getOwnerLayerInterface_0) (JR/invoke (JR/fget this :relativeRelationship) :jm_getX_0) (JR/invoke (JR/fget this :relativeRelationship) :jm_getY_0) (JR/invoke (JR/fget this :relativeRelationship) :jm_getZ_0) @l_angle @l_otherAngle @l_weaponProperties @l_scoreableInterface))
        (JR/invoke @l_allbinaryLayerManager :jm_append_1 @l_weaponLayer)))



