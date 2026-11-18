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

(ns Group)

(JR/register 'Group nil '[GroupInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :teamId 0)
  (JR/fset this :string nil)
    (JR/fset this :name (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :string (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_2 [this p_teamName p_teamId]
  (let [ l_teamName (volatile! p_teamName) l_teamId (volatile! p_teamId)]
    nil (jinitfields this)
        (JR/fset this :teamId @l_teamId)
        (JR/invoke this :jm_setName_1 @l_teamName))
  this)

(defn jnew_2 [p_teamName p_teamId ]
  (let [o (JR/alloc 'Group)] (jinit_2 o p_teamName p_teamId) o))

    
(defn jm_getGroupName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_setName_1 [this p_name]
  (let [ l_name (volatile! p_name) l_groupCommonFactory (volatile! nil) l_stringBuffer (volatile! nil)]
        (JR/fset this :name @l_name)
        (vreset! l_groupCommonFactory (JR/scall 'GroupCommonFactory :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_groupCommonFactory :GROUP_NAME_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :name))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_groupCommonFactory :ID_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendshort_1 (JR/fget this :teamId))
        (JR/fset this :string (JR/to-string-of @l_stringBuffer))))

    
(defn jm_getGroupId_0 [this]
  (let []
        (JR/fget this :teamId)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/fget this :string)))



