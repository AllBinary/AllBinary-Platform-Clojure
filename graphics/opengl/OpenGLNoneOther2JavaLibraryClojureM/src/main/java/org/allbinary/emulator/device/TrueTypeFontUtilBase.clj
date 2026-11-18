;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.emulator.device

(ns TrueTypeFontUtilBase)

(JR/register 'TrueTypeFontUtilBase nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_scale]
  (let [ l_scale (volatile! p_scale)]
    nil (jinitfields this)
        nil)
  this)

(defn jnew_1 [p_scale ]
  (let [o (JR/alloc 'TrueTypeFontUtilBase)] (jinit_1 o p_scale) o))

    
(defn jm_getAsTextureSize_1 [this p_textureSize]
  (let [ l_textureSize (volatile! p_textureSize)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_getCellSize_1 [this p_cellSize]
  (let [ l_cellSize (volatile! p_cellSize)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))



