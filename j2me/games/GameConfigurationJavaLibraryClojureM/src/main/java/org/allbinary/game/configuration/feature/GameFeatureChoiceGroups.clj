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

(ns GameFeatureChoiceGroups)

(JR/register 'GameFeatureChoiceGroups nil '[])

(def jsv_gameFeatureChoiceGroupsExclusive (atom nil))
(def jsv_gameFeatureChoiceGroupsMultiple (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_gameFeatureChoiceGroupsExclusive [] (JR/ensure-init jclinit-state jclinit) @jsv_gameFeatureChoiceGroupsExclusive)
(defn jstatic_set_gameFeatureChoiceGroupsExclusive [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_gameFeatureChoiceGroupsExclusive v))
(defn jstatic_gameFeatureChoiceGroupsMultiple [] (JR/ensure-init jclinit-state jclinit) @jsv_gameFeatureChoiceGroupsMultiple)
(defn jstatic_set_gameFeatureChoiceGroupsMultiple [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_gameFeatureChoiceGroupsMultiple v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_gameFeatureChoiceGroupsExclusive (GameFeatureChoiceGroups/jnew_0))
    (reset! jsv_gameFeatureChoiceGroupsMultiple (GameFeatureChoiceGroups/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :hashtable nil)
    (JR/fset this :hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameFeatureChoiceGroups)] (jinit_0 o) o))

    
(defn jm_getExclusiveInstance_0 []
  (let [this nil]
        (GameFeatureChoiceGroups/jstatic_gameFeatureChoiceGroupsExclusive)))

    
(defn jm_getMultipleInstance_0 []
  (let [this nil]
        (GameFeatureChoiceGroups/jstatic_gameFeatureChoiceGroupsMultiple)))

    
(defn jm_get_0 [this]
  (let []
        (JR/fget this :hashtable)))

    
(defn jm_add_2 [this p_name p_list]
  (let [ l_name (volatile! p_name) l_list (volatile! p_list)]
        (JR/invoke (JR/fget this :hashtable) :jm_put_2 @l_name @l_list)))



