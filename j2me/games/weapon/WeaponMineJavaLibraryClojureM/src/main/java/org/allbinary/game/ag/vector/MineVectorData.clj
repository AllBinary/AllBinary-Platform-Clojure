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
;; package org.allbinary.game.ag.vector

(ns MineVectorData)

(JR/register 'MineVectorData nil '[])

(def jsv_points (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_points [] (JR/ensure-init jclinit-state jclinit) @jsv_points)
(defn jstatic_set_points [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_points v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_points (JR/afrom "INT" 3 [(JR/afrom "INT" 2 [(JR/afrom "INT" 1 [10 5]) (JR/afrom "INT" 1 [2 6]) (JR/afrom "INT" 1 [1000 1000]) (JR/afrom "INT" 1 [2 2]) (JR/afrom "INT" 1 [10 9]) (JR/afrom "INT" 1 [1000 1000]) (JR/afrom "INT" 1 [10 2]) (JR/afrom "INT" 1 [2 9]) (JR/afrom "INT" 1 [1000 1000]) (JR/afrom "INT" 1 [2 5]) (JR/afrom "INT" 1 [10 6]) (JR/afrom "INT" 1 [1000 1000]) (JR/afrom "INT" 1 [7 9]) (JR/afrom "INT" 1 [5 2]) (JR/afrom "INT" 1 [1000 1000]) (JR/afrom "INT" 1 [7 2]) (JR/afrom "INT" 1 [5 9]) (JR/afrom "INT" 1 [1000 1000])])]))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MineVectorData)] (jinit_0 o) o))



