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
;; package org.allbinary.globals

(ns PATH_GLOBALS)

(JR/register 'PATH_GLOBALS nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (PATH_GLOBALS/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :DATA_PATH nil)
  (JR/fset this :INIT_PATH nil)
  (JR/fset this :VIEWS_PATH nil)
  (JR/fset this :LOG_PATH nil)
  (JR/fset this :BACKUP_PATH nil)
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (PATH_GLOBALS/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_abPathData (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_abPathData (JR/scall 'AbPathData :jm_getInstance_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "data")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_abPathData :SEPARATOR))
        (JR/fset this :DATA_PATH (JR/to-string-of @l_stringBuffer))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :DATA_PATH))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonStrings :jm_getInstance_0) :INIT))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_abPathData :SEPARATOR))
        (JR/fset this :INIT_PATH (JR/to-string-of @l_stringBuffer))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :DATA_PATH))
        (JR/invoke @l_stringBuffer :jm_append_1 "log")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_abPathData :SEPARATOR))
        (JR/fset this :LOG_PATH (JR/to-string-of @l_stringBuffer))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :DATA_PATH))
        (JR/invoke @l_stringBuffer :jm_append_1 "backup")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_abPathData :SEPARATOR))
        (JR/fset this :BACKUP_PATH (JR/to-string-of @l_stringBuffer))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :INIT_PATH))
        (JR/invoke @l_stringBuffer :jm_append_1 "views")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_abPathData :SEPARATOR))
        (JR/fset this :VIEWS_PATH (JR/to-string-of @l_stringBuffer)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'PATH_GLOBALS)] (jinit_0 o) o))



