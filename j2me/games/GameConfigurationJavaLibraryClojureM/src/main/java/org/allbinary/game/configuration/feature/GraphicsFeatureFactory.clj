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
;; package org.allbinary.game.configuration.feature

(ns GraphicsFeatureFactory)

(JR/register 'GraphicsFeatureFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GraphicsFeatureFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NONE nil)
  (JR/fset this :TRANSPARENT_IMAGE_CREATION nil)
  (JR/fset this :IMAGE_GRAPHICS nil)
  (JR/fset this :IMAGE_ROTATION_ON_THE_FLY nil)
  (JR/fset this :IMAGE_TO_ARRAY_GRAPHICS nil)
  (JR/fset this :SPRITE_QUARTER_ROTATION_GRAPHICS nil)
  (JR/fset this :SPRITE_FULL_GRAPHICS nil)
  (JR/fset this :VECTOR_GRAPHICS nil)
  (JR/fset this :VECTOR_TO_IMAGE_GRAPHICS nil)
    (JR/fset this :NONE (GraphicsFeature/jnew_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING)))
    (JR/fset this :TRANSPARENT_IMAGE_CREATION (GraphicsFeature/jnew_1 "Transparent Image Creation"))
    (JR/fset this :IMAGE_GRAPHICS (GraphicsFeature/jnew_1 "Image Graphics"))
    (JR/fset this :IMAGE_ROTATION_ON_THE_FLY (GraphicsFeature/jnew_1 "Image Rotated On The Fly"))
    (JR/fset this :IMAGE_TO_ARRAY_GRAPHICS (GraphicsFeature/jnew_1 "Image To Array Graphics"))
    (JR/fset this :SPRITE_QUARTER_ROTATION_GRAPHICS (GraphicsFeature/jnew_1 "Sprite Quarter Rotation Graphics"))
    (JR/fset this :SPRITE_FULL_GRAPHICS (GraphicsFeature/jnew_1 "Sprite Full Rotation Graphics"))
    (JR/fset this :VECTOR_GRAPHICS (GraphicsFeature/jnew_1 "BasicArrayList Graphics"))
    (JR/fset this :VECTOR_TO_IMAGE_GRAPHICS (GraphicsFeature/jnew_1 "BasicArrayList To Image Graphics"))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GraphicsFeatureFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GraphicsFeatureFactory)] (jinit_0 o) o))



