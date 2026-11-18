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

(ns LevelLayersFinder)

(JR/register 'LevelLayersFinder nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LevelLayersFinder/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :enumerationUtil nil)
    (JR/fset this :enumerationUtil (JR/scall 'EnumerationUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LevelLayersFinder)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LevelLayersFinder/jstatic_instance)))

    
(defn jm_get_1 [this p_hashtable]
  (let [ l_hashtable (volatile! p_hashtable) l_smallIntegerSingletonFactory (volatile! nil) l_list (volatile! nil) l_enumeration (volatile! nil) l_layerHashtableCanBeNull (volatile! nil) l_integerCanBeNull (volatile! nil) l_cachedIntegerCanBeNull (volatile! nil)]
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (vreset! l_list (BasicArrayListD/jnew_0))
        (vreset! l_enumeration (JR/invoke @l_hashtable :jm_keys_0))
        (vreset! l_layerHashtableCanBeNull nil)
        (vreset! l_integerCanBeNull nil)
        (vreset! l_cachedIntegerCanBeNull nil)
        (JR/jwhile false false (JR/invoke (JR/fget this :enumerationUtil) :jm_hasMoreElements_1 @l_enumeration)
            (vreset! l_layerHashtableCanBeNull (JR/invoke @l_hashtable :jm_get_1 (JR/invoke (JR/fget this :enumerationUtil) :jm_nextElement_1 @l_enumeration)))
            (vreset! l_integerCanBeNull (JR/invoke @l_layerHashtableCanBeNull :jm_get_1 (JR/sget 'Layer "ID")))
            (vreset! l_cachedIntegerCanBeNull (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 (JR/invoke @l_integerCanBeNull :jm_intValue_0)))
            (if (not (JR/invoke @l_list :jm_contains_1 @l_cachedIntegerCanBeNull))
                (do
                (JR/invoke @l_list :jm_add_1 @l_cachedIntegerCanBeNull))))
        @l_list))



