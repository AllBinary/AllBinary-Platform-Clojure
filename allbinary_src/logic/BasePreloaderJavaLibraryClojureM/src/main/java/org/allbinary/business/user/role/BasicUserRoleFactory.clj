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

(ns BasicUserRoleFactory)

(JR/register 'BasicUserRoleFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (BasicUserRoleFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :INACTIVITYTIMEOUT 0)
  (JR/fset this :CUSTOMERTIMEOUT 0)
  (JR/fset this :CUSTOMERMAXSESSIONTIME 0)
  (JR/fset this :MAXSESSIONTIME 0)
  (JR/fset this :INSTALLER nil)
  (JR/fset this :ADMINISTRATOR nil)
  (JR/fset this :CUSTOMER nil)
  (JR/fset this :SUBSCRIBERCUSTOMER nil)
  (JR/fset this :WHOLESALECUSTOMER nil)
  (JR/fset this :STOREMANAGER nil)
  (JR/fset this :PRODUCTMANAGER nil)
  (JR/fset this :CUSTOMERMANAGER nil)
  (JR/fset this :PAYMENTMANAGER nil)
  (JR/fset this :ORDERMANAGER nil)
  (JR/fset this :WEBMANAGER nil)
  (JR/fset this :REVIEWER nil)
  (JR/fset this :SHIPPING nil)
  (JR/fset this :ADJUSTER nil)
  (JR/fset this :WORKFLOWEDITOR nil)
  (JR/fset this :WIZARD nil)
  (JR/fset this :VIEWEDITOR nil)
    (JR/fset this :INACTIVITYTIMEOUT 360000000)
    (JR/fset this :CUSTOMERTIMEOUT 360000000)
    (JR/fset this :CUSTOMERMAXSESSIONTIME 360000000)
    (JR/fset this :MAXSESSIONTIME 360000000)
    (JR/fset this :INSTALLER (BasicUserRole/jnew_4 "Installer" 16 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :ADMINISTRATOR (BasicUserRole/jnew_4 "Administrator" 0 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :CUSTOMER (BasicUserRole/jnew_5 "CustomerUser" "Customer User" 1 (JR/fget this :CUSTOMERTIMEOUT) (JR/fget this :CUSTOMERMAXSESSIONTIME)))
    (JR/fset this :SUBSCRIBERCUSTOMER (BasicUserRole/jnew_5 "SubscriberUser" "Subscriber User" 2 (JR/fget this :CUSTOMERTIMEOUT) (JR/fget this :CUSTOMERMAXSESSIONTIME)))
    (JR/fset this :WHOLESALECUSTOMER (BasicUserRole/jnew_5 "WholesaleUser" "Wholesale User" 3 (JR/fget this :CUSTOMERTIMEOUT) (JR/fget this :CUSTOMERMAXSESSIONTIME)))
    (JR/fset this :STOREMANAGER (BasicUserRole/jnew_5 "StoreManager" "Store Manager" 4 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :PRODUCTMANAGER (BasicUserRole/jnew_5 "ProductManager" "Product Manager" 5 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :CUSTOMERMANAGER (BasicUserRole/jnew_5 "UserManager" "User Manager" 6 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :PAYMENTMANAGER (BasicUserRole/jnew_5 "PaymentManager" "Payment Manager" 7 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :ORDERMANAGER (BasicUserRole/jnew_5 "OrderManager" "Order Manager" 8 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :WEBMANAGER (BasicUserRole/jnew_5 "WebManager" "Web Manager" 9 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :REVIEWER (BasicUserRole/jnew_4 "Reviewer" 10 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :SHIPPING (BasicUserRole/jnew_4 "Shipping" 11 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :ADJUSTER (BasicUserRole/jnew_4 "Adjuster" 12 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :WORKFLOWEDITOR (BasicUserRole/jnew_5 "WorkFlowEditor" "WorkFlow Editor" 13 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :WIZARD (BasicUserRole/jnew_5 "WizardUser" "Wizard User" 14 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
    (JR/fset this :VIEWEDITOR (BasicUserRole/jnew_5 "ViewEditor" "View Editor" 15 (JR/fget this :MAXSESSIONTIME) (JR/fget this :INACTIVITYTIMEOUT)))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'BasicUserRoleFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (BasicUserRoleFactory/jstatic_instance)))



