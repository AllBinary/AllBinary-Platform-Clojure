;; Generated Code Do Not Modify
;; package org.allbinary.layer

(ns LayerManager)

(JR/register 'LayerManager nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :systemWrapper nil)
  (JR/fset this :tsUtil nil)
  (JR/fset this :layerManagerLogging nil)
  (JR/fset this :list nil)
  (JR/fset this :anyType nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :systemWrapper (JR/scall 'ABSystemWrapper :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
    (JR/fset this :anyType (SynchObject/jnew_0))
  this)

    
(defn jinit_1 [this p_layerManagerLogging]
  (let [ l_layerManagerLogging (volatile! p_layerManagerLogging)]
    nil (jinitfields this)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/fget (JR/fget this :commonStrings) :START) this (JR/fget (JR/fget this :commonStrings) :CONSTRUCTOR))
        (JR/fset this :layerManagerLogging @l_layerManagerLogging))
  this)

(defn jnew_1 [p_layerManagerLogging ]
  (let [o (JR/alloc 'LayerManager)] (jinit_1 o p_layerManagerLogging) o))

    
(defn jm_contains_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/invoke (JR/fget this :list) :jm_contains_1 @l_layerInterface)))

    
(defn jm_update_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_had (volatile! nil) l_nextLayerInterface (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_had (JR/invoke (JR/fget this :list) :jm_remove_1 @l_layerInterface))
        (if @l_had
            (do
            (vreset! l_nextLayerInterface nil)
            (vreset! l_size (JR/invoke (JR/fget this :list) :jm_size_0))
            (do (vreset! l_index 0)
                (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
                (vreset! l_nextLayerInterface (JR/invoke (JR/fget this :list) :jm_get_1 @l_index))
                (if (> (JR/invoke @l_layerInterface :jm_getZP_0) (JR/invoke @l_nextLayerInterface :jm_getZP_0))
                    (do
                    (JR/invoke (JR/fget this :list) :jm_addAt_2 @l_index @l_layerInterface)
                    (JR/jreturn)))))
            (JR/invoke (JR/fget this :list) :jm_add_1 @l_layerInterface))))))

    
(defn jm_insert_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_nextLayerInterface (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_nextLayerInterface nil)
        (vreset! l_size (JR/invoke (JR/fget this :list) :jm_size_0))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_nextLayerInterface (JR/invoke (JR/fget this :list) :jm_get_1 @l_index))
            (if (> (JR/invoke @l_layerInterface :jm_getZP_0) (JR/invoke @l_nextLayerInterface :jm_getZP_0))
                (do
                (JR/invoke this :jm_appendAt_2 @l_layerInterface @l_index)
                (JR/jreturn)))))
        (JR/invoke this :jm_append_1 @l_layerInterface))))

    
(defn jm_append_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface)]
        (JR/invoke (JR/fget this :layerManagerLogging) :jm_append_1 @l_layerInterface)
        (JR/invoke (JR/fget this :list) :jm_add_1 @l_layerInterface)))

    
(defn jm_appendAt_2 [this p_layerInterface p_index]
  (let [ l_layerInterface (volatile! p_layerInterface) l_index (volatile! p_index)]
        (JR/invoke (JR/fget this :layerManagerLogging) :jm_appendAt_2 @l_layerInterface @l_index)
        (JR/invoke (JR/fget this :list) :jm_addAt_2 @l_index @l_layerInterface)))

    
(defn jm_remove_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_result (volatile! nil)]
        (locking (JR/fget this :anyType)
            (JR/invoke (JR/fget this :layerManagerLogging) :jm_remove_1 @l_layerInterface)
            (vreset! l_result (JR/invoke (JR/fget this :list) :jm_remove_1 @l_layerInterface))
            (JR/invoke (JR/fget this :layerManagerLogging) :jm_removeResult_3 this @l_layerInterface @l_result))))

    
(defn jm_getLayerAt_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index)))

    
(defn jm_getSize_0 [this]
  (let []
        (JR/invoke (JR/fget this :list) :jm_size_0)))

    
(defn jm_cleanup_0 [this]
  (let []
        (locking (JR/fget this :anyType)
            (JR/invoke (JR/fget this :list) :jm_clear_0)
            (JR/invoke (JR/fget this :layerManagerLogging) :jm_clear_0)
            (JR/invoke (JR/fget this :tsUtil) :jm_gc_0)
            (JR/invoke (JR/fget this :tsUtil) :jm_gc_0))))

    
(defn jm_paint_3 [this p_g p_x p_y]
  (let [ l_g (volatile! p_g) l_x (volatile! p_x) l_y (volatile! p_y) l_comp (volatile! nil) l_index (volatile! nil)]
        (locking (JR/fget this :anyType)
            (vreset! l_comp nil)
            (do (vreset! l_index (JR/invoke (JR/fget this :list) :jm_size_0))
                (JR/jfor false false (>= (JR/vinc l_index -1 :int false) 0) (do )
                (vreset! l_comp (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
                (if (and (some? @l_comp) (JR/invoke @l_comp :jm_isVisible_0))
                    (do
                    (JR/invoke @l_comp :jm_paint_1 @l_g))))))))



