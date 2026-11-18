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

(ns GPoint)

(JR/register 'GPoint nil '[])

(def jsv_POINT_LABEL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_POINT_LABEL [] (JR/ensure-init jclinit-state jclinit) @jsv_POINT_LABEL)
(defn jstatic_set_POINT_LABEL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_POINT_LABEL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_POINT_LABEL "Point: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :x 0)
  (JR/fset this :y 0)
  (JR/fset this :z 0)
  this)

    
(defn jm_getInstance_1 [p_point]
  (let [this nil l_point (volatile! p_point)]
        (GPoint/jnew_3 (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0) (JR/invoke @l_point :jm_getZ_0))))

    
(defn jinit_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
    nil (jinitfields this)
        (JR/fset this :x @l_x)
        (JR/fset this :y @l_y)
        (JR/fset this :z @l_z))
  this)

(defn jnew_3 [p_x p_y p_z ]
  (let [o (JR/alloc 'GPoint)] (jinit_3 o p_x p_y p_z) o))

    
(defn jm_getX_0 [this]
  (let []
        (JR/fget this :x)))

    
(defn jm_getY_0 [this]
  (let []
        (JR/fget this :y)))

    
(defn jm_getZ_0 [this]
  (let []
        (JR/fget this :z)))

    
(defn jm_getRawX_0 [this]
  (let []
        (JR/fget this :x)))

    
(defn jm_getRawY_0 [this]
  (let []
        (JR/fget this :y)))

    
(defn jm_getRawZ_0 [this]
  (let []
        (JR/fget this :z)))

    
(defn jm_toString_0 [this]
  (let []
        (GPoint/jm_toStringStatic_3 (JR/invoke this :jm_getX_0) (JR/invoke this :jm_getY_0) (JR/invoke this :jm_getZ_0))))

    
(defn jm_toStringStatic_3 [p_x p_y p_z]
  (let [this nil l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z) l_stringBuffer (volatile! nil) l_positionStrings (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_positionStrings (JR/scall 'PositionStrings :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (GPoint/jstatic_POINT_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :X_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_x)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Y_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_y)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Z_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_z)
        (JR/to-string-of @l_stringBuffer)))



