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
;; package org.allbinary.layer

(ns LayerInterfaceFactory)

(JR/register 'LayerInterfaceFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (LayerInterfaceFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :list nil)
  (JR/fset this :HASHTABLE_LABEL nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :list (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
    (JR/fset this :HASHTABLE_LABEL "Hashtable: ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'LayerInterfaceFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LayerInterfaceFactory/jstatic_SINGLETON)))

    
(defn jm_init_0 [this]
  (let []
        (JR/fset this :list (BasicArrayListD/jnew_0))))

    
(defn jm_getNexInstance_4 [this p_hashtable p_x p_y p_z]
  (let [ l_hashtable (volatile! p_hashtable) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z) l_commonStrings (volatile! nil) l_typeInteger (volatile! nil) l_layerInterfaceFactoryInterface (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :HASHTABLE_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_hashtable))) this (JR/fget @l_commonStrings :GET_INSTANCE))
        (vreset! l_typeInteger (JR/invoke @l_hashtable :jm_get_1 (JR/sget 'Layer "ID")))
        (vreset! l_layerInterfaceFactoryInterface (JR/aget* (JR/fget (JR/fget this :list) :objectArray) (- (JR/invoke @l_typeInteger :jm_intValue_0) 1)))
        (JR/invoke @l_layerInterfaceFactoryInterface :jm_getNextInstance_4 @l_hashtable @l_x @l_y @l_z)))

    
(defn jm_add_1 [this p_layerInterfaceFactoryInterface]
  (let [ l_layerInterfaceFactoryInterface (volatile! p_layerInterfaceFactoryInterface)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_layerInterfaceFactoryInterface)))



