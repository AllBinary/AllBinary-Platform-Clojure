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
;; package org.allbinary.game.input

(ns PCGameKey)

(JR/register 'PCGameKey 'Input '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_keyCode p_name]
  (let [ l_keyCode (volatile! p_keyCode) l_name (volatile! p_name) l_id (volatile! nil)]
        (Input/jinit_2 this @l_keyCode @l_name) (jinitfields this)
        (vreset! l_id (JR/invoke this :jm_getId_0))
        (if (>= @l_id 0)
            (do
            (JR/invoke (JR/scall 'InputFactory :jm_getInstance_0) :jm_add_2 @l_id this))))
  this)

(defn jnew_2 [p_keyCode p_name ]
  (let [o (JR/alloc 'PCGameKey)] (jinit_2 o p_keyCode p_name) o))

    
(defn jm_toString_0 [this]
  (let []
        (str (JR/s "PCGameKey: ") (JR/s (JR/to-string-of this)))))

    
(defn jm_getString_1 [p_keyCode]
  (let [this nil l_keyCode (volatile! p_keyCode) l_input (volatile! nil)]
        (vreset! l_input (JR/invoke (JR/scall 'InputFactory :jm_getInstance_0) :jm_getInstanceById_1 @l_keyCode))
        (if (some? @l_input)
            (do
            (JR/invoke @l_input :jm_getName_0))
            (do
            (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))))



