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

(ns ArcedMultiBeamWeaponPart)

(JR/register 'ArcedMultiBeamWeaponPart 'BasicWeaponPart '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :weaponLayerCircularStaticPool nil)
  (JR/fset this :total 0)
  (JR/fset this :TOTAL_ANGLE 0)
    (JR/fset this :TOTAL_ANGLE (JR/i32 (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE)))
  this)

    
(defn jinit_7 [this p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_total p_weaponProperties p_scoreableInterface p_relativeRelationship]
  (let [ l_animationInterface (volatile! p_animationInterface) l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_weaponLayerCircularStaticPool (volatile! p_weaponLayerCircularStaticPool) l_total (volatile! p_total) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_relativeRelationship (volatile! p_relativeRelationship)]
        (BasicWeaponPart/jinit_5 this @l_animationInterface @l_sourceLayerInterface @l_weaponProperties @l_scoreableInterface @l_relativeRelationship) (jinitfields this)
        (JR/fset this :total @l_total)
        (JR/fset this :weaponLayerCircularStaticPool @l_weaponLayerCircularStaticPool))
  this)

(defn jnew_7 [p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_total p_weaponProperties p_scoreableInterface p_relativeRelationship ]
  (let [o (JR/alloc 'ArcedMultiBeamWeaponPart)] (jinit_7 o p_animationInterface p_sourceLayerInterface p_weaponLayerCircularStaticPool p_total p_weaponProperties p_scoreableInterface p_relativeRelationship) o))

    
(defn jm_processScore_5 [this p_allbinaryLayerManager p_angle p_otherAngle p_weaponProperties p_scoreableInterface]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_increment (volatile! nil) l_minAngle (volatile! nil) l_next (volatile! nil) l_weaponLayer (volatile! nil) l_index (volatile! nil)]
        (vreset! l_increment (JR/i16 (JR/idiv (unchecked-int (unchecked-subtract (JR/fget this :total) 1)) (JR/fget this :TOTAL_ANGLE))))
        (vreset! l_minAngle (JR/i16 (unchecked-int (unchecked-subtract @l_angle (JR/ishr (unchecked-int (unchecked-multiply @l_increment (JR/fget this :total))) 1)))))
        (vreset! l_next 0)
        (vreset! l_weaponLayer nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :total)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_weaponLayer (JR/invoke (JR/fget this :weaponLayerCircularStaticPool) :jm_getInstanceWeaponLayer_8 (JR/invoke this :jm_getOwnerLayerInterface_0) (JR/invoke (JR/fget this :relativeRelationship) :jm_getX_0) (JR/invoke (JR/fget this :relativeRelationship) :jm_getY_0) 0 (unchecked-int (unchecked-add @l_minAngle @l_increment)) @l_otherAngle @l_weaponProperties @l_scoreableInterface))
            (JR/invoke @l_allbinaryLayerManager :jm_append_1 @l_weaponLayer)
            (vreset! l_next (unchecked-int (unchecked-add @l_next @l_increment)))))))



