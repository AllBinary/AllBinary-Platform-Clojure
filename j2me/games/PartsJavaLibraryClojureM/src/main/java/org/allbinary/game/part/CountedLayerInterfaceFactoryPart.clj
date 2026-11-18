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
;; package org.allbinary.game.part

(ns CountedLayerInterfaceFactoryPart)

(JR/register 'CountedLayerInterfaceFactoryPart nil '[PartInterface UpdateMyFontInterface])

(def jsv_NULL_COUNTED_LAYER_INTERFACE_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_COUNTED_LAYER_INTERFACE_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_COUNTED_LAYER_INTERFACE_FACTORY)
(defn jstatic_set_NULL_COUNTED_LAYER_INTERFACE_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_COUNTED_LAYER_INTERFACE_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_COUNTED_LAYER_INTERFACE_FACTORY (CountedLayerInterfaceFactoryPart/jnew_2 0 (JR/sget 'CountedPickedUpLayerInterfaceFactory "NULL_COUNTED_PICKUP_LAYER_FACTORY")))
    nil))

(defn jinitfields [this]
  (JR/fset this :updateMyFontProcessor nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :animationInterface nil)
  (JR/fset this :total 0)
  (JR/fset this :totalString nil)
  (JR/fset this :xOffset 0)
  (JR/fset this :countedPickedUpLayerInterfaceFactory nil)
  (JR/fset this :primitiveLongUtil nil)
    (JR/fset this :updateMyFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))
    (JR/fset this :animationInterface (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0))
    (JR/fset this :totalString (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_CHAR_ARRAY))
    (JR/fset this :countedPickedUpLayerInterfaceFactory (JR/sget 'CountedPickedUpLayerInterfaceFactory "NULL_COUNTED_PICKUP_LAYER_FACTORY"))
  this)

    
(defn jinit_2 [this p_total p_countedPickedUpLayerInterfaceFactory]
  (let [ l_total (volatile! p_total) l_countedPickedUpLayerInterfaceFactory (volatile! p_countedPickedUpLayerInterfaceFactory)]
    nil (jinitfields this)
        (JR/fset this :primitiveLongUtil (JR/scall 'PrimitiveLongUtil :jm_createPowerOfTen_1 1000))
        (JR/invoke this :jm_init_2 @l_total @l_countedPickedUpLayerInterfaceFactory))
  this)

(defn jnew_2 [p_total p_countedPickedUpLayerInterfaceFactory ]
  (let [o (JR/alloc 'CountedLayerInterfaceFactoryPart)] (jinit_2 o p_total p_countedPickedUpLayerInterfaceFactory) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/invoke this :jm_setXOffset_1 (+ (JR/invoke @l_font :jm_charsWidth_3 (JR/fget this :totalString) 0 (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCurrentTotalDigits_0)) (JR/ishr (JR/invoke @l_font :jm_getSize_0) 1)))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_init_2 [this p_total p_countedPickedUpLayerInterfaceFactory]
  (let [ l_total (volatile! p_total) l_countedPickedUpLayerInterfaceFactory (volatile! p_countedPickedUpLayerInterfaceFactory)]
        (JR/invoke this :jm_setCountedPickedUpLayerInterfaceFactory_1 @l_countedPickedUpLayerInterfaceFactory)
        (JR/fset this :total @l_total)))

    
(defn jm_getInstance_4 [this p_hashtable p_x p_y p_z]
  (let [ l_hashtable (volatile! p_hashtable) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (if (> (JR/fget this :total) 0)
            (do
            (JR/invoke this :jm_setTotal_1 (unchecked-int (unchecked-subtract (JR/fget this :total) 1)))
            (JR/invoke (JR/invoke this :jm_getCountedPickedUpLayerInterfaceFactory_0) :jm_getNextInstance_4 @l_hashtable @l_x @l_y @l_z))
            (do
            (JR/jthrow (new java.lang.Exception "No more left. Could use a listener to automatically remove"))))))

    
(defn jm_getTotal_0 [this]
  (let []
        (JR/fget this :total)))

    
(defn jm_setTotal_1 [this p_total]
  (let [ l_total (volatile! p_total)]
        (JR/fset this :total @l_total)
        (JR/fset this :totalString (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCharArray_1 @l_total))
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_getAnimationInterface_0 [this]
  (let []
        (JR/fget this :animationInterface)))

    
(defn jm_setAnimationInterface_1 [this p_animationInterface]
  (let [ l_animationInterface (volatile! p_animationInterface)]
        (JR/fset this :animationInterface @l_animationInterface)))

    
(defn jm_getXOffset_0 [this]
  (let []
        (JR/fget this :xOffset)))

    
(defn jm_setXOffset_1 [this p_totalStringWidth]
  (let [ l_totalStringWidth (volatile! p_totalStringWidth)]
        (JR/fset this :xOffset @l_totalStringWidth)))

    
(defn jm_getTotalString_0 [this]
  (let []
        (JR/fget this :totalString)))

    
(defn jm_getCountedPickedUpLayerInterfaceFactory_0 [this]
  (let []
        (JR/fget this :countedPickedUpLayerInterfaceFactory)))

    
(defn jm_setCountedPickedUpLayerInterfaceFactory_1 [this p_countedPickedUpLayerInterfaceFactory]
  (let [ l_countedPickedUpLayerInterfaceFactory (volatile! p_countedPickedUpLayerInterfaceFactory)]
        (JR/fset this :countedPickedUpLayerInterfaceFactory @l_countedPickedUpLayerInterfaceFactory)))



