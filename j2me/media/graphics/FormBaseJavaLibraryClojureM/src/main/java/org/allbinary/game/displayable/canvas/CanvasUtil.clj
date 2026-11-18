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
;; package org.allbinary.game.displayable.canvas

(ns CanvasUtil)

(JR/register 'CanvasUtil nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'CanvasUtil)] (jinit_0 o) o))

    
(defn jm_getKeyName_1 [p_key]
  (let [this nil l_key (volatile! p_key) l_commonPhoneStrings (volatile! nil)](JR/method
        (vreset! l_commonPhoneStrings (JR/scall 'CommonPhoneStrings :jm_getInstance_0))
        (if (JR/eq @l_key (JR/sget 'Canvas "UP"))
            (do
            (JR/jreturn (JR/fget @l_commonPhoneStrings :UP)))
            (if (JR/eq @l_key (JR/sget 'Canvas "DOWN"))
            (do
            (JR/jreturn (JR/fget @l_commonPhoneStrings :DOWN)))
            (if (JR/eq @l_key (JR/sget 'Canvas "RIGHT"))
            (do
            (JR/jreturn (JR/fget @l_commonPhoneStrings :RIGHT)))
            (if (JR/eq @l_key (JR/sget 'Canvas "LEFT"))
            (do
            (JR/jreturn (JR/fget @l_commonPhoneStrings :LEFT)))
            (if (JR/eq @l_key (JR/sget 'Canvas "FIRE"))
            (do
            (JR/jreturn (JR/fget @l_commonPhoneStrings :FIRE))))))))
        "UNKNOWN KEY")))



