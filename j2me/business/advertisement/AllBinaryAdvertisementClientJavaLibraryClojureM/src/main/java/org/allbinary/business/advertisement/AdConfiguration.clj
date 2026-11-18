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
;; package org.allbinary.business.advertisement

(ns AdConfiguration)

(JR/register 'AdConfiguration nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :INNERACTIVE nil)
  (JR/fset this :LEADBOLT nil)
  (JR/fset this :ADMOB nil)
  this)

    
(defn jinit_1 [this p_advertIdArray]
  (let [ l_advertIdArray (volatile! p_advertIdArray)]
    nil (jinitfields this)
        (JR/fset this :INNERACTIVE (JR/aget* @l_advertIdArray 0))
        (JR/fset this :ADMOB (JR/aget* @l_advertIdArray 1))
        (JR/fset this :LEADBOLT (JR/aget* @l_advertIdArray 2)))
  this)

(defn jnew_1 [p_advertIdArray ]
  (let [o (JR/alloc 'AdConfiguration)] (jinit_1 o p_advertIdArray) o))

    
(defn jm_getValidAdSpots_0 [this]
  (let []
        (JR/anew "Object" 1 0)))

    
(defn jm_process_1 [this p_gameState]
  (let [ l_gameState (volatile! p_gameState)]
        nil))

    
(defn jm_processDemo_1 [this p_state]
  (let [ l_state (volatile! p_state)]
        nil))

    
(defn jm_setShowAds_0 [this]
  (let []
        nil))

    
(defn jm_setToggleAds_1 [this p_showAds]
  (let [ l_showAds (volatile! p_showAds)]
        nil))

    
(defn jm_isShowAds_0 [this]
  (let []
        true))



