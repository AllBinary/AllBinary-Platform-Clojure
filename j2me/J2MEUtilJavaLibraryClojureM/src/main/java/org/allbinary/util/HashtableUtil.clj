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
;; package org.allbinary.util

(ns HashtableUtil)

(JR/register 'HashtableUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (HashtableUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :enumerationUtil nil)
    (JR/fset this :enumerationUtil (JR/scall 'EnumerationUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'HashtableUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (HashtableUtil/jstatic_instance)))

    
(defn jm_putAll_2 [this p_fromHashtable p_hashtable]
  (let [ l_fromHashtable (volatile! p_fromHashtable) l_hashtable (volatile! p_hashtable) l_enumeration (volatile! nil) l_keyCanBeNull (volatile! nil) l_valueCanBeNull (volatile! nil)]
        (vreset! l_enumeration (JR/invoke @l_fromHashtable :jm_keys_0))
        (vreset! l_keyCanBeNull nil)
        (vreset! l_valueCanBeNull nil)
        (JR/jwhile false false (JR/invoke (JR/fget this :enumerationUtil) :jm_hasMoreElements_1 @l_enumeration)
            (vreset! l_keyCanBeNull (JR/invoke (JR/fget this :enumerationUtil) :jm_nextElement_1 @l_enumeration))
            (vreset! l_valueCanBeNull (JR/invoke @l_hashtable :jm_get_1 @l_keyCanBeNull))
            (if (nil? @l_valueCanBeNull)
                (do
                nil)
                (do
                (JR/invoke @l_hashtable :jm_put_2 @l_keyCanBeNull @l_valueCanBeNull))))))

    
(defn jm_getKeysAsArray_1 [this p_hashtable]
  (let [ l_hashtable (volatile! p_hashtable) l_objectArray (volatile! nil) l_index (volatile! nil) l_enumeration (volatile! nil)]
        (vreset! l_objectArray (JR/anew "Object" 1 (JR/invoke @l_hashtable :jm_size_0)))
        (vreset! l_index 0)
        (vreset! l_enumeration (JR/invoke @l_hashtable :jm_keys_0))
        (JR/jwhile false false (JR/invoke (JR/fget this :enumerationUtil) :jm_hasMoreElements_1 @l_enumeration)
            (JR/aset* @l_objectArray (JR/vinc l_index 1 :int true) (JR/invoke (JR/fget this :enumerationUtil) :jm_nextElement_1 @l_enumeration)))
        @l_objectArray))

    
(defn jm_getKeysAsList_1 [this p_hashtable]
  (let [ l_hashtable (volatile! p_hashtable) l_list (volatile! nil) l_enumeration (volatile! nil)]
        (vreset! l_list (BasicArrayListS/jnew_1 (JR/invoke @l_hashtable :jm_size_0)))
        (vreset! l_enumeration (JR/invoke @l_hashtable :jm_keys_0))
        (JR/jwhile false false (JR/invoke (JR/fget this :enumerationUtil) :jm_hasMoreElements_1 @l_enumeration)
            (JR/invoke @l_list :jm_add_1 (JR/invoke (JR/fget this :enumerationUtil) :jm_nextElement_1 @l_enumeration)))
        @l_list))



