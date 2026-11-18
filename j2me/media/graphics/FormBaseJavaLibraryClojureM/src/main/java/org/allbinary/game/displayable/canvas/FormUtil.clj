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
;; package org.allbinary.game.displayable.canvas

(ns FormUtil)

(JR/register 'FormUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (FormUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'FormUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FormUtil/jstatic_instance)))

    
(defn jm_createFormRectangle_0 [this]
  (let [ l_displayInfo (volatile! nil) l_pointFactory (volatile! nil) l_rectangle (volatile! nil)]
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_pointFactory (JR/scall 'PointFactory :jm_getInstance_0))
        (vreset! l_rectangle (Rectangle/jnew_3 (JR/invoke @l_pointFactory :jm_createXY_2 30 10) (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastWidth_0) 30)) (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHeight_0) 35))))
        @l_rectangle))



