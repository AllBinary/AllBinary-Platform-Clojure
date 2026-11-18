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
;; package org.allbinary.graphics.pipeline

(ns RandomTranslation)

(JR/register 'RandomTranslation nil '[])

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
  (let [o (JR/alloc 'RandomTranslation)] (jinit_0 o) o))

    
(defn jm_getInstance_2 [p_vector p_howMuch]
  (let [this nil l_vector (volatile! p_vector) l_howMuch (volatile! p_howMuch) l_myRandomFactory (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_graphicsPipe (volatile! nil)]
        (vreset! l_myRandomFactory (JR/scall 'MyRandomFactory :jm_getInstance_0))
        (vreset! l_x (unchecked-int (unchecked-negate (JR/c2i (JR/invoke @l_myRandomFactory :jm_getNextInt_1 @l_howMuch)))))
        (vreset! l_y (JR/invoke @l_myRandomFactory :jm_getNextInt_1 @l_howMuch))
        (vreset! l_graphicsPipe (BasicGraphicsPipeline/jnew_1 @l_vector))
        (JR/invoke @l_graphicsPipe :jm_createMatrix_0)
        (JR/invoke @l_graphicsPipe :jm_translate_2 @l_x @l_y)
        (JR/invoke @l_graphicsPipe :jm_getMatrix_0)))



