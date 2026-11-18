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
;; package org.allbinary.game.paint

(ns GameScrollMenuPaintable)

(JR/register 'GameScrollMenuPaintable 'BasicGameDemoPaintable '[ColorChangeListener])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_4 [this p_mainDemoStatePaintable p_ownershipPaintable p_helpPaintableInterface p_basicColor]
  (let [ l_mainDemoStatePaintable (volatile! p_mainDemoStatePaintable) l_ownershipPaintable (volatile! p_ownershipPaintable) l_helpPaintableInterface (volatile! p_helpPaintableInterface) l_basicColor (volatile! p_basicColor)]
        (BasicGameDemoPaintable/jinit_3 this @l_mainDemoStatePaintable @l_ownershipPaintable @l_helpPaintableInterface) (jinitfields this)
        (JR/invoke this :jm_setColor_1 @l_basicColor)
        (JR/invoke (JR/scall 'ColorChangeEventHandler :jm_getInstance_0) :jm_addListenerInterface_1 this))
  this)

(defn jnew_4 [p_mainDemoStatePaintable p_ownershipPaintable p_helpPaintableInterface p_basicColor ]
  (let [o (JR/alloc 'GameScrollMenuPaintable)] (jinit_4 o p_mainDemoStatePaintable p_ownershipPaintable p_helpPaintableInterface p_basicColor) o))

    
(defn jm_setState_1 [this p_state]
  (let [ l_state (volatile! p_state)]
        (JR/invoke this :jm_setCurrentStatePaintable_1 (JR/invoke this :jm_getMainDemoStatePaintable_0))))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        nil))

    
(defn jm_setColor_1 [this p_basicColor]
  (let [ l_basicColor (volatile! p_basicColor) l_mainGameDemoStatePaintable (volatile! nil) l_formPaintable (volatile! nil) l_scrollSelectionForm (volatile! nil) l_item (volatile! nil) l_stringComponent (volatile! nil) l_index (volatile! nil)]
        (vreset! l_mainGameDemoStatePaintable (JR/invoke this :jm_getMainDemoStatePaintable_0))
        (vreset! l_formPaintable (JR/invoke @l_mainGameDemoStatePaintable :jm_getMenuPaintableInterface_0))
        (vreset! l_scrollSelectionForm (JR/invoke @l_formPaintable :jm_getForm_0))
        (JR/invoke (JR/invoke @l_mainGameDemoStatePaintable :jm_getOwnershipPaintableInterface_0) :jm_setBasicColorP_1 @l_basicColor)
        (JR/invoke @l_scrollSelectionForm :jm_setButtonBasicColor_1 @l_basicColor)
        (vreset! l_item nil)
        (vreset! l_stringComponent nil)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke @l_scrollSelectionForm :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_item (JR/invoke @l_scrollSelectionForm :jm_get_1 @l_index))
            (vreset! l_stringComponent (JR/invoke @l_item :jm_getLabelStringComponent_0))
            (if (some? @l_stringComponent)
                (do
                (JR/invoke @l_stringComponent :jm_setForegroundBasicColor_1 @l_basicColor)))))))



