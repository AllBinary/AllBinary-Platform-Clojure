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

(ns GameConfigurationUtil)

(JR/register 'GameConfigurationUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameConfigurationUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :GAUGE_UPDATE nil)
  (JR/fset this :FROM nil)
  (JR/fset this :TO nil)
  (JR/fset this :COMPETITION_VALUE 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :GAUGE_UPDATE "Gauge Update: ")
    (JR/fset this :FROM " from: ")
    (JR/fset this :TO " to: ")
    (JR/fset this :COMPETITION_VALUE 1)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameConfigurationUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameConfigurationUtil/jstatic_instance)))

    
(defn jm_change_2 [this p_gameOptionsForm p_gauge]
  (let [ l_gameOptionsForm (volatile! p_gameOptionsForm) l_gauge (volatile! p_gauge) l_gameConfigurationSingleton (volatile! nil) l_gameConfiguration (volatile! nil)]
        (JR/invoke this :jm_update_1 @l_gauge)
        (vreset! l_gameConfigurationSingleton (JR/scall 'GameConfigurationSingleton :jm_getInstance_0))
        (vreset! l_gameConfiguration (JR/invoke @l_gameConfigurationSingleton :jm_getInstanceByName_1 (JR/invoke @l_gauge :jm_getLabel_0)))
        (JR/invoke this :jm_updateChallange_2 @l_gameOptionsForm @l_gameConfiguration)))

    
(defn jm_update_1 [this p_gauge]
  (let [ l_gauge (volatile! p_gauge) l_gameConfigurationSingleton (volatile! nil) l_gameConfiguration (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil) l_value (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_gameConfigurationSingleton (JR/scall 'GameConfigurationSingleton :jm_getInstance_0))
        (vreset! l_gameConfiguration (JR/invoke @l_gameConfigurationSingleton :jm_getInstanceByName_1 (JR/invoke @l_gauge :jm_getLabel_0)))
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (vreset! l_value (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 (+ (JR/invoke @l_gauge :jm_getValue_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMinValue_0) :jm_intValue_0))))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :GAUGE_UPDATE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_gameConfiguration :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :FROM))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke @l_gameConfiguration :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :TO))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke @l_value :jm_intValue_0)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
        (JR/invoke @l_gameConfiguration :jm_setValue_1 @l_value)))

    
(defn jm_setDefault_1 [this p_gauge]
  (let [ l_gauge (volatile! p_gauge) l_gameConfigurationSingleton (volatile! nil) l_gameConfiguration (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_gameConfigurationSingleton (JR/scall 'GameConfigurationSingleton :jm_getInstance_0))
        (vreset! l_gameConfiguration (JR/invoke @l_gameConfigurationSingleton :jm_getInstanceByName_1 (JR/invoke @l_gauge :jm_getLabel_0)))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Gauge Default: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_gameConfiguration :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :TO))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke @l_gameConfiguration :jm_getDefaultValue_0) :jm_intValue_0)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this "setDefault")
        (JR/invoke @l_gauge :jm_setValue_1 (- (JR/invoke (JR/invoke @l_gameConfiguration :jm_getDefaultValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMinValue_0) :jm_intValue_0)))
        (JR/invoke @l_gameConfiguration :jm_setValue_1 (JR/invoke @l_gameConfiguration :jm_getDefaultValue_0))))

    
(defn jm_updateChallange_2 [this p_gameOptionsForm p_gameConfiguration]
  (let [ l_gameOptionsForm (volatile! p_gameOptionsForm) l_gameConfiguration (volatile! p_gameConfiguration) l_gameConfigurationSingleton (volatile! nil) l_gameConfigurationCentral (volatile! nil) l_size (volatile! nil) l_item (volatile! nil) l_gauge (volatile! nil) l_name (volatile! nil) l_nextGameConfiguration (volatile! nil) l_index (volatile! nil)]
        (vreset! l_gameConfigurationSingleton (JR/scall 'GameConfigurationSingleton :jm_getInstance_0))
        (vreset! l_gameConfigurationCentral (JR/scall 'GameConfigurationCentral :jm_getInstance_0))
        (if (JR/eq @l_gameConfiguration (JR/fget @l_gameConfigurationCentral :CHALLENGE_LEVEL))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "updateChallange")
            (JR/invoke (JR/fget @l_gameConfigurationCentral :COLLIDE_DAMAGE) :jm_setValue_1 (JR/invoke @l_gameConfiguration :jm_getValue_0))
            (JR/invoke (JR/fget @l_gameConfigurationCentral :ATTACK_CHALLENGE_LEVEL) :jm_setValue_1 (JR/invoke @l_gameConfiguration :jm_getValue_0))
            (JR/invoke (JR/fget @l_gameConfigurationCentral :DURABILITY_CHALLENGE_LEVEL) :jm_setValue_1 (JR/invoke @l_gameConfiguration :jm_getValue_0))
            (JR/invoke (JR/fget @l_gameConfigurationCentral :SPEED_CHALLENGE_LEVEL) :jm_setValue_1 (JR/invoke @l_gameConfiguration :jm_getValue_0))
            (vreset! l_size (JR/invoke @l_gameOptionsForm :jm_size_0))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_item (JR/invoke @l_gameOptionsForm :jm_get_1 @l_index))
                (if (JR/instance-of @l_item 'GameConfigurationGauge)
                    (do
                    (vreset! l_gauge @l_item)
                    (vreset! l_name (JR/invoke @l_item :jm_getLabel_0))
                    (vreset! l_nextGameConfiguration (JR/invoke @l_gameConfigurationSingleton :jm_getInstanceByName_1 @l_name))
                    (if (JR/eq @l_nextGameConfiguration (JR/fget @l_gameConfigurationCentral :COLLIDE_DAMAGE))
                        (do
                        (JR/invoke @l_gauge :jm_setValue_1 (- (JR/invoke (JR/invoke (JR/fget @l_gameConfigurationCentral :COLLIDE_DAMAGE) :jm_getValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMinValue_0) :jm_intValue_0))))
                        (if (JR/eq @l_nextGameConfiguration (JR/fget @l_gameConfigurationCentral :DURABILITY_CHALLENGE_LEVEL))
                        (do
                        (JR/invoke @l_gauge :jm_setValue_1 (- (JR/invoke (JR/invoke (JR/fget @l_gameConfigurationCentral :DURABILITY_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMinValue_0) :jm_intValue_0))))
                        (if (JR/eq @l_nextGameConfiguration (JR/fget @l_gameConfigurationCentral :ATTACK_CHALLENGE_LEVEL))
                        (do
                        (JR/invoke @l_gauge :jm_setValue_1 (- (JR/invoke (JR/invoke (JR/fget @l_gameConfigurationCentral :ATTACK_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMinValue_0) :jm_intValue_0))))
                        (if (JR/eq @l_nextGameConfiguration (JR/fget @l_gameConfigurationCentral :SPEED_CHALLENGE_LEVEL))
                        (do
                        (JR/invoke @l_gauge :jm_setValue_1 (- (JR/invoke (JR/invoke (JR/fget @l_gameConfigurationCentral :SPEED_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0) (JR/invoke (JR/invoke @l_gameConfiguration :jm_getMinValue_0) :jm_intValue_0))))))))))))))))

    
(defn jm_updateCompetitionValue_0 [this]
  (let [ l_gameConfigurationCentral (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "updateCompetitionValue")
        (vreset! l_gameConfigurationCentral (JR/scall 'GameConfigurationCentral :jm_getInstance_0))
        (JR/fset this :COMPETITION_VALUE (+ (+ (+ (JR/invoke (JR/invoke (JR/fget @l_gameConfigurationCentral :COLLIDE_DAMAGE) :jm_getValue_0) :jm_intValue_0) (JR/invoke (JR/invoke (JR/fget @l_gameConfigurationCentral :ATTACK_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0)) (JR/invoke (JR/invoke (JR/fget @l_gameConfigurationCentral :DURABILITY_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0)) (JR/invoke (JR/invoke (JR/fget @l_gameConfigurationCentral :SPEED_CHALLENGE_LEVEL) :jm_getValue_0) :jm_intValue_0)))
        (JR/fset this :COMPETITION_VALUE (JR/ishr (JR/fget this :COMPETITION_VALUE) 2))))

    
(defn jm_getCompetitionValue_0 [this]
  (let []
        (JR/fget this :COMPETITION_VALUE)))



