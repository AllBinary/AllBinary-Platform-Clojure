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

(ns ColorTemperatureUtil)

(JR/register 'ColorTemperatureUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ColorTemperatureUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :basicColorFactory nil)
    (JR/fset this :basicColorFactory (JR/scall 'BasicColorFactory :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ColorTemperatureUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ColorTemperatureUtil/jstatic_instance)))

    
(defn jm_getBasicColor_1 [this p_thirdTemp]
  (let [ l_thirdTemp (volatile! p_thirdTemp) l_basicColor (volatile! nil)]
        (vreset! l_basicColor (JR/fget (JR/fget this :basicColorFactory) :RED))
        (if (> @l_thirdTemp 3700)
            (do
            (vreset! l_basicColor (JR/fget (JR/fget this :basicColorFactory) :PURPLE)))
            (if (> @l_thirdTemp 3200)
            (do
            (vreset! l_basicColor (JR/fget (JR/fget this :basicColorFactory) :BLUE)))
            (if (> @l_thirdTemp 2700)
            (do
            (vreset! l_basicColor (JR/fget (JR/fget this :basicColorFactory) :PUCE)))
            (if (> @l_thirdTemp 2200)
            (do
            (vreset! l_basicColor (JR/fget (JR/fget this :basicColorFactory) :WHITE)))
            (if (> @l_thirdTemp 1700)
            (do
            (vreset! l_basicColor (JR/fget (JR/fget this :basicColorFactory) :GREEN)))
            (if (> @l_thirdTemp 1200)
            (do
            (vreset! l_basicColor (JR/fget (JR/fget this :basicColorFactory) :YELLOW)))
            (if (> @l_thirdTemp 700)
            (do
            (vreset! l_basicColor (JR/fget (JR/fget this :basicColorFactory) :ORANGE))))))))))
        @l_basicColor))



