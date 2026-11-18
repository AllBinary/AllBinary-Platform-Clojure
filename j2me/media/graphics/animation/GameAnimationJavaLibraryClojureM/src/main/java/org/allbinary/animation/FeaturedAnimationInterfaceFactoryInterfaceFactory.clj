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
;; package org.allbinary.animation

(ns FeaturedAnimationInterfaceFactoryInterfaceFactory)

(JR/register 'FeaturedAnimationInterfaceFactoryInterfaceFactory 'FeaturedResourceFactory '[])

(def jsv_INSTANCE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_INSTANCE [] (JR/ensure-init jclinit-state jclinit) @jsv_INSTANCE)
(defn jstatic_set_INSTANCE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_INSTANCE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_INSTANCE (FeaturedAnimationInterfaceFactoryInterfaceFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (FeaturedResourceFactory/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'FeaturedAnimationInterfaceFactoryInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FeaturedAnimationInterfaceFactoryInterfaceFactory/jstatic_INSTANCE)))

    
(defn jm_getRectangle_1 [this p_resource]
  (let [ l_resource (volatile! p_resource)]
        (JR/invoke this :jm_getRectangleXY_3 @l_resource 0 0)))

    
(defn jm_getRectangleXY_3 [this p_resource p_x p_y]
  (let [ l_resource (volatile! p_resource) l_x (volatile! p_x) l_y (volatile! p_y) l_pointFactory (volatile! nil) l_list (volatile! nil) l_scale (volatile! nil) l_size (volatile! nil) l_featureInterface (volatile! nil) l_rectangle (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_list (JR/invoke this :jm_getList_0))
        (vreset! l_scale (JR/invoke (JR/invoke (JR/fget (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :SCALE) :jm_getValue_0) :jm_intValue_0))
        (vreset! l_size (JR/invoke (JR/invoke this :jm_getList_0) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_featureInterface (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (if (JR/invoke @l_featureInterface :jm_isFeature_0)
                (do
                (vreset! l_rectangle (JR/invoke @l_featureInterface :jm_getRectangle_1 @l_resource))
                (if (not (JR/eq @l_rectangle (JR/sget 'RectangleFactory "SINGLETON")))
                    (do
                    (JR/jreturn (Rectangle/jnew_3 (JR/invoke @l_pointFactory :jm_createXY_2 @l_x @l_y) (JR/ishr (unchecked-int (unchecked-multiply (JR/invoke @l_rectangle :jm_getWidth_0) @l_scale)) 1) (JR/ishr (unchecked-int (unchecked-multiply (JR/invoke @l_rectangle :jm_getHeight_0) @l_scale)) 1)))))))))
        (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "No rectangle available for current feature selection or Resource: ") :jm_append_1 @l_resource)))))))

    
(defn jm_getProcedural_1 [this p_resource]
  (let [ l_resource (volatile! p_resource)]
        (JR/invoke this :jm_getBasicAnimationInterfaceFactoryInstance_1 @l_resource)))

    
(defn jm_get_1 [this p_resource]
  (let [ l_resource (volatile! p_resource)]
        (JR/invoke this :jm_getBasicAnimationInterfaceFactoryInstance_1 @l_resource)))

    
(defn jm_getBasicAnimationInterfaceFactoryInstance_1 [this p_resource]
  (let [ l_resource (volatile! p_resource) l_list (volatile! nil) l_resourceTypeAvailableList (volatile! nil) l_size (volatile! nil) l_featureInterface (volatile! nil) l_animationInterfaceFactoryInterface (volatile! nil) l_index (volatile! nil) l_stringBuffer (volatile! nil) l_result (volatile! nil) l_NO_ANIMATION_AVAILABLE_FROM (volatile! nil) l_FOR_FACTORIES (volatile! nil) l_FOR_RESOURCE (volatile! nil) l_HAS_KEY (volatile! nil) l_RESOURCES_LABEL (volatile! nil) l_size2 (volatile! nil)](JR/method
        (vreset! l_list (JR/invoke this :jm_getList_0))
        (vreset! l_resourceTypeAvailableList (BasicArrayListD/jnew_0))
        (vreset! l_size (JR/invoke (JR/invoke this :jm_getList_0) :jm_size_0))
        (vreset! l_featureInterface nil)
        (vreset! l_animationInterfaceFactoryInterface nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_featureInterface (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (if (JR/invoke @l_featureInterface :jm_isFeature_0)
                (do
                (JR/invoke @l_resourceTypeAvailableList :jm_add_1 @l_featureInterface)
                (vreset! l_animationInterfaceFactoryInterface (JR/invoke @l_featureInterface :jm_getBasicAnimationInterfaceFactoryInstance_1 @l_resource))
                (if (not (JR/eq @l_animationInterfaceFactoryInterface (JR/sget 'NullAnimationFactory "NULL_NOT_FOR_USE_ANIMATION_FACTORY")))
                    (do
                    (JR/jreturn @l_animationInterfaceFactoryInterface)))))))
        (if (> (JR/invoke @l_resourceTypeAvailableList :jm_size_0) 0)
            (do
            (vreset! l_NO_ANIMATION_AVAILABLE_FROM "No animation available from: ")
            (vreset! l_FOR_FACTORIES " factories: ")
            (vreset! l_FOR_RESOURCE " for Resource: ")
            (vreset! l_HAS_KEY " has: ")
            (vreset! l_RESOURCES_LABEL " resources ")
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_NO_ANIMATION_AVAILABLE_FROM)
            (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke @l_resourceTypeAvailableList :jm_size_0))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :FORWARD_SLASH))
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_size)
            (JR/invoke @l_stringBuffer :jm_append_1 @l_FOR_FACTORIES)
            (vreset! l_size2 (JR/invoke @l_resourceTypeAvailableList :jm_size_0))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size2) (do (JR/vinc l_index 1 :int false))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/invoke @l_resourceTypeAvailableList :jm_get_1 @l_index)))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COMMA_SEP))))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_FOR_RESOURCE)
            (JR/invoke @l_stringBuffer :jm_append_1 @l_resource)
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :NEW_LINE))
                (vreset! l_featureInterface (JR/aget* (JR/fget @l_list :objectArray) @l_index))
                (if (JR/invoke @l_featureInterface :jm_isFeature_0)
                    (do
                    (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_featureInterface))
                    (JR/invoke @l_stringBuffer :jm_append_1 @l_HAS_KEY)
                    (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke (JR/invoke @l_featureInterface :jm_getHashtable_0) :jm_size_0))
                    (JR/invoke @l_stringBuffer :jm_append_1 @l_RESOURCES_LABEL)))))
            (JR/jthrow (new java.lang.Exception (JR/to-string-of @l_stringBuffer))))
            (do
            (vreset! l_stringBuffer (StringMaker/jnew_0))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_featureInterface (JR/aget* (JR/fget @l_list :objectArray) @l_index))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of @l_featureInterface))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))))
            (vreset! l_result (JR/to-string-of @l_stringBuffer))
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 "No feature resource type available for Resource: ") :jm_append_1 @l_resource) :jm_append_1 " Resource Factories Available: ") :jm_append_1 @l_result)))))))))



