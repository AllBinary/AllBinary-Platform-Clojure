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
;; package org.allbinary.game.layer.resources

(ns BasicGameResources)

(JR/register 'BasicGameResources nil '[])

(def jsv_stringBuffer (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_stringBuffer [] (JR/ensure-init jclinit-state jclinit) @jsv_stringBuffer)
(defn jstatic_set_stringBuffer [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_stringBuffer v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_stringBuffer (StringMaker/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :RESOURCE nil)
  (JR/fset this :RESOURCE_DESTROY nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :RESOURCE (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
    (JR/fset this :RESOURCE_DESTROY (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'BasicGameResources)] (jinit_0 o) o))

    
(defn jm_init_2 [this p_ROOT p_SIZE]
  (let [ l_ROOT (volatile! p_ROOT) l_SIZE (volatile! p_SIZE) l_scale (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_scale (JR/invoke (JR/invoke (JR/fget (JR/scall 'GameConfigurationCentral :jm_getInstance_0) :SCALE) :jm_getValue_0) :jm_intValue_0))
            (if (and (> @l_scale 1) (< (unchecked-int (unchecked-subtract @l_scale 1)) (JR/alen @l_SIZE)))
                (do
                (JR/invoke this :jm_append_2 @l_ROOT (JR/aget* @l_SIZE (unchecked-int (unchecked-subtract @l_scale 1)))))
                (do
                (JR/jthrow (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Invalid Value: ") :jm_appendint_1 @l_scale)))))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :INIT) @l_e)) :else (throw jt)))))))

    
(defn jm_append_2 [this p_ROOT p_sizeString]
  (let [ l_ROOT (volatile! p_ROOT) l_sizeString (volatile! p_sizeString) l_DESTROY (volatile! nil) l_string (volatile! nil)]
        (vreset! l_DESTROY "_destroy")
        (vreset! l_string (JR/invoke this :jm_getString_0))
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_delete_2 0 (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_length_0))
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_append_1 @l_ROOT)
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_append_1 @l_string)
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_append_1 @l_sizeString)
        (JR/fset this :RESOURCE (JR/to-string-of (BasicGameResources/jstatic_stringBuffer)))
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_delete_2 0 (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_length_0))
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_append_1 @l_ROOT)
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_append_1 @l_DESTROY)
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_append_1 @l_string)
        (JR/invoke (BasicGameResources/jstatic_stringBuffer) :jm_append_1 @l_sizeString)
        (JR/fset this :RESOURCE_DESTROY (JR/to-string-of (BasicGameResources/jstatic_stringBuffer)))))

    
(defn jm_getString_0 [this]
  (let []
        (JR/invoke (JR/scall 'GameGraphicsResourceUtil :jm_getInstance_0) :jm_getName_0)))



