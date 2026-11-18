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
;; package org.allbinary.game.input.event

(ns GameKeyEventFactory)

(JR/register 'GameKeyEventFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :TOUCH_BUTTON_SOURCE_ID 0)
  (JR/fset this :MOTION_GESTURE_SOURCE_ID 0)
  (JR/fset this :MAX_SOURCES 0)
  (JR/fset this :ARRAY nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :TOUCH_BUTTON_SOURCE_ID 2)
    (JR/fset this :MOTION_GESTURE_SOURCE_ID 3)
    (JR/fset this :MAX_SOURCES 4)
    (JR/fset this :ARRAY (JR/anew "Object" 2 (JR/fget this :MAX_SOURCES) (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX)))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (GameKeyEventFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (GameKeyEventFactory/jstatic_set_instance (GameKeyEventFactory/jnew_0))))
        (GameKeyEventFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GameKeyEventFactory)] (jinit_0 o) o))

    
(defn jm_init_0 [this]
  (let [ l_nullUtil (volatile! nil) l_size (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)]
        (vreset! l_nullUtil (JR/scall 'NullUtil :jm_getInstance_0))
        (vreset! l_size (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX))
        (do (vreset! l_index (JR/fget this :MAX_SOURCES))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (do (vreset! l_index2 @l_size)
                (JR/jfor false false (>= (JR/vinc l_index2 -1 :int false) 0) (do )
                (JR/aset* (JR/aget* (JR/fget this :ARRAY) @l_index) @l_index2 (JR/scall 'GameKeyEvent :jm_createEvent_3 (JR/fget @l_nullUtil :NULL_OBJECT) @l_index @l_index2))))))))

    
(defn jm_getInstanceForKey_2 [this p_anyType p_key]
  (let [ l_anyType (volatile! p_anyType) l_key (volatile! p_key) l_gameKeyEvent (volatile! nil)]
        (vreset! l_gameKeyEvent (JR/aget* (JR/aget* (JR/fget this :ARRAY) (JR/invoke @l_anyType :jm_getSourceId_0)) @l_key))
        @l_gameKeyEvent))

    
(defn jm_getInstanceForInput_2 [this p_anyType p_input]
  (let [ l_anyType (volatile! p_anyType) l_input (volatile! p_input) l_gameKeyEvent (volatile! nil)]
        (vreset! l_gameKeyEvent (JR/aget* (JR/aget* (JR/fget this :ARRAY) (JR/invoke @l_anyType :jm_getSourceId_0)) (JR/invoke @l_input :jm_getId_0)))
        @l_gameKeyEvent))



