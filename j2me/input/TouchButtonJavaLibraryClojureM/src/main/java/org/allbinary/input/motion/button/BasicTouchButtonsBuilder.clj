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

(ns BasicTouchButtonsBuilder)

(JR/register 'BasicTouchButtonsBuilder 'BaseTouchInput '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  (BaseTouchInput/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicTouchButtonsBuilder)] (jinit_0 o) o))

    
(defn jm_getList_0 [this]
  (let [ l_list (volatile! nil) l_commonButtons (volatile! nil) l_touchButtonLocationHelper (volatile! nil) l_basicTouchButtonCellPositionFactory (volatile! nil) l_UP (volatile! nil) l_DOWN (volatile! nil) l_LEFT (volatile! nil) l_RIGHT (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
            (vreset! l_list (BasicArrayListD/jnew_0))
            (vreset! l_commonButtons (JR/scall 'CommonButtons :jm_getInstance_0))
            (vreset! l_touchButtonLocationHelper (TouchButtonLocationHelper/jnew_0))
            (vreset! l_basicTouchButtonCellPositionFactory (BasicTouchButtonCellPositionFactory/jnew_0))
            (vreset! l_UP (JR/scall 'TouchButton :jm_createButton_6 (JR/fget (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :UP) (JR/scall 'TouchButtonUpResource :jm_getInstance_0) (JR/fget @l_commonButtons :NORMAL_BUTTON) (JR/fget @l_basicTouchButtonCellPositionFactory :SECOND_FROM_BOTTOM_LEFT) (JR/invoke @l_touchButtonLocationHelper :jm_getColumnsRemainderHalf_0) (JR/invoke @l_touchButtonLocationHelper :jm_getRowsRemainderHalf_0)))
            (vreset! l_DOWN (JR/scall 'TouchButton :jm_createButton_6 (JR/fget (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :DOWN) (JR/scall 'TouchButtonDownResource :jm_getInstance_0) (JR/fget @l_commonButtons :NORMAL_BUTTON) (JR/fget @l_basicTouchButtonCellPositionFactory :BOTTOM_LEFT) (JR/invoke @l_touchButtonLocationHelper :jm_getColumnsRemainderHalf_0) (JR/invoke @l_touchButtonLocationHelper :jm_getRowsRemainderHalf_0)))
            (vreset! l_LEFT (JR/scall 'TouchButton :jm_createButton_6 (JR/fget (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :SPECIAL_BUTTON_FOUR) (JR/scall 'TouchButtonTurnLeftResource :jm_getInstance_0) (JR/fget @l_commonButtons :NORMAL_BUTTON) (JR/fget @l_basicTouchButtonCellPositionFactory :BOTTOM_SECOND_FROM_RIGHT) (JR/invoke @l_touchButtonLocationHelper :jm_getColumnsRemainderHalf_0) (JR/invoke @l_touchButtonLocationHelper :jm_getRowsRemainderHalf_0)))
            (vreset! l_RIGHT (JR/scall 'TouchButton :jm_createButton_6 (JR/fget (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :SPECIAL_BUTTON_THREE) (JR/scall 'TouchButtonTurnRightResource :jm_getInstance_0) (JR/fget @l_commonButtons :NORMAL_BUTTON) (JR/fget @l_basicTouchButtonCellPositionFactory :BOTTOM_RIGHT) (JR/invoke @l_touchButtonLocationHelper :jm_getColumnsRemainderHalf_0) (JR/invoke @l_touchButtonLocationHelper :jm_getRowsRemainderHalf_0)))
            (JR/invoke @l_list :jm_add_1 @l_UP)
            (JR/invoke @l_list :jm_add_1 @l_LEFT)
            (JR/invoke @l_list :jm_add_1 @l_RIGHT)
            (JR/invoke @l_list :jm_add_1 @l_DOWN)
            (JR/jreturn @l_list))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :GET_LIST) @l_e)
            (JR/jreturn (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))) :else (throw jt))))))))



