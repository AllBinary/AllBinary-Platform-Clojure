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
;; package org.allbinary.business.advertisement

(ns BottomLimiter)

(JR/register 'BottomLimiter nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BottomLimiter/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :bottom 0)
  (JR/fset this :deltaY 0)
  (JR/fset this :lower 0)
  (JR/fset this :higher 0)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BottomLimiter/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BottomLimiter)] (jinit_0 o) o))

    
(defn jm_init_2 [this p_lower p_higher]
  (let [ l_lower (volatile! p_lower) l_higher (volatile! p_higher)]
        (JR/fset this :lower @l_lower)
        (JR/fset this :higher @l_higher)))

    
(defn jm_update_0 [this]
  (let [ l_displayInfo (volatile! nil) l_gameAdState (volatile! nil)]
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_gameAdState (JR/invoke (JR/scall 'GameAdStateFactory :jm_getInstance_0) :jm_getCurrentInstance_0))
        (if (JR/invoke @l_gameAdState :jm_isShowingAt_0)
            (do
            (JR/fset this :deltaY (JR/fget this :higher)))
            (do
            (JR/fset this :deltaY (JR/fget this :lower))))
        (JR/fset this :bottom (unchecked-int (unchecked-subtract (JR/invoke @l_displayInfo :jm_getLastHeight_0) (JR/fget this :deltaY))))))

    
(defn jm_getDeltaY_0 [this]
  (let []
        (JR/fget this :deltaY)))

    
(defn jm_getBottom_0 [this]
  (let []
        (JR/fget this :bottom)))



