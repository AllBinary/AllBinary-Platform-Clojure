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
;; package org.allbinary.input.motion.button

(ns TouchButton)

(JR/register 'TouchButton 'Paintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :touchButtonInput nil)
  (JR/fset this :animationInterface nil)
  (JR/fset this :hintAnimationInterface nil)
  (JR/fset this :rawRectangle nil)
  (JR/fset this :xBorder 0)
  (JR/fset this :yBorder 0)
  (JR/fset this :rectangleP nil)
  (JR/fset this :cellPositionP nil)
  (JR/fset this :animationX 0)
  (JR/fset this :animationY 0)
  (JR/fset this :hintAnimationY 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :rectangleP (JR/sget 'RectangleFactory "SINGLETON"))
  this)

    
(defn jm_createButton_6 [p_touchButtonInput p_touchButtonResource p_rawRectangle p_cellPosition p_xBorder p_yBorder]
  (let [this nil l_touchButtonInput (volatile! p_touchButtonInput) l_touchButtonResource (volatile! p_touchButtonResource) l_rawRectangle (volatile! p_rawRectangle) l_cellPosition (volatile! p_cellPosition) l_xBorder (volatile! p_xBorder) l_yBorder (volatile! p_yBorder)]
        (TouchButton/jnew_7 @l_touchButtonInput (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget @l_touchButtonResource :RESOURCE)) :jm_getInstance_1 0) (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget @l_touchButtonResource :HINT)) :jm_getInstance_1 0) @l_rawRectangle @l_cellPosition @l_xBorder @l_yBorder)))

    
(defn jinit_7 [this p_touchButtonInput p_animationInterface p_hintAnimationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput) l_animationInterface (volatile! p_animationInterface) l_hintAnimationInterface (volatile! p_hintAnimationInterface) l_rawRectangle (volatile! p_rawRectangle) l_cellPosition (volatile! p_cellPosition) l_xBorder (volatile! p_xBorder) l_yBorder (volatile! p_yBorder)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :touchButtonInput @l_touchButtonInput)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :hintAnimationInterface @l_hintAnimationInterface)
        (JR/fset this :rawRectangle @l_rawRectangle)
        (JR/fset this :cellPositionP @l_cellPosition)
        (JR/fset this :xBorder @l_xBorder)
        (JR/fset this :yBorder @l_yBorder)
        (JR/invoke this :jm_updateRectangle_0)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Created: ") :jm_append_1 (JR/to-string-of this))) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR)))
  this)

(defn jnew_7 [p_touchButtonInput p_animationInterface p_hintAnimationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder ]
  (let [o (JR/alloc 'TouchButton)] (jinit_7 o p_touchButtonInput p_animationInterface p_hintAnimationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder) o))

    
(defn jm_paintHint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :hintAnimationInterface) :jm_paintXY_3 @l_graphics (JR/fget this :animationX) (JR/fget this :hintAnimationY))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics (JR/fget this :animationX) (JR/fget this :animationY))))

    
(defn jm_updateRectangle_0 [this]
  (let [ l_pointFactory (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_point (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
            (vreset! l_x (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :rawRectangle) :jm_getWidth_0) (JR/invoke (JR/fget this :cellPositionP) :jm_getColumn_0))))
            (vreset! l_y (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :rawRectangle) :jm_getHeight_0) (JR/invoke (JR/fget this :cellPositionP) :jm_getRow_0))))
            (JR/fset this :rectangleP (Rectangle/jnew_3 (JR/invoke @l_pointFactory :jm_createXY_2 (unchecked-int (unchecked-add @l_x (JR/fget this :xBorder))) (unchecked-int (unchecked-add @l_y (JR/fget this :yBorder)))) (JR/invoke (JR/fget this :rawRectangle) :jm_getWidth_0) (JR/invoke (JR/fget this :rawRectangle) :jm_getHeight_0)))
            (vreset! l_point (JR/invoke (JR/fget this :rectangleP) :jm_getPoint_0))
            (JR/fset this :animationX (JR/invoke @l_point :jm_getX_0))
            (JR/fset this :animationY (JR/invoke @l_point :jm_getY_0))
            (JR/fset this :hintAnimationY (unchecked-int (unchecked-subtract (JR/fget this :animationY) 32))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "updateRectangle" @l_e)) :else (throw jt)))))))

    
(defn jm_getCellPosition_0 [this]
  (let []
        (JR/fget this :cellPositionP)))

    
(defn jm_getRectangle_0 [this]
  (let []
        (JR/fget this :rectangleP)))

    
(defn jm_getTouchButtonInput_0 [this]
  (let []
        (JR/fget this :touchButtonInput)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_stringUtil (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "TouchButton: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/invoke this :jm_getRectangle_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 " CellPosition: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :cellPositionP)))
        (JR/invoke @l_stringBuffer :jm_append_1 " xBorder: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :xBorder))
        (JR/invoke @l_stringBuffer :jm_append_1 " yBorder: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :yBorder))
        (JR/to-string-of @l_stringBuffer)))



