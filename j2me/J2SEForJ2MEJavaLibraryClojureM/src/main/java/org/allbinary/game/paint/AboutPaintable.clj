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
;; package org.allbinary.game.paint

;;J2SEForJ2ME
(ns AboutPaintable)

(JR/register 'AboutPaintable 'Paintable '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :ABOUT nil)
  (JR/fset this :info nil)
  (JR/fset this :developers nil)
  (JR/fset this :paintableArray nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :charHeight 0)
  (JR/fset this :aboutBeginWidth 0)
  (JR/fset this :infoBeginWidth nil)
  (JR/fset this :developersBeginWidth nil)
  (JR/fset this :anchor 0)
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :ABOUT (JR/fget (JR/scall 'CanvasStrings :jm_getInstance_0) :ABOUT))
    (JR/fset this :paintableArray (JR/afrom "Object" 1 [this]))
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jm_getInstance_2 [p_info p_developers]
  (let [this nil l_info (volatile! p_info) l_developers (volatile! p_developers)]
        (AboutPaintable/jnew_2 @l_info @l_developers)))

    
(defn jinit_2 [this p_info p_developers]
  (let [ l_info (volatile! p_info) l_developers (volatile! p_developers)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :info @l_info)
        (JR/fset this :infoBeginWidth (JR/anew "INT" 1 (JR/alen (JR/fget this :info))))
        (JR/fset this :developers @l_developers)
        (JR/fset this :developersBeginWidth (JR/anew "INT" 1 (JR/alen (JR/fget this :developers)))))
  this)

(defn jnew_2 [p_info p_developers ]
  (let [o (JR/alloc 'AboutPaintable)] (jinit_2 o p_info p_developers) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_infoSize (volatile! nil) l_index (volatile! nil) l_size (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :charHeight (JR/invoke @l_font :jm_getHeight_0))
        (JR/fset this :aboutBeginWidth (JR/ishr (JR/invoke @l_font :jm_stringWidth_1 (JR/fget this :ABOUT)) 1))
        (vreset! l_infoSize (JR/alen (JR/fget this :info)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_infoSize) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :infoBeginWidth) @l_index (JR/ishr (JR/invoke @l_font :jm_stringWidth_1 (JR/aget* (JR/fget this :info) @l_index)) 1))))
        (vreset! l_size (JR/alen (JR/fget this :developers)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :developersBeginWidth) @l_index (JR/ishr (JR/invoke @l_font :jm_stringWidth_1 (JR/aget* (JR/fget this :developers) @l_index)) 1))))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_getPaintableArrayInstance_0 [this]
  (let []
        (JR/fget this :paintableArray)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_halfWidth (volatile! nil) l_infoSize (volatile! nil) l_index (volatile! nil) l_size (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_halfWidth (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfWidth_0))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :ABOUT) (unchecked-int (unchecked-subtract @l_halfWidth (JR/fget this :aboutBeginWidth))) (unchecked-int (unchecked-multiply 2 (JR/fget this :charHeight))) (JR/fget this :anchor))
        (vreset! l_infoSize (JR/alen (JR/fget this :info)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_infoSize) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_graphics :jm_drawString_4 (JR/aget* (JR/fget this :info) @l_index) (unchecked-int (unchecked-subtract @l_halfWidth (JR/aget* (JR/fget this :infoBeginWidth) @l_index))) (unchecked-int (unchecked-multiply (unchecked-int (unchecked-add 4 @l_index)) (JR/fget this :charHeight))) (JR/fget this :anchor))))
        (vreset! l_size (JR/alen (JR/fget this :developers)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_graphics :jm_drawString_4 (JR/aget* (JR/fget this :developers) @l_index) (unchecked-int (unchecked-subtract @l_halfWidth (JR/aget* (JR/fget this :developersBeginWidth) @l_index))) (unchecked-int (unchecked-multiply (unchecked-int (unchecked-add (unchecked-int (unchecked-add 5 @l_infoSize)) @l_index)) (JR/fget this :charHeight))) (JR/fget this :anchor))))))



