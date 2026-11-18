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
;; package org.allbinary.logic.system

(ns SoftwareInformation)

(JR/register 'SoftwareInformation nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :shortName nil)
  (JR/fset this :version nil)
  this)

    
(defn jinit_3 [this p_name p_version p_shortName]
  (let [ l_name (volatile! p_name) l_version (volatile! p_version) l_shortName (volatile! p_shortName)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (JR/fset this :version @l_version)
        (JR/fset this :shortName (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_shortName) :jm_append_1 (JR/scall 'KotlinUtil :jm_getShortName_0)))))
  this)

(defn jnew_3 [p_name p_version p_shortName ]
  (let [o (JR/alloc 'SoftwareInformation)] (jinit_3 o p_name p_version p_shortName) o))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_getVersion_0 [this]
  (let []
        (JR/fget this :version)))

    
(defn jm_toShortString_0 [this]
  (let []
        (JR/fget this :shortName)))

    
(defn jm_toString_0 [this]
  (let [ l_NAME (volatile! nil) l_VERSION (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_NAME "Name: ")
        (vreset! l_VERSION "Version: ")
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 @l_NAME)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getName_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 @l_VERSION)
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke this :jm_getVersion_0))
        (JR/to-string-of @l_stringBuffer)))



