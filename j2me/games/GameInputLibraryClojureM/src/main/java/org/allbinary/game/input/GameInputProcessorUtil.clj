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

(ns GameInputProcessorUtil)

(JR/register 'GameInputProcessorUtil nil '[])

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
  (let [o (JR/alloc 'GameInputProcessorUtil)] (jinit_0 o) o))

    
(defn jm_init_1 [p_inputProcessorArray]
  (let [this nil l_inputProcessorArray (volatile! p_inputProcessorArray) l_noInputProcessor (volatile! nil) l_total (volatile! nil) l_inputProcessorCanBeNull (volatile! nil) l_index (volatile! nil)]
        (vreset! l_noInputProcessor (JR/scall 'GameInputProcessor :jm_getInstance_0))
        (vreset! l_total (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_total) (do (JR/vinc l_index 1 :int false))
            (vreset! l_inputProcessorCanBeNull (JR/aget* @l_inputProcessorArray @l_index))
            (if (nil? @l_inputProcessorCanBeNull)
                (do
                (JR/aset* @l_inputProcessorArray @l_index @l_noInputProcessor)))))))



