;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.game.displayable.canvas

(ns NullAllBinaryGameCanvas)

(JR/register 'NullAllBinaryGameCanvas nil '[AllBinaryGameCanvasInterface])

(def jsv_NULL_ALLBINARY_GAME_CANVAS (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_ALLBINARY_GAME_CANVAS [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_ALLBINARY_GAME_CANVAS)
(defn jstatic_set_NULL_ALLBINARY_GAME_CANVAS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_ALLBINARY_GAME_CANVAS v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_ALLBINARY_GAME_CANVAS (NullAllBinaryGameCanvas/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullAllBinaryGameCanvas)] (jinit_0 o) o))

    
(defn jm_getLayerManager_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_addCommand_1 [this p_cmd]
  (let [ l_cmd (volatile! p_cmd)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getHeight_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_removeCommand_1 [this p_cmd]
  (let [ l_cmd (volatile! p_cmd)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_setCommandListener_1 [this p_l]
  (let [ l_l (volatile! p_l)]
        (JR/jthrow (new java.lang.RuntimeException))))



