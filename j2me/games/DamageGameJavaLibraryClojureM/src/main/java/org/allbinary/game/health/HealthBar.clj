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

(ns HealthBar)

(JR/register 'HealthBar 'Paintable '[HealthListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  (JR/fset this :healthInterface nil)
  (JR/fset this :allbinaryLayer nil)
  this)

    
(defn jinit_4 [this p_layerInterface p_healthInterface p_animationInterface p_direction]
  (let [ l_layerInterface (volatile! p_layerInterface) l_healthInterface (volatile! p_healthInterface) l_animationInterface (volatile! p_animationInterface) l_direction (volatile! p_direction)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :allbinaryLayer @l_layerInterface)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :healthInterface @l_healthInterface)
        (JR/invoke (JR/fget this :healthInterface) :jm_addListener_1 this)
        (JR/invoke this :jm_onHealthChange_0))
  this)

(defn jnew_4 [p_layerInterface p_healthInterface p_animationInterface p_direction ]
  (let [o (JR/alloc 'HealthBar)] (jinit_4 o p_layerInterface p_healthInterface p_animationInterface p_direction) o))

    
(defn jm_onHealthChange_0 [this]
  (let []
        (JR/invoke (JR/fget this :animationInterface) :jm_onHealthChange_1 (JR/idiv (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :healthInterface) :jm_getHealth_0) (JR/invoke (JR/fget this :allbinaryLayer) :jm_getWidth_0))) (JR/invoke (JR/fget this :healthInterface) :jm_getMaxHealth_0)))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics 0 0)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintThreedXYZ_4 @l_graphics 0 0 0)))



