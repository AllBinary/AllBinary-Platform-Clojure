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
;; package org.allbinary.game.layer

(ns AllBinaryGameLayerManager)

(JR/register 'AllBinaryGameLayerManager 'AllBinaryLayerManager '[])

(def jsv_NULL_ALLBINARY_LAYER_MANAGER (atom nil))
(def jsv_ID (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ALLBINARY_LAYER_MANAGER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ALLBINARY_LAYER_MANAGER)
(defn jstatic_set_NULL_ALLBINARY_LAYER_MANAGER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ALLBINARY_LAYER_MANAGER v))
(defn jstatic_ID [] (JR/ensure-init jclinit-state jclinit) @jsv_ID)
(defn jstatic_set_ID [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_ID v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ALLBINARY_LAYER_MANAGER (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    (reset! jsv_ID (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 22))
    nil))

(defn jinitfields [this]
  (JR/fset this :backgroundBasicColor nil)
  (JR/fset this :foregroundBasicColor nil)
  (JR/fset this :gameInfo nil)
  (JR/fset this :playerGameInputCompositeInterface nil)
    (JR/fset this :playerGameInputCompositeInterface (JR/sget 'NullPlayerGameInputComposite "NULL_PLAYER_GAME_INPUT_COMPOSITE"))
  this)

    
(defn jm_getNullInstance_0 []
  (let [this nil]
        (if (JR/eq (AllBinaryGameLayerManager/jstatic_NULL_ALLBINARY_LAYER_MANAGER) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (AllBinaryGameLayerManager/jstatic_set_NULL_ALLBINARY_LAYER_MANAGER (AllBinaryGameLayerManager/jnew_3 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE) (JR/sget 'GameInfo "NONE")))))
        (AllBinaryGameLayerManager/jstatic_NULL_ALLBINARY_LAYER_MANAGER)))

    
(defn jinit_3 [this p_backgroundBasicColor p_foregroundBasicColor p_gameInfo]
  (let [ l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_gameInfo (volatile! p_gameInfo) l_itemColorFactory (volatile! nil)]
    (AllBinaryLayerManager/jinit_0 this) (jinitfields this)
        (JR/fset this :backgroundBasicColor @l_backgroundBasicColor)
        (JR/fset this :foregroundBasicColor @l_foregroundBasicColor)
        (vreset! l_itemColorFactory (JR/scall 'ItemColorFactory :jm_getInstance_0))
        (JR/fset @l_itemColorFactory :INVERT_PAINT (JR/invoke (JR/fget this :backgroundBasicColor) :jm_intValue_0))
        (JR/fset @l_itemColorFactory :PAINT (JR/invoke (JR/fget this :foregroundBasicColor) :jm_intValue_0))
        (JR/fset this :gameInfo @l_gameInfo))
  this)

(defn jnew_3 [p_backgroundBasicColor p_foregroundBasicColor p_gameInfo ]
  (let [o (JR/alloc 'AllBinaryGameLayerManager)] (jinit_3 o p_backgroundBasicColor p_foregroundBasicColor p_gameInfo) o))

    
(defn jm_getLayerManager_0 [this]
  (let []
        this))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_getBackgroundBasicColor_0 [this]
  (let []
        (JR/fget this :backgroundBasicColor)))

    
(defn jm_setBackgroundBasicColor_1 [this p_backgroundBasicColor]
  (let [ l_backgroundBasicColor (volatile! p_backgroundBasicColor)]
        (JR/fset this :backgroundBasicColor @l_backgroundBasicColor)
        (JR/fset (JR/scall 'ItemColorFactory :jm_getInstance_0) :INVERT_PAINT (JR/invoke (JR/fget this :backgroundBasicColor) :jm_intValue_0))))

    
(defn jm_getForegroundBasicColor_0 [this]
  (let []
        (JR/fget this :foregroundBasicColor)))

    
(defn jm_setForegroundBasicColor_1 [this p_foregroundBasicColor]
  (let [ l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (JR/fset this :foregroundBasicColor @l_foregroundBasicColor)
        (JR/fset (JR/scall 'ItemColorFactory :jm_getInstance_0) :PAINT (JR/invoke (JR/fget this :foregroundBasicColor) :jm_intValue_0))))

    
(defn jm_getGameInfo_0 [this]
  (let []
        (JR/fget this :gameInfo)))

    
(defn jm_setGameInfo_1 [this p_gameInfo]
  (let [ l_gameInfo (volatile! p_gameInfo)]
        (JR/fset this :gameInfo @l_gameInfo)))

    
(defn jm_setLayerProcessorList_1 [this p_list]
  (let [ l_list (volatile! p_list) l_layerProcessorInterfaceArray (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_layerProcessorInterfaceArray (JR/anew "Object" 1 (JR/invoke @l_list :jm_size_0)))
        (vreset! l_size (JR/alen @l_layerProcessorInterfaceArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_layerProcessorInterfaceArray @l_index (JR/aget* (JR/fget @l_list :objectArray) @l_index))))
        (JR/invoke this :jm_setLayerProcessorArray_1 @l_layerProcessorInterfaceArray)))

    
(defn jm_setPlayerGameInputCompositeInterface_1 [this p_playerGameInputCompositeInterface]
  (let [ l_playerGameInputCompositeInterface (volatile! p_playerGameInputCompositeInterface)]
        (JR/fset this :playerGameInputCompositeInterface @l_playerGameInputCompositeInterface)))

    
(defn jm_getPlayerGameInputCompositeInterface_0 [this]
  (let []
        (JR/fget this :playerGameInputCompositeInterface)))



