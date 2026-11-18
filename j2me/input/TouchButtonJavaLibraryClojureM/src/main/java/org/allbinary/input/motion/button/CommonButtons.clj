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

(ns CommonButtons)

(JR/register 'CommonButtons nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CommonButtons/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :STANDARD_BUTTON_SIZE 0)
  (JR/fset this :NORMAL_BUTTON nil)
  (JR/fset this :LARGE_BUTTON nil)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CommonButtons/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_displayInfo (volatile! nil) l_commonButtonSize (volatile! nil) l_totalColumns (volatile! nil) l_totalRows (volatile! nil) l_max (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_commonButtonSize 128)
        (JR/jwhile true false (> @l_commonButtonSize 64)
            (vreset! l_totalColumns (JR/idiv (JR/invoke @l_displayInfo :jm_getLastWidth_0) @l_commonButtonSize))
            (vreset! l_totalRows (JR/idiv (JR/invoke @l_displayInfo :jm_getLastHeight_0) @l_commonButtonSize))
            (vreset! l_max @l_totalColumns)
            (if (> @l_totalRows @l_max)
                (do
                (vreset! l_max @l_totalRows)))
            (if (> @l_max 9)
                (do
                (JR/jbreak)))
            (vreset! l_commonButtonSize (JR/ishr @l_commonButtonSize 1)))
        (JR/fset this :STANDARD_BUTTON_SIZE @l_commonButtonSize)
        (JR/fset this :NORMAL_BUTTON (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) (JR/fget this :STANDARD_BUTTON_SIZE) (JR/fget this :STANDARD_BUTTON_SIZE)))
        (JR/fset this :LARGE_BUTTON (Rectangle/jnew_3 (JR/fget (JR/scall 'PointFactory :jm_getInstance_0) :ZERO_ZERO) (JR/ishl (JR/fget this :STANDARD_BUTTON_SIZE) 1) (JR/ishl (JR/fget this :STANDARD_BUTTON_SIZE) 1))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CommonButtons)] (jinit_0 o) o))



