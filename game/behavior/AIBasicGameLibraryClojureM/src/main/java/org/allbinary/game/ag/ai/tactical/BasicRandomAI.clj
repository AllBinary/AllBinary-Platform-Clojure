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
;; package org.allbinary.game.ag.ai.tactical

(ns BasicRandomAI)

(JR/register 'BasicRandomAI 'BasicAI '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :i_random 0)
  (JR/fset this :inputProbability nil)
  (JR/fset this :visitor nil)
  (JR/fset this :keyArray nil)
  (JR/fset this :myRandomFactory nil)
    (JR/fset this :i_random 0)
    (JR/fset this :keyArray (JR/afrom "INT" 1 [(JR/sget 'Canvas "UP") (JR/sget 'Canvas "DOWN") (JR/sget 'Canvas "LEFT") (JR/sget 'Canvas "RIGHT") (JR/sget 'Canvas "KEY_NUM1") (JR/sget 'Canvas "KEY_NUM7") (JR/sget 'Canvas "KEY_NUM9")]))
    (JR/fset this :myRandomFactory (JR/scall 'MyRandomFactory :jm_getInstance_0))
  this)

    
(defn jinit_4 [this p_ownerLayerInterface p_gameInput p_inputProbability p_visitor]
  (let [ l_ownerLayerInterface (volatile! p_ownerLayerInterface) l_gameInput (volatile! p_gameInput) l_inputProbability (volatile! p_inputProbability) l_visitor (volatile! p_visitor)]
        (BasicAI/jinit_2 this @l_ownerLayerInterface @l_gameInput) (jinitfields this)
        (JR/fset this :inputProbability @l_inputProbability)
        (JR/fset this :visitor @l_visitor))
  this)

(defn jnew_4 [p_ownerLayerInterface p_gameInput p_inputProbability p_visitor ]
  (let [o (JR/alloc 'BasicRandomAI)] (jinit_4 o p_ownerLayerInterface p_gameInput p_inputProbability p_visitor) o))

    
(defn jm_processAI_1 [this p_allBinaryLayerManager]
  (let [ l_allBinaryLayerManager (volatile! p_allBinaryLayerManager) l_repeat (volatile! nil) l_repeatLikelyhoodIntegerArray (volatile! nil) l_likelyhoodIntegerArray (volatile! nil) l_size (volatile! nil) l_likelyhoodIntegerKeyArray (volatile! nil) l_key (volatile! nil) l_index (volatile! nil)]
        (if (JR/invoke (JR/invoke (JR/fget this :inputProbability) :jm_getTimeDelayHelper_0) :jm_isTime_1 (JR/fget (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0) :startTime))
            (do
            (JR/fset this :i_random (JR/invoke (JR/fget this :myRandomFactory) :jm_getAbsoluteNextInt_1 (JR/invoke (JR/fget this :inputProbability) :jm_getMax_0)))
            (vreset! l_repeat false)
            (vreset! l_repeatLikelyhoodIntegerArray (JR/invoke (JR/fget this :inputProbability) :jm_getRepeatLikelyhoodIntegerArray_0))
            (if (and (not (== (JR/invoke this :jm_getLastKey_0) (unchecked-int (unchecked-negate (JR/c2i 1))))) (>= (JR/invoke (JR/aget* @l_repeatLikelyhoodIntegerArray (JR/invoke this :jm_getLastKey_0)) :jm_intValue_0) (JR/fget this :i_random)))
                (do
                (vreset! l_repeat true)))
            (if (not @l_repeat)
                (do
                (vreset! l_likelyhoodIntegerArray (JR/invoke (JR/fget this :inputProbability) :jm_getLikelyhoodIntegerArray_0))
                (JR/fset this :i_random (JR/invoke (JR/fget this :myRandomFactory) :jm_getAbsoluteNextInt_1 (JR/invoke (JR/fget this :inputProbability) :jm_getMax_0)))
                (vreset! l_size (JR/alen (JR/fget this :keyArray)))
                (vreset! l_likelyhoodIntegerKeyArray nil)
                (do (vreset! l_index 0)
                    (JR/jfor true false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                    (vreset! l_key (JR/aget* (JR/fget this :keyArray) @l_index))
                    (vreset! l_likelyhoodIntegerKeyArray (JR/aget* @l_likelyhoodIntegerArray @l_key))
                    (if (and (>= (JR/alen @l_likelyhoodIntegerArray) @l_key) (some? (JR/aget* @l_likelyhoodIntegerKeyArray 0)))
                        (do
                        (if (and (>= (JR/fget this :i_random) (JR/invoke (JR/aget* @l_likelyhoodIntegerKeyArray 0) :jm_intValue_0)) (< (JR/fget this :i_random) (JR/invoke (JR/aget* @l_likelyhoodIntegerKeyArray 1) :jm_intValue_0)))
                            (do
                            (JR/invoke this :jm_setLastKey_1 @l_key)
                            (JR/jbreak)))))))))
            (JR/invoke (JR/fget this :visitor) :jm_visit_1 this)))))



