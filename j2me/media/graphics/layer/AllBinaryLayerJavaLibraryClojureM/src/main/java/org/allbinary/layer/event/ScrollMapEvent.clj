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
;; package org.allbinary.layer.event

(ns ScrollMapEvent)

(JR/register 'ScrollMapEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  this)

    
(defn jinit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (AllBinaryEventObject/jinit_1 this @l_anyType) (jinitfields this))
  this)

(defn jnew_1 [p_anyType ]
  (let [o (JR/alloc 'ScrollMapEvent)] (jinit_1 o p_anyType) o))

    
(defn jm_setDx_1 [this p_dx]
  (let [ l_dx (volatile! p_dx)]
        (JR/fset this :dx @l_dx)))

    
(defn jm_getDx_0 [this]
  (let []
        (JR/fget this :dx)))

    
(defn jm_setDy_1 [this p_dy]
  (let [ l_dy (volatile! p_dy)]
        (JR/fset this :dy @l_dy)))

    
(defn jm_getDy_0 [this]
  (let []
        (JR/fget this :dy)))

    
(defn jm_setDxDy_2 [this p_dx p_dy]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy)]
        (JR/fset this :dx @l_dx)
        (JR/fset this :dy @l_dy)))



