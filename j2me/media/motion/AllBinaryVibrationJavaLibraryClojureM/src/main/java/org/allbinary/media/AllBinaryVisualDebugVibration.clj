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
;; package org.allbinary.media

(ns AllBinaryVisualDebugVibration)

(JR/register 'AllBinaryVisualDebugVibration 'AllBinaryVibrationME '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :displayInfoSingleton nil)
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :VIBRATING nil)
  (JR/fset this :myFontProcessor nil)
  (JR/fset this :anchor 0)
  (JR/fset this :width 0)
    (JR/fset this :displayInfoSingleton (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 java.lang.Integer/MAX_VALUE))
    (JR/fset this :VIBRATING "Vibrating")
    (JR/fset this :myFontProcessor (UpdateMyFontProcessor/jnew_1 this))
    (JR/fset this :anchor (JR/sget 'Anchor "TOP_LEFT"))
  this)

(defn jinit_0 [this]
  (AllBinaryVibrationME/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryVisualDebugVibration)] (jinit_0 o) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil)]
        (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
        (JR/fset this :width (JR/invoke @l_font :jm_stringWidth_1 (JR/fget this :VIBRATING)))
        (JR/fset this :myFontProcessor (JR/scall 'MyFontProcessor :jm_getInstance_0))))

    
(defn jm_vibrate_3 [this p_duration p_type p_volume]
  (let [ l_duration (volatile! p_duration) l_type (volatile! p_type) l_volume (volatile! p_volume)]
        (JR/fset (JR/fget this :timeDelayHelper) :delay @l_duration)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTimeTNT_0)
            (do
            (JR/fset (JR/fget this :timeDelayHelper) :delay java.lang.Integer/MAX_VALUE)
            (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
            (JR/invoke @l_graphics :jm_drawString_4 (JR/fget this :VIBRATING) (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :displayInfoSingleton) :jm_getLastHalfWidth_0) (JR/ishr (JR/fget this :width) 1))) 0 (JR/fget this :anchor))))))



