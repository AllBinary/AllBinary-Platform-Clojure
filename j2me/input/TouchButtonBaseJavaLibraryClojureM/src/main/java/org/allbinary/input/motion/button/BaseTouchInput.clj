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
;; package org.allbinary.input.motion.button

(ns BaseTouchInput)

(JR/register 'BaseTouchInput nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :basicArrayListUtil nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :basicArrayListUtil (JR/scall 'BasicArrayListUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BaseTouchInput)] (jinit_0 o) o))

    
(defn jm_getList_0 [this]
  (let []
        (JR/invoke (JR/fget this :basicArrayListUtil) :jm_getImmutableInstance_0)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/class-name this)))



