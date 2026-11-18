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
;; package org.allbinary.game.input

(ns PlatformKeyFactory)

(JR/register 'PlatformKeyFactory nil '[])

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
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformKeyFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (PlatformKeyFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (PlatformKeyFactory/jstatic_set_instance (PlatformKeyFactory/jnew_0))))
        (PlatformKeyFactory/jstatic_instance)))

    
(defn jm_getString_1 [this p_keyCode]
  (let [ l_keyCode (volatile! p_keyCode)]
        (JR/scall 'PCGameKey :jm_getString_1 @l_keyCode)))

    
(defn jm_isSubmission_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/scall 'PCKeyFactory :jm_getInstance_0) :jm_isSubmission_1 @l_input)))

    
(defn jm_isDelete_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/scall 'PCKeyFactory :jm_getInstance_0) :jm_isDelete_1 @l_input)))

    
(defn jm_isBackSpace_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/scall 'PCKeyFactory :jm_getInstance_0) :jm_isBackSpace_1 @l_input)))

    
(defn jm_isUp_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/scall 'PCKeyFactory :jm_getInstance_0) :jm_isUp_1 @l_input)))

    
(defn jm_isDown_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/scall 'PCKeyFactory :jm_getInstance_0) :jm_isDown_1 @l_input)))

    
(defn jm_isEnter_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/scall 'PCKeyFactory :jm_getInstance_0) :jm_isEnter_1 @l_input)))

    
(defn jm_isLeft_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/scall 'PCKeyFactory :jm_getInstance_0) :jm_isLeft_1 @l_input)))

    
(defn jm_isRight_1 [this p_input]
  (let [ l_input (volatile! p_input)]
        (JR/invoke (JR/scall 'PCKeyFactory :jm_getInstance_0) :jm_isRight_1 @l_input)))



