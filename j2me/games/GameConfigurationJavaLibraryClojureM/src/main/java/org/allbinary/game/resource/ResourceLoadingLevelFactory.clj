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
;; package org.allbinary.game.resource

(ns ResourceLoadingLevelFactory)

(JR/register 'ResourceLoadingLevelFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ResourceLoadingLevelFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :LOAD_EARLY nil)
  (JR/fset this :LOAD_TOUCH nil)
  (JR/fset this :LOAD_GAME nil)
  (JR/fset this :LEVEL nil)
  (JR/fset this :MAX_LEVEL nil)
  (JR/fset this :LOAD_ALL nil)
  (JR/fset this :RESOURCE_LOADING_LEVEL_ARRAY nil)
    (JR/fset this :LOAD_EARLY (ResourceLoadingLevel/jnew_2 "Load Early" java.lang.Integer/MAX_VALUE))
    (JR/fset this :LOAD_TOUCH (ResourceLoadingLevel/jnew_2 "Load Touch" (unchecked-int (unchecked-subtract java.lang.Integer/MAX_VALUE 1))))
    (JR/fset this :LOAD_GAME (ResourceLoadingLevel/jnew_2 "Load Game" (unchecked-int (unchecked-subtract java.lang.Integer/MAX_VALUE 2))))
    (JR/fset this :LEVEL (ResourceLoadingLevel/jnew_2 "Level" (unchecked-int (unchecked-subtract java.lang.Integer/MAX_VALUE 99))))
    (JR/fset this :MAX_LEVEL (ResourceLoadingLevel/jnew_2 "Max Level" (unchecked-int (unchecked-subtract java.lang.Integer/MAX_VALUE 100))))
    (JR/fset this :LOAD_ALL (ResourceLoadingLevel/jnew_2 "Load All" (unchecked-int (unchecked-negate (JR/c2i 1)))))
    (JR/fset this :RESOURCE_LOADING_LEVEL_ARRAY (JR/afrom "Object" 1 [(JR/fget this :LOAD_ALL) (JR/fget this :MAX_LEVEL) (JR/fget this :LEVEL) (JR/fget this :LOAD_GAME) (JR/fget this :LOAD_TOUCH) (JR/fget this :LOAD_EARLY)]))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ResourceLoadingLevelFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ResourceLoadingLevelFactory/jstatic_instance)))

    
(defn jm_getLevelString_1 [this p_level]
  (let [ l_level (volatile! p_level) l_index (volatile! nil)](JR/method
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen (JR/fget this :RESOURCE_LOADING_LEVEL_ARRAY))) (do (JR/vinc l_index 1 :int false))
            (if (== @l_level (JR/invoke (JR/aget* (JR/fget this :RESOURCE_LOADING_LEVEL_ARRAY) @l_index) :jm_getLevel_0))
                (do
                (JR/jreturn (JR/invoke (JR/aget* (JR/fget this :RESOURCE_LOADING_LEVEL_ARRAY) @l_index) :jm_getName_0))))))
        (JR/s @l_level))))



