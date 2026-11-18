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
;; package org.allbinary.graphics.opengles

(ns CurrentDisplayableFactory)

(JR/register 'CurrentDisplayableFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CurrentDisplayableFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :canvasStrings nil)
  (JR/fset this :stringUtil nil)
  (JR/fset this :SET_DISPLAYABLE nil)
  (JR/fset this :SET_RUNNABLE nil)
  (JR/fset this :CLEAR_RUNNABLE nil)
  (JR/fset this :SET_USED_RUNNABLE nil)
  (JR/fset this :RUNNABLE nil)
  (JR/fset this :RUNNABLE_WAS_ALREADY_IN_USE nil)
  (JR/fset this :DEFAULT_CHILD_NAME_LIST nil)
  (JR/fset this :displayable nil)
  (JR/fset this :openGlReadydisplayable nil)
  (JR/fset this :runnable nil)
  (JR/fset this :usedRunnable nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :canvasStrings (JR/scall 'CanvasStrings :jm_getInstance_0))
    (JR/fset this :stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
    (JR/fset this :SET_DISPLAYABLE "setDisplayable")
    (JR/fset this :SET_RUNNABLE "setRunnable")
    (JR/fset this :CLEAR_RUNNABLE "clearRunnable")
    (JR/fset this :SET_USED_RUNNABLE "setUsedRunnable")
    (JR/fset this :RUNNABLE "Runnable: ")
    (JR/fset this :RUNNABLE_WAS_ALREADY_IN_USE "Runnable was already in use: ")
    (JR/fset this :DEFAULT_CHILD_NAME_LIST (BasicArrayListD/jnew_0))
    (JR/fset this :displayable (JR/scall 'NullDisplayable :jm_getInstance_0))
    (JR/fset this :openGlReadydisplayable (JR/scall 'NullDisplayable :jm_getInstance_0))
    (JR/fset this :runnable (JR/scall 'NullWaitGameRunnable :jm_getInstance_0))
    (JR/fset this :usedRunnable (JR/scall 'NullWaitGameRunnable :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CurrentDisplayableFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/invoke (JR/fget this :DEFAULT_CHILD_NAME_LIST) :jm_add_1 (JR/fget (JR/fget this :canvasStrings) :ABOUT))
        (JR/invoke (JR/fget this :DEFAULT_CHILD_NAME_LIST) :jm_add_1 (JR/fget (JR/fget this :canvasStrings) :OPTIONS))
        (JR/invoke (JR/fget this :DEFAULT_CHILD_NAME_LIST) :jm_add_1 (JR/sget 'GameInputMappingCanvas "NAME"))
        (JR/invoke (JR/fget this :DEFAULT_CHILD_NAME_LIST) :jm_add_1 (JR/sget 'GameInputMappingInstructionsCanvas "NAME"))
        (JR/invoke (JR/fget this :DEFAULT_CHILD_NAME_LIST) :jm_add_1 (JR/sget 'HighScoresCanvas "NAME")))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CurrentDisplayableFactory)] (jinit_0 o) o))

    
(defn jm_setMyCanvas_1 [this p_displayable]
  (let [ l_displayable (volatile! p_displayable)](JR/method
        (if (JR/instance-of (JR/fget this :displayable) 'MyCanvas)
            (do
            (if (JR/invoke @l_displayable :jm_hasChild_1 (JR/fget this :displayable))
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Child Displayable is already set for: ") :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_displayable))) this (JR/fget this :SET_DISPLAYABLE))
                (JR/jreturn)))))
        (JR/invoke this :jm_setDisplayable_1 @l_displayable))))

    
(defn jm_setDisplayable_1 [this p_displayable]
  (let [ l_displayable (volatile! p_displayable)]
        (JR/fset this :displayable @l_displayable)
        (JR/invoke this :jm_setOpenGlReadydisplayable_1 @l_displayable)))

    
(defn jm_setOpenGlReadydisplayable_1 [this p_openGlReadydisplayable]
  (let [ l_openGlReadydisplayable (volatile! p_openGlReadydisplayable)]
        (JR/fset this :openGlReadydisplayable @l_openGlReadydisplayable)
        (JR/invoke this :jm_update_0)))

    
(defn jm_getOpenGlReadydisplayable_0 [this]
  (let []
        (JR/fget this :openGlReadydisplayable)))

    
(defn jm_setRunnable_1 [this p_runnable]
  (let [ l_runnable (volatile! p_runnable)]
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :RUNNABLE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_runnable))) this (JR/fget this :SET_RUNNABLE))
        (JR/fset this :runnable @l_runnable)
        (if (not (JR/eq (JR/fget this :usedRunnable) (JR/fget this :runnable)))
            (do
            (JR/invoke this :jm_update_0))
            (do
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :RUNNABLE_WAS_ALREADY_IN_USE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_runnable))) this (JR/fget this :SET_RUNNABLE))))))

    
(defn jm_clearRunnable_0 [this]
  (let []
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :RUNNABLE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/scall 'NullRunnable :jm_getInstance_0)))) this (JR/fget this :CLEAR_RUNNABLE))
        (JR/invoke this :jm_setUsedRunnable_1 (JR/scall 'NullWaitGameRunnable :jm_getInstance_0))))

    
(defn jm_update_0 [this]
  (let [ l_commonSeps (volatile! nil) l_features (volatile! nil) l_stringMaker (volatile! nil)]
        (locking this
            (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (vreset! l_stringMaker (StringMaker/jnew_0))
            (JR/invoke @l_stringMaker :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :openGlReadydisplayable)))
            (if (and (JR/sget 'SWTUtil "isSWT") (not (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL))))
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/sget 'SWTUtil "SWT")) :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/fget this :RUNNABLE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/scall 'NullRunnable :jm_getInstance_0)))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                (JR/invoke this :jm_setUsedRunnable_1 (JR/scall 'NullWaitGameRunnable :jm_getInstance_0)))
                (if (JR/scall 'J2MEUtil :jm_isHTML_0)
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/fget (JR/scall 'GraphicsStrings :jm_getInstance_0) :HTML)) :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/fget this :RUNNABLE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :runnable)))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                (JR/invoke this :jm_setUsedRunnable_1 (JR/fget this :runnable)))
                (if (or (or (JR/instance-of (JR/fget this :openGlReadydisplayable) 'DemoCanvas) (JR/instance-of (JR/fget this :openGlReadydisplayable) 'AllBinaryGameCanvas)) (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL)))
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/to-string-of (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL))) :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/fget this :RUNNABLE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :runnable)))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                (JR/invoke this :jm_setUsedRunnable_1 (JR/fget this :runnable)))
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/fget this :RUNNABLE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/scall 'NullRunnable :jm_getInstance_0)))) this (JR/fget (JR/fget this :commonStrings) :UPDATE))
                (JR/invoke this :jm_setUsedRunnable_1 (JR/scall 'NullWaitGameRunnable :jm_getInstance_0)))))))))

    
(defn jm_getDisplayable_0 [this]
  (let []
        (JR/fget this :displayable)))

    
(defn jm_getUsedRunnable_0 [this]
  (let []
        (JR/fget this :usedRunnable)))

    
(defn jm_setUsedRunnable_1 [this p_usedRunnable]
  (let [ l_usedRunnable (volatile! p_usedRunnable)]
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :RUNNABLE)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 (JR/fget this :runnable))) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COLON_SEP)) :jm_append_1 (JR/invoke (JR/fget this :stringUtil) :jm_toString_1 @l_usedRunnable))) this (JR/fget this :SET_USED_RUNNABLE))
        (JR/fset this :usedRunnable @l_usedRunnable)))



