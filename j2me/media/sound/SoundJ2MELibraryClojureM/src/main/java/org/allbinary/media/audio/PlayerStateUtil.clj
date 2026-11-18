;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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

(ns PlayerStateUtil)

(JR/register 'PlayerStateUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PlayerStateUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :UNREALIZED nil)
  (JR/fset this :REALIZED nil)
  (JR/fset this :PREFETCHED nil)
  (JR/fset this :STARTED nil)
  (JR/fset this :CLOSED nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :UNREALIZED "UNREALIZED")
    (JR/fset this :REALIZED "REALIZED")
    (JR/fset this :PREFETCHED "PREFETCHED")
    (JR/fset this :STARTED "STARTED")
    (JR/fset this :CLOSED "CLOSED")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlayerStateUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PlayerStateUtil/jstatic_instance)))

    
(defn jm_convert_1 [this p_state]
  (let [ l_state (volatile! p_state)](JR/method
        (if (JR/eq @l_state (JR/sget 'Player "UNREALIZED"))
            (do
            (JR/jreturn (JR/fget this :UNREALIZED)))
            (if (JR/eq @l_state (JR/sget 'Player "REALIZED"))
            (do
            (JR/jreturn (JR/fget this :REALIZED)))
            (if (JR/eq @l_state (JR/sget 'Player "PREFETCHED"))
            (do
            (JR/jreturn (JR/fget this :PREFETCHED)))
            (if (JR/eq @l_state (JR/sget 'Player "STARTED"))
            (do
            (JR/jreturn (JR/fget this :STARTED)))
            (if (JR/eq @l_state (JR/sget 'Player "CLOSED"))
            (do
            (JR/jreturn (JR/fget this :CLOSED))))))))
        (JR/fget (JR/fget this :commonStrings) :UNKNOWN))))



