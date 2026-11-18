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

(ns SelectableTextItem)

(JR/register 'SelectableTextItem 'ABTextItem '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_5 [this p_label p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_label (volatile! p_label) l_layout (volatile! p_layout) l_altText (volatile! p_altText) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ABTextItem/jinit_5 this @l_label @l_layout @l_altText @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this))
  this)

(defn jnew_5 [p_label p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'SelectableTextItem)] (jinit_5 o p_label p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_isFocusable_0 [this]
  (let []
        true))

    
(defn jm_paintXY_3 [this p_graphics p_x p_y]
  (let [ l_graphics (volatile! p_graphics) l_x (volatile! p_x) l_y (volatile! p_y) l_stringComponent (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_stringComponent (JR/invoke this :jm_getLabelStringComponent_0))
        (if (some? @l_stringComponent)
            (do
            (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/invoke @l_stringComponent :jm_getForegroundBasicColor_0) :jm_intValue_0))))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/invoke this :jm_getLabel_0) (unchecked-int (unchecked-add @l_x 2)) @l_y 0)))



