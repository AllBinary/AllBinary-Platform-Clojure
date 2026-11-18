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
;; package org.allbinary.game.score

(ns HighScoresPaintable)

(JR/register 'HighScoresPaintable 'Paintable '[ColorChangeListener UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :highScores nil)
  (JR/fset this :anchor 0)
  (JR/fset this :charHeight 0)
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE))
    (JR/fset this :highScores (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_0 [this]
  (let []
    (Paintable/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'HighScoresPaintable)] (jinit_0 o) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :charHeight (JR/invoke @l_font :jm_getHeight_0))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject) l_colorChangeEvent (volatile! nil)]
        (vreset! l_colorChangeEvent @l_eventObject)
        (JR/fset this :basicColor (JR/invoke @l_colorChangeEvent :jm_getBasicColorP_0))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_width (volatile! nil) l_height (volatile! nil) l_heading (volatile! nil) l_topScoresWidth (volatile! nil) l_charHeight (volatile! nil) l_columnTwoHeading (volatile! nil) l_columnTwoHeadingWidth (volatile! nil) l_index (volatile! nil) l_largestSecondColumnWidth (volatile! nil) l_list (volatile! nil) l_size (volatile! nil) l_vectorIndex (volatile! nil) l_highScore (volatile! nil) l_nextScoreWidth (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_width (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0))
        (vreset! l_height (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHeight_0))
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/invoke this :jm_getBasicColorP_0) :jm_intValue_0))
        (vreset! l_heading (JR/invoke (JR/fget this :highScores) :jm_getHeading_0))
        (vreset! l_topScoresWidth (JR/ishr (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 @l_heading) 1))
        (vreset! l_charHeight (JR/fget this :charHeight))
        (JR/invoke @l_graphics :jm_drawString_4 @l_heading (unchecked-int (unchecked-subtract (JR/ishr @l_width 1) @l_topScoresWidth)) @l_charHeight (JR/fget this :anchor))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/invoke (JR/fget this :highScores) :jm_getColumnOneHeading_0) 10 (unchecked-int (unchecked-multiply @l_charHeight 3)) (JR/fget this :anchor))
        (vreset! l_columnTwoHeading (JR/invoke (JR/fget this :highScores) :jm_getColumnTwoHeading_0))
        (vreset! l_columnTwoHeadingWidth (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 @l_columnTwoHeading))
        (JR/invoke @l_graphics :jm_drawString_4 @l_columnTwoHeading (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract @l_width 10)) @l_columnTwoHeadingWidth)) (unchecked-int (unchecked-multiply @l_charHeight 3)) (JR/fget this :anchor))
        (vreset! l_index 4)
        (vreset! l_largestSecondColumnWidth @l_columnTwoHeadingWidth)
        (vreset! l_list (JR/invoke (JR/fget this :highScores) :jm_getList_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_vectorIndex 0)
        (vreset! l_highScore nil)
        (JR/jwhile false false (and (< @l_vectorIndex @l_size) (< (unchecked-int (unchecked-multiply @l_charHeight @l_index)) (unchecked-int (unchecked-subtract @l_height (unchecked-int (unchecked-multiply @l_charHeight 2))))))
            (vreset! l_highScore (JR/aget* (JR/fget @l_list :objectArray) @l_vectorIndex))
            (vreset! l_nextScoreWidth (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 (JR/invoke @l_highScore :jm_getScoreString_0)))
            (if (> @l_nextScoreWidth @l_largestSecondColumnWidth)
                (do
                (vreset! l_largestSecondColumnWidth @l_nextScoreWidth)))
            (JR/vinc l_vectorIndex 1 :int false))
        (vreset! l_vectorIndex 0)
        (JR/jwhile false false (and (< @l_vectorIndex @l_size) (< (unchecked-int (unchecked-multiply @l_charHeight @l_index)) (unchecked-int (unchecked-subtract @l_height (unchecked-int (unchecked-multiply @l_charHeight 2))))))
            (vreset! l_highScore (JR/aget* (JR/fget @l_list :objectArray) @l_vectorIndex))
            (JR/invoke @l_graphics :jm_drawString_4 (JR/invoke @l_highScore :jm_getName_0) 10 (unchecked-int (unchecked-multiply @l_charHeight @l_index)) (JR/fget this :anchor))
            (JR/invoke @l_graphics :jm_drawString_4 (JR/invoke @l_highScore :jm_getScoreString_0) (unchecked-int (unchecked-subtract (unchecked-int (unchecked-subtract @l_width 10)) @l_largestSecondColumnWidth)) (unchecked-int (unchecked-multiply @l_charHeight @l_index)) (JR/fget this :anchor))
            (JR/vinc l_index 1 :int false)
            (JR/vinc l_vectorIndex 1 :int false))))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))

    
(defn jm_setHighScores_1 [this p_highScores]
  (let [ l_highScores (volatile! p_highScores)]
        (JR/fset this :highScores @l_highScores)))



