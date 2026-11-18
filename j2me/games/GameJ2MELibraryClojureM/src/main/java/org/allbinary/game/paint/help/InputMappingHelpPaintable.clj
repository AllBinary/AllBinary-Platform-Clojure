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
;; package org.allbinary.game.paint.help

(ns InputMappingHelpPaintable)

(JR/register 'InputMappingHelpPaintable 'HelpPaintable '[])

(def jsv_AND (atom nil))
(def jsv_SEP (atom nil))
(def jsv_MORE_THAN_TWO_IN_LIST_AND (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_AND [] (JR/ensure-init jclinit-state jclinit) @jsv_AND)
(defn jstatic_set_AND [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_AND v))
(defn jstatic_SEP [] (JR/ensure-init jclinit-state jclinit) @jsv_SEP)
(defn jstatic_set_SEP [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SEP v))
(defn jstatic_MORE_THAN_TWO_IN_LIST_AND [] (JR/ensure-init jclinit-state jclinit) @jsv_MORE_THAN_TWO_IN_LIST_AND)
(defn jstatic_set_MORE_THAN_TWO_IN_LIST_AND [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_MORE_THAN_TWO_IN_LIST_AND v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_AND " and ")
    (reset! jsv_SEP ", ")
    (reset! jsv_MORE_THAN_TWO_IN_LIST_AND ", and ")
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :commonSeps nil)
  (JR/fset this :stringUtil nil)
  (JR/fset this :basicColorFactory nil)
  (JR/fset this :NONE nil)
  (JR/fset this :EMPTY_STRING nil)
  (JR/fset this :gameInputMappingArray nil)
  (JR/fset this :keyMappingArray nil)
  (JR/fset this :actionBasicColor nil)
  (JR/fset this :inputBasicColorArray nil)
  (JR/fset this :selectedBasicColor nil)
  (JR/fset this :updateMyFontProperties nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
    (JR/fset this :stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
    (JR/fset this :basicColorFactory (JR/scall 'BasicColorFactory :jm_getInstance_0))
    (JR/fset this :NONE (JR/fget (JR/scall 'GameKeyFactory :jm_getInstance_0) :NONE))
    (JR/fset this :EMPTY_STRING (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :keyMappingArray (JR/anew "Object" 1 0))
    (JR/fset this :actionBasicColor (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ZERO_ARRAY))
    (JR/fset this :inputBasicColorArray (JR/anew "Object" 2 0 0))
    (JR/fset this :updateMyFontProperties (UpdateMyFontProperties/jnew_0))
  this)

    
(defn jinit_3 [this p_gameInputMappingArray p_backgroundBasicColor p_basicColor]
  (let [ l_gameInputMappingArray (volatile! p_gameInputMappingArray) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_basicColor (volatile! p_basicColor)]
        (HelpPaintable/jinit_3 this "Input Mapping" @l_backgroundBasicColor @l_basicColor) (jinitfields this)
        (JR/fset this :gameInputMappingArray @l_gameInputMappingArray)
        (JR/invoke this :jm_update_2 (JR/fget this :NONE) (JR/fget this :NONE))
        (if (or (JR/eq @l_backgroundBasicColor (JR/fget (JR/fget this :basicColorFactory) :WHITE)) (JR/eq @l_basicColor (JR/fget (JR/fget this :basicColorFactory) :WHITE)))
            (do
            (JR/fset this :selectedBasicColor (JR/fget (JR/fget this :basicColorFactory) :RED)))
            (do
            (JR/fset this :selectedBasicColor (JR/fget (JR/fget this :basicColorFactory) :WHITE)))))
  this)

(defn jnew_3 [p_gameInputMappingArray p_backgroundBasicColor p_basicColor ]
  (let [o (JR/alloc 'InputMappingHelpPaintable)] (jinit_3 o p_gameInputMappingArray p_backgroundBasicColor p_basicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_updateMyFontProperties (volatile! nil) l_stringMaker (volatile! nil) l_inputInfo (volatile! nil) l_size (volatile! nil) l_list (volatile! nil) l_keyMappings (volatile! nil) l_actionString (volatile! nil) l_input (volatile! nil) l_size2 (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (vreset! l_updateMyFontProperties (UpdateMyFontProperties/jnew_0))
        (JR/fset @l_updateMyFontProperties :charHeight (JR/invoke @l_font :jm_getHeight_0))
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_inputInfo (JR/fget this :inputInfo))
        (vreset! l_size (JR/alen @l_inputInfo))
        (JR/fset @l_updateMyFontProperties :actionStringArray (JR/anew "String" 1 @l_size))
        (JR/fset @l_updateMyFontProperties :keymappingBeginWidthArray (JR/anew "INT" 1 @l_size))
        (JR/fset @l_updateMyFontProperties :actionStringDeltaXArray (JR/anew "INT" 1 @l_size))
        (JR/fset @l_updateMyFontProperties :inputDeltaXArray (JR/anew "INT" 2 @l_size 0))
        (JR/fset @l_updateMyFontProperties :sepArray (JR/anew "String" 2 @l_size 0))
        (JR/fset @l_updateMyFontProperties :sepWidthArray (JR/anew "INT" 2 @l_size 0))
        (vreset! l_list nil)
        (vreset! l_keyMappings nil)
        (vreset! l_actionString nil)
        (vreset! l_input nil)
        (vreset! l_size2 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_list (JR/aget* (JR/fget this :keyMappingArray) @l_index))
            (vreset! l_keyMappings (JR/invoke this :jm_get_1 @l_list))
            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
            (vreset! l_actionString (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/aget* @l_inputInfo @l_index)) :jm_append_1 (JR/fget (JR/fget this :commonSeps) :COLON)) :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE)) :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE))))
            (JR/aset* (JR/fget @l_updateMyFontProperties :actionStringArray) @l_index @l_actionString)
            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
            (JR/aset* (JR/fget @l_updateMyFontProperties :keymappingBeginWidthArray) @l_index (JR/ishr (JR/invoke @l_font :jm_stringWidth_1 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/aget* (JR/fget @l_updateMyFontProperties :actionStringArray) @l_index)) :jm_append_1 @l_keyMappings))) 1))
            (JR/aset* (JR/fget @l_updateMyFontProperties :actionStringDeltaXArray) @l_index (JR/invoke @l_font :jm_stringWidth_1 @l_actionString))
            (vreset! l_size2 (JR/invoke @l_list :jm_size_0))
            (JR/aset* (JR/fget @l_updateMyFontProperties :inputDeltaXArray) @l_index (JR/anew "INT" 1 @l_size2))
            (JR/aset* (JR/fget @l_updateMyFontProperties :sepArray) @l_index (JR/anew "String" 1 @l_size2))
            (JR/aset* (JR/fget @l_updateMyFontProperties :sepWidthArray) @l_index (JR/anew "INT" 1 @l_size2))
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 @l_size2) (do (JR/vinc l_index2 1 :int false))
                (vreset! l_input (JR/aget* (JR/fget @l_list :objectArray) @l_index2))
                (JR/aset* (JR/aget* (JR/fget @l_updateMyFontProperties :inputDeltaXArray) @l_index) @l_index2 (JR/invoke @l_font :jm_stringWidth_1 (JR/invoke @l_input :jm_getName_0)))
                (JR/aset* (JR/aget* (JR/fget @l_updateMyFontProperties :sepArray) @l_index) @l_index2 (JR/fget this :EMPTY_STRING))
                (if (< (unchecked-int (unchecked-add @l_index2 1)) (JR/invoke @l_list :jm_size_0))
                    (do
                    (if (== (JR/invoke @l_list :jm_size_0) 2)
                        (do
                        (JR/aset* (JR/aget* (JR/fget @l_updateMyFontProperties :sepArray) @l_index) @l_index2 (InputMappingHelpPaintable/jstatic_AND)))
                        (do
                        (if (== (unchecked-int (unchecked-add @l_index2 2)) (JR/invoke @l_list :jm_size_0))
                            (do
                            (JR/aset* (JR/aget* (JR/fget @l_updateMyFontProperties :sepArray) @l_index) @l_index2 (InputMappingHelpPaintable/jstatic_MORE_THAN_TWO_IN_LIST_AND)))
                            (do
                            (JR/aset* (JR/aget* (JR/fget @l_updateMyFontProperties :sepArray) @l_index) @l_index2 (InputMappingHelpPaintable/jstatic_SEP))))))))
                (if (not (JR/eq (JR/aget* (JR/aget* (JR/fget @l_updateMyFontProperties :sepArray) @l_index) @l_index2) (JR/fget this :EMPTY_STRING)))
                    (do
                    (JR/aset* (JR/aget* (JR/fget @l_updateMyFontProperties :sepWidthArray) @l_index) @l_index2 (JR/invoke @l_font :jm_stringWidth_1 (JR/aget* (JR/aget* (JR/fget @l_updateMyFontProperties :sepArray) @l_index) @l_index2)))))))))
        (JR/fset this :updateMyFontProperties @l_updateMyFontProperties)
        (JR/invoke-super 'HelpPaintable this :jm_updateMeasurement_1 @l_graphics)))

    
(defn jm_update_2 [this p_selectedGameKey p_selectedInput]
  (let [ l_selectedGameKey (volatile! p_selectedGameKey) l_selectedInput (volatile! p_selectedInput) l_stringMaker (volatile! nil) l_gameKeyMapping (volatile! nil) l_size (volatile! nil) l_keyInfo (volatile! nil) l_keyMappingArray (volatile! nil) l_actionBasicColor (volatile! nil) l_inputBasicColorArray (volatile! nil) l_gameInputMapping (volatile! nil) l_gameKey (volatile! nil) l_list (volatile! nil) l_size2 (volatile! nil) l_index2 (volatile! nil) l_indexOfSelectedInput (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 "selected GameKey: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_selectedGameKey)) :jm_append_1 " Input: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_selectedInput))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
        (vreset! l_gameKeyMapping (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0))
        (vreset! l_size (JR/alen (JR/fget this :gameInputMappingArray)))
        (vreset! l_keyInfo (JR/anew "String" 1 @l_size))
        (vreset! l_keyMappingArray (JR/anew "Object" 1 @l_size))
        (vreset! l_actionBasicColor (JR/anew "Object" 1 @l_size))
        (vreset! l_inputBasicColorArray (JR/anew "Object" 2 @l_size))
        (vreset! l_gameInputMapping nil)
        (vreset! l_gameKey nil)
        (vreset! l_list nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_gameInputMapping (JR/aget* (JR/fget this :gameInputMappingArray) @l_index))
            (vreset! l_gameKey (JR/invoke @l_gameInputMapping :jm_getGameKey_0))
            (vreset! l_list (JR/invoke (JR/invoke @l_gameKeyMapping :jm_getInputMapping_0) :jm_getMappedInput_1 @l_gameKey))
            (vreset! l_size2 (JR/invoke @l_list :jm_size_0))
            (JR/aset* @l_inputBasicColorArray @l_index (JR/anew "Object" 1 @l_size2))
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 @l_size2) (do (JR/vinc l_index2 1 :int false))
                (JR/aset* (JR/aget* @l_inputBasicColorArray @l_index) @l_index2 (JR/fget this :basicColor))))
            (if (JR/eq @l_gameKey @l_selectedGameKey)
                (do
                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 "Found: selected GameKey: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_selectedGameKey))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                (JR/aset* @l_actionBasicColor @l_index (JR/fget this :selectedBasicColor))
                (vreset! l_indexOfSelectedInput (JR/invoke @l_list :jm_indexOf_1 @l_selectedInput))
                (if (>= @l_indexOfSelectedInput 0)
                    (do
                    (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 "Found: selected Input: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_selectedInput))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                    (JR/aset* (JR/aget* @l_inputBasicColorArray @l_index) @l_indexOfSelectedInput (JR/fget this :selectedBasicColor)))))
                (do
                (JR/aset* @l_actionBasicColor @l_index (JR/fget this :basicColor))))
            (JR/aset* @l_keyInfo @l_index (JR/invoke @l_gameInputMapping :jm_getName_0))
            (JR/aset* @l_keyMappingArray @l_index @l_list)))
        (JR/fset this :keyMappingArray @l_keyMappingArray)
        (JR/fset this :actionBasicColor @l_actionBasicColor)
        (JR/fset this :inputBasicColorArray @l_inputBasicColorArray)
        (JR/invoke-super 'HelpPaintable this :jm_setInputInfoP_1 @l_keyInfo)
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_get_1 [this p_keyList]
  (let [ l_keyList (volatile! p_keyList) l_stringBuffer (volatile! nil) l_key (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_key nil)
        (vreset! l_size (JR/invoke @l_keyList :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_key (JR/aget* (JR/fget @l_keyList :objectArray) @l_index))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_key :jm_getName_0))
            (if (< (unchecked-int (unchecked-add @l_index 1)) (JR/invoke @l_keyList :jm_size_0))
                (do
                (if (== (JR/invoke @l_keyList :jm_size_0) 2)
                    (do
                    (JR/invoke @l_stringBuffer :jm_append_1 (InputMappingHelpPaintable/jstatic_AND)))
                    (do
                    (if (== (unchecked-int (unchecked-add @l_index 2)) (JR/invoke @l_keyList :jm_size_0))
                        (do
                        (JR/invoke @l_stringBuffer :jm_append_1 (InputMappingHelpPaintable/jstatic_MORE_THAN_TWO_IN_LIST_AND)))
                        (do
                        (JR/invoke @l_stringBuffer :jm_append_1 (InputMappingHelpPaintable/jstatic_SEP))))))))))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_halfWidth (volatile! nil) l_inputInfo (volatile! nil) l_size (volatile! nil) l_y (volatile! nil) l_deltaX (volatile! nil) l_size2 (volatile! nil) l_actionString (volatile! nil) l_input (volatile! nil) l_list (volatile! nil) l_sep (volatile! nil) l_beginWidth (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_halfWidth (JR/invoke (JR/fget this :displayInfo) :jm_getLastHalfWidth_0))
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/fget this :basicColor) :jm_intValue_0))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :title) (- @l_halfWidth (JR/fget this :titleBeginWidth)) (JR/fget (JR/fget this :updateMyFontProperties) :charHeight) (JR/fget this :anchor))
        (vreset! l_inputInfo (JR/fget this :inputInfo))
        (vreset! l_size (JR/alen @l_inputInfo))
        (vreset! l_y 0)
        (vreset! l_deltaX 0)
        (vreset! l_size2 0)
        (vreset! l_actionString nil)
        (vreset! l_input nil)
        (vreset! l_list nil)
        (vreset! l_sep nil)
        (vreset! l_beginWidth 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_y (unchecked-int (unchecked-multiply (unchecked-int (unchecked-add @l_index 3)) (JR/fget (JR/fget this :updateMyFontProperties) :charHeight))))
            (vreset! l_deltaX 0)
            (vreset! l_list (JR/aget* (JR/fget this :keyMappingArray) @l_index))
            (vreset! l_size2 (JR/invoke @l_list :jm_size_0))
            (vreset! l_beginWidth (JR/aget* (JR/fget (JR/fget this :updateMyFontProperties) :keymappingBeginWidthArray) @l_index))
            (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/aget* (JR/fget this :actionBasicColor) @l_index) :jm_intValue_0))
            (vreset! l_actionString (JR/aget* (JR/fget (JR/fget this :updateMyFontProperties) :actionStringArray) @l_index))
            (JR/invoke @l_graphics :jm_drawString_4 @l_actionString (unchecked-int (unchecked-add (unchecked-int (unchecked-subtract @l_halfWidth @l_beginWidth)) @l_deltaX)) @l_y (JR/fget this :anchor))
            (vreset! l_deltaX (unchecked-int (unchecked-add @l_deltaX (JR/aget* (JR/fget (JR/fget this :updateMyFontProperties) :actionStringDeltaXArray) @l_index))))
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 @l_size2) (do (JR/vinc l_index2 1 :int false))
                (vreset! l_input (JR/aget* (JR/fget @l_list :objectArray) @l_index2))
                (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/aget* (JR/aget* (JR/fget this :inputBasicColorArray) @l_index) @l_index2) :jm_intValue_0))
                (JR/invoke @l_graphics :jm_drawString_4 (JR/invoke @l_input :jm_getName_0) (unchecked-int (unchecked-add (unchecked-int (unchecked-subtract @l_halfWidth @l_beginWidth)) @l_deltaX)) @l_y (JR/fget this :anchor))
                (vreset! l_deltaX (unchecked-int (unchecked-add @l_deltaX (JR/aget* (JR/aget* (JR/fget (JR/fget this :updateMyFontProperties) :inputDeltaXArray) @l_index) @l_index2))))
                (vreset! l_sep (JR/aget* (JR/aget* (JR/fget (JR/fget this :updateMyFontProperties) :sepArray) @l_index) @l_index2))
                (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/fget this :basicColor) :jm_intValue_0))
                (JR/invoke @l_graphics :jm_drawString_4 @l_sep (unchecked-int (unchecked-add (unchecked-int (unchecked-subtract @l_halfWidth @l_beginWidth)) @l_deltaX)) @l_y (JR/fget this :anchor))
                (vreset! l_deltaX (unchecked-int (unchecked-add @l_deltaX (JR/aget* (JR/aget* (JR/fget (JR/fget this :updateMyFontProperties) :sepWidthArray) @l_index) @l_index2))))))))))



