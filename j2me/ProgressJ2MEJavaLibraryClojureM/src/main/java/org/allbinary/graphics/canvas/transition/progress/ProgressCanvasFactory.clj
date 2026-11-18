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
;; package org.allbinary.graphics.canvas.transition.progress

(ns ProgressCanvasFactory)

(JR/register 'ProgressCanvasFactory nil '[])

(def jsv_PROGRESS_FORM_SCREEN (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_PROGRESS_FORM_SCREEN [] (JR/ensure-init jclinit-state jclinit) @jsv_PROGRESS_FORM_SCREEN)
(defn jstatic_set_PROGRESS_FORM_SCREEN [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_PROGRESS_FORM_SCREEN v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_PROGRESS_FORM_SCREEN (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ProgressCanvasFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (ProgressCanvasFactory/jstatic_PROGRESS_FORM_SCREEN) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (ProgressCanvasFactory/jstatic_set_PROGRESS_FORM_SCREEN (ProgressCanvas/jnew_3 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))))
        (ProgressCanvasFactory/jstatic_PROGRESS_FORM_SCREEN)))

    
(defn jm_getLazyInstance_0 []
  (let [this nil]
        (JR/scall 'NullPaintable :jm_getInstance_0)))



