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
;; package org.allbinary.game.paint

(ns ColorFillPaintableFactory)

(JR/register 'ColorFillPaintableFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ColorFillPaintableFactory/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ColorFillPaintableFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ColorFillPaintableFactory/jstatic_instance)))

    
(defn jm_getInstance_2 [this p_basicColor p_forThreedCanvas]
  (let [ l_basicColor (volatile! p_basicColor) l_forThreedCanvas (volatile! p_forThreedCanvas) l_operatingSystem (volatile! nil)]
        (vreset! l_operatingSystem (JR/invoke (JR/scall 'OperatingSystemFactory :jm_getInstance_0) :jm_getOperatingSystemInstance_0))
        (if (JR/invoke @l_operatingSystem :jm_isOverScan_0)
            (do
            (OverScanColorFillPaintable/jnew_1 @l_basicColor))
            (do
            (ColorFillPaintable/jnew_1 @l_basicColor)))))



