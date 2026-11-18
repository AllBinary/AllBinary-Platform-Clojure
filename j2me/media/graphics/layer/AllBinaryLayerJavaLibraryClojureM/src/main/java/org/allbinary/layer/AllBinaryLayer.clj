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
;; package org.allbinary.layer

(ns AllBinaryLayer)

(JR/register 'AllBinaryLayer 'Layer '[LayerInterface])

(def jsv_NULL_ALLBINARY_LAYER (atom nil))
(def jsv_TYPE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ALLBINARY_LAYER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ALLBINARY_LAYER)
(defn jstatic_set_NULL_ALLBINARY_LAYER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ALLBINARY_LAYER v))
(defn jstatic_TYPE [] (JR/ensure-init jclinit-state jclinit) @jsv_TYPE)
(defn jstatic_set_TYPE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TYPE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ALLBINARY_LAYER (AllBinaryLayer/jnew_3 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'RectangleFactory "SINGLETON") (JR/sget 'ViewPositionBase "NULL_VIEW_POSITION")))
    (reset! jsv_TYPE "Type: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :viewPositionEvent nil)
  (JR/fset this :halfWidth 0)
  (JR/fset this :halfHeight 0)
  (JR/fset this :name nil)
  (JR/fset this :viewPosition nil)
    (JR/fset this :viewPositionEvent (ViewPositionEvent/jnew_1 this))
    (JR/fset this :viewPosition (JR/sget 'ViewPositionBase "NULL_VIEW_POSITION"))
  this)

    
(defn jinit_3 [this p_name p_rectangle p_viewPosition]
  (let [ l_name (volatile! p_name) l_rectangle (volatile! p_rectangle) l_viewPosition (volatile! p_viewPosition) l_localName (volatile! nil) l_point (volatile! nil)]
        (Layer/jinit_2 this (JR/invoke @l_rectangle :jm_getWidth_0) (JR/invoke @l_rectangle :jm_getHeight_0)) (jinitfields this)
        (vreset! l_localName nil)
        (vreset! l_localName (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_name) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COLON)) :jm_append_1 (java.lang.Integer/toHexString (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_hashCode_1 this)))))
        (JR/fset this :name @l_localName)
        (vreset! l_point (JR/invoke @l_rectangle :jm_getPoint_0))
        (JR/invoke this :jm_setPosition_3 (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_point :jm_getY_0) (JR/invoke @l_point :jm_getZ_0))
        (JR/invoke this :jm_setHalfWidth_1 (JR/ishr (JR/invoke this :jm_getWidth_0) 1))
        (JR/invoke this :jm_setHalfHeight_1 (JR/ishr (JR/invoke this :jm_getHeight_0) 1))
        (JR/fset this :viewPosition @l_viewPosition)
        (JR/invoke (JR/fget this :viewPosition) :jm_setAllbinaryLayer_1 this))
  this)

(defn jnew_3 [p_name p_rectangle p_viewPosition ]
  (let [o (JR/alloc 'AllBinaryLayer)] (jinit_3 o p_name p_rectangle p_viewPosition) o))

    
(defn jm_setPosition_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/invoke-super 'Layer this :jm_setPosition_3 @l_x @l_y @l_z)))

    
(defn jm_moveDXYZ_3 [this p_dx p_dy p_dz]
  (let [ l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_dz (volatile! p_dz)]
        (JR/invoke-super 'Layer this :jm_moveDXYZ_3 @l_dx @l_dy @l_dz)))

    
(defn jm_getXP_0 [this]
  (let []
        (JR/invoke-super 'Layer this :jm_getXP_0)))

    
(defn jm_getYP_0 [this]
  (let []
        (JR/invoke-super 'Layer this :jm_getYP_0)))

    
(defn jm_getZP_0 [this]
  (let []
        (JR/invoke-super 'Layer this :jm_getZP_0)))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/invoke-super 'Layer this :jm_getWidth_0)))

    
(defn jm_getHeight_0 [this]
  (let []
        (JR/invoke-super 'Layer this :jm_getHeight_0)))

    
(defn jm_setVisible_1 [this p_visible]
  (let [ l_visible (volatile! p_visible)]
        (JR/invoke-super 'Layer this :jm_setVisible_1 @l_visible)))

    
(defn jm_isVisible_0 [this]
  (let []
        (JR/invoke-super 'Layer this :jm_isVisible_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke-super 'Layer this :jm_paint_1 @l_graphics)))

    
(defn jm_onChangeEvent_1 [this p_layerManagerEvent]
  (let [ l_layerManagerEvent (volatile! p_layerManagerEvent)]
        nil))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_getX2_0 [this]
  (let []
        (unchecked-int (unchecked-add (JR/invoke this :jm_getXP_0) (JR/invoke this :jm_getWidth_0)))))

    
(defn jm_getY2_0 [this]
  (let []
        (unchecked-int (unchecked-add (JR/invoke this :jm_getYP_0) (JR/invoke this :jm_getHeight_0)))))

    
(defn jm_getZ2_0 [this]
  (let []
        (JR/i32 (unchecked-add (JR/invoke this :jm_getZP_0) (JR/invoke this :jm_getDepth_0)))))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_setHalfWidth_1 [this p_halfWidth]
  (let [ l_halfWidth (volatile! p_halfWidth)]
        (JR/fset this :halfWidth @l_halfWidth)))

    
(defn jm_getHalfWidth_0 [this]
  (let []
        (JR/fget this :halfWidth)))

    
(defn jm_setHalfHeight_1 [this p_halfHeight]
  (let [ l_halfHeight (volatile! p_halfHeight)]
        (JR/fset this :halfHeight @l_halfHeight)))

    
(defn jm_getHalfHeight_0 [this]
  (let []
        (JR/fget this :halfHeight)))

    
(defn jm_getHalfDepth_0 [this]
  (let []
        (JR/idiv (JR/i32 (JR/invoke this :jm_getDepth_0)) 2)))

    
(defn jm_getViewPosition_0 [this]
  (let []
        (JR/fget this :viewPosition)))

    
(defn jm_setViewPosition_1 [this p_viewPosition]
  (let [ l_viewPosition (volatile! p_viewPosition)]
        (JR/fset this :viewPosition @l_viewPosition)))

    
(defn jm_getGroupInterface_0 [this]
  (let []
        (JR/fget (JR/scall 'BasicGroupFactory :jm_getInstance_0) :NONE_ARRAY)))

    
(defn jm_implmentsTickableInterface_0 [this]
  (let []
        false))

    
(defn jm_implmentsGameInputInterface_0 [this]
  (let []
        false))

    
(defn jm_implmentsArtificialIntelligenceCompositeInterface_0 [this]
  (let []
        false))

    
(defn jm_implmentsCollidableInterface_0 [this]
  (let []
        false))

    
(defn jm_implementsThreedInterface_0 [this]
  (let []
        (JR/invoke (JR/scall 'OpenGLFeatureUtil :jm_getInstance_0) :jm_isAnyThreed_0)))

    
(defn jm_getType_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_getMultiPlayerType_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_toStringAppend_1 [this p_stringBuffer]
  (let [ l_stringBuffer (volatile! p_stringBuffer) l_commonSeps (volatile! nil) l_positionStrings (volatile! nil) l_commonLabels (volatile! nil)]
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (vreset! l_positionStrings (JR/scall 'PositionStrings :jm_getInstance_0))
        (vreset! l_commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COLON))
        (JR/invoke @l_stringBuffer :jm_append_1 (AllBinaryLayer/jstatic_TYPE))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getType_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :X_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getXP_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Y_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getYP_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Z_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getZP_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :WIDTH_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getWidth_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :HEIGHT_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getHeight_0))))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke this :jm_toStringAppend_1 @l_stringBuffer)
        (JR/to-string-of @l_stringBuffer)))



