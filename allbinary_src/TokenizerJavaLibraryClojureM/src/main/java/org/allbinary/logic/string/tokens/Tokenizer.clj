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
;; package org.allbinary.logic.string.tokens

(ns Tokenizer)

(JR/register 'Tokenizer nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :sep nil)
  (JR/fset this :endSep nil)
    (JR/fset this :endSep (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_1 [this p_sep]
  (let [ l_sep (volatile! p_sep)]
    nil (jinitfields this)
        (if (== (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_compareTo_2 @l_sep (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)) 0)
            (do
            (JR/jthrow (new java.lang.Exception "Sep provided is not valid"))))
        (JR/fset this :sep @l_sep))
  this)

(defn jnew_1 [p_sep ]
  (let [o (JR/alloc 'Tokenizer)] (jinit_1 o p_sep) o))

    
(defn jm_setSep_1 [this p_sep]
  (let [ l_sep (volatile! p_sep)]
        (JR/fset this :sep @l_sep)))

    
(defn jm_setEndSep_1 [this p_endSep]
  (let [ l_endSep (volatile! p_endSep)]
        (JR/fset this :endSep @l_endSep)))

    
(defn jm_getInsideSep_1 [this p_string]
  (let [ l_string (volatile! p_string) l_tokenList (volatile! nil) l_index (volatile! nil) l_size (volatile! nil) l_end (volatile! nil)]
        (vreset! l_tokenList (BasicArrayListD/jnew_0))
        (vreset! l_index 0)
        (vreset! l_size (JR/slength @l_string))
        (JR/jwhile true false (< @l_index @l_size)
            (vreset! l_index (JR/invoke @l_string :jm_indexOf_2 (JR/fget this :sep) @l_index))
            (if (not (== @l_index (unchecked-int (unchecked-negate (JR/c2i 1)))))
                (do
                (vreset! l_end (JR/invoke @l_string :jm_indexOf_2 (JR/fget this :endSep) (unchecked-int (unchecked-add @l_index (JR/slength (JR/fget this :sep))))))
                (if (not (== @l_end (unchecked-int (unchecked-negate (JR/c2i 1)))))
                    (do
                    (JR/invoke @l_tokenList :jm_add_1 (JR/invoke @l_string :jm_substring_2 (unchecked-int (unchecked-add @l_index (JR/slength (JR/fget this :sep)))) (unchecked-int (unchecked-subtract @l_end (unchecked-int (unchecked-subtract (JR/slength (JR/fget this :endSep)) 1))))))
                    (vreset! l_index (unchecked-int (unchecked-add @l_end (JR/slength (JR/fget this :endSep))))))
                    (do
                    nil)))
                (do
                (JR/jbreak))))
        @l_tokenList))

    
(defn jm_getTokensFromString_2 [this p_string p_tokenVector]
  (let [ l_string (volatile! p_string) l_tokenVector (volatile! p_tokenVector) l_index (volatile! nil) l_end (volatile! nil)]
        (vreset! l_index 0)
        (vreset! l_end 0)
        (JR/jwhile true false (< @l_index (JR/slength @l_string))
            (vreset! l_end (JR/invoke @l_string :jm_indexOf_2 (JR/fget this :sep) @l_index))
            (if (not (== @l_end (unchecked-int (unchecked-negate (JR/c2i 1)))))
                (do
                (JR/invoke @l_tokenVector :jm_add_1 (JR/invoke @l_string :jm_substring_2 @l_index @l_end))
                (vreset! l_index (unchecked-int (unchecked-add @l_end (JR/slength (JR/fget this :sep))))))
                (do
                (JR/invoke @l_tokenVector :jm_add_1 (JR/invoke @l_string :jm_substring_2 @l_index (JR/slength @l_string)))
                (JR/jbreak))))
        @l_tokenVector))

    
(defn jm_getTokens_1 [this p_stringVector]
  (let [ l_stringVector (volatile! p_stringVector) l_tokenHashtable (volatile! nil) l_string (volatile! nil) l_end (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_tokenHashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
        (vreset! l_string (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
        (vreset! l_end 0)
        (vreset! l_size (JR/invoke @l_stringVector :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_string (JR/aget* (JR/fget @l_stringVector :objectArray) @l_index))
            (vreset! l_end (JR/invoke @l_string :jm_indexOf_1 (JR/fget this :sep)))
            (if (>= @l_end 0)
                (do
                (JR/invoke @l_tokenHashtable :jm_put_2 (JR/invoke @l_string :jm_substring_2 0 @l_end) (JR/invoke @l_string :jm_substring_2 (unchecked-int (unchecked-add @l_end 1)) (JR/slength @l_string)))))))
        @l_tokenHashtable))



