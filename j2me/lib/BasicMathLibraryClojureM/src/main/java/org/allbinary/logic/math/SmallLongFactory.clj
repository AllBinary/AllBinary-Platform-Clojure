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
;; package org.allbinary.logic.math

(ns SmallLongFactory)

(JR/register 'SmallLongFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SmallLongFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NEGATIVE_MAX 0)
  (JR/fset this :POSITIVE_MAX 0)
  (JR/fset this :INTEGER_ARRAY nil)
  (JR/fset this :STRING_ARRAY nil)
  (JR/fset this :MIN 0)
  (JR/fset this :lastMin 0)
  (JR/fset this :lastNegativeMin 0)
    (JR/fset this :NEGATIVE_MAX 500)
    (JR/fset this :POSITIVE_MAX (unchecked-int 0x2D1))
    (JR/fset this :INTEGER_ARRAY (JR/anew "Object" 1 (unchecked-int (unchecked-add (JR/fget this :NEGATIVE_MAX) (JR/fget this :POSITIVE_MAX)))))
    (JR/fset this :STRING_ARRAY (JR/anew "String" 1 (unchecked-int (unchecked-add (JR/fget this :NEGATIVE_MAX) (JR/fget this :POSITIVE_MAX)))))
    (JR/fset this :MIN 0)
    (JR/fset this :lastMin 0)
    (JR/fset this :lastNegativeMin 0)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (SmallLongFactory/jstatic_instance)))

    
(defn jm_initWithRange_2 [this p_value p_negativeValue]
  (let [ l_value (volatile! p_value) l_negativeValue (volatile! p_negativeValue) l_index (volatile! nil)]
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_value 1)))
            (JR/jfor false false (>= @l_index (JR/fget this :lastMin)) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :INTEGER_ARRAY) (unchecked-int (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX))) (long @l_index))))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_negativeValue 1)))
            (JR/jfor false false (>= @l_index (JR/fget this :lastNegativeMin)) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :INTEGER_ARRAY) @l_index (long (unchecked-int (unchecked-negate (JR/c2i @l_index)))))))
        (if (< (JR/fget this :lastMin) @l_value)
            (do
            (JR/fset this :lastMin @l_value)
            (JR/fset this :MIN @l_value)))
        (if (< (JR/fget this :lastNegativeMin) @l_negativeValue)
            (do
            (JR/fset this :lastNegativeMin @l_negativeValue)))))

    
(defn jm_init_0 [this]
  (let [ l_index (volatile! nil)]
        (if (nil? (JR/aget* (JR/fget this :INTEGER_ARRAY) 0))
            (do
            (if (or (< (JR/fget this :lastMin) (JR/fget this :POSITIVE_MAX)) (< (JR/fget this :lastNegativeMin) (JR/fget this :NEGATIVE_MAX)))
                (do
                (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/fget this :POSITIVE_MAX) 1)))
                    (JR/jfor false false (>= @l_index (JR/fget this :lastMin)) (do (JR/vinc l_index -1 :int false))
                    (JR/aset* (JR/fget this :INTEGER_ARRAY) (unchecked-int (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX))) (long @l_index))))
                (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/fget this :NEGATIVE_MAX) 1)))
                    (JR/jfor false false (>= @l_index (JR/fget this :lastNegativeMin)) (do (JR/vinc l_index -1 :int false))
                    (JR/aset* (JR/fget this :INTEGER_ARRAY) @l_index (long (unchecked-int (unchecked-negate (JR/c2i @l_index)))))))
                (JR/fset this :lastMin (JR/fget this :POSITIVE_MAX))
                (JR/fset this :lastNegativeMin (JR/fget this :NEGATIVE_MAX))))))))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'SmallLongFactory)] (jinit_0 o) o))

    
(defn jm_getInstanceNoThrow_1 [this p_index]
  (let [ l_index (volatile! p_index)](JR/method
        (if (> (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX)) (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :INTEGER_ARRAY)) 1)))
            (do
            (JR/jreturn (JR/aget* (JR/fget this :INTEGER_ARRAY) (unchecked-int (unchecked-add (unchecked-int (unchecked-negate (JR/c2i 1))) (JR/fget this :NEGATIVE_MAX)))))))
        (JR/aget* (JR/fget this :INTEGER_ARRAY) (unchecked-int (unchecked-add (JR/i32 @l_index) (JR/fget this :NEGATIVE_MAX)))))))

    
(defn jm_getString_1 [this p_index]
  (let [ l_index (volatile! p_index) l_i (volatile! nil)]
        (vreset! l_i (unchecked-int (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX))))
        (if (nil? (JR/aget* (JR/fget this :STRING_ARRAY) @l_i))
            (do
            (JR/aset* (JR/fget this :STRING_ARRAY) @l_i (JR/to-string-of (JR/aget* (JR/fget this :INTEGER_ARRAY) @l_i)))))
        (JR/aget* (JR/fget this :STRING_ARRAY) @l_i)))



