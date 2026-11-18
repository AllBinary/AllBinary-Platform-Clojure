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
;; package org.allbinary.input.motion.gesture

(ns MotionGestureInput)

(JR/register 'MotionGestureInput 'Input '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_id p_name]
  (let [ l_id (volatile! p_id) l_name (volatile! p_name) l_inputFactory (volatile! nil)]
        (Input/jinit_2 this @l_id @l_name) (jinitfields this)
        (vreset! l_inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
        (JR/invoke @l_inputFactory :jm_add_2 (JR/invoke this :jm_getId_0) this))
  this)

(defn jnew_2 [p_id p_name ]
  (let [o (JR/alloc 'MotionGestureInput)] (jinit_2 o p_id p_name) o))



