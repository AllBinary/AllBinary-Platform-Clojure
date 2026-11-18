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
;; package org.allbinary.game.paint.help

(ns BasicInputMappingHelpPaintable)

(JR/register 'BasicInputMappingHelpPaintable 'HelpPaintable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :gameInputMappingArray nil)
  (JR/fset this :NONE nil)
    (JR/fset this :NONE (JR/fget (JR/scall 'GameKeyFactory :jm_getInstance_0) :NONE))
  this)

    
(defn jinit_2 [this p_gameInputMappingArray p_basicColor]
  (let [ l_gameInputMappingArray (volatile! p_gameInputMappingArray) l_basicColor (volatile! p_basicColor)]
        (HelpPaintable/jinit_3 this "Help Screen" (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) @l_basicColor) (jinitfields this)
        (JR/fset this :gameInputMappingArray @l_gameInputMappingArray)
        (JR/invoke this :jm_update_2 (JR/fget this :NONE) (JR/fget this :NONE)))
  this)

(defn jnew_2 [p_gameInputMappingArray p_basicColor ]
  (let [o (JR/alloc 'BasicInputMappingHelpPaintable)] (jinit_2 o p_gameInputMappingArray p_basicColor) o))

    
(defn jm_update_2 [this p_selectedGameKey p_selectedInput]
  (let [ l_selectedGameKey (volatile! p_selectedGameKey) l_selectedInput (volatile! p_selectedInput) l_gameKeyMapping (volatile! nil) l_EQUAL (volatile! nil) l_stringMaker (volatile! nil) l_size (volatile! nil) l_keyInfo (volatile! nil) l_gameInputMapping (volatile! nil) l_gameKey (volatile! nil) l_list (volatile! nil) l_index (volatile! nil)]
        (vreset! l_gameKeyMapping (JR/invoke (JR/scall 'PlatformInputMappingFactory :jm_getInstance_0) :jm_getPersistentInputMappingInstance_0))
        (vreset! l_EQUAL " = ")
        (vreset! l_stringMaker (StringMaker/jnew_0))
        (vreset! l_size (JR/alen (JR/fget this :gameInputMappingArray)))
        (vreset! l_keyInfo (JR/anew "String" 1 @l_size))
        (vreset! l_gameInputMapping nil)
        (vreset! l_gameKey nil)
        (vreset! l_list nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_gameInputMapping (JR/aget* (JR/fget this :gameInputMappingArray) @l_index))
            (vreset! l_gameKey (JR/invoke @l_gameInputMapping :jm_getGameKey_0))
            (vreset! l_list (JR/invoke (JR/invoke @l_gameKeyMapping :jm_getInputMapping_0) :jm_getMappedInput_1 @l_gameKey))
            (JR/invoke @l_stringMaker :jm_delete_2 0 (JR/invoke @l_stringMaker :jm_length_0))
            (JR/aset* @l_keyInfo @l_index (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringMaker :jm_append_1 (JR/invoke @l_gameInputMapping :jm_getName_0)) :jm_append_1 @l_EQUAL) :jm_append_1 (JR/invoke this :jm_get_1 @l_list))))))
        (JR/invoke-super 'HelpPaintable this :jm_setInputInfoP_1 @l_keyInfo)))

    
(defn jm_get_1 [this p_keyList]
  (let [ l_keyList (volatile! p_keyList) l_commonSeps (volatile! nil) l_stringBuffer (volatile! nil) l_AND (volatile! nil) l_key (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_AND "and ")
        (vreset! l_key nil)
        (vreset! l_size (JR/invoke @l_keyList :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_key (JR/aget* (JR/fget @l_keyList :objectArray) @l_index))
            (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke @l_key :jm_getName_0))
            (if (< (unchecked-int (unchecked-add @l_index 1)) (JR/invoke @l_keyList :jm_size_0))
                (do
                (if (== (JR/invoke @l_keyList :jm_size_0) 2)
                    (do
                    (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 @l_AND))
                    (do
                    (if (== (unchecked-int (unchecked-add @l_index 2)) (JR/invoke @l_keyList :jm_size_0))
                        (do
                        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))
                        (JR/invoke @l_stringBuffer :jm_append_1 @l_AND))
                        (do
                        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonSeps :COMMA_SEP))))))))))
        (JR/to-string-of @l_stringBuffer)))



