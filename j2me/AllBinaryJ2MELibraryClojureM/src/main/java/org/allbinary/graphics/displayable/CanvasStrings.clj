;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.graphics.displayable

(ns CanvasStrings)

(JR/register 'CanvasStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CanvasStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :CONSTRUCTOR nil)
  (JR/fset this :PAUSE nil)
  (JR/fset this :UN_PAUSE nil)
  (JR/fset this :SET_FULL_SCREEN_MODE nil)
  (JR/fset this :SIZE_CHANGED nil)
  (JR/fset this :SCALED_IMAGES nil)
  (JR/fset this :PAINT nil)
  (JR/fset this :ON_DISPLAY_CHANGE_EVENT nil)
  (JR/fset this :UPDATE_MEASUREMENT nil)
  (JR/fset this :FD_WIDTH nil)
  (JR/fset this :FD_HEIGHT nil)
  (JR/fset this :EMPTY_CHILD_NAME_LIST nil)
  (JR/fset this :ABOUT nil)
  (JR/fset this :OPTIONS nil)
  (JR/fset this :FONT_ATLAS nil)
  (JR/fset this :OBJ_MODEL nil)
  (JR/fset this :MD2_MODEL nil)
  (JR/fset this :_PNG nil)
    (JR/fset this :CONSTRUCTOR "MyCanvas::MyCanvas")
    (JR/fset this :PAUSE "MyCanvas::pause")
    (JR/fset this :UN_PAUSE "MyCanvas::unPause")
    (JR/fset this :SET_FULL_SCREEN_MODE "setFullScreenMode")
    (JR/fset this :SIZE_CHANGED "sizeChanged")
    (JR/fset this :SCALED_IMAGES "scaledImages")
    (JR/fset this :PAINT "paint")
    (JR/fset this :ON_DISPLAY_CHANGE_EVENT "onDisplayChangeEvent")
    (JR/fset this :UPDATE_MEASUREMENT "updateMeasurement")
    (JR/fset this :FD_WIDTH " font/display width: ")
    (JR/fset this :FD_HEIGHT " font/display height: ")
    (JR/fset this :EMPTY_CHILD_NAME_LIST (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
    (JR/fset this :ABOUT "About")
    (JR/fset this :OPTIONS "Options")
    (JR/fset this :FONT_ATLAS "/font.png")
    (JR/fset this :OBJ_MODEL "_obj")
    (JR/fset this :MD2_MODEL "_md2")
    (JR/fset this :_PNG ".png")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CanvasStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CanvasStrings/jstatic_instance)))



