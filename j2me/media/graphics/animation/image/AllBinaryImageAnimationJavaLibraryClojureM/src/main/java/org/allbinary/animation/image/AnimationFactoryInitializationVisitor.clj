;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package org.allbinary.animation.image

(ns AnimationFactoryInitializationVisitor)

(JR/register 'AnimationFactoryInitializationVisitor nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :width 0)
  (JR/fset this :height 0)
  (JR/fset this :dx 0)
  (JR/fset this :dy 0)
  (JR/fset this :originalDx 0)
  (JR/fset this :originalDy 0)
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AnimationFactoryInitializationVisitor)] (jinit_0 o) o))

    
(defn jm_visit_0 [this]
  (let []
        nil))

    
(defn jm_toString_0 [this]
  (let [ l_commonSeps (volatile! nil) l_commonLabels (volatile! nil) l_stringBuffer (volatile! nil)]
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (vreset! l_commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'PositionStrings :jm_getInstance_0) :DX_LABEL)) :jm_appendfloat_1 (JR/f32 (JR/fget this :dx)))
        (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'PositionStrings :jm_getInstance_0) :DY_LABEL)) :jm_appendfloat_1 (JR/f32 (JR/fget this :dy)))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :WIDTH_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :width))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :HEIGHT_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/fget this :height))
        (JR/to-string-of @l_stringBuffer)))



