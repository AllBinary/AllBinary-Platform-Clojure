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
;; package org.allbinary.game.displayable.canvas

(ns CheatGameInputProcessor)

(JR/register 'CheatGameInputProcessor 'PlayerGameInput '[])

(def jsv_inputProcessor (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_inputProcessor [] (JR/ensure-init jclinit-state jclinit) @jsv_inputProcessor)
(defn jstatic_set_inputProcessor [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_inputProcessor v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_inputProcessor (JR/sget 'SpecialGameInputFactory "NO_SPECIAL_GAME_INPUT"))
    nil))

(defn jinitfields [this]
  (JR/fset this :PROCESS_GAME nil)
  (JR/fset this :gameCanvas nil)
  (JR/fset this :gameKeyFactory nil)
    (JR/fset this :PROCESS_GAME "processGame")
    (JR/fset this :gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_gameCanvas]
  (let [ l_gameCanvas (volatile! p_gameCanvas)]
        (PlayerGameInput/jinit_3 this (BasicArrayListD/jnew_0) (BasicArrayListD/jnew_0) (unchecked-int (unchecked-negate (JR/c2i 1)))) (jinitfields this)
        (JR/fset this :gameCanvas @l_gameCanvas))
  this)

(defn jnew_1 [p_gameCanvas ]
  (let [o (JR/alloc 'CheatGameInputProcessor)] (jinit_1 o p_gameCanvas) o))

    
(defn jm_update_0 [this]
  (let [ l_gameLayerManager (volatile! nil) l_list (volatile! nil) l_size (volatile! nil) l_anyType (volatile! nil) l_key (volatile! nil) l_index (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_gameLayerManager (JR/invoke (JR/fget this :gameCanvas) :jm_getLayerManager_0))
            (vreset! l_list (JR/invoke this :jm_getGameKeyEventList_0))
            (vreset! l_size (JR/invoke @l_list :jm_size_0))
            (do (vreset! l_index 0)
                (JR/jfor true false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_anyType (JR/aget* (JR/fget @l_list :objectArray) @l_index))
                (vreset! l_key (JR/scall 'GameKeyEventUtil :jm_getKey_1 @l_anyType))
                (if (== @l_key (JR/invoke (JR/fget (JR/fget this :gameKeyFactory) :LEVEL_DOWN) :jm_getId_0))
                    (do
                    (JR/invoke (CheatGameInputProcessor/jstatic_inputProcessor) :jm_strafeLeft_0)
                    (JR/jbreak))
                    (if (== @l_key (JR/invoke (JR/fget (JR/fget this :gameKeyFactory) :LEVEL_UP) :jm_getId_0))
                    (do
                    (JR/invoke (CheatGameInputProcessor/jstatic_inputProcessor) :jm_strafeRight_0)
                    (JR/jbreak))))
                (if (== @l_key (JR/invoke (JR/fget (JR/fget this :gameKeyFactory) :LEFT) :jm_getId_0))
                    (do
                    (JR/invoke (CheatGameInputProcessor/jstatic_inputProcessor) :jm_left_0)
                    (JR/jbreak))
                    (if (== @l_key (JR/invoke (JR/fget (JR/fget this :gameKeyFactory) :RIGHT) :jm_getId_0))
                    (do
                    (JR/invoke (CheatGameInputProcessor/jstatic_inputProcessor) :jm_right_0)
                    (JR/jbreak))
                    (if (== @l_key (JR/invoke (JR/fget (JR/fget this :gameKeyFactory) :UP) :jm_getId_0))
                    (do
                    (JR/invoke (CheatGameInputProcessor/jstatic_inputProcessor) :jm_up_0)
                    (JR/jbreak))
                    (if (== @l_key (JR/invoke (JR/fget (JR/fget this :gameKeyFactory) :DOWN) :jm_getId_0))
                    (do
                    (JR/invoke (CheatGameInputProcessor/jstatic_inputProcessor) :jm_down_0)
                    (JR/jbreak))
                    (if (== @l_key (JR/invoke (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM1) :jm_getId_0))
                    (do
                    (JR/invoke (CheatGameInputProcessor/jstatic_inputProcessor) :jm_special1_2 @l_gameLayerManager (JR/sget 'GameKeyEvent "NONE"))
                    (JR/jbreak))
                    (if (== @l_key (JR/invoke (JR/fget (JR/fget this :gameKeyFactory) :KEY_NUM3) :jm_getId_0))
                    (do
                    (JR/invoke (CheatGameInputProcessor/jstatic_inputProcessor) :jm_special2_2 @l_gameLayerManager (JR/sget 'GameKeyEvent "NONE"))
                    (JR/jbreak))))))))))
            (JR/invoke @l_list :jm_clear_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :UPDATE) @l_e)) :else (throw jt)))))))



