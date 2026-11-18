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

(ns RandomRotationFactory)

(JR/register 'RandomRotationFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (RandomRotationFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :myRandomFactory nil)
  (JR/fset this :angleFactory nil)
    (JR/fset this :myRandomFactory (JR/scall 'MyRandomFactory :jm_getInstance_0))
    (JR/fset this :angleFactory (JR/scall 'AngleFactory :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'RandomRotationFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (RandomRotationFactory/jstatic_instance)))

    
(defn jm_getInstanceList_2 [this p_vector p_howMuch]
  (let [ l_vector (volatile! p_vector) l_howMuch (volatile! p_howMuch) l_graphicsPipe (volatile! nil)]
        (vreset! l_graphicsPipe (BasicGraphicsPipeline/jnew_1 @l_vector))
        (JR/invoke @l_graphicsPipe :jm_createMatrix_0)
        (JR/invoke @l_graphicsPipe :jm_rotateToAngle_1 (JR/invoke (JR/fget this :angleFactory) :jm_getAt_1 (JR/invoke this :jm_getNextRandomAngle_1 @l_howMuch)))
        (JR/invoke @l_graphicsPipe :jm_getMatrix_0)))

    
(defn jm_getNextRandomAngle_1 [this p_howMuch]
  (let [ l_howMuch (volatile! p_howMuch)]
        (JR/invoke (JR/fget this :myRandomFactory) :jm_getNextInt_1 (unchecked-int (unchecked-multiply @l_howMuch 10)))))



