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
;; package org.allbinary.game.paint

(ns BasicGameDemoPaintable)

(JR/register 'BasicGameDemoPaintable 'StatePaintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :mainDemoStatePaintable nil)
  (JR/fset this :ownershipPaintable nil)
  (JR/fset this :helpPaintableInterface nil)
  (JR/fset this :currentStatePaintable nil)
    (JR/fset this :currentStatePaintable (JR/scall 'NullPaintable :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_mainDemoStatePaintable p_ownershipPaintable p_helpPaintableInterface]
  (let [ l_mainDemoStatePaintable (volatile! p_mainDemoStatePaintable) l_ownershipPaintable (volatile! p_ownershipPaintable) l_helpPaintableInterface (volatile! p_helpPaintableInterface)]
    (StatePaintable/jinit_0 this) (jinitfields this)
        (JR/fset this :mainDemoStatePaintable @l_mainDemoStatePaintable)
        (JR/invoke this :jm_setCurrentStatePaintable_1 (JR/scall 'NullPaintable :jm_getInstance_0))
        (JR/fset this :ownershipPaintable @l_ownershipPaintable)
        (JR/fset this :helpPaintableInterface @l_helpPaintableInterface))
  this)

(defn jnew_3 [p_mainDemoStatePaintable p_ownershipPaintable p_helpPaintableInterface ]
  (let [o (JR/alloc 'BasicGameDemoPaintable)] (jinit_3 o p_mainDemoStatePaintable p_ownershipPaintable p_helpPaintableInterface) o))

    
(defn jm_setState_1 [this p_state]
  (let [ l_state (volatile! p_state)]
        (if (== @l_state 0)
            (do
            (JR/invoke this :jm_setCurrentStatePaintable_1 (JR/invoke this :jm_getMainDemoStatePaintable_0)))
            (if (== @l_state 1)
            (do
            (JR/invoke this :jm_setCurrentStatePaintable_1 (JR/fget this :helpPaintableInterface)))
            (do
            (JR/invoke this :jm_setCurrentStatePaintable_1 (JR/fget this :ownershipPaintable)))))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/invoke this :jm_getCurrentStatePaintable_0) :jm_paint_1 @l_graphics)))

    
(defn jm_getHelpPaintableInterface_0 [this]
  (let []
        (JR/fget this :helpPaintableInterface)))

    
(defn jm_setCurrentStatePaintable_1 [this p_currentStatePaintable]
  (let [ l_currentStatePaintable (volatile! p_currentStatePaintable)]
        (JR/fset this :currentStatePaintable @l_currentStatePaintable)))

    
(defn jm_getCurrentStatePaintable_0 [this]
  (let []
        (JR/fget this :currentStatePaintable)))

    
(defn jm_getMainDemoStatePaintable_0 [this]
  (let []
        (JR/fget this :mainDemoStatePaintable)))



