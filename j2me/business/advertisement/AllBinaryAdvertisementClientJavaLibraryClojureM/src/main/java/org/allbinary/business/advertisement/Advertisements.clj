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
;; package org.allbinary.business.advertisement

(ns Advertisements)

(JR/register 'Advertisements nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :bannerList nil)
  (JR/fset this :pageList nil)
  (JR/fset this :myRandomFactory nil)
    (JR/fset this :bannerList (BasicArrayListD/jnew_0))
    (JR/fset this :pageList (BasicArrayListD/jnew_0))
    (JR/fset this :myRandomFactory (JR/scall 'MyRandomFactory :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'Advertisements)] (jinit_0 o) o))

    
(defn jm_addPage_1 [this p_advertisementProcessorInterface]
  (let [ l_advertisementProcessorInterface (volatile! p_advertisementProcessorInterface)]
        (if (not (JR/invoke (JR/fget this :pageList) :jm_contains_1 @l_advertisementProcessorInterface))
            (do
            (JR/invoke (JR/fget this :pageList) :jm_add_1 @l_advertisementProcessorInterface)))))

    
(defn jm_startRandomPage_0 [this]
  (let [ l_size (volatile! nil) l_random (volatile! nil) l_advertisementProcessorInterface (volatile! nil)]
        (vreset! l_size (JR/invoke (JR/fget this :pageList) :jm_size_0))
        (if (> @l_size 0)
            (do
            (vreset! l_random (JR/invoke (JR/fget this :myRandomFactory) :jm_getAbsoluteNextInt_1 @l_size))
            (vreset! l_advertisementProcessorInterface (JR/aget* (JR/fget (JR/fget this :pageList) :objectArray) @l_random))
            (JR/invoke @l_advertisementProcessorInterface :jm_start_0)))))

    
(defn jm_processRandomPage_0 [this]
  (let [ l_size (volatile! nil) l_random (volatile! nil) l_advertisementProcessorInterface (volatile! nil)]
        (if (JR/invoke (JR/scall 'LockedUtil :jm_getInstance_0) :jm_isLocked_0)
            (do
            (vreset! l_size (JR/invoke (JR/fget this :pageList) :jm_size_0))
            (if (> @l_size 0)
                (do
                (vreset! l_random (JR/invoke (JR/fget this :myRandomFactory) :jm_getAbsoluteNextInt_1 @l_size))
                (vreset! l_advertisementProcessorInterface (JR/aget* (JR/fget (JR/fget this :pageList) :objectArray) @l_random))
                (JR/invoke @l_advertisementProcessorInterface :jm_process_0)))))))

    
(defn jm_stopAllPage_0 [this]
  (let [ l_advertisementProcessorInterface (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (JR/invoke (JR/fget this :pageList) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_advertisementProcessorInterface (JR/aget* (JR/fget (JR/fget this :pageList) :objectArray) @l_index))
            (JR/invoke @l_advertisementProcessorInterface :jm_stop_0)))))

    
(defn jm_addBanner_1 [this p_advertisementProcessorInterface]
  (let [ l_advertisementProcessorInterface (volatile! p_advertisementProcessorInterface)]
        (if (not (JR/invoke (JR/fget this :bannerList) :jm_contains_1 @l_advertisementProcessorInterface))
            (do
            (JR/invoke (JR/fget this :bannerList) :jm_add_1 @l_advertisementProcessorInterface)))))

    
(defn jm_startAll_0 [this]
  (let [ l_advertisementProcessorInterface (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (JR/invoke (JR/fget this :bannerList) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_advertisementProcessorInterface (JR/aget* (JR/fget (JR/fget this :bannerList) :objectArray) @l_index))
            (JR/invoke @l_advertisementProcessorInterface :jm_start_0)))))

    
(defn jm_stopAllBanner_0 [this]
  (let [ l_advertisementProcessorInterface (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (JR/invoke (JR/fget this :bannerList) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_advertisementProcessorInterface (JR/aget* (JR/fget (JR/fget this :bannerList) :objectArray) @l_index))
            (JR/invoke @l_advertisementProcessorInterface :jm_stop_0)))))

    
(defn jm_getBanner_1 [this p_index]
  (let [ l_index (volatile! p_index) l_advertisementProcessorInterface (volatile! nil)]
        (vreset! l_advertisementProcessorInterface (JR/aget* (JR/fget (JR/fget this :bannerList) :objectArray) @l_index))
        @l_advertisementProcessorInterface))

    
(defn jm_stopAll_0 [this]
  (let []
        (JR/invoke this :jm_stopAllBanner_0)
        (JR/invoke this :jm_stopAllPage_0)))



