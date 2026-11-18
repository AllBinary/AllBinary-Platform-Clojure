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
;; package org.allbinary.graphics.paint

(ns AnimationCompositePaintable)

(JR/register 'AnimationCompositePaintable 'InitUpdatePaintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  this)

    
(defn jinit_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
    (InitUpdatePaintable/jinit_0 this) (jinitfields this)
        (JR/fset this :animationInterface @l_animationInterface))
  this)

(defn jnew_1 [p_animationInterface ]
  (let [o (JR/alloc 'AnimationCompositePaintable)] (jinit_1 o p_animationInterface) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics 0 0)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintThreedXYZ_4 @l_graphics 0 0 0)))



