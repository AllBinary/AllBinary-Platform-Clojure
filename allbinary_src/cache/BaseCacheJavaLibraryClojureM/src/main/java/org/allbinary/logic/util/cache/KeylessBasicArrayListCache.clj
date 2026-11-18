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
;; package org.allbinary.logic.util.cache

(ns KeylessBasicArrayListCache)

(JR/register 'KeylessBasicArrayListCache 'IndexedBasicArrayListCache '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :basicArrayListUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :basicArrayListUtil (JR/scall 'BasicArrayListUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    (IndexedBasicArrayListCache/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'KeylessBasicArrayListCache)] (jinit_0 o) o))

    
(defn jm_get_0 [this]
  (let [ l_list (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (if (>= (JR/fget this :index) (JR/invoke (JR/fget this :list) :jm_size_0))
                (do
                (JR/invoke this :jm_addDefault_0)))
            (vreset! l_list (JR/invoke this :jm_getAt_1 (JR/finc this :index 1 :any true)))
            (JR/jreturn @l_list))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :GET) @l_e)
            (JR/jreturn (JR/invoke (JR/fget this :basicArrayListUtil) :jm_getImmutableInstance_0))) :else (throw jt))))))))

    
(defn jm_clear_0 [this]
  (let [ l_basicArrayList (volatile! nil) l_index (volatile! nil)]
        (JR/invoke-super 'IndexedBasicArrayListCache this :jm_clear_0)
        (vreset! l_basicArrayList nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :list) :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_basicArrayList (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
            (JR/invoke @l_basicArrayList :jm_clear_0)))))

    
(defn jm_log_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_S_LABEL (volatile! nil) l_basicArrayList (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "S: ")
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke (JR/fget this :list) :jm_size_0))
        (vreset! l_S_LABEL " s: ")
        (vreset! l_basicArrayList nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :list) :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_S_LABEL)
            (vreset! l_basicArrayList (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
            (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke @l_basicArrayList :jm_size_0))))
        (JR/to-string-of @l_stringBuffer)))



