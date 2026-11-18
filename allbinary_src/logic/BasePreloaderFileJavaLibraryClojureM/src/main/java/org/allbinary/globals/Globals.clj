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

(ns Globals)

(JR/register 'Globals nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (Globals/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (Globals/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'Globals)] (jinit_0 o) o))

    
(defn jm_init_2 [this p_classLoader p_pathString]
  (let [ l_classLoader (volatile! p_classLoader) l_pathString (volatile! p_pathString) l_commonStrings (volatile! nil) l_appUrlGlobals (volatile! nil) l_stringBuffer (volatile! nil) l_stringValidationUtil (volatile! nil)]
        (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
        (vreset! l_appUrlGlobals (AppUrlGlobals/jnew_0))
        (JR/invoke @l_appUrlGlobals :jm_setWebappPath_1 @l_pathString)
        (JR/invoke (JR/sget 'Globals "URLGLOBALS") :jm_init_1 @l_appUrlGlobals)
        (JR/scall 'WebappClassLoaderInfo :jm_setLoader_1 @l_classLoader)
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Setting Up AllBinary System Configuration Args: ")
        (JR/invoke @l_stringBuffer :jm_append_1 @l_pathString)
        (JR/invoke @l_stringBuffer :jm_append_1 " ClassLoader: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/class-name @l_classLoader))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget @l_commonStrings :INIT))
        (vreset! l_stringValidationUtil (JR/scall 'StringValidationUtil :jm_getInstance_0))
        (if (JR/invoke @l_stringValidationUtil :jm_isEmpty_1 @l_pathString)
            (do
            (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
            (JR/invoke @l_stringBuffer :jm_append_1 "No Path Provided. Using Process Path: ")
            (JR/invoke @l_stringBuffer :jm_append_1 @l_pathString)
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :EQUALS))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/sget 'Globals "URLGLOBALS") :jm_getWebappPath_0))
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget @l_commonStrings :INIT))))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "Webapp Path Set To: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/sget 'Globals "URLGLOBALS") :jm_getWebappPath_0))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget @l_commonStrings :INIT))))



