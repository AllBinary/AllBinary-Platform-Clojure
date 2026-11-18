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
;; package org.allbinary.game.rand

;;Do not use in client code for money related things.
(ns MyRandomFactory)

(JR/register 'MyRandomFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MyRandomFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :mathUtil nil)
  (JR/fset this :rand nil)
    (JR/fset this :mathUtil (JR/scall 'MathUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MyRandomFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/fset this :rand (new java.util.Random (java.lang.System/currentTimeMillis))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MyRandomFactory)] (jinit_0 o) o))

    
(defn jm_setSeed_1 [this p_seed]
  (let [ l_seed (volatile! p_seed)]
        (JR/fset this :rand (new java.util.Random @l_seed))))

    
(defn jm_getNextInt_1 [this p_range]
  (let [ l_range (volatile! p_range) l_div (volatile! nil)]
        (vreset! l_div (unchecked-int (unchecked-add (JR/idiv java.lang.Integer/MAX_VALUE @l_range) 1)))
        (JR/idiv (JR/invoke (JR/fget this :rand) :jm_nextInt_0) @l_div)))

    
(defn jm_getAbsoluteNextInt_1 [this p_range]
  (let [ l_range (volatile! p_range)]
        (JR/invoke (JR/fget this :mathUtil) :jm_abs_1 (JR/invoke this :jm_getNextInt_1 @l_range))))

    
(defn jm_getAbsoluteNextIntAllowZero_1 [this p_range]
  (let [ l_range (volatile! p_range)]
        (if (== @l_range 0)
            (do
            0)
            (do
            (JR/invoke (JR/fget this :mathUtil) :jm_abs_1 (JR/invoke this :jm_getNextInt_1 @l_range))))))

    
(defn jm_shuffle_1 [this p_intArray]
  (let [ l_intArray (volatile! p_intArray)]
        (JR/invoke this :jm_shuffleTotal_2 @l_intArray (unchecked-int (unchecked-multiply (JR/alen @l_intArray) 7)))))

    
(defn jm_shuffleTotal_2 [this p_intArray p_shuffleTotal]
  (let [ l_intArray (volatile! p_intArray) l_shuffleTotal (volatile! p_shuffleTotal) l_size (volatile! nil) l_randomIndex (volatile! nil) l_randomIndex2 (volatile! nil) l_value (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/alen @l_intArray))
        (vreset! l_randomIndex 0)
        (vreset! l_randomIndex2 0)
        (vreset! l_value 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_shuffleTotal) (do (JR/vinc l_index 1 :int false))
            (vreset! l_randomIndex (JR/invoke this :jm_getAbsoluteNextIntAllowZero_1 @l_size))
            (vreset! l_randomIndex2 (JR/invoke this :jm_getAbsoluteNextIntAllowZero_1 @l_size))
            (vreset! l_value (JR/aget* @l_intArray @l_randomIndex))
            (JR/aset* @l_intArray @l_randomIndex (JR/aget* @l_intArray @l_randomIndex2))
            (JR/aset* @l_intArray @l_randomIndex2 @l_value)))))

    
(defn jm_shuffle2_2 [this p_intArray p_intArray2]
  (let [ l_intArray (volatile! p_intArray) l_intArray2 (volatile! p_intArray2)]
        (JR/invoke this :jm_shuffle2Total_3 @l_intArray @l_intArray2 (unchecked-int (unchecked-multiply (JR/alen @l_intArray) 7)))))

    
(defn jm_shuffle2Total_3 [this p_intArray p_intArray2 p_shuffleTotal]
  (let [ l_intArray (volatile! p_intArray) l_intArray2 (volatile! p_intArray2) l_shuffleTotal (volatile! p_shuffleTotal) l_size (volatile! nil) l_randomIndex (volatile! nil) l_randomIndex2 (volatile! nil) l_value (volatile! nil) l_value2 (volatile! nil) l_index (volatile! nil)]
        (vreset! l_size (JR/alen @l_intArray))
        (vreset! l_randomIndex 0)
        (vreset! l_randomIndex2 0)
        (vreset! l_value 0)
        (vreset! l_value2 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_shuffleTotal) (do (JR/vinc l_index 1 :int false))
            (vreset! l_randomIndex (JR/invoke this :jm_getAbsoluteNextIntAllowZero_1 @l_size))
            (vreset! l_randomIndex2 (JR/invoke this :jm_getAbsoluteNextIntAllowZero_1 @l_size))
            (vreset! l_value (JR/aget* @l_intArray @l_randomIndex))
            (vreset! l_value2 (JR/aget* @l_intArray2 @l_randomIndex))
            (JR/aset* @l_intArray @l_randomIndex (JR/aget* @l_intArray @l_randomIndex2))
            (JR/aset* @l_intArray @l_randomIndex2 @l_value)
            (JR/aset* @l_intArray2 @l_randomIndex (JR/aget* @l_intArray2 @l_randomIndex2))
            (JR/aset* @l_intArray2 @l_randomIndex2 @l_value2)))))

    
(defn jm_main_1 [p_args]
  (let [this nil l_args (volatile! p_args) l_randomFactory (volatile! nil) l_stringBuilder (volatile! nil) l_commonSeps (volatile! nil) l_size2 (volatile! nil) l_index (volatile! nil) l_intArray (volatile! nil) l_intArray2 (volatile! nil) l_size (volatile! nil) l_found (volatile! nil) l_index2 (volatile! nil)]
        (vreset! l_randomFactory (MyRandomFactory/jm_getInstance_0))
        (vreset! l_stringBuilder (StringMaker/jnew_0))
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (vreset! l_size2 100)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size2) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/invoke @l_stringBuilder :jm_appendint_1 (JR/invoke @l_randomFactory :jm_getAbsoluteNextInt_1 3)) :jm_append_1 (JR/fget @l_commonSeps :COMMA))))
        (JR/println* (JR/to-string-of @l_stringBuilder))
        (JR/invoke @l_stringBuilder :jm_delete_2 0 (JR/invoke @l_stringBuilder :jm_length_0))
        (vreset! l_intArray (JR/anew "INT" 1 52))
        (vreset! l_intArray2 (JR/anew "INT" 1 52))
        (vreset! l_size (JR/alen @l_intArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_intArray @l_index @l_index)
            (JR/aset* @l_intArray2 @l_index @l_index)))
        (JR/invoke @l_randomFactory :jm_shuffle2_2 @l_intArray @l_intArray2)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/invoke @l_stringBuilder :jm_appendint_1 (JR/aget* @l_intArray @l_index)) :jm_append_1 (JR/fget @l_commonSeps :COMMA))))
        (JR/println* (JR/to-string-of @l_stringBuilder))
        (JR/invoke @l_stringBuilder :jm_delete_2 0 (JR/invoke @l_stringBuilder :jm_length_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/invoke @l_stringBuilder :jm_appendint_1 (JR/aget* @l_intArray2 @l_index)) :jm_append_1 (JR/fget @l_commonSeps :COMMA))))
        (JR/println* (JR/to-string-of @l_stringBuilder))
        (vreset! l_found false)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_found false)
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 @l_size) (do (JR/vinc l_index2 1 :int false))
                (if (== (JR/aget* @l_intArray @l_index2) @l_index)
                    (do
                    (vreset! l_found true)))))
            (if (not @l_found)
                (do
                (JR/jthrow (new java.lang.RuntimeException))))))))



