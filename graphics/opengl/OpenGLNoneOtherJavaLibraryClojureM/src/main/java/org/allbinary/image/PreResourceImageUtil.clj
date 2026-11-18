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
;; package org.allbinary.image

(ns PreResourceImageUtil)

(JR/register 'PreResourceImageUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PreResourceImageUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PreResourceImageUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PreResourceImageUtil/jstatic_instance)))

    
(defn jm_encapsulate_1 [this p_image]
  (let [ l_image (volatile! p_image)]
        @l_image))

    
(defn jm_updateGL_2 [this p_gl p_image]
  (let [ l_gl (volatile! p_gl) l_image (volatile! p_image)]
        nil))

    
(defn jm_update_2 [this p_graphics p_image]
  (let [ l_graphics (volatile! p_graphics) l_image (volatile! p_image)]
        nil))



