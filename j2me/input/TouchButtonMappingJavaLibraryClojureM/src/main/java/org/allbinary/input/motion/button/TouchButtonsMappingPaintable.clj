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

(ns TouchButtonsMappingPaintable)

(JR/register 'TouchButtonsMappingPaintable 'Paintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :foregroundColor 0)
  (JR/fset this :paintableTable nil)
  (JR/fset this :touchButtonLocationHelper nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :paintableTable (JR/anew "Object" 2 0 0))
    (JR/fset this :touchButtonLocationHelper (TouchButtonLocationHelper/jnew_0))
  this)

    
(defn jinit_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :foregroundColor (JR/invoke @l_basicColor :jm_intValue_0))
        (JR/invoke this :jm_init_0))
  this)

(defn jnew_1 [p_basicColor ]
  (let [o (JR/alloc 'TouchButtonsMappingPaintable)] (jinit_1 o p_basicColor) o))

    
(defn jm_init_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/fset this :paintableTable (JR/invoke this :jm_createPaintableTable_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "updateRectangle" @l_e)) :else (throw jt)))))))

    
(defn jm_createPaintableTable_0 [this]
  (let [ l_totalColumns (volatile! nil) l_totalRows (volatile! nil) l_paintableTable (volatile! nil) l_cellPositionFactory (volatile! nil) l_commonButtons (volatile! nil) l_rowIndex (volatile! nil) l_index (volatile! nil)]
        (vreset! l_totalColumns (JR/invoke (JR/fget this :touchButtonLocationHelper) :jm_getTotalColumns_0))
        (vreset! l_totalRows (JR/invoke (JR/fget this :touchButtonLocationHelper) :jm_getTotalRows_0))
        (vreset! l_paintableTable (JR/anew "Object" 2 @l_totalColumns @l_totalRows))
        (vreset! l_cellPositionFactory (JR/scall 'CellPositionFactory :jm_getInstance_0))
        (vreset! l_commonButtons (JR/scall 'CommonButtons :jm_getInstance_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_totalColumns 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (do (vreset! l_rowIndex (unchecked-int (unchecked-subtract @l_totalRows 1)))
                (JR/jfor false false (>= @l_rowIndex 0) (do (JR/vinc l_rowIndex -1 :int false))
                (JR/aset* (JR/aget* (JR/fget this :paintableTable) @l_index) @l_rowIndex (JR/scall 'TouchButton :jm_createButton_6 (JR/fget (JR/scall 'BasicTouchInputFactory :jm_getInstance_0) :NONE) (JR/scall 'TouchButtonBlankResource :jm_getInstance_0) (JR/fget @l_commonButtons :NORMAL_BUTTON) (JR/invoke @l_cellPositionFactory :jm_getInstanceColRow_2 @l_index @l_rowIndex) (JR/invoke (JR/fget this :touchButtonLocationHelper) :jm_getColumnsRemainderHalf_0) (JR/invoke (JR/fget this :touchButtonLocationHelper) :jm_getRowsRemainderHalf_0)))))))
        @l_paintableTable))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_totalColumns (volatile! nil) l_totalRows (volatile! nil) l_rowIndex (volatile! nil) l_index (volatile! nil)]
        (vreset! l_totalColumns (JR/invoke (JR/fget this :touchButtonLocationHelper) :jm_getTotalColumns_0))
        (vreset! l_totalRows (JR/invoke (JR/fget this :touchButtonLocationHelper) :jm_getTotalRows_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_totalColumns 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (do (vreset! l_rowIndex (unchecked-int (unchecked-subtract @l_totalRows 1)))
                (JR/jfor false false (>= @l_rowIndex 0) (do (JR/vinc l_rowIndex -1 :int false))
                (JR/invoke (JR/aget* (JR/aget* (JR/fget this :paintableTable) @l_index) @l_rowIndex) :jm_paint_1 @l_graphics)))))))



