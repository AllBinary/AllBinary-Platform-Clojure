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
;; package org.allbinary.game.layer.pickup

(ns CountedPickedUpLayerInterfaceFactory)

(JR/register 'CountedPickedUpLayerInterfaceFactory 'PickedUpLayerInterfaceFactory '[CountedPickedUpLayerInterfaceFactoryInterface])

(def jsv_NULL_COUNTED_PICKUP_LAYER_FACTORY (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_COUNTED_PICKUP_LAYER_FACTORY [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_COUNTED_PICKUP_LAYER_FACTORY)
(defn jstatic_set_NULL_COUNTED_PICKUP_LAYER_FACTORY [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_COUNTED_PICKUP_LAYER_FACTORY v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_COUNTED_PICKUP_LAYER_FACTORY (CountedPickedUpLayerInterfaceFactory/jnew_3 (JR/fget (JR/scall 'PickedUpLayerTypeFactory :jm_getInstance_0) :NONE) (JR/sget 'IconLayer "NULL_ICON_LAYER") (JR/invoke (JR/scall 'NullAnimationFactory :jm_getFactoryInstance_0) :jm_getInstance_1 0)))
    nil))

(defn jinitfields [this]
  (JR/fset this :id 0)
  this)

    
(defn jinit_3 [this p_pickeUpLayerType p_iconLayer p_animationInterface]
  (let [ l_pickeUpLayerType (volatile! p_pickeUpLayerType) l_iconLayer (volatile! p_iconLayer) l_animationInterface (volatile! p_animationInterface) l_list (volatile! nil)]
        (PickedUpLayerInterfaceFactory/jinit_3 this @l_pickeUpLayerType @l_iconLayer @l_animationInterface) (jinitfields this)
        (vreset! l_list (JR/invoke (JR/scall 'CountedPickedUpLayerInterfaceFactoryPool :jm_getInstance_0) :jm_getList_0))
        (JR/fset this :id (JR/invoke @l_list :jm_size_0))
        (JR/invoke @l_list :jm_add_1 this))
  this)

(defn jnew_3 [p_pickeUpLayerType p_iconLayer p_animationInterface ]
  (let [o (JR/alloc 'CountedPickedUpLayerInterfaceFactory)] (jinit_3 o p_pickeUpLayerType p_iconLayer p_animationInterface) o))

    
(defn jm_getNextInstance_4 [this p_hashtable p_x p_y p_z]
  (let [ l_hashtable (volatile! p_hashtable) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :NOT_IMPLEMENTED)))))

    
(defn jm_getTotal_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_getId_0 [this]
  (let []
        (JR/fget this :id)))



