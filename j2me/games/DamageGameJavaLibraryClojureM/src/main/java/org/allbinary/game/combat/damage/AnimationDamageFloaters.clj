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
;; package org.allbinary.game.combat.damage

(ns AnimationDamageFloaters)

(JR/register 'AnimationDamageFloaters 'DamageFloaters '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :layerInterface nil)
  (JR/fset this :animationInterfaceArray nil)
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_4 [this p_layerInterface p_animationInterfaceArray p_dx p_dy]
  (let [ l_layerInterface (volatile! p_layerInterface) l_animationInterfaceArray (volatile! p_animationInterfaceArray) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_index (volatile! nil)]
    (DamageFloaters/jinit_0 this) (jinitfields this)
        (JR/fset this :animationInterfaceArray @l_animationInterfaceArray)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :animationInterfaceArray)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_setFrame_1 (unchecked-int (unchecked-subtract (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_index) :jm_getSize_0) 1)))))
        (JR/fset this :layerInterface @l_layerInterface)
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/alen (JR/fget this :animationInterfaceArray))))
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy))
  this)

(defn jnew_4 [p_layerInterface p_animationInterfaceArray p_dx p_dy ]
  (let [o (JR/alloc 'AnimationDamageFloaters)] (jinit_4 o p_layerInterface p_animationInterfaceArray p_dx p_dy) o))

    
(defn jm_add_1 [this p_damage]
  (let [ l_damage (volatile! p_damage) l_i (volatile! nil)]
        (vreset! l_i (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (JR/invoke (JR/aget* (JR/fget this :animationInterfaceArray) @l_i) :jm_setFrame_1 0)
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_viewPosition (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_animationInterface (volatile! nil) l_delta (volatile! nil) l_index (volatile! nil) l_commonStrings (volatile! nil) l_canvasStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_viewPosition (JR/invoke (JR/fget this :layerInterface) :jm_getViewPosition_0))
            (vreset! l_x (JR/invoke @l_viewPosition :jm_getX_0))
            (vreset! l_y (JR/invoke @l_viewPosition :jm_getY_0))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index (JR/alen (JR/fget this :animationInterfaceArray))) (do (JR/vinc l_index 1 :int false))
                (vreset! l_animationInterface (JR/aget* (JR/fget this :animationInterfaceArray) @l_index))
                (if (< (JR/invoke @l_animationInterface :jm_getFrame_0) (unchecked-int (unchecked-subtract (JR/invoke @l_animationInterface :jm_getAnimationSize_0) 1)))
                    (do
                    (vreset! l_delta (unchecked-int (unchecked-multiply (JR/invoke @l_animationInterface :jm_getFrame_0) 20)))
                    (JR/invoke @l_animationInterface :jm_paintXY_3 @l_graphics (unchecked-int (unchecked-add @l_x (JR/fget this :dx))) (unchecked-int (unchecked-add (unchecked-int (unchecked-subtract @l_y @l_delta)) (JR/fget this :dy))))
                    (JR/invoke @l_animationInterface :jm_nextFrame_0))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (vreset! l_canvasStrings (JR/scall 'CanvasStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_canvasStrings :PAINT) @l_e)) :else (throw jt)))))))



