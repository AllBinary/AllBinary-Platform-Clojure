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
;; package org.allbinary.game.configuration.feature

(ns GameFeatureItemCommandListener)

(JR/register 'GameFeatureItemCommandListener nil '[ItemCommandListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :gameOptionsForm nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_gameOptionsForm]
  (let [ l_gameOptionsForm (volatile! p_gameOptionsForm)]
    nil (jinitfields this)
        (JR/fset this :gameOptionsForm @l_gameOptionsForm))
  this)

(defn jnew_1 [p_gameOptionsForm ]
  (let [o (JR/alloc 'GameFeatureItemCommandListener)] (jinit_1 o p_gameOptionsForm) o))

    
(defn jm_commandAction_2 [this p_command p_item]
  (let [ l_command (volatile! p_command) l_item (volatile! p_item) l_itemLabel (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_itemLabel (JR/invoke @l_item :jm_getLabel_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :ITEM_LABEL)) :jm_append_1 @l_itemLabel)) this (JR/fget (JR/scall 'MidletStrings :jm_getInstance_0) :COMMAND_ACTION))
            (if (JR/instance-of @l_item 'GameConfigurationGauge)
                (do
                (JR/invoke (JR/scall 'GameConfigurationUtil :jm_getInstance_0) :jm_change_2 (JR/fget this :gameOptionsForm) @l_item))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget (JR/scall 'MidletStrings :jm_getInstance_0) :COMMAND_ACTION) @l_e)) :else (throw jt)))))))



