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
;; package org.allbinary.input.event

(ns VirtualKeyboardEvent)

(JR/register 'VirtualKeyboardEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (AllBinaryEventObject/jinit_1 this @l_anyType) (jinitfields this))
  this)

(defn jnew_1 [p_anyType ]
  (let [o (JR/alloc 'VirtualKeyboardEvent)] (jinit_1 o p_anyType) o))



