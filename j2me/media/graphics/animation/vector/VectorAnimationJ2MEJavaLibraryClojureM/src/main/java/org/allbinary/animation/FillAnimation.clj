;; Generated Code Do Not Modify
;; package org.allbinary.animation

(ns FillAnimation)

(JR/register 'FillAnimation 'IndexedAnimation '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :pixelBuffer nil)
  (JR/fset this :width 0)
  (JR/fset this :height 0)
  this)

    
(defn jinit_4 [this p_pixelBuffer p_width p_height p_animationBehavior]
  (let [ l_pixelBuffer (volatile! p_pixelBuffer) l_width (volatile! p_width) l_height (volatile! p_height) l_animationBehavior (volatile! p_animationBehavior)]
        (IndexedAnimation/jinit_1 this @l_animationBehavior) (jinitfields this)
        (JR/fset this :width 100)
        (JR/fset this :height 100)
        (JR/fset this :pixelBuffer @l_pixelBuffer))
  this)

(defn jnew_4 [p_pixelBuffer p_width p_height p_animationBehavior ]
  (let [o (JR/alloc 'FillAnimation)] (jinit_4 o p_pixelBuffer p_width p_height p_animationBehavior) o))

    
(defn jm_setBasicColorP_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor) l_changed (volatile! nil)]
        (vreset! l_changed false)
        (if (or (nil? (JR/invoke this :jm_getBasicColorP_0)) (not (== (JR/invoke (JR/invoke this :jm_getBasicColorP_0) :jm_intValue_0) (JR/invoke @l_basicColor :jm_intValue_0))))
            (do
            (vreset! l_changed true)))
        (JR/invoke-super 'IndexedAnimation this :jm_setBasicColorP_1 @l_basicColor)
        (if @l_changed
            (do
            (JR/invoke this :jm_updateModifiers_0)))))

    
(defn jm_changeBasicColor_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor) l_changed (volatile! nil)]
        (vreset! l_changed false)
        (if (or (nil? (JR/invoke this :jm_getChangeBasicColor_0)) (not (== (JR/invoke (JR/invoke this :jm_getChangeBasicColor_0) :jm_intValue_0) (JR/invoke @l_basicColor :jm_intValue_0))))
            (do
            (vreset! l_changed true)))
        (JR/invoke-super 'IndexedAnimation this :jm_changeBasicColor_1 @l_basicColor)
        (if @l_changed
            (do
            (JR/invoke this :jm_updateModifiers_0)))))

    
(defn jm_setAlpha_1 [this p_alpha]
  (let [ l_alpha (volatile! p_alpha) l_changed (volatile! nil)]
        (vreset! l_changed false)
        (if (not (JR/eq (JR/fget this :alphaP) @l_alpha))
            (do
            (vreset! l_changed true)))
        (JR/invoke-super 'IndexedAnimation this :jm_setAlpha_1 @l_alpha)
        (if @l_changed
            (do
            (JR/invoke this :jm_updateModifiers_0)))))

    
(defn jm_setScale_2 [this p_scaleX p_scaleY]
  (let [ l_scaleX (volatile! p_scaleX) l_scaleY (volatile! p_scaleY)]
        nil))

    
(defn jm_setMaxScale_2 [this p_maxScaleX p_maxScaleY]
  (let [ l_maxScaleX (volatile! p_maxScaleX) l_maxScaleY (volatile! p_maxScaleY)]
        nil))

    
(defn jm_updateModifiers_0 [this]
  (let []
        nil))

    
(defn jm_paint_1 [this p_g]
  (let [ l_g (volatile! p_g)]
        (JR/invoke @l_g :jm_drawRGB_8 (JR/fget this :pixelBuffer) 0 (JR/fget this :width) 0 0 (JR/fget this :width) (JR/fget this :height) true)))



