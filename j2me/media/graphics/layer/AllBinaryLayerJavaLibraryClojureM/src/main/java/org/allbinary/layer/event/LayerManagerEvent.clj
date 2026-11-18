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
;; package org.allbinary.layer.event

(ns LayerManagerEvent)

(JR/register 'LayerManagerEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :layerInterface nil)
  (JR/fset this :crud nil)
    (JR/fset this :layerInterface (JR/sget 'AllBinaryLayer "NULL_ALLBINARY_LAYER"))
  this)

    
(defn jinit_2 [this p_layerManager p_crud]
  (let [ l_layerManager (volatile! p_layerManager) l_crud (volatile! p_crud)]
        (AllBinaryEventObject/jinit_1 this @l_layerManager) (jinitfields this)
        (JR/fset this :crud @l_crud))
  this)

(defn jnew_2 [p_layerManager p_crud ]
  (let [o (JR/alloc 'LayerManagerEvent)] (jinit_2 o p_layerManager p_crud) o))

    
(defn jm_getLayerInterface_0 [this]
  (let []
        (JR/fget this :layerInterface)))

    
(defn jm_setLayerInterface_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/fset this :layerInterface @l_layerInterface)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "LayerManagerEvent: \n")
        (JR/invoke @l_stringBuffer :jm_append_1 "LayerInterface: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/invoke this :jm_getLayerInterface_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 "\nCRUD: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :crud))
        (JR/to-string-of @l_stringBuffer)))



