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

(ns Sounds)

(JR/register 'Sounds nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :soundStrings nil)
  (JR/fset this :soundsFactoryInterface nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :soundStrings (JR/scall 'SoundStrings :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_soundsFactoryInterface]
  (let [ l_soundsFactoryInterface (volatile! p_soundsFactoryInterface)]
    nil (jinitfields this)
        (JR/fset this :soundsFactoryInterface @l_soundsFactoryInterface))
  this)

(defn jnew_1 [p_soundsFactoryInterface ]
  (let [o (JR/alloc 'Sounds)] (jinit_1 o p_soundsFactoryInterface) o))

    
(defn jm_init_0 [this]
  (let [ l_commonLabels (volatile! nil) l_progressCanvas (volatile! nil) l_soundInterfaceArray (volatile! nil) l_smallIntegerSingletonFactory (volatile! nil) l_indexInteger (volatile! nil) l_indexString (volatile! nil) l_stringBuffer (volatile! nil) l_soundInterface (volatile! nil) l_i (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :INIT))
        (vreset! l_commonLabels (JR/scall 'CommonLabels :jm_getInstance_0))
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (JR/invoke (JR/fget this :soundsFactoryInterface) :jm_init_0)
        (vreset! l_soundInterfaceArray (JR/invoke (JR/fget this :soundsFactoryInterface) :jm_getSoundInterfaceArray_0))
        (vreset! l_smallIntegerSingletonFactory (JR/scall 'SmallIntegerSingletonFactory :jm_getInstance_0))
        (vreset! l_indexInteger nil)
        (vreset! l_indexString nil)
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (do (vreset! l_i 0)
            (JR/jfor false false (< @l_i (JR/alen @l_soundInterfaceArray)) (do (JR/vinc l_i 1 :int false))
            (vreset! l_soundInterface (JR/aget* @l_soundInterfaceArray @l_i))
            (if (some? @l_soundInterface)
                (do
                (vreset! l_indexInteger (JR/invoke @l_smallIntegerSingletonFactory :jm_getAt_1 @l_i))
                (vreset! l_indexString (JR/to-string-of @l_indexInteger))
                (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget @l_commonLabels :INDEX_LABEL))
                (JR/invoke @l_stringBuffer :jm_append_1 @l_indexString)
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/fget this :soundStrings) :SOUND))
                (JR/invoke @l_stringBuffer :jm_append_1 (JR/class-name @l_soundInterface))
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this (JR/fget (JR/fget this :commonStrings) :INIT))
                (JR/invoke @l_soundInterface :jm_init_0)
                (JR/invoke @l_progressCanvas :jm_addNormalPortion_2 100 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget (JR/fget this :soundStrings) :INIT_SOUND)) :jm_append_1 @l_indexString)))))))
        (JR/invoke (JR/fget this :soundsFactoryInterface) :jm_setInitialized_1 true)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :END) this (JR/fget (JR/fget this :commonStrings) :INIT))))

    
(defn jm_stopAll_0 [this]
  (let [ l_soundInterfaceArray (volatile! nil) l_progressCanvas (volatile! nil) l_player (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :soundStrings) :STOP_ALL))
        (vreset! l_soundInterfaceArray (JR/invoke (JR/fget this :soundsFactoryInterface) :jm_getSoundInterfaceArray_0))
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (vreset! l_player nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_soundInterfaceArray)) (do (JR/vinc l_index 1 :int false))
            (if (some? (JR/aget* @l_soundInterfaceArray @l_index))
                (do
                (vreset! l_player (JR/invoke (JR/aget* @l_soundInterfaceArray @l_index) :jm_getPlayerP_0))
                (if (some? @l_player)
                    (do
                    (JR/invoke @l_player :jm_stop_0)
                    (JR/invoke @l_progressCanvas :jm_addPortion_3 100 (JR/fget (JR/fget this :soundStrings) :STOPPING_SOUND) @l_index)))))))))

    
(defn jm_closeAll_0 [this]
  (let [ l_soundInterfaceArray (volatile! nil) l_progressCanvas (volatile! nil) l_player (volatile! nil) l_index (volatile! nil)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :soundStrings) :CLOSE_ALL))
        (vreset! l_soundInterfaceArray (JR/invoke (JR/fget this :soundsFactoryInterface) :jm_getSoundInterfaceArray_0))
        (vreset! l_progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
        (vreset! l_player nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index (JR/alen @l_soundInterfaceArray)) (do (JR/vinc l_index 1 :int false))
            (if (some? (JR/aget* @l_soundInterfaceArray @l_index))
                (do
                (vreset! l_player (JR/invoke (JR/aget* @l_soundInterfaceArray @l_index) :jm_getPlayerP_0))
                (if (some? @l_player)
                    (do
                    (JR/invoke @l_player :jm_close_0)
                    (JR/invoke @l_progressCanvas :jm_addPortion_3 100 (JR/fget (JR/fget this :soundStrings) :CLOSING_SOUND) @l_index)))))))))



