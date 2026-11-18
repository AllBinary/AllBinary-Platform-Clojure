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
;; package org.allbinary.canvas

;;ActualPlatform
(ns GameStatisticsFactory)

(JR/register 'GameStatisticsFactory 'BaseGameStatistics '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (GameStatisticsFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :stringBuffer nil)
    (JR/fset this :stringBuffer (StringMaker/jnew_0))
  this)

(defn jinit_0 [this]
  (BaseGameStatistics/jinit_0 this)
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'GameStatisticsFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GameStatisticsFactory/jstatic_instance)))

    
(defn jm_add_1 [this p_string]
  (let [ l_string (volatile! p_string)]
        (if (> (JR/invoke (JR/fget this :stringBuffer) :jm_length_0) 12000)
            (do
            (JR/invoke (JR/fget this :stringBuffer) :jm_delete_2 0 (JR/invoke (JR/fget this :stringBuffer) :jm_length_0))
            (JR/invoke (JR/fget this :stringBuffer) :jm_append_1 "Old Stats Cleared")))
        (JR/invoke (JR/fget this :stringBuffer) :jm_append_1 @l_string)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/to-string-of this)) :jm_append_1 (JR/to-string-of (JR/fget this :stringBuffer))))))



