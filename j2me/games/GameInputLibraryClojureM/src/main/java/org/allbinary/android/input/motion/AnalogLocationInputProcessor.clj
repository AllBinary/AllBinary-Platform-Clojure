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
;; package org.allbinary.android.input.motion

(ns AnalogLocationInputProcessor)

(JR/register 'AnalogLocationInputProcessor nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AnalogLocationInputProcessor)] (jinit_0 o) o))

    
(defn jm_process_2 [this p_allbinaryLayerManager p_analogLocationInput]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_analogLocationInput (volatile! p_analogLocationInput)]
        nil))



