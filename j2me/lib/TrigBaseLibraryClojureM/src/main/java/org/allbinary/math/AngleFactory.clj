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
;; package org.allbinary.math

(ns AngleFactory)

(JR/register 'AngleFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AngleFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :TOTAL_ANGLE 0)
  (JR/fset this :QUARTER_TOTAL_ANGLE 0)
  (JR/fset this :angleArray nil)
  (JR/fset this :NEGATIVE_ONE 0)
  (JR/fset this :NOT_ANGLE nil)
  (JR/fset this :DOWN nil)
  (JR/fset this :UP nil)
  (JR/fset this :LEFT nil)
  (JR/fset this :RIGHT nil)
  (JR/fset this :frameUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :TOTAL_ANGLE 360)
    (JR/fset this :QUARTER_TOTAL_ANGLE 90)
    (JR/fset this :angleArray (JR/anew "Object" 1 (JR/fget this :TOTAL_ANGLE)))
    (JR/fset this :NEGATIVE_ONE (JR/i16 (unchecked-int (unchecked-negate (JR/c2i 1)))))
    (JR/fset this :NOT_ANGLE (NamedAngle/jnew_2 (JR/fget this :NEGATIVE_ONE) (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :EMPTY)))
    (JR/fset this :frameUtil (JR/scall 'FrameUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AngleFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_commonPhoneStrings (volatile! nil) l_total (volatile! nil) l_index (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_commonPhoneStrings (JR/scall 'CommonPhoneStrings :jm_getInstance_0))
        (vreset! l_total (JR/i16 (JR/alen (JR/fget this :angleArray))))
        (JR/fset this :UP (NamedAngle/jnew_2 (JR/i16 0) (JR/fget @l_commonPhoneStrings :UP)))
        (JR/aset* (JR/fget this :angleArray) 0 (JR/fget this :UP))
        (do (vreset! l_index 1)
            (JR/jfor false false (< @l_index 90) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :angleArray) @l_index (Angle/jnew_1 (JR/i16 @l_index)))))
        (JR/fset this :RIGHT (NamedAngle/jnew_2 (JR/i16 90) (JR/fget @l_commonPhoneStrings :RIGHT)))
        (JR/aset* (JR/fget this :angleArray) 90 (JR/fget this :RIGHT))
        (do (vreset! l_index 91)
            (JR/jfor false false (< @l_index 180) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :angleArray) @l_index (Angle/jnew_1 (JR/i16 @l_index)))))
        (JR/fset this :DOWN (NamedAngle/jnew_2 (JR/i16 180) (JR/fget @l_commonPhoneStrings :DOWN)))
        (JR/aset* (JR/fget this :angleArray) 180 (JR/fget this :DOWN))
        (do (vreset! l_index 181)
            (JR/jfor false false (< @l_index 270) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :angleArray) @l_index (Angle/jnew_1 (JR/i16 @l_index)))))
        (JR/fset this :LEFT (NamedAngle/jnew_2 (JR/i16 270) (JR/fget @l_commonPhoneStrings :LEFT)))
        (JR/aset* (JR/fget this :angleArray) 270 (JR/fget this :LEFT))
        (do (vreset! l_index 271)
            (JR/jfor false false (< @l_index @l_total) (do (JR/vinc l_index 1 :int false))
            (JR/aset* (JR/fget this :angleArray) @l_index (Angle/jnew_1 (JR/i16 @l_index))))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AngleFactory)] (jinit_0 o) o))

    
(defn jm_getAt_1 [this p_index]
  (let [ l_index (volatile! p_index) l_adjustedIndex (volatile! nil)]
        (vreset! l_adjustedIndex (JR/invoke (JR/fget this :frameUtil) :jm_adjustAngleToFrameAngle_1 @l_index))
        (JR/aget* (JR/fget this :angleArray) @l_adjustedIndex)))

    
(defn jm_getClosestDirection_1 [this p_angle]
  (let [ l_angle (volatile! p_angle)](JR/method
        (if (or (and (>= @l_angle 315) (< @l_angle 360)) (and (>= @l_angle 0) (< @l_angle 45)))
            (do
            (JR/jreturn (JR/fget this :UP)))
            (if (and (>= @l_angle 45) (< @l_angle 135))
            (do
            (JR/jreturn (JR/fget this :RIGHT)))
            (if (and (>= @l_angle 135) (< @l_angle 225))
            (do
            (JR/jreturn (JR/fget this :DOWN)))
            (if (and (>= @l_angle 225) (< @l_angle 315))
            (do
            (JR/jreturn (JR/fget this :LEFT)))))))
        (JR/jthrow (new java.lang.RuntimeException)))))

    
(defn jm_getGeneralDirection_0 [this]
  (let []
        (JR/fget this :NOT_ANGLE)))

    
(defn jm_main_1 [p_args]
  (let [this nil l_args (volatile! p_args) l_stringMaker (volatile! nil) l_angleFactory (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_angleFactory (AngleFactory/jm_getInstance_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index 360) (do (JR/vinc l_index 1 :int false))
            (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_appendint_1 @l_index) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :FORWARD_SLASH)) :jm_appendshort_1 (JR/invoke (JR/invoke @l_angleFactory :jm_getClosestDirection_1 @l_index) :jm_getValue_0)) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :NEW_LINE))))
        (JR/invoke (JR/scall 'LogUtil :jm_getInstance_0) :jm_putF_3 (JR/to-string-of @l_stringMaker) "main" "main")))



