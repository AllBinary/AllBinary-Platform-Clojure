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
;; package org.allbinary.game.identification

(ns BasicGroupFactory)

(JR/register 'BasicGroupFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :NAME nil)
  (JR/fset this :NO_SUCH_GROUP nil)
  (JR/fset this :GOOD nil)
  (JR/fset this :ENEMY nil)
  (JR/fset this :ENEMY_ON_LEVEL nil)
  (JR/fset this :NONE nil)
  (JR/fset this :GOOD_ARRAY nil)
  (JR/fset this :ENEMY_ARRAY nil)
  (JR/fset this :ENEMY_ON_LEVEL_ARRAY nil)
  (JR/fset this :NONE_ARRAY nil)
    (JR/fset this :NAME "GROUP_NAME")
    (JR/fset this :NO_SUCH_GROUP "No Such Group: ")
    (JR/fset this :GOOD (Group/jnew_2 "Good Guys" (JR/i16 0)))
    (JR/fset this :ENEMY (Group/jnew_2 "Bad Guys" (JR/i16 1)))
    (JR/fset this :ENEMY_ON_LEVEL (Group/jnew_2 "Bad Guys on Level" (JR/i16 2)))
    (JR/fset this :NONE (Group/jnew_2 "Not On A Team" (JR/i16 3)))
    (JR/fset this :GOOD_ARRAY (JR/afrom "Object" 1 [(JR/fget this :GOOD)]))
    (JR/fset this :ENEMY_ARRAY (JR/afrom "Object" 1 [(JR/fget this :ENEMY)]))
    (JR/fset this :ENEMY_ON_LEVEL_ARRAY (JR/afrom "Object" 1 [(JR/fget this :ENEMY) (JR/fget this :ENEMY_ON_LEVEL)]))
    (JR/fset this :NONE_ARRAY (JR/afrom "Object" 1 [(JR/fget this :NONE)]))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicGroupFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (BasicGroupFactory/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (BasicGroupFactory/jstatic_set_instance (BasicGroupFactory/jnew_0))))
        (BasicGroupFactory/jstatic_instance)))



