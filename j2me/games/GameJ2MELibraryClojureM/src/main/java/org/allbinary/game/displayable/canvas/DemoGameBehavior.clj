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

(ns DemoGameBehavior)

(JR/register 'DemoGameBehavior nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DemoGameBehavior/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'DemoGameBehavior)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DemoGameBehavior/jstatic_instance)))

    
(defn jm_init_0 [this]
  (let []
        nil))

    
(defn jm_pause_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        nil))

    
(defn jm_unPause_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        nil))

    
(defn jm_updateTouch_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        nil))

    
(defn jm_updateScreenButtonPaintable_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_setTouchPaintableP_1 (JR/scall 'NullPaintable :jm_getInstance_0))))

    
(defn jm_setGameState_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        nil))

    
(defn jm_removeAllGameKeyInputListeners_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        nil))

    
(defn jm_updateEndGameProcessor_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        nil))

    
(defn jm_buildGame_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        nil))

    
(defn jm_run_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas) l_commonStrings (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/fget (JR/scall 'GameTypeFactory :jm_getInstance_0) :BOT)) this (JR/fget @l_commonStrings :RUN))))

    
(defn jm_setHighScore_6 [this p_abeClientInformation p_allBinaryGameCanvas p_name p_score p_autoSubmit p_isLast]
  (let [ l_abeClientInformation (volatile! p_abeClientInformation) l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas) l_name (volatile! p_name) l_score (volatile! p_score) l_autoSubmit (volatile! p_autoSubmit) l_isLast (volatile! p_isLast)]
        nil))



