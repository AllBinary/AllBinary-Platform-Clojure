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
;; package org.allbinary.game.part

(ns MakeCountedPartsSingletonArrayFactory)

(JR/register 'MakeCountedPartsSingletonArrayFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MakeCountedPartsSingletonArrayFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :list nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :list (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MakeCountedPartsSingletonArrayFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MakeCountedPartsSingletonArrayFactory/jstatic_instance)))

    
(defn jm_getUpdated_1 [this p_partInterfaceArray]
  (let [ l_partInterfaceArray (volatile! p_partInterfaceArray) l_index (volatile! nil) l_countedBasicArrayList (volatile! nil) l_layerInterfaceFactoryInterface (volatile! nil) l_size (volatile! nil) l_stringBuffer (volatile! nil) l_commonStrings (volatile! nil) l_newPartInterfaceArray (volatile! nil) l_newSize (volatile! nil)]
        (JR/fset this :list (BasicArrayListD/jnew_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_partInterfaceArray)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/fget this :list) :jm_add_1 (JR/aget* @l_partInterfaceArray @l_index))))
        (vreset! l_countedBasicArrayList (JR/invoke (JR/scall 'CountedPickedUpLayerInterfaceFactoryPool :jm_getInstance_0) :jm_getList_0))
        (vreset! l_layerInterfaceFactoryInterface nil)
        (vreset! l_size (JR/invoke @l_countedBasicArrayList :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_layerInterfaceFactoryInterface (JR/aget* (JR/fget @l_countedBasicArrayList :objectArray) @l_index))
            (JR/invoke (JR/fget this :list) :jm_add_1 (CountedLayerInterfaceFactoryPart/jnew_2 0 @l_layerInterfaceFactoryInterface))))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Total Parts: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke (JR/fget this :list) :jm_size_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " Counted: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke @l_countedBasicArrayList :jm_size_0))
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget @l_commonStrings :GET_INSTANCE))
        (vreset! l_newPartInterfaceArray (JR/anew "Object" 1 (JR/invoke (JR/fget this :list) :jm_size_0)))
        (vreset! l_newSize (JR/alen @l_newPartInterfaceArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_newSize) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_newPartInterfaceArray @l_index (JR/invoke (JR/fget this :list) :jm_get_1 @l_index))))
        @l_newPartInterfaceArray))



