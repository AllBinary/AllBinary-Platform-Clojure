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

(ns J2MEGameKey)

(JR/register 'J2MEGameKey 'Input '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_2 [this p_key p_keyName]
  (let [ l_key (volatile! p_key) l_keyName (volatile! p_keyName) l_id (volatile! nil) l_inputFactory (volatile! nil)]
        (Input/jinit_2 this @l_key @l_keyName) (jinitfields this)
        (vreset! l_id (JR/invoke this :jm_getId_0))
        (if (>= @l_id 0)
            (do
            (vreset! l_inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
            (JR/invoke @l_inputFactory :jm_add_2 @l_id this))))
  this)

(defn jnew_2 [p_key p_keyName ]
  (let [o (JR/alloc 'J2MEGameKey)] (jinit_2 o p_key p_keyName) o))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "J2MEGameKey: ") :jm_append_1 (JR/to-string-of this)))))

    
(defn jm_getString_1 [p_keyCode]
  (let [this nil l_keyCode (volatile! p_keyCode) l_input (volatile! nil)]
        (vreset! l_input (JR/invoke (JR/scall 'InputFactory :jm_getInstance_0) :jm_getInstanceById_1 @l_keyCode))
        (if (some? @l_input)
            (do
            (JR/invoke @l_input :jm_getName_0))
            (do
            (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))))



