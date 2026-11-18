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

(ns SingleAnalogControllerVisitor)

(JR/register 'SingleAnalogControllerVisitor 'AnalogControllerVisitor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :playerInputId 0)
  this)

    
(defn jinit_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId)]
    (AnalogControllerVisitor/jinit_0 this) (jinitfields this)
        (JR/fset this :playerInputId @l_playerInputId))
  this)

(defn jnew_1 [p_playerInputId ]
  (let [o (JR/alloc 'SingleAnalogControllerVisitor)] (jinit_1 o p_playerInputId) o))

    
(defn jm_process_2 [this p_allbinaryLayerManager p_analogLocationInputProcessor]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_analogLocationInputProcessor (volatile! p_analogLocationInputProcessor) l_analogLocationInput (volatile! nil)]
        (vreset! l_analogLocationInput (JR/invoke (JR/scall 'AnalogLocationInputFactory :jm_getInstance_0) :jm_getInstanceForPlayer_1 (JR/fget this :playerInputId)))
        (JR/invoke @l_analogLocationInputProcessor :jm_process_2 @l_allbinaryLayerManager @l_analogLocationInput)))



