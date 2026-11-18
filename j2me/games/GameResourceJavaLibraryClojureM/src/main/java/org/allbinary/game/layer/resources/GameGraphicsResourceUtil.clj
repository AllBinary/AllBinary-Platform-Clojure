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
;; package org.allbinary.game.layer.resources

(ns GameGraphicsResourceUtil)

(JR/register 'GameGraphicsResourceUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :SPRITE nil)
  (JR/fset this :QUARTER nil)
  (JR/fset this :name nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :SPRITE "_sprite")
    (JR/fset this :QUARTER "_quarter")
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (GameGraphicsResourceUtil/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (GameGraphicsResourceUtil/jstatic_set_instance (GameGraphicsResourceUtil/jnew_0))))
        (GameGraphicsResourceUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
    nil (jinitfields this)
        (try (do
            (JR/fset this :name (JR/invoke this :jm_getString_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :CONSTRUCTOR) @l_e)) :else (throw jt))))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameGraphicsResourceUtil)] (jinit_0 o) o))

    
(defn jm_getString_0 [this]
  (let [ l_graphicsFeatureFactory (volatile! nil) l_graphicsFeature (volatile! nil) l_features (volatile! nil)]
        (vreset! l_graphicsFeatureFactory (JR/scall 'GraphicsFeatureFactory :jm_getInstance_0))
        (vreset! l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :NONE))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :IMAGE_TO_ARRAY_GRAPHICS))
            (do
            (vreset! l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :IMAGE_TO_ARRAY_GRAPHICS)))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :SPRITE_FULL_GRAPHICS))
            (do
            (vreset! l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :SPRITE_FULL_GRAPHICS)))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :SPRITE_QUARTER_ROTATION_GRAPHICS))
            (do
            (vreset! l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :SPRITE_QUARTER_ROTATION_GRAPHICS)))
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :IMAGE_ROTATION_ON_THE_FLY))
            (do
            (vreset! l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :IMAGE_ROTATION_ON_THE_FLY)))))))
        (JR/invoke this :jm_getStringForFeature_1 @l_graphicsFeature)))

    
(defn jm_getStringForFeature_1 [this p_graphicsFeature]
  (let [ l_graphicsFeature (volatile! p_graphicsFeature) l_stringBuffer (volatile! nil) l_graphicsFeatureFactory (volatile! nil) l_features (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_graphicsFeatureFactory (JR/scall 'GraphicsFeatureFactory :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :VECTOR_GRAPHICS))
            (do
            nil)
            (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :IMAGE_GRAPHICS))
            (do
            (if (or (JR/eq @l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :IMAGE_TO_ARRAY_GRAPHICS)) (JR/eq @l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :IMAGE_ROTATION_ON_THE_FLY)))
                (do
                nil)
                (if (JR/eq @l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :SPRITE_FULL_GRAPHICS))
                (do
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :SPRITE)))
                (if (JR/eq @l_graphicsFeature (JR/fget @l_graphicsFeatureFactory :SPRITE_QUARTER_ROTATION_GRAPHICS))
                (do
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :QUARTER))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :SPRITE)))
                (do
                (JR/jthrow (new java.lang.Exception "None/Unknown Sub Image Resource Type Specified")))))))
            (if (JR/invoke (JR/scall 'OpenGLFeatureUtil :jm_getInstance_0) :jm_isAnyThreed_0)
            (do
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CanvasStrings :jm_getInstance_0) :OBJ_MODEL)))
            (do
            (JR/jthrow (new java.lang.Exception "None/Unknown Main Image Resource Type Specified"))))))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))



