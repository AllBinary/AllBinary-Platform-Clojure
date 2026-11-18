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

(ns CellPosition)

(JR/register 'CellPosition 'V '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :id 0)
  (JR/fset this :column 0)
  (JR/fset this :row 0)
  this)

    
(defn jinit_4 [this p_column p_row p_columns p_rows]
  (let [ l_column (volatile! p_column) l_row (volatile! p_row) l_columns (volatile! p_columns) l_rows (volatile! p_rows)]
    (V/jinit_0 this) (jinitfields this)
        (JR/fset this :column @l_column)
        (JR/fset this :row @l_row)
        (JR/fset this :id (unchecked-int (unchecked-add (unchecked-int (unchecked-multiply @l_row @l_columns)) @l_column))))
  this)

(defn jnew_4 [p_column p_row p_columns p_rows ]
  (let [o (JR/alloc 'CellPosition)] (jinit_4 o p_column p_row p_columns p_rows) o))

    
(defn jm_getColumn_0 [this]
  (let []
        (JR/fget this :column)))

    
(defn jm_getRow_0 [this]
  (let []
        (JR/fget this :row)))

    
(defn jm_toString_0 [this]
  (let []
        (CellPosition/jm_toStringColRow_2 (JR/invoke this :jm_getColumn_0) (JR/invoke this :jm_getRow_0))))

    
(defn jm_toStringCellPosition_1 [p_basicGeographicMapCellPosition]
  (let [this nil l_basicGeographicMapCellPosition (volatile! p_basicGeographicMapCellPosition)]
        (CellPosition/jm_toStringColRow_2 (JR/invoke @l_basicGeographicMapCellPosition :jm_getColumn_0) (JR/invoke @l_basicGeographicMapCellPosition :jm_getRow_0))))

    
(defn jm_toStringColRow_2 [p_i_column p_i_row]
  (let [this nil l_i_column (volatile! p_i_column) l_i_row (volatile! p_i_row) l_stringBuffer (volatile! nil) l_commonSeps (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :PARENTHESIS_OPEN))
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_i_column)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA))
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_i_row)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :PARENTHESIS_CLOSE))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getId_0 [this]
  (let []
        (JR/fget this :id)))



