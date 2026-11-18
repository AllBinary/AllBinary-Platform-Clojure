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
;; package org.allbinary.game.midlet

(ns SpecialDemoGameMidlet)

(JR/register 'SpecialDemoGameMidlet 'DemoGameMidlet '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_4 [this p_clientInformationFactory p_licenseLoadingType p_demoSetupFactory p_licenseCheckRunnableFactory]
  (let [ l_clientInformationFactory (volatile! p_clientInformationFactory) l_licenseLoadingType (volatile! p_licenseLoadingType) l_demoSetupFactory (volatile! p_demoSetupFactory) l_licenseCheckRunnableFactory (volatile! p_licenseCheckRunnableFactory)]
        (DemoGameMidlet/jinit_1 this @l_clientInformationFactory) (jinitfields this))
  this)

(defn jnew_4 [p_clientInformationFactory p_licenseLoadingType p_demoSetupFactory p_licenseCheckRunnableFactory ]
  (let [o (JR/alloc 'SpecialDemoGameMidlet)] (jinit_4 o p_clientInformationFactory p_licenseLoadingType p_demoSetupFactory p_licenseCheckRunnableFactory) o))

    
(defn jm_initView_0 [this]
  (let []
        nil))

    
(defn jm_preInit_0 [this]
  (let []
        (JR/invoke (LicenseServerInitFileUtil/jnew_0) :jm_init_0)))



