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
;; package org.allbinary.logic.util.event

(ns AllBinaryEventCircularPool)

(JR/register 'AllBinaryEventCircularPool 'BaseCircularPool '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_max]
  (let [ l_max (volatile! p_max)]
    (BaseCircularPool/jinit_0 this) (jinitfields this)
        (JR/fset this :OBJECT_ARRAY (JR/anew "Object" 1 @l_max))
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 @l_max)))
  this)

(defn jnew_1 [p_max ]
  (let [o (JR/alloc 'AllBinaryEventCircularPool)] (jinit_1 o p_max) o))

    
(defn jm_initAllBinaryEventCircularPool_1 [this p_allBinaryEventObjectFactoryInterface]
  (let [ l_allBinaryEventObjectFactoryInterface (volatile! p_allBinaryEventObjectFactoryInterface) l_size (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_setIndex_1 0)
        (vreset! l_size (JR/invoke (JR/fget this :circularIndexUtil) :jm_getSize_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :OBJECT_ARRAY) @l_index (JR/invoke @l_allBinaryEventObjectFactoryInterface :jm_getInstance_0))))))



