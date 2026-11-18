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

(ns KeyValueDrawCharArray)

(JR/register 'KeyValueDrawCharArray nil '[UpdateMyFontInterface])

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
  (JR/fset this :len 0)
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :value (JR/invoke (JR/scall 'CharArrayFactory :jm_getInstance_0) :jm_getZeroCharArray_0))
  this)

    
(defn jinit_2 [this p_label p_x]
  (let [ l_label (volatile! p_label) l_x (volatile! p_x)]
    nil (jinitfields this)
        (JR/fset this :LABEL @l_label)
        (JR/fset this :labelX @l_x))
  this)

(defn jnew_2 [p_label p_x ]
  (let [o (JR/alloc 'KeyValueDrawCharArray)] (jinit_2 o p_label p_x) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_labelWidth (volatile! nil)]
        (vreset! l_labelWidth (- (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 (JR/fget this :LABEL)) (JR/slength (JR/fget this :LABEL))))
        (JR/fset this :valueX (unchecked-int (unchecked-add @l_labelWidth (JR/fget this :labelX))))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_paint_2 [this p_graphics p_y]
  (let [ l_graphics (volatile! p_graphics) l_y (volatile! p_y)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :LABEL) (JR/fget this :labelX) @l_y 0)
        (JR/invoke @l_graphics :jm_drawChars_6 (JR/fget this :value) 0 (JR/fget this :len) (JR/fget this :valueX) @l_y 0)))

    
(defn jm_update_2 [this p_value p_len]
  (let [ l_value (volatile! p_value) l_len (volatile! p_len)]
        (JR/fset this :value @l_value)
        (JR/fset this :len @l_len)))



