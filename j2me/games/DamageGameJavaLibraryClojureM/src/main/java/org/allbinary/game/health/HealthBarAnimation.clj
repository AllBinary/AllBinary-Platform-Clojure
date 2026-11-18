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

(ns HealthBarAnimation)

(JR/register 'HealthBarAnimation 'Animation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :basicColorFactory nil)
  (JR/fset this :x2 0)
  (JR/fset this :thickness 0)
  (JR/fset this :location 0)
  (JR/fset this :allbinaryLayer nil)
    (JR/fset this :basicColorFactory (JR/scall 'BasicColorFactory :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_layerInterface p_location]
  (let [ l_layerInterface (volatile! p_layerInterface) l_location (volatile! p_location) l_basicHudFactory (volatile! nil)]
    (Animation/jinit_0 this) (jinitfields this)
        (JR/fset this :allbinaryLayer @l_layerInterface)
        (JR/fset this :location @l_location)
        (vreset! l_basicHudFactory (JR/scall 'BasicHudFactory :jm_getInstance_0))
        (if (and (not (== (JR/fget this :location) (JR/fget @l_basicHudFactory :TOPLEFT))) (not (== (JR/fget this :location) (JR/fget @l_basicHudFactory :BOTTOMLEFT))))
            (do
            (JR/jthrow (new java.lang.Exception "Location Not Valid"))))
        (if (> (JR/invoke @l_layerInterface :jm_getWidth_0) 40)
            (do
            (JR/fset this :thickness 3))
            (if (> (JR/invoke @l_layerInterface :jm_getWidth_0) 20)
            (do
            (JR/fset this :thickness 2))
            (do
            (JR/fset this :thickness 1)))))
  this)

(defn jnew_2 [p_layerInterface p_location ]
  (let [o (JR/alloc 'HealthBarAnimation)] (jinit_2 o p_layerInterface p_location) o))

    
(defn jm_onHealthChange_1 [this p_newX2]
  (let [ l_newX2 (volatile! p_newX2) l_quarter (volatile! nil)]
        (JR/fset this :x2 @l_newX2)
        (vreset! l_quarter (JR/ishr (JR/invoke (JR/fget this :allbinaryLayer) :jm_getWidth_0) 2))
        (if (> (JR/fget this :x2) (unchecked-int (unchecked-multiply @l_quarter 3)))
            (do
            (JR/fset this :basicColor (JR/fget (JR/fget this :basicColorFactory) :GREEN))
            (JR/fset this :colorP (JR/invoke (JR/fget this :basicColor) :jm_intValue_0)))
            (if (> (JR/fget this :x2) (unchecked-int (unchecked-multiply @l_quarter 2)))
            (do
            (JR/fset this :basicColor (JR/fget (JR/fget this :basicColorFactory) :YELLOW))
            (JR/fset this :colorP (JR/invoke (JR/fget this :basicColor) :jm_intValue_0)))
            (if (> (JR/fget this :x2) @l_quarter)
            (do
            (JR/fset this :basicColor (JR/fget (JR/fget this :basicColorFactory) :ORANGE))
            (JR/fset this :colorP (JR/invoke (JR/fget this :basicColor) :jm_intValue_0)))
            (do
            (JR/fset this :basicColor (JR/fget (JR/fget this :basicColorFactory) :RED))
            (JR/fset this :colorP (JR/invoke (JR/fget this :basicColor) :jm_intValue_0))))))))

    
(defn jm_getY_0 [this]
  (let [ l_basicHudFactory (volatile! nil)](JR/method
        (vreset! l_basicHudFactory (JR/scall 'BasicHudFactory :jm_getInstance_0))
        (if (== (JR/fget this :location) (JR/fget @l_basicHudFactory :TOPLEFT))
            (do
            (JR/jreturn (- (JR/invoke (JR/invoke (JR/fget this :allbinaryLayer) :jm_getViewPosition_0) :jm_getY_0) 4)))
            (if (== (JR/fget this :location) (JR/fget @l_basicHudFactory :BOTTOMLEFT))
            (do
            (JR/jreturn (unchecked-int (unchecked-add (JR/invoke (JR/invoke (JR/fget this :allbinaryLayer) :jm_getViewPosition_0) :jm_getY2_0) 4))))))
        (unchecked-int (unchecked-negate (JR/c2i 1))))))



