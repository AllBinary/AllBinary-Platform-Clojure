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
;; package org.allbinary.bounds

(ns TopULayerBounds)

(JR/register 'TopULayerBounds 'LayerBounds '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_rectangle]
  (let [ l_rectangle (volatile! p_rectangle)]
        (LayerBounds/jinit_1 this @l_rectangle) (jinitfields this))
  this)

(defn jnew_1 [p_rectangle ]
  (let [o (JR/alloc 'TopULayerBounds)] (jinit_1 o p_rectangle) o))

    
(defn jm_visit_1 [this p_boundsVisitorInterface]
  (let [ l_boundsVisitorInterface (volatile! p_boundsVisitorInterface)]
        (if (> (JR/invoke @l_boundsVisitorInterface :jm_getX_0) (JR/invoke (JR/fget this :rectangle) :jm_getMaxX_0))
            (do
            (JR/invoke @l_boundsVisitorInterface :jm_maxX_0)))
        (if (< (JR/invoke @l_boundsVisitorInterface :jm_getX_0) (JR/invoke (JR/invoke (JR/fget this :rectangle) :jm_getPoint_0) :jm_getX_0))
            (do
            (JR/invoke @l_boundsVisitorInterface :jm_minX_0)))
        (if (< (JR/invoke @l_boundsVisitorInterface :jm_getY_0) (JR/invoke (JR/invoke (JR/fget this :rectangle) :jm_getPoint_0) :jm_getY_0))
            (do
            (JR/invoke @l_boundsVisitorInterface :jm_minY_0)))))



