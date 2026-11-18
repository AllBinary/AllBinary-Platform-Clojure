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
;; package org.allbinary.logic.system.os

(ns OperatingSystems)

(JR/register 'OperatingSystems nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (OperatingSystems/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :LINUX nil)
  (JR/fset this :WINDOWS nil)
  (JR/fset this :SOLARIS nil)
  (JR/fset this :WINDOWS2000 nil)
  (JR/fset this :WINDOWS_NT nil)
  (JR/fset this :WINDOWS_10 nil)
  (JR/fset this :WINDOWS_11 nil)
  (JR/fset this :WINDOWS_VISTA nil)
  (JR/fset this :WINDOWS_XP nil)
  (JR/fset this :ANDROID nil)
  (JR/fset this :HARMONY nil)
  (JR/fset this :unknownSpecificOSAllowed false)
    (JR/fset this :LINUX "Linux")
    (JR/fset this :WINDOWS "Windows")
    (JR/fset this :SOLARIS "Solaris")
    (JR/fset this :WINDOWS2000 "Windows 2000")
    (JR/fset this :WINDOWS_NT "Windows NT")
    (JR/fset this :WINDOWS_10 "Windows 10")
    (JR/fset this :WINDOWS_11 "Windows 11")
    (JR/fset this :WINDOWS_VISTA "Windows Vista")
    (JR/fset this :WINDOWS_XP "Windows XP")
    (JR/fset this :ANDROID (JR/fget this :LINUX))
    (JR/fset this :HARMONY "HarmonyOS")
    (JR/fset this :unknownSpecificOSAllowed true)
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OperatingSystems)] (jinit_0 o) o))

    
(defn jm_isUnknownSpecificOSAllowed_0 [this]
  (let []
        (JR/fget this :unknownSpecificOSAllowed)))

    
(defn jm_setUnknownSpecificOSAllowed_1 [this p_aUnknownSpecificOSAllowed]
  (let [ l_aUnknownSpecificOSAllowed (volatile! p_aUnknownSpecificOSAllowed)]
        (JR/fset this :unknownSpecificOSAllowed @l_aUnknownSpecificOSAllowed)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (OperatingSystems/jstatic_instance)))



