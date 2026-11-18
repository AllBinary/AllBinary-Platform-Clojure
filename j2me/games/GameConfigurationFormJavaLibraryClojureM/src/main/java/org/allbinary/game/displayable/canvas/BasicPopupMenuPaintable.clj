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

(ns BasicPopupMenuPaintable)

(JR/register 'BasicPopupMenuPaintable 'Paintable '[UpdateMyFontInterface])

(def jsv_NAME (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NAME [] (JR/ensure-init jclinit-state jclinit) @jsv_NAME)
(defn jstatic_set_NAME [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NAME v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NAME "MENU")
    nil))

(defn jinitfields [this]
  (JR/fset this :basicSetColorUtil nil)
  (JR/fset this :drawStringUtil nil)
  (JR/fset this :label nil)
  (JR/fset this :foregroundBasicColor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :rectangle nil)
  (JR/fset this :BORDER 0)
  (JR/fset this :heightOffset 0)
  (JR/fset this :offset 0)
  (JR/fset this :animationInterface nil)
    (JR/fset this :basicSetColorUtil (JR/scall 'BasicColorSetUtil :jm_getInstance_0))
    (JR/fset this :drawStringUtil (JR/scall 'DrawVerticalStringUtil :jm_getInstance_0))
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
  this)

    
(defn jinit_3 [this p_rectangle p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_rectangle (volatile! p_rectangle) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :foregroundBasicColor @l_foregroundBasicColor)
        (JR/fset this :label (BasicPopupMenuPaintable/jstatic_NAME))
        (JR/fset this :rectangle @l_rectangle)
        (if (or (JR/scall 'J2MEUtil :jm_isJ2ME_0) (JR/scall 'J2MEUtil :jm_isHTML_0))
            (do
            (JR/fset this :animationInterface (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0)))
            (do
            (JR/fset this :animationInterface (RectangleFilledAnimation/jnew_3 (JR/invoke (JR/fget this :rectangle) :jm_getWidth_0) (JR/invoke (JR/fget this :rectangle) :jm_getHeight_0) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :TRANSPARENT_GREY)))))
        (JR/invoke this :jm_init_1 @l_rectangle))
  this)

(defn jnew_3 [p_rectangle p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'BasicPopupMenuPaintable)] (jinit_3 o p_rectangle p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_features (volatile! nil) l_isOpenGL (volatile! nil) l_BORDER (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_isOpenGL (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL)))
        (JR/invoke (JR/fget this :drawStringUtil) :jm_updateMeasurement_2 @l_graphics (JR/fget this :label))
        (vreset! l_BORDER 0)
        (if (or (JR/scall 'J2MEUtil :jm_isHTML_0) @l_isOpenGL)
            (do
            (vreset! l_BORDER (JR/idiv (JR/scall 'MyFontProcessor :jm_defaultCharWidth_1 @l_font) 2)))
            (if (or (or (JR/scall 'AndroidUtil :jm_isAndroid_0) (JR/scall 'J2MEUtil :jm_isJ2SE_0)) (JR/sget 'SWTUtil "isSWT"))
            (do
            (vreset! l_BORDER (JR/scall 'MyFontProcessor :jm_defaultCharWidth_1 @l_font)))
            (do
            (vreset! l_BORDER (unchecked-int (unchecked-multiply (JR/scall 'MyFontProcessor :jm_defaultCharWidth_1 @l_font) 2))))))
        (JR/fset this :BORDER @l_BORDER)
        (JR/fset this :heightOffset (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :rectangle) :jm_getHeight_0) (unchecked-int (unchecked-multiply (JR/invoke @l_font :jm_getHeight_0) (JR/invoke (BasicPopupMenuPaintable/jstatic_NAME) :jm_length_0))))))
        (if (JR/invoke (JR/scall 'OpenGLFeatureUtil :jm_getInstance_0) :jm_isAnyThreed_0)
            (do
            (JR/fset this :heightOffset (unchecked-int (unchecked-subtract (JR/fget this :heightOffset) (unchecked-int (unchecked-add (JR/invoke @l_font :jm_getHeight_0) 2)))))
            (if (JR/scall 'AndroidUtil :jm_isAndroid_0)
                (do
                (JR/fset this :heightOffset (JR/invoke @l_font :jm_getHeight_0)))
                (do
                (JR/fset this :heightOffset (unchecked-int (unchecked-subtract (JR/fget this :heightOffset) (unchecked-int (unchecked-add (JR/invoke @l_font :jm_getHeight_0) 2)))))))))
        (JR/fset this :offset (unchecked-int (unchecked-add (JR/ishr (JR/fget this :heightOffset) 1) (if (JR/invoke (JR/scall 'SWTJOGLProcessor :jm_getInstance_0) :jm_isJOGL_0) 4 0))))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_init_1 [this p_rectangle]
  (let [ l_rectangle (volatile! p_rectangle) l_width (volatile! nil) l_height (volatile! nil) l_rectangleFilledAnimation (volatile! nil)]
        (JR/fset this :rectangle @l_rectangle)
        (vreset! l_width (JR/invoke (JR/fget this :rectangle) :jm_getWidth_0))
        (vreset! l_height (JR/invoke (JR/fget this :rectangle) :jm_getHeight_0))
        (if (or (JR/scall 'J2MEUtil :jm_isJ2ME_0) (JR/scall 'J2MEUtil :jm_isHTML_0))
            (do
            nil)
            (do
            (vreset! l_rectangleFilledAnimation (JR/fget this :animationInterface))
            (JR/invoke @l_rectangleFilledAnimation :jm_setWidth_1 @l_width)
            (JR/invoke @l_rectangleFilledAnimation :jm_setHeight_1 @l_height)))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_point (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_width (volatile! nil) l_height (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (vreset! l_point (JR/invoke (JR/fget this :rectangle) :jm_getPoint_0))
        (vreset! l_x (JR/invoke @l_point :jm_getX_0))
        (vreset! l_y (JR/invoke @l_point :jm_getY_0))
        (vreset! l_width (JR/invoke (JR/fget this :rectangle) :jm_getWidth_0))
        (vreset! l_height (JR/invoke (JR/fget this :rectangle) :jm_getHeight_0))
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics @l_x @l_y)
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/fget this :foregroundBasicColor))
        (JR/invoke (JR/fget this :drawStringUtil) :jm_paintVerticle_5 @l_graphics (JR/fget this :label) (unchecked-int (unchecked-add @l_x (JR/fget this :BORDER))) (unchecked-int (unchecked-add @l_y (JR/fget this :offset))) 0)
        (JR/invoke @l_graphics :jm_drawRect_4 @l_x @l_y @l_width @l_height)))



