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

(ns URLGLOBALS)

(JR/register 'URLGLOBALS nil '[])

(def jsv_urlGlobalsInterface (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_urlGlobalsInterface [] (JR/ensure-init jclinit-state jclinit) @jsv_urlGlobalsInterface)
(defn jstatic_set_urlGlobalsInterface [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_urlGlobalsInterface v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_urlGlobalsInterface (JR/sget 'AppUrlGlobals "NULL_APP_URL_GLOBALS"))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'URLGLOBALS)] (jinit_0 o) o))

    
(defn jm_init_1 [p_urlGlobalsInterface]
  (let [this nil l_urlGlobalsInterface (volatile! p_urlGlobalsInterface)]
        (URLGLOBALS/jstatic_set_urlGlobalsInterface @l_urlGlobalsInterface)))

    
(defn jm_isTestingMode_0 []
  (let [this nil]
        (JR/invoke (URLGLOBALS/jstatic_urlGlobalsInterface) :jm_isTestingMode_0)))

    
(defn jm_getWebappPath_0 []
  (let [this nil]
        (JR/invoke (URLGLOBALS/jstatic_urlGlobalsInterface) :jm_getWebappPath_0)))

    
(defn jm_getTestHtmlPath_0 []
  (let [this nil]
        (JR/invoke (URLGLOBALS/jstatic_urlGlobalsInterface) :jm_getTestHtmlPath_0)))

    
(defn jm_getMainPath_0 []
  (let [this nil]
        (JR/invoke (URLGLOBALS/jstatic_urlGlobalsInterface) :jm_getMainPath_0)))



