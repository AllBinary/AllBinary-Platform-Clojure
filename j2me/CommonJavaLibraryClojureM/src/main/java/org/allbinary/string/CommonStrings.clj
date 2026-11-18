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

(ns CommonStrings)

(JR/register 'CommonStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CommonStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :EMPTY nil)
  (JR/fset this :CREATE_IMAGE nil)
  (JR/fset this :PLEASE_WAIT nil)
  (JR/fset this :PLEASE_WAIT_FOR_SERVER nil)
  (JR/fset this :PERIODS nil)
  (JR/fset this :LOADING nil)
  (JR/fset this :CONSTRUCTOR nil)
  (JR/fset this :START nil)
  (JR/fset this :END nil)
  (JR/fset this :EXCEPTION nil)
  (JR/fset this :EXCEPTION_LABEL nil)
  (JR/fset this :CLEANUP nil)
  (JR/fset this :INIT nil)
  (JR/fset this :CLOSE nil)
  (JR/fset this :UP nil)
  (JR/fset this :DOWN nil)
  (JR/fset this :LEFT nil)
  (JR/fset this :RIGHT nil)
  (JR/fset this :DIRECTION_NAME nil)
  (JR/fset this :CREATE nil)
  (JR/fset this :REMOVE nil)
  (JR/fset this :UPDATE nil)
  (JR/fset this :DELETE nil)
  (JR/fset this :delete nil)
  (JR/fset this :LOAD nil)
  (JR/fset this :SAVE nil)
  (JR/fset this :ADD nil)
  (JR/fset this :DROP nil)
  (JR/fset this :INSERT nil)
  (JR/fset this :VISIT nil)
  (JR/fset this :START_METHOD_NAME nil)
  (JR/fset this :END_METHOD_NAME nil)
  (JR/fset this :GET nil)
  (JR/fset this :PROCESS nil)
  (JR/fset this :GET_INSTANCE nil)
  (JR/fset this :GET_LIST nil)
  (JR/fset this :RUN nil)
  (JR/fset this :START_RUNNABLE nil)
  (JR/fset this :RUNNING nil)
  (JR/fset this :END_RUNNABLE nil)
  (JR/fset this :DISABLE nil)
  (JR/fset this :ENABLE nil)
  (JR/fset this :SUCCESS nil)
  (JR/fset this :FAILURE nil)
  (JR/fset this :NOT_IMPLEMENTED nil)
  (JR/fset this :UNKNOWN nil)
  (JR/fset this :ON_EVENT nil)
  (JR/fset this :IS_VALID nil)
  (JR/fset this :TOSTRING nil)
  (JR/fset this :ADD_LISTENER nil)
  (JR/fset this :REMOVE_LISTENER nil)
  (JR/fset this :SIZE nil)
    (JR/fset this :EMPTY "Empty")
    (JR/fset this :CREATE_IMAGE "createImage")
    (JR/fset this :PLEASE_WAIT "Please Wait")
    (JR/fset this :PLEASE_WAIT_FOR_SERVER "Please Wait Getting Data From Server...")
    (JR/fset this :PERIODS "...")
    (JR/fset this :LOADING "Loading...")
    (JR/fset this :CONSTRUCTOR "Constructor")
    (JR/fset this :START "Start")
    (JR/fset this :END "End")
    (JR/fset this :EXCEPTION "Exception")
    (JR/fset this :EXCEPTION_LABEL "Exception: ")
    (JR/fset this :CLEANUP "cleanup")
    (JR/fset this :INIT "init")
    (JR/fset this :CLOSE "close")
    (JR/fset this :UP "up")
    (JR/fset this :DOWN "down")
    (JR/fset this :LEFT "left")
    (JR/fset this :RIGHT "right")
    (JR/fset this :DIRECTION_NAME (JR/afrom "String" 1 [(JR/fget this :DOWN) (JR/fget this :LEFT) (JR/fget this :RIGHT) (JR/fget this :UP)]))
    (JR/fset this :CREATE "Create")
    (JR/fset this :REMOVE "Remove")
    (JR/fset this :UPDATE "Update")
    (JR/fset this :DELETE "Delete")
    (JR/fset this :delete "delete")
    (JR/fset this :LOAD "load")
    (JR/fset this :SAVE "save")
    (JR/fset this :ADD "Add")
    (JR/fset this :DROP "Drop")
    (JR/fset this :INSERT "Insert")
    (JR/fset this :VISIT "visit")
    (JR/fset this :START_METHOD_NAME (JR/fget this :START))
    (JR/fset this :END_METHOD_NAME "end")
    (JR/fset this :GET "get")
    (JR/fset this :PROCESS "process")
    (JR/fset this :GET_INSTANCE "getInstance")
    (JR/fset this :GET_LIST "getList")
    (JR/fset this :RUN "run")
    (JR/fset this :START_RUNNABLE "Start Runnable")
    (JR/fset this :RUNNING "Running")
    (JR/fset this :END_RUNNABLE "End Runnable")
    (JR/fset this :DISABLE "disable")
    (JR/fset this :ENABLE "enable")
    (JR/fset this :SUCCESS "Command Success")
    (JR/fset this :FAILURE "Command Failed")
    (JR/fset this :NOT_IMPLEMENTED "Not Implemented")
    (JR/fset this :UNKNOWN "Unknown")
    (JR/fset this :ON_EVENT "onEvent")
    (JR/fset this :IS_VALID "isValid")
    (JR/fset this :TOSTRING "toString")
    (JR/fset this :ADD_LISTENER "addListener")
    (JR/fset this :REMOVE_LISTENER "removeListener")
    (JR/fset this :SIZE "size")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CommonStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CommonStrings/jstatic_instance)))



