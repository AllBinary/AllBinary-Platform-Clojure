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
;; package org.allbinary.game.displayable

(ns GameLevelDisplayChangeEventListenersFactory)

(JR/register 'GameLevelDisplayChangeEventListenersFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameLevelDisplayChangeEventListenersFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameLevelDisplayChangeEventListenersFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameLevelDisplayChangeEventListenersFactory/jstatic_instance)))

    
(defn jm_add_1 [this p_displayChangeEventListener]
  (let [ l_displayChangeEventListener (volatile! p_displayChangeEventListener)]
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_displayChangeEventListener)
        (JR/invoke (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 @l_displayChangeEventListener)))

    
(defn jm_clear_0 [this]
  (let [ l_displayChangeEventHandler (volatile! nil) l_displayChangeEventListener (volatile! nil) l_index (volatile! nil)]
        (vreset! l_displayChangeEventHandler (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0))
        (vreset! l_displayChangeEventListener nil)
        (do (vreset! l_index (JR/invoke (JR/fget this :list) :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_displayChangeEventListener (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
            (JR/invoke @l_displayChangeEventHandler :jm_removeListener_1 @l_displayChangeEventListener)))
        (JR/invoke (JR/fget this :list) :jm_clear_0)))



