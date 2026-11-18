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
;; package org.allbinary.graphics

(ns GPointCircularPool)

(JR/register 'GPointCircularPool 'BaseCircularPool '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_size]
  (let [ l_size (volatile! p_size) l_index (volatile! nil)]
    (BaseCircularPool/jinit_0 this) (jinitfields this)
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 @l_size))
        (JR/fset this :OBJECT_ARRAY (JR/anew "Object" 1 @l_size))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :OBJECT_ARRAY) @l_index (JR/scall 'CustomGPoint :jm_getInstance3_2 0 0)))))
  this)

(defn jnew_1 [p_size ]
  (let [o (JR/alloc 'GPointCircularPool)] (jinit_1 o p_size) o))



