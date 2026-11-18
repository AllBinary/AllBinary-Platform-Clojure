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
;; package org.allbinary.media.audio

(ns PlayerQueue)

(JR/register 'PlayerQueue nil '[])

(def jsv_TOTAL (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_TOTAL [] (JR/ensure-init jclinit-state jclinit) @jsv_TOTAL)
(defn jstatic_set_TOTAL [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_TOTAL v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_TOTAL "Sounds In Queue: ")
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :list nil)
  (JR/fset this :max 0)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_1 [this p_max]
  (let [ l_max (volatile! p_max)]
    nil (jinitfields this)
        (JR/fset this :max @l_max))
  this)

(defn jnew_1 [p_max ]
  (let [o (JR/alloc 'PlayerQueue)] (jinit_1 o p_max) o))

    
(defn jm_add_1 [this p_sound]
  (let [ l_sound (volatile! p_sound) l_e (volatile! nil)]
        (try (do
            (if (not (JR/invoke (JR/fget this :list) :jm_contains_1 @l_sound))
                (do
                (JR/invoke (JR/fget this :list) :jm_add_1 @l_sound))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/scall 'PreLogUtil :jm_put_3 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :ADD))) :else (throw jt)))))))

    
(defn jm_process_0 [this]
  (let [ l_sound (volatile! nil) l_played (volatile! nil) l_resource (volatile! nil) l_e (volatile! nil)](JR/method
        (vreset! l_sound (JR/scall 'NoSound :jm_getInstance_0))
        (try (do
            (vreset! l_played false)
            (if (> (JR/invoke (JR/fget this :list) :jm_size_0) 0)
                (do
                (vreset! l_sound (JR/invoke (JR/fget this :list) :jm_removeAt_1 0))
                (if (some? @l_sound)
                    (do
                    (JR/invoke (JR/invoke @l_sound :jm_getPlayerP_0) :jm_start_0)))
                (JR/jwhile false false (> (JR/invoke (JR/fget this :list) :jm_size_0) (JR/fget this :max))
                    (JR/invoke (JR/fget this :list) :jm_removeAt_1 0))
                (vreset! l_played true)))
            (JR/jreturn @l_played))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_resource (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
            (if (some? @l_sound)
                (do
                (vreset! l_resource (JR/invoke @l_sound :jm_getResource_0))))
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :commonStrings) :EXCEPTION_LABEL)) :jm_append_1 @l_resource)) this (JR/fget (JR/fget this :commonStrings) :PROCESS))
            (JR/jreturn false)) :else (throw jt))))))))

    
(defn jm_clear_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_clear_0)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (PlayerQueue/jstatic_TOTAL)) :jm_appendint_1 (JR/invoke (JR/fget this :list) :jm_size_0)))))



