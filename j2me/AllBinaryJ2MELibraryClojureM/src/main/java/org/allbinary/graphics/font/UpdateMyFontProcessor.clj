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
;; package org.allbinary.graphics.font

(ns UpdateMyFontProcessor)

(JR/register 'UpdateMyFontProcessor 'MyFontProcessor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :updateMeasurementProcessor nil)
  this)

    
(defn jinit_1 [this p_keyValueDrawCharArray]
  (let [ l_keyValueDrawCharArray (volatile! p_keyValueDrawCharArray)]
    (MyFontProcessor/jinit_0 this) (jinitfields this)
        (JR/fset this :updateMeasurementProcessor @l_keyValueDrawCharArray))
  this)

(defn jnew_1 [p_keyValueDrawCharArray ]
  (let [o (JR/alloc 'UpdateMyFontProcessor)] (jinit_1 o p_keyValueDrawCharArray) o))

    
(defn jm_process_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :updateMeasurementProcessor) :jm_updateMeasurement_1 @l_graphics)))



