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
;; package org.allbinary.graphics.opengles.renderer

(ns AllBinaryRendererBase3)

(JR/register 'AllBinaryRendererBase3 nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryRendererBase3)] (jinit_0 o) o))

    
(defn jm_update_1 [this p_gl]
  (let [ l_gl (volatile! p_gl) l_openGLESImage (volatile! nil)]
        (JR/jwhile false false (> (JR/invoke (JR/fget this :list) :jm_size_0) 0)
            (vreset! l_openGLESImage (JR/invoke (JR/fget this :list) :jm_removeAt_1 0))
            (if (some? @l_openGLESImage)
                (do
                (JR/invoke @l_openGLESImage :jm_set_1 @l_gl))))))

    
(defn jm_add_1 [this p_image]
  (let [ l_image (volatile! p_image)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_image)))



