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
;; package org.allbinary.game.health

(ns Health)

(JR/register 'Health nil '[HealthInterface])

(def jsv_NULL_HEALTH (atom nil))
(def jsv_NAME (atom nil))
(def jsv_HEALTH_LABEL (atom nil))
(def jsv_MAX_HEALTH_LABEL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_HEALTH [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_HEALTH)
(defn jstatic_set_NULL_HEALTH [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_HEALTH v))
(defn jstatic_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NAME)
(defn jstatic_set_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NAME v))
(defn jstatic_HEALTH_LABEL [] (JR/ensure-init jclinit-state jclinit) @jsv_HEALTH_LABEL)
(defn jstatic_set_HEALTH_LABEL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_HEALTH_LABEL v))
(defn jstatic_MAX_HEALTH_LABEL [] (JR/ensure-init jclinit-state jclinit) @jsv_MAX_HEALTH_LABEL)
(defn jstatic_set_MAX_HEALTH_LABEL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_MAX_HEALTH_LABEL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_HEALTH (Health/jnew_1 0))
    (reset! jsv_NAME "Health Resource")
    (reset! jsv_HEALTH_LABEL "Health: ")
    (reset! jsv_MAX_HEALTH_LABEL " Max: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :health 0)
  (JR/fset this :maxHealth 0)
  (JR/fset this :healthListenerInterface nil)
    (JR/fset this :healthListenerInterface (JR/sget 'NullHealthListener "NULL_HEALTH_LISTENER"))
  this)

    
(defn jinit_1 [this p_maxHealth]
  (let [ l_maxHealth (volatile! p_maxHealth)]
    nil (jinitfields this)
        (JR/invoke this :jm_setMaxHealth_1 @l_maxHealth)
        (JR/invoke this :jm_setHealth_1 @l_maxHealth))
  this)

(defn jnew_1 [p_maxHealth ]
  (let [o (JR/alloc 'Health)] (jinit_1 o p_maxHealth) o))

    
(defn jm_heal_1 [this p_ahealth]
  (let [ l_ahealth (volatile! p_ahealth) l_newHealth (volatile! nil)]
        (vreset! l_newHealth (unchecked-int (unchecked-add (JR/invoke this :jm_getHealth_0) @l_ahealth)))
        (if (> @l_newHealth (JR/invoke this :jm_getMaxHealth_0))
            (do
            (JR/invoke this :jm_setHealth_1 (JR/invoke this :jm_getMaxHealth_0)))
            (do
            (JR/invoke this :jm_setHealth_1 @l_newHealth)))))

    
(defn jm_healMax_0 [this]
  (let []
        (JR/invoke this :jm_setHealth_1 (JR/invoke this :jm_getMaxHealth_0))))

    
(defn jm_isDamaged_0 [this]
  (let []
        (if (not (== (JR/invoke this :jm_getHealth_0) (JR/invoke this :jm_getMaxHealth_0)))
            (do
            true)
            (do
            false))))

    
(defn jm_damage_1 [this p_ahealth]
  (let [ l_ahealth (volatile! p_ahealth) l_stringBuffer (volatile! nil) l_health (volatile! nil)](JR/method
        (if (< @l_ahealth 0)
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 "******* Trying to heal when damaging. Damage: ")
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_ahealth)
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of this))
            (JR/scall 'ForcedLogUtil :jm_log_2 (JR/to-string-of @l_stringBuffer) this)
            (JR/jreturn)))
        (vreset! l_health (unchecked-int (unchecked-subtract (JR/invoke this :jm_getHealth_0) @l_ahealth)))
        (JR/invoke this :jm_setHealth_1 @l_health))))

    
(defn jm_isAlive_0 [this]
  (let []
        (if (<= (JR/invoke this :jm_getHealth_0) 0)
            (do
            false)
            (do
            true))))

    
(defn jm_getMaxHealth_0 [this]
  (let []
        (JR/fget this :maxHealth)))

    
(defn jm_setMaxHealth_1 [this p_maxHealth]
  (let [ l_maxHealth (volatile! p_maxHealth)]
        (JR/fset this :maxHealth @l_maxHealth)))

    
(defn jm_setHealth_1 [this p_health]
  (let [ l_health (volatile! p_health)]
        (if (> @l_health (JR/invoke this :jm_getMaxHealth_0))
            (do
            (JR/fset this :health (JR/invoke this :jm_getMaxHealth_0)))
            (if (< @l_health 0)
            (do
            (JR/fset this :health 0))
            (do
            (JR/fset this :health @l_health))))
        (if (some? (JR/fget this :healthListenerInterface))
            (do
            (JR/invoke (JR/fget this :healthListenerInterface) :jm_onHealthChange_0)))))

    
(defn jm_getHealth_0 [this]
  (let []
        (JR/fget this :health)))

    
(defn jm_addListener_1 [this p_healthGraphic]
  (let [ l_healthGraphic (volatile! p_healthGraphic)]
        (JR/fset this :healthListenerInterface @l_healthGraphic)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (Health/jstatic_HEALTH_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :health))
        (JR/invoke @l_stringBuffer :jm_append_1 (Health/jstatic_MAX_HEALTH_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :maxHealth))
        (JR/to-string-of @l_stringBuffer)))



