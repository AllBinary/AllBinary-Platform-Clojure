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
;; package org.allbinary.game.layer

(ns BasicLayerPlacement)

(JR/register 'BasicLayerPlacement nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :layerType nil)
  (JR/fset this :width 0)
  (JR/fset this :height 0)
  this)

    
(defn jinit_3 [this p_layerType p_width p_height]
  (let [ l_layerType (volatile! p_layerType) l_width (volatile! p_width) l_height (volatile! p_height)]
    nil (jinitfields this)
        (JR/fset this :layerType @l_layerType)
        (JR/fset this :width @l_width)
        (JR/fset this :height @l_height))
  this)

(defn jnew_3 [p_layerType p_width p_height ]
  (let [o (JR/alloc 'BasicLayerPlacement)] (jinit_3 o p_layerType p_width p_height) o))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/fget this :width)))

    
(defn jm_getHeight_0 [this]
  (let []
        (JR/fget this :height)))

    
(defn jm_getLayerType_0 [this]
  (let []
        (JR/fget this :layerType)))

    
(defn jm_setLayerType_1 [this p_layerType]
  (let [ l_layerType (volatile! p_layerType)]
        (JR/fset this :layerType @l_layerType)))



