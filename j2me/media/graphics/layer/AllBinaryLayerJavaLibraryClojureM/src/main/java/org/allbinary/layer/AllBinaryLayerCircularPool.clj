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

(ns AllBinaryLayerCircularPool)

(JR/register 'AllBinaryLayerCircularPool 'BaseCircularPool '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (BaseCircularPool/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryLayerCircularPool)] (jinit_0 o) o))

    
(defn jm_initAllBinaryLayerCircularPool_2 [this p_allbinaryLayerFactoryInterface p_total]
  (let [ l_allbinaryLayerFactoryInterface (volatile! p_allbinaryLayerFactoryInterface) l_total (volatile! p_total) l_localIndex (volatile! nil)]
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 @l_total))
        (JR/fset this :OBJECT_ARRAY (JR/anew "Object" 1 @l_total))
        (do (vreset! l_localIndex 0)
            (JR/jfor false false (< @l_localIndex @l_total) (do (JR/vinc l_localIndex 1 :int false))
            (JR/aset* (JR/fget this :OBJECT_ARRAY) @l_localIndex (JR/invoke @l_allbinaryLayerFactoryInterface :jm_getInstance_0))))))



