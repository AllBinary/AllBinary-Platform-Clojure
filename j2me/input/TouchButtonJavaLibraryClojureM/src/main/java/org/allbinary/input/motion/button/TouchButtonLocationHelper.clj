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

(ns TouchButtonLocationHelper)

(JR/register 'TouchButtonLocationHelper nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :totalColumns 0)
  (JR/fset this :totalRows 0)
  (JR/fset this :columnsRemainder 0)
  (JR/fset this :rowsRemainder 0)
  (JR/fset this :columnsRemainderHalf 0)
  (JR/fset this :rowsRemainderHalf 0)
  this)

    
(defn jinit_0 [this]
  (let [ l_buttonSize (volatile! nil) l_displayInfo (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_buttonSize (JR/fget (JR/scall 'CommonButtons :jm_getInstance_0) :STANDARD_BUTTON_SIZE))
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (JR/fset this :totalColumns (java.lang.Math/round (double (/ (double (JR/f32 (JR/invoke @l_displayInfo :jm_getLastWidth_0))) (JR/f32 @l_buttonSize)))))
        (JR/fset this :totalRows (java.lang.Math/round (double (/ (double (JR/f32 (JR/invoke @l_displayInfo :jm_getLastHeight_0))) (JR/f32 @l_buttonSize)))))
        (JR/fset this :columnsRemainder (rem (JR/invoke @l_displayInfo :jm_getLastWidth_0) @l_buttonSize))
        (JR/fset this :columnsRemainderHalf (JR/ishr (JR/fget this :columnsRemainder) 1))
        (JR/fset this :rowsRemainder (rem (JR/invoke @l_displayInfo :jm_getLastHeight_0) @l_buttonSize))
        (JR/fset this :rowsRemainderHalf (JR/ishr (JR/fget this :rowsRemainder) 1)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchButtonLocationHelper)] (jinit_0 o) o))

    
(defn jm_getTotalColumns_0 [this]
  (let []
        (JR/fget this :totalColumns)))

    
(defn jm_getTotalRows_0 [this]
  (let []
        (JR/fget this :totalRows)))

    
(defn jm_getColumnsRemainder_0 [this]
  (let []
        (JR/fget this :columnsRemainder)))

    
(defn jm_getRowsRemainder_0 [this]
  (let []
        (JR/fget this :rowsRemainder)))

    
(defn jm_getColumnsRemainderHalf_0 [this]
  (let []
        (JR/fget this :columnsRemainderHalf)))

    
(defn jm_getRowsRemainderHalf_0 [this]
  (let []
        (JR/fget this :rowsRemainderHalf)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "totalColumns: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :totalColumns))
        (JR/invoke @l_stringBuffer :jm_append_1 " totalRows: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :totalRows))
        (JR/invoke @l_stringBuffer :jm_append_1 " columnsRemainder: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :columnsRemainder))
        (JR/invoke @l_stringBuffer :jm_append_1 " rowsRemainder: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :rowsRemainder))
        (JR/invoke @l_stringBuffer :jm_append_1 " columnsRemainderHalf: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :columnsRemainderHalf))
        (JR/invoke @l_stringBuffer :jm_append_1 " rowsRemainderHalf: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :rowsRemainderHalf))
        (JR/to-string-of @l_stringBuffer)))



