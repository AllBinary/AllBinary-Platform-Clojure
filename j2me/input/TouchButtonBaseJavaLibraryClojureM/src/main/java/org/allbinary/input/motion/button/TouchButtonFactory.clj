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

(ns TouchButtonFactory)

(JR/register 'TouchButtonFactory nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (TouchButtonFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :LIST nil)
  (JR/fset this :list nil)
  (JR/fset this :savedList nil)
  (JR/fset this :saved false)
    (JR/fset this :LIST (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0))
    (JR/fset this :list (JR/fget this :LIST))
    (JR/fset this :savedList (JR/fget this :LIST))
    (JR/fset this :saved false)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (TouchButtonFactory/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'TouchButtonFactory)] (jinit_0 o) o))

    
(defn jm_defaultList_0 [this]
  (let []
        (JR/fset this :list (JR/fget this :LIST))
        (JR/invoke this :jm_toggle_2 false (JR/fget this :LIST))))

    
(defn jm_toggle_2 [this p_save p_list]
  (let [ l_save (volatile! p_save) l_list (volatile! p_list)]
        (if (not (JR/eq @l_list (JR/invoke (JR/scall 'BasicArrayListUtil :jm_getInstance_0) :jm_getImmutableInstance_0)))
            (do
            (JR/fset this :savedList @l_list)
            (if (not (JR/fget this :saved))
                (do
                (JR/fset this :list (JR/fget this :savedList)))))
            (do
            (if @l_save
                (do
                (if (not (JR/fget this :saved))
                    (do
                    (JR/fset this :saved true)
                    (JR/fset this :savedList (JR/fget this :list))
                    (JR/fset this :list (JR/fget this :LIST)))
                    (do
                    nil)))
                (do
                (JR/fset this :list (JR/fget this :savedList))
                (JR/fset this :saved false)))))))

    
(defn jm_setList_1 [this p_list]
  (let [ l_list (volatile! p_list)]
        (if (nil? @l_list)
            (do
            (JR/jthrow (new java.lang.Exception "Null List"))))
        (JR/fset this :list @l_list)))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :list)))



