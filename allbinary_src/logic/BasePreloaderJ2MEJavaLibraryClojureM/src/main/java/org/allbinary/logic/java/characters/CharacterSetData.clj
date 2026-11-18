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
;; package org.allbinary.logic.java.characters

(ns CharacterSetData)

(JR/register 'CharacterSetData nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CharacterSetData/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :US_ASCII nil)
  (JR/fset this :ISO_8859_1 nil)
  (JR/fset this :UTF_8 nil)
  (JR/fset this :UTF_16 nil)
  (JR/fset this :UTF_16BE nil)
  (JR/fset this :UTF_16LE nil)
    (JR/fset this :US_ASCII "US-ASCII")
    (JR/fset this :ISO_8859_1 "ISO-8859-1")
    (JR/fset this :UTF_8 "UTF-8")
    (JR/fset this :UTF_16 "UTF-16")
    (JR/fset this :UTF_16BE "UTF-16BE")
    (JR/fset this :UTF_16LE "UTF-16LE")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CharacterSetData/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CharacterSetData)] (jinit_0 o) o))



