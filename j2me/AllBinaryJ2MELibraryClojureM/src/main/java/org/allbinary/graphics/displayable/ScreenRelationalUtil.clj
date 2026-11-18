;; Generated Code Do Not Modify
;; package org.allbinary.graphics.displayable

(ns ScreenRelationalUtil)

(JR/register 'ScreenRelationalUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ScreenRelationalUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ScreenRelationalUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ScreenRelationalUtil/jstatic_instance)))

    
(defn jm_getScaleImage_1 [this p_image]
  (let [ l_image (volatile! p_image)]
        (JR/invoke this :jm_getScaleWH_2 (JR/invoke @l_image :jm_getWidth_0) (JR/invoke @l_image :jm_getHeight_0))))

    
(defn jm_getScaleWH_2 [this p_aWidth p_aHeight]
  (let [ l_aWidth (volatile! p_aWidth) l_aHeight (volatile! p_aHeight)]
        (JR/invoke this :jm_getScaleWHA_3 @l_aWidth @l_aHeight 20)))

    
(defn jm_getScaleWHA_3 [this p_aWidth p_aHeight p_add]
  (let [ l_aWidth (volatile! p_aWidth) l_aHeight (volatile! p_aHeight) l_add (volatile! p_add) l_displayInfoSingleton (volatile! nil) l_last (volatile! nil) l_width (volatile! nil) l_height (volatile! nil) l_largestSize (volatile! nil) l_scale (volatile! nil)]
        (vreset! l_displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_last (JR/invoke @l_displayInfoSingleton :jm_getLast_0))
        (vreset! l_width (JR/f32 (JR/aget* @l_last (JR/fget @l_displayInfoSingleton :WIDTH))))
        (vreset! l_height (JR/f32 (JR/aget* @l_last (JR/fget @l_displayInfoSingleton :HEIGHT))))
        (vreset! l_largestSize @l_width)
        (if (< @l_largestSize @l_height)
            (do
            (vreset! l_largestSize @l_height)))
        (vreset! l_scale (/ (double @l_largestSize) (JR/f32 @l_aWidth)))
        @l_scale))

    
(defn jm_getScaledHeight_2 [this p_aWidth p_aHeight]
  (let [ l_aWidth (volatile! p_aWidth) l_aHeight (volatile! p_aHeight)]
        (JR/d2i (* (JR/invoke this :jm_getScaleWH_2 @l_aWidth @l_aHeight) (JR/f32 @l_aHeight)))))

    
(defn jm_getScaledHeightAdd_3 [this p_aWidth p_aHeight p_add]
  (let [ l_aWidth (volatile! p_aWidth) l_aHeight (volatile! p_aHeight) l_add (volatile! p_add)]
        (JR/d2i (* (JR/invoke this :jm_getScaleWHA_3 @l_aWidth @l_aHeight @l_add) (JR/f32 @l_aHeight)))))



