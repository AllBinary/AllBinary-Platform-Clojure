;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2026 AllBinary 
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
;; package org.allbinary.business.user.role

(ns BasicUserRoles)

(JR/register 'BasicUserRoles nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicUserRoles/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :roleVector nil)
    (JR/fset this :roleVector (BasicArrayListD/jnew_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicUserRoles)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicUserRoles/jstatic_instance)))

    
(defn jm_getRole_1 [this p_role]
  (let [ l_role (volatile! p_role) l_roleVector (volatile! nil) l_size (volatile! nil) l_userRole (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_roleVector (JR/invoke this :jm_getAll_0))
        (vreset! l_size (JR/invoke @l_roleVector :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_userRole (JR/invoke @l_roleVector :jm_get_1 @l_index))
            (if (JR/eq (JR/invoke @l_role :jm_compareTo_1 (JR/to-string-of @l_userRole)) 0)
                (do
                (JR/jreturn @l_userRole)))))
        (JR/jthrow (new java.lang.Exception "Unable to get role - Unknown Role")))))

    
(defn jm_getAll_0 [this]
  (let []
        (JR/fget this :roleVector)))



