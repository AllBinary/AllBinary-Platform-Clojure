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
;; package org.allbinary.graphics.form

(ns CommandCurrentSelectionFormFactory)

(JR/register 'CommandCurrentSelectionFormFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CommandCurrentSelectionFormFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_8 [p_title p_items p_rectangle p_formType p_border p_moveForSmallScreen p_backgroundBasicColor p_foregroundBasicColor]
  (let [this nil l_title (volatile! p_title) l_items (volatile! p_items) l_rectangle (volatile! p_rectangle) l_formType (volatile! p_formType) l_border (volatile! p_border) l_moveForSmallScreen (volatile! p_moveForSmallScreen) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_scrollSelectionForm (volatile! nil)]
        (if (JR/invoke (JR/scall 'Features :jm_getInstance_0) :jm_isFeature_1 (JR/fget (JR/scall 'TouchFeatureFactory :jm_getInstance_0) :TOUCH_ENABLED))
            (do
            (vreset! l_scrollSelectionForm (CommandCurrentSelectionForm/jnew_6 @l_title @l_items @l_border @l_moveForSmallScreen @l_backgroundBasicColor @l_foregroundBasicColor))
            (JR/invoke @l_scrollSelectionForm :jm_init_2 @l_rectangle @l_formType)
            @l_scrollSelectionForm)
            (do
            (JR/scall 'ScrollSelectionFormNoneFactory :jm_getInstance_0)))))



