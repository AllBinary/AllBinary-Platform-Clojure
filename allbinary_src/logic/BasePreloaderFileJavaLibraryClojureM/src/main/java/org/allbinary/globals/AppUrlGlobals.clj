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
;; package org.allbinary.globals

;;implements
(ns AppUrlGlobals)

(JR/register 'AppUrlGlobals 'UrlGlobalsInterface '[])

(def jsv_NULL_APP_URL_GLOBALS (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_APP_URL_GLOBALS [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_APP_URL_GLOBALS)
(defn jstatic_set_NULL_APP_URL_GLOBALS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_APP_URL_GLOBALS v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_APP_URL_GLOBALS (AppUrlGlobals/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :path nil)
    (JR/fset this :path (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

(defn jinit_0 [this]
  (UrlGlobalsInterface/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AppUrlGlobals)] (jinit_0 o) o))

    
(defn jm_isTestingMode_0 [this]
  (let []
        false))

    
(defn jm_getWebappPath_0 [this]
  (let []
        (JR/fget this :path)))

    
(defn jm_setWebappPath_1 [this p_path]
  (let [ l_path (volatile! p_path)]
        (JR/fset this :path @l_path)
        (if (not (or (JR/invoke (JR/fget this :path) :jm_endsWith_1 "\\") (JR/invoke (JR/fget this :path) :jm_endsWith_1 "/")))
            (do
            (JR/fset this :path (str (JR/s (JR/fget this :path)) (JR/s "\\")))))))

    
(defn jm_getTestHtmlPath_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_getMainPath_0 [this]
  (let []
        (JR/fget this :path)))



