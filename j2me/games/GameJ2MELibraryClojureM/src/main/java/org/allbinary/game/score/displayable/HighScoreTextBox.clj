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

(ns HighScoreTextBox)

(JR/register 'HighScoreTextBox 'CustomTextBox '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :virtualKeyboardEventHandler nil)
  (JR/fset this :highScoreUtil nil)
  (JR/fset this :pleaseWait nil)
  (JR/fset this :paintable nil)
  (JR/fset this :submitted false)
    (JR/fset this :virtualKeyboardEventHandler (JR/scall 'VirtualKeyboardEventHandler :jm_getInstance_0))
    (JR/fset this :pleaseWait (SimpleTextPaintable/jnew_2 (JR/fget (JR/fget this :commonStrings) :PLEASE_WAIT) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))
    (JR/fset this :paintable (JR/scall 'NullPaintable :jm_getInstance_0))
    (JR/fset this :submitted false)
  this)

    
(defn jinit_9 [this p_highScoresFactoryInterface p_highScoresHelper p_abeClientInformation p_gameInfo p_cmdListener p_name p_highScore p_backgrounBasicColor p_foregroundBasicColor]
  (let [ l_highScoresFactoryInterface (volatile! p_highScoresFactoryInterface) l_highScoresHelper (volatile! p_highScoresHelper) l_abeClientInformation (volatile! p_abeClientInformation) l_gameInfo (volatile! p_gameInfo) l_cmdListener (volatile! p_cmdListener) l_name (volatile! p_name) l_highScore (volatile! p_highScore) l_backgrounBasicColor (volatile! p_backgrounBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_operatingSystemInterface (volatile! nil) l_username (volatile! nil)]
        (CustomTextBox/jinit_8 this @l_cmdListener "New High Score Enter Name:" @l_name 12 (JR/sget 'TextField "ANY") (JR/scall 'Font :jm_getDefaultFont_0) @l_backgrounBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/fset this :highScoreUtil (HighScoreUtil/jnew_7 @l_highScoresFactoryInterface @l_highScoresHelper @l_abeClientInformation @l_gameInfo @l_cmdListener @l_name @l_highScore))
        (vreset! l_operatingSystemInterface (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0))
        (if (JR/invoke @l_operatingSystemInterface :jm_isOverScan_0)
            (do
            (vreset! l_username (JR/invoke (JR/scall 'InApplicationPurchaseFactory :jm_getInstance_0) :jm_getUserName_0))
            (JR/invoke (JR/invoke this :jm_getTextFieldItem_0) :jm_setString_1 @l_username))))
  this)

(defn jnew_9 [p_highScoresFactoryInterface p_highScoresHelper p_abeClientInformation p_gameInfo p_cmdListener p_name p_highScore p_backgrounBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'HighScoreTextBox)] (jinit_9 o p_highScoresFactoryInterface p_highScoresHelper p_abeClientInformation p_gameInfo p_cmdListener p_name p_highScore p_backgrounBasicColor p_foregroundBasicColor) o))

    
(defn jm_initCommands_1 [this p_cmdListener]
  (let [ l_cmdListener (volatile! p_cmdListener)]
        (JR/invoke this :jm_removeAllCommands_0)
        (JR/invoke (JR/scall 'PostGameCommandFactory :jm_getInstance_0) :jm_addCommands_1 this)
        (JR/invoke this :jm_addCommand_1 (JR/sget 'HighScoreUtil "SUBMIT_TEXTBOX_COMMAND"))
        (JR/invoke this :jm_setCommandListener_1 @l_cmdListener)))

    
(defn jm_open_0 [this]
  (let []
        (JR/invoke (JR/fget this :virtualKeyboardEventHandler) :jm_open_0)
        (JR/fset this :paintable (JR/scall 'NullPaintable :jm_getInstance_0))
        (JR/invoke-super 'CustomTextBox this :jm_open_0)))

    
(defn jm_close_0 [this]
  (let []
        (JR/invoke (JR/fget this :virtualKeyboardEventHandler) :jm_close_0)
        (JR/fset this :paintable (JR/fget this :pleaseWait))
        (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this)
        (JR/invoke-super 'CustomTextBox this :jm_close_0)
        (JR/invoke this :jm_removeCommand_1 (JR/sget 'HighScoreUtil "SUBMIT_TEXTBOX_COMMAND"))
        (JR/invoke this :jm_update_0)
        (if (JR/fget this :submitted)
            (do
            (JR/invoke (JR/fget this :highScoreUtil) :jm_saveHighScore_0))
            (do
            nil))
        (JR/fset this :paintable (JR/scall 'NullPaintable :jm_getInstance_0))
        (JR/invoke (JR/fget this :repaintBehavior) :jm_onChangeRepaint_1 this)))

    
(defn jm_update_0 [this]
  (let [ l_name (volatile! nil)]
        (vreset! l_name (JR/invoke (JR/invoke this :jm_getTextFieldItem_0) :jm_getString_0))
        (JR/invoke (JR/fget this :highScoreUtil) :jm_update_1 @l_name)
        (JR/invoke-super 'CustomTextBox this :jm_update_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke-super 'CustomTextBox this :jm_paint_1 @l_graphics)
        (JR/invoke (JR/fget this :paintable) :jm_paint_1 @l_graphics)))

    
(defn jm_saveHighScore_0 [this]
  (let []
        (JR/invoke (JR/fget this :highScoreUtil) :jm_saveHighScore_0)))

    
(defn jm_submit_0 [this]
  (let []
        (JR/invoke (JR/fget this :highScoreUtil) :jm_submit_1 this)))



