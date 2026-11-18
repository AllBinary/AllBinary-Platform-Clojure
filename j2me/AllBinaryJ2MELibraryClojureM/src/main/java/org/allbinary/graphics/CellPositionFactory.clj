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

(ns CellPositionFactory)

(JR/register 'CellPositionFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (CellPositionFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :NONE nil)
  (JR/fset this :cellPositionArray nil)
  (JR/fset this :columns 0)
  (JR/fset this :rows 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :NONE (CellPosition/jnew_4 (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1)))))
    (JR/fset this :cellPositionArray (JR/anew "Object" 2 0 0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CellPositionFactory/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CellPositionFactory)] (jinit_0 o) o))

    
(defn jm_init_2 [this p_columns p_rows]
  (let [ l_columns (volatile! p_columns) l_rows (volatile! p_rows) l_commonStrings (volatile! nil) l_stringBuffer (volatile! nil) l_row (volatile! nil) l_column (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Init: columns: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_columns)
        (JR/invoke @l_stringBuffer :jm_append_1 " rows: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_rows)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget @l_commonStrings :INIT))
        (JR/fset this :cellPositionArray (JR/anew "Object" 2 @l_columns @l_rows))
        (JR/fset this :columns @l_columns)
        (JR/fset this :rows @l_rows)
        (do (vreset! l_column 0)
            (JR/jfor false false (< @l_column @l_columns) (do (JR/vinc l_column 1 :int false))
            (do (vreset! l_row 0)
                (JR/jfor false false (< @l_row @l_rows) (do (JR/vinc l_row 1 :int false))
                (JR/invoke this :jm_createInstance_2 @l_column @l_row)))))))

    
(defn jm_getInstanceColRow_2 [this p_i_column p_i_row]
  (let [ l_i_column (volatile! p_i_column) l_i_row (volatile! p_i_row) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (JR/jreturn (JR/aget* (JR/aget* (JR/fget this :cellPositionArray) @l_i_column) @l_i_row)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "columns: ") :jm_appendint_1 (JR/invoke this :jm_getColumns_0)) :jm_append_1 " rows: ") :jm_appendint_1 (JR/invoke this :jm_getRows_0)) :jm_append_1 " col: ") :jm_appendint_1 @l_i_column) :jm_append_1 " row: ") :jm_appendint_1 @l_i_row)) this (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)
            (JR/jreturn (JR/fget this :NONE))) :else (throw jt))))))))

    
(defn jm_createInstance_2 [this p_i_column p_i_row]
  (let [ l_i_column (volatile! p_i_column) l_i_row (volatile! p_i_row) l_cellPositionCanBeNull (volatile! nil)]
        (vreset! l_cellPositionCanBeNull (JR/aget* (JR/aget* (JR/fget this :cellPositionArray) @l_i_column) @l_i_row))
        (if (nil? @l_cellPositionCanBeNull)
            (do
            (vreset! l_cellPositionCanBeNull (CellPosition/jnew_4 @l_i_column @l_i_row (JR/fget this :columns) (JR/fget this :rows)))
            (JR/aset* (JR/aget* (JR/fget this :cellPositionArray) @l_i_column) @l_i_row @l_cellPositionCanBeNull)))
        @l_cellPositionCanBeNull))

    
(defn jm_getColumns_0 [this]
  (let []
        (JR/fget this :columns)))

    
(defn jm_getRows_0 [this]
  (let []
        (JR/fget this :rows)))



