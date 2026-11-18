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
;; package org.allbinary.logic.communication.log.config.type

(ns LogConfigType)

(JR/register 'LogConfigType nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :description nil)
  this)

    
(defn jinit_2 [this p_name p_description]
  (let [ l_name (volatile! p_name) l_description (volatile! p_description)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (JR/fset this :description @l_description))
  this)

(defn jnew_2 [p_name p_description ]
  (let [o (JR/alloc 'LogConfigType)] (jinit_2 o p_name p_description) o))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_getDescription_0 [this]
  (let []
        (JR/fget this :description)))

    
(defn jm_setName_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :name @l_value)))

    
(defn jm_setDescription_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :description @l_value)))



