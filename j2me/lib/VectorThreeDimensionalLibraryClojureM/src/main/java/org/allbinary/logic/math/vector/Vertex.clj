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
;; package org.allbinary.logic.math.vector

(ns Vertex)

(JR/register 'Vertex nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :x nil)
  (JR/fset this :y nil)
  (JR/fset this :z nil)
    (JR/fset this :x (BasicDecimal/jnew_1 0))
    (JR/fset this :y (BasicDecimal/jnew_1 0))
    (JR/fset this :z (BasicDecimal/jnew_1 0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'Vertex)] (jinit_0 o) o))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_positionStrings (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_positionStrings (JR/scall 'PositionStrings :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :X_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :x)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Y_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :y)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_positionStrings :Z_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :z)))
        (JR/to-string-of @l_stringBuffer)))



