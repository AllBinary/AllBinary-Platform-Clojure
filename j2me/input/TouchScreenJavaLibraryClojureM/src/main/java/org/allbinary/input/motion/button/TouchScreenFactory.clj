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
;; package org.allbinary.input.motion.button

(ns TouchScreenFactory)

(JR/register 'TouchScreenFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (TouchScreenFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :touch false)
  (JR/fset this :multiTouch false)
  (JR/fset this :multiTouchDistinct false)
  (JR/fset this :touchScreenType nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :touchScreenType (JR/fget (JR/scall 'TouchScreenTypesFactory :jm_getInstance_0) :NOTOUCH))
  this)

    
(defn jinit_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
    nil (jinitfields this)
        (try (do
            (JR/invoke this :jm_setTouch_1 true)
            (JR/invoke this :jm_setMultiTouch_1 false))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) (TouchScreenFactory/jstatic_SINGLETON) (JR/fget @l_commonStrings :GET_INSTANCE) @l_e)) :else (throw jt))))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchScreenFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TouchScreenFactory/jstatic_SINGLETON)))

    
(defn jm_setMultiTouch_1 [this p_multiTouch]
  (let [ l_multiTouch (volatile! p_multiTouch)]
        (JR/fset this :multiTouch @l_multiTouch)))

    
(defn jm_isMultiTouch_0 [this]
  (let []
        (JR/fget this :multiTouch)))

    
(defn jm_setTouch_1 [this p_touch]
  (let [ l_touch (volatile! p_touch)]
        (JR/fset this :touch @l_touch)))

    
(defn jm_isTouch_0 [this]
  (let []
        (JR/fget this :touch)))

    
(defn jm_setMultiTouchDistinct_1 [this p_multiTouchDistinct]
  (let [ l_multiTouchDistinct (volatile! p_multiTouchDistinct)]
        (JR/fset this :multiTouchDistinct @l_multiTouchDistinct)))

    
(defn jm_isMultiTouchDistinct_0 [this]
  (let []
        (JR/fget this :multiTouchDistinct)))

    
(defn jm_setTouchScreenType_1 [this p_touchScreenType]
  (let [ l_touchScreenType (volatile! p_touchScreenType)]
        (JR/fset this :touchScreenType @l_touchScreenType)))

    
(defn jm_getTouchScreenType_0 [this]
  (let []
        (JR/fget this :touchScreenType)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "TouchScreen: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke this :jm_isTouch_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " MultiTouch: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke this :jm_isMultiTouch_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " Distinct MultiTouch: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke this :jm_isMultiTouchDistinct_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " TouchScreenType: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/invoke this :jm_getTouchScreenType_0)))
        (JR/to-string-of @l_stringBuffer)))



