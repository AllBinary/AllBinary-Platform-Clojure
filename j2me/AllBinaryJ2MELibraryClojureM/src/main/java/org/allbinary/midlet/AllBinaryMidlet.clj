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
;; package org.allbinary.midlet

(ns AllBinaryMidlet)

(JR/register 'AllBinaryMidlet 'MIDlet '[CommandListener])

(def jsv_NULL_ALLBINARY_MIDLET (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ALLBINARY_MIDLET [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ALLBINARY_MIDLET)
(defn jstatic_set_NULL_ALLBINARY_MIDLET [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ALLBINARY_MIDLET v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ALLBINARY_MIDLET (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :SET_DISPLAY nil)
  (JR/fset this :SETTING_ nil)
  (JR/fset this :_DISPLAY_ nil)
  (JR/fset this :SETTING_NO_TITLE nil)
  (JR/fset this :hashtable nil)
  (JR/fset this :midletDestroyed false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :SET_DISPLAY "setDisplay")
    (JR/fset this :SETTING_ "Setting: ")
    (JR/fset this :_DISPLAY_ " Display: ")
    (JR/fset this :SETTING_NO_TITLE "Setting: No Title, Display: ")
    (JR/fset this :hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
  this)

    
(defn jm_getNullInstance_0 []
  (let [this nil]
        (if (JR/eq (AllBinaryMidlet/jstatic_NULL_ALLBINARY_MIDLET) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (AllBinaryMidlet/jstatic_set_NULL_ALLBINARY_MIDLET (AllBinaryMidlet/jnew_0))))
        (AllBinaryMidlet/jstatic_NULL_ALLBINARY_MIDLET)))

    
(defn jinit_0 [this]
  (let []
    (MIDlet/jinit_0 this) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR) this "AllBinaryMidlet::AllBinaryMidlet"))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AllBinaryMidlet)] (jinit_0 o) o))

    
(defn jm_setDisplay_1 [this p_newDisplay]
  (let [ l_newDisplay (volatile! p_newDisplay) l_title (volatile! nil) l_display (volatile! nil)]
        (vreset! l_title (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
        (if (not (JR/eq @l_newDisplay (JR/sget 'NullCanvas "NULL_CANVAS")))
            (do
            (vreset! l_title (JR/invoke @l_newDisplay :jm_getTitle_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :SETTING_)) :jm_append_1 @l_title) :jm_append_1 (JR/fget this :_DISPLAY_)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_newDisplay))) this (JR/fget this :SET_DISPLAY))))
        (vreset! l_display (JR/invoke this :jm_getDisplay_0))
        (JR/invoke @l_display :jm_setCurrent_1 @l_newDisplay)))

    
(defn jm_getDisplay_0 [this]
  (let []
        (JR/scall 'Display :jm_getDisplay_1 this)))

    
(defn jm_getCurrentDisplayable_0 [this]
  (let []
        (JR/invoke (JR/scall 'Display :jm_getDisplay_1 this) :jm_getCurrent_0)))

    
(defn jm_setDestroyed_1 [this p_destroyed]
  (let [ l_destroyed (volatile! p_destroyed)]
        (JR/fset this :midletDestroyed @l_destroyed)))

    
(defn jm_isDestroyed_0 [this]
  (let []
        (JR/fget this :midletDestroyed)))

    
(defn jm_startApp_0 [this]
  (let []
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_pauseApp_0 [this]
  (let []
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_destroyAppInRunnable_2 [this p_unconditional p_isProgress]
  (let [ l_unconditional (volatile! p_unconditional) l_isProgress (volatile! p_isProgress)]
        nil))

    
(defn jm_destroyApp_1 [this p_unconditional]
  (let [ l_unconditional (volatile! p_unconditional) l_METHOD_NAME (volatile! nil) l_e (volatile! nil)]
        (vreset! l_METHOD_NAME "AllBinaryMidlet::destroyApp")
        (try (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this @l_METHOD_NAME)
            (JR/scall 'PreLogUtil :jm_put_3 (JR/scall 'Memory :jm_getInfo_0) this @l_METHOD_NAME)
            (JR/invoke this :jm_setDestroyed_1 true))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this @l_METHOD_NAME @l_e)) :else (throw jt)))))))

    
(defn jm_setStartStateHashtable_1 [this p_hashtable]
  (let [ l_hashtable (volatile! p_hashtable)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_hashtable))) this "setStartStateHashtable")
        (JR/fset this :hashtable @l_hashtable)))

    
(defn jm_getStartStateHashtable_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/fget this :hashtable)))) this "getStartStateHashtable")
        (JR/fget this :hashtable)))

    
(defn jm_getCurrentStateHashtable_0 [this]
  (let []
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this "getStateHashtable")
        (JR/fget (JR/scall 'StdUtil :jm_getInstance_0) :NULL_TABLE)))

    
(defn jm_commandAction_2 [this p_command p_displayable]
  (let [ l_command (volatile! p_command) l_displayable (volatile! p_displayable)]
        nil))



