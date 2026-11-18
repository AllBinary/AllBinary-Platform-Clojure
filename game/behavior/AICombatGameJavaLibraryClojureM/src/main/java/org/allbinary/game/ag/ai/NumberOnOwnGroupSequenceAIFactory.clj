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

(ns NumberOnOwnGroupSequenceAIFactory)

(JR/register 'NumberOnOwnGroupSequenceAIFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NumberOnOwnGroupSequenceAIFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_4 [this p_hashtable p_artificialIntelligenceInterface p_ownerLayerInterface p_gameInput]
  (let [ l_hashtable (volatile! p_hashtable) l_artificialIntelligenceInterface (volatile! p_artificialIntelligenceInterface) l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_integerArray (volatile! nil) l_list (volatile! nil) l_integerCanBeNull (volatile! nil) l_index (volatile! nil) l_stringBuffer (volatile! nil) l_commonStrings (volatile! nil) l_numberOnSameTeam (volatile! nil)]
        (vreset! l_integerArray (JR/fget (JR/scall 'NumberInSameGroupSequence :jm_getInstance_0) :NUMBER_ON_SAME_TEAM_SEQUENCE))
        (vreset! l_list (BasicArrayListD/jnew_0))
        (do (vreset! l_index 0)
            (JR/jfor true false (< @l_index (JR/alen @l_integerArray)) (do (JR/vinc l_index 1 :int false))
            (vreset! l_integerCanBeNull (JR/invoke @l_hashtable :jm_get_1 (JR/aget* @l_integerArray @l_index)))
            (if (nil? @l_integerCanBeNull)
                (do
                (JR/jbreak)))
            (JR/invoke @l_list :jm_add_1 @l_integerCanBeNull)))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Total AI Properties: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke @l_list :jm_size_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " == Total AI: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/alen @l_artificialIntelligenceInterface))
        (JR/invoke @l_stringBuffer :jm_append_1 " + 1")
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget @l_commonStrings :GET_INSTANCE))
        (if (> (unchecked-int (unchecked-subtract (JR/alen @l_artificialIntelligenceInterface) 1)) (JR/invoke @l_list :jm_size_0))
            (do
            (JR/jthrow (new java.lang.Exception "Not enough AI properties."))))
        (if (< (unchecked-int (unchecked-subtract (JR/alen @l_artificialIntelligenceInterface) 1)) (JR/invoke @l_list :jm_size_0))
            (do
            (JR/jthrow (new java.lang.Exception "Too Many AI properties."))))
        (vreset! l_numberOnSameTeam (JR/anew "Object" 1 (JR/invoke @l_list :jm_size_0)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_numberOnSameTeam)) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_numberOnSameTeam @l_index (JR/aget* (JR/fget @l_list :objectArray) @l_index))))
        (NumberOnOwnGroupSequenceAI/jnew_4 @l_numberOnSameTeam @l_artificialIntelligenceInterface @l_ownerLayerInterface @l_gameInput)))



