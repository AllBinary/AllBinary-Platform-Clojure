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

(ns CustomTextBoxIndexedAnimation)

(JR/register 'CustomTextBoxIndexedAnimation 'IndexedAnimation '[RawKeyEventListener UpdateMyFontInterface TextInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :customTextBox nil)
  (JR/fset this :lastText nil)
  (JR/fset this :hasChanged false)
  (JR/fset this :textChangeListener nil)
    (JR/fset this :lastText (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :INIT_STRING))
    (JR/fset this :hasChanged true)
    (JR/fset this :textChangeListener (JR/scall 'TextChangeListener :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_customTextBox]
  (let [ l_customTextBox (volatile! p_customTextBox)]
        (IndexedAnimation/jinit_1 this (JR/scall 'AnimationBehavior :jm_getInstance_0)) (jinitfields this)
        (JR/fset this :customTextBox @l_customTextBox))
  this)

(defn jnew_1 [p_customTextBox ]
  (let [o (JR/alloc 'CustomTextBoxIndexedAnimation)] (jinit_1 o p_customTextBox) o))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/invoke (JR/invoke (JR/fget this :customTextBox) :jm_getTextFieldItem_0) :jm_setForegroundBasicColorP_1 @l_basicColor)))

    
(defn jm_setBackgroundBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/invoke (JR/invoke (JR/fget this :customTextBox) :jm_getTextFieldItem_0) :jm_setBackgroundBasicColorP_1 @l_basicColor)))

    
(defn jm_setTextWithOnMeasure_2 [this p_text p_textChangeListener]
  (let [ l_text (volatile! p_text) l_textChangeListener (volatile! p_textChangeListener)]
        (JR/invoke this :jm_setText_1 @l_text)
        (JR/fset this :textChangeListener @l_textChangeListener)))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/invoke (JR/fget this :textChangeListener) :jm_onMeasure_0)
        (JR/fset this :textChangeListener (JR/scall 'TextChangeListener :jm_getInstance_0))))

    
(defn jm_setText_1 [this p_text]
  (let [ l_text (volatile! p_text)]
        (if (not (JR/eq (JR/fget this :lastText) @l_text))
            (do
            (JR/fset this :hasChanged true)
            (JR/fset this :lastText @l_text)
            (JR/invoke (JR/invoke (JR/fget this :customTextBox) :jm_getTextFieldItem_0) :jm_setString_1 @l_text)))))

    
(defn jm_getText_0 [this]
  (let []
        (JR/invoke (JR/invoke (JR/fget this :customTextBox) :jm_getTextFieldItem_0) :jm_getString_0)))

    
(defn jm_onEventRaw_3 [this p_keyCode p_deviceId p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_repeated (volatile! p_repeated)]
        (JR/invoke (JR/fget this :customTextBox) :jm_onEventRaw_3 @l_keyCode @l_deviceId @l_repeated)))

    
(defn jm_getFontHeight_0 [this]
  (let []
        (JR/invoke (JR/invoke (JR/fget this :customTextBox) :jm_getTextFieldItem_0) :jm_getFontHeight_0)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :customTextBox) :jm_paintXY_3 @l_graphics @l_x @l_y)))

    
(defn jm_paintThreedXYZ_4 [this p_graphics p_x p_y p_z]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/invoke-super 'IndexedAnimation this :jm_getWidth_0)))



