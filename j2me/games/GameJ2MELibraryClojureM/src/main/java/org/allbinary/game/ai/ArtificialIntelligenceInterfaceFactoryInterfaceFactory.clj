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
;; package org.allbinary.game.ai

(ns ArtificialIntelligenceInterfaceFactoryInterfaceFactory)

(JR/register 'ArtificialIntelligenceInterfaceFactoryInterfaceFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (ArtificialIntelligenceInterfaceFactoryInterfaceFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
    (JR/fset this :list (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ArtificialIntelligenceInterfaceFactoryInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_clear_0 [this]
  (let []
        (JR/fset this :list (BasicArrayListD/jnew_0))))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ArtificialIntelligenceInterfaceFactoryInterfaceFactory/jstatic_SINGLETON)))

    
(defn jm_getInstanceFromCollection_1 [this p_hashtable]
  (let [ l_hashtable (volatile! p_hashtable) l_typeInteger (volatile! nil) l_type (volatile! nil) l_artificialIntelligenceInterfaceFactoryInterface (volatile! nil)]
        (vreset! l_typeInteger (JR/invoke @l_hashtable :jm_get_1 (JR/sget 'BasicAI "ID")))
        (vreset! l_type (JR/invoke @l_typeInteger :jm_intValue_0))
        (vreset! l_artificialIntelligenceInterfaceFactoryInterface (JR/aget* (JR/fget (JR/fget this :list) :objectArray) (unchecked-int (unchecked-subtract @l_type 1))))
        @l_artificialIntelligenceInterfaceFactoryInterface))

    
(defn jm_add_1 [this p_artificialIntelligenceInterfaceFactoryInterface]
  (let [ l_artificialIntelligenceInterfaceFactoryInterface (volatile! p_artificialIntelligenceInterfaceFactoryInterface)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_artificialIntelligenceInterfaceFactoryInterface)))



