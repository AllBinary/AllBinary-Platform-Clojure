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
;; package org.allbinary.animation.text

(ns CustomTextAnimation)

(JR/register 'CustomTextAnimation 'TextAnimation '[TextInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :fontDebugFactory nil)
  (JR/fset this :fontSize 0)
  (JR/fset this :font nil)
  (JR/fset this :lastText nil)
  (JR/fset this :hasChanged false)
  (JR/fset this :textWidth 0)
    (JR/fset this :fontDebugFactory (JR/scall 'FontDebugFactory :jm_getInstance_0))
    (JR/fset this :lastText (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :INIT_STRING))
    (JR/fset this :hasChanged true)
  this)

    
(defn jinit_3 [this p_text p_fontSize p_animationBehavior]
  (let [ l_text (volatile! p_text) l_fontSize (volatile! p_fontSize) l_animationBehavior (volatile! p_animationBehavior)]
        (TextAnimation/jinit_2 this @l_text @l_animationBehavior) (jinitfields this)
        (JR/fset this :fontSize @l_fontSize)
        (JR/fset this :font (JR/scall 'Font :jm_getFont_3 (JR/sget 'Font "FACE_SYSTEM") (JR/sget 'Font "STYLE_PLAIN") @l_fontSize)))
  this)

(defn jnew_3 [p_text p_fontSize p_animationBehavior ]
  (let [o (JR/alloc 'CustomTextAnimation)] (jinit_3 o p_text p_fontSize p_animationBehavior) o))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_existingFont (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_existingFont (JR/invoke @l_graphics :jm_getFont_0))
        (JR/invoke (JR/fget this :fontDebugFactory) :jm_setFont_2 (JR/fget this :font) @l_graphics)
        (JR/invoke-super 'TextAnimation this :jm_paintXYNoUpdate_3 @l_graphics @l_x @l_y)
        (JR/invoke (JR/fget this :fontDebugFactory) :jm_setFont_2 @l_existingFont @l_graphics)))

    
(defn jm_setScale_2 [this p_scaleX p_scaleY]
  (let [ l_scaleX (volatile! p_scaleX) l_scaleY (volatile! p_scaleY)]
        (if (not (== @l_scaleX @l_scaleY))
            (do
            (JR/jthrow (new java.lang.RuntimeException))))
        (JR/fset this :hasChanged true)
        (JR/fset this :font (JR/scall 'Font :jm_getFont_3 (JR/sget 'Font "FACE_SYSTEM") (JR/sget 'Font "STYLE_PLAIN") (JR/d2i (* (JR/f32 (JR/fget this :fontSize)) @l_scaleX))))))

    
(defn jm_setTextWithOnMeasure_2 [this p_text p_textChangeListener]
  (let [ l_text (volatile! p_text) l_textChangeListener (volatile! p_textChangeListener)]
        (JR/invoke-super 'TextAnimation this :jm_setTextWithOnMeasure_2 @l_text @l_textChangeListener)))

    
(defn jm_setText_1 [this p_text]
  (let [ l_text (volatile! p_text)]
        (if (not (JR/eq (JR/fget this :lastText) @l_text))
            (do
            (JR/fset this :hasChanged true)
            (JR/fset this :lastText @l_text)
            (JR/invoke-super 'TextAnimation this :jm_setText_1 @l_text)))))

    
(defn jm_getText_0 [this]
  (let []
        (JR/fget this :lastText)))

    
(defn jm_getWidth_0 [this]
  (let []
        (if (JR/fget this :hasChanged)
            (do
            (JR/fset this :textWidth (JR/invoke (JR/fget this :font) :jm_stringWidth_1 (JR/aget* (JR/fget this :textArrayP) 0)))
            (JR/fset this :hasChanged false)))
        (JR/fget this :textWidth)))

    
(defn jm_getFontHeight_0 [this]
  (let []
        (JR/invoke (JR/fget this :font) :jm_getHeight_0)))



