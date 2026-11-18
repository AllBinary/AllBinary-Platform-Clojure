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
;; package org.allbinary.graphics.canvas.transition.progress

(ns ProgressCanvas)

(JR/register 'ProgressCanvas 'RunnableCanvas '[PaintableInterface UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :hasPainted false)
  (JR/fset this :backgroundBasicColor nil)
  (JR/fset this :GAUGE_PAINTABLE nil)
  (JR/fset this :maxValue 0.0)
  (JR/fset this :gauge nil)
  (JR/fset this :TEXT nil)
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :allbinaryMidlet nil)
  (JR/fset this :value 0.0)
  (JR/fset this :text nil)
  (JR/fset this :background false)
  (JR/fset this :paintable nil)
  (JR/fset this :inProgress false)
  (JR/fset this :IN_GAME_PROCESSOR nil)
  (JR/fset this :inGameProcessor nil)
  (JR/fset this :progressEndListener nil)
  (JR/fset this :backgroundLabel nil)
  (JR/fset this :START_BACKGROUND nil)
  (JR/fset this :ADD_PORTION nil)
  (JR/fset this :ADD_EARLY_PORTION nil)
    (JR/fset this :GAUGE_PAINTABLE (ProgressPaintable/jnew_1 this))
    (JR/fset this :maxValue 100.0)
    (JR/fset this :TEXT (JR/fget (JR/fget this :commonStrings) :LOADING))
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :allbinaryMidlet (JR/scall 'AllBinaryMidlet :jm_getNullInstance_0))
    (JR/fset this :text (JR/fget this :TEXT))
    (JR/fset this :background true)
    (JR/fset this :paintable (JR/fget this :GAUGE_PAINTABLE))
    (JR/fset this :inProgress false)
    (JR/fset this :IN_GAME_PROCESSOR (let [ l_pathFindingThreadPool (volatile! (JR/scall 'PathFindingThreadPool :jm_getInstance_0))] (JR/anon 'Processor this {
        :jm_process_0 (fn [jthis] (let []
            (JR/invoke (JR/fget jthis :pathFindingThreadPool) :jm_runAPriorityTask_0)))} [])))
    (JR/fset this :inGameProcessor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :progressEndListener (JR/sget 'ProgressEndListener "instance"))
    (JR/fset this :backgroundLabel "Background AI Game Loading...")
    (JR/fset this :START_BACKGROUND "startBackground")
    (JR/fset this :ADD_PORTION "addPortion")
    (JR/fset this :ADD_EARLY_PORTION "addEarlyPortion")
  this)

    
(defn jinit_3 [this p_title p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_title (volatile! p_title) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (RunnableCanvas/jinit_3 this (JR/sget 'NullCommandListener "NULL_COMMAND_LISTENER") (JR/fget (JR/scall 'CanvasStrings :jm_getInstance_0) :EMPTY_CHILD_NAME_LIST) false) (jinitfields this)
        (JR/fset this :backgroundBasicColor @l_backgroundBasicColor)
        (JR/fset this :gauge (ABCustomGaugeItem/jnew_5 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/d2i (JR/fget this :maxValue)) 0 @l_backgroundBasicColor @l_foregroundBasicColor)))
  this)

(defn jnew_3 [p_title p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ProgressCanvas)] (jinit_3 o p_title p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/invoke (JR/fget this :gauge) :jm_setHeight_1 (unchecked-int (unchecked-add (JR/invoke @l_font :jm_getHeight_0) 2)))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_init_1 [this p_gameMidlet]
  (let [ l_gameMidlet (volatile! p_gameMidlet)]
        (JR/fset this :allbinaryMidlet @l_gameMidlet)))

    
(defn jm_update_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        nil))

    
(defn jm_getMaxValue_0 [this]
  (let []
        (JR/fget this :maxValue)))

    
(defn jm_start_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :START_METHOD_NAME))
        (JR/invoke this :jm_setBackground_1 true)
        (JR/invoke (JR/fget this :gauge) :jm_setHeight_1 30)
        (JR/invoke (JR/fget this :gauge) :jm_setLabel_1 (JR/fget (JR/fget this :commonStrings) :PLEASE_WAIT))
        (JR/invoke this :jm_setText_1 (JR/fget this :TEXT))
        (JR/invoke this :jm_setValue_1 0)
        (JR/fset this :inGameProcessor (JR/scall 'Processor :jm_getInstance_0))
        (JR/fset this :paintable (JR/fget this :GAUGE_PAINTABLE))
        (JR/fset this :inProgress true)))

    
(defn jm_startBackground_1 [this p_background]
  (let [ l_background (volatile! p_background)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget this :START_BACKGROUND))
        (JR/invoke this :jm_setBackground_1 @l_background)
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
        (JR/invoke (JR/fget this :gauge) :jm_setLabel_1 (JR/fget this :backgroundLabel))
        (JR/invoke this :jm_setText_1 (JR/fget this :TEXT))
        (JR/invoke this :jm_setValue_1 0)
        (JR/fset this :inGameProcessor (JR/scall 'Processor :jm_getInstance_0))
        (JR/fset this :paintable (JR/fget this :GAUGE_PAINTABLE))))

    
(defn jm_endActual_0 [this]
  (let []
        (JR/invoke (JR/fget this :allbinaryMidlet) :jm_commandAction_2 (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :SHOW_GAME_CANVAS) (JR/sget 'NullCanvas "NULL_CANVAS"))
        (JR/fset this :inProgress false)
        (JR/invoke this :jm_inGame_0)))

    
(defn jm_inGame_0 [this]
  (let []
        (JR/invoke (JR/fget this :progressEndListener) :jm_onEndEvent_0)
        (JR/fset this :inGameProcessor (JR/fget this :IN_GAME_PROCESSOR))))

    
(defn jm_end_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :END_METHOD_NAME))
        (JR/invoke (JR/fget this :gauge) :jm_setValue_1 (JR/invoke this :jm_getMaxValue_0))
        (JR/invoke this :jm_endActual_0)
        (JR/fset this :paintable (JR/scall 'NullPaintable :jm_getInstance_0))))

    
(defn jm_endFromInitialLazyLoadingComplete_0 [this]
  (let []
        (JR/invoke (JR/fget this :progressEndListener) :jm_onEndEvent_0)
        (JR/invoke (JR/fget this :gauge) :jm_setValue_1 (JR/invoke this :jm_getMaxValue_0))
        (JR/fset this :inGameProcessor (JR/fget this :IN_GAME_PROCESSOR))))

    
(defn jm_isInGame_0 [this]
  (let [](JR/method
        (if (JR/eq (JR/fget this :inGameProcessor) (JR/fget this :IN_GAME_PROCESSOR))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_endIfPaintedSinceStart_0 [this]
  (let []
        nil))

    
(defn jm_addEarlyPortion_3 [this p_value p_text p_index]
  (let [ l_value (volatile! p_value) l_text (volatile! p_text) l_index (volatile! p_index)]
        (JR/invoke this :jm_setText_1 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_text) :jm_append_1 (JR/to-string-of (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 @l_index)))))
        (JR/invoke (JR/fget this :gauge) :jm_setValue_1 (+ (JR/invoke (JR/fget this :gauge) :jm_getValue_0) (/ (double (JR/invoke this :jm_getMaxValue_0)) (JR/f32 @l_value))))))

    
(defn jm_addPortion_3 [this p_value p_text p_index]
  (let [ l_value (volatile! p_value) l_text (volatile! p_text) l_index (volatile! p_index)]
        (JR/invoke this :jm_setText_1 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_text) :jm_append_1 (JR/to-string-of (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 @l_index)))))
        (JR/scall 'PreLogUtil :jm_put_3 (JR/fget this :text) this (JR/fget this :ADD_PORTION))
        (JR/invoke (JR/fget this :gauge) :jm_setValue_1 (+ (JR/invoke (JR/fget this :gauge) :jm_getValue_0) (/ (double (JR/invoke this :jm_getMaxValue_0)) (JR/f32 @l_value))))))

    
(defn jm_addNormalPortion_2 [this p_value p_text]
  (let [ l_value (volatile! p_value) l_text (volatile! p_text)]
        (if (not (JR/eq (JR/fget this :text) @l_text))
            (do
            (JR/scall 'PreLogUtil :jm_put_3 @l_text this (JR/fget this :ADD_PORTION))))
        (JR/invoke this :jm_setText_1 @l_text)
        (JR/invoke (JR/fget this :gauge) :jm_setValue_1 (+ (JR/invoke (JR/fget this :gauge) :jm_getValue_0) (/ (double (JR/invoke this :jm_getMaxValue_0)) (JR/f32 @l_value))))))

    
(defn jm_setValue_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :value (JR/f32 @l_value))
        (JR/invoke (JR/fget this :gauge) :jm_setValue_1 (JR/f32 @l_value))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :paintable) :jm_paint_1 @l_graphics)))

    
(defn jm_paint2_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke (JR/fget this :backgroundBasicColor) :jm_intValue_0))
        (JR/invoke @l_graphics :jm_fillRect_4 0 0 (JR/invoke (JR/fget this :displayInfo) :jm_getLastWidth_0) (JR/invoke (JR/fget this :displayInfo) :jm_getLastHeight_0))
        (JR/invoke (JR/fget this :gauge) :jm_paintXY_3 @l_graphics 0 0)
        (JR/fset this :hasPainted true)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_getValue_0 [this]
  (let []
        (JR/fget this :value)))

    
(defn jm_setText_1 [this p_text]
  (let [ l_text (volatile! p_text)]
        (JR/fset this :text @l_text)))

    
(defn jm_getText_0 [this]
  (let []
        (JR/fget this :text)))

    
(defn jm_setBackground_1 [this p_background]
  (let [ l_background (volatile! p_background)]
        (JR/fset this :background @l_background)))

    
(defn jm_isBackground_0 [this]
  (let []
        (JR/fget this :background)))



