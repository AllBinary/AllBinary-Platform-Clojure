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
;; package org.allbinary.game.configuration

(ns GameConfigurationCentral)

(JR/register 'GameConfigurationCentral nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :SCALE nil)
  (JR/fset this :ORIENTATION nil)
  (JR/fset this :SENSOR_UPDATE_RATE nil)
  (JR/fset this :VIBRATION nil)
  (JR/fset this :CHALLENGE_LEVEL nil)
  (JR/fset this :COLLIDE_DAMAGE nil)
  (JR/fset this :DURABILITY_CHALLENGE_LEVEL nil)
  (JR/fset this :SPEED_CHALLENGE_LEVEL nil)
  (JR/fset this :ATTACK_CHALLENGE_LEVEL nil)
  (JR/fset this :CONTROL_LEVEL nil)
  (JR/fset this :PLAYER_INPUT_WAIT nil)
  (JR/fset this :SPEED nil)
  (JR/fset this :SOUND_VOLUME nil)
  (JR/fset this :MAX_GAME_OBJECTS nil)
  (JR/fset this :MAX_LAYERS nil)
  (JR/fset this :gameControlFidelity 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :gameControlFidelity 36)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (GameConfigurationCentral/jstatic_SINGLETON) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (GameConfigurationCentral/jstatic_set_SINGLETON (GameConfigurationCentral/jnew_0))))
        (GameConfigurationCentral/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let [ l_smallIntegerSingletonFactory (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (JR/fset this :SCALE (GameConfiguration/jnew_4 "Scale" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 2) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 2) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 3)))
        (JR/fset this :ORIENTATION (GameConfiguration/jnew_4 "Orientation" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 8)))
        (JR/fset this :SENSOR_UPDATE_RATE (GameConfiguration/jnew_4 "Sensor Update Rate" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 3)))
        (JR/fset this :VIBRATION (GameConfiguration/jnew_4 "Vibration" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 3)))
        (JR/fset this :CHALLENGE_LEVEL (GameConfiguration/jnew_4 "Global Challenge Level" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 3) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :COLLIDE_DAMAGE (GameConfiguration/jnew_4 "Collide Damage Challenge Level" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 3) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :DURABILITY_CHALLENGE_LEVEL (GameConfiguration/jnew_4 "Enemy Durability Challenge Level" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 3) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :SPEED_CHALLENGE_LEVEL (GameConfiguration/jnew_4 "Enemy Speed Challenge Level" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 3) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :ATTACK_CHALLENGE_LEVEL (GameConfiguration/jnew_4 "Enemy Attack Challenge Level" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 3) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :CONTROL_LEVEL (GameConfiguration/jnew_4 "Control Fidelity" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 5) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :PLAYER_INPUT_WAIT (GameConfiguration/jnew_4 "Input Wait" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 5) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :SPEED (GameConfiguration/jnew_4 "Game Speed (Device Specific)" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 5) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :SOUND_VOLUME (GameConfiguration/jnew_4 "Sound Volume" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 6) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 0) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 10)))
        (JR/fset this :MAX_GAME_OBJECTS (GameConfiguration/jnew_4 "Max Game Objects" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 20) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 50)))
        (JR/fset this :MAX_LAYERS (GameConfiguration/jnew_4 "Max Layers" (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 20) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 1) (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 50))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameConfigurationCentral)] (jinit_0 o) o))

    
(defn jm_load_1 [this p_abeClientInformation]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_commonStrings (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil) l_keyValuePersistance (volatile! nil) l_list (volatile! nil) l_hashtable (volatile! nil) l_anyType (volatile! nil) l_value (volatile! nil) l_e (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (try (do
            (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
            (vreset! l_keyValuePersistance (JR/scall 'GameConfigurationPersistanceSingleton :jm_getInstance_0))
            (JR/invoke @l_keyValuePersistance :jm_clear_0)
            (JR/invoke @l_keyValuePersistance :jm_loadAll_1 @l_abeClientInformation)
            (vreset! l_list (JR/invoke @l_keyValuePersistance :jm_getIds_0))
            (if (> (JR/invoke @l_list :jm_size_0) 0)
                (do
                (vreset! l_hashtable (JR/invoke @l_keyValuePersistance :jm_get_1 0))
                (vreset! l_anyType (JR/invoke (JR/fget this :SCALE) :jm_getName_0))
                (vreset! l_value (JR/invoke @l_hashtable :jm_get_1 @l_anyType))
                (JR/invoke (JR/fget this :SCALE) :jm_setValue_1 (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 (JR/invoke (JR/s @l_value) :jm_intValue_0))))
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 "No Game Configuration To Load" this (JR/fget @l_commonStrings :LOAD)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :LOAD) @l_e)) :else (throw jt)))))))

    
(defn jm_setGameControlFidelity_1 [this p_gameControlFidelity]
  (let [ l_gameControlFidelity (volatile! p_gameControlFidelity)]
        (JR/fset this :gameControlFidelity @l_gameControlFidelity)))

    
(defn jm_getGameControlFidelity_0 [this]
  (let []
        (JR/fget this :gameControlFidelity)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_commonStrings (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_commonStrings (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :SCALE) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :SCALE) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :ORIENTATION) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :ORIENTATION) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :SENSOR_UPDATE_RATE) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :SENSOR_UPDATE_RATE) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :VIBRATION) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :VIBRATION) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :CHALLENGE_LEVEL) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :COLLIDE_DAMAGE) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :COLLIDE_DAMAGE) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :DURABILITY_CHALLENGE_LEVEL) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :DURABILITY_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :SPEED_CHALLENGE_LEVEL) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :SPEED_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :ATTACK_CHALLENGE_LEVEL) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :ATTACK_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :CONTROL_LEVEL) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :CONTROL_LEVEL) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :SPEED) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :SPEED) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :MAX_GAME_OBJECTS) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :MAX_GAME_OBJECTS) :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :COMMA_SEP))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :MAX_LAYERS) :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonStrings :EQUALS))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke (JR/fget this :MAX_LAYERS) :jm_getValue_0) :jm_intValue_0)))
        (JR/to-string-of @l_stringBuffer)))



