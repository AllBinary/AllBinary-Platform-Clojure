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
;; package org.allbinary.graphics.color

(ns BasicColorArrayIndexer)

(JR/register 'BasicColorArrayIndexer nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :basicColorArray nil)
  (JR/fset this :circularIndexUtil nil)
  this)

    
(defn jinit_1 [this p_basicColorArray]
  (let [ l_basicColorArray (volatile! p_basicColorArray)]
    nil (jinitfields this)
        (JR/fset this :basicColorArray @l_basicColorArray)
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 (JR/alen (JR/fget this :basicColorArray)))))
  this)

(defn jnew_1 [p_basicColorArray ]
  (let [o (JR/alloc 'BasicColorArrayIndexer)] (jinit_1 o p_basicColorArray) o))

    
(defn jm_next_0 [this]
  (let []
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)))

    
(defn jm_get_0 [this]
  (let []
        (JR/aget* (JR/fget this :basicColorArray) (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))))

    
(defn jm_getBasicColorArray_0 [this]
  (let []
        (JR/fget this :basicColorArray)))



