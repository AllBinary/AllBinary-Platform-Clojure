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
;; package org.allbinary.game.ag.layer.hud.basic.life

(ns LivesHudWidget)

(JR/register 'LivesHudWidget 'BasicHud '[PaintableInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :lifeInterface nil)
  (JR/fset this :xArray nil)
  (JR/fset this :animationInterface nil)
  this)

    
(defn jinit_4 [this p_animationInterface p_lifeInterface p_location p_direction]
  (let [ l_animationInterface (volatile! p_animationInterface) l_lifeInterface (volatile! p_lifeInterface) l_location (volatile! p_location) l_direction (volatile! p_direction) l_size (volatile! nil)]
        (BasicHud/jinit_4 this @l_location @l_direction 2 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)) (jinitfields this)
        (JR/fset this :lifeInterface @l_lifeInterface)
        (vreset! l_size (JR/invoke (JR/invoke this :jm_getLifeInterface_0) :jm_getMaxlives_0))
        (JR/fset this :xArray (JR/anew "INT" 1 @l_size))
        (JR/fset this :animationInterface @l_animationInterface)
        (JR/fset this :updateMaxWidth (unchecked-int (unchecked-multiply (JR/invoke (JR/fget this :lifeInterface) :jm_getMaxlives_0) 16)))
        (JR/fset this :updateMaxHeight 16))
  this)

(defn jnew_4 [p_animationInterface p_lifeInterface p_location p_direction ]
  (let [o (JR/alloc 'LivesHudWidget)] (jinit_4 o p_animationInterface p_lifeInterface p_location p_direction) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_maxLives (volatile! nil) l_index (volatile! nil)]
        (JR/invoke-super 'BasicHud this :jm_updateMeasurement_1 @l_graphics)
        (vreset! l_maxLives (JR/invoke (JR/invoke this :jm_getLifeInterface_0) :jm_getMaxlives_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_maxLives) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :xArray) @l_index (unchecked-int (unchecked-add (JR/invoke this :jm_getX_0) (unchecked-int (unchecked-multiply @l_index 16)))))))))

    
(defn jm_onDisplayChangeEvent_1 [this p_displayChangeEvent]
  (let [ l_displayChangeEvent (volatile! p_displayChangeEvent)]
        (JR/invoke-super 'BasicHud this :jm_onDisplayChangeEvent_1 @l_displayChangeEvent)
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_setX_1 [this p_x]
  (let [ l_x (volatile! p_x)]
        (JR/invoke-super 'BasicHud this :jm_setX_1 @l_x)
        (JR/fset this :myFontProcessor (JR/fget this :updateMyFontProcessor))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (do (vreset! l_index (JR/invoke (JR/invoke this :jm_getLifeInterface_0) :jm_get_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/fget this :animationInterface) :jm_paintXY_3 @l_graphics (JR/aget* (JR/fget this :xArray) @l_index) (JR/invoke this :jm_getY_0))))))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_getLifeInterface_0 [this]
  (let []
        (JR/fget this :lifeInterface)))



