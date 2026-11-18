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

(ns GameConfiguration)

(JR/register 'GameConfiguration nil '[])

(def jsv_MIN_VALUE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_MIN_VALUE [] (JR/ensure-init jclinit-state jclinit) @jsv_MIN_VALUE)
(defn jstatic_set_MIN_VALUE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_MIN_VALUE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_MIN_VALUE (long java.lang.Integer/MIN_VALUE))
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :defaultValue nil)
  (JR/fset this :value nil)
  (JR/fset this :minValue nil)
  (JR/fset this :maxValue nil)
  (JR/fset this :modifiable nil)
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :defaultValue (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_getAt_1 0))
    (JR/fset this :value (GameConfiguration/jstatic_MIN_VALUE))
    (JR/fset this :minValue (JR/fget this :defaultValue))
    (JR/fset this :maxValue (JR/fget this :defaultValue))
    (JR/fset this :modifiable (JR/fget (JR/scall 'BooleanFactory :jm_getInstance_0) :TRUE))
  this)

    
(defn jinit_4 [this p_name p_defaultValue p_minValue p_maxValue]
  (let [ l_name (volatile! p_name) l_defaultValue (volatile! p_defaultValue) l_minValue (volatile! p_minValue) l_maxValue (volatile! p_maxValue)]
    nil (jinitfields this)
        (JR/invoke this :jm_setName_1 @l_name)
        (JR/invoke this :jm_setDefaultValue_1 @l_defaultValue)
        (JR/fset this :value (JR/invoke this :jm_getDefaultValue_0))
        (JR/invoke this :jm_setMinValue_1 @l_minValue)
        (JR/invoke this :jm_setMaxValue_1 @l_maxValue)
        (JR/invoke (JR/invoke (JR/scall 'GameConfigurationSingleton :jm_getInstance_0) :jm_getHashtable_0) :jm_put_2 (JR/invoke this :jm_getName_0) this))
  this)

(defn jnew_4 [p_name p_defaultValue p_minValue p_maxValue ]
  (let [o (JR/alloc 'GameConfiguration)] (jinit_4 o p_name p_defaultValue p_minValue p_maxValue) o))

    
(defn jm_setValue_1 [this p_value]
  (let [ l_value (volatile! p_value) l_oldValue (volatile! nil)]
        (if (not (JR/eq (JR/fget this :value) @l_value))
            (do
            (vreset! l_oldValue (JR/fget this :value))
            (JR/fset this :value @l_value)
            (JR/invoke (JR/scall 'GameFeatureEventHandler :jm_getInstance_0) :jm_fireEvent_1 (GameFeatureEvent/jnew_2 this (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :name)) :jm_append_1 " value: from: ") :jm_appendint_1 (JR/i32 (JR/invoke @l_oldValue :jm_intValue_0))) :jm_append_1 " to ") :jm_appendint_1 (JR/i32 (JR/invoke (JR/fget this :value) :jm_intValue_0))))))))))

    
(defn jm_getValue_0 [this]
  (let []
        (JR/fget this :value)))

    
(defn jm_setMaxValue_1 [this p_maxValue]
  (let [ l_maxValue (volatile! p_maxValue)]
        (JR/fset this :maxValue @l_maxValue)))

    
(defn jm_getMaxValue_0 [this]
  (let []
        (JR/fget this :maxValue)))

    
(defn jm_setMinValue_1 [this p_minValue]
  (let [ l_minValue (volatile! p_minValue)]
        (JR/fset this :minValue @l_minValue)))

    
(defn jm_getMinValue_0 [this]
  (let []
        (JR/fget this :minValue)))

    
(defn jm_setName_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/fset this :name @l_name)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_setDefaultValue_1 [this p_defaultValue]
  (let [ l_defaultValue (volatile! p_defaultValue)]
        (JR/fset this :defaultValue @l_defaultValue)))

    
(defn jm_getDefaultValue_0 [this]
  (let []
        (JR/fget this :defaultValue)))

    
(defn jm_setDefault_0 [this]
  (let []
        (JR/invoke this :jm_setValue_1 (JR/invoke this :jm_getDefaultValue_0))))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Name: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :name))
        (JR/invoke @l_stringBuffer :jm_append_1 " Min: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke this :jm_getMinValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 " Max: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke this :jm_getMaxValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 " Value: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke this :jm_getValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 " Default: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/i32 (JR/invoke (JR/invoke this :jm_getDefaultValue_0) :jm_intValue_0)))
        (JR/invoke @l_stringBuffer :jm_append_1 " Modifiable: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke (JR/invoke this :jm_isModifiable_0) :jm_booleanValue_0))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_setModifiable_1 [this p_modifiable]
  (let [ l_modifiable (volatile! p_modifiable)]
        (JR/fset this :modifiable @l_modifiable)))

    
(defn jm_isModifiable_0 [this]
  (let []
        (JR/fget this :modifiable)))



