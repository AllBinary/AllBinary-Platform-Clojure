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
;; package org.allbinary.math

(ns AngleIncrementInfoFactory)

(JR/register 'AngleIncrementInfoFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AngleIncrementInfoFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :angleIncrementInfo nil)
    (JR/fset this :angleIncrementInfo (JR/anew "Object" 1 (JR/fget (JR/scall 'AngleFactory :jm_getInstance_0) :TOTAL_ANGLE)))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AngleIncrementInfoFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AngleIncrementInfoFactory/jstatic_instance)))

    
(defn jm_getAt_1 [this p_angleIncrement]
  (let [ l_angleIncrement (volatile! p_angleIncrement) l_halfAngleIncrement (volatile! nil) l_angleIncrementInfo (volatile! nil) l_angleIncrementInfoCanBeNull (volatile! nil)](JR/method
        (vreset! l_halfAngleIncrement (JR/ishr @l_angleIncrement 1))
        (vreset! l_angleIncrementInfo nil)
        (vreset! l_angleIncrementInfoCanBeNull (JR/aget* (JR/fget this :angleIncrementInfo) @l_halfAngleIncrement))
        (if (nil? @l_angleIncrementInfoCanBeNull)
            (do
            (vreset! l_angleIncrementInfo (AngleIncrementInfo/jnew_1 @l_angleIncrement))
            (JR/aset* (JR/fget this :angleIncrementInfo) @l_halfAngleIncrement @l_angleIncrementInfo)
            (JR/jreturn @l_angleIncrementInfo))
            (do
            (vreset! l_angleIncrementInfo @l_angleIncrementInfoCanBeNull)))
        @l_angleIncrementInfo)))



