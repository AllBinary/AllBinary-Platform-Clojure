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
;; package org.allbinary.game.layer.hud.event

(ns GameNotificationEvent)

(JR/register 'GameNotificationEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :string nil)
  (JR/fset this :seconds nil)
  (JR/fset this :basicColor nil)
  (JR/fset this :removeable nil)
    (JR/fset this :string (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :basicColor (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK))
  this)

    
(defn jinit_5 [this p_anyType p_string p_seconds p_basicColor p_permanent]
  (let [ l_anyType (volatile! p_anyType) l_string (volatile! p_string) l_seconds (volatile! p_seconds) l_basicColor (volatile! p_basicColor) l_permanent (volatile! p_permanent)]
        (AllBinaryEventObject/jinit_1 this @l_anyType) (jinitfields this)
        (JR/invoke this :jm_setString_1 @l_string)
        (JR/fset this :seconds @l_seconds)
        (JR/invoke this :jm_setBasicColorP_1 @l_basicColor)
        (JR/fset this :removeable @l_permanent))
  this)

(defn jnew_5 [p_anyType p_string p_seconds p_basicColor p_permanent ]
  (let [o (JR/alloc 'GameNotificationEvent)] (jinit_5 o p_anyType p_string p_seconds p_basicColor p_permanent) o))

    
(defn jm_getString_0 [this]
  (let []
        (JR/fget this :string)))

    
(defn jm_getSeconds_0 [this]
  (let []
        (JR/fget this :seconds)))

    
(defn jm_getBasicColorP_0 [this]
  (let []
        (JR/fget this :basicColor)))

    
(defn jm_getPermanent_0 [this]
  (let []
        (JR/fget this :removeable)))

    
(defn jm_setString_1 [this p_string]
  (let [ l_string (volatile! p_string)]
        (JR/fset this :string @l_string)))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
        (JR/fset this :basicColor @l_basicColor)))



