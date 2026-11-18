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

(ns HighScoresCanvasLevelChangeInputProcessor)

(JR/register 'HighScoresCanvasLevelChangeInputProcessor 'HighScoresCanvasInputProcessor '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :INSTRUCTIONS nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :anchor 0)
  (JR/fset this :fontHeight 0)
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :INSTRUCTIONS "(Right = Next Track, Left = Previous Track)")
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
    (JR/fset this :fontHeight 0)
  this)

    
(defn jinit_1 [this p_highScoresCanvas]
  (let [ l_highScoresCanvas (volatile! p_highScoresCanvas)]
        (HighScoresCanvasInputProcessor/jinit_1 this @l_highScoresCanvas) (jinitfields this))
  this)

(defn jnew_1 [p_highScoresCanvas ]
  (let [o (JR/alloc 'HighScoresCanvasLevelChangeInputProcessor)] (jinit_1 o p_highScoresCanvas) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :fontHeight (JR/invoke @l_font :jm_getHeight_0))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_open_0 [this]
  (let []
        (JR/invoke (JR/scall 'GameKeyEventHandler :jm_getInstance_0) :jm_addListener_1 this)))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/scall 'GameKeyEventHandler :jm_getInstance_0) :jm_removeListener_1 this)))

    
(defn jm_update_0 [this]
  (let [ l_list (volatile! nil) l_size (volatile! nil) l_anyType (volatile! nil) l_key (volatile! nil) l_index (volatile! nil)]
        (vreset! l_list (JR/invoke this :jm_getGameKeyEventList_0))
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_anyType (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (vreset! l_key (JR/scall 'GameKeyEventUtil :jm_getKey_1 @l_anyType))
            (if (JR/eq @l_key (JR/sget 'Canvas "RIGHT"))
                (do
                (JR/invoke (JR/invoke (JR/invoke this :jm_getHighScoresCanvas_0) :jm_getGameInfo_0) :jm_nextGameLevel_0))
                (if (JR/eq @l_key (JR/sget 'Canvas "LEFT"))
                (do
                (JR/invoke (JR/invoke (JR/invoke this :jm_getHighScoresCanvas_0) :jm_getGameInfo_0) :jm_previousGameLevel_0))))
            (JR/invoke (JR/invoke this :jm_getHighScoresCanvas_0) :jm_executeUpdate_0)))
        (JR/invoke @l_list :jm_clear_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_width (volatile! nil) l_topScoresWidth (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_width (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastWidth_0))
        (vreset! l_topScoresWidth (JR/ishr (JR/invoke (JR/invoke @l_graphics :jm_getFont_0) :jm_stringWidth_1 (JR/fget this :INSTRUCTIONS)) 1))
        (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :INSTRUCTIONS) (unchecked-int (unchecked-subtract (JR/ishr @l_width 1) @l_topScoresWidth)) (unchecked-int (unchecked-multiply (JR/fget this :fontHeight) 2)) (JR/fget this :anchor))))



