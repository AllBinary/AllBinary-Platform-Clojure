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
;; package org.allbinary.canvas

(ns FullScreenUtil)

(JR/register 'FullScreenUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (FullScreenUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'FullScreenUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FullScreenUtil/jstatic_instance)))

    
(defn jm_initOnRun_2 [this p_fullScreenInterface p_commandListener]
  (let [ l_fullScreenInterface (volatile! p_fullScreenInterface) l_commandListener (volatile! p_commandListener)]
        (if (some? @l_commandListener)
            (do
            (JR/invoke this :jm_init_1 @l_fullScreenInterface)))))

    
(defn jm_init_1 [this p_fullScreenInterface]
  (let [ l_fullScreenInterface (volatile! p_fullScreenInterface)]
        nil))

    
(defn jm_isScreenChange_1 [this p_isFullScreen]
  (let [ l_isFullScreen (volatile! p_isFullScreen) l_mainFeatureFactory (volatile! nil) l_features (volatile! nil)](JR/method
        (vreset! l_mainFeatureFactory (JR/scall 'MainFeatureFactory :jm_getInstance_0))
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (if (not= (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_mainFeatureFactory :FULL_SCREEN)) @l_isFullScreen)
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_isScreenChangeCanvas_1 [this p_fullScreenInterface]
  (let [ l_fullScreenInterface (volatile! p_fullScreenInterface)]
        (JR/invoke this :jm_isScreenChange_1 false)))



