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

(ns GroupFactory)

(JR/register 'GroupFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GroupFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :NULL_GROUP_ARRAY nil)
  (JR/fset this :list nil)
  (JR/fset this :index 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :NULL_GROUP_ARRAY (JR/anew "Object" 1 0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
    (JR/fset this :index 0)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GroupFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GroupFactory/jstatic_instance)))

    
(defn jm_getNextGroup_0 [this]
  (let [ l_group (volatile! nil)]
        (vreset! l_group (JR/aget* (JR/fget (JR/fget this :list) :objectArray) (JR/fget this :index)))
        (JR/finc this :index 1 :int false)
        @l_group))

    
(defn jm_getNextGroupByName_1 [this p_name]
  (let [ l_name (volatile! p_name) l_group (volatile! nil)]
        (vreset! l_group (JR/invoke this :jm_getNextGroup_0))
        (JR/invoke @l_group :jm_setName_1 @l_name)
        @l_group))

    
(defn jm_init_2 [this p_groups p_nameArray]
  (let [ l_groups (volatile! p_groups) l_nameArray (volatile! p_nameArray) l_stringMaker (volatile! nil) l_stringUtil (volatile! nil) l_TEAM (volatile! nil) l_size (volatile! nil) l_name (volatile! nil)]
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_stringUtil (JR/scall 'StringUtil :jm_getInstance_0))
        (vreset! l_TEAM "Team ")
        (JR/invoke (JR/fget this :list) :jm_clear_0)
        (JR/fset this :index 0)
        (vreset! l_size (JR/invoke (JR/fget this :list) :jm_size_0))
        (vreset! l_name nil)
        (JR/jwhile false false (< @l_size @l_groups)
            (vreset! l_name (JR/fget @l_stringUtil :EMPTY_STRING))
            (if (< @l_size (JR/alen @l_nameArray))
                (do
                (vreset! l_name (JR/aget* @l_nameArray @l_size)))
                (do
                (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
                (vreset! l_name (JR/to-string-of (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 @l_TEAM) :jm_appendint_1 @l_size)))))
            (JR/invoke (JR/fget this :list) :jm_add_1 (Group/jnew_2 @l_name (JR/i16 (unchecked-int (unchecked-add @l_size 3)))))
            (JR/vinc l_size 1 :int false))))



