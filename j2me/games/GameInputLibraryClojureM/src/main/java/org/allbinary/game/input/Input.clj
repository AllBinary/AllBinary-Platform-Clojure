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

(ns Input)

(JR/register 'Input nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :id 0)
  (JR/fset this :name nil)
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_2 [this p_id p_name]
  (let [ l_id (volatile! p_id) l_name (volatile! p_name)]
    nil (jinitfields this)
        (JR/invoke this :jm_setId_1 @l_id)
        (JR/invoke this :jm_setName_1 @l_name))
  this)

(defn jnew_2 [p_id p_name ]
  (let [o (JR/alloc 'Input)] (jinit_2 o p_id p_name) o))

    
(defn jm_getId_0 [this]
  (let []
        (JR/fget this :id)))

    
(defn jm_setId_1 [this p_key]
  (let [ l_key (volatile! p_key)]
        (JR/fset this :id @l_key)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_setName_1 [this p_keyName]
  (let [ l_keyName (volatile! p_keyName)]
        (JR/fset this :name @l_keyName)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Name: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " Id: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke this :jm_getId_0))
        (JR/to-string-of @l_stringBuffer)))



