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
;; package org.allbinary.graphics.form.item

(ns LimitCommandsVisitor)

(JR/register 'LimitCommandsVisitor 'Visitor '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :isNotSmallDisplay false)
  this)

    
(defn jinit_0 [this]
  (let [ l_displayInfo (volatile! nil)]
    (Visitor/jinit_0 this) (jinitfields this)
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (JR/fset this :isNotSmallDisplay (or (and (JR/invoke @l_displayInfo :jm_isPortrait_0) (> (JR/invoke @l_displayInfo :jm_getLastHeight_0) (JR/fget (JR/scall 'ScreenInfo :jm_getInstance_0) :SMALL_WIDTH))) (and (not (JR/invoke @l_displayInfo :jm_isPortrait_0)) (> (JR/invoke @l_displayInfo :jm_getLastHeight_0) (JR/fget (JR/scall 'ScreenInfo :jm_getInstance_0) :SMALL_HEIGHT))))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LimitCommandsVisitor)] (jinit_0 o) o))

    
(defn jm_visit_1 [this p_anyType]
  (let [ l_anyType (volatile! p_anyType) l_command (volatile! nil) l_booleanFactory (volatile! nil)]
        (vreset! l_command @l_anyType)
        (vreset! l_booleanFactory (JR/scall 'BooleanFactory :jm_getInstance_0))
        (if (or (or (or (JR/fget this :isNotSmallDisplay) (JR/eq (JR/invoke @l_command :jm_getPriority_0) 1)) (JR/eq @l_command (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :EXIT_COMMAND))) (JR/eq @l_command (JR/fget (JR/scall 'GameCommandsFactory :jm_getInstance_0) :EXIT_WITHOUT_PROGRESS_COMMAND)))
            (do
            (JR/fget @l_booleanFactory :TRUE))
            (do
            (JR/fget @l_booleanFactory :FALSE)))))



