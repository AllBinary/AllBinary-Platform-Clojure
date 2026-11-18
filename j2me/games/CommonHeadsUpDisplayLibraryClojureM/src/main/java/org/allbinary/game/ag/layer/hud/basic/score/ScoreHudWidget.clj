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

(ns ScoreHudWidget)

(JR/register 'ScoreHudWidget 'NumberStringHud '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_3 [p_maxscore p_location p_direction]
  (let [this nil l_maxscore (volatile! p_maxscore) l_location (volatile! p_location) l_direction (volatile! p_direction)]
        (ScoreHudWidget/jnew_5 @l_maxscore @l_location @l_direction 2 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :GREY))))

    
(defn jinit_5 [this p_maxscore p_location p_direction p_bufferZone p_basicColor]
  (let [ l_maxscore (volatile! p_maxscore) l_location (volatile! p_location) l_direction (volatile! p_direction) l_bufferZone (volatile! p_bufferZone) l_basicColor (volatile! p_basicColor)]
        (NumberStringHud/jinit_6 this "Pts " @l_maxscore @l_location @l_direction @l_bufferZone @l_basicColor) (jinitfields this)
        (JR/fset this :updateMaxHeight 14))
  this)

(defn jnew_5 [p_maxscore p_location p_direction p_bufferZone p_basicColor ]
  (let [o (JR/alloc 'ScoreHudWidget)] (jinit_5 o p_maxscore p_location p_direction p_bufferZone p_basicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :updateMaxWidth (* (JR/invoke @l_font :jm_getSize_0) 5))
        (JR/invoke-super 'NumberStringHud this :jm_updateMeasurement_1 @l_graphics)))



