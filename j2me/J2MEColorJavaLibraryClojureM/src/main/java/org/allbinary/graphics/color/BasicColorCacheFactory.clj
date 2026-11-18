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

(ns BasicColorCacheFactory)

(JR/register 'BasicColorCacheFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicColorCacheFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :hashtable nil)
    (JR/fset this :hashtable (JR/invoke (JR/scall 'StdUtil :jm_getInstance_0) :jm_createHashtable_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicColorCacheFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicColorCacheFactory)] (jinit_0 o) o))

    
(defn jm_add_1 [this p_basicDefaultColor]
  (let [ l_basicDefaultColor (volatile! p_basicDefaultColor)]
        (JR/invoke (JR/fget this :hashtable) :jm_put_2 (long (JR/invoke @l_basicDefaultColor :jm_intValue_0)) @l_basicDefaultColor)))

    
(defn jm_getAndOrCreate_1 [this p_integer]
  (let [ l_integer (volatile! p_integer) l_basicColor (volatile! nil)]
        (vreset! l_basicColor (JR/invoke (JR/fget this :hashtable) :jm_get_1 @l_integer))
        (if (nil? @l_basicColor)
            (do
            (vreset! l_basicColor (JR/invoke (JR/scall 'BasicColorFactory :jm_getInstance_0) :jm_createInstance_1 (JR/invoke @l_integer :jm_intValue_0)))
            (JR/invoke (JR/fget this :hashtable) :jm_put_2 @l_integer @l_basicColor)))
        @l_basicColor))



