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
;; package org.allbinary.game.combat.weapon

(ns WeaponProperties)

(JR/register 'WeaponProperties 'SimpleWeaponProperties '[])

(def jsv_NULL_WEAPON_PROPERTIES (atom nil))
(def jsv_messageSent (atom false))
(def jsv_DAMAGE (atom nil))
(def jsv_RANGE (atom nil))
(def jsv_RELOAD (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_WEAPON_PROPERTIES [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_WEAPON_PROPERTIES)
(defn jstatic_set_NULL_WEAPON_PROPERTIES [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_WEAPON_PROPERTIES v))
(defn jstatic_messageSent [] (JR/ensure-init jclinit-state jclinit) @jsv_messageSent)
(defn jstatic_set_messageSent [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_messageSent v))
(defn jstatic_DAMAGE [] (JR/ensure-init jclinit-state jclinit) @jsv_DAMAGE)
(defn jstatic_set_DAMAGE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_DAMAGE v))
(defn jstatic_RANGE [] (JR/ensure-init jclinit-state jclinit) @jsv_RANGE)
(defn jstatic_set_RANGE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_RANGE v))
(defn jstatic_RELOAD [] (JR/ensure-init jclinit-state jclinit) @jsv_RELOAD)
(defn jstatic_set_RELOAD [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_RELOAD v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_WEAPON_PROPERTIES (WeaponProperties/jnew_5 0 0 0 0 (JR/i16 0)))
    (reset! jsv_messageSent false)
    (reset! jsv_DAMAGE "Damage: ")
    (reset! jsv_RANGE "Range: ")
    (reset! jsv_RELOAD "Reload: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :reloadTime 0)
  (JR/fset this :targetingTime 0)
  (JR/fset this :speed nil)
  (JR/fset this :MAX 0)
  (JR/fset this :ZERO 0)
    (JR/fset this :speed (JR/sget 'BasicDecimal "ZERO_BIGDECIMAL"))
    (JR/fset this :MAX 10240)
    (JR/fset this :ZERO 0)
  this)

    
(defn jinit_5 [this p_reloadTime p_targetingTime p_speed p_damage p_dissipation]
  (let [ l_reloadTime (volatile! p_reloadTime) l_targetingTime (volatile! p_targetingTime) l_speed (volatile! p_speed) l_damage (volatile! p_damage) l_dissipation (volatile! p_dissipation) l_MESSAGE (volatile! nil) l_commonStrings (volatile! nil) l_unscaledDamage (volatile! nil) l_scaledDissipation (volatile! nil) l_value (volatile! nil)]
    (SimpleWeaponProperties/jinit_0 this) (jinitfields this)
        (if (and (and (< @l_speed (JR/fget this :MAX)) (not (== @l_speed 0))) (not (WeaponProperties/jstatic_messageSent)))
            (do
            (vreset! l_MESSAGE "Danger Danger Danger: Speed probably to slow if using 1 degree calculations as velocity for a single axis could be below 1024: ")
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_MESSAGE) :jm_appendlong_1 @l_speed)) this (JR/fget @l_commonStrings :CONSTRUCTOR))
            (WeaponProperties/jstatic_set_messageSent true)))
        (JR/invoke this :jm_setReloadTime_1 @l_reloadTime)
        (JR/invoke this :jm_setTargetingTime_1 @l_targetingTime)
        (JR/invoke this :jm_setDamage_1 @l_damage)
        (JR/invoke this :jm_setDissipation_1 @l_dissipation)
        (JR/invoke this :jm_setSpeed_1 (BasicDecimal/jnew_1 @l_speed))
        (if (not (== @l_dissipation (JR/fget this :ZERO)))
            (do
            (vreset! l_unscaledDamage (unchecked-multiply (JR/invoke (JR/fget this :speed) :jm_getUnscaled_0) @l_damage))
            (vreset! l_scaledDissipation (unchecked-int (unchecked-multiply @l_dissipation (JR/invoke (JR/fget this :speed) :jm_getScaledFactorValue_0))))
            (vreset! l_value (JR/ldiv @l_unscaledDamage @l_scaledDissipation))
            (JR/invoke this :jm_setRange_1 (JR/idiv (JR/i32 (unchecked-multiply @l_value 9)) 10)))))
  this)

(defn jnew_5 [p_reloadTime p_targetingTime p_speed p_damage p_dissipation ]
  (let [o (JR/alloc 'WeaponProperties)] (jinit_5 o p_reloadTime p_targetingTime p_speed p_damage p_dissipation) o))

    
(defn jm_setReloadTime_1 [this p_reloadTime]
  (let [ l_reloadTime (volatile! p_reloadTime)]
        (JR/fset this :reloadTime @l_reloadTime)))

    
(defn jm_getReloadTime_0 [this]
  (let []
        (JR/fget this :reloadTime)))

    
(defn jm_setTargetingTime_1 [this p_targetingTime]
  (let [ l_targetingTime (volatile! p_targetingTime)]
        (JR/fset this :targetingTime @l_targetingTime)))

    
(defn jm_getTargetingTime_0 [this]
  (let []
        (JR/fget this :targetingTime)))

    
(defn jm_getSpeed_0 [this]
  (let []
        (JR/fget this :speed)))

    
(defn jm_setSpeed_1 [this p_speed]
  (let [ l_speed (volatile! p_speed)]
        (JR/fset this :speed @l_speed)))

    
(defn jm_getDamageI_1 [this p_range]
  (let [ l_range (volatile! p_range)]
        (unchecked-int (unchecked-subtract (JR/invoke this :jm_getDamage_0) (JR/idiv (unchecked-int (unchecked-multiply (JR/invoke this :jm_getDissipation_0) @l_range)) (JR/invoke (JR/fget this :speed) :jm_getScaled_0))))))

    
(defn jm_toStringArray_0 [this]
  (let [ l_index (volatile! nil) l_stringArray (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_index 0)
        (vreset! l_stringArray (JR/anew "String" 1 3))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/aset* @l_stringArray (JR/vinc l_index 1 :int true) (JR/to-string-of (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (WeaponProperties/jstatic_DAMAGE)) :jm_appendint_1 (JR/invoke this :jm_getDamage_0))))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/aset* @l_stringArray (JR/vinc l_index 1 :int true) (JR/to-string-of (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (WeaponProperties/jstatic_RANGE)) :jm_appendint_1 (JR/invoke this :jm_getRange_0))))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/aset* @l_stringArray (JR/vinc l_index 1 :int true) (JR/to-string-of (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (WeaponProperties/jstatic_RELOAD)) :jm_appendlong_1 (JR/invoke this :jm_getReloadTime_0))))
        @l_stringArray))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (WeaponProperties/jstatic_DAMAGE)) :jm_appendint_1 (JR/invoke this :jm_getDamage_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (WeaponProperties/jstatic_RANGE)) :jm_appendint_1 (JR/invoke this :jm_getRange_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (WeaponProperties/jstatic_RELOAD)) :jm_appendlong_1 (JR/invoke this :jm_getReloadTime_0))
        (JR/to-string-of @l_stringBuffer)))



