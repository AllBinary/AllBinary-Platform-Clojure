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

(ns CompositeGroup)

(JR/register 'CompositeGroup nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :groupInterface nil)
  (JR/fset this :list nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_1 [this p_groupInterface]
  (let [ l_groupInterface (volatile! p_groupInterface)]
    nil (jinitfields this)
        (JR/fset this :groupInterface @l_groupInterface))
  this)

(defn jnew_1 [p_groupInterface ]
  (let [o (JR/alloc 'CompositeGroup)] (jinit_1 o p_groupInterface) o))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_clear_0)))

    
(defn jm_add_1 [this p_groupInterface]
  (let [ l_groupInterface (volatile! p_groupInterface) l_commonStrings (volatile! nil) l_groupCommonFactory (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (vreset! l_groupCommonFactory (JR/scall 'GroupCommonFactory :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_groupCommonFactory :ADDING_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of @l_groupInterface))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_groupCommonFactory :TO_LABEL))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 (JR/fget this :groupInterface)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget @l_commonStrings :ADD))
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_groupInterface)))

    
(defn jm_isInGroup_1 [this p_groupInterface]
  (let [ l_groupInterface (volatile! p_groupInterface)]
        (if (JR/invoke (JR/fget this :list) :jm_contains_1 @l_groupInterface)
            (do
            true)
            (do
            false))))

    
(defn jm_getGroup_0 [this]
  (let []
        (JR/fget this :groupInterface)))



