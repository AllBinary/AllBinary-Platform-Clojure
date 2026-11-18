;; Generated Code Do Not Modify
;; package org.allbinary.logic.math

(ns MathUtil)

(JR/register 'MathUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MathUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :ACCURACY 0)
    (JR/fset this :ACCURACY 100)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'MathUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MathUtil/jstatic_instance)))

    
(defn jm_getTotalDigits_1 [this p_digits]
  (let [ l_digits (volatile! p_digits) l_total (volatile! nil)]
        (vreset! l_total 0)
        (JR/jwhile false false (> @l_digits 0)
            (vreset! l_digits (JR/idiv @l_digits 10))
            (JR/vinc l_total 1 :int false))
        @l_total))

    
(defn jm_sqrt_1 [this p_value]
  (let [ l_value (volatile! p_value) l_accumulated (volatile! nil) l_result (volatile! nil)](JR/method
        (if (<= @l_value 1)
            (do
            (JR/jreturn @l_value)))
        (vreset! l_accumulated (JR/ishr @l_value 1))
        (vreset! l_result (JR/ishr (unchecked-int (unchecked-add @l_accumulated (JR/idiv @l_value @l_accumulated))) 1))
        (JR/jdo false false (> @l_accumulated @l_result)
            (vreset! l_accumulated @l_result)
            (vreset! l_result (JR/ishr (unchecked-int (unchecked-add @l_accumulated (JR/idiv @l_value @l_accumulated))) 1)))
        @l_accumulated)))

    
(defn jm_sqrtd_1 [this p_x]
  (let [ l_x (volatile! p_x) l_result (volatile! nil) l_index (volatile! nil)](JR/method
        (if (== @l_x 0)
            (do
            (JR/jreturn (double (JR/c2i 0.0)))))
        (if (< @l_x 0)
            (do
            (JR/jreturn (double (JR/c2i (- 1.0))))))
        (vreset! l_result (double (JR/c2i @l_x)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :ACCURACY)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_result (/ (double (+ @l_result (/ (double (double (JR/c2i @l_x))) @l_result))) 2.0))))
        @l_result)))

    
(defn jm_abs_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (if (< @l_value 0) (unchecked-int (unchecked-negate (JR/c2i @l_value))) @l_value)))

    
(defn jm_abslong_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (if (< @l_value 0) (unchecked-negate @l_value) @l_value)))

    
(defn jm_min_2 [this p_value p_value2]
  (let [ l_value (volatile! p_value) l_value2 (volatile! p_value2)]
        (if (<= @l_value @l_value2) @l_value @l_value2)))

    
(defn jm_max_2 [this p_value p_value2]
  (let [ l_value (volatile! p_value) l_value2 (volatile! p_value2)]
        (if (>= @l_value @l_value2) @l_value @l_value2)))



