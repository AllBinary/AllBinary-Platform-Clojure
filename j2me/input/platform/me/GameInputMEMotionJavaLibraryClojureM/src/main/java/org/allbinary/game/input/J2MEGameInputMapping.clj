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

(ns J2MEGameInputMapping)

(JR/register 'J2MEGameInputMapping 'PersistentInputMapping '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (PersistentInputMapping/jinit_1 this (JR/fget (JR/scall 'GamePersistanceStrings :jm_getInstance_0) :SAVED_INPUT_CONFIGURATION_RECORD_ID)) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'J2MEGameInputMapping)] (jinit_0 o) o))

    
(defn jm_init_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :INIT))
        (JR/invoke (JR/scall 'J2MEKeyFactory :jm_getInstance_0) :jm_init_0)
        (JR/invoke-super 'PersistentInputMapping this :jm_init_1 @l_abeClientInformation)
        (if (or (== (JR/invoke this :jm_getTotalMapped_0) 0) (JR/invoke this :jm_isDefaultNew_0))
            (do
            (JR/invoke (JR/invoke this :jm_getInputMapping_0) :jm_addMapping_1 (JR/invoke this :jm_getDefault_0))
            (JR/invoke this :jm_save_1 @l_abeClientInformation)))))

    
(defn jm_isDelete_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (if (JR/eq @l_input (JR/fget (JR/scall 'GameKeyFactory :jm_getInstance_0) :GAME_D))
            (do
            true)
            (do
            false))))

    
(defn jm_isSystemInput_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        false))



