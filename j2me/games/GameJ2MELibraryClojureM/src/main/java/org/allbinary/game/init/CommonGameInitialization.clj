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
;; package org.allbinary.game.init

(ns CommonGameInitialization)

(JR/register 'CommonGameInitialization 'BaseGameInitialization '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_resourceInitializationArray p_portion]
  (let [ l_resourceInitializationArray (volatile! p_resourceInitializationArray) l_portion (volatile! p_portion)]
        (BaseGameInitialization/jinit_2 this @l_resourceInitializationArray @l_portion) (jinitfields this))
  this)

(defn jnew_2 [p_resourceInitializationArray p_portion ]
  (let [o (JR/alloc 'CommonGameInitialization)] (jinit_2 o p_resourceInitializationArray p_portion) o))

    
(defn jm_init_3 [this p_abeClientInformation p_commandListener p_level]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_commandListener (volatile! p_commandListener) l_level (volatile! p_level) l_resourceLoadingLevelFactory (volatile! nil) l_progressCanvas (volatile! nil)]
        (JR/invoke-super 'BaseGameInitialization this :jm_init_3 @l_abeClientInformation @l_commandListener @l_level)
        (vreset! l_resourceLoadingLevelFactory (JR/scall 'ResourceLoadingLevelFactory :jm_getInstance_0))
        (if (and (not (JR/invoke this :jm_isGameInitialized_0)) (== @l_level (JR/invoke (JR/fget @l_resourceLoadingLevelFactory :LOAD_ALL) :jm_getLevel_0)))
            (do
            (JR/invoke this :jm_setGameInitialized_1 true)
            (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
            (JR/invoke (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0) :jm_init_0)
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Integers")
            (JR/invoke (JR/scall 'PointFactory :jm_getInstance_0) :jm_init_0)
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Points")
            (JR/scall 'AngleFactory :jm_getInstance_0)
            (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 50 "Angles")
            (JR/invoke this :jm_initGame_0)
            (JR/invoke (JR/aget* (JR/fget this :resourceInitializationArray) (JR/fget this :GAME_RESOURCES)) :jm_init_0)))
        (JR/invoke-super 'BaseGameInitialization this :jm_resourceInitialization_1 @l_level)))

    
(defn jm_initGame_0 [this]
  (let []
        (JR/jthrow (new java.lang.Exception (JR/fget (JR/fget this :commonStrings) :NOT_IMPLEMENTED)))))



