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
;; package org.allbinary.graphics.displayable

(ns DisplayInfoSingleton)

(JR/register 'DisplayInfoSingleton nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (DisplayInfoSingleton/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonLabels nil)
  (JR/fset this :commonSeps nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :ORIENTATION nil)
  (JR/fset this :ADJUSTING_FOR_SCALING_IN_PORTRAIT nil)
  (JR/fset this :ADJUSTING_FOR_SCALING_IN_LANDSCAPE nil)
  (JR/fset this :last nil)
  (JR/fset this :lastHalf nil)
  (JR/fset this :full nil)
  (JR/fset this :top 0)
  (JR/fset this :left 0)
  (JR/fset this :xOffset 0)
  (JR/fset this :yOffset 0)
  (JR/fset this :scaleLargestTo 0.0)
  (JR/fset this :WIDTH 0)
  (JR/fset this :HEIGHT 0)
  (JR/fset this :CUSTOM_WIDTH 0)
  (JR/fset this :CUSTOM_HEIGHT 0)
  (JR/fset this :scalableListener nil)
  (JR/fset this :displayRatio 0.0)
  (JR/fset this :ratio 0.0)
  (JR/fset this :SET_LAST_SIZE_METHOD_NAME nil)
  (JR/fset this :FULL_WIDTH nil)
  (JR/fset this :FULL_HEIGHT nil)
  (JR/fset this :LAST_WIDTH nil)
  (JR/fset this :LAST_HEIGHT nil)
  (JR/fset this :PORTRAIT nil)
  (JR/fset this :LANDSCAPE nil)
  (JR/fset this :displayChangeEvent nil)
  (JR/fset this :FIRE_METHOD_NAME nil)
  (JR/fset this :REASON nil)
  (JR/fset this :UPDATE_FROM_ORIENTATION_CHANGE nil)
  (JR/fset this :list nil)
  (JR/fset this :DISPLAY_INFO nil)
  (JR/fset this :FULL nil)
  (JR/fset this :LAST nil)
  (JR/fset this :LAST_HALF nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
    (JR/fset this :commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :ORIENTATION "ORIENTATION")
    (JR/fset this :ADJUSTING_FOR_SCALING_IN_PORTRAIT "Adjusting for Scaling in portrait display ratio: ")
    (JR/fset this :ADJUSTING_FOR_SCALING_IN_LANDSCAPE "Adjusting for Scaling in landscape display ratio: ")
    (JR/fset this :last (JR/anew "INT" 1 4))
    (JR/fset this :lastHalf (JR/anew "INT" 1 4))
    (JR/fset this :full (JR/anew "INT" 1 4))
    (JR/fset this :WIDTH 0)
    (JR/fset this :HEIGHT 1)
    (JR/fset this :CUSTOM_WIDTH 2)
    (JR/fset this :CUSTOM_HEIGHT 3)
    (JR/fset this :scalableListener (BaseScalable/jnew_0))
    (JR/fset this :ratio 1.0)
    (JR/fset this :SET_LAST_SIZE_METHOD_NAME "setLastSize")
    (JR/fset this :FULL_WIDTH " FullWidth: ")
    (JR/fset this :FULL_HEIGHT " FullHeight: ")
    (JR/fset this :LAST_WIDTH "LastWidth: ")
    (JR/fset this :LAST_HEIGHT " LastHeight: ")
    (JR/fset this :PORTRAIT "Portrait")
    (JR/fset this :LANDSCAPE "Landscape")
    (JR/fset this :displayChangeEvent (DisplayChangeEvent/jnew_1 this))
    (JR/fset this :FIRE_METHOD_NAME "fire")
    (JR/fset this :REASON "reason: ")
    (JR/fset this :UPDATE_FROM_ORIENTATION_CHANGE "Updating from Orientation Change ")
    (JR/fset this :list (BasicArrayListD/jnew_0))
    (JR/fset this :DISPLAY_INFO "Display Info: ")
    (JR/fset this :FULL "full")
    (JR/fset this :LAST "last")
    (JR/fset this :LAST_HALF "lastHalf")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DisplayInfoSingleton/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let [ l_size (volatile! nil) l_index (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_size (JR/alen (JR/fget this :last)))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :last) @l_index 0)
            (JR/aset* (JR/fget this :lastHalf) @l_index 0)
            (JR/aset* (JR/fget this :full) @l_index 0)))
        (if (JR/scall 'AndroidUtil :jm_isAndroid_0)
            (do
            (JR/fset this :scaleLargestTo 640.0))
            (do
            (JR/fset this :scaleLargestTo 1080.0))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DisplayInfoSingleton)] (jinit_0 o) o))

    
(defn jm_getLastHalf_0 [this]
  (let []
        (JR/fget this :lastHalf)))

    
(defn jm_getLast_0 [this]
  (let []
        (JR/fget this :last)))

    
(defn jm_getFull_0 [this]
  (let []
        (JR/fget this :full)))

    
(defn jm_getScaleLargestTo_0 [this]
  (let []
        (JR/fget this :scaleLargestTo)))

    
(defn jm_setScaleLargestTo_1 [this p_scaleLargestTo]
  (let [ l_scaleLargestTo (volatile! p_scaleLargestTo)]
        (JR/fset this :scaleLargestTo (JR/f32 @l_scaleLargestTo))))

    
(defn jm_setLastSize_3 [this p_aLastWidth p_aLastHeight p_reason]
  (let [ l_aLastWidth (volatile! p_aLastWidth) l_aLastHeight (volatile! p_aLastHeight) l_reason (volatile! p_reason)]
        (if (or (not (== (JR/aget* (JR/fget this :full) (JR/fget this :WIDTH)) @l_aLastWidth)) (not (== (JR/aget* (JR/fget this :full) (JR/fget this :HEIGHT)) @l_aLastHeight)))
            (do
            (JR/invoke this :jm_setLastSizeForce_3 @l_aLastWidth @l_aLastHeight @l_reason)))))

    
(defn jm_setLastSizeForce_3 [this p_aLastWidth p_aLastHeight p_reason]
  (let [ l_aLastWidth (volatile! p_aLastWidth) l_aLastHeight (volatile! p_aLastHeight) l_reason (volatile! p_reason) l_stringMaker (volatile! nil) l_aFullWidth (volatile! nil) l_aFullHeight (volatile! nil) l_operatingSystemInterface (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 @l_reason)) this (JR/fget this :SET_LAST_SIZE_METHOD_NAME))
        (vreset! l_aFullWidth @l_aLastWidth)
        (vreset! l_aFullHeight @l_aLastHeight)
        (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :FULL_WIDTH)) :jm_appendint_1 @l_aFullWidth) :jm_append_1 (JR/fget this :FULL_HEIGHT)) :jm_appendint_1 @l_aFullHeight) :jm_append_1 (JR/to-string-of this))) this (JR/fget this :SET_LAST_SIZE_METHOD_NAME))
        (vreset! l_operatingSystemInterface (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0))
        (if (JR/invoke @l_operatingSystemInterface :jm_isOverScan_0)
            (do
            (vreset! l_aLastWidth (JR/idiv (unchecked-int (unchecked-multiply @l_aLastWidth (JR/invoke @l_operatingSystemInterface :jm_getOverScanXPercent_0))) 100))
            (vreset! l_aLastHeight (JR/idiv (unchecked-int (unchecked-multiply @l_aLastHeight (JR/invoke @l_operatingSystemInterface :jm_getOverScanYPercent_0))) 100))))
        (if (JR/invoke @l_operatingSystemInterface :jm_isScalable_0)
            (do
            (if (JR/invoke this :jm_isPortraitWH_2 @l_aLastWidth @l_aLastHeight)
                (do
                (if (> (JR/f32 @l_aLastHeight) (JR/fget this :scaleLargestTo))
                    (do
                    (JR/fset this :displayRatio (/ (double (JR/fget this :scaleLargestTo)) (JR/f32 @l_aLastHeight)))
                    (JR/fset this :ratio (/ (double (JR/f32 @l_aLastHeight)) (JR/fget this :scaleLargestTo)))
                    (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :ADJUSTING_FOR_SCALING_IN_PORTRAIT)) :jm_appendfloat_1 (JR/fget this :displayRatio))) this (JR/fget this :SET_LAST_SIZE_METHOD_NAME))
                    (vreset! l_aLastWidth (JR/d2i (* (JR/f32 @l_aLastWidth) (JR/fget this :displayRatio))))
                    (vreset! l_aLastHeight (JR/d2i (* (JR/f32 @l_aLastHeight) (JR/fget this :displayRatio))))
                    (JR/invoke (JR/fget this :scalableListener) :jm_scale_1 (JR/fget this :ratio)))
                    (do
                    (JR/fset this :ratio 1.0)
                    (JR/invoke (JR/fget this :scalableListener) :jm_scale_1 (JR/fget this :ratio)))))
                (do
                (if (> (JR/f32 @l_aLastWidth) (JR/fget this :scaleLargestTo))
                    (do
                    (JR/fset this :displayRatio (/ (double (JR/fget this :scaleLargestTo)) (JR/f32 @l_aLastWidth)))
                    (JR/fset this :ratio (/ (double (JR/f32 @l_aLastWidth)) (JR/fget this :scaleLargestTo)))
                    (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :ADJUSTING_FOR_SCALING_IN_LANDSCAPE)) :jm_appendfloat_1 (JR/fget this :displayRatio))) this (JR/fget this :SET_LAST_SIZE_METHOD_NAME))
                    (vreset! l_aLastWidth (JR/d2i (* (JR/f32 @l_aLastWidth) (JR/fget this :displayRatio))))
                    (vreset! l_aLastHeight (JR/d2i (* (JR/f32 @l_aLastHeight) (JR/fget this :displayRatio))))
                    (JR/invoke (JR/fget this :scalableListener) :jm_scale_1 (JR/fget this :ratio)))
                    (do
                    (JR/fset this :ratio 1.0)
                    (JR/invoke (JR/fget this :scalableListener) :jm_scale_1 (JR/fget this :ratio))))))))
        (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :LAST_WIDTH)) :jm_appendint_1 @l_aLastWidth) :jm_append_1 (JR/fget this :LAST_HEIGHT)) :jm_appendint_1 @l_aLastHeight)) this (JR/fget this :SET_LAST_SIZE_METHOD_NAME))
        (JR/fset this :xOffset (unchecked-int (unchecked-subtract @l_aFullWidth @l_aLastWidth)))
        (JR/fset this :yOffset (unchecked-int (unchecked-subtract @l_aFullHeight @l_aLastHeight)))
        (JR/fset this :left (JR/invoke (JR/fget this :scalableListener) :jm_getLeft_1 (JR/fget this :xOffset)))
        (JR/fset this :top (JR/invoke (JR/fget this :scalableListener) :jm_getTop_1 (JR/fget this :yOffset)))
        (JR/aset* (JR/fget this :full) (JR/fget this :WIDTH) @l_aFullWidth)
        (JR/aset* (JR/fget this :full) (JR/fget this :HEIGHT) @l_aFullHeight)
        (JR/aset* (JR/fget this :last) (JR/fget this :WIDTH) @l_aLastWidth)
        (JR/aset* (JR/fget this :lastHalf) (JR/fget this :WIDTH) (JR/ishr (JR/aget* (JR/fget this :last) (JR/fget this :WIDTH)) 1))
        (JR/aset* (JR/fget this :last) (JR/fget this :HEIGHT) @l_aLastHeight)
        (JR/aset* (JR/fget this :lastHalf) (JR/fget this :HEIGHT) (JR/ishr (JR/aget* (JR/fget this :last) (JR/fget this :HEIGHT)) 1))
        (JR/invoke (JR/scall 'SWTJOGLProcessor :jm_getInstance_0) :jm_setCustom_3 @l_aLastWidth @l_aLastHeight (JR/fget this :ratio))
        (JR/invoke this :jm_add_1 (JR/fget this :SET_LAST_SIZE_METHOD_NAME))))

    
(defn jm_isPortraitWH_2 [this p_lastWidth p_lastHeight]
  (let [ l_lastWidth (volatile! p_lastWidth) l_lastHeight (volatile! p_lastHeight)]
        (if (> @l_lastHeight @l_lastWidth)
            (do
            true)
            (do
            false))))

    
(defn jm_isPortrait_0 [this]
  (let []
        (JR/invoke this :jm_isPortraitWH_2 (JR/aget* (JR/fget this :last) (JR/fget this :WIDTH)) (JR/aget* (JR/fget this :last) (JR/fget this :HEIGHT)))))

    
(defn jm_add_1 [this p_reason]
  (let [ l_reason (volatile! p_reason) l_stringMaker (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :REASON)) :jm_append_1 @l_reason)) this (JR/fget this :FIRE_METHOD_NAME))
        (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/invoke this :jm_toStringAppend_1 @l_stringMaker) this (JR/fget this :FIRE_METHOD_NAME))
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_reason)))

    
(defn jm_process_0 [this]
  (let [ l_e (volatile! nil)]
        (try (do
            (if (> (JR/invoke (JR/fget this :list) :jm_size_0) 0)
                (do
                (JR/invoke this :jm_processForced_0)))
            (JR/invoke (JR/fget this :list) :jm_clear_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget this :FIRE_METHOD_NAME) @l_e)) :else (throw jt)))))))

    
(defn jm_processForced_0 [this]
  (let [ l_swtJOGLProcessor (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_swtJOGLProcessor (JR/scall 'SWTJOGLProcessor :jm_getInstance_0))
            (JR/invoke @l_swtJOGLProcessor :jm_clear_0)
            (JR/invoke (JR/scall 'DisplayChangeEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :displayChangeEvent))
            (JR/invoke (JR/scall 'LastDisplayChangeEventHandler :jm_getInstance_0) :jm_fireEvent_1 (JR/fget this :displayChangeEvent))
            (JR/invoke @l_swtJOGLProcessor :jm_onSurfaceChanged_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget this :FIRE_METHOD_NAME) @l_e)) :else (throw jt)))))))

    
(defn jm_update_2 [this p_displayable p_reason]
  (let [ l_displayable (volatile! p_displayable) l_reason (volatile! p_reason) l_aLastWidth (volatile! nil) l_aLastHeight (volatile! nil) l_aFullWidth (volatile! nil) l_aFullHeight (volatile! nil) l_stringMaker (volatile! nil) l_features (volatile! nil) l_openGLFeatureFactory (volatile! nil) l_operatingSystemInterface (volatile! nil)]
        (vreset! l_aLastWidth (JR/invoke @l_displayable :jm_getWidth_0))
        (vreset! l_aLastHeight (JR/invoke @l_displayable :jm_getHeight_0))
        (vreset! l_aFullWidth @l_aLastWidth)
        (vreset! l_aFullHeight @l_aLastHeight)
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 @l_reason) :jm_append_1 (JR/fget this :LAST_WIDTH)) :jm_appendint_1 @l_aLastWidth) :jm_append_1 (JR/fget this :LAST_HEIGHT)) :jm_appendint_1 @l_aLastHeight) :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE)) :jm_append_1 (JR/to-string-of this))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
        (if (and (> @l_aLastWidth 0) (> @l_aLastHeight 0))
            (do
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (vreset! l_openGLFeatureFactory (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0))
            (if (or (or (not (JR/invoke @l_features :jm_isDefault_1 (JR/fget @l_openGLFeatureFactory :OPENGL))) (not (== (JR/aget* (JR/fget this :last) (JR/fget this :WIDTH)) @l_aLastWidth))) (not (== (JR/aget* (JR/fget this :last) (JR/fget this :HEIGHT)) @l_aLastHeight)))
                (do
                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :UPDATE_FROM_ORIENTATION_CHANGE))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                (vreset! l_operatingSystemInterface (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0))
                (if (JR/invoke @l_operatingSystemInterface :jm_isOverScan_0)
                    (do
                    (vreset! l_aLastWidth (JR/idiv (unchecked-int (unchecked-multiply @l_aLastWidth (JR/invoke @l_operatingSystemInterface :jm_getOverScanXPercent_0))) 100))
                    (vreset! l_aLastHeight (JR/idiv (unchecked-int (unchecked-multiply @l_aLastHeight (JR/invoke @l_operatingSystemInterface :jm_getOverScanYPercent_0))) 100))))
                (if (JR/invoke @l_operatingSystemInterface :jm_isScalable_0)
                    (do
                    (if (JR/invoke this :jm_isPortraitWH_2 @l_aLastWidth @l_aLastHeight)
                        (do
                        (if (> (JR/f32 @l_aLastHeight) (JR/fget this :scaleLargestTo))
                            (do
                            (JR/fset this :displayRatio (/ (double (JR/fget this :scaleLargestTo)) (JR/f32 @l_aLastHeight)))
                            (JR/fset this :ratio (/ (double (JR/f32 @l_aLastHeight)) (JR/fget this :scaleLargestTo)))
                            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :ADJUSTING_FOR_SCALING_IN_PORTRAIT)) :jm_appendfloat_1 (JR/fget this :displayRatio))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                            (vreset! l_aLastWidth (JR/d2i (* (JR/f32 @l_aLastWidth) (JR/fget this :displayRatio))))
                            (vreset! l_aLastHeight (JR/d2i (* (JR/f32 @l_aLastHeight) (JR/fget this :displayRatio))))
                            (JR/invoke (JR/fget this :scalableListener) :jm_scale_1 (JR/fget this :ratio)))
                            (do
                            (JR/fset this :ratio 1.0)
                            (JR/invoke (JR/fget this :scalableListener) :jm_scale_1 (JR/fget this :ratio)))))
                        (do
                        (if (> (JR/f32 @l_aLastWidth) (JR/fget this :scaleLargestTo))
                            (do
                            (JR/fset this :displayRatio (/ (double (JR/fget this :scaleLargestTo)) (JR/f32 @l_aLastWidth)))
                            (JR/fset this :ratio (/ (double (JR/f32 @l_aLastWidth)) (JR/fget this :scaleLargestTo)))
                            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :ADJUSTING_FOR_SCALING_IN_LANDSCAPE)) :jm_appendfloat_1 (JR/fget this :displayRatio))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                            (vreset! l_aLastWidth (JR/d2i (* (JR/f32 @l_aLastWidth) (JR/fget this :displayRatio))))
                            (vreset! l_aLastHeight (JR/d2i (* (JR/f32 @l_aLastHeight) (JR/fget this :displayRatio))))
                            (JR/invoke (JR/fget this :scalableListener) :jm_scale_1 (JR/fget this :ratio)))
                            (do
                            (JR/fset this :ratio 1.0)
                            (JR/invoke (JR/fget this :scalableListener) :jm_scale_1 (JR/fget this :ratio))))))))
                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :UPDATE_FROM_ORIENTATION_CHANGE)) :jm_append_1 (JR/fget this :LAST_WIDTH)) :jm_appendint_1 @l_aLastWidth) :jm_append_1 (JR/fget this :LAST_HEIGHT)) :jm_appendint_1 @l_aLastHeight)) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                (JR/fset this :xOffset (unchecked-int (unchecked-subtract @l_aFullWidth @l_aLastWidth)))
                (JR/fset this :yOffset (unchecked-int (unchecked-subtract @l_aFullHeight @l_aLastHeight)))
                (JR/fset this :left (JR/invoke (JR/fget this :scalableListener) :jm_getLeft_1 (JR/fget this :xOffset)))
                (JR/fset this :top (JR/invoke (JR/fget this :scalableListener) :jm_getTop_1 (JR/fget this :yOffset)))
                (JR/aset* (JR/fget this :full) (JR/fget this :WIDTH) @l_aFullWidth)
                (JR/aset* (JR/fget this :full) (JR/fget this :HEIGHT) @l_aFullHeight)
                (JR/aset* (JR/fget this :last) (JR/fget this :WIDTH) @l_aLastWidth)
                (JR/aset* (JR/fget this :lastHalf) (JR/fget this :WIDTH) (JR/ishr (JR/aget* (JR/fget this :last) (JR/fget this :WIDTH)) 1))
                (JR/aset* (JR/fget this :last) (JR/fget this :HEIGHT) @l_aLastHeight)
                (JR/aset* (JR/fget this :lastHalf) (JR/fget this :HEIGHT) (JR/ishr (JR/aget* (JR/fget this :last) (JR/fget this :HEIGHT)) 1))
                (JR/invoke (JR/scall 'SWTJOGLProcessor :jm_getInstance_0) :jm_setCustom_3 @l_aLastWidth @l_aLastHeight (JR/fget this :ratio))
                (JR/invoke this :jm_add_1 (JR/fget (JR/fget this :commonStrings) :UPDATE))))))))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke this :jm_toStringAppend_1 @l_stringBuffer)))

    
(defn jm_toStringAppend_1 [this p_stringBuffer]
  (let [ l_stringBuffer (volatile! p_stringBuffer)]
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :DISPLAY_INFO))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :FULL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonLabels) :WIDTH_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/aget* (JR/fget this :full) (JR/fget this :WIDTH)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :FULL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonLabels) :HEIGHT_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/aget* (JR/fget this :full) (JR/fget this :HEIGHT)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :LAST))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonLabels) :WIDTH_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/aget* (JR/fget this :last) (JR/fget this :WIDTH)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :LAST))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonLabels) :HEIGHT_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/aget* (JR/fget this :last) (JR/fget this :HEIGHT)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :LAST_HALF))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonLabels) :WIDTH_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/aget* (JR/fget this :lastHalf) (JR/fget this :WIDTH)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :LAST_HALF))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonLabels) :HEIGHT_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/aget* (JR/fget this :lastHalf) (JR/fget this :HEIGHT)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :commonSeps) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (if (JR/invoke this :jm_isPortrait_0) (JR/fget this :PORTRAIT) (JR/fget this :LANDSCAPE)))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getTop_0 [this]
  (let []
        (JR/fget this :top)))

    
(defn jm_getLeft_0 [this]
  (let []
        (JR/fget this :left)))

    
(defn jm_getLastWidth_0 [this]
  (let []
        (JR/aget* (JR/fget this :last) (JR/fget this :WIDTH))))

    
(defn jm_getLastHeight_0 [this]
  (let []
        (JR/aget* (JR/fget this :last) (JR/fget this :HEIGHT))))

    
(defn jm_getLastHalfWidth_0 [this]
  (let []
        (JR/aget* (JR/fget this :lastHalf) (JR/fget this :WIDTH))))

    
(defn jm_getLastHalfHeight_0 [this]
  (let []
        (JR/aget* (JR/fget this :lastHalf) (JR/fget this :HEIGHT))))

    
(defn jm_getCustomLastWidth_0 [this]
  (let []
        (JR/aget* (JR/fget this :last) (JR/fget this :CUSTOM_WIDTH))))

    
(defn jm_getCustomLastHeight_0 [this]
  (let []
        (JR/aget* (JR/fget this :last) (JR/fget this :CUSTOM_HEIGHT))))

    
(defn jm_getRawLastWidth_0 [this]
  (let []
        (JR/aget* (JR/fget this :last) (JR/fget this :WIDTH))))

    
(defn jm_getRawLastHeight_0 [this]
  (let []
        (JR/aget* (JR/fget this :last) (JR/fget this :HEIGHT))))

    
(defn jm_setCustom_2 [this p_width p_height]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height)]
        (JR/aset* (JR/fget this :last) (JR/fget this :CUSTOM_WIDTH) @l_width)
        (JR/aset* (JR/fget this :lastHalf) (JR/fget this :CUSTOM_WIDTH) (JR/ishr (JR/aget* (JR/fget this :last) (JR/fget this :CUSTOM_WIDTH)) 1))
        (JR/aset* (JR/fget this :last) (JR/fget this :CUSTOM_HEIGHT) @l_height)
        (JR/aset* (JR/fget this :lastHalf) (JR/fget this :CUSTOM_HEIGHT) (JR/ishr (JR/aget* (JR/fget this :last) (JR/fget this :CUSTOM_HEIGHT)) 1))))

    
(defn jm_setScalableListener_1 [this p_scalableListener]
  (let [ l_scalableListener (volatile! p_scalableListener)]
        (JR/fset this :scalableListener @l_scalableListener)))

    
(defn jm_getScalableListener_0 [this]
  (let []
        (JR/fget this :scalableListener)))

    
(defn jm_getRatio_0 [this]
  (let []
        (JR/fget this :ratio)))

    
(defn jm_getDisplayRatio_0 [this]
  (let []
        (JR/fget this :displayRatio)))

    
(defn jm_setOffset_2 [this p_left p_top]
  (let [ l_left (volatile! p_left) l_top (volatile! p_top)]
        (JR/fset this :left @l_left)))

    
(defn jm_getxOffset_0 [this]
  (let []
        (JR/fget this :xOffset)))

    
(defn jm_getyOffset_0 [this]
  (let []
        (JR/fget this :yOffset)))



