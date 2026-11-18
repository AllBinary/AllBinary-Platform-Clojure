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
;; package org.allbinary.game.ag.layer.hud.basic.score

(ns ScoreableAddOnlyForHud)

(JR/register 'ScoreableAddOnlyForHud 'Scoreable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :scoreHudWidget nil)
  this)

    
(defn jinit_1 [this p_scoreVectorGraphic]
  (let [ l_scoreVectorGraphic (volatile! p_scoreVectorGraphic)]
        (Scoreable/jinit_1 this 0) (jinitfields this)
        (JR/fset this :scoreHudWidget @l_scoreVectorGraphic)
        (JR/invoke (JR/invoke this :jm_getScoreHudWidget_0) :jm_set_1 0))
  this)

(defn jnew_1 [p_scoreVectorGraphic ]
  (let [o (JR/alloc 'ScoreableAddOnlyForHud)] (jinit_1 o p_scoreVectorGraphic) o))

    
(defn jm_removePoints_1 [this p_points]
  (let [ l_points (volatile! p_points)]
        nil))

    
(defn jm_addPoints_1 [this p_points]
  (let [ l_points (volatile! p_points)]
        (JR/invoke-super 'Scoreable this :jm_addPoints_1 @l_points)
        (JR/invoke (JR/invoke this :jm_getScoreHudWidget_0) :jm_add_1 @l_points)))

    
(defn jm_getScoreHudWidget_0 [this]
  (let []
        (JR/fget this :scoreHudWidget)))



