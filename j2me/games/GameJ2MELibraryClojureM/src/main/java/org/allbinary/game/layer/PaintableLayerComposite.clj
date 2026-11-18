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
;; package org.allbinary.game.layer

(ns PaintableLayerComposite)

(JR/register 'PaintableLayerComposite 'Paintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :paintableArray nil)
  this)

    
(defn jinit_1 [this p_paintableArray]
  (let [ l_paintableArray (volatile! p_paintableArray)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :paintableArray @l_paintableArray))
  this)

(defn jnew_1 [p_paintableArray ]
  (let [o (JR/alloc 'PaintableLayerComposite)] (jinit_1 o p_paintableArray) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_index (volatile! nil)]
        (do (vreset! l_index (JR/alen (JR/fget this :paintableArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (JR/invoke (JR/aget* (JR/fget this :paintableArray) @l_index) :jm_paint_1 @l_graphics)))))

    
(defn jm_paintThreed_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_paintableInterface (volatile! nil) l_index (volatile! nil)]
        (vreset! l_paintableInterface nil)
        (do (vreset! l_index (JR/alen (JR/fget this :paintableArray)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_paintableInterface (JR/aget* (JR/fget this :paintableArray) @l_index))
            (JR/invoke @l_paintableInterface :jm_paintThreed_1 @l_graphics)))))



