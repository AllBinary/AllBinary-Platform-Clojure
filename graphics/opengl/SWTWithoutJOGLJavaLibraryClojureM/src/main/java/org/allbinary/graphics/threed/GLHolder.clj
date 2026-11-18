;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.graphics.threed

(ns GLHolder)

(JR/register 'GLHolder nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :isCreated false)
    (JR/fset this :isCreated true)
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GLHolder)] (jinit_0 o) o))

    
(defn jm_runOnSurfaceCreated_1 [this p_renderer]
  (let [ l_renderer (volatile! p_renderer)]
        nil))

    
(defn jm_runOnSurfaceChanged_3 [this p_renderer p_width p_height]
  (let [ l_renderer (volatile! p_renderer) l_width (volatile! p_width) l_height (volatile! p_height)]
        nil))

    
(defn jm_run_1 [this p_renderer]
  (let [ l_renderer (volatile! p_renderer)]
        nil))



