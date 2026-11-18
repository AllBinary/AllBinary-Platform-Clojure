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

(ns AllBinaryGameLayer)

(JR/register 'AllBinaryGameLayer 'AllBinaryLayer '[ViewPositionEventListenerInterface OpenGLSurfaceChangedInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :basicSetColorUtil nil)
  (JR/fset this :RED nil)
  (JR/fset this :paintable nil)
  (JR/fset this :gameKeyEventList nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :basicSetColorUtil (JR/scall 'BasicColorSetUtil :jm_getInstance_0))
    (JR/fset this :RED (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :RED))
    (JR/fset this :paintable (AllBinaryGameLayer/jm_createPaintable_0))
    (JR/fset this :gameKeyEventList (BasicArrayListD/jnew_0))
  this)

    
(defn jm_createPaintable_0 []
  (let [this nil](JR/method
        (if (JR/sget 'SWTUtil "isSWT")
            (do
            (JR/jreturn (SWTBlackPaintable/jnew_0))))
        (JR/scall 'NullPaintable :jm_getInstance_0))))

    
(defn jinit_3 [this p_name p_layerInfo p_viewPosition]
  (let [ l_name (volatile! p_name) l_layerInfo (volatile! p_layerInfo) l_viewPosition (volatile! p_viewPosition)]
        (AllBinaryLayer/jinit_3 this @l_name @l_layerInfo @l_viewPosition) (jinitfields this))
  this)

(defn jnew_3 [p_name p_layerInfo p_viewPosition ]
  (let [o (JR/alloc 'AllBinaryGameLayer)] (jinit_3 o p_name p_layerInfo p_viewPosition) o))

    
(defn jm_set_1 [this p_gl]
  (let [ l_gl (volatile! p_gl)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_move_0 [this]
  (let []
        nil))

    
(defn jm_getGameKeyEventList_0 [this]
  (let []
        (JR/fget this :gameKeyEventList)))

    
(defn jm_processInput_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_processTick_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onViewPositionChangeEvent_0 [this]
  (let []
        (JR/invoke this :jm_onChangeEvent_1 (JR/fget this :viewPositionEvent))))

    
(defn jm_onChangeEvent_1 [this p_layerManagerEvent]
  (let [ l_layerManagerEvent (volatile! p_layerManagerEvent)]
        (if (JR/scall 'GameLayerUtil :jm_isOnScreen_1 this)
            (do
            (JR/invoke this :jm_setVisible_1 true))
            (do
            (JR/invoke this :jm_setVisible_1 false)))))

    
(defn jm_paintFirst_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :paintable) :jm_paint_1 @l_graphics)))

    
(defn jm_paintDebug_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_viewPosition (volatile! nil) l_viewX (volatile! nil) l_viewY (volatile! nil)]
        (vreset! l_viewPosition (JR/invoke this :jm_getViewPosition_0))
        (vreset! l_viewX (JR/invoke @l_viewPosition :jm_getX_0))
        (vreset! l_viewY (JR/invoke @l_viewPosition :jm_getY_0))
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/fget this :RED))
        (JR/invoke @l_graphics :jm_drawRect_4 @l_viewX @l_viewY (JR/invoke this :jm_getWidth_0) (JR/invoke this :jm_getHeight_0))))

    
(defn jm_setWidth_1 [this p_width]
  (let [ l_width (volatile! p_width)]
        (JR/invoke-super 'AllBinaryLayer this :jm_setLayerWidth_1 @l_width)
        (JR/invoke this :jm_setHalfWidth_1 (JR/ishr @l_width 1))))

    
(defn jm_setHeight_1 [this p_height]
  (let [ l_height (volatile! p_height)]
        (JR/invoke-super 'AllBinaryLayer this :jm_setLayerHeight_1 @l_height)
        (JR/invoke this :jm_setHalfHeight_1 (JR/ishr @l_height 1))))



