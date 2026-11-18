;; Generated Code Do Not Modify
;; package org.allbinary.game.input.analog

(ns AnalogLocationInputFactory)

(JR/register 'AnalogLocationInputFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AnalogLocationInputFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AnalogLocationInputFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AnalogLocationInputFactory)] (jinit_0 o) o))

    
(defn jm_addPlayer_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId) l_analogLocationInput (volatile! nil)]
        (vreset! l_analogLocationInput (JR/sget 'AnalogLocationInput "NULL_ANALOG_LOCATION_INPUT"))
        (if (< @l_playerInputId (JR/invoke (JR/fget this :list) :jm_size_0))
            (do
            (vreset! l_analogLocationInput (JR/invoke (JR/fget this :list) :jm_get_1 @l_playerInputId))))
        (if (JR/eq @l_analogLocationInput (JR/sget 'AnalogLocationInput "NULL_ANALOG_LOCATION_INPUT"))
            (do
            (vreset! l_analogLocationInput (AnalogLocationInput/jnew_1 @l_playerInputId))
            (JR/invoke (JR/fget this :list) :jm_add_1 @l_analogLocationInput)))))

    
(defn jm_getInstanceForPlayer_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId)]
        (JR/invoke (JR/fget this :list) :jm_get_1 @l_playerInputId)))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :list)))



