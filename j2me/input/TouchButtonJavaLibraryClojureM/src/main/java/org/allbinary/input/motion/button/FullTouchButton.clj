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

(ns FullTouchButton)

(JR/register 'FullTouchButton 'TouchButton '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_createButton_6 [p_touchButtonInput p_touchButtonResource p_rawRectangle p_cellPosition p_xBorder p_yBorder]
  (let [this nil l_touchButtonInput (volatile! p_touchButtonInput) l_touchButtonResource (volatile! p_touchButtonResource) l_rawRectangle (volatile! p_rawRectangle) l_cellPosition (volatile! p_cellPosition) l_xBorder (volatile! p_xBorder) l_yBorder (volatile! p_yBorder)]
        (FullTouchButton/jnew_7 @l_touchButtonInput (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget @l_touchButtonResource :RESOURCE)) :jm_getInstance_1 0) (JR/invoke (JR/invoke (JR/scall 'FeaturedAnimationInterfaceFactoryInterfaceFactory :jm_getInstance_0) :jm_get_1 (JR/fget @l_touchButtonResource :HINT)) :jm_getInstance_1 0) @l_rawRectangle @l_cellPosition @l_xBorder @l_yBorder)))

    
(defn jinit_7 [this p_touchButtonInput p_animationInterface p_hintAnimationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder]
  (let [ l_touchButtonInput (volatile! p_touchButtonInput) l_animationInterface (volatile! p_animationInterface) l_hintAnimationInterface (volatile! p_hintAnimationInterface) l_rawRectangle (volatile! p_rawRectangle) l_cellPosition (volatile! p_cellPosition) l_xBorder (volatile! p_xBorder) l_yBorder (volatile! p_yBorder)]
        (TouchButton/jinit_7 this @l_touchButtonInput @l_animationInterface @l_hintAnimationInterface @l_rawRectangle @l_cellPosition @l_xBorder @l_yBorder) (jinitfields this))
  this)

(defn jnew_7 [p_touchButtonInput p_animationInterface p_hintAnimationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder ]
  (let [o (JR/alloc 'FullTouchButton)] (jinit_7 o p_touchButtonInput p_animationInterface p_hintAnimationInterface p_rawRectangle p_cellPosition p_xBorder p_yBorder) o))

    
(defn jm_updateRectangle_0 [this]
  (let [ l_pointFactory (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_point (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
            (vreset! l_x (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :rawRectangle) :jm_getWidth_0) (JR/invoke (JR/fget this :cellPositionP) :jm_getColumn_0))))
            (vreset! l_y (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :rawRectangle) :jm_getHeight_0) (JR/invoke (JR/fget this :cellPositionP) :jm_getRow_0))))
            (JR/fset this :rectangleP (Rectangle/jnew_3 (JR/invoke @l_pointFactory :jm_createXY_2 @l_x @l_y) (+ (JR/invoke (JR/fget this :rawRectangle) :jm_getWidth_0) (* 2 (JR/fget this :xBorder))) (+ (JR/invoke (JR/fget this :rawRectangle) :jm_getHeight_0) (* 2 (JR/fget this :yBorder)))))
            (vreset! l_point (JR/invoke (JR/fget this :rectangleP) :jm_getPoint_0))
            (JR/fset this :animationX (+ (JR/invoke @l_point :jm_getX_0) (JR/fget this :xBorder)))
            (JR/fset this :animationY (+ (JR/invoke @l_point :jm_getY_0) (JR/fget this :yBorder)))
            (JR/fset this :hintAnimationY (JR/ishr (- (JR/fget this :animationY) (JR/invoke (JR/fget this :rectangleP) :jm_getHeight_0)) 1)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this "updateRectangle" @l_e)) :else (throw jt)))))))



