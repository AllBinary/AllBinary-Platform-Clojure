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
;; package org.allbinary.input.motion.button

(ns TouchButtonsPaintable)

(JR/register 'TouchButtonsPaintable 'Paintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :foregroundBasicColor nil)
  (JR/fset this :foregroundColor 0)
  (JR/fset this :basicSetColorUtil nil)
  (JR/fset this :touchButtonFactory nil)
    (JR/fset this :basicSetColorUtil (JR/scall 'BasicColorSetUtil :jm_getInstance_0))
    (JR/fset this :touchButtonFactory (JR/scall 'TouchButtonFactory :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor)]
    (Paintable/jinit_0 this) (jinitfields this)
        (JR/fset this :foregroundBasicColor @l_basicColor)
        (JR/fset this :foregroundColor (JR/invoke @l_basicColor :jm_intValue_0)))
  this)

(defn jnew_1 [p_basicColor ]
  (let [o (JR/alloc 'TouchButtonsPaintable)] (jinit_1 o p_basicColor) o))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_list (volatile! nil) l_touchButton (volatile! nil) l_index (volatile! nil)]
        (vreset! l_list (JR/invoke (JR/fget this :touchButtonFactory) :jm_getList_0))
        (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP3_3 @l_graphics (JR/fget this :foregroundBasicColor) (JR/fget this :foregroundColor))
        (vreset! l_touchButton nil)
        (do (vreset! l_index (JR/invoke @l_list :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_touchButton (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke @l_touchButton :jm_paint_1 @l_graphics)))
        (do (vreset! l_index (JR/invoke @l_list :jm_size_0))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_touchButton (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke @l_touchButton :jm_paintHint_1 @l_graphics)))))



