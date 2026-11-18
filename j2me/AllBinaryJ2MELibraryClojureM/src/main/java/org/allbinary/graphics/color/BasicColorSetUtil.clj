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

(ns BasicColorSetUtil)

(JR/register 'BasicColorSetUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicColorSetUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicColorSetUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicColorSetUtil)] (jinit_0 o) o))

    
(defn jm_setBasicColorP_2 [this p_graphics p_basicColor]
  (let [ l_graphics (volatile! p_graphics) l_basicColor (volatile! p_basicColor)]
        (JR/invoke @l_graphics :jm_setColor_1 (JR/invoke @l_basicColor :jm_intValue_0))))

    
(defn jm_setBasicColorP3_3 [this p_graphics p_basicColor p_value]
  (let [ l_graphics (volatile! p_graphics) l_basicColor (volatile! p_basicColor) l_value (volatile! p_value)]
        (JR/invoke @l_graphics :jm_setColor_1 @l_value)))



