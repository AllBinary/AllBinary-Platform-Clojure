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
;; package org.allbinary.graphics.form

(ns LockableFormPaintableFactory)

(JR/register 'LockableFormPaintableFactory 'ItemPaintableFactory '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :lockedIndex 0)
  this)

    
(defn jinit_1 [this p_lockedIndex]
  (let [ l_lockedIndex (volatile! p_lockedIndex)]
    (ItemPaintableFactory/jinit_0 this) (jinitfields this)
        (JR/fset this :lockedIndex @l_lockedIndex))
  this)

(defn jnew_1 [p_lockedIndex ]
  (let [o (JR/alloc 'LockableFormPaintableFactory)] (jinit_1 o p_lockedIndex) o))

    
(defn jm_getInstanceItemPaintable_1 [this p_paintableForm]
  (let [ l_paintableForm (volatile! p_paintableForm)]
        (LockablePaintable/jnew_1 (JR/fget this :lockedIndex))))



