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
;; package org.allbinary.logic.math.permutations

(ns OrderedIntArrayPermutationUtil)

(JR/register 'OrderedIntArrayPermutationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OrderedIntArrayPermutationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :TOTAL_ITERATIONS_TABLE nil)
  (JR/fset this :FINISHED nil)
    (JR/fset this :TOTAL_ITERATIONS_TABLE "Total Iterations: ")
    (JR/fset this :FINISHED "\nFINISHED")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OrderedIntArrayPermutationUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OrderedIntArrayPermutationUtil)] (jinit_0 o) o))

    
(defn jm_getNext_1 [this p_data]
  (let [ l_data (volatile! p_data) l_length (volatile! nil) l_i (volatile! nil) l_j (volatile! nil)]
        (vreset! l_length (JR/alen @l_data))
        (vreset! l_i (unchecked-int (unchecked-subtract @l_length 1)))
        (JR/jwhile false false (>= (JR/aget* @l_data (unchecked-int (unchecked-subtract @l_i 1))) (JR/aget* @l_data @l_i))
            (vreset! l_i (unchecked-int (unchecked-subtract @l_i 1))))
        (vreset! l_j @l_length)
        (JR/jwhile false false (<= (JR/aget* @l_data (unchecked-int (unchecked-subtract @l_j 1))) (JR/aget* @l_data (unchecked-int (unchecked-subtract @l_i 1))))
            (vreset! l_j (unchecked-int (unchecked-subtract @l_j 1))))
        (JR/invoke this :jm_swap_3 @l_data (unchecked-int (unchecked-subtract @l_i 1)) (unchecked-int (unchecked-subtract @l_j 1)))
        (JR/vinc l_i 1 :int false)
        (vreset! l_j @l_length)
        (JR/jwhile false false (< @l_i @l_j)
            (JR/invoke this :jm_swap_3 @l_data (unchecked-int (unchecked-subtract @l_i 1)) (unchecked-int (unchecked-subtract @l_j 1)))
            (JR/vinc l_i 1 :int false)
            (JR/vinc l_j -1 :int false))))

    
(defn jm_swap_3 [this p_data p_a p_b]
  (let [ l_data (volatile! p_data) l_a (volatile! p_a) l_b (volatile! p_b) l_temp (volatile! nil)]
        (vreset! l_temp (JR/aget* @l_data @l_a))
        (JR/aset* @l_data @l_a (JR/aget* @l_data @l_b))
        (JR/aset* @l_data @l_b @l_temp)))

    
(defn jm_factorial_1 [this p_dataLength]
  (let [ l_dataLength (volatile! p_dataLength) l_temp (volatile! nil) l_i (volatile! nil)]
        (vreset! l_temp 1)
        (if (> @l_dataLength 1)
            (do
            (do (vreset! l_i 1)
                (JR/jfor false false (<= @l_i @l_dataLength) (do (JR/vinc l_i 1 :int false))
                (vreset! l_temp (unchecked-multiply @l_temp @l_i))))))
        @l_temp))

    
(defn jm_generate_2 [this p_data p_visitor]
  (let [ l_data (volatile! p_data) l_visitor (volatile! p_visitor) l_iterations (volatile! nil) l_count (volatile! nil)]
        (vreset! l_iterations (JR/invoke this :jm_factorial_1 (JR/alen @l_data)))
        (JR/print* (JR/fget this :TOTAL_ITERATIONS_TABLE))
        (JR/println* @l_iterations)
        (do (vreset! l_count 0)
            (JR/jfor false false (< @l_count (unchecked-subtract @l_iterations 1)) (do (JR/vinc l_count 1 :long false))
            (JR/invoke this :jm_getNext_1 @l_data)
            (JR/invoke @l_visitor :jm_visit_1 this)))
        (JR/println* (JR/fget this :FINISHED))))

    
(defn jm_main_1 [p_args]
  (let [this nil l_args (volatile! p_args) l_TOTAL (volatile! nil) l_data (volatile! nil) l_i (volatile! nil) l_permutationVisitor (volatile! nil) l_ORIGINAL_DATA_LABEL (volatile! nil)]
        (vreset! l_TOTAL 3)
        (vreset! l_data (JR/anew "INT" 1 @l_TOTAL))
        (do (vreset! l_i 0)
            (JR/jfor false false (< @l_i @l_TOTAL) (do (JR/vinc l_i 1 :int false))
            (JR/aset* @l_data @l_i @l_i)))
        (vreset! l_permutationVisitor (IntPermutationVisitor/jnew_1 @l_data))
        (vreset! l_ORIGINAL_DATA_LABEL "Original Data: ")
        (JR/print* @l_ORIGINAL_DATA_LABEL)
        (JR/invoke @l_permutationVisitor :jm_print_2 @l_data (StringMaker/jnew_0))
        (JR/invoke (OrderedIntArrayPermutationUtil/jm_getInstance_0) :jm_generate_2 @l_data @l_permutationVisitor)))



