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
;; package org.allbinary.game

(ns Intermission)

(JR/register 'Intermission nil '[IntermissionInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :enabled false)
  (JR/fset this :timeElapsedHelper nil)
  (JR/fset this :intermissionEnableListener nil)
    (JR/fset this :timeElapsedHelper (TimeDelayHelper/jnew_1 0))
    (JR/fset this :intermissionEnableListener (JR/scall 'NullIntermissionEnableListener :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'Intermission)] (jinit_0 o) o))

    
(defn jm_setListener_1 [this p_enableListener]
  (let [ l_enableListener (volatile! p_enableListener)]
        (JR/fset this :intermissionEnableListener @l_enableListener)))

    
(defn jm_getTimeDelayHelper_0 [this]
  (let []
        (JR/fget this :timeElapsedHelper)))

    
(defn jm_setEnabled_1 [this p_enabled]
  (let [ l_enabled (volatile! p_enabled)]
        (JR/fset this :enabled @l_enabled)
        (if (JR/invoke this :jm_isEnabled_0)
            (do
            (JR/invoke (JR/invoke this :jm_getTimeDelayHelper_0) :jm_setStartTimeTNT_0)))
        (JR/invoke (JR/fget this :intermissionEnableListener) :jm_notifyIntermission_1 @l_enabled)))

    
(defn jm_isEnabled_0 [this]
  (let []
        (JR/fget this :enabled)))



