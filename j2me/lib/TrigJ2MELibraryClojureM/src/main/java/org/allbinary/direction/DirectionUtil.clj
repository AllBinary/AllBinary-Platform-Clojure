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
;; package org.allbinary.direction

(ns DirectionUtil)

(JR/register 'DirectionUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DirectionUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :directionArray nil)
  (JR/fset this :directionArray2 nil)
    (JR/fset this :directionArray (JR/anew "Object" 1 10))
    (JR/fset this :directionArray2 (JR/anew "Object" 1 10))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DirectionUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_angleFactory (volatile! nil) l_directionFactory (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_angleFactory (JR/scall 'AngleFactory :jm_getInstance_0))
        (vreset! l_directionFactory (JR/scall 'DirectionFactory :jm_getInstance_0))
        (JR/aset* (JR/fget this :directionArray) (JR/invoke (JR/fget @l_directionFactory :LEFT) :jm_getValue_0) (JR/fget @l_angleFactory :LEFT))
        (JR/aset* (JR/fget this :directionArray) (JR/invoke (JR/fget @l_directionFactory :RIGHT) :jm_getValue_0) (JR/fget @l_angleFactory :RIGHT))
        (JR/aset* (JR/fget this :directionArray) (JR/invoke (JR/fget @l_directionFactory :UP) :jm_getValue_0) (JR/fget @l_angleFactory :UP))
        (JR/aset* (JR/fget this :directionArray) (JR/invoke (JR/fget @l_directionFactory :DOWN) :jm_getValue_0) (JR/fget @l_angleFactory :DOWN))
        (JR/aset* (JR/fget this :directionArray2) (JR/invoke (JR/fget @l_directionFactory :LEFT) :jm_getValue_0) (JR/fget @l_angleFactory :LEFT))
        (JR/aset* (JR/fget this :directionArray2) (JR/invoke (JR/fget @l_directionFactory :RIGHT) :jm_getValue_0) (JR/fget @l_angleFactory :RIGHT))
        (JR/aset* (JR/fget this :directionArray2) (JR/invoke (JR/fget @l_directionFactory :UP) :jm_getValue_0) (JR/fget @l_angleFactory :UP))
        (JR/aset* (JR/fget this :directionArray2) (JR/invoke (JR/fget @l_directionFactory :DOWN) :jm_getValue_0) (JR/fget @l_angleFactory :DOWN)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DirectionUtil)] (jinit_0 o) o))

    
(defn jm_getAngle_1 [this p_direction]
  (let [ l_direction (volatile! p_direction)]
        (JR/aget* (JR/fget this :directionArray2) (JR/invoke @l_direction :jm_getValue_0))))

    
(defn jm_getFrameAngle_1 [this p_direction]
  (let [ l_direction (volatile! p_direction)]
        (JR/aget* (JR/fget this :directionArray) (JR/invoke @l_direction :jm_getValue_0))))



