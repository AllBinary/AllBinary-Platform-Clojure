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
;; package org.allbinary.game.ag.layer.hud.basic.notification

(ns NoGameGameNotificationHud)

(JR/register 'NoGameGameNotificationHud 'GameNotificationHud '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (GameNotificationHud/jinit_4 this (JR/fget (JR/scall 'BasicHudFactory :jm_getInstance_0) :TOPCENTER) (JR/fget (JR/scall 'BasicHudFactory :jm_getInstance_0) :HORIZONTAL) 2 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :RED)) (jinitfields this)
        (JR/fset this :updateMaxWidth 40)
        (JR/fset this :updateMaxHeight 14))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NoGameGameNotificationHud)] (jinit_0 o) o))



