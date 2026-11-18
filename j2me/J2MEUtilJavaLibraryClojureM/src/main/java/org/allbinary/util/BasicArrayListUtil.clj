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

(ns BasicArrayListUtil)

(JR/register 'BasicArrayListUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicArrayListUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NULL_ARRAY_OF_ARRAY nil)
  (JR/fset this :myRandomFactory nil)
  (JR/fset this :immutableInstance nil)
    (JR/fset this :NULL_ARRAY_OF_ARRAY (JR/anew "Object" 2 0 0))
    (JR/fset this :myRandomFactory (JR/scall 'MyRandomFactory :jm_getInstance_0))
    (JR/fset this :immutableInstance (ImmutableBasicArrayList/jnew_2 "Immutable" 0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicArrayListUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicArrayListUtil/jstatic_instance)))

    
(defn jm_getRandom_1 [this p_list]
  (let [ l_list (volatile! p_list) l_i_random (volatile! nil)]
        (vreset! l_i_random (JR/invoke this :jm_getRandomIndex_1 @l_list))
        (JR/aget* (JR/fget @l_list :objectArray) @l_i_random)))

    
(defn jm_getRandomIndex_1 [this p_list]
  (let [ l_list (volatile! p_list)]
        (JR/invoke (JR/fget this :myRandomFactory) :jm_getAbsoluteNextInt_1 (JR/invoke @l_list :jm_size_0))))

    
(defn jm_reverse_1 [this p_list]
  (let [ l_list (volatile! p_list) l_lastMinusOneIndex (volatile! nil) l_temp (volatile! nil) l_size (volatile! nil) l_secondSwapIndex (volatile! nil) l_index (volatile! nil)]
        (vreset! l_lastMinusOneIndex (unchecked-int (unchecked-subtract (JR/invoke @l_list :jm_size_0) 2)))
        (vreset! l_temp nil)
        (vreset! l_size (JR/idiv @l_lastMinusOneIndex 2))
        (vreset! l_secondSwapIndex 0)
        (do (vreset! l_index 0)
            (JR/jfor false false (<= @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_secondSwapIndex (unchecked-int (unchecked-subtract @l_lastMinusOneIndex @l_index)))
            (vreset! l_temp (JR/invoke @l_list :jm_removeAt_1 @l_index))
            (JR/invoke @l_list :jm_addAt_2 @l_index (JR/invoke @l_list :jm_removeAt_1 @l_secondSwapIndex))
            (JR/invoke @l_list :jm_addAt_2 (unchecked-int (unchecked-add @l_secondSwapIndex 1)) @l_temp)))))

    
(defn jm_log_1 [this p_list]
  (let [ l_list (volatile! p_list) l_S_LABEL (volatile! nil) l_size (volatile! nil) l_stringBuffer (volatile! nil) l_usedList (volatile! nil) l_index (volatile! nil)]
        (vreset! l_S_LABEL " s: ")
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :TOTAL_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 @l_size)
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_usedList (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_S_LABEL)
            (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke @l_usedList :jm_size_0))))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getImmutableInstance_0 [this]
  (let []
        (JR/fget this :immutableInstance)))

    
(defn jm_main_1 [p_args]
  (let [this nil l_args (volatile! p_args) l_commonPhoneStrings (volatile! nil) l_list (volatile! nil)]
        (vreset! l_commonPhoneStrings (JR/scall 'CommonPhoneStrings :jm_getInstance_0))
        (vreset! l_list (BasicArrayListD/jnew_0))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :ONE))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :TWO))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :THREE))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :FOUR))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :FIVE))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :SIX))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :SEVEN))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :EIGHT))
        (JR/invoke @l_list :jm_add_1 (JR/fget @l_commonPhoneStrings :NINE))
        (JR/invoke (BasicArrayListUtil/jm_getInstance_0) :jm_reverse_1 @l_list)
        (JR/println* (JR/to-string-of @l_list))))



