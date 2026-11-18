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

(ns StraightMultiProjectileWeaponPart)

(JR/register 'StraightMultiProjectileWeaponPart 'BasicWeaponPart '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :weaponLayerCircularStaticPool nil)
  (JR/fset this :total 0)
  (JR/fset this :noDecimalTrigTable nil)
    (JR/fset this :noDecimalTrigTable (JR/scall 'NoDecimalTrigTable :jm_getInstance_0))
  this)

    
(defn jm_createStraightMultiProjectileWeaponPart_2 [p_animationInterface p_weaponLayerCircularStaticPool]
  (let [this nil l_animationInterface (volatile! p_animationInterface) l_weaponLayerCircularStaticPool (volatile! p_weaponLayerCircularStaticPool)]
        (StraightMultiProjectileWeaponPart/jnew_7 @l_animationInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER") @l_weaponLayerCircularStaticPool 2 (JR/sget 'WeaponProperties "NULL_WEAPON_PROPERTIES") (JR/scall 'NoScoreable :jm_getInstance_0) (JR/sget 'RelativeRelationship "NULL_RELATIVE_RELATIONSHIP"))))

    
(defn jinit_7 [this p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_total p_weaponProperties p_scoreableInterface p_relativeRelationship]
  (let [ l_animationInterface (volatile! p_animationInterface) l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_weaponLayerCircularStaticPool (volatile! p_weaponLayerCircularStaticPool) l_total (volatile! p_total) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_relativeRelationship (volatile! p_relativeRelationship)]
        (BasicWeaponPart/jinit_5 this @l_animationInterface @l_sourceLayerInterface @l_weaponProperties @l_scoreableInterface @l_relativeRelationship) (jinitfields this)
        (JR/fset this :total @l_total)
        (JR/fset this :weaponLayerCircularStaticPool @l_weaponLayerCircularStaticPool))
  this)

(defn jnew_7 [p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_total p_weaponProperties p_scoreableInterface p_relativeRelationship ]
  (let [o (JR/alloc 'StraightMultiProjectileWeaponPart)] (jinit_7 o p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_total p_weaponProperties p_scoreableInterface p_relativeRelationship) o))

    
(defn jm_processScore_5 [this p_allbinaryLayerManager p_angle p_otherAngle p_weaponProperties p_scoreableInterface]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_sourceLayerInterface (volatile! nil) l_reducedWidth (volatile! nil) l_halfWidth (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_sine (volatile! nil) l_beamX (volatile! nil) l_cosine (volatile! nil) l_beamY (volatile! nil) l_weaponLayer (volatile! nil) l_increment (volatile! nil) l_next (volatile! nil) l_index (volatile! nil)]
        (vreset! l_sourceLayerInterface (JR/invoke this :jm_getOwnerLayerInterface_0))
        (vreset! l_reducedWidth (JR/idiv (unchecked-int (unchecked-multiply (JR/invoke @l_sourceLayerInterface :jm_getWidth_0) 8)) 10))
        (vreset! l_halfWidth (JR/ishr @l_reducedWidth 1))
        (vreset! l_x (JR/invoke (JR/fget this :relativeRelationship) :jm_getX_0))
        (vreset! l_y (JR/invoke (JR/fget this :relativeRelationship) :jm_getY_0))
        (vreset! l_sine 0)
        (vreset! l_beamX 0)
        (vreset! l_cosine 0)
        (vreset! l_beamY 0)
        (vreset! l_weaponLayer nil)
        (vreset! l_increment (JR/idiv @l_reducedWidth (unchecked-int (unchecked-subtract (JR/fget this :total) 1))))
        (vreset! l_next (unchecked-int (unchecked-negate (JR/c2i @l_halfWidth))))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :total)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_sine (unchecked-multiply @l_next (JR/invoke (JR/fget this :noDecimalTrigTable) :jm_sin_1 @l_angle)))
            (vreset! l_beamX (JR/i32 (JR/ldiv @l_sine (JR/fget (JR/fget this :noDecimalTrigTable) :SCALE))))
            (vreset! l_cosine (unchecked-multiply @l_next (JR/invoke (JR/fget this :noDecimalTrigTable) :jm_cos_1 @l_angle)))
            (vreset! l_beamY (unchecked-int (unchecked-negate (JR/c2i (JR/i32 (JR/ldiv @l_cosine (JR/fget (JR/fget this :noDecimalTrigTable) :SCALE)))))))
            (vreset! l_weaponLayer (JR/invoke (JR/fget this :weaponLayerCircularStaticPool) :jm_getInstanceWeaponLayer_8 @l_sourceLayerInterface (unchecked-int (unchecked-add @l_x @l_beamX)) (unchecked-int (unchecked-add @l_y @l_beamY)) 0 @l_angle @l_otherAngle @l_weaponProperties @l_scoreableInterface))
            (JR/invoke @l_allbinaryLayerManager :jm_append_1 @l_weaponLayer)
            (vreset! l_next (unchecked-int (unchecked-add @l_next @l_increment)))))))



