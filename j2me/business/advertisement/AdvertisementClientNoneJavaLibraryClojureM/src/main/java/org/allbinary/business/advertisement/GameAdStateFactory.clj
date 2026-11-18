;; Generated Code Do Not Modify
;; package org.allbinary.business.advertisement

(ns GameAdStateFactory)

(JR/register 'GameAdStateFactory nil '[GameAdStateFactoryInterface])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameAdStateFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :gameAdStateArray nil)
  (JR/fset this :gameAdState nil)
    (JR/fset this :gameAdStateArray (JR/afrom "Object" 1 [(GameAdState/jnew_1 (AppNameLicensingAdConfiguration/jnew_0))]))
    (JR/fset this :gameAdState (JR/aget* (JR/fget this :gameAdStateArray) 0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameAdStateFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameAdStateFactory/jstatic_instance)))

    
(defn jm_getCurrentInstance_0 [this]
  (let []
        (JR/fget this :gameAdState)))

    
(defn jm_getInstanceForApp_1 [this p_softwareInformation]
  (let [ l_softwareInformation (volatile! p_softwareInformation)]
        (JR/fset this :gameAdState (JR/aget* (JR/fget this :gameAdStateArray) 0))
        (JR/aget* (JR/fget this :gameAdStateArray) 0)))

    
(defn jm_isEnabled_0 [this]
  (let []
        false))



