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

(ns BasicArrayListPool)

(JR/register 'BasicArrayListPool 'AbstractArrayListPool '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_cacheableInterfaceFactoryInterface]
  (let [ l_cacheableInterfaceFactoryInterface (volatile! p_cacheableInterfaceFactoryInterface)]
        (AbstractArrayListPool/jinit_1 this @l_cacheableInterfaceFactoryInterface) (jinitfields this))
  this)

(defn jnew_1 [p_cacheableInterfaceFactoryInterface ]
  (let [o (JR/alloc 'BasicArrayListPool)] (jinit_1 o p_cacheableInterfaceFactoryInterface) o))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :buffers) :jm_clear_0)))

    
(defn jm_remove_1 [this p_key]
  (let [ l_key (volatile! p_key) l_size (volatile! nil)]
        (vreset! l_size (JR/invoke (JR/fget this :buffers) :jm_size_0))
        (if (> @l_size 0)
            (do
            (JR/invoke (JR/fget this :buffers) :jm_removeAt_1 (unchecked-int (unchecked-subtract @l_size 1))))
            (do
            (JR/invoke (JR/fget this :cacheableInterfaceFactoryInterface) :jm_getInstance_1 @l_key)))))

    
(defn jm_addAll_1 [this p_usedList]
  (let [ l_usedList (volatile! p_usedList) l_anyType (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (JR/invoke @l_usedList :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_anyType (JR/aget* (JR/fget @l_usedList :objectArray) @l_index))
            (JR/invoke this :jm_add_1 @l_anyType)))
        (JR/invoke @l_usedList :jm_clear_0)))

    
(defn jm_releaseUsedBackToPool_1 [this p_usedList]
  (let [ l_usedList (volatile! p_usedList) l_list (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (JR/invoke @l_usedList :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_list (JR/aget* (JR/fget @l_usedList :objectArray) @l_index))
            (if (== (JR/invoke @l_list :jm_size_0) 0)
                (do
                (JR/invoke @l_usedList :jm_removeAt_1 @l_index)
                (JR/invoke this :jm_add_1 @l_list)))))))



