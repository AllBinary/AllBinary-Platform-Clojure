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
;; package org.allbinary

;;import org.allbinary.logic.communication.log.PreLogUtil;
(ns AppletUtil)

(JR/register 'AppletUtil nil '[])

(def jsv_applet (atom false))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_applet [] (JR/ensure-init jclinit-state jclinit) @jsv_applet)
(defn jstatic_set_applet [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_applet v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_applet false)
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AppletUtil)] (jinit_0 o) o))

    
(defn jm_setApplet_0 []
  (let [this nil]
        (AppletUtil/jstatic_set_applet true)))

    
(defn jm_isAppletLoader_1 [p_anyType]
  (let [this nil l_anyType (volatile! p_anyType)]
        (AppletUtil/jstatic_applet)))



