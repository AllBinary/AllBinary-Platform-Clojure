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
;; package org.allbinary.game.resource

(ns FeaturedResourceFactory)

(JR/register 'FeaturedResourceFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :list nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :ANIMATION_FEATURES nil)
  (JR/fset this :IMAGE_LABEL nil)
  (JR/fset this :IMAGE_GRAPHICS_ARRAY nil)
  (JR/fset this :IMAGE_GRAPHICS_ROTATION nil)
  (JR/fset this :SPRITE_QUARTER nil)
  (JR/fset this :SPRITE_FULL nil)
  (JR/fset this :IS_LOADING_LEVEL_LABEL nil)
  (JR/fset this :IS_FEATURE nil)
  (JR/fset this :GAME_FEATURE_CONTROLLED nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :ANIMATION_FEATURES "Animation Features: Vector: ")
    (JR/fset this :IMAGE_LABEL " Image: ")
    (JR/fset this :IMAGE_GRAPHICS_ARRAY "Image Array: ")
    (JR/fset this :IMAGE_GRAPHICS_ROTATION "Image Rotate: ")
    (JR/fset this :SPRITE_QUARTER " Sprite Quarter: ")
    (JR/fset this :SPRITE_FULL " Sprite Full: ")
    (JR/fset this :IS_LOADING_LEVEL_LABEL " isLoadingLevel ")
    (JR/fset this :IS_FEATURE " isFeature: ")
    (JR/fset this :GAME_FEATURE_CONTROLLED "GameFeatureControlledInterface: ")
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'FeaturedResourceFactory)] (jinit_0 o) o))

    
(defn jm_init_1 [this p_level]
  (let [ l_level (volatile! p_level) l_size (volatile! nil) l_featureInterface (volatile! nil) l_isLoadingLevel (volatile! nil) l_isFeature (volatile! nil) l_index (volatile! nil) l_features (volatile! nil) l_graphicsFeatureFactory (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_size (JR/invoke (JR/fget this :list) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_featureInterface (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
            (vreset! l_isLoadingLevel (JR/invoke @l_featureInterface :jm_isLoadingLevel_1 @l_level))
            (vreset! l_isFeature (JR/invoke @l_featureInterface :jm_isFeature_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :GAME_FEATURE_CONTROLLED)) :jm_append_1 (JR/to-string-of @l_featureInterface)) :jm_append_1 (JR/fget this :IS_LOADING_LEVEL_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0) :jm_getLevelString_1 @l_level)) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COLON_SEP)) :jm_appendboolean_1 @l_isLoadingLevel) :jm_append_1 (JR/fget this :IS_FEATURE)) :jm_appendboolean_1 @l_isFeature)) this (JR/fget (JR/fget this :commonStrings) :INIT))
            (if (and @l_isLoadingLevel @l_isFeature)
                (do
                (JR/invoke @l_featureInterface :jm_init_1 @l_level)))))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_graphicsFeatureFactory (JR/scall 'GraphicsFeatureFactory :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :ANIMATION_FEATURES))
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :VECTOR_GRAPHICS)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :IMAGE_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :IMAGE_GRAPHICS)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget (JR/fget this :commonStrings) :INIT))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :IMAGE_GRAPHICS))
            (do
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :IMAGE_GRAPHICS_ARRAY))
            (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :IMAGE_TO_ARRAY_GRAPHICS)))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :IMAGE_GRAPHICS_ROTATION))
            (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :IMAGE_TO_ARRAY_GRAPHICS)))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :SPRITE_QUARTER))
            (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :SPRITE_QUARTER_ROTATION_GRAPHICS)))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :SPRITE_FULL))
            (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_graphicsFeatureFactory :SPRITE_FULL_GRAPHICS)))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget (JR/fget this :commonStrings) :INIT))))))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_clear_0)))

    
(defn jm_add_1 [this p_featureInterface]
  (let [ l_featureInterface (volatile! p_featureInterface)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_featureInterface))) this (JR/fget (JR/fget this :commonStrings) :ADD))
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_featureInterface)))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :list)))



