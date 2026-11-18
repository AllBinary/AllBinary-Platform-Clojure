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
;; package org.allbinary.graphics.displayable.command

(ns MyCommandsFactory)

(JR/register 'MyCommandsFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (MyCommandsFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NO_COMMAND nil)
  (JR/fset this :GAUGE_CHANGE nil)
  (JR/fset this :SET_DISPLAYABLE nil)
  (JR/fset this :PAUSE_COMMAND nil)
  (JR/fset this :RESUME_COMMAND nil)
    (JR/fset this :NO_COMMAND (Command/jnew_4 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (unchecked-int (unchecked-negate (JR/c2i 1))) (unchecked-int (unchecked-negate (JR/c2i 1)))))
    (JR/fset this :GAUGE_CHANGE (Command/jnew_4 "GAUGE_CHANGE" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "ITEM") 1))
    (JR/fset this :SET_DISPLAYABLE (Command/jnew_4 "Display" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 2))
    (JR/fset this :PAUSE_COMMAND (Command/jnew_4 "Pause" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 0))
    (JR/fset this :RESUME_COMMAND (Command/jnew_4 "Resume" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/sget 'Command "SCREEN") 0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (MyCommandsFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MyCommandsFactory)] (jinit_0 o) o))



