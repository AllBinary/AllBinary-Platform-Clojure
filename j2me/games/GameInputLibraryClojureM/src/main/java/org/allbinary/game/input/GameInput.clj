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

(ns GameInput)

(JR/register 'GameInput nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :gameKeyEventList nil)
  (JR/fset this :removalGameKeyEventList nil)
  (JR/fset this :isRemoveDuplicateKeyPresses false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_gameKeyEventList p_removalGameKeyEventList]
  (let [ l_gameKeyEventList (volatile! p_gameKeyEventList) l_removalGameKeyEventList (volatile! p_removalGameKeyEventList)]
    nil (jinitfields this)
        (JR/fset this :gameKeyEventList @l_gameKeyEventList)
        (JR/fset this :removalGameKeyEventList @l_removalGameKeyEventList)
        (JR/fset this :isRemoveDuplicateKeyPresses (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget (JR/scall 'InputFeatureFactory :jm_getInstance_0) :REMOVE_DUPLICATE_KEY_PRESSES))))
  this)

(defn jnew_2 [p_gameKeyEventList p_removalGameKeyEventList ]
  (let [o (JR/alloc 'GameInput)] (jinit_2 o p_gameKeyEventList p_removalGameKeyEventList) o))

    
(defn jm_add_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)](JR/method
        (if (and (JR/fget this :isRemoveDuplicateKeyPresses) (JR/invoke (JR/fget this :gameKeyEventList) :jm_contains_1 @l_gameKeyEvent))
            (do
            (JR/jreturn)))
        (if (some? @l_gameKeyEvent)
            (do
            (JR/invoke (JR/fget this :gameKeyEventList) :jm_add_1 @l_gameKeyEvent))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "Danger Passed Null GameKeyEvent" this (JR/fget (JR/fget this :commonStrings) :ADD)))))))

    
(defn jm_addForRemoval_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke (JR/fget this :removalGameKeyEventList) :jm_add_1 @l_gameKeyEvent)))

    
(defn jm_isForRemoval_1 [this p_gameKeyEvent]
  (let [ l_gameKeyEvent (volatile! p_gameKeyEvent)]
        (JR/invoke (JR/fget this :removalGameKeyEventList) :jm_contains_1 @l_gameKeyEvent)))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameKeyEventList) :jm_clear_0)))

    
(defn jm_removeNonAIInputGameKeyEvents_0 [this]
  (let [ l_list (volatile! nil) l_gameKeyEvent (volatile! nil) l_index (volatile! nil)]
        (vreset! l_list (JR/fget this :gameKeyEventList))
        (vreset! l_gameKeyEvent nil)
        (do (vreset! l_index (JR/invoke @l_list :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_gameKeyEvent (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (if (not (== (JR/invoke @l_gameKeyEvent :jm_getSourceId_0) 1))
                (do
                (JR/invoke @l_list :jm_removeAt_1 @l_index)))))))

    
(defn jm_update_0 [this]
  (let [ l_removeList (volatile! nil) l_list (volatile! nil) l_size (volatile! nil) l_anyType (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)]
        (vreset! l_removeList (JR/fget this :removalGameKeyEventList))
        (vreset! l_list (JR/fget this :gameKeyEventList))
        (vreset! l_size (JR/invoke @l_removeList :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_anyType (JR/aget* (JR/fget @l_removeList :objectArray) @l_index))
            (do (vreset! l_index2 (JR/invoke @l_list :jm_size_0))
                (JR/jfor false false (>= (JR/vinc l_index2 -1 :int false) 0) (do )
                (if (JR/eq (JR/aget* (JR/fget @l_list :objectArray) @l_index2) @l_anyType)
                    (do
                    (JR/invoke @l_list :jm_removeAt_1 @l_index2)))))))
        (JR/invoke @l_removeList :jm_clear_0)))

    
(defn jm_getRemovalGameKeyEventList_0 [this]
  (let []
        (JR/fget this :removalGameKeyEventList)))

    
(defn jm_getGameKeyEventList_0 [this]
  (let []
        (JR/fget this :gameKeyEventList)))



