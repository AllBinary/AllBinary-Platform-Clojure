;; Generated Code Do Not Modify
;; package org.allbinary.configuration

(ns ApplicationConfiguration)

(JR/register 'ApplicationConfiguration nil '[])

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
  (JR/fset this :fullscreen false)
  (JR/fset this :showTitleBar false)
  (JR/fset this :progressBarView false)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :fullscreen true)
    (JR/fset this :showTitleBar false)
    (JR/fset this :progressBarView false)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (ApplicationConfiguration/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (ApplicationConfiguration/jstatic_set_instance (ApplicationConfiguration/jnew_0))))
        (ApplicationConfiguration/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
    nil (jinitfields this)
        (try (do
            (JR/invoke this :jm_read_0))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :CONSTRUCTOR) @l_e)) :else (throw jt))))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ApplicationConfiguration)] (jinit_0 o) o))

    
(defn jm_read_0 [this]
  (let []
        (JR/invoke this :jm_setFullscreen_1 true)
        (JR/invoke this :jm_setProgressBarView_1 false)
        (JR/invoke this :jm_setShowTitleBar_1 false)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (str (JR/s "Read Configuration: ") (JR/s (JR/to-string-of this))) this "read")))

    
(defn jm_write_0 [this]
  (let []
        nil))

    
(defn jm_update_1 [this p_gameFeature]
  (let [ l_gameFeature (volatile! p_gameFeature) l_features (volatile! nil)]
        (if (JR/eq @l_gameFeature (JR/fget (JR/scall 'MainFeatureFactory :jm_getInstance_0) :FULL_SCREEN))
            (do
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (if (JR/invoke @l_features :jm_isFeature_1 @l_gameFeature)
                (do
                (if (not (JR/invoke this :jm_isFullscreen_0))
                    (do
                    (JR/invoke this :jm_setFullscreen_1 true)
                    (JR/invoke this :jm_write_0))))
                (do
                (if (JR/invoke this :jm_isFullscreen_0)
                    (do
                    (JR/invoke this :jm_setFullscreen_1 false)
                    (JR/invoke this :jm_write_0)))))))))

    
(defn jm_setFullscreen_1 [this p_fullscreen]
  (let [ l_fullscreen (volatile! p_fullscreen)]
        (JR/fset this :fullscreen @l_fullscreen)))

    
(defn jm_isFullscreen_0 [this]
  (let []
        (JR/fget this :fullscreen)))

    
(defn jm_setShowTitleBar_1 [this p_showTitleBar]
  (let [ l_showTitleBar (volatile! p_showTitleBar)]
        (JR/fset this :showTitleBar @l_showTitleBar)))

    
(defn jm_isShowTitleBar_0 [this]
  (let []
        (JR/fget this :showTitleBar)))

    
(defn jm_setProgressBarView_1 [this p_progressBarView]
  (let [ l_progressBarView (volatile! p_progressBarView)]
        (JR/fset this :progressBarView @l_progressBarView)))

    
(defn jm_isProgressBarView_0 [this]
  (let []
        (JR/fget this :progressBarView)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "isFullscreen: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke this :jm_isFullscreen_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " isProgressBarView: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke this :jm_isProgressBarView_0))
        (JR/invoke @l_stringBuffer :jm_append_1 " isShowTitleBar: ")
        (JR/invoke @l_stringBuffer :jm_appendboolean_1 (JR/invoke this :jm_isShowTitleBar_0))
        (JR/to-string-of @l_stringBuffer)))



