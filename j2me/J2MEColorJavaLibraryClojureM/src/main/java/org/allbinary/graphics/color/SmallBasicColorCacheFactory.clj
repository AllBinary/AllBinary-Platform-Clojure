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

(ns SmallBasicColorCacheFactory)

(JR/register 'SmallBasicColorCacheFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SmallBasicColorCacheFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :SIZE 0)
  (JR/fset this :INDEX_TO_COLOR nil)
  (JR/fset this :BASIC_COLOR_ARRAY nil)
  (JR/fset this :colorIndex 0)
    (JR/fset this :SIZE 255)
    (JR/fset this :INDEX_TO_COLOR (JR/anew "INT" 1 (JR/fget this :SIZE)))
    (JR/fset this :BASIC_COLOR_ARRAY (JR/anew "Object" 1 (JR/fget this :SIZE)))
    (JR/fset this :colorIndex 0)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SmallBasicColorCacheFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'SmallBasicColorCacheFactory)] (jinit_0 o) o))

    
(defn jm_add_1 [this p_basicDefaultColor]
  (let [ l_basicDefaultColor (volatile! p_basicDefaultColor)]
        (JR/aset* (JR/fget this :BASIC_COLOR_ARRAY) (JR/fget this :colorIndex) @l_basicDefaultColor)
        (JR/aset* (JR/fget this :INDEX_TO_COLOR) (JR/fget this :colorIndex) (JR/invoke @l_basicDefaultColor :jm_intValue_0))
        (JR/finc this :colorIndex 1 :int false)))

    
(defn jm_getAndOrCreate_1 [this p_colorAsInt]
  (let [ l_colorAsInt (volatile! p_colorAsInt) l_basicColor (volatile! nil) l_index (volatile! nil) l_ALPHA_MASK (volatile! nil)](JR/method
        (vreset! l_basicColor nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :SIZE)) (do (JR/vinc l_index 1 :int false))
            (if (== (JR/aget* (JR/fget this :INDEX_TO_COLOR) @l_index) @l_colorAsInt)
                (do
                (JR/jreturn (JR/aget* (JR/fget this :BASIC_COLOR_ARRAY) @l_index))))))
        (vreset! l_ALPHA_MASK (unchecked-int 0xFF000000))
        (vreset! l_basicColor (JR/invoke (JR/scall 'BasicColorFactory :jm_getInstance_0) :jm_createInstanceAN_3 (bit-and @l_colorAsInt @l_ALPHA_MASK) (bit-and @l_colorAsInt (unchecked-int 0x00FFFFFF)) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
        (JR/invoke this :jm_add_1 @l_basicColor)
        @l_basicColor)))



