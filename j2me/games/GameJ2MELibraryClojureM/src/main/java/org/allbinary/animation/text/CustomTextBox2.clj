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
;; package org.allbinary.animation.text

(ns CustomTextBox2)

(JR/register 'CustomTextBox2 'CustomTextBox '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_8 [this p_cmdListener p_label p_text p_maxSize p_constraints p_font p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_cmdListener (volatile! p_cmdListener) l_label (volatile! p_label) l_text (volatile! p_text) l_maxSize (volatile! p_maxSize) l_constraints (volatile! p_constraints) l_font (volatile! p_font) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (CustomTextBox/jinit_8 this @l_cmdListener @l_label @l_text @l_maxSize @l_constraints @l_font @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/invoke (JR/invoke this :jm_getTextFieldItem_0) :jm_setFocus_1 true))
  this)

(defn jnew_8 [p_cmdListener p_label p_text p_maxSize p_constraints p_font p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'CustomTextBox2)] (jinit_8 o p_cmdListener p_label p_text p_maxSize p_constraints p_font p_backgroundBasicColor p_foregroundBasicColor) o))



