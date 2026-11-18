;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.game.canvas

(ns ABToGBUtil)

(JR/register 'ABToGBUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ABToGBUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :abCanvas nil)
  (JR/fset this :allBinaryGameLayerManager nil)
    (JR/fset this :abCanvas (JR/sget 'NullCanvas "NULL_CANVAS"))
    (JR/fset this :allBinaryGameLayerManager (JR/scall 'AllBinaryGameLayerManager :jm_getNullInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ABToGBUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ABToGBUtil/jstatic_instance)))



