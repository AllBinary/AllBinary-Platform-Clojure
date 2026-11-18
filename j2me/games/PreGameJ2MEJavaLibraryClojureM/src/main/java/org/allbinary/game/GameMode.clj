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
;; package org.allbinary.game

(ns GameMode)

(JR/register 'GameMode nil '[])

(def jsv_NONE (atom nil))
(def jsv_SERVER (atom nil))
(def jsv_CLIENT (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NONE [] (JR/ensure-init jclinit-state jclinit) @jsv_NONE)
(defn jstatic_set_NONE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NONE v))
(defn jstatic_SERVER [] (JR/ensure-init jclinit-state jclinit) @jsv_SERVER)
(defn jstatic_set_SERVER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SERVER v))
(defn jstatic_CLIENT [] (JR/ensure-init jclinit-state jclinit) @jsv_CLIENT)
(defn jstatic_set_CLIENT [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_CLIENT v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NONE (GameMode/jnew_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING)))
    (reset! jsv_SERVER (GameMode/jnew_1 "Server"))
    (reset! jsv_CLIENT (GameMode/jnew_1 "Client"))
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_1 [this p_name]
  (let [ l_name (volatile! p_name)]
    nil (jinitfields this)
        (JR/invoke this :jm_setName_1 @l_name))
  this)

(defn jnew_1 [p_name ]
  (let [o (JR/alloc 'GameMode)] (jinit_1 o p_name) o))

    
(defn jm_setName_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/fset this :name @l_name)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/invoke this :jm_getName_0)))



