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
;; package org.allbinary.input.motion.gesture.configuration

(ns MotionGestureConfiguration)

(JR/register 'MotionGestureConfiguration nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :diagonalMotionGestureAllowed false)
  (JR/fset this :diagonalTolerance 0)
  (JR/fset this :minimumMotionGesture 0)
  (JR/fset this :button nil)
  (JR/fset this :color nil)
  (JR/fset this :executingActions false)
  (JR/fset this :mouseButtonMask 0)
  (JR/fset this :activeCommands nil)
    (JR/fset this :diagonalMotionGestureAllowed true)
    (JR/fset this :diagonalTolerance 7)
    (JR/fset this :minimumMotionGesture 9)
    (JR/fset this :button (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :color (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLUE))
    (JR/fset this :executingActions true)
    (JR/fset this :mouseButtonMask 0)
    (JR/fset this :activeCommands (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MotionGestureConfiguration)] (jinit_0 o) o))

    
(defn jm_addMotionGestureAction_2 [this p_list p_commandAction]
  (let [ l_list (volatile! p_list) l_commandAction (volatile! p_commandAction)]
        (JR/invoke (JR/fget this :activeCommands) :jm_add_1 (MotionGestureToMotionGestureActionAssociation/jnew_2 @l_list @l_commandAction))))

    
(defn jm_clearMotionGestureAction_0 [this]
  (let []
        (JR/invoke (JR/fget this :activeCommands) :jm_clear_0)))

    
(defn jm_getAssociateCommandActionsList_0 [this]
  (let []
        (JR/fget this :activeCommands)))

    
(defn jm_isDiagonalMotionGestureAllowed_0 [this]
  (let []
        (JR/fget this :diagonalMotionGestureAllowed)))

    
(defn jm_isExecutingActionsAllowed_0 [this]
  (let []
        (JR/fget this :executingActions)))

    
(defn jm_setExecutingActionsAllowed_1 [this p_executingActionAllowed]
  (let [ l_executingActionAllowed (volatile! p_executingActionAllowed)]
        (JR/fset this :executingActions @l_executingActionAllowed)))

    
(defn jm_setDiagonalMotionGestureAllowed_1 [this p_diagonalMotionGestureAllowed]
  (let [ l_diagonalMotionGestureAllowed (volatile! p_diagonalMotionGestureAllowed)]
        (JR/fset this :diagonalMotionGestureAllowed @l_diagonalMotionGestureAllowed)))

    
(defn jm_getDiagonalTolerance_0 [this]
  (let []
        (JR/fget this :diagonalTolerance)))

    
(defn jm_setDiagonalTolerance_1 [this p_diagonalTolerance]
  (let [ l_diagonalTolerance (volatile! p_diagonalTolerance)]
        (JR/fset this :diagonalTolerance @l_diagonalTolerance)))

    
(defn jm_getMinimumMotionGesture_0 [this]
  (let []
        (JR/fget this :minimumMotionGesture)))

    
(defn jm_setMinimumMotionGesture_1 [this p_minimumMotionGesture]
  (let [ l_minimumMotionGesture (volatile! p_minimumMotionGesture)]
        (JR/fset this :minimumMotionGesture @l_minimumMotionGesture)))

    
(defn jm_getButton_0 [this]
  (let []
        (JR/fget this :button)))

    
(defn jm_setButton_1 [this p_button]
  (let [ l_button (volatile! p_button)]
        (JR/fset this :button @l_button)))

    
(defn jm_getColor_0 [this]
  (let []
        (JR/fget this :color)))

    
(defn jm_setColor_1 [this p_color]
  (let [ l_color (volatile! p_color)]
        (JR/fset this :color @l_color)))

    
(defn jm_getMouseButtonMask_0 [this]
  (let []
        (JR/fget this :mouseButtonMask)))

    
(defn jm_setMouseButtonMask_1 [this p_mouseButtonMask]
  (let [ l_mouseButtonMask (volatile! p_mouseButtonMask)]
        (JR/fset this :mouseButtonMask @l_mouseButtonMask)))



