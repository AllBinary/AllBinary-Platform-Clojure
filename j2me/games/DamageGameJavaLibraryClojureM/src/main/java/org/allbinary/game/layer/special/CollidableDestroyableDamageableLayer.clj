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
;; package org.allbinary.game.layer.special

(ns CollidableDestroyableDamageableLayer)

(JR/register 'CollidableDestroyableDamageableLayer 'CollidableCompositeLayer '[DestroyableInterface DamageableInterface PickupCompositeInterface SpecialGameInputInterface])

(def jsv_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER (atom nil))
(def jsv_READYFOREXPLOSION (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER)
(defn jstatic_set_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER v))
(defn jstatic_READYFOREXPLOSION [] (JR/ensure-init jclinit-state jclinit) @jsv_READYFOREXPLOSION)
(defn jstatic_set_READYFOREXPLOSION [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_READYFOREXPLOSION v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    (reset! jsv_READYFOREXPLOSION "ReadyForExplosion: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :groupInterface nil)
  (JR/fset this :readyForExplosion false)
  (JR/fset this :initWidth 0)
  (JR/fset this :initHeight 0)
  (JR/fset this :initX 0)
  (JR/fset this :initY 0)
  (JR/fset this :initZ 0)
  (JR/fset this :partInterfaceArrayP nil)
  (JR/fset this :pickupBehavior nil)
  (JR/fset this :allBinaryGameLayerManagerP nil)
  (JR/fset this :isDraggable false)
  (JR/fset this :isDragged false)
  (JR/fset this :isDropped false)
    (JR/fset this :partInterfaceArrayP (JR/scall 'PartInterfaceUtil :jm_getZeroArray_0))
    (JR/fset this :allBinaryGameLayerManagerP (JR/scall 'AllBinaryGameLayerManager :jm_getNullInstance_0))
    (JR/fset this :isDraggable false)
    (JR/fset this :isDragged false)
    (JR/fset this :isDropped false)
  this)

    
(defn jm_getNullInstance_0 []
  (let [this nil]
        (if (JR/eq (CollidableDestroyableDamageableLayer/jstatic_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (CollidableDestroyableDamageableLayer/jstatic_set_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER (CollidableDestroyableDamageableLayer/jnew_4 (JR/fget (JR/scall 'BasicGroupFactory :jm_getInstance_0) :NONE_ARRAY) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'RectangleFactory "SINGLETON") (JR/sget 'ViewPositionBase "NULL_VIEW_POSITION")))))
        (CollidableDestroyableDamageableLayer/jstatic_NULL_COLLIDABLE_DESTROYABLE_DAMAGE_LAYER)))

    
(defn jinit_4 [this p_groupInterface p_name p_layerInfo p_viewPosition]
  (let [ l_groupInterface (volatile! p_groupInterface) l_name (volatile! p_name) l_layerInfo (volatile! p_layerInfo) l_viewPosition (volatile! p_viewPosition)]
        (CollidableCompositeLayer/jinit_4 this @l_name @l_layerInfo @l_viewPosition (JR/scall 'CollidableNeverCollideBehaviorFactory :jm_getInstance_0)) (jinitfields this)
        (JR/fset this :initWidth (JR/invoke @l_layerInfo :jm_getWidth_0))
        (JR/fset this :initHeight (JR/invoke @l_layerInfo :jm_getHeight_0))
        (JR/fset this :groupInterface @l_groupInterface)
        (JR/fset this :pickupBehavior (JR/scall 'PickupBehavior :jm_getNullInstance_0)))
  this)

(defn jnew_4 [p_groupInterface p_name p_layerInfo p_viewPosition ]
  (let [o (JR/alloc 'CollidableDestroyableDamageableLayer)] (jinit_4 o p_groupInterface p_name p_layerInfo p_viewPosition) o))

    
(defn jm_initPosition_0 [this]
  (let []
        (JR/invoke this :jm_setPosition_3 (JR/fget this :initX) (JR/fget this :initY) (JR/fget this :initZ))))

    
(defn jm_initPositionXYZ_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/fset this :initX @l_x)
        (JR/fset this :initY @l_y)
        (JR/fset this :initZ @l_z)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke-super 'CollidableCompositeLayer this :jm_paint_1 @l_graphics)))

    
(defn jm_damage_2 [this p_damage p_damageType]
  (let [ l_damage (volatile! p_damage) l_damageType (volatile! p_damageType)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_getDamage_1 [this p_damageType]
  (let [ l_damageType (volatile! p_damageType)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_isDestroyed_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))

    
(defn jm_getGroupInterface_0 [this]
  (let []
        (JR/fget this :groupInterface)))

    
(defn jm_setGroupInterface_1 [this p_teamInterface]
  (let [ l_teamInterface (volatile! p_teamInterface)]
        (JR/fset this :groupInterface @l_teamInterface)))

    
(defn jm_setAllBinaryGameLayerManager_1 [this p_allBinaryGameLayerManager]
  (let [ l_allBinaryGameLayerManager (volatile! p_allBinaryGameLayerManager)]
        (JR/fset this :allBinaryGameLayerManagerP @l_allBinaryGameLayerManager)
        (if (nil? (JR/fget this :allBinaryGameLayerManagerP))
            (do
            (JR/jthrow (new java.lang.RuntimeException))))))

    
(defn jm_isReadyForExplosion_0 [this]
  (let []
        (JR/fget this :readyForExplosion)))

    
(defn jm_setReadyForExplosion_1 [this p_isReadyForExplosion]
  (let [ l_isReadyForExplosion (volatile! p_isReadyForExplosion)]
        (JR/fset this :readyForExplosion @l_isReadyForExplosion)))

    
(defn jm_getInitWidth_0 [this]
  (let []
        (JR/fget this :initWidth)))

    
(defn jm_getInitHeight_0 [this]
  (let []
        (JR/fget this :initHeight)))

    
(defn jm_getInitX_0 [this]
  (let []
        (JR/fget this :initX)))

    
(defn jm_getInitY_0 [this]
  (let []
        (JR/fget this :initY)))

    
(defn jm_up_0 [this]
  (let []
        nil))

    
(defn jm_down_0 [this]
  (let []
        nil))

    
(defn jm_right_0 [this]
  (let []
        nil))

    
(defn jm_left_0 [this]
  (let []
        nil))

    
(defn jm_strafeLeft_0 [this]
  (let []
        nil))

    
(defn jm_strafeRight_0 [this]
  (let []
        nil))

    
(defn jm_fire_2 [this p_layerManager p_gameKeyEvent]
  (let [ l_layerManager (volatile! p_layerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_special1_2 [this p_layerManager p_gameKeyEvent]
  (let [ l_layerManager (volatile! p_layerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_special2_2 [this p_layerManager p_gameKeyEvent]
  (let [ l_layerManager (volatile! p_layerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_special3_2 [this p_layerManager p_gameKeyEvent]
  (let [ l_layerManager (volatile! p_layerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_special4_2 [this p_layerManager p_gameKeyEvent]
  (let [ l_layerManager (volatile! p_layerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_special5_2 [this p_layerManager p_gameKeyEvent]
  (let [ l_layerManager (volatile! p_layerManager) l_gameKeyEvent (volatile! p_gameKeyEvent)]
        nil))

    
(defn jm_upAnalog_1 [this p_yAnalogValue]
  (let [ l_yAnalogValue (volatile! p_yAnalogValue)]
        nil))

    
(defn jm_downAnalog_1 [this p_yAnalogValue]
  (let [ l_yAnalogValue (volatile! p_yAnalogValue)]
        nil))

    
(defn jm_rightAnalog_1 [this p_xAnalogValue]
  (let [ l_xAnalogValue (volatile! p_xAnalogValue)]
        nil))

    
(defn jm_leftAnalog_1 [this p_xAnalogValue]
  (let [ l_xAnalogValue (volatile! p_xAnalogValue)]
        nil))

    
(defn jm_rightTrigger_3 [this p_layerManager p_gameKeyEvent p_xAnalogValue]
  (let [ l_layerManager (volatile! p_layerManager) l_gameKeyEvent (volatile! p_gameKeyEvent) l_xAnalogValue (volatile! p_xAnalogValue)]
        nil))

    
(defn jm_leftTrigger_3 [this p_layerManager p_gameKeyEvent p_xAnalogValue]
  (let [ l_layerManager (volatile! p_layerManager) l_gameKeyEvent (volatile! p_gameKeyEvent) l_xAnalogValue (volatile! p_xAnalogValue)]
        nil))

    
(defn jm_onDestroyed_1 [this p_destroyedEvent]
  (let [ l_destroyedEvent (volatile! p_destroyedEvent)]
        nil))

    
(defn jm_getPickupBehavior_0 [this]
  (let []
        (JR/fget this :pickupBehavior)))

    
(defn jm_setPickupBehavior_1 [this p_pickupBehavior]
  (let [ l_pickupBehavior (volatile! p_pickupBehavior)]
        (JR/fset this :pickupBehavior @l_pickupBehavior)))

    
(defn jm_addPart_1 [this p_pickedUpLayerInterfaceFactoryInterface]
  (let [ l_pickedUpLayerInterfaceFactoryInterface (volatile! p_pickedUpLayerInterfaceFactoryInterface)]
        nil))

    
(defn jm_setPartInterfaceArray_1 [this p_partInterfaceArray]
  (let [ l_partInterfaceArray (volatile! p_partInterfaceArray)]
        (JR/fset this :partInterfaceArrayP @l_partInterfaceArray)))

    
(defn jm_getPartInterfaceArray_0 [this]
  (let []
        (JR/fget this :partInterfaceArrayP)))

    
(defn jm_toStringAppend_1 [this p_stringBuffer]
  (let [ l_stringBuffer (volatile! p_stringBuffer) l_commonSeps (volatile! nil) l_positionStrings (volatile! nil) l_groupInterfaceArray (volatile! nil) l_size (volatile! nil) l_index (volatile! nil) l_pickupBehavior (volatile! nil)]
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (vreset! l_positionStrings (JR/scall 'PositionStrings :jm_getInstance_0))
        (JR/invoke-super 'CollidableCompositeLayer this :jm_toStringAppend_1 @l_stringBuffer)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :NEW_LINE))
        (vreset! l_groupInterfaceArray (JR/invoke this :jm_getGroupInterface_0))
        (vreset! l_size (JR/alen @l_groupInterfaceArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/aget* @l_groupInterfaceArray @l_index)))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA))))
        (vreset! l_pickupBehavior (JR/invoke this :jm_getPickupBehavior_0))
        (if (some? @l_pickupBehavior)
            (do
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :NEW_LINE))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of @l_pickupBehavior))))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :NEW_LINE))
        (JR/invoke @l_stringBuffer :jm_append_1 (CollidableDestroyableDamageableLayer/jstatic_READYFOREXPLOSION))
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/fget this :readyForExplosion))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :NEW_LINE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonStrings) :INIT))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :X_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :initX))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Y_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :initX))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Z_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :initZ))))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke this :jm_toStringAppend_1 @l_stringBuffer)
        (JR/to-string-of @l_stringBuffer)))



