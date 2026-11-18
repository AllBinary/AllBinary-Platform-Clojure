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
;; package org.allbinary.graphics

(ns Line)

(JR/register 'Line nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :p1 nil)
  (JR/fset this :p2 nil)
  (JR/fset this :deltaX 0.0)
  (JR/fset this :deltaY 0.0)
  this)

    
(defn jinit_2 [this p_p1 p_p2]
  (let [ l_p1 (volatile! p_p1) l_p2 (volatile! p_p2)]
    nil (jinitfields this)
        (JR/fset this :p1 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO))
        (JR/fset this :p2 (JR/fget this :p1))
        (JR/invoke this :jm_setP1_1 @l_p1)
        (JR/invoke this :jm_setP2_1 @l_p2))
  this)

(defn jnew_2 [p_p1 p_p2 ]
  (let [o (JR/alloc 'Line)] (jinit_2 o p_p1 p_p2) o))

    
(defn jm_getGradient_0 [this]
  (let []
        (/ (double (JR/invoke this :jm_getDeltaY_0)) (JR/invoke this :jm_getDeltaX_0))))

    
(defn jm_update_0 [this]
  (let []
        (JR/fset this :deltaX (- (double (JR/c2i (JR/invoke (JR/invoke this :jm_getP1_0) :jm_getX_0))) (double (JR/c2i (JR/invoke (JR/invoke this :jm_getP2_0) :jm_getX_0)))))
        (JR/fset this :deltaY (- (double (JR/c2i (JR/invoke (JR/invoke this :jm_getP1_0) :jm_getY_0))) (double (JR/c2i (JR/invoke (JR/invoke this :jm_getP2_0) :jm_getY_0)))))))

    
(defn jm_getDeltaX_0 [this]
  (let []
        (JR/fget this :deltaX)))

    
(defn jm_getDeltaY_0 [this]
  (let []
        (JR/fget this :deltaY)))

    
(defn jm_getP1_0 [this]
  (let []
        (JR/fget this :p1)))

    
(defn jm_getP2_0 [this]
  (let []
        (JR/fget this :p2)))

    
(defn jm_setP1_1 [this p_p1]
  (let [ l_p1 (volatile! p_p1)]
        (JR/fset this :p1 @l_p1)
        (JR/invoke this :jm_update_0)))

    
(defn jm_setP2_1 [this p_p2]
  (let [ l_p2 (volatile! p_p2)]
        (JR/fset this :p2 @l_p2)
        (JR/invoke this :jm_update_0)))



