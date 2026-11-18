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
  (JR/fset this :rawRectangle nil)
  (JR/fset this :xBorder 0)
  (JR/fset this :yBorder 0)
  (JR/fset this :rectangle nil)
  (JR/fset this :cellPosition nil)
  (JR/fset this :animationX 0)
  (JR/fset this :animationY 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :rectangle (JR/sget 'RectangleFactory "SINGLETON"))
  this)

    
(defn jinit_6 [this p_touchButtonInput p_animationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput) l_animationInterface (volatile! p_animationInterface) l_rawRectangle (volatile! p_rawRectangle) l_cellPosition (volatile! p_cellPosition) l_xBorder (volatile! p_xBorder) l_yBorder (volatile! p_yBorder)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :touchButtonInput @l_touchButtonInput)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :rawRectangle @l_rawRectangle)
        (JR/fset this :cellPosition @l_cellPosition)
        (JR/fset this :xBorder @l_xBorder)
        (JR/fset this :yBorder @l_yBorder)
        (JR/invoke this :jm_updateRectangle_0)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Created: ") :jm_append_1 (JR/to-string-of this))) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR)))
  this)

(defn jnew_6 [p_touchButtonInput p_animationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder ]
  (let [o (JR/alloc 'TouchButton)] (jinit_6 o p_touchButtonInput p_animationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics (JR/fget this :animationX) (JR/fget this :animationY))))

    
(defn jm_updateRectangle_0 [this]
  (let [ l_x (volatile! nil) l_y (volatile! nil) l_pointFactory (volatile! nil) l_point (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_x (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :rawRectangle) :jm_getWidth_0) (JR/invoke (JR/fget this :cellPosition) :jm_getColumn_0))))
            (vreset! l_y (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :rawRectangle) :jm_getHeight_0) (JR/invoke (JR/fget this :cellPosition) :jm_getRow_0))))
            (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
            (JR/fset this :rectangle (Rectangle/jnew_3 (JR/invoke @l_pointFactory :jm_createXY_2 (unchecked-int (unchecked-add @l_x (JR/fget this :xBorder))) (unchecked-int (unchecked-add @l_y (JR/fget this :yBorder)))) (JR/invoke (JR/fget this :rawRectangle) :jm_getWidth_0) (JR/invoke (JR/fget this :rawRectangle) :jm_getHeight_0)))
            (vreset! l_point (JR/invoke (JR/fget this :rectangle) :jm_getPoint_0))
            (JR/fset this :animationX (JR/invoke @l_point :jm_getX_0))
            (JR/fset this :animationY (JR/invoke @l_point :jm_getY_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "updateRectangle" @l_e)) :else (throw jt)))))))

    
(defn jm_getCellPositionP_0 [this]
  (let []
        (JR/fget this :cellPosition)))

    
(defn jm_getRectangleP_0 [this]
  (let []
        (JR/fget this :rectangle)))

    
(defn jm_getTouchButtonInput_0 [this]
  (let []
        (JR/fget this :touchButtonInput)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_stringUtil (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "TouchButton: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :rectangle)))
        (JR/invoke @l_stringBuffer :jm_append_1 " CellPosition: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_stringUtil :jm_toString_1 (JR/fget this :cellPosition)))
        (JR/invoke @l_stringBuffer :jm_append_1 " xBorder: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :xBorder))
        (JR/invoke @l_stringBuffer :jm_append_1 " yBorder: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :yBorder))
        (JR/to-string-of @l_stringBuffer)))



