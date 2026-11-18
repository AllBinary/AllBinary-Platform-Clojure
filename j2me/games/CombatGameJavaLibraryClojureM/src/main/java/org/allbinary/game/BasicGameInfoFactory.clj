;; Generated Code Do Not Modify
;; package org.allbinary.game

(ns BasicGameInfoFactory)

(JR/register 'BasicGameInfoFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (BasicGameInfoFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :currentReleaseIndex 0)
  (JR/fset this :currentDestroyIndex 0)
  (JR/fset this :total 0)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicGameInfoFactory/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicGameInfoFactory)] (jinit_0 o) o))

    
(defn jm_init_1 [this p_total]
  (let [ l_total (volatile! p_total)]
        (JR/fset this :currentReleaseIndex 0)
        (JR/fset this :currentDestroyIndex 0)
        (JR/fset this :total @l_total)))

    
(defn jm_isPeaked_0 [this]
  (let []
        (if (>= (JR/fget this :currentDestroyIndex) (JR/fget this :total))
            (do
            true)
            (do
            false))))

    
(defn jm_howManyLeft_0 [this]
  (let []
        (unchecked-int (unchecked-subtract (JR/fget this :total) (JR/fget this :currentDestroyIndex)))))



