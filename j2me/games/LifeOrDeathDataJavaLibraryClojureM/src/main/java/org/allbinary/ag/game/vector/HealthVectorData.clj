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
;; package org.allbinary.ag.game.vector

(ns HealthVectorData)

(JR/register 'HealthVectorData nil '[])

(def jsv_points (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_points [] (JR/ensure-init jclinit-state jclinit) @jsv_points)
(defn jstatic_set_points [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_points v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_points (JR/afrom "INT" 3 [(JR/afrom "INT" 2 [(JR/afrom "INT" 1 [2 1]) (JR/afrom "INT" 1 [3 2]) (JR/afrom "INT" 1 [3 2]) (JR/afrom "INT" 1 [4 1]) (JR/afrom "INT" 1 [4 1]) (JR/afrom "INT" 1 [5 1]) (JR/afrom "INT" 1 [5 1]) (JR/afrom "INT" 1 [6 2]) (JR/afrom "INT" 1 [6 2]) (JR/afrom "INT" 1 [6 3]) (JR/afrom "INT" 1 [6 3]) (JR/afrom "INT" 1 [3 6]) (JR/afrom "INT" 1 [3 6]) (JR/afrom "INT" 1 [0 3]) (JR/afrom "INT" 1 [0 3]) (JR/afrom "INT" 1 [0 2]) (JR/afrom "INT" 1 [0 2]) (JR/afrom "INT" 1 [1 1]) (JR/afrom "INT" 1 [1 1]) (JR/afrom "INT" 1 [2 1]) (JR/afrom "INT" 1 [1000 1000])])]))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'HealthVectorData)] (jinit_0 o) o))



