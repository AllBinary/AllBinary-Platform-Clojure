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
;; package org.allbinary.animation.compound

(ns SimultaneousCompoundIndexedAnimation)

(JR/register 'SimultaneousCompoundIndexedAnimation 'IndexedAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationInterfaceArray nil)
  this)

    
(defn jinit_2 [this p_animationInterfaceArray p_animationBehavior]
  (let [ l_animationInterfaceArray (volatile! p_animationInterfaceArray) l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/fset this :animationInterfaceArray @l_animationInterfaceArray))
  this)

(defn jnew_2 [p_animationInterfaceArray p_animationBehavior ]
  (let [o (JR/alloc 'SimultaneousCompoundIndexedAnimation)] (jinit_2 o p_animationInterfaceArray p_animationBehavior) o))

    
(defn jm_setFrame_1 [this p_frameIndex]
  (let [ l_frameIndex (volatile! p_frameIndex) l_indexedAnimation (volatile! nil) l_index (volatile! nil)]
        (vreset! l_indexedAnimation nil)
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_indexedAnimation (JR/aget* (JR/fget this :animationInterfaceArray) @l_index))
            (JR/invoke @l_indexedAnimation :jm_setFrame_1 @l_frameIndex)))))

    
(defn jm_getFrame_0 [this]
  (let [ l_indexedAnimation (volatile! nil)]
        (vreset! l_indexedAnimation (JR/aget* (JR/fget this :animationInterfaceArray) 0))
        (JR/invoke @l_indexedAnimation :jm_getFrame_0)))

    
(defn jm_getSize_0 [this]
  (let [ l_indexedAnimation (volatile! nil)]
        (vreset! l_indexedAnimation (JR/aget* (JR/fget this :animationInterfaceArray) 0))
        (JR/invoke @l_indexedAnimation :jm_getSize_0)))

    
(defn jm_previousFrame_0 [this]
  (let [ l_indexedAnimation (volatile! nil) l_index (volatile! nil)]
        (vreset! l_indexedAnimation nil)
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_indexedAnimation (JR/aget* (JR/fget this :animationInterfaceArray) @l_index))
            (JR/invoke @l_indexedAnimation :jm_previousFrame_0)))))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_nextFrame_0 [this]
  (let [ l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :animationInterfaceArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_nextFrame_0)))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/alen (JR/fget this :animationInterfaceArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_paintXY_3 @l_graphics @l_x @l_y)))))

    
(defn jm_paintThreedXYZ_4 [this p_graphics p_x p_y p_z]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/alen (JR/fget this :animationInterfaceArray)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_paintThreedXYZ_4 @l_graphics @l_x @l_y @l_z)))))

    
(defn jm_getAnimationInterfaceArray_0 [this]
  (let []
        (JR/fget this :animationInterfaceArray)))

    
(defn jm_setAnimationInterfaceArray_1 [this p_animationInterfaceArray]
  (let [ l_animationInterfaceArray (volatile! p_animationInterfaceArray)]
        (JR/fset this :animationInterfaceArray @l_animationInterfaceArray)))



