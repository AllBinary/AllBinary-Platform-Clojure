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
;; package org.allbinary.graphics.color

(ns BasicColorUtil)

(JR/register 'BasicColorUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicColorUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :ZERO_ARRAY nil)
  (JR/fset this :ALPHA 0)
  (JR/fset this :isAlpha false)
  (JR/fset this :ffOpaque false)
    (JR/fset this :ZERO_ARRAY (JR/anew "Object" 1 0))
    (JR/fset this :ALPHA (unchecked-int 0xFF000000))
    (JR/fset this :isAlpha true)
    (JR/fset this :ffOpaque true)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicColorUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicColorUtil/jstatic_instance)))

    
(defn jm_getRGB_3 [this p_red p_green p_blue]
  (let [ l_red (volatile! p_red) l_green (volatile! p_green) l_blue (volatile! p_blue) l_value (volatile! nil)]
        (vreset! l_value 0)
        (if (JR/fget this :isAlpha)
            (do
            (if (JR/fget this :ffOpaque)
                (do
                (vreset! l_value (JR/fget this :ALPHA))))))
        (vreset! l_value (bit-or (JR/ishl @l_red 16) @l_value))
        (vreset! l_value (bit-or (JR/ishl @l_green 8) @l_value))
        (vreset! l_value (bit-or @l_blue @l_value))
        @l_value))

    
(defn jm_getARGB_4 [this p_alphaValue p_r p_g p_b]
  (let [ l_alphaValue (volatile! p_alphaValue) l_r (volatile! p_r) l_g (volatile! p_g) l_b (volatile! p_b)]
        (unchecked-int (unchecked-add (unchecked-int (unchecked-add (unchecked-int (unchecked-add (bit-and (JR/ishl @l_alphaValue 24) (JR/fget this :ALPHA)) (bit-and (JR/ishl @l_r 16) (unchecked-int 0x00FF0000)))) (bit-and (JR/ishl @l_g 8) (unchecked-int 0x0000FF00)))) (bit-and @l_b (unchecked-int 0x000000FF))))))

    
(defn jm_get_2 [this p_alphaValue p_color]
  (let [ l_alphaValue (volatile! p_alphaValue) l_color (volatile! p_color)]
        (unchecked-int (unchecked-add (bit-and (JR/ishl @l_alphaValue 24) (JR/fget this :ALPHA)) @l_color))))

    
(defn jm_invert_1 [this p_color]
  (let [ l_color (volatile! p_color)]
        (bit-or (unchecked-int (unchecked-subtract (unchecked-int 0xFFFFFF) @l_color)) (JR/fget this :ALPHA))))



