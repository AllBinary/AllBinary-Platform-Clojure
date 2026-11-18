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

(ns SmallIntegerSingletonFactory)

(JR/register 'SmallIntegerSingletonFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (SmallIntegerSingletonFactory/jnew_0))
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
        (SmallIntegerSingletonFactory/jstatic_instance)))

    
(defn jm_getMin_0 [this]
  (let [ l_minAllowed (volatile! nil) l_logUtil (volatile! nil)]
        (vreset! l_minAllowed (JR/invoke this :jm_getMinAllowed_0))
        (if (<= (JR/fget this :MIN) @l_minAllowed)
            (do
            (if (JR/scall 'J2MEUtil :jm_isJ2ME_0)
                (do
                nil)
                (if (JR/scall 'AndroidUtil :jm_isAndroid_0)
                (do
                (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
                (JR/invoke @l_logUtil :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Android InputFactory was initialized before GameMidlet: ") :jm_appendint_1 (JR/fget this :MIN))) this "getMin")
                (JR/invoke this :jm_initWithRange_2 (unchecked-int 0x291) 6))
                (do
                (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
                (JR/invoke @l_logUtil :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "InputFactory was initialized before GameMidlet or KeyFactoryInitializer - Currently this is occurs on JS build by TouchMotionGestureFactory constructor: ") :jm_appendint_1 (JR/fget this :MIN))) this "getMin")
                (JR/invoke this :jm_initWithRange_2 (unchecked-int 0x2D0) 6))))))
        (if (<= (JR/fget this :MIN) @l_minAllowed)
            (do
            (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
            (JR/invoke @l_logUtil :jm_put_4 "This means you loaded the InputFactory before determining the platform input size requirements." this "getMin" (new java.lang.Exception))))
        (JR/fget this :MIN)))

    
(defn jm_getMinAllowed_0 [this]
  (let []
        (if (JR/scall 'J2MEUtil :jm_isJ2ME_0)
            (do
            0)
            (do
            (if (JR/scall 'AndroidUtil :jm_isAndroid_0)
                (do
                (unchecked-int 0x101))
                (do
                23))))))

    
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
        (if (or (< (JR/fget this :lastMin) (JR/fget this :POSITIVE_MAX)) (< (JR/fget this :lastNegativeMin) (JR/fget this :NEGATIVE_MAX)))
            (do
            (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/fget this :POSITIVE_MAX) 1)))
                (JR/jfor false false (>= @l_index (JR/fget this :lastMin)) (do (JR/vinc l_index -1 :int false))
                (JR/aset* (JR/fget this :INTEGER_ARRAY) (unchecked-int (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX))) (long @l_index))))
            (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/fget this :NEGATIVE_MAX) 1)))
                (JR/jfor false false (>= @l_index (JR/fget this :lastNegativeMin)) (do (JR/vinc l_index -1 :int false))
                (JR/aset* (JR/fget this :INTEGER_ARRAY) @l_index (long (unchecked-int (unchecked-negate (JR/c2i @l_index)))))))
            (JR/fset this :lastMin (JR/fget this :POSITIVE_MAX))
            (JR/fset this :MIN (JR/fget this :lastMin))
            (JR/fset this :lastNegativeMin (JR/fget this :NEGATIVE_MAX))))))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/invoke this :jm_initWithRange_2 23 0))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'SmallIntegerSingletonFactory)] (jinit_0 o) o))

    
(defn jm_getAt_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/aget* (JR/fget this :INTEGER_ARRAY) (unchecked-int (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX))))))

    
(defn jm_getAtNoThrow_1 [this p_index]
  (let [ l_index (volatile! p_index)](JR/method
        (if (> (unchecked-int (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX))) (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :INTEGER_ARRAY)) 1)))
            (do
            (JR/jreturn (JR/aget* (JR/fget this :INTEGER_ARRAY) (unchecked-int (unchecked-add (unchecked-int (unchecked-negate (JR/c2i 1))) (JR/fget this :NEGATIVE_MAX)))))))
        (JR/aget* (JR/fget this :INTEGER_ARRAY) (unchecked-int (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX)))))))

    
(defn jm_createInstance_1 [this p_index]
  (let [ l_index (volatile! p_index) l_integer (volatile! nil)]
        (vreset! l_integer (JR/invoke this :jm_getAt_1 @l_index))
        (if (nil? @l_integer)
            (do
            (vreset! l_integer (long @l_index))))
        @l_integer))

    
(defn jm_getString_1 [this p_index]
  (let [ l_index (volatile! p_index) l_i (volatile! nil)]
        (vreset! l_i (unchecked-int (unchecked-add @l_index (JR/fget this :NEGATIVE_MAX))))
        (if (nil? (JR/aget* (JR/fget this :STRING_ARRAY) @l_i))
            (do
            (JR/aset* (JR/fget this :STRING_ARRAY) @l_i (JR/to-string-of (JR/aget* (JR/fget this :INTEGER_ARRAY) @l_i)))))
        (JR/aget* (JR/fget this :STRING_ARRAY) @l_i)))



