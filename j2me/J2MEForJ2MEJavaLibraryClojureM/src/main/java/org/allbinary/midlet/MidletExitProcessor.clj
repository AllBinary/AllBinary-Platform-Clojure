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
;; package org.allbinary.midlet

(ns MidletExitProcessor)

(JR/register 'MidletExitProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :midlet nil)
  this)

    
(defn jinit_1 [this p_midlet]
  (let [ l_midlet (volatile! p_midlet)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :midlet @l_midlet))
  this)

(defn jnew_1 [p_midlet ]
  (let [o (JR/alloc 'MidletExitProcessor)] (jinit_1 o p_midlet) o))

    
(defn jm_process_0 [this]
  (let []
        nil))



