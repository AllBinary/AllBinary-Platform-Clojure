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
;; package org.allbinary.animation.resource

(ns BaseResourceAnimationInterfaceFactoryInterfaceFactory)

(JR/register 'BaseResourceAnimationInterfaceFactoryInterfaceFactory nil '[FeatureResourceAnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :hashtable nil)
  (JR/fset this :rectangleHashtable nil)
  (JR/fset this :rectangleArrayOfArraysHashtable nil)
  (JR/fset this :name nil)
  (JR/fset this :initialized false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_4 [this p_name p_hashtable p_rectangleHashtable p_rectangleArrayHashtable]
  (let [ l_name (volatile! p_name) l_hashtable (volatile! p_hashtable) l_rectangleHashtable (volatile! p_rectangleHashtable) l_rectangleArrayHashtable (volatile! p_rectangleArrayHashtable)]
    nil (jinitfields this)
        (JR/fset this :hashtable @l_hashtable)
        (JR/fset this :rectangleHashtable @l_rectangleHashtable)
        (JR/fset this :rectangleArrayOfArraysHashtable @l_rectangleArrayHashtable)
        (JR/fset this :name @l_name))
  this)

(defn jnew_4 [p_name p_hashtable p_rectangleHashtable p_rectangleArrayHashtable ]
  (let [o (JR/alloc 'BaseResourceAnimationInterfaceFactoryInterfaceFactory)] (jinit_4 o p_name p_hashtable p_rectangleHashtable p_rectangleArrayHashtable) o))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_init_1 [this p_level]
  (let [ l_level (volatile! p_level) l_commonStrings (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Available List of Animations: ") :jm_append_1 (JR/to-string-of (JR/fget this :hashtable)))) this (JR/fget @l_commonStrings :INIT))
        (JR/invoke this :jm_setInitialized_1 true)))

    
(defn jm_initImageCache_2 [this p_imageCache p_level]
  (let [ l_imageCache (volatile! p_imageCache) l_level (volatile! p_level)]
        nil))

    
(defn jm_add_2 [this p_resource p_animationInterfaceFactoryInterface]
  (let [ l_resource (volatile! p_resource) l_animationInterfaceFactoryInterface (volatile! p_animationInterfaceFactoryInterface)]
        (if (JR/invoke (JR/fget this :hashtable) :jm_containsKey_1 @l_resource)
            (do
            (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Resource Already Created: ") :jm_append_1 @l_resource))))))
        (JR/invoke (JR/fget this :hashtable) :jm_put_2 @l_resource @l_animationInterfaceFactoryInterface)))

    
(defn jm_getBasicAnimationInterfaceFactoryInstance_1 [this p_resource]
  (let [ l_resource (volatile! p_resource) l_basicAnimationInterfaceFactoryInterfaceCanBeNull (volatile! nil)](JR/method
        (vreset! l_basicAnimationInterfaceFactoryInterfaceCanBeNull (JR/invoke (JR/fget this :hashtable) :jm_get_1 @l_resource))
        (if (nil? @l_basicAnimationInterfaceFactoryInterfaceCanBeNull)
            (do
            (JR/jreturn (JR/sget 'NullAnimationFactory "NULL_NOT_FOR_USE_ANIMATION_FACTORY"))))
        @l_basicAnimationInterfaceFactoryInterfaceCanBeNull)))

    
(defn jm_getRectangle_1 [this p_resource]
  (let [ l_resource (volatile! p_resource) l_rectangleCanBeNull (volatile! nil)](JR/method
        (vreset! l_rectangleCanBeNull (JR/invoke (JR/fget this :rectangleHashtable) :jm_get_1 @l_resource))
        (if (nil? @l_rectangleCanBeNull)
            (do
            (JR/jreturn (JR/sget 'RectangleFactory "SINGLETON"))))
        @l_rectangleCanBeNull)))

    
(defn jm_addRectangle_2 [this p_resource p_rectangle]
  (let [ l_resource (volatile! p_resource) l_rectangle (volatile! p_rectangle)]
        (JR/invoke (JR/fget this :rectangleHashtable) :jm_put_2 @l_resource @l_rectangle)))

    
(defn jm_getRectangleArrayOfArrays_1 [this p_resource]
  (let [ l_resource (volatile! p_resource) l_valueCanBeNull (volatile! nil) l_rectangleArrayOfArrays (volatile! nil)]
        (vreset! l_valueCanBeNull (JR/invoke (JR/fget this :rectangleArrayOfArraysHashtable) :jm_get_1 @l_resource))
        (if (some? @l_valueCanBeNull)
            (do
            (vreset! l_rectangleArrayOfArrays @l_valueCanBeNull)
            @l_rectangleArrayOfArrays)
            (do
            (JR/sget 'RectangleFactory "ARRAY_OF_ARRAYS")))))

    
(defn jm_addRectangleArrayOfArrays_2 [this p_resource p_rectangleArrayOfArrays]
  (let [ l_resource (volatile! p_resource) l_rectangleArrayOfArrays (volatile! p_rectangleArrayOfArrays)]
        (JR/invoke (JR/fget this :rectangleArrayOfArraysHashtable) :jm_put_2 @l_resource @l_rectangleArrayOfArrays)))

    
(defn jm_isFeature_0 [this]
  (let []
        false))

    
(defn jm_isLoadingLevel_1 [this p_level]
  (let [ l_level (volatile! p_level) l_resourceLoadingLevelFactory (volatile! nil)]
        (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
        (if (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_ALL) :jm_getLevel_0))
            (do
            true)
            (do
            false))))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/class-name this)) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SEMICOLON)) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE)) :jm_append_1 (JR/fget this :name)))))

    
(defn jm_getHashtable_0 [this]
  (let []
        (JR/fget this :hashtable)))

    
(defn jm_getRectangleHashtable_0 [this]
  (let []
        (JR/fget this :rectangleHashtable)))

    
(defn jm_getRectangleArrayOfArraysHashtable_0 [this]
  (let []
        (JR/fget this :rectangleArrayOfArraysHashtable)))

    
(defn jm_setInitialized_1 [this p_initialized]
  (let [ l_initialized (volatile! p_initialized)]
        (JR/fset this :initialized @l_initialized)))

    
(defn jm_isInitialized_0 [this]
  (let []
        (JR/fget this :initialized)))



