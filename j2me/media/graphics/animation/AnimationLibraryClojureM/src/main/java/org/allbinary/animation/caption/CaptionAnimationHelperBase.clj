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
;; package org.allbinary.animation.caption

(ns CaptionAnimationHelperBase)

(JR/register 'CaptionAnimationHelperBase 'Animation '[])

(def jsv_INSTANCE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_INSTANCE [] (JR/ensure-init jclinit-state jclinit) @jsv_INSTANCE)
(defn jstatic_set_INSTANCE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_INSTANCE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_INSTANCE (CaptionAnimationHelperBase/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (Animation/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CaptionAnimationHelperBase)] (jinit_0 o) o))

    
(defn jm_isShowing_0 [this]
  (let []
        false))

    
(defn jm_tick_0 [this]
  (let []
        nil))

    
(defn jm_update_2 [this p_message p_basicColor]
  (let [ l_message (volatile! p_message) l_basicColor (volatile! p_basicColor)]
        nil))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))



