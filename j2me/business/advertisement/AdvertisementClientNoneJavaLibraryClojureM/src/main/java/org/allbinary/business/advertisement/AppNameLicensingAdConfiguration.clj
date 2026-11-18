;; Generated Code Do Not Modify
;; package org.allbinary.business.advertisement

(ns AppNameLicensingAdConfiguration)

(JR/register 'AppNameLicensingAdConfiguration 'AdConfiguration '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
        (AdConfiguration/jinit_1 this (JR/afrom "Object" 1 [(JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)])) (jinitfields this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AppNameLicensingAdConfiguration)] (jinit_0 o) o))



