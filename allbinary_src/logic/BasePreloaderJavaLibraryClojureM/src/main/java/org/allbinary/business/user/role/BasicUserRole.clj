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

(ns BasicUserRole)

(JR/register 'BasicUserRole nil '[java.io.Serializable])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :m_int_RoleId 0)
  (JR/fset this :role nil)
  (JR/fset this :displayValue nil)
  (JR/fset this :sessionTimeout 0)
  (JR/fset this :sessionInactivityTimeout 0)
  this)

    
(defn jinit_4 [this p_aRole p_a_int_RoleId p_aSessionTimeout p_aSessionInactivityTimeout]
  (let [ l_aRole (volatile! p_aRole) l_a_int_RoleId (volatile! p_a_int_RoleId) l_aSessionTimeout (volatile! p_aSessionTimeout) l_aSessionInactivityTimeout (volatile! p_aSessionInactivityTimeout)]
        (jinit_5 this @l_aRole @l_aRole @l_a_int_RoleId @l_aSessionTimeout @l_aSessionInactivityTimeout))
  this)

(defn jnew_4 [p_aRole p_a_int_RoleId p_aSessionTimeout p_aSessionInactivityTimeout ]
  (let [o (JR/alloc 'BasicUserRole)] (jinit_4 o p_aRole p_a_int_RoleId p_aSessionTimeout p_aSessionInactivityTimeout) o))

    
(defn jinit_5 [this p_aRole p_aDisplayValue p_a_int_RoleId p_aSessionTimeout p_aSessionInactivityTimeout]
  (let [ l_aRole (volatile! p_aRole) l_aDisplayValue (volatile! p_aDisplayValue) l_a_int_RoleId (volatile! p_a_int_RoleId) l_aSessionTimeout (volatile! p_aSessionTimeout) l_aSessionInactivityTimeout (volatile! p_aSessionInactivityTimeout)]
    nil (jinitfields this)
        (JR/fset this :m_int_RoleId @l_a_int_RoleId)
        (JR/fset this :role @l_aRole)
        (JR/fset this :displayValue @l_aDisplayValue)
        (JR/fset this :sessionTimeout @l_aSessionTimeout)
        (JR/fset this :sessionInactivityTimeout @l_aSessionInactivityTimeout)
        (JR/invoke (JR/fget (JR/scall 'BasicUserRoles :jm_getInstance_0) :roleVector) :jm_add_1 this))
  this)

(defn jnew_5 [p_aRole p_aDisplayValue p_a_int_RoleId p_aSessionTimeout p_aSessionInactivityTimeout ]
  (let [o (JR/alloc 'BasicUserRole)] (jinit_5 o p_aRole p_aDisplayValue p_a_int_RoleId p_aSessionTimeout p_aSessionInactivityTimeout) o))

    
(defn jm_getRoleId_0 [this]
  (let []
        (JR/fget this :m_int_RoleId)))

    
(defn jm_getRole_0 [this]
  (let []
        (JR/fget this :role)))

    
(defn jm_getSessionTimeout_0 [this]
  (let []
        (JR/fget this :sessionTimeout)))

    
(defn jm_getSessionInactivityTimeout_0 [this]
  (let []
        (JR/fget this :sessionInactivityTimeout)))

    
(defn jm_equals_1 [this p_basicUserRole]
  (let [ l_basicUserRole (volatile! p_basicUserRole)](JR/method
        (if (== (JR/invoke this :jm_getRoleId_0) (JR/invoke @l_basicUserRole :jm_getRoleId_0))
            (do
            (JR/jreturn true)))
        false)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/invoke this :jm_getRole_0)))



