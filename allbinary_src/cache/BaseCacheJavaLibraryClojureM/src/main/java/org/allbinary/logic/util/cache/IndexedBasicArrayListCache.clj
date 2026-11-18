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
;; package org.allbinary.logic.util.cache

(ns IndexedBasicArrayListCache)

(JR/register 'IndexedBasicArrayListCache 'BaseBasicArrayListCache '[CacheInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :size 0)
  (JR/fset this :index 0)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :size 0)
    (JR/fset this :index 0)
  this)

    
(defn jm_createCache_1 [p_size]
  (let [this nil l_size (volatile! p_size) l_indexedBasicArrayListCache (volatile! nil)]
        (vreset! l_indexedBasicArrayListCache (IndexedBasicArrayListCache/jnew_0))
        (JR/invoke @l_indexedBasicArrayListCache :jm_init_1 @l_size)
        @l_indexedBasicArrayListCache))

    
(defn jinit_0 [this]
  (let []
    (BaseBasicArrayListCache/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'IndexedBasicArrayListCache)] (jinit_0 o) o))

    
(defn jm_init_1 [this p_size]
  (let [ l_size (volatile! p_size) l_index (volatile! nil)]
        (if (< (JR/fget this :size) @l_size)
            (do
            (JR/invoke (JR/fget this :list) :jm_ensureCapacity_1 @l_size)
            (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
                (JR/jfor false false (>= @l_index (JR/fget this :size)) (do (JR/vinc l_index -1 :int false))
                (JR/invoke this :jm_addDefault_0)))
            (JR/fset this :size @l_size)))))

    
(defn jm_getAt_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index)))

    
(defn jm_addDefault_0 [this]
  (let []
        nil))

    
(defn jm_addObject_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_anyType)))

    
(defn jm_add_1 [this p_cacheableInterface]
  (let [ l_cacheableInterface (volatile! p_cacheableInterface)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_cacheableInterface)))

    
(defn jm_addArray_1 [this p_cacheableInterfaces]
  (let [ l_cacheableInterfaces (volatile! p_cacheableInterfaces)]
        (JR/jthrow (new java.lang.Exception "No Imple"))))

    
(defn jm_clear_0 [this]
  (let []
        (JR/fset this :index 0)))



