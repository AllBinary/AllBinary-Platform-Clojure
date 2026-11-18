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

(ns InGameOptionsFormFactory)

(JR/register 'InGameOptionsFormFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :SINGLETON nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :SINGLETON (JR/scall 'CommandForm :jm_getNullCommandForm_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'InGameOptionsFormFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (InGameOptionsFormFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (InGameOptionsFormFactory/jstatic_set_instance (InGameOptionsFormFactory/jnew_0))))
        (InGameOptionsFormFactory/jstatic_instance)))

    
(defn jm_init_5 [this p_commandListener p_initInterface p_title p_backgrounBasicColor p_foregroundBasicColor]
  (let [ l_commandListener (volatile! p_commandListener) l_initInterface (volatile! p_initInterface) l_title (volatile! p_title) l_backgrounBasicColor (volatile! p_backgrounBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (if (JR/eq (JR/fget this :SINGLETON) (JR/scall 'CommandForm :jm_getNullCommandForm_0))
                (do
                (JR/invoke @l_initInterface :jm_init_0)
                (JR/fset this :SINGLETON (InGameOptionsForm/jnew_4 @l_commandListener @l_title @l_backgrounBasicColor @l_foregroundBasicColor)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :INIT) @l_e)) :else (throw jt)))))))

    
(defn jm_get_0 [this]
  (let []
        (JR/fget this :SINGLETON)))



