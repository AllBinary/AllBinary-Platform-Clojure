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

(ns BasicProbabilityAIDataFactory)

(JR/register 'BasicProbabilityAIDataFactory nil '[])

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
  (let [o (JR/alloc 'BasicProbabilityAIDataFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 [this]
  (let [ l_likelyhoodIntegerArray (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil) l_repeatLikelyhoodIntegerArray (volatile! nil) l_inputProbability (volatile! nil)]
        (vreset! l_likelyhoodIntegerArray (JR/anew "Object" 2 (+ (JR/sget 'Canvas "KEY_NUM9") 1) 2))
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "UP")) 0 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "UP")) 1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "DOWN")) 0 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "DOWN")) 1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 14))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "LEFT")) 0 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 14))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "LEFT")) 1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 18))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "RIGHT")) 0 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 18))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "RIGHT")) 1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 22))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM7")) 0 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 22))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM7")) 1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 26))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM9")) 0 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 26))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM9")) 1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 30))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM1")) 0 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 30))
        (JR/aset* (JR/aget* @l_likelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM1")) 1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 40))
        (vreset! l_repeatLikelyhoodIntegerArray (JR/anew "Object" 1 (+ (JR/sget 'Canvas "KEY_NUM9") 1)))
        (JR/aset* @l_repeatLikelyhoodIntegerArray (JR/sget 'Canvas "UP") (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0))
        (JR/aset* @l_repeatLikelyhoodIntegerArray (JR/sget 'Canvas "DOWN") (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0))
        (JR/aset* @l_repeatLikelyhoodIntegerArray (JR/sget 'Canvas "LEFT") (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0))
        (JR/aset* @l_repeatLikelyhoodIntegerArray (JR/sget 'Canvas "RIGHT") (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0))
        (JR/aset* @l_repeatLikelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM7") (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0))
        (JR/aset* @l_repeatLikelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM9") (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0))
        (JR/aset* @l_repeatLikelyhoodIntegerArray (JR/sget 'Canvas "KEY_NUM1") (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10))
        (vreset! l_inputProbability (InputProbability/jnew_4 @l_likelyhoodIntegerArray @l_repeatLikelyhoodIntegerArray 42 (JR/sget 'NoTimeDelayHelper "SINGLETON")))
        (JR/invoke @l_inputProbability :jm_toHashtable_0)))



