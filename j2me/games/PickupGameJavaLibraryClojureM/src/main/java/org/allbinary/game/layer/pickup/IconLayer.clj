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
;; package org.allbinary.game.layer.pickup

(ns IconLayer)

(JR/register 'IconLayer 'AllBinaryLayer '[])

(def jsv_NULL_ICON_LAYER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ICON_LAYER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ICON_LAYER)
(defn jstatic_set_NULL_ICON_LAYER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ICON_LAYER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ICON_LAYER (IconLayer/jnew_3 (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0) 0 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterface nil)
  this)

    
(defn jinit_3 [this p_animationInterface p_width p_height]
  (let [ l_animationInterface (volatile! p_animationInterface) l_width (volatile! p_width) l_height (volatile! p_height)]
        (AllBinaryLayer/jinit_3 this (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) @l_width @l_height) (JR/scall 'ViewPosition :jm_getInstanceD_0)) (jinitfields this)
        (JR/fset this :animationInterface @l_animationInterface))
  this)

(defn jnew_3 [p_animationInterface p_width p_height ]
  (let [o (JR/alloc 'IconLayer)] (jinit_3 o p_animationInterface p_width p_height) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics (JR/fget this :x) (JR/fget this :y))))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintThreedXYZ_4 @l_graphics (JR/fget this :x) (JR/fget this :y) (JR/fget this :z))))

    
(defn jm_getAnimationInterface_0 [this]
  (let []
        (JR/fget this :animationInterface)))



