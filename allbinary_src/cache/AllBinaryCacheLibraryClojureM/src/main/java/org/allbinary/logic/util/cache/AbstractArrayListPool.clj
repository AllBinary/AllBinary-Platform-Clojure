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

(ns AbstractArrayListPool)

(JR/register 'AbstractArrayListPool nil '[PoolInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :buffers nil)
  (JR/fset this :cacheableInterfaceFactoryInterface nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :buffers (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_1 [this p_cacheableInterfaceFactoryInterface]
  (let [ l_cacheableInterfaceFactoryInterface (volatile! p_cacheableInterfaceFactoryInterface)]
    nil (jinitfields this)
        (JR/fset this :cacheableInterfaceFactoryInterface @l_cacheableInterfaceFactoryInterface))
  this)

(defn jnew_1 [p_cacheableInterfaceFactoryInterface ]
  (let [o (JR/alloc 'AbstractArrayListPool)] (jinit_1 o p_cacheableInterfaceFactoryInterface) o))

    
(defn jm_clear_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_remove_1 [this p_key]
  (let [ l_key (volatile! p_key)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_add_1 [this p_cacheableInterface]
  (let [ l_cacheableInterface (volatile! p_cacheableInterface)]
        (JR/invoke (JR/fget this :buffers) :jm_add_1 @l_cacheableInterface)))

    
(defn jm_addArray_1 [this p_cacheableInterfaces]
  (let [ l_cacheableInterfaces (volatile! p_cacheableInterfaces) l_index (volatile! nil)]
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_cacheableInterfaces)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/fget this :buffers) :jm_add_1 (JR/aget* @l_cacheableInterfaces @l_index))))))



