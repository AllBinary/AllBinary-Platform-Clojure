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
;; package org.allbinary.game.ag.layer.hud.basic.time

(ns HudTimer)

(JR/register 'HudTimer nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :startTime 0)
  (JR/fset this :hundredthTime 0)
  (JR/fset this :maxTime 0)
  (JR/fset this :modifier 0)
  (JR/fset this :hundrethsString nil)
  (JR/fset this :totalDigits 0)
  (JR/fset this :primitiveLongUtil nil)
  (JR/fset this :MAX nil)
  (JR/fset this :gameTickTimeDelayHelper nil)
    (JR/fset this :startTime (unchecked-int (unchecked-negate (JR/c2i 1))))
    (JR/fset this :hundrethsString (JR/fget (JR/scall 'PrimitiveLongSingleton :jm_getInstance_0) :ZERO))
    (JR/fset this :totalDigits 1)
    (JR/fset this :MAX (JR/afrom "CHAR" 1 [\L \O \L]))
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_maxTime]
  (let [ l_maxTime (volatile! p_maxTime)]
    nil (jinitfields this)
        (JR/fset this :primitiveLongUtil (JR/scall 'PrimitiveLongUtil :jm_createPowerOfTen_1 @l_maxTime))
        (JR/fset this :maxTime @l_maxTime))
  this)

(defn jnew_1 [p_maxTime ]
  (let [o (JR/alloc 'HudTimer)] (jinit_1 o p_maxTime) o))

    
(defn jm_start_0 [this]
  (let []
        (JR/fset this :hundredthTime 0)
        (JR/fset this :startTime (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime))))

    
(defn jm_get_0 [this]
  (let []
        (JR/fget this :hundredthTime)))

    
(defn jm_update_0 [this]
  (let [ l_lastLowerTime (volatile! nil) l_currentTime (volatile! nil)]
        (vreset! l_lastLowerTime (JR/fget this :hundredthTime))
        (vreset! l_currentTime (unchecked-subtract (unchecked-add (JR/fget this :modifier) (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime)) (JR/fget this :startTime)))
        (if (< @l_currentTime 0)
            (do
            (vreset! l_currentTime 0)))
        (JR/fset this :hundredthTime (JR/ldiv @l_currentTime 100))
        (if (>= (JR/fget this :hundredthTime) (JR/fget this :maxTime))
            (do
            (if (> (JR/fget this :startTime) 0)
                (do
                (JR/fset this :hundrethsString (JR/fget this :MAX)))))
            (if (not (== @l_lastLowerTime (JR/fget this :hundredthTime)))
            (do
            (JR/fset this :hundrethsString (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCharArray_1 (JR/i32 (JR/fget this :hundredthTime))))
            (JR/fset this :totalDigits (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCurrentTotalDigits_0)))))))

    
(defn jm_reduce_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :modifier (unchecked-subtract (JR/fget this :modifier) @l_value))))

    
(defn jm_add_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (JR/fset this :modifier (unchecked-add (JR/fget this :modifier) @l_value))))

    
(defn jm_getTimeChars_0 [this]
  (let []
        (JR/fget this :hundrethsString)))

    
(defn jm_getCurrentTotalDigits_0 [this]
  (let []
        (JR/fget this :totalDigits)))



