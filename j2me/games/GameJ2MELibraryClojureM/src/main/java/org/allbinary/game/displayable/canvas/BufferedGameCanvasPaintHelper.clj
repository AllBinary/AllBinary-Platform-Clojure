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

(ns BufferedGameCanvasPaintHelper)

(JR/register 'BufferedGameCanvasPaintHelper 'ProcessPaintable '[])

(def jsv_MAX_IMAGES (atom 0))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_MAX_IMAGES [] (JR/ensure-init jclinit-state jclinit) @jsv_MAX_IMAGES)
(defn jstatic_set_MAX_IMAGES [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_MAX_IMAGES v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_MAX_IMAGES 4)
    nil))

(defn jinitfields [this]
  (JR/fset this :gameCanvas nil)
  (JR/fset this :offScreenImage nil)
  (JR/fset this :previousImage nil)
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :drawCircularIndexUtil nil)
  (JR/fset this :anchor 0)
    (JR/fset this :gameCanvas (JR/sget 'NullCanvas "NULL_CANVAS"))
    (JR/fset this :offScreenImage (JR/anew "Object" 1 (BufferedGameCanvasPaintHelper/jstatic_MAX_IMAGES)))
    (JR/fset this :previousImage (JR/sget 'NullImage "NULL_IMAGE"))
    (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (BufferedGameCanvasPaintHelper/jstatic_MAX_IMAGES)))
    (JR/fset this :drawCircularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstanceAt_2 (unchecked-int (unchecked-subtract (BufferedGameCanvasPaintHelper/jstatic_MAX_IMAGES) 1)) (BufferedGameCanvasPaintHelper/jstatic_MAX_IMAGES)))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

    
(defn jinit_1 [this p_gameCanvas]
  (let [ l_gameCanvas (volatile! p_gameCanvas)]
    (ProcessPaintable/jinit_0 this) (jinitfields this)
        (JR/jthrow (new java.lang.Exception "No Longer Used")))
  this)

(defn jnew_1 [p_gameCanvas ]
  (let [o (JR/alloc 'BufferedGameCanvasPaintHelper)] (jinit_1 o p_gameCanvas) o))

    
(defn jm_process_0 [this]
  (let [ l_myCanvas (volatile! nil)]
        (vreset! l_myCanvas (JR/fget this :gameCanvas))
        (JR/invoke @l_myCanvas :jm_draw_1 (JR/invoke (JR/aget* (JR/fget this :offScreenImage) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)) :jm_getGraphics_0))
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)
        (JR/invoke (JR/fget this :drawCircularIndexUtil) :jm_next_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/fset this :previousImage (JR/aget* (JR/fget this :offScreenImage) (JR/invoke (JR/fget this :drawCircularIndexUtil) :jm_getIndex_0)))
        (JR/invoke @l_graphics :jm_drawImage_4 (JR/fget this :previousImage) 0 0 (JR/fget this :anchor))))



