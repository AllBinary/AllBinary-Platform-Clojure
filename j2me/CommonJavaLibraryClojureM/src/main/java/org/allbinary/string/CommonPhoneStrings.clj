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

(ns CommonPhoneStrings)

(JR/register 'CommonPhoneStrings nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CommonPhoneStrings/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :UP nil)
  (JR/fset this :DOWN nil)
  (JR/fset this :LEFT nil)
  (JR/fset this :RIGHT nil)
  (JR/fset this :ZERO nil)
  (JR/fset this :ONE nil)
  (JR/fset this :TWO nil)
  (JR/fset this :THREE nil)
  (JR/fset this :FOUR nil)
  (JR/fset this :FIVE nil)
  (JR/fset this :SIX nil)
  (JR/fset this :SEVEN nil)
  (JR/fset this :EIGHT nil)
  (JR/fset this :NINE nil)
  (JR/fset this :POUND nil)
  (JR/fset this :STAR nil)
  (JR/fset this :FIRE nil)
    (JR/fset this :UP "UP")
    (JR/fset this :DOWN "DOWN")
    (JR/fset this :LEFT "LEFT")
    (JR/fset this :RIGHT "RIGHT")
    (JR/fset this :ZERO "0")
    (JR/fset this :ONE "1")
    (JR/fset this :TWO "2")
    (JR/fset this :THREE "3")
    (JR/fset this :FOUR "4")
    (JR/fset this :FIVE "5")
    (JR/fset this :SIX "6")
    (JR/fset this :SEVEN "7")
    (JR/fset this :EIGHT "8")
    (JR/fset this :NINE "9")
    (JR/fset this :POUND "#")
    (JR/fset this :STAR "*")
    (JR/fset this :FIRE "FIRE")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CommonPhoneStrings)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CommonPhoneStrings/jstatic_instance)))



