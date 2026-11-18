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
;; package org.allbinary.game.displayable.canvas

(ns OverlayPaintable)

(JR/register 'OverlayPaintable 'InitUpdatePaintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    (InitUpdatePaintable/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'OverlayPaintable)] (jinit_0 o) o))

    
(defn jm_update_0 [this]
  (let [ l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            nil)
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :UPDATE) @l_e)) :else (throw jt)))))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))



