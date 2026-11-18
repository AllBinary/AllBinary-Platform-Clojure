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
;; package org.allbinary.graphics.displayable.screen

(ns ScreenRepaintProcessor)

(JR/register 'ScreenRepaintProcessor 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayable nil)
  this)

    
(defn jinit_1 [this p_displayable]
  (let [ l_displayable (volatile! p_displayable)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :displayable @l_displayable))
  this)

(defn jnew_1 [p_displayable ]
  (let [o (JR/alloc 'ScreenRepaintProcessor)] (jinit_1 o p_displayable) o))

    
(defn jm_process_0 [this]
  (let []
        (JR/scall 'ScreenRepaintUtil :jm_repaint_1 (JR/fget this :displayable))))



