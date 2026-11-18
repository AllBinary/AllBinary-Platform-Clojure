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
;; package org.allbinary.input.motion.button

(ns BasicTouchButtonCellPositionFactory)

(JR/register 'BasicTouchButtonCellPositionFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :TOP_RIGHT nil)
  (JR/fset this :TOP_LEFT nil)
  (JR/fset this :SECOND_FROM_TOP_LEFT nil)
  (JR/fset this :SECOND_FROM_TOP_RIGHT nil)
  (JR/fset this :TOP_SECOND_FROM_LEFT nil)
  (JR/fset this :TOP_SECOND_FROM_RIGHT nil)
  (JR/fset this :BOTTOM_RIGHT nil)
  (JR/fset this :BOTTOM_SECOND_FROM_RIGHT nil)
  (JR/fset this :SECOND_FROM_BOTTOM_RIGHT nil)
  (JR/fset this :THIRD_FROM_BOTTOM_RIGHT nil)
  (JR/fset this :FOURTH_FROM_BOTTOM_RIGHT nil)
  (JR/fset this :SECOND_FROM_BOTTOM_SECOND_FROM_RIGHT nil)
  (JR/fset this :SECOND_FROM_BOTTOM_THIRD_FROM_RIGHT nil)
  (JR/fset this :SECOND_FROM_BOTTOM_FOURTH_FROM_RIGHT nil)
  (JR/fset this :BOTTOM_THIRD_FROM_RIGHT nil)
  (JR/fset this :BOTTOM_FOURTH_FROM_RIGHT nil)
  (JR/fset this :BOTTOM_SECOND_FROM_LEFT nil)
  (JR/fset this :SECOND_FROM_BOTTOM_LEFT nil)
  (JR/fset this :THIRD_FROM_BOTTOM_LEFT nil)
  (JR/fset this :BOTTOM_LEFT nil)
  (JR/fset this :SECOND_FROM_BOTTOM_SECOND_FROM_LEFT nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let [ l_touchButtonLocationHelper (volatile! nil) l_cellPositionFactory (volatile! nil)]
    nil (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (vreset! l_touchButtonLocationHelper (TouchButtonLocationHelper/jnew_0))
        (vreset! l_cellPositionFactory (JR/scall 'CellPositionFactory :jm_getInstance_0))
        (JR/invoke @l_cellPositionFactory :jm_init_2 (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0))
        (JR/fset this :TOP_LEFT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 0 0))
        (JR/fset this :TOP_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 1)) 0))
        (JR/fset this :BOTTOM_LEFT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 0 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 1))))
        (JR/fset this :BOTTOM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 1)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 1))))
        (JR/fset this :BOTTOM_SECOND_FROM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 2)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 1))))
        (JR/fset this :SECOND_FROM_BOTTOM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 1)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 2))))
        (JR/fset this :SECOND_FROM_BOTTOM_SECOND_FROM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 2)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 2))))
        (JR/fset this :BOTTOM_SECOND_FROM_LEFT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 1 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 1))))
        (JR/fset this :SECOND_FROM_BOTTOM_LEFT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 0 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 2))))
        (JR/fset this :SECOND_FROM_BOTTOM_SECOND_FROM_LEFT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 1 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 2))))
        (if (> (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 2)
            (do
            (JR/fset this :SECOND_FROM_TOP_LEFT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 0 1))
            (JR/fset this :SECOND_FROM_TOP_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 1)) 1)))
            (do
            (JR/fset this :SECOND_FROM_TOP_LEFT (JR/fget @l_cellPositionFactory :NONE))
            (JR/fset this :SECOND_FROM_TOP_RIGHT (JR/fget @l_cellPositionFactory :NONE))))
        (if (>= (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 4)
            (do
            (JR/fset this :THIRD_FROM_BOTTOM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 1)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 3))))
            (JR/fset this :FOURTH_FROM_BOTTOM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 1)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 4))))
            (JR/fset this :THIRD_FROM_BOTTOM_LEFT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 0 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 3)))))
            (do
            (JR/fset this :THIRD_FROM_BOTTOM_RIGHT (JR/fget @l_cellPositionFactory :NONE))
            (JR/fset this :FOURTH_FROM_BOTTOM_RIGHT (JR/fget @l_cellPositionFactory :NONE))
            (JR/fset this :THIRD_FROM_BOTTOM_LEFT (JR/fget @l_cellPositionFactory :NONE))))
        (if (>= (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 4)
            (do
            (JR/fset this :SECOND_FROM_BOTTOM_THIRD_FROM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 3)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 2))))
            (JR/fset this :SECOND_FROM_BOTTOM_FOURTH_FROM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 4)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 2))))
            (JR/fset this :BOTTOM_THIRD_FROM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 3)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 1))))
            (JR/fset this :BOTTOM_FOURTH_FROM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 4)) (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalRows_0) 1))))
            (JR/fset this :TOP_SECOND_FROM_LEFT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 1 0))
            (JR/fset this :TOP_SECOND_FROM_RIGHT (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 (unchecked-int (unchecked-subtract (JR/invoke @l_touchButtonLocationHelper :jm_getTotalColumns_0) 2)) 0)))
            (do
            (JR/fset this :SECOND_FROM_BOTTOM_THIRD_FROM_RIGHT (JR/fget @l_cellPositionFactory :NONE))
            (JR/fset this :SECOND_FROM_BOTTOM_FOURTH_FROM_RIGHT (JR/fget @l_cellPositionFactory :NONE))
            (JR/fset this :BOTTOM_THIRD_FROM_RIGHT (JR/fget @l_cellPositionFactory :NONE))
            (JR/fset this :BOTTOM_FOURTH_FROM_RIGHT (JR/fget @l_cellPositionFactory :NONE))
            (JR/fset this :TOP_SECOND_FROM_LEFT (JR/fget @l_cellPositionFactory :NONE))
            (JR/fset this :TOP_SECOND_FROM_RIGHT (JR/fget @l_cellPositionFactory :NONE)))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicTouchButtonCellPositionFactory)] (jinit_0 o) o))



