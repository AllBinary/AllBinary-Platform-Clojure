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
;; package org.allbinary.animation.image

(ns BaseImageAnimationFactory)

(JR/register 'BaseImageAnimationFactory nil '[AnimationInterfaceFactoryInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :animationFactoryImageScaleUtil nil)
  (JR/fset this :image nil)
  (JR/fset this :animationBehaviorFactory nil)
  (JR/fset this :sequenceArray nil)
  (JR/fset this :animationFactoryInitializationVisitor nil)
  (JR/fset this :scaleProperties nil)
    (JR/fset this :animationFactoryImageScaleUtil (JR/scall 'AnimationFactoryImageScaleUtil :jm_getInstance_0))
    (JR/fset this :scaleProperties (JR/sget 'ScaleProperties "instance"))
  this)

    
(defn jm_createFactoryBase_5 [p_image p_sequenceArray p_width p_height p_animationBehaviorFactory]
  (let [this nil l_image (volatile! p_image) l_sequenceArray (volatile! p_sequenceArray) l_width (volatile! p_width) l_height (volatile! p_height) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
        (BaseImageAnimationFactory/jnew_7 @l_image @l_sequenceArray @l_width @l_height 0 0 @l_animationBehaviorFactory)))

    
(defn jinit_7 [this p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory]
  (let [ l_image (volatile! p_image) l_sequenceArray (volatile! p_sequenceArray) l_width (volatile! p_width) l_height (volatile! p_height) l_dx (volatile! p_dx) l_dy (volatile! p_dy) l_animationBehaviorFactory (volatile! p_animationBehaviorFactory)]
    nil (jinitfields this)
        (JR/fset this :animationFactoryInitializationVisitor (AnimationFactoryInitializationVisitor/jnew_0))
        (JR/fset this :image @l_image)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :width @l_width)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :height @l_height)
        (JR/fset this :animationBehaviorFactory @l_animationBehaviorFactory)
        (JR/fset this :sequenceArray @l_sequenceArray)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dx @l_dx)
        (JR/fset (JR/fget this :animationFactoryInitializationVisitor) :dy @l_dy))
  this)

(defn jnew_7 [p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory ]
  (let [o (JR/alloc 'BaseImageAnimationFactory)] (jinit_7 o p_image p_sequenceArray p_width p_height p_dx p_dy p_animationBehaviorFactory) o))

    
(defn jm_getInstance_1 [this p_instanceId]
  (let [ l_instanceId (volatile! p_instanceId)]
        (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 @l_instanceId)))

    
(defn jm_getImage_0 [this]
  (let []
        (JR/fget this :image)))

    
(defn jm_getSequenceArray_0 [this]
  (let []
        (JR/fget this :sequenceArray)))

    
(defn jm_setInitialScale_1 [this p_scaleProperties]
  (let [ l_scaleProperties (volatile! p_scaleProperties)]
        (JR/fset this :scaleProperties @l_scaleProperties)
        (if (JR/fget (JR/fget this :scaleProperties) :shouldScale)
            (do
            (JR/fset (JR/fget this :scaleProperties) :scaleWidth (JR/d2i (* (JR/f32 (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :width)) (JR/fget (JR/fget this :scaleProperties) :scaleX))))
            (JR/fset (JR/fget this :scaleProperties) :scaleHeight (JR/d2i (* (JR/f32 (JR/fget (JR/fget this :animationFactoryInitializationVisitor) :height)) (JR/fget (JR/fget this :scaleProperties) :scaleY)))))
            (do
            nil))))

    
(defn jm_getAnimationFactoryInitializationVisitorP_0 [this]
  (let []
        (JR/fget this :animationFactoryInitializationVisitor)))

    
(defn jm_getScalePropertiesP_0 [this]
  (let []
        (JR/fget this :scaleProperties)))

    
(defn jm_toString_0 [this]
  (let [ l_commonSeps (volatile! nil) l_commonLabels (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (vreset! l_commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of this))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :HEIGHT_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/fget this :image) :jm_getHeight_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :animationFactoryInitializationVisitor)))
        (JR/to-string-of @l_stringBuffer)))



