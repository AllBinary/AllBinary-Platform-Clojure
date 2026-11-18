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
;; package org.allbinary.game.input.mapping

(ns InputToGameKeyMapping)

(JR/register 'InputToGameKeyMapping 'InputMapping '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :gameKeyFactory nil)
  (JR/fset this :mappedGameKeys nil)
  (JR/fset this :platformToGameKeyMapping nil)
  (JR/fset this :negativePlatformToGameKeyMapping nil)
    (JR/fset this :gameKeyFactory (JR/scall 'GameKeyFactory :jm_getInstance_0))
    (JR/fset this :mappedGameKeys (JR/afrom "Object" 1 [(JR/fget (JR/fget this :gameKeyFactory) :UP) (JR/fget (JR/fget this :gameKeyFactory) :DOWN) (JR/fget (JR/fget this :gameKeyFactory) :LEFT) (JR/fget (JR/fget this :gameKeyFactory) :RIGHT)]))
    (JR/fset this :platformToGameKeyMapping (JR/anew "Object" 1 (JR/fget (JR/scall 'InputFactory :jm_getInstance_0) :MAX)))
    (JR/fset this :negativePlatformToGameKeyMapping (JR/anew "Object" 1 0))
  this)

    
(defn jm_getNullInstance_0 []
  (let [this nil]
        (if (JR/eq (InputToGameKeyMapping/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (InputToGameKeyMapping/jstatic_set_instance (InputToGameKeyMapping/jnew_0))))
        (InputToGameKeyMapping/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    (InputMapping/jinit_0 this) (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/invoke this :jm_clear_0))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'InputToGameKeyMapping)] (jinit_0 o) o))

    
(defn jm_clear_0 [this]
  (let [ l_index (volatile! nil)]
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :platformToGameKeyMapping)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :platformToGameKeyMapping) @l_index (JR/fget (JR/fget this :gameKeyFactory) :NONE))))))

    
(defn jm_removeAll_0 [this]
  (let []
        (JR/invoke-super 'InputMapping this :jm_removeAll_0)
        (JR/invoke this :jm_clear_0)))

    
(defn jm_addMapping_1 [this p_inputToGameKeyMapping]
  (let [ l_inputToGameKeyMapping (volatile! p_inputToGameKeyMapping) l_input (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke @l_inputToGameKeyMapping :jm_getMaxMappable_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_input (JR/invoke @l_inputToGameKeyMapping :jm_getInstance_1 @l_index))
            (if (not (JR/eq @l_input (JR/fget (JR/fget this :gameKeyFactory) :NONE)))
                (do
                (JR/invoke this :jm_addAll_2 @l_input (JR/invoke @l_inputToGameKeyMapping :jm_getMappedInput_1 @l_input))))))))

    
(defn jm_addAll_2 [this p_input p_list]
  (let [ l_input (volatile! p_input) l_list (volatile! p_list) l_mappedToInput (volatile! nil) l_index (volatile! nil)]
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke @l_list :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_mappedToInput (JR/aget* (JR/fget @l_list :objectArray) @l_index))
            (JR/invoke this :jm_add_2 @l_input @l_mappedToInput)))))

    
(defn jm_add_2 [this p_input p_mappedToInput]
  (let [ l_input (volatile! p_input) l_mappedToInput (volatile! p_mappedToInput)]
        (JR/invoke-super 'InputMapping this :jm_add_2 @l_input @l_mappedToInput)
        (JR/invoke this :jm_set_2 @l_input @l_mappedToInput)))

    
(defn jm_remove_2 [this p_input p_mappedToInput]
  (let [ l_input (volatile! p_input) l_mappedToInput (volatile! p_mappedToInput)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :START_LABEL)) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_input)) :jm_append_1 " == ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_mappedToInput))) this "InputToGameKeyMapping::remove")
        (JR/invoke-super 'InputMapping this :jm_remove_2 @l_input @l_mappedToInput)
        (JR/invoke this :jm_set_2 @l_input (JR/fget (JR/fget this :gameKeyFactory) :NONE))))

    
(defn jm_set_2 [this p_input p_mappedToInput]
  (let [ l_input (volatile! p_input) l_mappedToInput (volatile! p_mappedToInput) l_id (volatile! nil)]
        (vreset! l_id (JR/invoke @l_mappedToInput :jm_getId_0))
        (if (and (>= @l_id 0) (< @l_id (JR/alen (JR/fget this :platformToGameKeyMapping))))
            (do
            (JR/aset* (JR/fget this :platformToGameKeyMapping) @l_id @l_input)))))

    
(defn jm_getMaxMappable_0 [this]
  (let []
        (JR/alen (JR/fget this :platformToGameKeyMapping))))

    
(defn jm_getReverseInstance_1 [this p_id]
  (let [ l_id (volatile! p_id) l_list (volatile! nil) l_inputFactory (volatile! nil) l_input (volatile! nil) l_index (volatile! nil)]
        (vreset! l_list (BasicArrayListD/jnew_0))
        (vreset! l_inputFactory (JR/scall 'InputFactory :jm_getInstance_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen (JR/fget this :platformToGameKeyMapping))) (do (JR/vinc l_index 1 :int false))
            (if (== (JR/invoke (JR/aget* (JR/fget this :platformToGameKeyMapping) @l_index) :jm_getId_0) @l_id)
                (do
                (vreset! l_input (JR/invoke @l_inputFactory :jm_getInstanceById_1 @l_index))
                (if (some? @l_input)
                    (do
                    (JR/invoke @l_list :jm_add_1 @l_input)))))))
        @l_list))

    
(defn jm_initGameKey_2 [this p_canvas p_gameKey]
  (let [ l_canvas (volatile! p_canvas) l_gameKey (volatile! p_gameKey) l_key (volatile! nil)]
        (vreset! l_key (JR/invoke @l_canvas :jm_getKeyCode_1 (JR/invoke @l_gameKey :jm_getId_0)))
        (if (and (< @l_key 0) (< (unchecked-int (unchecked-negate (JR/c2i @l_key))) (JR/alen (JR/fget this :negativePlatformToGameKeyMapping))))
            (do
            (JR/aset* (JR/fget this :negativePlatformToGameKeyMapping) (unchecked-int (unchecked-negate (JR/c2i @l_key))) @l_gameKey))
            (if (> @l_key 0)
            (do
            (if (JR/eq (JR/aget* (JR/fget this :platformToGameKeyMapping) @l_key) (JR/fget (JR/fget this :gameKeyFactory) :NONE))
                (do
                (JR/aset* (JR/fget this :platformToGameKeyMapping) @l_key @l_gameKey))))
            (do
            (JR/scall 'PreLogUtil :jm_putOE_4 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/to-string-of @l_gameKey)) :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :COLON_SEP)) :jm_appendint_1 @l_key)) this (JR/fget (JR/fget this :commonStrings) :INIT) (new java.lang.Exception)))))))

    
(defn jm_getSmallestCanvasGameKeyCode_1 [this p_canvas]
  (let [ l_canvas (volatile! p_canvas) l_nextKey (volatile! nil) l_smallestKey (volatile! nil) l_index (volatile! nil)]
        (vreset! l_nextKey 0)
        (vreset! l_smallestKey 0)
        (do (vreset! l_index (JR/alen (JR/fget this :mappedGameKeys)))
            (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
            (vreset! l_nextKey (JR/invoke @l_canvas :jm_getKeyCode_1 (JR/invoke (JR/aget* (JR/fget this :mappedGameKeys) @l_index) :jm_getId_0)))
            (if (< @l_nextKey @l_smallestKey)
                (do
                (vreset! l_smallestKey @l_nextKey)))))
        @l_smallestKey))

    
(defn jm_init_1 [this p_canvas]
  (let [ l_canvas (volatile! p_canvas) l_negativePlatformToGameKeyMapping (volatile! nil) l_smallestKey (volatile! nil) l_index (volatile! nil) l_t (volatile! nil)]
        (try (do
            (vreset! l_negativePlatformToGameKeyMapping (JR/anew "Object" 1 0))
            (vreset! l_smallestKey (JR/invoke this :jm_getSmallestCanvasGameKeyCode_1 @l_canvas))
            (if (< @l_smallestKey 0)
                (do
                (JR/vinc l_smallestKey -1 :int false)
                (if (< @l_smallestKey (unchecked-int (unchecked-negate (JR/c2i 256))))
                    (do
                    (vreset! l_smallestKey (unchecked-int (unchecked-negate (JR/c2i 256))))))
                (vreset! l_negativePlatformToGameKeyMapping (JR/anew "Object" 1 (unchecked-int (unchecked-negate (JR/c2i @l_smallestKey)))))
                (do (vreset! l_index (JR/alen @l_negativePlatformToGameKeyMapping))
                    (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
                    (JR/aset* @l_negativePlatformToGameKeyMapping @l_index (JR/fget (JR/fget this :gameKeyFactory) :NONE))))
                (JR/fset this :negativePlatformToGameKeyMapping @l_negativePlatformToGameKeyMapping)))
            (do (vreset! l_index (JR/alen (JR/fget this :mappedGameKeys)))
                (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
                (JR/invoke this :jm_initGameKey_2 @l_canvas (JR/aget* (JR/fget this :mappedGameKeys) @l_index)))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Throwable) (do (vreset! l_t je)
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :INIT) @l_t)) :else (throw jt)))))))

    
(defn jm_getInstanceForCanvas_2 [this p_canvas p_id]
  (let [ l_canvas (volatile! p_canvas) l_id (volatile! p_id)]
        (if (and (>= @l_id 0) (< @l_id (JR/alen (JR/fget this :platformToGameKeyMapping))))
            (do
            (JR/aget* (JR/fget this :platformToGameKeyMapping) @l_id))
            (if (and (< @l_id 0) (< (unchecked-int (unchecked-negate (JR/c2i @l_id))) (JR/alen (JR/fget this :negativePlatformToGameKeyMapping))))
            (do
            (JR/aget* (JR/fget this :negativePlatformToGameKeyMapping) (unchecked-int (unchecked-negate (JR/c2i @l_id)))))
            (do
            (JR/fget (JR/fget this :gameKeyFactory) :NONE))))))

    
(defn jm_getInstance_1 [this p_id]
  (let [ l_id (volatile! p_id)]
        (if (and (>= @l_id 0) (< @l_id (JR/alen (JR/fget this :platformToGameKeyMapping))))
            (do
            (JR/aget* (JR/fget this :platformToGameKeyMapping) @l_id))
            (if (and (< @l_id 0) (< (unchecked-int (unchecked-negate (JR/c2i @l_id))) (JR/alen (JR/fget this :negativePlatformToGameKeyMapping))))
            (do
            (JR/aget* (JR/fget this :negativePlatformToGameKeyMapping) (unchecked-int (unchecked-negate (JR/c2i @l_id)))))
            (do
            (JR/fget (JR/fget this :gameKeyFactory) :NONE))))))



