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
;; package org.allbinary.input.motion.button

(ns TouchButtonsPaintableCompositeFactory)

(JR/register 'TouchButtonsPaintableCompositeFactory nil '[])

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
  (let [o (JR/alloc 'TouchButtonsPaintableCompositeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_2 [p_inputMappingInterface p_basicColor]
  (let [this nil l_inputMappingInterface (volatile! p_inputMappingInterface) l_basicColor (volatile! p_basicColor)]
        (ProcessPaintable/jnew_0)))



