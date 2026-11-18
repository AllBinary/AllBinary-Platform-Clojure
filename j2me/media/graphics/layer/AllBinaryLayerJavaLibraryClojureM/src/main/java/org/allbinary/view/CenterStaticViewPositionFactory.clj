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
;; package org.allbinary.view

(ns CenterStaticViewPositionFactory)

(JR/register 'CenterStaticViewPositionFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CenterStaticViewPositionFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_1 [this p_z]
  (let [ l_z (volatile! p_z) l_displayInfoSingleton (volatile! nil)]
        (vreset! l_displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (StaticViewPosition/jnew_3 (JR/ishr (JR/invoke @l_displayInfoSingleton :jm_getLastWidth_0) 1) (JR/ishr (JR/invoke @l_displayInfoSingleton :jm_getLastHeight_0) 1) @l_z)))



