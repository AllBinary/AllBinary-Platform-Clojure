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

(ns FeaturedResourceRelativeRelationshipFactory)

(JR/register 'FeaturedResourceRelativeRelationshipFactory 'FeaturedResourceFactory '[])

(def jsv_INSTANCE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_INSTANCE [] (JR/ensure-init jclinit-state jclinit) @jsv_INSTANCE)
(defn jstatic_set_INSTANCE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_INSTANCE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_INSTANCE (FeaturedResourceRelativeRelationshipFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :basicArrayListUtil nil)
    (JR/fset this :basicArrayListUtil (JR/scall 'BasicArrayListUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    (FeaturedResourceFactory/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'FeaturedResourceRelativeRelationshipFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FeaturedResourceRelativeRelationshipFactory/jstatic_INSTANCE)))

    
(defn jm_getRelativeRelationshipList_2 [this p_resource p_layer]
  (let [ l_resource (volatile! p_resource) l_layer (volatile! p_layer) l_featureReleaseList (volatile! nil) l_size (volatile! nil) l_featureInterface (volatile! nil) l_list (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_featureReleaseList (JR/invoke this :jm_getList_0))
        (vreset! l_size (JR/invoke (JR/invoke this :jm_getList_0) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_featureInterface (JR/aget* (JR/fget @l_featureReleaseList :objectArray) @l_index))
            (if (JR/invoke @l_featureInterface :jm_isFeature_0)
                (do
                (vreset! l_list (JR/invoke @l_featureInterface :jm_getResourceRelativeRelationshipList_1 @l_resource))
                (if (not (JR/eq @l_list (JR/invoke (JR/fget this :basicArrayListUtil) :jm_getImmutableInstance_0)))
                    (do
                    (JR/jreturn (JR/invoke this :jm_duplicate_2 @l_list @l_layer))))))))
        (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Not available for current feature selection or Resource: ") :jm_append_1 @l_resource)))))))

    
(defn jm_duplicate_2 [this p_list p_layer]
  (let [ l_list (volatile! p_list) l_layer (volatile! p_layer) l_pointFactory (volatile! nil) l_newList (volatile! nil) l_size (volatile! nil) l_relativeRelationship (volatile! nil) l_index (volatile! nil)]
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_newList (BasicArrayListD/jnew_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_relativeRelationship (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke @l_newList :jm_add_1 (RelativeLayerRelationship/jnew_3 @l_layer (JR/invoke @l_pointFactory :jm_createXY_2 (JR/invoke @l_relativeRelationship :jm_getX_0) (JR/invoke @l_relativeRelationship :jm_getY_0)) (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0)))))
        @l_newList))



