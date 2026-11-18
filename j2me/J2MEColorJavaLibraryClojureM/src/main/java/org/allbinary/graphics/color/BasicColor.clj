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

(ns BasicColor)

(JR/register 'BasicColor nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :value 0)
  (JR/fset this :redComponent 0.0)
  (JR/fset this :greenComponent 0.0)
  (JR/fset this :blueComponent 0.0)
  (JR/fset this :alphaComponent 0.0)
  (JR/fset this :red 0)
  (JR/fset this :green 0)
  (JR/fset this :blue 0)
  (JR/fset this :alpha 0)
  this)

    
(defn jinit_3 [this p_alphaValue p_value p_name]
  (let [ l_alphaValue (volatile! p_alphaValue) l_value (volatile! p_value) l_name (volatile! p_name) l_tempValue (volatile! nil) l_basicColorUtil (volatile! nil) l_alphaInt (volatile! nil) l_redInt (volatile! nil) l_greenInt (volatile! nil) l_blueInt (volatile! nil)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (vreset! l_tempValue 0)
        (vreset! l_basicColorUtil (JR/scall 'BasicColorUtil :jm_getInstance_0))
        (if (JR/fget @l_basicColorUtil :isAlpha)
            (do
            (if (JR/fget @l_basicColorUtil :ffOpaque)
                (do
                (vreset! l_tempValue (bit-or @l_alphaValue @l_value)))
                (do
                (vreset! l_tempValue (bit-or (unchecked-int 0x00000000) @l_value)))))
            (do
            (vreset! l_tempValue @l_value)))
        (vreset! l_alphaInt (bit-and (JR/ishr @l_tempValue 24) 255))
        (JR/fset this :alpha (JR/i16 @l_alphaInt))
        (JR/fset this :alphaComponent (/ (double (JR/f32 @l_alphaInt)) 255.0))
        (vreset! l_redInt (bit-and (JR/ishr @l_tempValue 16) 255))
        (JR/fset this :red (JR/i16 @l_redInt))
        (JR/fset this :redComponent (/ (double (JR/f32 @l_redInt)) 255.0))
        (vreset! l_greenInt (bit-and (JR/ishr @l_tempValue 8) 255))
        (JR/fset this :green (JR/i16 @l_greenInt))
        (JR/fset this :greenComponent (/ (double (JR/f32 @l_greenInt)) 255.0))
        (vreset! l_blueInt (bit-and @l_tempValue 255))
        (JR/fset this :blue (JR/i16 @l_blueInt))
        (JR/fset this :blueComponent (/ (double (JR/f32 @l_blueInt)) 255.0))
        (JR/fset this :value @l_tempValue))
  this)

(defn jnew_3 [p_alphaValue p_value p_name ]
  (let [o (JR/alloc 'BasicColor)] (jinit_3 o p_alphaValue p_value p_name) o))

    
(defn jm_intValue_0 [this]
  (let []
        (JR/fget this :value)))

    
(defn jm_toInt_0 [this]
  (let []
        (JR/fget this :value)))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "BasicColor: ")
        (JR/invoke @l_stringBuffer :jm_append_1 "Alpha: ")
        (JR/invoke @l_stringBuffer :jm_appendshort_1 (JR/fget this :alpha))
        (JR/invoke @l_stringBuffer :jm_append_1 " Red: ")
        (JR/invoke @l_stringBuffer :jm_appendshort_1 (JR/fget this :red))
        (JR/invoke @l_stringBuffer :jm_append_1 " Green: ")
        (JR/invoke @l_stringBuffer :jm_appendshort_1 (JR/fget this :green))
        (JR/invoke @l_stringBuffer :jm_append_1 " Blue: ")
        (JR/invoke @l_stringBuffer :jm_appendshort_1 (JR/fget this :blue))
        (JR/invoke @l_stringBuffer :jm_append_1 " Value: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :value))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_getRedComponent_0 [this]
  (let []
        (JR/fget this :redComponent)))

    
(defn jm_getGreenComponent_0 [this]
  (let []
        (JR/fget this :greenComponent)))

    
(defn jm_getBlueComponent_0 [this]
  (let []
        (JR/fget this :blueComponent)))

    
(defn jm_getAlphaComponent_0 [this]
  (let []
        (JR/fget this :alphaComponent)))



