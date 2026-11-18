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
;; package org.allbinary.media.audio

(ns CompositeSound)

(JR/register 'CompositeSound 'Sound '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_1 [this p_resource]
  (let [ l_resource (volatile! p_resource)]
        (Sound/jinit_1 this @l_resource) (jinitfields this))
  this)

(defn jnew_1 [p_resource ]
  (let [o (JR/alloc 'CompositeSound)] (jinit_1 o p_resource) o))

    
(defn jm_init_0 [this]
  (let []
        (JR/invoke this :jm_setPlayerP_1 (PlayerComposite/jnew_2 (JR/scall 'AllBinaryMediaManager :jm_createPlayer_1 (JR/invoke this :jm_getResource_0)) 570))))



