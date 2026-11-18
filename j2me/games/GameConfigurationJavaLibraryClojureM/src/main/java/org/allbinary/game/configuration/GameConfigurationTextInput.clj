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

(ns GameConfigurationTextInput)

(JR/register 'GameConfigurationTextInput nil '[])

(def jsv_hashtable (atom nil))
(def jsv_SIMULATOR_IP (atom nil))
(def jsv_SIMULATOR_PORT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_hashtable [] (JR/ensure-init jclinit-state jclinit) @jsv_hashtable)
(defn jstatic_set_hashtable [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_hashtable v))
(defn jstatic_SIMULATOR_IP [] (JR/ensure-init jclinit-state jclinit) @jsv_SIMULATOR_IP)
(defn jstatic_set_SIMULATOR_IP [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SIMULATOR_IP v))
(defn jstatic_SIMULATOR_PORT [] (JR/ensure-init jclinit-state jclinit) @jsv_SIMULATOR_PORT)
(defn jstatic_set_SIMULATOR_PORT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SIMULATOR_PORT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
    (reset! jsv_SIMULATOR_IP (GameConfigurationTextInput/jnew_2 "IP: " "192.168.1.3"))
    (reset! jsv_SIMULATOR_PORT (GameConfigurationTextInput/jnew_2 "Port: " "8010"))
    nil))

(defn jinitfields [this]
  (JR/fset this :label nil)
  (JR/fset this :text nil)
    (JR/fset this :label (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :text (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_2 [this p_label p_text]
  (let [ l_label (volatile! p_label) l_text (volatile! p_text)]
    nil (jinitfields this)
        (JR/invoke this :jm_setText_1 @l_text)
        (JR/invoke this :jm_setLabel_1 @l_label)
        (JR/invoke (GameConfigurationTextInput/jstatic_hashtable) :jm_put_2 (JR/invoke this :jm_getLabel_0) this))
  this)

(defn jnew_2 [p_label p_text ]
  (let [o (JR/alloc 'GameConfigurationTextInput)] (jinit_2 o p_label p_text) o))

    
(defn jm_update_1 [p_textField]
  (let [this nil l_textField (volatile! p_textField) l_anyType (volatile! nil) l_gameConfigurationTextInput (volatile! nil)]
        (vreset! l_anyType (JR/invoke @l_textField :jm_getLabel_0))
        (vreset! l_gameConfigurationTextInput (JR/invoke (GameConfigurationTextInput/jstatic_hashtable) :jm_get_1 @l_anyType))
        (JR/invoke @l_gameConfigurationTextInput :jm_setText_1 (JR/invoke @l_textField :jm_getString_0))))

    
(defn jm_setText_1 [this p_text]
  (let [ l_text (volatile! p_text)]
        (JR/fset this :text @l_text)))

    
(defn jm_getText_0 [this]
  (let []
        (JR/fget this :text)))

    
(defn jm_setLabel_1 [this p_label]
  (let [ l_label (volatile! p_label)]
        (JR/fset this :label @l_label)))

    
(defn jm_getLabel_0 [this]
  (let []
        (JR/fget this :label)))

    
(defn jm_getHashtable_0 []
  (let [this nil]
        (GameConfigurationTextInput/jstatic_hashtable)))



