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
;; package org.allbinary.game.input

(ns GameInputProcessorComposite)

(JR/register 'GameInputProcessorComposite 'PlayerGameInput '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :name nil)
  (JR/fset this :gameInputProcessorInterface nil)
  (JR/fset this :NAME_LABEL nil)
    (JR/fset this :NAME_LABEL " GameInputProcessorInterface: ")
  this)

    
(defn jinit_2 [this p_name p_gameInputProcessorInterface]
  (let [ l_name (volatile! p_name) l_gameInputProcessorInterface (volatile! p_gameInputProcessorInterface)]
        (PlayerGameInput/jinit_3 this (BasicArrayListD/jnew_0) (BasicArrayListD/jnew_0) (unchecked-int (unchecked-negate (JR/c2i 1)))) (jinitfields this)
        (JR/fset this :name @l_name)
        (JR/fset this :gameInputProcessorInterface @l_gameInputProcessorInterface))
  this)

(defn jnew_2 [p_name p_gameInputProcessorInterface ]
  (let [o (JR/alloc 'GameInputProcessorComposite)] (jinit_2 o p_name p_gameInputProcessorInterface) o))

    
(defn jm_update_0 [this]
  (let [ l_list (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_list (JR/invoke this :jm_getGameKeyEventList_0))
            (JR/invoke (JR/fget this :gameInputProcessorInterface) :jm_onInput_1 @l_list))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :UPDATE) @l_e)) :else (throw jt)))))))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/to-string-of this)) :jm_append_1 (JR/fget this :NAME_LABEL)) :jm_append_1 (JR/fget this :name)))))



