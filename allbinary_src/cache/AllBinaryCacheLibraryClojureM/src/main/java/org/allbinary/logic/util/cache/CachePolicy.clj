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
;; package org.allbinary.logic.util.cache

(ns CachePolicy)

(JR/register 'CachePolicy nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :maxTime 0)
  (JR/fset this :maxSize 0)
  this)

    
(defn jinit_3 [this p_name p_maxTime p_maxSize]
  (let [ l_name (volatile! p_name) l_maxTime (volatile! p_maxTime) l_maxSize (volatile! p_maxSize)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (JR/invoke this :jm_setMaxTime_1 @l_maxTime)
        (JR/invoke this :jm_setMaxSize_1 @l_maxSize))
  this)

(defn jnew_3 [p_name p_maxTime p_maxSize ]
  (let [o (JR/alloc 'CachePolicy)] (jinit_3 o p_name p_maxTime p_maxSize) o))

    
(defn jm_getMaxTime_0 [this]
  (let []
        (JR/fget this :maxTime)))

    
(defn jm_setMaxTime_1 [this p_maxTime]
  (let [ l_maxTime (volatile! p_maxTime)]
        (JR/fset this :maxTime @l_maxTime)))

    
(defn jm_getMaxSize_0 [this]
  (let []
        (JR/fget this :maxSize)))

    
(defn jm_setMaxSize_1 [this p_maxSize]
  (let [ l_maxSize (volatile! p_maxSize)]
        (JR/fset this :maxSize @l_maxSize)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))



