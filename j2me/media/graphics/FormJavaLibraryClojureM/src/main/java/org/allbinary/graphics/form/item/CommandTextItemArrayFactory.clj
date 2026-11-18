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
;; package org.allbinary.graphics.form.item

(ns CommandTextItemArrayFactory)

(JR/register 'CommandTextItemArrayFactory nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :list nil)
  (JR/fset this :visitorInterface nil)
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_1 [this p_visitorInterface]
  (let [ l_visitorInterface (volatile! p_visitorInterface)]
    nil (jinitfields this)
        (JR/fset this :visitorInterface @l_visitorInterface))
  this)

(defn jnew_1 [p_visitorInterface ]
  (let [o (JR/alloc 'CommandTextItemArrayFactory)] (jinit_1 o p_visitorInterface) o))

    
(defn jm_getInstance_3 [this p_vector p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_vector (volatile! p_vector) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor) l_vectorUtil (volatile! nil) l_size (volatile! nil) l_textItem (volatile! nil) l_priorityLimit (volatile! nil) l_displayInfo (volatile! nil) l_isLargeEnoughDisplayForBigMenu (volatile! nil) l_command (volatile! nil) l_aBoolean (volatile! nil) l_index (volatile! nil) l_textItemArray (volatile! nil) l_size2 (volatile! nil)]
        (vreset! l_vectorUtil (JR/scall 'VectorUtil :jm_getInstance_0))
        (vreset! l_size (JR/invoke @l_vectorUtil :jm_getSize_1 @l_vector))
        (JR/invoke (JR/fget this :list) :jm_clear_0)
        (vreset! l_textItem nil)
        (vreset! l_priorityLimit 7)
        (vreset! l_displayInfo (JR/scall 'DisplayInfoSingleton :jm_getInstance_0))
        (vreset! l_isLargeEnoughDisplayForBigMenu (or (and (JR/invoke @l_displayInfo :jm_isPortrait_0) (>= (JR/invoke @l_displayInfo :jm_getLastHeight_0) (JR/fget (JR/scall 'ScreenInfo :jm_getInstance_0) :MEDIUM_WIDTH))) (and (not (JR/invoke @l_displayInfo :jm_isPortrait_0)) (>= (JR/invoke @l_displayInfo :jm_getLastWidth_0) (JR/fget (JR/scall 'ScreenInfo :jm_getInstance_0) :MEDIUM_WIDTH)))))
        (if (and (not @l_isLargeEnoughDisplayForBigMenu) (> @l_size 3))
            (do
            (vreset! l_priorityLimit 3)))
        (vreset! l_command nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_command (JR/invoke @l_vectorUtil :jm_elementAt_2 @l_vector @l_index))
            (if (< (JR/invoke @l_command :jm_getPriority_0) @l_priorityLimit)
                (do
                (vreset! l_aBoolean (JR/invoke (JR/fget this :visitorInterface) :jm_visit_1 @l_command))
                (if (JR/invoke @l_aBoolean :jm_booleanValue_0)
                    (do
                    (vreset! l_textItem (CommandTextItem/jnew_5 @l_command (JR/sget 'ImageItem "LAYOUT_DEFAULT") (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) @l_backgroundBasicColor @l_foregroundBasicColor))
                    (JR/invoke (JR/fget this :list) :jm_add_1 @l_textItem)))))))
        (vreset! l_textItemArray (JR/anew "Object" 1 (JR/invoke (JR/fget this :list) :jm_size_0)))
        (vreset! l_size2 (JR/alen @l_textItemArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size2) (do (JR/vinc l_index 1 :int false))
            (JR/aset* @l_textItemArray @l_index (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))))
        @l_textItemArray))



