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
;; package org.allbinary.game.displayable

(ns AlwaysRepaintBehavior)

(JR/register 'AlwaysRepaintBehavior 'RepaintBehavior '[])

(def jsv_instanceC (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instanceC [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceC)
(defn jstatic_set_instanceC [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceC v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instanceC (AlwaysRepaintBehavior/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NAME nil)
    (JR/fset this :NAME "AlwaysRepaintBehavior")
  this)

(defn jinit_0 [this]
  (RepaintBehavior/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AlwaysRepaintBehavior)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AlwaysRepaintBehavior/jstatic_instanceC)))

    
(defn jm_repaint_1 [this p_canvas]
  (let [ l_canvas (volatile! p_canvas) l_features (volatile! nil) l_openGLFeatureFactory (volatile! nil) l_thread (volatile! nil)]
        (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
        (vreset! l_openGLFeatureFactory (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0))
        (if (JR/invoke @l_features :jm_isFeature_1 (JR/fget @l_openGLFeatureFactory :OPENGL))
            (do
            (JR/invoke (JR/scall 'DisplayInfoSingleton :jm_getInstance_0) :jm_process_0))
            (do
            (vreset! l_thread (new java.lang.Thread (RepaintRunnable/jnew_1 @l_canvas) (JR/fget this :NAME)))
            (JR/invoke @l_thread :jm_start_0)))))

    
(defn jm_onChangeRepaint_1 [this p_canvas]
  (let [ l_canvas (volatile! p_canvas)]
        nil))



