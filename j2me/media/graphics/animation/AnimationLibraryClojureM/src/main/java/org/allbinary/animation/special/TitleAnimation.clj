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
;; package org.allbinary.animation.special

(ns TitleAnimation)

(JR/register 'TitleAnimation 'SpecialAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :systemWrapper nil)
  (JR/fset this :deltaX 0.0)
  (JR/fset this :deltaY 0.0)
  (JR/fset this :deltaZ 0.0)
  (JR/fset this :basicColorArray nil)
  (JR/fset this :dxArray nil)
  (JR/fset this :dyArray nil)
  (JR/fset this :widthP 0)
  (JR/fset this :animationInterfaceArray nil)
  (JR/fset this :sizeP 0)
  (JR/fset this :y 0)
  (JR/fset this :lastFrameStartTime 0)
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :CLEAR_COLOR nil)
    (JR/fset this :systemWrapper (JR/scall 'ABSystemWrapper :jm_getInstance_0))
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :CLEAR_COLOR (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :CLEAR_COLOR))
  this)

    
(defn jm_createAnimation_6 [p_animationInterfaceArray p_basicColorArray p_dxArray p_dyArray p_y p_width]
  (let [this nil l_animationInterfaceArray (volatile! p_animationInterfaceArray) l_basicColorArray (volatile! p_basicColorArray) l_dxArray (volatile! p_dxArray) l_dyArray (volatile! p_dyArray) l_y (volatile! p_y) l_width (volatile! p_width)]
        (TitleAnimation/jnew_7 @l_animationInterfaceArray @l_basicColorArray @l_dxArray @l_dyArray @l_y @l_width (IndexedAnimationBehavior/jnew_2 1 250))))

    
(defn jinit_7 [this p_animationInterfaceArray p_basicColorArray p_dxArray p_dyArray p_y p_width p_animationBehavior]
  (let [ l_animationInterfaceArray (volatile! p_animationInterfaceArray) l_basicColorArray (volatile! p_basicColorArray) l_dxArray (volatile! p_dxArray) l_dyArray (volatile! p_dyArray) l_y (volatile! p_y) l_width (volatile! p_width) l_animationBehavior (volatile! p_animationBehavior)]
        (SpecialAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/fset this :lastFrameStartTime (JR/invoke (JR/fget this :systemWrapper) :jm_currentTimeMillis_0))
        (JR/fset this :animationInterfaceArray @l_animationInterfaceArray)
        (JR/fset this :sizeP (JR/alen (JR/fget this :animationInterfaceArray)))
        (JR/fset this :basicColorArray @l_basicColorArray)
        (JR/fset this :dxArray @l_dxArray)
        (JR/fset this :dyArray @l_dyArray)
        (JR/fset this :y @l_y)
        (JR/fset this :widthP @l_width)
        (JR/invoke this :jm_reset_0))
  this)

(defn jnew_7 [p_animationInterfaceArray p_basicColorArray p_dxArray p_dyArray p_y p_width p_animationBehavior ]
  (let [o (JR/alloc 'TitleAnimation)] (jinit_7 o p_animationInterfaceArray p_basicColorArray p_dxArray p_dyArray p_y p_width p_animationBehavior) o))

    
(defn jm_nextFrame_0 [this]
  (let [ l_currentTime (volatile! nil) l_totalTimeElapsed (volatile! nil) l_indexedAnimationBehavior (volatile! nil)]
        (vreset! l_currentTime (JR/invoke (JR/fget this :systemWrapper) :jm_currentTimeMillis_0))
        (vreset! l_totalTimeElapsed (unchecked-subtract @l_currentTime (JR/fget this :lastFrameStartTime)))
        (vreset! l_indexedAnimationBehavior (JR/invoke this :jm_getAnimationBehavior_0))
        (if (> @l_totalTimeElapsed (JR/fget @l_indexedAnimationBehavior :frameDelayTime))
            (do
            (JR/invoke this :jm_previousFrame_0)
            (JR/fset this :lastFrameStartTime @l_currentTime)))
        (if (JR/eq (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) 0) :jm_getFrame_0) 0)
            (do
            (JR/finc @l_indexedAnimationBehavior :loopIndex 1 :int false)))))

    
(defn jm_isComplete_0 [this]
  (let [ l_indexedAnimationBehavior (volatile! nil)]
        (vreset! l_indexedAnimationBehavior (JR/invoke this :jm_getAnimationBehavior_0))
        (if (or (or (== (JR/fget @l_indexedAnimationBehavior :loopTotal) (unchecked-int (unchecked-negate (JR/c2i 1)))) (< (JR/fget @l_indexedAnimationBehavior :loopIndex) (JR/fget @l_indexedAnimationBehavior :loopTotal))) (not (== (JR/invoke this :jm_getFrame_0) 0)))
            (do
            false)
            (do
            true))))

    
(defn jm_setSequence_1 [this p_sequence]
  (let [ l_sequence (volatile! p_sequence)]
        nil))

    
(defn jm_getSequence_0 [this]
  (let []
        (JR/scall 'PrimitiveIntUtil :jm_getArrayInstance_0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) 0) :jm_getSize_0)))

    
(defn jm_getFrame_0 [this]
  (let []
        (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) 0) :jm_getFrame_0)))

    
(defn jm_setFrame_1 [this p_frame]
  (let [ l_frame (volatile! p_frame) l_index (volatile! nil)]
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :sizeP)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_setFrame_1 @l_frame)))))

    
(defn jm_setLastFrame_0 [this]
  (let []
        (JR/invoke this :jm_setFrame_1 (unchecked-int (unchecked-subtract (JR/invoke this :jm_getSize_0) 1)))))

    
(defn jm_reset_0 [this]
  (let [ l_indexedAnimationBehavior (volatile! nil)]
        (JR/invoke this :jm_setLastFrame_0)
        (vreset! l_indexedAnimationBehavior (JR/invoke this :jm_getAnimationBehavior_0))
        (JR/invoke @l_indexedAnimationBehavior :jm_reset_0)))

    
(defn jm_previousFrame_0 [this]
  (let [ l_index (volatile! nil)]
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :sizeP)) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_previousFrame_0)))))

    
(defn jm_paintFrameXY_4 [this p_graphics p_frame p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_frame (volatile! p_frame) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke this :jm_setFrame_1 @l_frame)
        (JR/invoke this :jm_paintXY_3 @l_graphics @l_x @l_y)))

    
(defn jm_paintXY_3 [this p_graphics p_ax p_ay]
  (let [ l_graphics (volatile! p_graphics) l_ax (volatile! p_ax) l_ay (volatile! p_ay) l_x (volatile! nil) l_deltaX (volatile! nil) l_deltaY (volatile! nil) l_index (volatile! nil)]
        (vreset! l_x 0)
        (if (not (== (JR/fget this :widthP) java.lang.Integer/MIN_VALUE))
            (do
            (vreset! l_x (JR/idiv (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0) (JR/fget this :widthP))) 2))))
        (vreset! l_deltaX 0)
        (vreset! l_deltaY 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :sizeP)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_deltaX (unchecked-int (unchecked-add (JR/aget* (JR/fget this :dxArray) @l_index) @l_x)))
            (vreset! l_deltaY (unchecked-int (unchecked-add (JR/aget* (JR/fget this :dyArray) @l_index) (JR/fget this :y))))
            (if (not (JR/eq (JR/aget* (JR/fget this :basicColorArray) @l_index) (JR/fget this :CLEAR_COLOR)))
                (do
                (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/aget* (JR/fget this :basicColorArray) @l_index))))
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_paintXY_3 @l_graphics @l_deltaX @l_deltaY)))))



