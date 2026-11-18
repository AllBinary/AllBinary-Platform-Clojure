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
;; package org.allbinary.game.paint.help

(ns UpdateMyFontProperties)

(JR/register 'UpdateMyFontProperties nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :actionStringArray nil)
  (JR/fset this :keymappingBeginWidthArray nil)
  (JR/fset this :actionStringDeltaXArray nil)
  (JR/fset this :inputDeltaXArray nil)
  (JR/fset this :sepArray nil)
  (JR/fset this :sepWidthArray nil)
  (JR/fset this :charHeight 0)
    (JR/fset this :actionStringArray (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_getArrayInstance_0))
    (JR/fset this :keymappingBeginWidthArray (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY))
    (JR/fset this :actionStringDeltaXArray (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY))
    (JR/fset this :inputDeltaXArray (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY_ARRAY))
    (JR/fset this :sepArray (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :ONE_EMPTY_STRING_ARRAY_OF_ARRAYS))
    (JR/fset this :sepWidthArray (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_INT_ARRAY_ARRAY))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'UpdateMyFontProperties)] (jinit_0 o) o))



