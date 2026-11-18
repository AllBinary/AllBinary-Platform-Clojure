;; Generated Code Do Not Modify
;; package org.allbinary.animation.vector

(ns ARectangleFilledAnimation)

(JR/register 'ARectangleFilledAnimation 'RectangleFilledAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :x 0)
  (JR/fset this :y 0)
  this)

    
(defn jinit_0 [this]
  (let []
        (RectangleFilledAnimation/jinit_3 this 0 0 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ARectangleFilledAnimation)] (jinit_0 o) o))

    
(defn jm_nextFrame_0 [this]
  (let []
        nil))

    
(defn jm_paintXY_3 [this p_graphics p_unusedX p_unusedY]
  (let [ l_graphics (volatile! p_graphics) l_unusedX (volatile! p_unusedX) l_unusedY (volatile! p_unusedY)]
        (JR/invoke-super 'RectangleFilledAnimation this :jm_paintXY_3 @l_graphics (JR/fget this :x) (JR/fget this :y))))



