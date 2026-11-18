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
;; package org.allbinary.game.input

(ns TestingInputSingleton)

(JR/register 'TestingInputSingleton 'AllBinaryGameLayer '[GameInputInterface])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (TestingInputSingleton/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :inputProcessorArray nil)
  (JR/fset this :testInputPaintable nil)
    (JR/fset this :inputProcessorArray (JR/anew "Object" 1 (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX)))
    (JR/fset this :testInputPaintable (JR/scall 'NullPaintable :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TestingInputSingleton/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
        (AllBinaryGameLayer/jinit_3 this (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'RectangleFactory "SINGLETON") (JR/scall 'ViewPosition :jm_getInstanceD_0)) (jinitfields this)
        (JR/scall 'GameInputProcessorUtil :jm_init_1 (JR/fget this :inputProcessorArray)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TestingInputSingleton)] (jinit_0 o) o))

    
(defn jm_initInputProcessors_0 [this]
  (let []
        nil))

    
(defn jm_initInputProcessorsForTestInput_1 [this p_aTestInputInterface]
  (let [ l_aTestInputInterface (volatile! p_aTestInputInterface) l_testInputInterface (volatile! nil)]
        (vreset! l_testInputInterface @l_aTestInputInterface)
        (JR/fset this :testInputPaintable @l_testInputInterface)
        (JR/aset* (JR/fget this :inputProcessorArray) (JR/sget 'Canvas "UP") (let [] (JR/anon 'GameInputProcessor this {
            :jm_processEvent_2 (fn [jthis p_allbinaryLayerManager p_gameKeyEvent] (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
                (JR/invoke @l_testInputInterface :jm_up_0)))} [])))
        (JR/aset* (JR/fget this :inputProcessorArray) (JR/sget 'Canvas "DOWN") (let [] (JR/anon 'GameInputProcessor this {
            :jm_processEvent_2 (fn [jthis p_allbinaryLayerManager p_gameKeyEvent] (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
                (JR/invoke @l_testInputInterface :jm_down_0)))} [])))
        (JR/aset* (JR/fget this :inputProcessorArray) (JR/sget 'Canvas "LEFT") (let [] (JR/anon 'GameInputProcessor this {
            :jm_processEvent_2 (fn [jthis p_allbinaryLayerManager p_gameKeyEvent] (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
                (JR/invoke @l_testInputInterface :jm_left_0)))} [])))
        (JR/aset* (JR/fget this :inputProcessorArray) (JR/sget 'Canvas "RIGHT") (let [] (JR/anon 'GameInputProcessor this {
            :jm_processEvent_2 (fn [jthis p_allbinaryLayerManager p_gameKeyEvent] (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
                (JR/invoke @l_testInputInterface :jm_right_0)))} [])))
        (JR/aset* (JR/fget this :inputProcessorArray) (JR/sget 'Canvas "KEY_NUM7") (let [] (JR/anon 'GameInputProcessor this {
            :jm_processEvent_2 (fn [jthis p_allbinaryLayerManager p_gameKeyEvent] (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
                (JR/invoke @l_testInputInterface :jm_strafeLeft_0)))} [])))
        (JR/aset* (JR/fget this :inputProcessorArray) (JR/sget 'Canvas "KEY_NUM9") (let [] (JR/anon 'GameInputProcessor this {
            :jm_processEvent_2 (fn [jthis p_allbinaryLayerManager p_gameKeyEvent] (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
                (JR/invoke @l_testInputInterface :jm_strafeRight_0)))} [])))
        (JR/scall 'GameInputProcessorUtil :jm_init_1 (JR/fget this :inputProcessorArray))))

    
(defn jm_processInputList_2 [this p_allbinaryLayerManager p_list]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_list (volatile! p_list) l_key (volatile! nil) l_gameKeyEvent (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_key 0)
        (vreset! l_gameKeyEvent nil)
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_gameKeyEvent (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (vreset! l_key (JR/invoke @l_gameKeyEvent :jm_getKey_0))
            (JR/invoke (JR/aget* (JR/fget this :inputProcessorArray) @l_key) :jm_processEvent_2 @l_allbinaryLayerManager (JR/sget 'GameKeyEvent "NONE"))))))

    
(defn jm_processInput_1 [this p_allbinaryLayerManager]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager)]
        (JR/invoke this :jm_processInputList_2 @l_allbinaryLayerManager (JR/invoke this :jm_getGameKeyEventList_0))
        (JR/invoke (JR/invoke this :jm_getGameKeyEventList_0) :jm_clear_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :testInputPaintable) :jm_paint_1 @l_graphics)))

    
(defn jm_implmentsGameInputInterface_0 [this]
  (let []
        true))



