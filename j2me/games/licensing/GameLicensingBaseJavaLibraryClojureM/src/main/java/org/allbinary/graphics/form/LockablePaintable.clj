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
;; package org.allbinary.graphics.form

(ns LockablePaintable)

(JR/register 'LockablePaintable 'ItemPaintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animation nil)
  (JR/fset this :lockedIndex 0)
    (JR/fset this :animation (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget (JR/scall 'LockedResources :jm_getInstance_0) :LOCKED_DEMO_GAME_FEATURE_RESOURCE)) :jm_getInstance_1 0))
  this)

    
(defn jinit_1 [this p_lockedIndex]
  (let [ l_lockedIndex (volatile! p_lockedIndex)]
    (ItemPaintable/jinit_0 this) (jinitfields this)
        (JR/fset this :lockedIndex @l_lockedIndex))
  this)

(defn jnew_1 [p_lockedIndex ]
  (let [o (JR/alloc 'LockablePaintable)] (jinit_1 o p_lockedIndex) o))

    
(defn jm_paint_4 [this p_graphics p_currentIndex p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_currentIndex (volatile! p_currentIndex) l_x (volatile! p_x) l_y (volatile! p_y)]
        (if (and (JR/invoke (JR/scall 'LockedUtil :jm_getInstance_0) :jm_isLocked_0) (>= @l_currentIndex (JR/invoke this :jm_getLockedIndex_0)))
            (do
            (JR/invoke (JR/invoke this :jm_getAnimation_0) :jm_paintXY_3 @l_graphics @l_x @l_y)))))

    
(defn jm_getLockedIndex_0 [this]
  (let []
        (JR/fget this :lockedIndex)))

    
(defn jm_getAnimation_0 [this]
  (let []
        (JR/fget this :animation)))



