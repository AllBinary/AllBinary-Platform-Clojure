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

(ns AdminRoleFactory)

(JR/register 'AdminRoleFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AdminRoleFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :adminRoles nil)
  (JR/fset this :storeAdminRoles nil)
  (JR/fset this :storeManagementRoles nil)
  (JR/fset this :productManagementRoles nil)
  (JR/fset this :reviewManagementRoles nil)
  (JR/fset this :customerManagementRoles nil)
  (JR/fset this :workflowManagementRoles nil)
  (JR/fset this :orderManagementRoles nil)
  (JR/fset this :adjusterManagementRoles nil)
  (JR/fset this :shippingManagementRoles nil)
  (JR/fset this :webManagementRoles nil)
    (JR/fset this :adminRoles (BasicArrayListD/jnew_0))
    (JR/fset this :storeAdminRoles (BasicArrayListD/jnew_0))
    (JR/fset this :storeManagementRoles (BasicArrayListD/jnew_0))
    (JR/fset this :productManagementRoles (BasicArrayListD/jnew_0))
    (JR/fset this :reviewManagementRoles (BasicArrayListD/jnew_0))
    (JR/fset this :customerManagementRoles (BasicArrayListD/jnew_0))
    (JR/fset this :workflowManagementRoles (BasicArrayListD/jnew_0))
    (JR/fset this :orderManagementRoles (BasicArrayListD/jnew_0))
    (JR/fset this :adjusterManagementRoles (BasicArrayListD/jnew_0))
    (JR/fset this :shippingManagementRoles (BasicArrayListD/jnew_0))
    (JR/fset this :webManagementRoles (BasicArrayListD/jnew_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AdminRoleFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_basicUserRoleFactory (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_basicUserRoleFactory (JR/scall 'BasicUserRoleFactory :jm_getInstance_0))
        (JR/invoke (JR/fget this :adminRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :storeAdminRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :storeAdminRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :storeManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :storeManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :storeManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :CUSTOMERMANAGER))
        (JR/invoke (JR/fget this :storeManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADJUSTER))
        (JR/invoke (JR/fget this :storeManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :PRODUCTMANAGER))
        (JR/invoke (JR/fget this :storeManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :REVIEWER))
        (JR/invoke (JR/fget this :storeManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :SHIPPING))
        (JR/invoke (JR/fget this :productManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :productManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :productManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :PRODUCTMANAGER))
        (JR/invoke (JR/fget this :reviewManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :reviewManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :reviewManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :REVIEWER))
        (JR/invoke (JR/fget this :customerManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :customerManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :customerManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :CUSTOMERMANAGER))
        (JR/invoke (JR/fget this :workflowManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :workflowManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :workflowManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :WORKFLOWEDITOR))
        (JR/invoke (JR/fget this :orderManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :orderManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :adjusterManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :adjusterManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :adjusterManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADJUSTER))
        (JR/invoke (JR/fget this :shippingManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :shippingManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :shippingManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :SHIPPING))
        (JR/invoke (JR/fget this :webManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :ADMINISTRATOR))
        (JR/invoke (JR/fget this :webManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :STOREMANAGER))
        (JR/invoke (JR/fget this :webManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :WEBMANAGER))
        (JR/invoke (JR/fget this :webManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :WORKFLOWEDITOR))
        (JR/invoke (JR/fget this :webManagementRoles) :jm_add_1 (JR/fget @l_basicUserRoleFactory :VIEWEDITOR)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'AdminRoleFactory)] (jinit_0 o) o))

    
(defn jm_getProductManagementRoles_0 [this]
  (let []
        (JR/fget this :productManagementRoles)))

    
(defn jm_getAdminRoles_0 [this]
  (let []
        (JR/fget this :adminRoles)))

    
(defn jm_getStoreAdminRoles_0 [this]
  (let []
        (JR/fget this :storeAdminRoles)))

    
(defn jm_getStoreManagementRoles_0 [this]
  (let []
        (JR/fget this :storeManagementRoles)))

    
(defn jm_getReviewManagementRoles_0 [this]
  (let []
        (JR/fget this :reviewManagementRoles)))

    
(defn jm_getCustomerManagementRoles_0 [this]
  (let []
        (JR/fget this :customerManagementRoles)))

    
(defn jm_getWorkflowManagementRoles_0 [this]
  (let []
        (JR/fget this :workflowManagementRoles)))

    
(defn jm_getWebManagementRoles_0 [this]
  (let []
        (JR/fget this :webManagementRoles)))

    
(defn jm_getShippingManagementRoles_0 [this]
  (let []
        (JR/fget this :shippingManagementRoles)))

    
(defn jm_getAdjusterManagementRoles_0 [this]
  (let []
        (JR/fget this :adjusterManagementRoles)))

    
(defn jm_getOrderManagementRoles_0 [this]
  (let []
        (JR/fget this :orderManagementRoles)))



