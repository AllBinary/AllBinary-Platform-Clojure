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

(ns HealthBarTwodAnimation)

(JR/register 'HealthBarTwodAnimation 'HealthBarAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_layerInterface p_location]
  (let [ l_layerInterface (volatile! p_layerInterface) l_location (volatile! p_location)]
        (HealthBarAnimation/jinit_2 this @l_layerInterface @l_location) (jinitfields this))
  this)

(defn jnew_2 [p_layerInterface p_location ]
  (let [o (JR/alloc 'HealthBarTwodAnimation)] (jinit_2 o p_layerInterface p_location) o))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_ax (volatile! nil)]
        (vreset! l_ax (JR/invoke (JR/invoke (JR/fget this :allbinaryLayer) :jm_getViewPosition_0) :jm_getX_0))
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/fget this :basicColor) (JR/fget this :colorP))
        (JR/invoke @l_graphics :jm_fillRect_4 @l_ax (unchecked-int (unchecked-subtract (JR/invoke this :jm_getY_0) 1)) (JR/fget this :x2) (JR/fget this :thickness))))



