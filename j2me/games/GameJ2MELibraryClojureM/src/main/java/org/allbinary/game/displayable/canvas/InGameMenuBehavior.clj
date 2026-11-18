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
;; package org.allbinary.game.displayable.canvas

(ns InGameMenuBehavior)

(JR/register 'InGameMenuBehavior 'BaseMenuBehavior '[])

(def jsv_instanceC (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instanceC [] (JR/ensure-init jclinit-state jclinit) @jsv_instanceC)
(defn jstatic_set_instanceC [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instanceC v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instanceC (InGameMenuBehavior/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  (BaseMenuBehavior/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'InGameMenuBehavior)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (InGameMenuBehavior/jstatic_instanceC)))

    
(defn jm_onDisplayChangeEvent_2 [this p_allBinaryGameCanvas p_displayChangeEvent]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas) l_displayChangeEvent (volatile! p_displayChangeEvent)]
        (JR/invoke @l_allBinaryGameCanvas :jm_updateMenuFromEvent_1 @l_displayChangeEvent)))

    
(defn jm_initSpecialPaint_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_setNonBotPaintableP_1 (GameCanvasNonBotPaintable/jnew_1 @l_allBinaryGameCanvas))))

    
(defn jm_initMenu_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_initMenu2_0)))

    
(defn jm_updateMenu_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_initMenu2_0)))

    
(defn jm_popupMenu_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_popupMenu2_0)))

    
(defn jm_closeMenu_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
        (JR/invoke @l_allBinaryGameCanvas :jm_closeMenu2_0)))



