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
;; package org.allbinary.game.score.displayable

(ns HighScoresCanvas)

(JR/register 'HighScoresCanvas 'GameCommandCanvas '[HighScoresResultsListener])

(def jsv_NAME (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NAME)
(defn jstatic_set_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NAME v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NAME "HighScoresCanvas")
    nil))

(defn jinitfields [this]
  (JR/fset this :paintable nil)
  (JR/fset this :highScoreCommandsFactory nil)
  (JR/fset this :waitPaintable nil)
  (JR/fset this :highScoresPaintable nil)
  (JR/fset this :highScoresFactoryInterface nil)
  (JR/fset this :colorFillPaintable nil)
  (JR/fset this :highScoresHelper nil)
  (JR/fset this :gameInfo nil)
  (JR/fset this :highScoresCanvasInputProcessor nil)
  (JR/fset this :currentCommand nil)
  (JR/fset this :hasPainted false)
    (JR/fset this :paintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :highScoreCommandsFactory (JR/scall 'HighScoreCommandsFactory :jm_getInstance_0))
    (JR/fset this :waitPaintable (SimpleTextPaintable/jnew_2 (JR/fget (JR/fget this :commonStrings) :PLEASE_WAIT_FOR_SERVER) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))
    (JR/fset this :highScoresHelper (HighScoresHelperBase/jnew_0))
    (JR/fset this :currentCommand (JR/aget* (JR/fget (JR/fget this :highScoreCommandsFactory) :HIGH_SCORE_COMMANDS) 0))
    (JR/fset this :hasPainted false)
  this)

    
(defn jinit_6 [this p_commandListener p_allBinaryGameLayerManager p_gameInfo p_paintable p_highScoresFactoryInterface p_highScoresCanvasInputProcessorFactoryInterface]
  (let [ l_commandListener (volatile! p_commandListener) l_allBinaryGameLayerManager (volatile! p_allBinaryGameLayerManager) l_gameInfo (volatile! p_gameInfo) l_paintable (volatile! p_paintable) l_highScoresFactoryInterface (volatile! p_highScoresFactoryInterface) l_highScoresCanvasInputProcessorFactoryInterface (volatile! p_highScoresCanvasInputProcessorFactoryInterface)]
        (GameCommandCanvas/jinit_4 this @l_commandListener (HighScoresCanvas/jstatic_NAME) (JR/invoke @l_allBinaryGameLayerManager :jm_getBackgroundBasicColor_0) (JR/invoke @l_allBinaryGameLayerManager :jm_getForegroundBasicColor_0)) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/fset this :highScoresPaintable @l_paintable)
        (JR/fset this :highScoresFactoryInterface @l_highScoresFactoryInterface)
        (JR/fset this :highScoresCanvasInputProcessor (JR/invoke @l_highScoresCanvasInputProcessorFactoryInterface :jm_getInstance_1 this))
        (JR/fset this :gameInfo @l_gameInfo)
        (JR/invoke (JR/fget this :waitPaintable) :jm_setBasicColorP_1 (JR/invoke @l_allBinaryGameLayerManager :jm_getForegroundBasicColor_0))
        (JR/invoke (JR/invoke this :jm_getHighScoresPaintable_0) :jm_setBasicColorP_1 (JR/invoke @l_allBinaryGameLayerManager :jm_getForegroundBasicColor_0))
        (JR/fset this :colorFillPaintable (JR/invoke (JR/scall 'ColorFillPaintableFactory :jm_getInstance_0) :jm_getInstance_2 (JR/invoke @l_allBinaryGameLayerManager :jm_getBackgroundBasicColor_0) false))
        (if (== (JR/alen (JR/invoke (JR/fget this :highScoresHelper) :jm_getHighScoresArray_0)) (JR/alen (JR/fget (JR/scall 'NoHighScoresFactory :jm_getInstance_0) :NO_HIGH_SCORES)))
            (do
            (JR/invoke this :jm_setPaintable_1 (JR/fget this :waitPaintable)))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Show HighScores that are already loaded" this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
            (JR/invoke this :jm_updateCommand_1 (JR/fget this :currentCommand))
            (JR/invoke this :jm_setPaintable_1 (JR/invoke this :jm_getHighScoresPaintable_0))))
        (JR/invoke (JR/scall 'SecondaryThreadPool :jm_getInstance_0) :jm_runTask_1 (HighScoreRunnable/jnew_1 this)))
  this)

(defn jnew_6 [p_commandListener p_allBinaryGameLayerManager p_gameInfo p_paintable p_highScoresFactoryInterface p_highScoresCanvasInputProcessorFactoryInterface ]
  (let [o (JR/alloc 'HighScoresCanvas)] (jinit_6 o p_commandListener p_allBinaryGameLayerManager p_gameInfo p_paintable p_highScoresFactoryInterface p_highScoresCanvasInputProcessorFactoryInterface) o))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke this :jm_addCommand_1 (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :CLOSE_AND_SHOW_GAME_CANVAS))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_open_0 [this]
  (let []
        (JR/invoke-super 'GameCommandCanvas this :jm_open_0)
        (JR/invoke (JR/fget this :highScoresCanvasInputProcessor) :jm_open_0)))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke-super 'GameCommandCanvas this :jm_close_0)
        (JR/invoke (JR/fget this :highScoresCanvasInputProcessor) :jm_close_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :colorFillPaintable) :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :paintable) :jm_paint_1 @l_graphics)
        (if (not (JR/eq (JR/fget this :waitPaintable) (JR/fget this :paintable)))
            (do
            (JR/invoke (JR/fget this :highScoresCanvasInputProcessor) :jm_paint_1 @l_graphics)))
        (JR/invoke-super 'GameCommandCanvas this :jm_paint_1 @l_graphics)
        (JR/fset this :hasPainted true)))

    
(defn jm_executeUpdate_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :highScoresFactoryInterface) :jm_fetchHighScores_2 (JR/invoke this :jm_getGameInfo_0) this))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :UPDATE) @l_e)) :else (throw jt)))))))

    
(defn jm_getHighScoresPaintable_0 [this]
  (let []
        (JR/fget this :highScoresPaintable)))

    
(defn jm_setHighScoresArray_1 [this p_highScoresArray]
  (let [ l_highScoresArray (volatile! p_highScoresArray) l_e (volatile! nil)]
        (try (do
            (if (some? @l_highScoresArray)
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :START)) :jm_appendint_1 (JR/alen @l_highScoresArray))) this "setHighScoresArray"))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "setHighScoresArray")))
            (JR/invoke (JR/fget this :highScoresHelper) :jm_setHighScoresArray_1 @l_highScoresArray)
            (JR/invoke this :jm_updateCommand_1 (JR/fget this :currentCommand))
            (JR/invoke this :jm_setPaintable_1 (JR/invoke this :jm_getHighScoresPaintable_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :UPDATE) @l_e)) :else (throw jt)))))))

    
(defn jm_updateCommand_1 [this p_command]
  (let [ l_command (volatile! p_command) l_gameCommandsFactory (volatile! nil) l_index (volatile! nil) l_nextIndex (volatile! nil) l_highScoresArray (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :START)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_command))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
        (vreset! l_gameCommandsFactory (JR/scall 'GameCommandsFactory :jm_getInstance_0))
        (if (JR/invoke (JR/fget this :highScoreCommandsFactory) :jm_isHighScoreCommand_1 @l_command)
            (do
            (vreset! l_index (JR/invoke (JR/fget this :highScoreCommandsFactory) :jm_getIndex_1 @l_command))
            (vreset! l_nextIndex (unchecked-int (unchecked-add @l_index 1)))
            (vreset! l_highScoresArray (JR/invoke (JR/fget this :highScoresHelper) :jm_getHighScoresArray_0))
            (if (>= @l_nextIndex (JR/alen @l_highScoresArray))
                (do
                (vreset! l_nextIndex 0)))
            (if (> (JR/alen @l_highScoresArray) 0)
                (do
                (JR/invoke (JR/invoke this :jm_getHighScoresPaintable_0) :jm_setHighScores_1 (JR/aget* @l_highScoresArray @l_index)))
                (do
                (JR/invoke (JR/invoke this :jm_getHighScoresPaintable_0) :jm_setHighScores_1 (JR/scall 'NullHighScoresSingletonFactory :jm_getInstance_0))))
            (if (not (== @l_index @l_nextIndex))
                (do
                (JR/invoke this :jm_removeAllCommands_0)
                (JR/invoke this :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :CLOSE_AND_SHOW_GAME_CANVAS))
                (JR/invoke this :jm_addCommand_1 (JR/aget* (JR/fget (JR/fget this :highScoreCommandsFactory) :HIGH_SCORE_COMMANDS) @l_nextIndex))))))
        (JR/fset this :currentCommand @l_command)
        (JR/invoke this :jm_close_0)
        (JR/invoke-super 'GameCommandCanvas this :jm_initMenu_0)
        (JR/invoke this :jm_open_0)
        (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this)))

    
(defn jm_getGameInfo_0 [this]
  (let []
        (JR/fget this :gameInfo)))

    
(defn jm_setPaintable_1 [this p_paintable]
  (let [ l_paintable (volatile! p_paintable)]
        (JR/fset this :paintable @l_paintable)
        (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this)))



