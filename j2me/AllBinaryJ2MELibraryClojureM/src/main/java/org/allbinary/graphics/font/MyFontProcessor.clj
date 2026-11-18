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

(ns MyFontProcessor)

(JR/register 'MyFontProcessor nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MyFontProcessor/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MyFontProcessor)] (jinit_0 o) o))

    
(defn jm_defaultCharWidth_1 [p_font]
  (let [this nil l_font (volatile! p_font)]
        (JR/invoke @l_font :jm_charWidth_1 \C)))

    
(defn jm_defaultStringWidth_2 [p_font p_size]
  (let [this nil l_font (volatile! p_font) l_size (volatile! p_size)]
        (* (MyFontProcessor/jm_defaultCharWidth_1 @l_font) @l_size)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MyFontProcessor/jstatic_instance)))

    
(defn jm_process_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



