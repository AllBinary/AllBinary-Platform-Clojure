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
;; package org.allbinary.game.configuration.event

(ns GameInitializedEvent)

(JR/register 'GameInitializedEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :resourceLoadingLevel nil)
  (JR/fset this :level 0)
    (JR/fset this :resourceLoadingLevel (JR/fget (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0) :LEVEL))
  this)

    
(defn jinit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType)]
        (AllBinaryEventObject/jinit_1 this @l_anyType) (jinitfields this))
  this)

(defn jnew_1 [p_anyType ]
  (let [o (JR/alloc 'GameInitializedEvent)] (jinit_1 o p_anyType) o))

    
(defn jm_setLevel_1 [this p_level]
  (let [ l_level (volatile! p_level)]
        (JR/fset this :level @l_level)
        (JR/fset this :resourceLoadingLevel (JR/fget (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0) :LEVEL))))

    
(defn jm_getLevel_0 [this]
  (let []
        (JR/fget this :level)))

    
(defn jm_setResourceLoadingLevel_1 [this p_resourceLoadingLevel]
  (let [ l_resourceLoadingLevel (volatile! p_resourceLoadingLevel)]
        (JR/fset this :resourceLoadingLevel @l_resourceLoadingLevel)
        (JR/fset this :level (JR/invoke (JR/fget this :resourceLoadingLevel) :jm_getLevel_0))))

    
(defn jm_getResourceLoadingLevel_0 [this]
  (let []
        (JR/fget this :resourceLoadingLevel)))



