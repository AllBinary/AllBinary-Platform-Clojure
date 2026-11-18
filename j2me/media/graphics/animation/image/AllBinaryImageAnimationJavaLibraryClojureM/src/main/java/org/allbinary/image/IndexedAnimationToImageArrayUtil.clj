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
;; package org.allbinary.image

(ns IndexedAnimationToImageArrayUtil)

(JR/register 'IndexedAnimationToImageArrayUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'IndexedAnimationToImageArrayUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_3 [p_width p_height p_sequentialAnimationInterface]
  (let [this nil l_width (volatile! p_width) l_height (volatile! p_height) l_sequentialAnimationInterface (volatile! p_sequentialAnimationInterface) l_size (volatile! nil) l_imageArray (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke @l_sequentialAnimationInterface :jm_getAnimationSize_0))
        (vreset! l_imageArray (JR/anew "Object" 1 @l_size))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_sequentialAnimationInterface :jm_setFrame_1 @l_index)
            (JR/aset* @l_imageArray @l_index (JR/invoke (JR/scall 'AnimationFrameToImageUtil :jm_getInstance_0) :jm_getInstanceWH_3 @l_width @l_height @l_sequentialAnimationInterface))))
        @l_imageArray))



