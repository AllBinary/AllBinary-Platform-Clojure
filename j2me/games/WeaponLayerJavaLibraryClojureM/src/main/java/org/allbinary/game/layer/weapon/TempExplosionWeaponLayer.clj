;; Generated Code Do Not Modify
;; package org.allbinary.game.layer.weapon

(ns TempExplosionWeaponLayer)

(JR/register 'TempExplosionWeaponLayer 'SimpleWeaponLayer '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :weaponProperties nil)
  (JR/fset this :timeDelayHelper nil)
    (JR/fset this :weaponProperties (WeaponProperties/jnew_5 (unchecked-negate 1) (unchecked-negate 1) 0 1000 (JR/i16 0)))
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 0))
  this)

    
(defn jinit_6 [this p_name p_movement p_animationInterface p_rectangle p_viewPosition p_timeDelay]
  (let [ l_name (volatile! p_name) l_movement (volatile! p_movement) l_animationInterface (volatile! p_animationInterface) l_rectangle (volatile! p_rectangle) l_viewPosition (volatile! p_viewPosition) l_timeDelay (volatile! p_timeDelay)]
        (SimpleWeaponLayer/jinit_8 this @l_name (JR/sget 'RemoteInfo "REMOTE_INFO") (unchecked-int (unchecked-negate (JR/c2i 1))) @l_movement @l_animationInterface (JR/scall 'SimpleWeaponLayer :jm_createDestroyed_0) @l_rectangle @l_viewPosition) (jinitfields this)
        (JR/fset (JR/fget this :timeDelayHelper) :delay @l_timeDelay))
  this)

(defn jnew_6 [p_name p_movement p_animationInterface p_rectangle p_viewPosition p_timeDelay ]
  (let [o (JR/alloc 'TempExplosionWeaponLayer)] (jinit_6 o p_name p_movement p_animationInterface p_rectangle p_viewPosition p_timeDelay) o))

    
(defn jm_processTick_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTime_1 (JR/fget (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0) :startTime))
            (do
            (JR/invoke (JR/invoke this :jm_getCollidableInferface_0) :jm_collide_2 this this)
            (JR/fset this :totalDamage (unchecked-int (unchecked-add (JR/invoke this :jm_getInitDamage_0) 1)))))
        (JR/invoke-super 'SimpleWeaponLayer this :jm_processTick_1 @l_allBinaryLayerManager)))



