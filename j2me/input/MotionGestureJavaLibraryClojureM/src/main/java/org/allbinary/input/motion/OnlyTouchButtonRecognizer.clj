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
;; package org.allbinary.input.motion

(ns OnlyTouchButtonRecognizer)

(JR/register 'OnlyTouchButtonRecognizer 'MotionRecognizer '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :touchButtonRecognizer nil)
  (JR/fset this :touchButtonProcessing false)
    (JR/fset this :touchButtonProcessing false)
  this)

    
(defn jinit_0 [this]
  (let []
    (MotionRecognizer/jinit_0 this) (jinitfields this)
        (JR/fset this :touchButtonRecognizer (TouchButtonRecognizer/jnew_0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OnlyTouchButtonRecognizer)] (jinit_0 o) o))

    
(defn jm_processStartMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers)]
        (if (JR/invoke (JR/fget this :touchButtonRecognizer) :jm_pressTouchButtonInput_3 @l_x @l_y @l_deviceId)
            (do
            (JR/fset this :touchButtonProcessing true)))))

    
(defn jm_processEndMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers)]
        (if (JR/fget this :touchButtonProcessing)
            (do
            (JR/fset this :touchButtonProcessing false)))
        (if (JR/invoke (JR/fget this :touchButtonRecognizer) :jm_releaseTouchButtonInput_3 @l_x @l_y @l_deviceId)
            (do
            nil))))

    
(defn jm_processDraggedMotionEvent_4 [this p_x p_y p_deviceId p_modifiers]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_deviceId (volatile! p_deviceId) l_modifiers (volatile! p_modifiers)]
        (if (JR/fget this :touchButtonProcessing)
            (do
            (JR/invoke (JR/fget this :touchButtonRecognizer) :jm_pressTouchButtonInput_3 @l_x @l_y @l_deviceId)))))



