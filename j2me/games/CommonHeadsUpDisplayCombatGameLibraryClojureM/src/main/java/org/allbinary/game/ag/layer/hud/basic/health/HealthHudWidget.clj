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
;; package org.allbinary.game.ag.layer.hud.basic.health

(ns HealthHudWidget)

(JR/register 'HealthHudWidget 'BasicHud '[PaintableInterface HealthListenerInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :healthScale 0)
  (JR/fset this :animationInterface nil)
  (JR/fset this :healthInterface nil)
  (JR/fset this :max 0)
  (JR/fset this :xArray nil)
  (JR/fset this :gameTickTimeDelayHelper nil)
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :slowBeatTimeDelayHelper nil)
  (JR/fset this :mediumBeatTimeDelayHelper nil)
  (JR/fset this :fastBeatTimeDelayHelper nil)
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
    (JR/fset this :timeDelayHelper (JR/sget 'NoTimeDelayHelper "SINGLETON"))
    (JR/fset this :slowBeatTimeDelayHelper (TimeDelayHelper/jnew_1 1280))
    (JR/fset this :mediumBeatTimeDelayHelper (TimeDelayHelper/jnew_1 640))
    (JR/fset this :fastBeatTimeDelayHelper (TimeDelayHelper/jnew_1 320))
  this)

    
(defn jinit_4 [this p_animationInterface p_healthInterface p_location p_direction]
  (let [ l_animationInterface (volatile! p_animationInterface) l_healthInterface (volatile! p_healthInterface) l_location (volatile! p_location) l_direction (volatile! p_direction)]
        (BasicHud/jinit_4 this @l_location @l_direction 2 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)) (jinitfields this)
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :healthInterface @l_healthInterface)
        (JR/invoke (JR/fget this :healthInterface) :jm_addListener_1 this)
        (JR/fset this :healthScale (unchecked-int (unchecked-add (JR/idiv (JR/invoke (JR/fget this :healthInterface) :jm_getMaxHealth_0) 6) 1)))
        (JR/invoke this :jm_onHealthChange_0)
        (JR/fset this :updateMaxWidth (unchecked-int (unchecked-multiply (JR/invoke @l_healthInterface :jm_getMaxHealth_0) 16)))
        (JR/fset this :updateMaxHeight 16)
        (JR/fset this :xArray (JR/anew "INT" 1 30))
        (JR/invoke this :jm_update_0))
  this)

(defn jnew_4 [p_animationInterface p_healthInterface p_location p_direction ]
  (let [o (JR/alloc 'HealthHudWidget)] (jinit_4 o p_animationInterface p_healthInterface p_location p_direction) o))

    
(defn jm_update_0 [this]
  (let [ l_index (volatile! nil)]
        (if (some? (JR/fget this :xArray))
            (do
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index (JR/alen (JR/fget this :xArray))) (do (JR/vinc l_index 1 :int false))
                (JR/aset* (JR/fget this :xArray) @l_index (unchecked-int (unchecked-add (JR/invoke this :jm_getX_0) (unchecked-int (unchecked-multiply @l_index 16)))))))))))

    
(defn jm_setX_1 [this p_x]
  (let [ l_x (volatile! p_x)]
        (JR/invoke-super 'BasicHud this :jm_setX_1 @l_x)
        (JR/invoke this :jm_update_0)))

    
(defn jm_onHealthChange_0 [this]
  (let []
        (JR/fset this :max (JR/idiv (JR/invoke (JR/fget this :healthInterface) :jm_getHealth_0) (JR/fget this :healthScale)))
        (JR/fset this :timeDelayHelper (JR/sget 'NoTimeDelayHelper "SINGLETON"))
        (if (and (<= (JR/fget this :max) 1) (JR/invoke (JR/fget this :healthInterface) :jm_isAlive_0))
            (do
            (JR/fset this :max 1)
            (if (> (unchecked-int (unchecked-subtract (JR/fget this :healthScale) (JR/invoke (JR/fget this :healthInterface) :jm_getHealth_0))) (JR/idiv (unchecked-int (unchecked-multiply (JR/fget this :healthScale) 2)) 3))
                (do
                (JR/fset this :timeDelayHelper (JR/fget this :slowBeatTimeDelayHelper)))
                (if (> (unchecked-int (unchecked-subtract (JR/fget this :healthScale) (JR/invoke (JR/fget this :healthInterface) :jm_getHealth_0))) (JR/idiv (JR/fget this :healthScale) 3))
                (do
                (JR/fset this :timeDelayHelper (JR/fget this :mediumBeatTimeDelayHelper)))
                (do
                (JR/fset this :timeDelayHelper (JR/fget this :fastBeatTimeDelayHelper)))))))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/fget this :max)) (do (JR/vinc l_index 1 :int false))
            (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTime_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime))
                (do
                (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics (JR/aget* (JR/fget this :xArray) @l_index) (JR/invoke this :jm_getY_0))))))))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



