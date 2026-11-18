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
;; package org.allbinary.graphics.form.item

(ns CommandTextItem)

(JR/register 'CommandTextItem 'ABTextItem '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :command nil)
  this)

    
(defn jinit_5 [this p_command p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_command (volatile! p_command) l_layout (volatile! p_layout) l_altText (volatile! p_altText) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ABTextItem/jinit_5 this (JR/invoke @l_command :jm_getLabel_0) @l_layout @l_altText @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this)
        (JR/fset this :command @l_command))
  this)

(defn jnew_5 [p_command p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'CommandTextItem)] (jinit_5 o p_command p_layout p_altText p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_isFocusable_0 [this]
  (let []
        true))

    
(defn jm_getCommand_0 [this]
  (let []
        (JR/fget this :command)))



