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
;; package org.allbinary.canvas

(ns RunnableCanvasRefreshHelper)

(JR/register 'RunnableCanvasRefreshHelper 'Processor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :runnableCanvas nil)
  this)

    
(defn jinit_1 [this p_runnableCanvas]
  (let [ l_runnableCanvas (volatile! p_runnableCanvas)]
    (Processor/jinit_0 this) (jinitfields this)
        (JR/fset this :runnableCanvas @l_runnableCanvas))
  this)

(defn jnew_1 [p_runnableCanvas ]
  (let [o (JR/alloc 'RunnableCanvasRefreshHelper)] (jinit_1 o p_runnableCanvas) o))

    
(defn jm_process_0 [this]
  (let []
        (JR/invoke (JR/fget this :runnableCanvas) :jm_repaint_0)))



