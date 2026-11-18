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
;; package org.allbinary.data

(ns CamelCaseUtil)

(JR/register 'CamelCaseUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CamelCaseUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :commonSeps nil)
    (JR/fset this :commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CamelCaseUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CamelCaseUtil/jstatic_instance)))

    
(defn jm_getAsCamelCase_2 [this p_string p_stringBuilder]
  (let [ l_string (volatile! p_string) l_stringBuilder (volatile! p_stringBuilder) l_stringValidationUtil (volatile! nil) l_list (volatile! nil) l_tokenizer (volatile! nil) l_size (volatile! nil) l_word (volatile! nil) l_i (volatile! nil)]
        (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
        (JR/invoke @l_stringBuilder :jm_delete_2 0 (JR/invoke @l_stringBuilder :jm_length_0))
        (vreset! l_list (BasicArrayListD/jnew_0))
        (vreset! l_tokenizer (Tokenizer/jnew_1 (JR/fget (JR/fget this :commonSeps) :UNDERSCORE)))
        (JR/invoke @l_tokenizer :jm_getTokensFromString_2 @l_string @l_list)
        (vreset! l_size (JR/invoke @l_list :jm_size_0))
        (vreset! l_word nil)
        (do (vreset! l_i 0)
            (JR/jfor false false (< @l_i @l_size) (do (JR/vinc l_i 1 :int false))
            (vreset! l_word (JR/invoke @l_list :jm_get_1 @l_i))
            (vreset! l_word (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 @l_word) @l_word (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_appendchar_1 (java.lang.Character/toUpperCase (JR/char-at @l_word 0))) :jm_append_1 (JR/invoke (JR/invoke @l_word :jm_substring_1 1) :jm_toLowerCase_0)))))
            (JR/invoke @l_stringBuilder :jm_append_1 @l_word)))
        (JR/to-string-of @l_stringBuilder)))



