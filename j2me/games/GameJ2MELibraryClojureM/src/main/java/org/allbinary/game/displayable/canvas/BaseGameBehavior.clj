;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.game.displayable.canvas

(ns BaseGameBehavior)

(JR/register 'BaseGameBehavior 'DemoGameBehavior '[])

(def jsv_instanceC (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instanceC [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceC)
(defn jstatic_set_instanceC [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceC v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instanceC (BaseGameBehavior/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (DemoGameBehavior/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BaseGameBehavior)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BaseGameBehavior/jstatic_instanceC)))

    
(defn jm_init_0 [this]
  (let [ l_gameAdState (volatile! nil)]
        (vreset! l_gameAdState (JR/invoke (JR/scall 'GameAdStateFactory :jm_getInstance_0) :jm_getCurrentInstance_0))
        (JR/invoke @l_gameAdState :jm_playingAdState_0)))

    
(defn jm_pause_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas) l_features (volatile! nil) l_currentDisplayableFactory (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL_AS_GAME_THREAD))
            (do
            (vreset! l_currentDisplayableFactory (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0))
            (JR/invoke @l_currentDisplayableFactory :jm_setRunnable_1 (JR/fget @l_allBinaryGameCanvas :gamePauseRunnable))))))

    
(defn jm_unPause_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas) l_currentDisplayableFactory (volatile! nil)]
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL_AS_GAME_THREAD))
            (do
            (vreset! l_currentDisplayableFactory (JR/scall 'CurrentDisplayableFactory :jm_getInstance_0))
            (JR/invoke @l_currentDisplayableFactory :jm_setRunnable_1 (JR/fget @l_allBinaryGameCanvas :gameRunnable))
            (JR/invoke @l_currentDisplayableFactory :jm_setDisplayable_1 @l_allBinaryGameCanvas)))))

    
(defn jm_updateTouch_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_updateTouch2_0)))

    
(defn jm_updateScreenButtonPaintable_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_updateScreenButtonPaintable2_0)))

    
(defn jm_setGameState_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_updateGameState_0)))

    
(defn jm_removeAllGameKeyInputListeners_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_removeAllGameKeyInputListeners2_0)))

    
(defn jm_updateEndGameProcessor_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_updateEndGameProcessor2_0)))

    
(defn jm_buildGame_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_buildGame2_0)))

    
(defn jm_run_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_run2_0)))

    
(defn jm_setHighScore_6 [this p_abeClientInformation p_allBinaryGameCanvas p_name p_score p_autoSubmit p_isLast]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas) l_name (volatile! p_name) l_score (volatile! p_score) l_autoSubmit (volatile! p_autoSubmit) l_isLast (volatile! p_isLast)]
        (JR/invoke @l_allBinaryGameCanvas :jm_setHighScore2_5 @l_abeClientInformation @l_name @l_score @l_autoSubmit @l_isLast)))



