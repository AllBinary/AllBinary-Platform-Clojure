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
;; package org.allbinary.input.motion.button

(ns TouchButtonStrafeLeftResource)

(JR/register 'TouchButtonStrafeLeftResource 'TouchButtonResource '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TouchButtonStrafeLeftResource/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TouchButtonStrafeLeftResource/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
        (TouchButtonResource/jinit_2 this "/touch_button_strafe_left_arrow_64_by_64.png" "/touch_button_strafe_left_arrow_hint_64_by_64.png") (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchButtonStrafeLeftResource)] (jinit_0 o) o))



