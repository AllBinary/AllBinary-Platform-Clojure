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

(ns DemoCanvasProgressUtil)

(JR/register 'DemoCanvasProgressUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DemoCanvasProgressUtil)] (jinit_0 o) o))

    
(defn jm_showProgress_1 [p_demoCanvas]
  (let [this nil l_demoCanvas (volatile! p_demoCanvas)]
        (DemoCanvasProgressUtil/jm_showProgressOptionallyInTheBackground_2 @l_demoCanvas false)))

    
(defn jm_showProgressOptionallyInTheBackground_2 [p_demoCanvas p_background]
  (let [this nil l_demoCanvas (volatile! p_demoCanvas) l_background (volatile! p_background) l_progressCanvas (volatile! nil) l_paintableArray (volatile! nil)]
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (JR/invoke @l_progressCanvas :jm_startBackground_1 @l_background)
        (vreset! l_paintableArray (JR/anew "Object" 1 2))
        (JR/aset* @l_paintableArray 0 @l_progressCanvas)
        (JR/aset* @l_paintableArray 1 (JR/invoke @l_demoCanvas :jm_getDefaultPaintableInterface_0))
        (JR/invoke @l_demoCanvas :jm_setDefaultPaintableInterface_1 (PaintableComposite/jnew_1 @l_paintableArray))
        (JR/invoke @l_demoCanvas :jm_setPaintableInterface_1 (JR/invoke @l_demoCanvas :jm_getDefaultPaintableInterface_0))))



