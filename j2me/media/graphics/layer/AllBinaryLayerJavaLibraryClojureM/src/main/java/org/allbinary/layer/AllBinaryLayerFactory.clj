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
;; package org.allbinary.layer

(ns AllBinaryLayerFactory)

(JR/register 'AllBinaryLayerFactory nil '[AllBinaryLayerFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :rectangle nil)
  this)

    
(defn jinit_1 [this p_rectangle]
  (let [ l_rectangle (volatile! p_rectangle)]
    nil (jinitfields this)
        (JR/fset this :rectangle @l_rectangle))
  this)

(defn jnew_1 [p_rectangle ]
  (let [o (JR/alloc 'AllBinaryLayerFactory)] (jinit_1 o p_rectangle) o))

    
(defn jm_getInstance_0 [this]
  (let []
        (AllBinaryLayer/jnew_3 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget this :rectangle) (JR/scall 'ViewPosition :jm_getInstanceD_0))))



