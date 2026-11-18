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

(ns CustomTextBoxIndexedAnimationFactory)

(JR/register 'CustomTextBoxIndexedAnimationFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :scaleProperties nil)
  (JR/fset this :maxLength 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_fontSize p_maxLength]
  (let [ l_fontSize (volatile! p_fontSize) l_maxLength (volatile! p_maxLength)]
    nil (jinitfields this)
        (JR/fset this :scaleProperties (ScaleProperties/jnew_0))
        (JR/fset (JR/fget this :scaleProperties) :scaleHeight @l_fontSize)
        (JR/fset this :maxLength @l_maxLength))
  this)

(defn jnew_2 [p_fontSize p_maxLength ]
  (let [o (JR/alloc 'CustomTextBoxIndexedAnimationFactory)] (jinit_2 o p_fontSize p_maxLength) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId) l_abToGBUtil (volatile! nil) l_abCanvas (volatile! nil) l_font (volatile! nil) l_customTextBox (volatile! nil)]
        (vreset! l_abToGBUtil (JR/scall 'ABToGBUtil :jm_getInstance_0))
        (vreset! l_abCanvas (JR/fget @l_abToGBUtil :abCanvas))
        (vreset! l_font (JR/scall 'Font :jm_getFont_3 (JR/sget 'Font "FACE_SYSTEM") (JR/sget 'Font "STYLE_PLAIN") (JR/fget (JR/fget this :scaleProperties) :scaleHeight)))
        (vreset! l_customTextBox (CustomTextBox2/jnew_8 (JR/invoke @l_abCanvas :jm_getCustomCommandListener_0) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget this :maxLength) (JR/sget 'TextField "ANY") @l_font (JR/invoke (JR/invoke @l_abCanvas :jm_getLayerManager_0) :jm_getBackgroundBasicColor_0) (JR/invoke (JR/invoke @l_abCanvas :jm_getLayerManager_0) :jm_getForegroundBasicColor_0)))
        (CustomTextBoxIndexedAnimation/jnew_1 @l_customTextBox)))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties) l_fontSize (volatile! nil)]
        (vreset! l_fontSize (JR/fget (JR/fget this :scaleProperties) :scaleHeight))
        (JR/fset this :scaleProperties @l_scaleProperties)
        (if (< (JR/fget (JR/fget this :scaleProperties) :scaleHeight) 6)
            (do
            (JR/fset (JR/fget this :scaleProperties) :scaleHeight @l_fontSize)))))



