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
;; package org.allbinary.logic.util.cache

(ns BaseCircularPool)

(JR/register 'BaseCircularPool nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :OBJECT_ARRAY nil)
    (JR/fset this :circularIndexUtil (JR/sget 'CircularIndexUtil "NULL_CIRCULAR_INDEX_UTIL"))
    (JR/fset this :OBJECT_ARRAY (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT_ARRAY))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BaseCircularPool)] (jinit_0 o) o))

    
(defn jm_getNextInstance_0 [this]
  (let [ l_anyType (volatile! nil)]
        (vreset! l_anyType (JR/aget* (JR/fget this :OBJECT_ARRAY) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0)))
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)
        @l_anyType))

    
(defn jm_init_1 [this p_allBinaryObjectFactoryInterface]
  (let [ l_allBinaryObjectFactoryInterface (volatile! p_allBinaryObjectFactoryInterface) l_size (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_setIndex_1 0)
        (vreset! l_size (JR/invoke (JR/fget this :circularIndexUtil) :jm_getSize_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :OBJECT_ARRAY) @l_index (JR/invoke @l_allBinaryObjectFactoryInterface :jm_getInstance_0))))))

    
(defn jm_getInstance_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/aget* (JR/fget this :OBJECT_ARRAY) @l_index)))



