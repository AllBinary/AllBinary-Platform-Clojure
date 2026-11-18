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
;; package org.allbinary.game.ag.ai

(ns KeyPressesAI)

(JR/register 'KeyPressesAI 'BasicAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :on false)
  (JR/fset this :keys nil)
    (JR/fset this :on true)
  this)

    
(defn jinit_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_objectArray (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :keys (JR/anew "Object" 1 (JR/invoke @l_hashtable :jm_size_0)))
        (vreset! l_objectArray (JR/invoke (JR/scall 'HashtableUtil :jm_getInstance_0) :jm_getKeysAsArray_1 @l_hashtable))
        (vreset! l_size (JR/alen @l_objectArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :keys) @l_index (JR/invoke @l_hashtable :jm_get_1 (JR/aget* @l_objectArray @l_index))))))
  this)

(defn jnew_3 [p_hashtable p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'KeyPressesAI)] (jinit_3 o p_hashtable p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_index (volatile! nil)]
        (if (JR/fget this :on)
            (do
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index (JR/alen (JR/fget this :keys))) (do (JR/vinc l_index 1 :int false))
                (JR/invoke-super 'BasicAI this :jm_processKeyAI_1 (JR/invoke (JR/aget* (JR/fget this :keys) @l_index) :jm_intValue_0))))))))

    
(defn jm_toggle_0 [this]
  (let []
        (if (JR/invoke this :jm_isOn_0)
            (do
            (JR/invoke this :jm_setOn_1 false))
            (do
            (JR/invoke this :jm_setOn_1 true)))))

    
(defn jm_disable_0 [this]
  (let []
        (JR/invoke this :jm_setOn_1 false)))

    
(defn jm_enable_0 [this]
  (let []
        (JR/invoke this :jm_setOn_1 true)))

    
(defn jm_setOn_1 [this p_on]
  (let [ l_on (volatile! p_on)]
        (JR/fset this :on @l_on)))

    
(defn jm_isOn_0 [this]
  (let []
        (JR/fget this :on)))



