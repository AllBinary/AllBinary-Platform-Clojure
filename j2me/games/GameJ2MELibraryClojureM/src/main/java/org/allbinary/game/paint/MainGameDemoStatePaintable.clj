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

(ns MainGameDemoStatePaintable)

(JR/register 'MainGameDemoStatePaintable 'Paintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :ownershipPaintableInterface nil)
  (JR/fset this :menuPaintableInterface nil)
  this)

    
(defn jinit_2 [this p_ownershipPaintableInterface p_menuPaintableInterface]
  (let [ l_ownershipPaintableInterface (volatile! p_ownershipPaintableInterface) l_menuPaintableInterface (volatile! p_menuPaintableInterface)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :ownershipPaintableInterface @l_ownershipPaintableInterface)
        (JR/fset this :menuPaintableInterface @l_menuPaintableInterface))
  this)

(defn jnew_2 [p_ownershipPaintableInterface p_menuPaintableInterface ]
  (let [o (JR/alloc 'MainGameDemoStatePaintable)] (jinit_2 o p_ownershipPaintableInterface p_menuPaintableInterface) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :menuPaintableInterface) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :ownershipPaintableInterface) :jm_paint_1 @l_graphics)))

    
(defn jm_getOwnershipPaintableInterface_0 [this]
  (let []
        (JR/fget this :ownershipPaintableInterface)))

    
(defn jm_getMenuPaintableInterface_0 [this]
  (let []
        (JR/fget this :menuPaintableInterface)))



