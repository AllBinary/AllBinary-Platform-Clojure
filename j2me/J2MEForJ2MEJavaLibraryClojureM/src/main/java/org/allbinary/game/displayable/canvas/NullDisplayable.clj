;; Generated Code Do Not Modify
;; package org.allbinary.game.displayable.canvas

;;J2MEForJ2ME
(ns NullDisplayable)

(JR/register 'NullDisplayable 'Canvas '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (NullDisplayable/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :baseGameStatistics nil)
    (JR/fset this :baseGameStatistics (JR/scall 'GameStatisticsFactory :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (NullDisplayable/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    (Canvas/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NullDisplayable)] (jinit_0 o) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :baseGameStatistics) :jm_nextRefresh_0)))



