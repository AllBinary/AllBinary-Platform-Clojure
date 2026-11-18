;;
;; AllBinary Open License Version 1
;; Copyright (c) 2022 AllBinary
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
;; package org.allbinary.graphics.displayable.screen

(ns AboutPaintableFactory)

(JR/register 'AboutPaintableFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AboutPaintableFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :paintableArray nil)
    (JR/fset this :paintableArray (JR/afrom "Object" 1 [(JR/scall 'NullPaintable :jm_getInstance_0)]))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AboutPaintableFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_INFO (volatile! nil) l_DEVELOPERS (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_INFO (JR/afrom "String" 1 ["Built with the" "AllBinary Platform" (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) "Comments or Questions:" "support@allbinary.com"]))
        (vreset! l_DEVELOPERS (JR/afrom "String" 1 ["Developed By:" "Travis Berthelot"]))
        (JR/fset this :paintableArray (JR/invoke (JR/scall 'AboutPaintable :jm_getInstance_2 @l_INFO @l_DEVELOPERS) :jm_getPaintableArrayInstance_0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AboutPaintableFactory)] (jinit_0 o) o))



