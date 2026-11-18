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
;; package org.allbinary.graphics.displayable

(ns BaseScalable)

(JR/register 'BaseScalable nil '[ScalableListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BaseScalable)] (jinit_0 o) o))

    
(defn jm_getRatio_1 [this p_ratio]
  (let [ l_ratio (volatile! p_ratio)]
        1.0))

    
(defn jm_getLeft_1 [this p_xOffset]
  (let [ l_xOffset (volatile! p_xOffset)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_getTop_1 [this p_yOffset]
  (let [ l_yOffset (volatile! p_yOffset)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_scale_1 [this p_ratio]
  (let [ l_ratio (volatile! p_ratio)]
        nil))



