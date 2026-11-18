;; 
;; To change this license header, choose License Headers in Project Properties. 
;; To change this template file, choose Tools | Templates 
;; and open the template in the editor.  
;; Generated Code Do Not Modify
;; package org.allbinary.input.motion.button

(ns TouchButtonResource)

(JR/register 'TouchButtonResource nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :RESOURCE nil)
  (JR/fset this :HINT nil)
  this)

    
(defn jinit_2 [this p_resource p_hint]
  (let [ l_resource (volatile! p_resource) l_hint (volatile! p_hint)]
    nil (jinitfields this)
        (JR/fset this :RESOURCE @l_resource)
        (JR/fset this :HINT @l_hint))
  this)

(defn jnew_2 [p_resource p_hint ]
  (let [o (JR/alloc 'TouchButtonResource)] (jinit_2 o p_resource p_hint) o))



