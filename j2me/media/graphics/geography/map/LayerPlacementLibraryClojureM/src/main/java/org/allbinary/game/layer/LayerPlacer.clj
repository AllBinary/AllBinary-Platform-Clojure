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

(ns LayerPlacer)

(JR/register 'LayerPlacer nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :enumerationUtil nil)
  (JR/fset this :layerInterfaceVisitor nil)
  (JR/fset this :dimension nil)
    (JR/fset this :enumerationUtil (JR/scall 'EnumerationUtil :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_layerInterfaceVisitor p_dimension]
  (let [ l_layerInterfaceVisitor (volatile! p_layerInterfaceVisitor) l_dimension (volatile! p_dimension)]
    nil (jinitfields this)
        (JR/fset this :layerInterfaceVisitor @l_layerInterfaceVisitor)
        (JR/fset this :dimension @l_dimension))
  this)

(defn jnew_2 [p_layerInterfaceVisitor p_dimension ]
  (let [o (JR/alloc 'LayerPlacer)] (jinit_2 o p_layerInterfaceVisitor p_dimension) o))

    
(defn jm_processList_1 [this p_list]
  (let [ l_list (volatile! p_list) l_size (volatile! nil) l_layerPlacementInterface (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_layerPlacementInterface nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_layerPlacementInterface (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke this :jm_process_1 @l_layerPlacementInterface)))))

    
(defn jm_process_1 [this p_layerPlacementInterface]
  (let [ l_layerPlacementInterface (volatile! p_layerPlacementInterface) l_relativePoint (volatile! nil) l_layerInterfaceFactory (volatile! nil) l_hashtable (volatile! nil) l_enumeration (volatile! nil) l_point (volatile! nil) l_layerHashtable (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_z (volatile! nil) l_layerInterface (volatile! nil)]
        (vreset! l_relativePoint (JR/invoke this :jm_getPoint_1 @l_layerPlacementInterface))
        (vreset! l_layerInterfaceFactory (JR/scall 'LayerInterfaceFactory :jm_getInstance_0))
        (vreset! l_hashtable (JR/invoke @l_layerPlacementInterface :jm_getInstance_0))
        (vreset! l_enumeration (JR/invoke @l_hashtable :jm_keys_0))
        (vreset! l_point nil)
        (vreset! l_layerHashtable nil)
        (vreset! l_x 0)
        (vreset! l_y 0)
        (vreset! l_z 0)
        (vreset! l_layerInterface nil)
        (JR/jwhile false false (JR/invoke (JR/fget this :enumerationUtil) :jm_hasMoreElements_1 @l_enumeration)
            (vreset! l_point (JR/invoke (JR/fget this :enumerationUtil) :jm_nextElement_1 @l_enumeration))
            (vreset! l_layerHashtable (JR/invoke @l_hashtable :jm_get_1 @l_point))
            (vreset! l_x (unchecked-int (unchecked-add (JR/invoke @l_point :jm_getX_0) (JR/invoke @l_relativePoint :jm_getX_0))))
            (vreset! l_y (unchecked-int (unchecked-add (JR/invoke @l_point :jm_getY_0) (JR/invoke @l_relativePoint :jm_getY_0))))
            (vreset! l_z (unchecked-int (unchecked-add (JR/invoke @l_point :jm_getZ_0) (JR/invoke @l_relativePoint :jm_getZ_0))))
            (vreset! l_layerInterface (JR/invoke @l_layerInterfaceFactory :jm_getNexInstance_4 @l_layerHashtable @l_x @l_y @l_z))
            (JR/invoke (JR/fget this :layerInterfaceVisitor) :jm_visit_1 @l_layerInterface))))

    
(defn jm_getPoint_1 [this p_layerPlacementInterface]
  (let [ l_layerPlacementInterface (volatile! p_layerPlacementInterface) l_pointFactory (volatile! nil) l_layerPlacementType (volatile! nil) l_width (volatile! nil) l_height (volatile! nil) l_x (volatile! nil) l_y (volatile! nil)]
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_layerPlacementType (JR/invoke @l_layerPlacementInterface :jm_getLayerType_0))
        (if (JR/eq @l_layerPlacementType (JR/fget (JR/scall 'LayerPlacementTypeFactory :jm_getInstance_0) :MAP))
            (do
            (vreset! l_width (JR/invoke @l_layerPlacementInterface :jm_getWidth_0))
            (vreset! l_height (JR/invoke @l_layerPlacementInterface :jm_getHeight_0))
            (vreset! l_x (JR/idiv (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :dimension) :jm_getX_0) @l_width)) 2))
            (vreset! l_y (JR/idiv (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :dimension) :jm_getY_0) @l_height)) 2))
            (JR/invoke @l_pointFactory :jm_createXY_2 @l_x @l_y))
            (if (JR/eq @l_layerPlacementType (JR/fget (JR/scall 'LayerPlacementTypeFactory :jm_getInstance_0) :UP))
            (do
            (vreset! l_width (JR/invoke @l_layerPlacementInterface :jm_getWidth_0))
            (vreset! l_height (JR/invoke @l_layerPlacementInterface :jm_getHeight_0))
            (vreset! l_x (JR/idiv (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :dimension) :jm_getX_0) @l_width)) 2))
            (vreset! l_y (unchecked-int (unchecked-negate (JR/c2i @l_height))))
            (JR/invoke @l_pointFactory :jm_createXY_2 @l_x @l_y))
            (do
            (JR/jthrow (new java.lang.Exception "PlacementType Not Recognized")))))))



