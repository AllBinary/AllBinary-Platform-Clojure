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

(ns BasicWeaponPart)

(JR/register 'BasicWeaponPart nil '[PartInterface SalvoInterface])

(def jsv_NULL_BASIC_WEAPON_PART (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_BASIC_WEAPON_PART [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_BASIC_WEAPON_PART)
(defn jstatic_set_NULL_BASIC_WEAPON_PART [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_BASIC_WEAPON_PART v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_BASIC_WEAPON_PART (BasicWeaponPart/jm_createBasicWeaponPart_1 (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0)))
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  (JR/fset this :ownerLayerInterface nil)
  (JR/fset this :weaponProperties nil)
  (JR/fset this :scoreableInterface nil)
  (JR/fset this :relativeRelationship nil)
    (JR/fset this :animationInterface (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0))
    (JR/fset this :ownerLayerInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
    (JR/fset this :weaponProperties (JR/sget 'WeaponProperties "NULL_WEAPON_PROPERTIES"))
    (JR/fset this :scoreableInterface (JR/scall 'NoScoreable :jm_getInstance_0))
    (JR/fset this :relativeRelationship (JR/sget 'RelativeRelationship "NULL_RELATIVE_RELATIONSHIP"))
  this)

    
(defn jm_createBasicWeaponPart_1 [p_animationInterface]
  (let [this nil l_animationInterface (volatile! p_animationInterface)]
        (BasicWeaponPart/jnew_5 @l_animationInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER") (JR/sget 'WeaponProperties "NULL_WEAPON_PROPERTIES") (JR/scall 'NoScoreable :jm_getInstance_0) (JR/sget 'RelativeRelationship "NULL_RELATIVE_RELATIONSHIP"))))

    
(defn jinit_5 [this p_animationInterface p_sourceLayerInterface p_weaponProperties p_scoreableInterface p_relativeRelationship]
  (let [ l_animationInterface (volatile! p_animationInterface) l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_relativeRelationship (volatile! p_relativeRelationship)]
    nil (jinitfields this)
        (JR/invoke this :jm_init_4 @l_sourceLayerInterface @l_weaponProperties @l_scoreableInterface @l_relativeRelationship)
        (JR/invoke this :jm_setAnimationInterface_1 @l_animationInterface))
  this)

(defn jnew_5 [p_animationInterface p_sourceLayerInterface p_weaponProperties p_scoreableInterface p_relativeRelationship ]
  (let [o (JR/alloc 'BasicWeaponPart)] (jinit_5 o p_animationInterface p_sourceLayerInterface p_weaponProperties p_scoreableInterface p_relativeRelationship) o))

    
(defn jm_init_4 [this p_sourceLayerInterface p_weaponProperties p_scoreableInterface p_relativeRelationship]
  (let [ l_sourceLayerInterface (volatile! p_sourceLayerInterface) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface) l_relativeRelationship (volatile! p_relativeRelationship)]
        (JR/invoke this :jm_setOwnerLayerInterface_1 @l_sourceLayerInterface)
        (JR/invoke this :jm_setWeaponProperties_1 @l_weaponProperties)
        (JR/fset this :scoreableInterface @l_scoreableInterface)
        (JR/fset this :relativeRelationship @l_relativeRelationship)))

    
(defn jm_process_3 [this p_allbinaryLayerManager p_angle p_otherAngle]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle)]
        (JR/invoke this :jm_processScore_5 @l_allbinaryLayerManager @l_angle @l_otherAngle (JR/invoke this :jm_getWeaponProperties_0) (JR/fget this :scoreableInterface))))

    
(defn jm_processScore_5 [this p_allbinaryLayerManager p_angle p_otherAngle p_weaponProperties p_scoreableInterface]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_angle (volatile! p_angle) l_otherAngle (volatile! p_otherAngle) l_weaponProperties (volatile! p_weaponProperties) l_scoreableInterface (volatile! p_scoreableInterface)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :NOT_IMPLEMENTED)))))

    
(defn jm_getOwnerLayerInterface_0 [this]
  (let []
        (JR/fget this :ownerLayerInterface)))

    
(defn jm_setOwnerLayerInterface_1 [this p_ownerLayerInterface]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface)]
        (JR/fset this :ownerLayerInterface @l_ownerLayerInterface)))

    
(defn jm_getAnimationInterface_0 [this]
  (let []
        (JR/fget this :animationInterface)))

    
(defn jm_setAnimationInterface_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/fset this :animationInterface @l_animationInterface)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_viewPosition (volatile! nil) l_viewX (volatile! nil) l_viewY (volatile! nil)]
        (vreset! l_viewPosition (JR/invoke (JR/invoke this :jm_getOwnerLayerInterface_0) :jm_getViewPosition_0))
        (vreset! l_viewX (JR/invoke @l_viewPosition :jm_getX_0))
        (vreset! l_viewY (JR/invoke @l_viewPosition :jm_getY_0))
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics @l_viewX @l_viewY)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_getWeaponProperties_0 [this]
  (let []
        (JR/fget this :weaponProperties)))

    
(defn jm_setWeaponProperties_1 [this p_weaponProperties]
  (let [ l_weaponProperties (volatile! p_weaponProperties)]
        (JR/fset this :weaponProperties @l_weaponProperties)))



