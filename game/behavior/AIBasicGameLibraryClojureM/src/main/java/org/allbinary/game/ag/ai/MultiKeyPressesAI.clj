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

(ns MultiKeyPressesAI)

(JR/register 'MultiKeyPressesAI 'KeyPressesAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :toggleTimeHelper nil)
  (JR/fset this :gameTickTimeDelayHelper nil)
    (JR/fset this :toggleTimeHelper (TimeDelayHelper/jnew_1 600))
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
  this)

    
(defn jinit_3 [this p_hashtable p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput)]
        (KeyPressesAI/jinit_3 this @l_hashtable @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/invoke this :jm_update_0))
  this)

(defn jnew_3 [p_hashtable p_ownerLayerInterface p_gameInput ]
  (let [o (JR/alloc 'MultiKeyPressesAI)] (jinit_3 o p_hashtable p_ownerLayerInterface p_gameInput) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager)]
        nil))

    
(defn jm_update_0 [this]
  (let [ l_gameInput (volatile! nil) l_keys (volatile! nil) l_size (volatile! nil) l_key (volatile! nil) l_index (volatile! nil)]
        (vreset! l_gameInput (JR/invoke this :jm_getGameInput_0))
        (vreset! l_keys (JR/fget this :keys))
        (vreset! l_size (JR/alen @l_keys))
        (if (JR/invoke this :jm_isOn_0)
            (do
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_key (JR/invoke (JR/aget* @l_keys @l_index) :jm_intValue_0))
                (if (not (== @l_key (unchecked-int (unchecked-negate (JR/c2i 1)))))
                    (do
                    (JR/invoke @l_gameInput :jm_add_1 (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForKey_2 this @l_key)))))))
            (do
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_key (JR/invoke (JR/aget* @l_keys @l_index) :jm_intValue_0))
                (if (not (== @l_key (unchecked-int (unchecked-negate (JR/c2i 1)))))
                    (do
                    (JR/invoke @l_gameInput :jm_addForRemoval_1 (JR/invoke (JR/fget this :gameKeyEventFactory) :jm_getInstanceForKey_2 this @l_key))))))))))

    
(defn jm_toggle_0 [this]
  (let []
        (if (JR/invoke (JR/fget this :toggleTimeHelper) :jm_isTime_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime))
            (do
            (JR/invoke-super 'KeyPressesAI this :jm_toggle_0)
            (JR/invoke this :jm_update_0)))))

    
(defn jm_disable_0 [this]
  (let []
        (if (JR/invoke (JR/fget this :toggleTimeHelper) :jm_isTime_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime))
            (do
            (JR/invoke-super 'KeyPressesAI this :jm_disable_0)
            (JR/invoke this :jm_update_0)))))

    
(defn jm_enable_0 [this]
  (let []
        (if (JR/invoke (JR/fget this :toggleTimeHelper) :jm_isTime_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime))
            (do
            (JR/invoke-super 'KeyPressesAI this :jm_enable_0)
            (JR/invoke this :jm_update_0)))))



