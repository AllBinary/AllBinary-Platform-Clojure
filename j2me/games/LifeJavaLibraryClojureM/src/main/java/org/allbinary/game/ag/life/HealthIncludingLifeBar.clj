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
;; package org.allbinary.game.ag.life

(ns HealthIncludingLifeBar)

(JR/register 'HealthIncludingLifeBar 'Paintable '[HealthListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  (JR/fset this :life nil)
  (JR/fset this :healthInterface nil)
  (JR/fset this :allbinaryLayer nil)
  this)

    
(defn jm_createHealthIncludingLifeBar_5 [p_layerInterface p_life p_healthInterface p_location p_direction]
  (let [this nil l_layerInterface (volatile! p_layerInterface) l_life (volatile! p_life) l_healthInterface (volatile! p_healthInterface) l_location (volatile! p_location) l_direction (volatile! p_direction)]
        (HealthIncludingLifeBar/jnew_5 @l_layerInterface @l_life @l_healthInterface (HealthBarTwodAnimation/jnew_2 @l_layerInterface @l_location) @l_direction)))

    
(defn jinit_5 [this p_layerInterface p_life p_healthInterface p_animationInterface p_direction]
  (let [ l_layerInterface (volatile! p_layerInterface) l_life (volatile! p_life) l_healthInterface (volatile! p_healthInterface) l_animationInterface (volatile! p_animationInterface) l_direction (volatile! p_direction)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :allbinaryLayer @l_layerInterface)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :life @l_life)
        (JR/fset this :healthInterface @l_healthInterface)
        (JR/invoke (JR/fget this :healthInterface) :jm_addListener_1 this)
        (JR/invoke this :jm_onHealthChange_0))
  this)

(defn jnew_5 [p_layerInterface p_life p_healthInterface p_animationInterface p_direction ]
  (let [o (JR/alloc 'HealthIncludingLifeBar)] (jinit_5 o p_layerInterface p_life p_healthInterface p_animationInterface p_direction) o))

    
(defn jm_onHealthChange_0 [this]
  (let []
        (JR/invoke (JR/fget this :animationInterface) :jm_onHealthChange_1 (JR/idiv (unchecked-int (unchecked-multiply (unchecked-int (unchecked-add (JR/invoke (JR/fget this :healthInterface) :jm_getHealth_0) (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :healthInterface) :jm_getMaxHealth_0) (JR/invoke (JR/fget this :life) :jm_get_0))))) (JR/invoke (JR/fget this :allbinaryLayer) :jm_getWidth_0))) (unchecked-int (unchecked-add (JR/invoke (JR/fget this :healthInterface) :jm_getMaxHealth_0) (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :healthInterface) :jm_getMaxHealth_0) (JR/invoke (JR/fget this :life) :jm_getStartLives_0)))))))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics 0 0)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintThreedXYZ_4 @l_graphics 0 0 0)))



