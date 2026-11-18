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
;; package org.allbinary.animation.vector

(ns LineAnimation)

(JR/register 'LineAnimation 'Animation '[ColorCompositeInterface PositionInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :newLine nil)
  (JR/fset this :tempLine nil)
  (JR/fset this :line nil)
    (JR/fset this :newLine (JR/anew "INT" 2 2 2))
    (JR/fset this :tempLine (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY_ARRAY))
    (JR/fset this :line (JR/anew "INT" 2 2 2))
  this)

    
(defn jinit_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
    (Animation/jinit_0 this) (jinitfields this)
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor))
  this)

(defn jnew_1 [p_basicColor ]
  (let [o (JR/alloc 'LineAnimation)] (jinit_1 o p_basicColor) o))

    
(defn jm_init_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/aset* (JR/aget* (JR/fget this :newLine) 0) 0 @l_x)
        (JR/aset* (JR/aget* (JR/fget this :newLine) 0) 1 @l_y)
        (JR/aset* (JR/aget* (JR/fget this :newLine) 1) 0 @l_x)
        (JR/aset* (JR/aget* (JR/fget this :newLine) 1) 1 @l_y)
        (JR/fset this :tempLine (JR/fget this :line))
        (JR/fset this :line (JR/fget this :newLine))
        (JR/fset this :newLine (JR/fget this :tempLine))))

    
(defn jm_setPosition_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/aset* (JR/aget* (JR/fget this :newLine) 0) 0 (JR/aget* (JR/aget* (JR/fget this :line) 1) 0))
        (JR/aset* (JR/aget* (JR/fget this :newLine) 0) 1 (JR/aget* (JR/aget* (JR/fget this :line) 1) 1))
        (JR/aset* (JR/aget* (JR/fget this :newLine) 1) 0 @l_x)
        (JR/aset* (JR/aget* (JR/fget this :newLine) 1) 1 @l_y)
        (JR/fset this :tempLine (JR/fget this :line))
        (JR/fset this :line (JR/fget this :newLine))
        (JR/fset this :newLine (JR/fget this :tempLine))))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_currentLine (volatile! nil)]
        (vreset! l_currentLine (JR/fget this :line))
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/invoke this :jm_getBasicColorP_0) (JR/invoke this :jm_getColor_0))
        (JR/invoke @l_graphics :jm_drawLine_4 (JR/aget* (JR/aget* @l_currentLine 0) 0) (JR/aget* (JR/aget* @l_currentLine 0) 1) (JR/aget* (JR/aget* @l_currentLine 1) 0) (JR/aget* (JR/aget* @l_currentLine 1) 1))))

    
(defn jm_nextFrame_0 [this]
  (let []
        nil))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/invoke-super 'Animation this :jm_getBasicColorP_0)))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/invoke-super 'Animation this :jm_setBasicColorP_1 @l_basicColor)))



