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
;; package org.allbinary.string

(ns CommonLabels)

(JR/register 'CommonLabels nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CommonLabels/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :WIDTH_LABEL nil)
  (JR/fset this :HEIGHT_LABEL nil)
  (JR/fset this :END_LABEL nil)
  (JR/fset this :TOTAL_LABEL nil)
  (JR/fset this :INDEX_LABEL nil)
  (JR/fset this :START_LABEL nil)
  (JR/fset this :COMMAND_LABEL nil)
  (JR/fset this :NAME_LABEL nil)
  (JR/fset this :START nil)
  (JR/fset this :ELAPSED nil)
  (JR/fset this :CURRENT nil)
  (JR/fset this :NEXT nil)
  (JR/fset this :ITEM_LABEL nil)
  (JR/fset this :RESULT_ nil)
  (JR/fset this :COLON_SEP nil)
    (JR/fset this :WIDTH_LABEL " Width: ")
    (JR/fset this :HEIGHT_LABEL " Height: ")
    (JR/fset this :END_LABEL "End: ")
    (JR/fset this :TOTAL_LABEL "Total: ")
    (JR/fset this :INDEX_LABEL "index: ")
    (JR/fset this :START_LABEL "Start: ")
    (JR/fset this :COMMAND_LABEL "Command: ")
    (JR/fset this :NAME_LABEL "Name: ")
    (JR/fset this :START (JR/fget this :START_LABEL))
    (JR/fset this :ELAPSED " Elapsed: ")
    (JR/fset this :CURRENT " Current: ")
    (JR/fset this :NEXT "Next")
    (JR/fset this :ITEM_LABEL "Item: ")
    (JR/fset this :RESULT_ "Result: ")
    (JR/fset this :COLON_SEP ": ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CommonLabels)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CommonLabels/jstatic_instance)))



