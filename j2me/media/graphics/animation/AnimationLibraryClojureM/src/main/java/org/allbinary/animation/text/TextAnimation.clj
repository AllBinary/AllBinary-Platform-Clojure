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

(ns TextAnimation)

(JR/register 'TextAnimation 'IndexedAnimation '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :textArrayP nil)
  (JR/fset this :anchor 0)
  (JR/fset this :fontHeight 0)
  (JR/fset this :offsetY 0)
  (JR/fset this :textChangeListener nil)
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :textArrayP (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :ONE_EMPTY_STRING_ARRAY))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
    (JR/fset this :fontHeight 0)
    (JR/fset this :offsetY 0)
    (JR/fset this :textChangeListener (JR/scall 'TextChangeListener :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_text p_animationBehavior]
  (let [ l_text (volatile! p_text) l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/invoke this :jm_setText_1 @l_text))
  this)

(defn jnew_2 [p_text p_animationBehavior ]
  (let [o (JR/alloc 'TextAnimation)] (jinit_2 o p_text p_animationBehavior) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_adjustedFontHeight (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :fontHeight (JR/invoke @l_font :jm_getHeight_0))
        (vreset! l_adjustedFontHeight (JR/d2i (- (* (double (JR/c2i (JR/fget this :fontHeight))) 2.00))))
        (JR/fset this :offsetY (if (JR/invoke (JR/scall 'SWTJOGLProcessor :jm_getInstance_0) :jm_isJOGL_0) @l_adjustedFontHeight 0))
        (JR/invoke (JR/fget this :textChangeListener) :jm_onMeasure_0)
        (JR/fset this :textChangeListener (JR/scall 'TextChangeListener :jm_getInstance_0))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_nextFrame_0 [this]
  (let []
        nil))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke this :jm_paintXYNoUpdate_3 @l_graphics @l_x @l_y)))

    
(defn jm_paintXYNoUpdate_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_size (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/invoke this :jm_getBasicColorP_0) (JR/invoke this :jm_getColor_0))
        (vreset! l_size (JR/alen (JR/fget this :textArrayP)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_graphics :jm_drawString_4 (JR/aget* (JR/fget this :textArrayP) @l_index) @l_x (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_y (JR/fget this :offsetY))) (unchecked-int (unchecked-multiply @l_index (JR/fget this :fontHeight))))) (JR/fget this :anchor))))))

    
(defn jm_setTextWithOnMeasure_2 [this p_text p_textChangeListener]
  (let [ l_text (volatile! p_text) l_textChangeListener (volatile! p_textChangeListener)]
        (JR/invoke this :jm_setText_1 @l_text)
        (JR/fset this :textChangeListener @l_textChangeListener)))

    
(defn jm_setText_1 [this p_text]
  (let [ l_text (volatile! p_text) l_list (volatile! nil) l_index (volatile! nil) l_startIndex (volatile! nil) l_endIndex (volatile! nil) l_textArray (volatile! nil) l_size (volatile! nil)]
        (vreset! l_list (BasicArrayListD/jnew_0))
        (if (> (JR/slength @l_text) 0)
            (do
            (vreset! l_index 0)
            (vreset! l_startIndex 0)
            (vreset! l_endIndex 0)
            (JR/jwhile true false (>= @l_index 0)
                (vreset! l_startIndex @l_index)
                (vreset! l_index (JR/invoke @l_text :jm_indexOf_2 \newline @l_startIndex))
                (vreset! l_endIndex @l_index)
                (if (< @l_index 0)
                    (do
                    (vreset! l_endIndex (JR/slength @l_text))))
                (JR/invoke @l_list :jm_add_1 (JR/invoke @l_text :jm_substring_2 @l_startIndex @l_endIndex))
                (if (< @l_index 0)
                    (do
                    (JR/jbreak)))
                (JR/vinc l_index 1 :int false))))
        (if (> (JR/invoke @l_list :jm_size_0) 0)
            (do
            (vreset! l_textArray (JR/anew "String" 1 (JR/invoke @l_list :jm_size_0)))
            (vreset! l_size (JR/invoke @l_list :jm_size_0))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (JR/aset* @l_textArray @l_index (JR/invoke @l_list :jm_get_1 @l_index))))
            (JR/fset this :textArrayP @l_textArray))
            (do
            (JR/fset this :textArrayP (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :ONE_EMPTY_STRING_ARRAY))))
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_getTextArray_0 [this]
  (let []
        (JR/fget this :textArrayP)))

    
(defn jm_getFontHeight_0 [this]
  (let []
        (JR/fget this :fontHeight)))



