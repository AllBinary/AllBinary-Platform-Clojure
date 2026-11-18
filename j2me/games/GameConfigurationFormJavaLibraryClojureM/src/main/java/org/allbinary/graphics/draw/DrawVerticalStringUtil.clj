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
;; package org.allbinary.graphics.draw

(ns DrawVerticalStringUtil)

(JR/register 'DrawVerticalStringUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DrawVerticalStringUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EMPTY_STRING nil)
  (JR/fset this :anchor 0)
  (JR/fset this :charHeight 0)
  (JR/fset this :offsetY 0)
  (JR/fset this :offsetXArray nil)
    (JR/fset this :EMPTY_STRING (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
    (JR/fset this :offsetXArray (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DrawVerticalStringUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DrawVerticalStringUtil/jstatic_instance)))

    
(defn jm_updateMeasurement_2 [this p_graphics p_string]
  (let [ l_graphics (volatile! p_graphics) l_string (volatile! p_string) l_openGLFeatureUtil (volatile! nil) l_font (volatile! nil) l_size (volatile! nil) l_aChar (volatile! nil) l_offsetXArray (volatile! nil) l_index (volatile! nil)]
        (vreset! l_openGLFeatureUtil (JR/scall 'OpenGLFeatureUtil :jm_getInstance_0))
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :charHeight (JR/invoke @l_font :jm_getHeight_0))
        (JR/fset this :offsetY 0)
        (if (JR/scall 'J2MEUtil :jm_isHTML_0)
            (do
            (JR/fset this :charHeight (unchecked-int (unchecked-add (JR/fget this :charHeight) 1))))
            (if (JR/invoke @l_openGLFeatureUtil :jm_isAnyThreed_0)
            (do
            (JR/fset this :charHeight (unchecked-int (unchecked-add (JR/fget this :charHeight) 2)))
            (if (JR/scall 'AndroidUtil :jm_isAndroid_0)
                (do
                nil)
                (do
                (JR/fset this :offsetY (unchecked-int (unchecked-add 2 (JR/idiv (unchecked-int (unchecked-multiply (JR/fget this :charHeight) 2)) 3)))))))))
        (vreset! l_size (JR/slength @l_string))
        (vreset! l_aChar \u0000)
        (vreset! l_offsetXArray (JR/anew "INT" 1 @l_size))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_aChar (JR/char-at @l_string @l_index))
            (if (JR/invoke @l_openGLFeatureUtil :jm_isAnyThreed_0)
                (do
                (JR/aset* @l_offsetXArray @l_index (JR/div (JR/invoke @l_font :jm_charWidth_1 @l_aChar) 2))))))
        (JR/fset this :offsetXArray @l_offsetXArray)))

    
(defn jm_paintVerticle_5 [this p_graphics p_string p_x p_y p_anchor]
  (let [ l_graphics (volatile! p_graphics) l_string (volatile! p_string) l_x (volatile! p_x) l_y (volatile! p_y) l_anchor (volatile! p_anchor) l_size (volatile! nil) l_aChar (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/slength @l_string))
        (vreset! l_aChar \u0000)
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_aChar (JR/char-at @l_string @l_index))
            (JR/invoke @l_graphics :jm_drawChar_4 @l_aChar (unchecked-int (unchecked-add @l_x (JR/aget* (JR/fget this :offsetXArray) @l_index))) (unchecked-int (unchecked-add (unchecked-int (unchecked-add @l_y (unchecked-int (unchecked-multiply (JR/fget this :charHeight) @l_index)))) (JR/fget this :offsetY))) @l_anchor)))))

    
(defn jm_drawCenterString_6 [this p_graphics p_string p_offset p_length p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_string (volatile! p_string) l_offset (volatile! p_offset) l_length (volatile! p_length) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! nil) l_e (volatile! nil)]
        (vreset! l_width (JR/ishr (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_substringWidth_3 @l_string @l_offset @l_length) 1))
        (try (do
            (JR/invoke @l_graphics :jm_drawSubstring_6 @l_string @l_offset @l_length (unchecked-int (unchecked-subtract @l_x @l_width)) @l_y (JR/fget this :anchor)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Exception: stringLength: ") :jm_appendint_1 (JR/slength @l_string)) :jm_append_1 " offset: ") :jm_appendint_1 @l_offset) :jm_append_1 " currentLength: ") :jm_appendint_1 @l_length)) this "drawCenterString")) :else (throw jt)))))))

    
(defn jm_drawCenterStrings_5 [this p_graphics p_stringArray p_maxWidth p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_stringArray (volatile! p_stringArray) l_maxWidth (volatile! p_maxWidth) l_x (volatile! p_x) l_y (volatile! p_y) l_extraLines (volatile! nil) l_string (volatile! nil) l_width (volatile! nil) l_minTotalLines (volatile! nil) l_linePortion (volatile! nil) l_offset (volatile! nil) l_currentLength (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_extraLines 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_stringArray)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_string (JR/aget* @l_stringArray @l_index))
            (if (not (JR/eq @l_string (JR/fget this :EMPTY_STRING)))
                (do
                (vreset! l_width (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 @l_string))
                (vreset! l_minTotalLines 1)
                (if (> @l_width @l_maxWidth)
                    (do
                    (vreset! l_minTotalLines (unchecked-int (unchecked-add (JR/idiv @l_width @l_maxWidth) 1)))))
                (vreset! l_linePortion (JR/idiv (JR/slength @l_string) @l_minTotalLines))
                (vreset! l_offset 0)
                (vreset! l_currentLength @l_linePortion)
                (vreset! l_size (JR/slength @l_string))
                (JR/jwhile false false (< @l_offset @l_size)
                    (if (> (unchecked-int (unchecked-add @l_offset @l_currentLength)) @l_size)
                        (do
                        (vreset! l_currentLength (unchecked-int (unchecked-subtract @l_size @l_offset)))))
                    (if (not (== (unchecked-int (unchecked-add @l_offset @l_currentLength)) @l_size))
                        (do
                        (JR/jwhile false false (and (> @l_currentLength 0) (not (== (JR/c2i (JR/invoke (JR/aget* @l_stringArray @l_index) :jm_charAt_1 (unchecked-int (unchecked-add @l_offset @l_currentLength)))) (JR/c2i \space))))
                            (JR/vinc l_currentLength -1 :int false))
                        (if (<= @l_currentLength 4)
                            (do
                            (vreset! l_currentLength @l_linePortion)))))
                    (JR/invoke this :jm_drawCenterString_6 @l_graphics @l_string @l_offset @l_currentLength @l_x (unchecked-int (unchecked-add @l_y (unchecked-int (unchecked-multiply (unchecked-int (unchecked-add @l_index (JR/vinc l_extraLines 1 :int true))) (JR/fget this :charHeight))))))
                    (vreset! l_offset (unchecked-int (unchecked-add @l_offset @l_currentLength)))
                    (vreset! l_currentLength @l_linePortion))
                (JR/vinc l_extraLines -1 :int false)))))))



