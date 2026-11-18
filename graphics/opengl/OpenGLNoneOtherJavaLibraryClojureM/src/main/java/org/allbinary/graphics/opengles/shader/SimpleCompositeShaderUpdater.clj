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
;; package org.allbinary.graphics.opengles.shader

(ns SimpleCompositeShaderUpdater)

(JR/register 'SimpleCompositeShaderUpdater 'CompositeShaderUpdater '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_4 [this p_uniformBlockArray p_uniformArray p_attributeArray p_attributeHandleArray]
  (let [ l_uniformBlockArray (volatile! p_uniformBlockArray) l_uniformArray (volatile! p_uniformArray) l_attributeArray (volatile! p_attributeArray) l_attributeHandleArray (volatile! p_attributeHandleArray)]
        (CompositeShaderUpdater/jinit_4 this @l_uniformBlockArray @l_uniformArray @l_attributeArray @l_attributeHandleArray) (jinitfields this))
  this)

(defn jnew_4 [p_uniformBlockArray p_uniformArray p_attributeArray p_attributeHandleArray ]
  (let [o (JR/alloc 'SimpleCompositeShaderUpdater)] (jinit_4 o p_uniformBlockArray p_uniformArray p_attributeArray p_attributeHandleArray) o))



