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
;; package org.allbinary.graphics

(ns Rectangle)

(JR/register 'Rectangle nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :point nil)
  (JR/fset this :width 0)
  (JR/fset this :height 0)
  this)

    
(defn jinit_3 [this p_point p_width p_height]
  (let [ l_point (volatile! p_point) l_width (volatile! p_width) l_height (volatile! p_height)]
    nil (jinitfields this)
        (JR/fset this :point @l_point)
        (JR/fset this :width @l_width)
        (JR/fset this :height @l_height))
  this)

(defn jnew_3 [p_point p_width p_height ]
  (let [o (JR/alloc 'Rectangle)] (jinit_3 o p_point p_width p_height) o))

    
(defn jm_getPoint_0 [this]
  (let []
        (JR/fget this :point)))

    
(defn jm_setPoint_1 [this p_point]
  (let [ l_point (volatile! p_point)]
        (JR/fset this :point @l_point)))

    
(defn jm_getMaxX_0 [this]
  (let []
        (unchecked-int (unchecked-add (JR/invoke (JR/fget this :point) :jm_getX_0) (JR/fget this :width)))))

    
(defn jm_getMaxY_0 [this]
  (let []
        (unchecked-int (unchecked-add (JR/invoke (JR/fget this :point) :jm_getY_0) (JR/fget this :height)))))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/fget this :width)))

    
(defn jm_setWidth_1 [this p_width]
  (let [ l_width (volatile! p_width)]
        (JR/fset this :width @l_width)))

    
(defn jm_getHeight_0 [this]
  (let []
        (JR/fget this :height)))

    
(defn jm_setHeight_1 [this p_height]
  (let [ l_height (volatile! p_height)]
        (JR/fset this :height @l_height)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/invoke this :jm_getPoint_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :WIDTH_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getWidth_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :HEIGHT_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getHeight_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " MaxX: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getMaxX_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " MaxY: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getMaxY_0))
        (JR/to-string-of @l_stringBuffer)))



