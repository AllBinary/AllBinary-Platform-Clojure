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

(ns LayerPlacementType)

(JR/register 'LayerPlacementType nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :type 0)
  this)

    
(defn jinit_1 [this p_type]
  (let [ l_type (volatile! p_type)]
    nil (jinitfields this)
        (JR/fset this :type @l_type))
  this)

(defn jnew_1 [p_type ]
  (let [o (JR/alloc 'LayerPlacementType)] (jinit_1 o p_type) o))

    
(defn jm_getType_0 [this]
  (let []
        (JR/fget this :type)))

    
(defn jm_setType_1 [this p_type]
  (let [ l_type (volatile! p_type)]
        (JR/fset this :type @l_type)))



