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

(ns AllAnalogControllerVisitor)

(JR/register 'AllAnalogControllerVisitor 'AnalogControllerVisitor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (AnalogControllerVisitor/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AllAnalogControllerVisitor)] (jinit_0 o) o))

    
(defn jm_process_2 [this p_allbinaryLayerManager p_analogLocationInputProcessor]
  (let [ l_allbinaryLayerManager (volatile! p_allbinaryLayerManager) l_analogLocationInputProcessor (volatile! p_analogLocationInputProcessor) l_analogLocationInputList (volatile! nil) l_analogLocationInput (volatile! nil) l_index (volatile! nil)]
        (vreset! l_analogLocationInputList (JR/invoke (JR/scall 'AnalogLocationInputFactory :jm_getInstance_0) :jm_getList_0))
        (vreset! l_analogLocationInput nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke @l_analogLocationInputList :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_analogLocationInput (JR/invoke @l_analogLocationInputList :jm_get_1 @l_index))
            (JR/invoke @l_analogLocationInputProcessor :jm_process_2 @l_allbinaryLayerManager @l_analogLocationInput)))))



