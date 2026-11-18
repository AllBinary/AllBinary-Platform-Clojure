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
;; package org.allbinary.game.layer

(ns CollidableCompositeLayer)

(JR/register 'CollidableCompositeLayer 'AllBinaryGameLayer '[CollidableInterfaceCompositeInterface])

(def jsv_NULL_COLLIDABLE_COMPOSITE_LAYER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_COLLIDABLE_COMPOSITE_LAYER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_COLLIDABLE_COMPOSITE_LAYER)
(defn jstatic_set_NULL_COLLIDABLE_COMPOSITE_LAYER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_COLLIDABLE_COMPOSITE_LAYER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_COLLIDABLE_COMPOSITE_LAYER (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :collidableInferface nil)
    (JR/fset this :collidableInferface (JR/invoke (JR/scall 'CollidableNeverCollideBehaviorFactory :jm_getInstance_0) :jm_createBehavior_0))
  this)

    
(defn jm_getNullInstance_0 []
  (let [this nil]
        (if (JR/eq (CollidableCompositeLayer/jstatic_NULL_COLLIDABLE_COMPOSITE_LAYER) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (CollidableCompositeLayer/jstatic_set_NULL_COLLIDABLE_COMPOSITE_LAYER (CollidableCompositeLayer/jnew_4 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'RectangleFactory "SINGLETON") (JR/sget 'ViewPositionBase "NULL_VIEW_POSITION") (JR/scall 'CollidableNeverCollideBehaviorFactory :jm_getInstance_0)))))
        (CollidableCompositeLayer/jstatic_NULL_COLLIDABLE_COMPOSITE_LAYER)))

    
(defn jinit_4 [this p_name p_layerInfo p_viewPosition p_collidableBaseBehaviorFactory]
  (let [ l_name (volatile! p_name) l_layerInfo (volatile! p_layerInfo) l_viewPosition (volatile! p_viewPosition) l_collidableBaseBehaviorFactory (volatile! p_collidableBaseBehaviorFactory)]
        (AllBinaryGameLayer/jinit_3 this @l_name @l_layerInfo @l_viewPosition) (jinitfields this)
        (if (not (JR/eq @l_collidableBaseBehaviorFactory (JR/scall 'CollidableNeverCollideBehaviorFactory :jm_getInstance_0)))
            (do
            (JR/invoke this :jm_setCollidableInferface_1 (JR/invoke @l_collidableBaseBehaviorFactory :jm_createBehavior_0)))))
  this)

(defn jnew_4 [p_name p_layerInfo p_viewPosition p_collidableBaseBehaviorFactory ]
  (let [o (JR/alloc 'CollidableCompositeLayer)] (jinit_4 o p_name p_layerInfo p_viewPosition p_collidableBaseBehaviorFactory) o))

    
(defn jm_getArtificialIntelligenceInterface_0 [this]
  (let []
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED) this)
        (JR/scall 'ArtificialIntelligence :jm_getInstance_0)))

    
(defn jm_getCollidableInferface_0 [this]
  (let []
        (JR/fget this :collidableInferface)))

    
(defn jm_setCollidableInferface_1 [this p_collidableInferface]
  (let [ l_collidableInferface (volatile! p_collidableInferface)]
        (JR/fset this :collidableInferface @l_collidableInferface)))

    
(defn jm_implmentsCollidableInterface_0 [this]
  (let []
        true))

    
(defn jm_toStringAppend_1 [this p_stringBuffer]
  (let [ l_stringBuffer (volatile! p_stringBuffer) l_commonSeps (volatile! nil)]
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/invoke-super 'AllBinaryGameLayer this :jm_toStringAppend_1 @l_stringBuffer)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :NEW_LINE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/invoke this :jm_getCollidableInferface_0)))))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke this :jm_toStringAppend_1 @l_stringBuffer)
        (JR/to-string-of @l_stringBuffer)))



