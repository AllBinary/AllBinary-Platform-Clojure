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

(ns WeaponLayerArrayLayerCircularStaticPool)

(JR/register 'WeaponLayerArrayLayerCircularStaticPool nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (WeaponLayerArrayLayerCircularStaticPool/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :MAX 0)
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :WEAPONLAYER_ARRAY nil)
  (JR/fset this :TWO_WEAPONLAYER_ARRAY nil)
  (JR/fset this :THREE_WEAPONLAYER_ARRAY nil)
    (JR/fset this :MAX 5)
    (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/fget this :MAX)))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'WeaponLayerArrayLayerCircularStaticPool)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (WeaponLayerArrayLayerCircularStaticPool/jstatic_instance)))

    
(defn jm_init_0 [this]
  (let [ l_WEAPONLAYER_ARRAY (volatile! nil) l_TWO_WEAPONLAYER_ARRAY (volatile! nil) l_THREE_WEAPONLAYER_ARRAY (volatile! nil) l_index (volatile! nil)]
        (vreset! l_WEAPONLAYER_ARRAY (JR/anew "Object" 2 (unchecked-int (unchecked-multiply (JR/fget this :MAX) 2))))
        (vreset! l_TWO_WEAPONLAYER_ARRAY (JR/anew "Object" 2 (JR/fget this :MAX)))
        (vreset! l_THREE_WEAPONLAYER_ARRAY (JR/anew "Object" 2 (JR/fget this :MAX)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :MAX)) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_WEAPONLAYER_ARRAY @l_index (JR/anew "Object" 1 1))
            (JR/aset* @l_TWO_WEAPONLAYER_ARRAY @l_index (JR/anew "Object" 1 2))
            (JR/aset* @l_THREE_WEAPONLAYER_ARRAY @l_index (JR/anew "Object" 1 3))))
        (JR/fset this :WEAPONLAYER_ARRAY @l_WEAPONLAYER_ARRAY)
        (JR/fset this :TWO_WEAPONLAYER_ARRAY @l_TWO_WEAPONLAYER_ARRAY)
        (JR/fset this :THREE_WEAPONLAYER_ARRAY @l_THREE_WEAPONLAYER_ARRAY)))

    
(defn jm_getWeaponLayerArrays_1 [this p_size]
  (let [ l_size (volatile! p_size)](JR/method
        (if (== @l_size 1)
            (do
            (JR/jreturn (JR/fget this :WEAPONLAYER_ARRAY)))
            (if (== @l_size 2)
            (do
            (JR/jreturn (JR/fget this :TWO_WEAPONLAYER_ARRAY)))
            (if (== @l_size 3)
            (do
            (JR/jreturn (JR/fget this :THREE_WEAPONLAYER_ARRAY))))))
        (JR/jthrow (new java.lang.RuntimeException)))))

    
(defn jm_getInstanceArray_1 [this p_size]
  (let [ l_size (volatile! p_size) l_weaponLayerArray (volatile! nil)]
        (vreset! l_weaponLayerArray (JR/aget* (JR/invoke this :jm_getWeaponLayerArrays_1 @l_size) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)
        @l_weaponLayerArray))



