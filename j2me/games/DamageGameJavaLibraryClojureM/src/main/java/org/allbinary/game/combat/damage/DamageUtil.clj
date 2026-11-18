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
;; package org.allbinary.game.combat.damage

(ns DamageUtil)

(JR/register 'DamageUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DamageUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :COLLIDE nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :COLLIDE "collide")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DamageUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DamageUtil)] (jinit_0 o) o))

    
(defn jm_process_2 [this p_damageableInterface p_damageableInterface2]
  (let [ l_damageableInterface (volatile! p_damageableInterface) l_damageableInterface2 (volatile! p_damageableInterface2)]
        (JR/invoke @l_damageableInterface :jm_damage_2 (JR/invoke @l_damageableInterface2 :jm_getDamage_1 0) 0)))

    
(defn jm_debugDamage_2 [this p_collidableInterfaceCompositeInterface1 p_collidableInterfaceCompositeInterface]
  (let [ l_collidableInterfaceCompositeInterface1 (volatile! p_collidableInterfaceCompositeInterface1) l_collidableInterfaceCompositeInterface (volatile! p_collidableInterfaceCompositeInterface) l_collidableDestroyableDamageableLayer (volatile! nil) l_damage (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_collidableDestroyableDamageableLayer @l_collidableInterfaceCompositeInterface)
        (vreset! l_damage (JR/invoke @l_collidableDestroyableDamageableLayer :jm_getDamage_1 0))
        (if (> @l_damage 20000)
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 "Collision ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of @l_collidableInterfaceCompositeInterface1))
            (JR/invoke @l_stringBuffer :jm_append_1 " with: ")
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of @l_collidableInterfaceCompositeInterface))
            (JR/invoke @l_stringBuffer :jm_append_1 " damage: ")
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_damage)
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) @l_collidableInterfaceCompositeInterface1 (JR/fget this :COLLIDE))))))



