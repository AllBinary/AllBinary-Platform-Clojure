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

(ns KeyValueDrawString)

(JR/register 'KeyValueDrawString nil '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :LABEL nil)
  (JR/fset this :labelX 0)
  (JR/fset this :valueX 0)
  (JR/fset this :value nil)
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :value (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_2 [this p_label p_x]
  (let [ l_label (volatile! p_label) l_x (volatile! p_x)]
    nil (jinitfields this)
        (JR/fset this :LABEL @l_label)
        (JR/fset this :labelX @l_x))
  this)

(defn jnew_2 [p_label p_x ]
  (let [o (JR/alloc 'KeyValueDrawString)] (jinit_2 o p_label p_x) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_labelWidth (volatile! nil)]
        (vreset! l_labelWidth (- (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 (JR/fget this :LABEL)) (JR/slength (JR/fget this :LABEL))))
        (JR/fset this :valueX (unchecked-int (unchecked-add @l_labelWidth (JR/fget this :labelX))))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_paint_2 [this p_graphics p_y]
  (let [ l_graphics (volatile! p_graphics) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :LABEL) (JR/fget this :labelX) @l_y 0)
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :value) (JR/fget this :valueX) @l_y 0)))

    
(defn jm_update_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :value @l_value)))



