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

(ns BasicColorFactory)

(JR/register 'BasicColorFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicColorFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NULL_COLOR nil)
  (JR/fset this :TAN nil)
  (JR/fset this :SKIN_PINK nil)
  (JR/fset this :RED nil)
  (JR/fset this :LIGHT_RED nil)
  (JR/fset this :DARK_GREEN nil)
  (JR/fset this :GREEN nil)
  (JR/fset this :LIGHT_GREEN nil)
  (JR/fset this :PURPLE nil)
  (JR/fset this :BLUE nil)
  (JR/fset this :LIGHT_BLUE nil)
  (JR/fset this :VERY_LIGHT_BLUE nil)
  (JR/fset this :PUCE nil)
  (JR/fset this :AQUA nil)
  (JR/fset this :YELLOW nil)
  (JR/fset this :PINK nil)
  (JR/fset this :BLACK nil)
  (JR/fset this :GREY nil)
  (JR/fset this :LIGHT_GREY nil)
  (JR/fset this :DARK_GREY nil)
  (JR/fset this :ORANGE nil)
  (JR/fset this :BROWN nil)
  (JR/fset this :WHITE nil)
  (JR/fset this :TRANSPARENT_COLOR nil)
  (JR/fset this :TRANSPARENT_GREY nil)
  (JR/fset this :TRANSPARENT_BLACK nil)
  (JR/fset this :TRANSPARENT_RED nil)
  (JR/fset this :CLEAR_COLOR nil)
  (JR/fset this :BORDER_COLOR nil)
    (JR/fset this :NULL_COLOR (JR/invoke this :jm_createInstanceARGB_5 255 255 255 255 "null color"))
    (JR/fset this :TAN (JR/invoke this :jm_createInstance_1 (unchecked-int 0xE9D8B5)))
    (JR/fset this :SKIN_PINK (JR/invoke this :jm_createInstance_1 (unchecked-int 0xFDCECE)))
    (JR/fset this :RED (JR/invoke this :jm_createInstanceAN_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) (unchecked-int 0xFF0000) "red"))
    (JR/fset this :LIGHT_RED (JR/invoke this :jm_createInstanceAN_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) (unchecked-int 0xFFA0A0) "light red"))
    (JR/fset this :DARK_GREEN (JR/invoke this :jm_createInstance_1 (unchecked-int 0x00FF00)))
    (JR/fset this :GREEN (JR/invoke this :jm_createInstanceAN_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) (unchecked-int 0x00DD00) "green"))
    (JR/fset this :LIGHT_GREEN (JR/invoke this :jm_createInstance_1 (unchecked-int 0x007700)))
    (JR/fset this :PURPLE (JR/invoke this :jm_createInstanceAN_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) (unchecked-int 0x400040) "purple"))
    (JR/fset this :BLUE (JR/invoke this :jm_createInstanceAN_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) (unchecked-int 0x0000FF) "blue"))
    (JR/fset this :LIGHT_BLUE (JR/invoke this :jm_createInstance_1 (unchecked-int 0x00aaff)))
    (JR/fset this :VERY_LIGHT_BLUE (JR/invoke this :jm_createInstance_1 (unchecked-int 0x000033)))
    (JR/fset this :PUCE (JR/invoke this :jm_createInstance_1 (unchecked-int 0xFF00AA)))
    (JR/fset this :AQUA (JR/invoke this :jm_createInstance_1 (unchecked-int 0x00FFFF)))
    (JR/fset this :YELLOW (JR/invoke this :jm_createInstanceAN_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) (unchecked-int 0xFFFF00) "yellow"))
    (JR/fset this :PINK (JR/invoke this :jm_createInstance_1 (unchecked-int 0xFF00FF)))
    (JR/fset this :BLACK (JR/invoke this :jm_createInstanceAN_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) (unchecked-int 0x000000) "black"))
    (JR/fset this :GREY (JR/invoke this :jm_createInstanceAN_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) (unchecked-int 0xAAAAAA) "grey"))
    (JR/fset this :LIGHT_GREY (JR/invoke this :jm_createInstance_1 (unchecked-int 0xC0C0C0)))
    (JR/fset this :DARK_GREY (JR/invoke this :jm_createInstance_1 (unchecked-int 0x404040)))
    (JR/fset this :ORANGE (JR/invoke this :jm_createInstance_1 (unchecked-int 0xe07718)))
    (JR/fset this :BROWN (JR/invoke this :jm_createInstance_1 (unchecked-int 0x956B00)))
    (JR/fset this :WHITE (JR/invoke this :jm_createInstance_1 (unchecked-int 0xFFFFFF)))
    (JR/fset this :TRANSPARENT_COLOR (JR/invoke this :jm_createInstanceAN_3 (unchecked-int 0x00000000) (unchecked-int 0x000000) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
    (JR/fset this :TRANSPARENT_GREY (JR/invoke this :jm_createInstanceAN_3 (unchecked-int 0x52000000) (unchecked-int 0xECECEC) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
    (JR/fset this :TRANSPARENT_BLACK (JR/invoke this :jm_createInstanceAN_3 (unchecked-int 0x52000000) (unchecked-int 0x000000) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
    (JR/fset this :TRANSPARENT_RED (JR/invoke this :jm_createInstanceAN_3 (unchecked-int 0x52000000) (unchecked-int 0xFF0000) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
    (JR/fset this :CLEAR_COLOR (JR/fget this :BLACK))
    (JR/fset this :BORDER_COLOR (JR/fget this :WHITE))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicColorFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicColorFactory/jstatic_instance)))

    
(defn jm_createInstance_1 [this p_value]
  (let [ l_value (volatile! p_value)]
        (BasicColor/jnew_3 (JR/fget (JR/scall 'BasicColorUtil :jm_getInstance_0) :ALPHA) @l_value (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))))

    
(defn jm_createInstanceA_2 [this p_alphaValue p_value]
  (let [ l_alphaValue (volatile! p_alphaValue) l_value (volatile! p_value)]
        (BasicColor/jnew_3 @l_alphaValue @l_value (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))))

    
(defn jm_createInstanceAN_3 [this p_alphaValue p_value p_name]
  (let [ l_alphaValue (volatile! p_alphaValue) l_value (volatile! p_value) l_name (volatile! p_name)]
        (BasicColor/jnew_3 @l_alphaValue @l_value @l_name)))

    
(defn jm_createInstanceARGB_5 [this p_alphaValue p_r p_g p_b p_name]
  (let [ l_alphaValue (volatile! p_alphaValue) l_r (volatile! p_r) l_g (volatile! p_g) l_b (volatile! p_b) l_name (volatile! p_name) l_ALPHA_MASK (volatile! nil)]
        (vreset! l_ALPHA_MASK (unchecked-int 0xFF000000))
        (BasicColor/jnew_3 @l_alphaValue (unchecked-int (unchecked-add (unchecked-int (unchecked-add (unchecked-int (unchecked-add (bit-and (JR/ishl @l_alphaValue 24) @l_ALPHA_MASK) (bit-and (JR/ishl @l_r 16) (unchecked-int 0x00FF0000)))) (bit-and (JR/ishl @l_g 8) (unchecked-int 0x0000FF00)))) (bit-and @l_b (unchecked-int 0x000000FF)))) (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))))



