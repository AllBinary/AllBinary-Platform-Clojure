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

(ns GameLayerUtil)

(JR/register 'GameLayerUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameLayerUtil)] (jinit_0 o) o))

    
(defn jm_isOnScreen_1 [p_layer]
  (let [this nil l_layer (volatile! p_layer) l_displayInfo (volatile! nil) l_viewPosition (volatile! nil)]
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_viewPosition (JR/invoke @l_layer :jm_getViewPosition_0))
        (GameLayerUtil/jm_isInside_8 (JR/invoke @l_viewPosition :jm_getX_0) (JR/invoke @l_viewPosition :jm_getY_0) (JR/invoke @l_viewPosition :jm_getX2_0) (JR/invoke @l_viewPosition :jm_getY2_0) 0 0 (JR/invoke @l_displayInfo :jm_getLastWidth_0) (JR/invoke @l_displayInfo :jm_getLastHeight_0))))

    
(defn jm_isInside_8 [p_rectX1 p_rectY1 p_rectX2 p_rectY2 p_rect2X1 p_rect2Y1 p_rect2X2 p_rect2Y2]
  (let [this nil l_rectX1 (volatile! p_rectX1) l_rectY1 (volatile! p_rectY1) l_rectX2 (volatile! p_rectX2) l_rectY2 (volatile! p_rectY2) l_rect2X1 (volatile! p_rect2X1) l_rect2Y1 (volatile! p_rect2Y1) l_rect2X2 (volatile! p_rect2X2) l_rect2Y2 (volatile! p_rect2Y2)]
        (if (and (and (and (> @l_rectX1 @l_rect2X1) (< @l_rectX2 @l_rect2X2)) (> @l_rectY1 @l_rect2Y1)) (< @l_rectY2 @l_rect2Y2))
            (do
            true)
            (do
            false))))



