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
;; package org.allbinary.util

(ns CircularIndexUtil)

(JR/register 'CircularIndexUtil nil '[])

(def jsv_NULL_CIRCULAR_INDEX_UTIL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_CIRCULAR_INDEX_UTIL [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_CIRCULAR_INDEX_UTIL)
(defn jstatic_set_NULL_CIRCULAR_INDEX_UTIL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_CIRCULAR_INDEX_UTIL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_CIRCULAR_INDEX_UTIL (CircularIndexUtil/jnew_2 0 0))
    nil))

(defn jinitfields [this]
  (JR/fset this :index 0)
  (JR/fset this :lastIndex 0)
  (JR/fset this :size 0)
    (JR/fset this :index 0)
    (JR/fset this :lastIndex 0)
    (JR/fset this :size 0)
  this)

    
(defn jinit_2 [this p_index p_size]
  (let [ l_index (volatile! p_index) l_size (volatile! p_size)]
    nil (jinitfields this)
        (JR/invoke this :jm_setSize_1 @l_size)
        (JR/invoke this :jm_setIndex_1 @l_index))
  this)

(defn jnew_2 [p_index p_size ]
  (let [o (JR/alloc 'CircularIndexUtil)] (jinit_2 o p_index p_size) o))

    
(defn jm_next_0 [this]
  (let []
        (if (>= (JR/fget this :index) (JR/fget this :lastIndex))
            (do
            (JR/fset this :index 0))
            (do
            (JR/finc this :index 1 :int false)))
        (JR/fget this :index)))

    
(defn jm_previous_0 [this]
  (let []
        (if (< (JR/fget this :index) 1)
            (do
            (JR/fset this :index (JR/fget this :lastIndex)))
            (do
            (JR/finc this :index -1 :int false)))
        (JR/fget this :index)))

    
(defn jm_setIndex_1 [this p_index]
  (let [ l_index (volatile! p_index)](JR/method
        (if (> @l_index (JR/fget this :lastIndex))
            (do
            (JR/jreturn)))
        (JR/fset this :index @l_index))))

    
(defn jm_getIndex_0 [this]
  (let []
        (JR/fget this :index)))

    
(defn jm_createInstance_1 [p_max]
  (let [this nil l_max (volatile! p_max)]
        (CircularIndexUtil/jnew_2 0 @l_max)))

    
(defn jm_createInstanceAt_2 [p_index p_max]
  (let [this nil l_index (volatile! p_index) l_max (volatile! p_max)]
        (CircularIndexUtil/jnew_2 @l_index @l_max)))

    
(defn jm_setSize_1 [this p_size]
  (let [ l_size (volatile! p_size)]
        (JR/fset this :size @l_size)
        (JR/fset this :lastIndex (unchecked-int (unchecked-subtract @l_size 1)))
        (JR/fset this :index 0)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/fget this :size)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :INDEX_LABEL)) :jm_appendint_1 (JR/fget this :index)) :jm_append_1 "lastIndex: ") :jm_appendint_1 (JR/fget this :lastIndex)) :jm_append_1 "size: ") :jm_appendint_1 (JR/fget this :size)))))



