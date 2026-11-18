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
;; package org.allbinary.media.audio

(ns Sound)

(JR/register 'Sound nil '[SoundInterface java.lang.Runnable])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :resource nil)
  (JR/fset this :player nil)
    (JR/fset this :player (JR/sget 'NoPlayer "NO_PLAYER"))
  this)

    
(defn jinit_1 [this p_resource]
  (let [ l_resource (volatile! p_resource)]
    nil (jinitfields this)
        (JR/fset this :resource @l_resource))
  this)

(defn jnew_1 [p_resource ]
  (let [o (JR/alloc 'Sound)] (jinit_1 o p_resource) o))

    
(defn jm_getResource_0 [this]
  (let []
        (JR/fget this :resource)))

    
(defn jm_getPlayerP_0 [this]
  (let []
        (JR/fget this :player)))

    
(defn jm_setPlayerP_1 [this p_player]
  (let [ l_player (volatile! p_player)]
        (JR/fset this :player @l_player)))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_getDuration_0 [this]
  (let []
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_run_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke (JR/fget this :player) :jm_start_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/scall 'PreLogUtil :jm_put_3 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :RUN))) :else (throw jt)))))))



