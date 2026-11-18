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

(ns PlatformFormInputMappingFactory)

(JR/register 'PlatformFormInputMappingFactory nil '[])

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
  (JR/fset this :inputToGameKeyMapping nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :inputToGameKeyMapping (JR/scall 'InputToGameKeyMapping :jm_getNullInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'PlatformFormInputMappingFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (PlatformFormInputMappingFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (PlatformFormInputMappingFactory/jstatic_set_instance (PlatformFormInputMappingFactory/jnew_0))))
        (PlatformFormInputMappingFactory/jstatic_instance)))

    
(defn jm_getOrCreate_0 [this]
  (let [ l_inputToGameKeyMapping (volatile! nil) l_gameKeyFactory (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (if (JR/eq (JR/fget this :inputToGameKeyMapping) (JR/scall 'InputToGameKeyMapping :jm_getNullInstance_0))
                (do
                (vreset! l_inputToGameKeyMapping (InputToGameKeyMapping/jnew_0))
                (vreset! l_gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
                (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :UP) (JR/fget @l_gameKeyFactory :UP))
                (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :DOWN) (JR/fget @l_gameKeyFactory :DOWN))
                (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :LEFT) (JR/fget @l_gameKeyFactory :LEFT))
                (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :RIGHT) (JR/fget @l_gameKeyFactory :RIGHT))
                (JR/invoke @l_inputToGameKeyMapping :jm_add_2 (JR/fget @l_gameKeyFactory :KEY_NUM1) (JR/fget @l_gameKeyFactory :GAME_A))
                (JR/fset this :inputToGameKeyMapping @l_inputToGameKeyMapping))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)) :else (throw jt)))))
        (JR/fget this :inputToGameKeyMapping)))



