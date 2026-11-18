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

(ns CustomGameMenuUtil)

(JR/register 'CustomGameMenuUtil nil '[])

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
  (let [o (JR/alloc 'CustomGameMenuUtil)] (jinit_0 o) o))

    
(defn jm_add_1 [p_canvas]
  (let [this nil l_canvas (volatile! p_canvas) l_gameCommandsFactory (volatile! nil)]
        (vreset! l_gameCommandsFactory (JR/scall 'GameCommandsFactory :jm_getInstance_0))
        (if (JR/scall 'AppletUtil :jm_isAppletLoader_1 @l_canvas)
            (do
            nil)
            (if (JR/scall 'J2MEUtil :jm_isHTML_0)
            (do
            nil)
            (do
            (JR/invoke @l_canvas :jm_addCommand_1 (JR/fget @l_gameCommandsFactory :EXIT_COMMAND)))))))



