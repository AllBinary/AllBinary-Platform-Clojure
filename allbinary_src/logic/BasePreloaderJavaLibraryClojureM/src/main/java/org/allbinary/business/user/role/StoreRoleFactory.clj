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
;; package org.allbinary.business.user.role

(ns StoreRoleFactory)

(JR/register 'StoreRoleFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (StoreRoleFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :roles nil)
  (JR/fset this :subscriberRoles nil)
  (JR/fset this :wholesaleRoles nil)
    (JR/fset this :roles (BasicArrayListD/jnew_0))
    (JR/fset this :subscriberRoles (BasicArrayListD/jnew_0))
    (JR/fset this :wholesaleRoles (BasicArrayListD/jnew_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (StoreRoleFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_basicUserRoleFactory (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_basicUserRoleFactory (JR/scall 'BasicUserRoleFactory :jm_getInstance_0))
        (JR/invoke (JR/fget this :roles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :CUSTOMER))
        (JR/invoke (JR/fget this :roles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :SUBSCRIBERCUSTOMER))
        (JR/invoke (JR/fget this :roles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :WHOLESALECUSTOMER))
        (JR/invoke (JR/fget this :subscriberRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :SUBSCRIBERCUSTOMER))
        (JR/invoke (JR/fget this :wholesaleRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :WHOLESALECUSTOMER)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'StoreRoleFactory)] (jinit_0 o) o))

    
(defn jm_getRoles_0 [this]
  (let []
        (JR/fget this :roles)))

    
(defn jm_getSubscriberRoles_0 [this]
  (let []
        (JR/fget this :subscriberRoles)))

    
(defn jm_getWholesaleRoles_0 [this]
  (let []
        (JR/fget this :wholesaleRoles)))



