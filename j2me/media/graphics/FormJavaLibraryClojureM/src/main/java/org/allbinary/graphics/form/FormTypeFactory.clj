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

(ns FormTypeFactory)

(JR/register 'FormTypeFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (FormTypeFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :UNK nil)
  (JR/fset this :NULL_FORM_TYPE nil)
  (JR/fset this :TEMP_HORIZONTAL_FORM nil)
  (JR/fset this :HORIZONTAL_FORM nil)
  (JR/fset this :VERTICAL_CENTER_FORM nil)
    (JR/fset this :UNK "Unknown FormType")
    (JR/fset this :NULL_FORM_TYPE (FormType/jnew_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :NULL_STRING)))
    (JR/fset this :TEMP_HORIZONTAL_FORM (FormType/jnew_1 "TempHorizontal"))
    (JR/fset this :HORIZONTAL_FORM (FormType/jnew_1 "Horizontal"))
    (JR/fset this :VERTICAL_CENTER_FORM (FormType/jnew_1 "Vertical"))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'FormTypeFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (FormTypeFactory/jstatic_instance)))

    
(defn jm_getFormType_0 [this]
  (let [ l_displayInfo (volatile! nil) l_formType (volatile! nil)]
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_formType nil)
        (if (JR/invoke @l_displayInfo :jm_isPortrait_0)
            (do
            (vreset! l_formType (JR/fget this :VERTICAL_CENTER_FORM)))
            (do
            (vreset! l_formType (JR/fget this :HORIZONTAL_FORM))))
        @l_formType))



