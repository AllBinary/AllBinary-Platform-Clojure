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
;; package org.allbinary.graphics.form.item

(ns CustomTextBox)

(JR/register 'CustomTextBox 'GameCommandCanvas '[RawKeyEventListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :textFieldItem nil)
  (JR/fset this :inputFactory nil)
    (JR/fset this :inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
  this)

    
(defn jinit_8 [this p_cmdListener p_label p_text p_maxSize p_constraints p_font p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_cmdListener (volatile! p_cmdListener) l_label (volatile! p_label) l_text (volatile! p_text) l_maxSize (volatile! p_maxSize) l_constraints (volatile! p_constraints) l_font (volatile! p_font) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_stringUtil (volatile! nil) l_textFieldItem (volatile! nil)]
        (GameCommandCanvas/jinit_4 this @l_cmdListener @l_label @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (vreset! l_textFieldItem (ABTextFieldItem/jnew_10 this (TextItemVisitor/jnew_0) (JR/fget @l_stringUtil :EMPTY_STRING) (JR/fget @l_stringUtil :EMPTY_STRING) @l_maxSize 0 (JR/fget @l_stringUtil :EMPTY_STRING) @l_font @l_backgroundBasicColor @l_foregroundBasicColor))
        (JR/invoke @l_textFieldItem :jm_setString_1 @l_text)
        (JR/fset this :textFieldItem @l_textFieldItem)
        (JR/invoke this :jm_setTitle_1 @l_label))
  this)

(defn jnew_8 [p_cmdListener p_label p_text p_maxSize p_constraints p_font p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'CustomTextBox)] (jinit_8 o p_cmdListener p_label p_text p_maxSize p_constraints p_font p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_submit_0 [this]
  (let []
        nil))

    
(defn jm_onEventRaw_3 [this p_keyCode p_deviceId p_repeated]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_repeated (volatile! p_repeated)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :START)) :jm_appendint_1 @l_keyCode)) this "onEvent")
        (JR/invoke this :jm_keyPressedByDevice_2 @l_keyCode @l_deviceId)))

    
(defn jm_keyPressed_1 [this p_keyCode]
  (let [ l_keyCode (volatile! p_keyCode)]
        (JR/invoke this :jm_keyPressedByDevice_2 @l_keyCode 0)))

    
(defn jm_keyReleased_1 [this p_keyCode]
  (let [ l_keyCode (volatile! p_keyCode)]
        (JR/invoke this :jm_keyReleasedByDevice_2 @l_keyCode 0)))

    
(defn jm_keyRepeated_1 [this p_keyCode]
  (let [ l_keyCode (volatile! p_keyCode)]
        (JR/invoke this :jm_keyRepeatedByDevice_2 @l_keyCode 0)))

    
(defn jm_keyPressedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId) l_platformKeyFactory (volatile! nil) l_input (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE)) :jm_appendint_1 @l_keyCode)) this (JR/fget (JR/fget this :gameInputStrings) :KEY_PRESSED))
            (vreset! l_platformKeyFactory (JR/scall 'PlatformKeyFactory :jm_getInstance_0))
            (vreset! l_input (JR/invoke (JR/fget this :inputFactory) :jm_getInstanceById_1 @l_keyCode))
            (if (JR/invoke @l_platformKeyFactory :jm_isSubmission_1 @l_input)
                (do
                (JR/invoke this :jm_submit_0))
                (do
                (JR/invoke (JR/fget this :textFieldItem) :jm_keyPressed_1 @l_keyCode))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :gameInputStrings) :KEY_PRESSED) @l_e)) :else (throw jt)))))))

    
(defn jm_keyReleasedByDevice_2 [this p_keyCode p_deviceId]
  (let [ l_keyCode (volatile! p_keyCode) l_deviceId (volatile! p_deviceId)]
        nil))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :backgroundColor))
        (JR/invoke @l_graphics :jm_fillRect_4 0 0 (JR/invoke (JR/fget this :displayInfo) :jm_getLastWidth_0) (JR/invoke (JR/fget this :displayInfo) :jm_getLastHeight_0))
        (JR/invoke @l_graphics :jm_setColor_1 (JR/fget this :foregroundColor))
        (if (not (JR/scall 'J2MEUtil :jm_isJ2ME_0))
            (do
            (JR/invoke @l_graphics :jm_drawString_4 (JR/invoke this :jm_getTitle_0) 8 1 0)))
        (JR/invoke this :jm_paintXY_3 @l_graphics 8 (unchecked-int (unchecked-add (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_getHeight_0) 2)))
        (JR/invoke-super 'GameCommandCanvas this :jm_paint_1 @l_graphics)))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :textFieldItem) :jm_paintXY_3 @l_graphics @l_x @l_y)))

    
(defn jm_getTextFieldItem_0 [this]
  (let []
        (JR/fget this :textFieldItem)))



