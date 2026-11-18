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
;; package org.allbinary.game.resource

(ns ResourceLoadingLevel)

(JR/register 'ResourceLoadingLevel nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :level 0)
  this)

    
(defn jinit_2 [this p_name p_level]
  (let [ l_name (volatile! p_name) l_level (volatile! p_level)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (JR/fset this :level @l_level))
  this)

(defn jnew_2 [p_name p_level ]
  (let [o (JR/alloc 'ResourceLoadingLevel)] (jinit_2 o p_name p_level) o))

    
(defn jm_getLevel_0 [this]
  (let []
        (JR/fget this :level)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))



