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
;; package org.allbinary.game.ag.layer.hud.basic

(ns PlayerGameNotificationHud)

(JR/register 'PlayerGameNotificationHud 'GameNotificationHud '[UpdateMyFontInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :gameTickTimeDelayHelper nil)
  (JR/fset this :EMPTY_STRING nil)
  (JR/fset this :displayInfo nil)
  (JR/fset this :timeDelayHelper nil)
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :gameNotification nil)
  (JR/fset this :permanentGameNotification nil)
  (JR/fset this :setAndRemoveProcessor nil)
  (JR/fset this :nextUnremoveableProcessor nil)
  (JR/fset this :processor nil)
  (JR/fset this :PERMANENT_GAME_NOTIFICATION nil)
  (JR/fset this :lastString nil)
  (JR/fset this :string nil)
  (JR/fset this :point nil)
  (JR/fset this :width 0)
    (JR/fset this :gameTickTimeDelayHelper (JR/scall 'GameTickTimeDelayHelperFactory :jm_getInstance_0))
    (JR/fset this :EMPTY_STRING (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
    (JR/fset this :timeDelayHelper (TimeDelayHelper/jnew_1 0))
    (JR/fset this :gameNotification (GameNotification/jnew_0))
    (JR/fset this :permanentGameNotification (GameNotification/jnew_0))
    (JR/fset this :setAndRemoveProcessor (SetAndRemoveProcessor/jnew_1 this))
    (JR/fset this :nextUnremoveableProcessor (NextUnremoveableProcessor/jnew_1 this))
    (JR/fset this :processor (JR/scall 'Processor :jm_getInstance_0))
    (JR/fset this :PERMANENT_GAME_NOTIFICATION "Permanent Game Notification: ")
    (JR/fset this :lastString (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :string (JR/fget this :EMPTY_STRING))
    (JR/fset this :point (JR/sget 'CustomGPoint "NULL_CUSTOM_POINT"))
  this)

    
(defn jinit_4 [this p_location p_direction p_bufferZone p_basicColor]
  (let [ l_location (volatile! p_location) l_direction (volatile! p_direction) l_bufferZone (volatile! p_bufferZone) l_basicColor (volatile! p_basicColor) l_gameNotificationEventHandler (volatile! nil)]
        (GameNotificationHud/jinit_4 this @l_location @l_direction @l_bufferZone @l_basicColor) (jinitfields this)
        (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 0))
        (vreset! l_gameNotificationEventHandler (JR/scall 'GameNotificationEventHandler :jm_getInstance_0))
        (JR/invoke @l_gameNotificationEventHandler :jm_removeAllListeners_0)
        (JR/invoke @l_gameNotificationEventHandler :jm_addListenerInterface_1 this))
  this)

(defn jnew_4 [p_location p_direction p_bufferZone p_basicColor ]
  (let [o (JR/alloc 'PlayerGameNotificationHud)] (jinit_4 o p_location p_direction p_bufferZone p_basicColor) o))

    
(defn jm_updateMeasurement_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_font (volatile! nil) l_logUtil (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (JR/invoke-super 'GameNotificationHud this :jm_updateMeasurement_1 @l_graphics)
            (vreset! l_font (JR/invoke @l_graphics :jm_getFont_0))
            (JR/fset this :width (JR/invoke @l_font :jm_stringWidth_1 (JR/fget this :string)))
            (JR/invoke (JR/fget this :processor) :jm_process_0)
            (JR/fset this :processor (JR/scall 'Processor :jm_getInstance_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke @l_logUtil :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :UPDATE) @l_e)) :else (throw jt)))))))

    
(defn jm_getPoint_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        (JR/fset this :point (JR/scall 'CustomGPoint :jm_getInstance3_2 0 0))
        (JR/invoke (JR/fget this :point) :jm_setX_1 @l_x)
        (JR/invoke (JR/fget this :point) :jm_setY_1 @l_y)
        (JR/fget this :point)))

    
(defn jm_add_4 [this p_string p_seconds p_basicColor p_permanent]
  (let [ l_string (volatile! p_string) l_seconds (volatile! p_seconds) l_basicColor (volatile! p_basicColor) l_permanent (volatile! p_permanent)]
        (if (JR/invoke @l_permanent :jm_booleanValue_0)
            (do
            (if (not (JR/eq (JR/fget this :lastString) @l_string))
                (do
                (JR/fset this :lastString @l_string)
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :PERMANENT_GAME_NOTIFICATION)) :jm_append_1 @l_string)) this (JR/fget (JR/fget this :commonStrings) :ADD))))
            (JR/invoke (JR/fget this :permanentGameNotification) :jm_add_3 @l_string @l_seconds @l_basicColor)
            (JR/invoke (JR/fget this :circularIndexUtil) :jm_setSize_1 (JR/invoke (JR/fget this :permanentGameNotification) :jm_getSize_0)))
            (do
            (JR/invoke (JR/fget this :gameNotification) :jm_add_3 @l_string @l_seconds @l_basicColor)))))

    
(defn jm_processTick_0 [this]
  (let [ l_gameAdState (volatile! nil)]
        (if (JR/invoke (JR/fget this :timeDelayHelper) :jm_isTime_1 (JR/fget (JR/fget this :gameTickTimeDelayHelper) :startTime))
            (do
            (vreset! l_gameAdState (JR/invoke (JR/scall 'GameAdStateFactory :jm_getInstance_0) :jm_getCurrentInstance_0))
            (if (JR/invoke @l_gameAdState :jm_isShowingAtLocation_1 (JR/invoke this :jm_getLocation_0))
                (do
                (JR/fset this :offsetY (unchecked-int (unchecked-negate (JR/c2i 54)))))
                (do
                (JR/fset this :offsetY 0)))
            (if (> (JR/invoke (JR/fget this :gameNotification) :jm_getSize_0) 0)
                (do
                (JR/invoke this :jm_setAndRemove_0))
                (if (> (JR/invoke (JR/fget this :permanentGameNotification) :jm_getSize_0) 0)
                (do
                (JR/invoke this :jm_setNextUnremoveable_0))
                (do
                (JR/fset this :string (JR/fget this :EMPTY_STRING)))))))))

    
(defn jm_setAndRemove_0 [this]
  (let []
        (JR/fset this :string (JR/invoke (JR/fget (JR/fget this :gameNotification) :stringList) :jm_removeAt_1 0))
        (JR/fset this :processor (JR/fget this :setAndRemoveProcessor))))

    
(defn jm_setAndRemoveProcess_0 [this]
  (let [ l_time (volatile! nil) l_iTime (volatile! nil)]
        (JR/invoke this :jm_setX_1 (JR/ishr (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :displayInfo) :jm_getLastWidth_0) (JR/fget this :width))) 1))
        (JR/invoke (JR/fget this :point) :jm_setX_1 (JR/invoke this :jm_getX_0))
        (JR/invoke (JR/fget this :point) :jm_setY_1 (JR/invoke this :jm_getY_0))
        (vreset! l_time (JR/invoke (JR/fget (JR/fget this :gameNotification) :timeList) :jm_removeAt_1 0))
        (vreset! l_iTime (unchecked-int (unchecked-multiply (JR/invoke @l_time :jm_intValue_0) 1000)))
        (if (== @l_iTime 0)
            (do
            (vreset! l_iTime 500)))
        (JR/fset (JR/fget this :timeDelayHelper) :delay @l_iTime)
        (JR/invoke this :jm_setBasicColorP_1 (JR/invoke (JR/fget (JR/fget this :gameNotification) :colorList) :jm_removeAt_1 0))))

    
(defn jm_setNextUnremoveable_0 [this]
  (let [ l_index (volatile! nil)]
        (vreset! l_index (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (JR/fset this :string (JR/aget* (JR/fget (JR/fget (JR/fget this :permanentGameNotification) :stringList) :objectArray) @l_index))
        (JR/fset this :processor (JR/fget this :nextUnremoveableProcessor))))

    
(defn jm_setNextUnremoveableProcess_0 [this]
  (let [ l_index (volatile! nil) l_time (volatile! nil)]
        (vreset! l_index (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (JR/invoke this :jm_setX_1 (JR/ishr (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :displayInfo) :jm_getLastWidth_0) (JR/fget this :width))) 1))
        (JR/invoke (JR/fget this :point) :jm_setX_1 (JR/invoke this :jm_getX_0))
        (JR/invoke (JR/fget this :point) :jm_setY_1 (JR/invoke this :jm_getY_0))
        (vreset! l_time (JR/aget* (JR/fget (JR/fget (JR/fget this :permanentGameNotification) :timeList) :objectArray) @l_index))
        (JR/fset (JR/fget this :timeDelayHelper) :delay (unchecked-int (unchecked-multiply (JR/invoke @l_time :jm_intValue_0) 1000)))
        (JR/invoke this :jm_setBasicColorP_1 (JR/aget* (JR/fget (JR/fget (JR/fget this :permanentGameNotification) :colorList) :objectArray) @l_index))
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :gameNotification) :jm_clear_0)
        (JR/invoke (JR/fget this :permanentGameNotification) :jm_clear_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        (JR/invoke (JR/fget this :myFontProcessor) :jm_process_1 @l_graphics)
        (JR/invoke-super 'GameNotificationHud this :jm_paintString_2 @l_graphics (JR/fget this :string))))



