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
;; package org.allbinary.logic.java.byteutil

(ns ByteUtil)

(JR/register 'ByteUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ByteUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ByteUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ByteUtil)] (jinit_0 o) o))

    
(defn jm_xor_2 [this p_array p_mask]
  (let [ l_array (volatile! p_array) l_mask (volatile! p_mask) l_bytes (volatile! nil) l_size (volatile! nil) l_index (volatile! nil) l_currentByte (volatile! nil)]
        (vreset! l_bytes (JR/anew "BYTE" 1 (JR/alen @l_array)))
        (vreset! l_size (JR/alen @l_array))
        (vreset! l_index 0)
        (vreset! l_currentByte 0)
        (JR/jwhile false false (< @l_index @l_size)
            (vreset! l_currentByte (JR/aget* @l_array @l_index))
            (JR/aset* @l_bytes @l_index (JR/i8 (bit-xor @l_currentByte @l_mask)))
            (JR/vinc l_index 1 :int false))
        @l_bytes))

    
(defn jm_not_1 [this p_array]
  (let [ l_array (volatile! p_array) l_bytes (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_bytes (JR/anew "BYTE" 1 (JR/alen @l_array)))
        (vreset! l_size (JR/alen @l_array))
        (vreset! l_index 0)
        (JR/jwhile false false (< @l_index @l_size)
            (JR/aset* @l_bytes @l_index (JR/i8 (bit-not (JR/aget* @l_array @l_index))))
            (JR/vinc l_index 1 :int false))
        @l_bytes))

    
(defn jm_xorByte_2 [this p_array p_index]
  (let [ l_array (volatile! p_array) l_index (volatile! p_index) l_mask (volatile! nil)]
        (vreset! l_mask 0)
        (if (== @l_index 0)
            (do
            (vreset! l_mask 1)))
        (if (== @l_index 1)
            (do
            (vreset! l_mask 2)))
        (if (== @l_index 2)
            (do
            (vreset! l_mask 4)))
        (if (== @l_index 3)
            (do
            (vreset! l_mask 8)))
        (if (== @l_index 4)
            (do
            (vreset! l_mask 16)))
        (if (== @l_index 5)
            (do
            (vreset! l_mask 32)))
        (if (== @l_index 6)
            (do
            (vreset! l_mask 64)))
        (if (== @l_index 7)
            (do
            (vreset! l_mask (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 127)))))))
        (JR/invoke this :jm_xor_2 @l_array @l_mask)))

    
(defn jm_compare_2 [this p_newByteArray p_oldByteArray]
  (let [ l_newByteArray (volatile! p_newByteArray) l_oldByteArray (volatile! p_oldByteArray) l_size (volatile! nil) l_index (volatile! nil)](JR/method
        (if (not (== (JR/alen @l_newByteArray) (JR/alen @l_oldByteArray)))
            (do
            (JR/jreturn false))
            (do
            nil))
        (vreset! l_size (JR/alen @l_newByteArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (if (not (== (JR/aget* @l_newByteArray @l_index) (JR/aget* @l_oldByteArray @l_index)))
                (do
                (JR/jreturn false)))))
        true)))

    
(defn jm_compareWithStats_4 [this p_newByteArray p_newSize p_oldByteArray p_stats]
  (let [ l_newByteArray (volatile! p_newByteArray) l_newSize (volatile! p_newSize) l_oldByteArray (volatile! p_oldByteArray) l_stats (volatile! p_stats) l_size (volatile! nil) l_index (volatile! nil)](JR/method
        (if (not (== @l_newSize (JR/alen @l_oldByteArray)))
            (do
            (JR/aset* @l_stats 0 (unchecked-int (unchecked-negate (JR/c2i 1))))
            (JR/aset* @l_stats 2 @l_newSize)
            (JR/aset* @l_stats 3 (JR/alen @l_oldByteArray))
            (JR/jreturn false))
            (do
            (JR/aset* @l_stats 0 @l_newSize)))
        (JR/aset* @l_stats 1 0)
        (vreset! l_size @l_newSize)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (if (not (== (JR/aget* @l_newByteArray @l_index) (JR/aget* @l_oldByteArray @l_index)))
                (do
                (JR/jreturn false)))
            (JR/ainc @l_stats 1 1 :int false)))
        true)))



