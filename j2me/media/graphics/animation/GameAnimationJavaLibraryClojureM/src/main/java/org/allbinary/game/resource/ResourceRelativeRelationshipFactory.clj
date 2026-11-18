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

(ns ResourceRelativeRelationshipFactory)

(JR/register 'ResourceRelativeRelationshipFactory nil '[ResourceRelativeRelationshipFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :basicArrayListUtil nil)
  (JR/fset this :hashtable nil)
  (JR/fset this :initialized false)
    (JR/fset this :basicArrayListUtil (JR/scall 'BasicArrayListUtil :jm_getInstance_0))
    (JR/fset this :hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ResourceRelativeRelationshipFactory)] (jinit_0 o) o))

    
(defn jm_init_1 [this p_level]
  (let [ l_level (volatile! p_level)]
        (JR/invoke this :jm_setInitialized_1 true)))

    
(defn jm_getResourceRelativeRelationshipList_1 [this p_resource]
  (let [ l_resource (volatile! p_resource) l_listCanBeNull (volatile! nil)](JR/method
        (vreset! l_listCanBeNull (JR/invoke (JR/fget this :hashtable) :jm_get_1 @l_resource))
        (if (nil? @l_listCanBeNull)
            (do
            (JR/jreturn (JR/invoke (JR/fget this :basicArrayListUtil) :jm_getImmutableInstance_0))))
        @l_listCanBeNull)))

    
(defn jm_addResourceRelativeRelationship_2 [this p_resource p_hardPoint]
  (let [ l_resource (volatile! p_resource) l_hardPoint (volatile! p_hardPoint) l_list (volatile! nil)]
        (vreset! l_list (JR/invoke this :jm_getResourceRelativeRelationshipList_1 @l_resource))
        (if (JR/eq @l_list (JR/invoke (JR/fget this :basicArrayListUtil) :jm_getImmutableInstance_0))
            (do
            (vreset! l_list (BasicArrayListD/jnew_0))))
        (JR/invoke @l_list :jm_add_1 @l_hardPoint)
        (JR/invoke (JR/fget this :hashtable) :jm_put_2 @l_resource @l_list)))

    
(defn jm_isLoadingLevel_1 [this p_level]
  (let [ l_level (volatile! p_level)]
        false))

    
(defn jm_isFeature_0 [this]
  (let []
        false))

    
(defn jm_setInitialized_1 [this p_initialized]
  (let [ l_initialized (volatile! p_initialized)]
        (JR/fset this :initialized @l_initialized)))

    
(defn jm_isInitialized_0 [this]
  (let []
        (JR/fget this :initialized)))



