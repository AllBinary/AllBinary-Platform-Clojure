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
;; package org.allbinary.bounds.event

(ns BoundsChangeEvent)

(JR/register 'BoundsChangeEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_rectangle]
  (let [ l_rectangle (volatile! p_rectangle)]
        (AllBinaryEventObject/jinit_1 this @l_rectangle) (jinitfields this))
  this)

(defn jnew_1 [p_rectangle ]
  (let [o (JR/alloc 'BoundsChangeEvent)] (jinit_1 o p_rectangle) o))

    
(defn jm_getRectangle_0 [this]
  (let []
        (JR/invoke this :jm_getSource_0)))



