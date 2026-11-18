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
;; package org.allbinary.game.layer.identification

(ns GroupLayerManagerListener)

(JR/register 'GroupLayerManagerListener 'LayerManagerEventListener '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (GroupLayerManagerListener/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :list nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (GroupLayerManagerListener/jstatic_SINGLETON)))

    
(defn jinit_0 [this]
  (let []
    (LayerManagerEventListener/jinit_0 this) (jinitfields this)
        (JR/invoke (JR/scall 'LayerManagerEventHandler :jm_getInstance_0) :jm_addListener_1 this))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'GroupLayerManagerListener)] (jinit_0 o) o))

    
(defn jm_clear_0 [this]
  (let [ l_groupList (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)]
        (vreset! l_groupList nil)
        (vreset! l_size (JR/invoke (JR/fget this :list) :jm_size_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_groupList (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
            (JR/invoke @l_groupList :jm_clear_0)))))

    
(defn jm_getGroupSizeFromInterface_1 [this p_groupInterfaceCompositeInterface]
  (let [ l_groupInterfaceCompositeInterface (volatile! p_groupInterfaceCompositeInterface) l_groupInterfaceArray (volatile! nil)]
        (vreset! l_groupInterfaceArray (JR/invoke @l_groupInterfaceCompositeInterface :jm_getGroupInterface_0))
        (JR/invoke this :jm_getGroupSize_1 (JR/aget* @l_groupInterfaceArray 0))))

    
(defn jm_getGroupSize_1 [this p_groupInterface]
  (let [ l_groupInterface (volatile! p_groupInterface) l_id (volatile! nil)]
        (vreset! l_id (JR/invoke @l_groupInterface :jm_getGroupId_0))
        (JR/invoke this :jm_getGroupSizeById_1 @l_id)))

    
(defn jm_getList_1 [this p_groupInterface]
  (let [ l_groupInterface (volatile! p_groupInterface) l_id (volatile! nil)]
        (vreset! l_id (JR/invoke @l_groupInterface :jm_getGroupId_0))
        (JR/invoke this :jm_getListById_1 @l_id)))

    
(defn jm_getListById_1 [this p_groupId]
  (let [ l_groupId (volatile! p_groupId) l_groupList (volatile! nil)]
        (vreset! l_groupList (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_groupId))
        @l_groupList))

    
(defn jm_getGroupSizeById_1 [this p_groupId]
  (let [ l_groupId (volatile! p_groupId) l_groupList (volatile! nil) l_size (volatile! nil)]
        (vreset! l_groupList (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_groupId))
        (vreset! l_size (JR/invoke @l_groupList :jm_size_0))
        @l_size))

    
(defn jm_areAllOtherGroupsEmpty_1 [this p_groupInterface]
  (let [ l_groupInterface (volatile! p_groupInterface) l_id (volatile! nil) l_size (volatile! nil) l_groupSize (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_id (JR/invoke @l_groupInterface :jm_getGroupId_0))
        (vreset! l_size (JR/invoke (JR/fget this :list) :jm_size_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (if (not (== @l_id @l_index))
                (do
                (vreset! l_groupSize (JR/invoke this :jm_getGroupSizeById_1 @l_index))
                (if (not (== @l_groupSize 0))
                    (do
                    (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Group Size: ") :jm_appendint_1 @l_groupSize)) this "areAllOtherGroupsEmpty")
                    (JR/jreturn false)))))))
        true)))

    
(defn jm_isIdInList_2 [this p_id p_excludeGroupList]
  (let [ l_id (volatile! p_id) l_excludeGroupList (volatile! p_excludeGroupList) l_size (volatile! nil) l_groupInterfaceArray (volatile! nil) l_groupInterface (volatile! nil) l_groupId (volatile! nil) l_size2 (volatile! nil) l_index2 (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_size (JR/invoke @l_excludeGroupList :jm_size_0))
        (vreset! l_groupInterfaceArray nil)
        (vreset! l_groupInterface nil)
        (vreset! l_groupId 0)
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_groupInterfaceArray (JR/aget* (JR/fget @l_excludeGroupList :objectArray) @l_index))
            (vreset! l_size2 (JR/alen @l_groupInterfaceArray))
            (do (vreset! l_index2 0)
                (JR/jfor false false (< @l_index2 @l_size2) (do (JR/vinc l_index2 1 :int false))
                (vreset! l_groupInterface (JR/aget* @l_groupInterfaceArray @l_index2))
                (vreset! l_groupId (JR/invoke @l_groupInterface :jm_getGroupId_0))
                (if (== @l_groupId @l_id)
                    (do
                    (JR/jreturn true)))))))
        false)))

    
(defn jm_areAllOtherGroupsLessThan_2 [this p_excludeGroupList p_maxSize]
  (let [ l_excludeGroupList (volatile! p_excludeGroupList) l_maxSize (volatile! p_maxSize) l_size (volatile! nil) l_groupSize (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_size (JR/invoke (JR/fget this :list) :jm_size_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (if (not (JR/invoke this :jm_isIdInList_2 @l_index @l_excludeGroupList))
                (do
                (vreset! l_groupSize (JR/invoke this :jm_getGroupSizeById_1 @l_index))
                (if (>= @l_groupSize @l_maxSize)
                    (do
                    (JR/jreturn false)))))))
        true)))

    
(defn jm_init_1 [this p_total]
  (let [ l_total (volatile! p_total)]
        (JR/jwhile false false (<= (JR/invoke (JR/fget this :list) :jm_size_0) (unchecked-int (unchecked-add @l_total 1)))
            (JR/invoke (JR/fget this :list) :jm_add_1 (BasicArrayListD/jnew_0)))))

    
(defn jm_onEvent_1 [this p_eventObject]
  (let [ l_eventObject (volatile! p_eventObject)]
        (JR/scall 'ForcedLogUtil :jm_log_2 (JR/fget (JR/scall 'EventStrings :jm_getInstance_0) :PERFORMANCE_MESSAGE) this)))

    
(defn jm_onCreateLayerManagerEvent_1 [this p_layerManagerEvent]
  (let [ l_layerManagerEvent (volatile! p_layerManagerEvent) l_layerInterface (volatile! nil) l_groupInterfaceArray (volatile! nil) l_size (volatile! nil) l_id (volatile! nil) l_groupList (volatile! nil) l_index (volatile! nil)]
        (vreset! l_layerInterface (JR/invoke @l_layerManagerEvent :jm_getLayerInterface_0))
        (vreset! l_groupInterfaceArray (JR/invoke @l_layerInterface :jm_getGroupInterface_0))
        (vreset! l_size (JR/alen @l_groupInterfaceArray))
        (vreset! l_id 0)
        (vreset! l_groupList nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_id (JR/invoke (JR/aget* @l_groupInterfaceArray @l_index) :jm_getGroupId_0))
            (vreset! l_groupList (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_id))
            (if (nil? @l_groupList)
                (do
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "id: ") :jm_appendint_1 @l_id)) this "onCreateLayerManagerEvent")))
            (if (not (JR/invoke @l_groupList :jm_contains_1 @l_layerInterface))
                (do
                (JR/invoke @l_groupList :jm_add_1 @l_layerInterface))
                (do
                nil))))))

    
(defn jm_onDeleteLayerManagerEvent_1 [this p_layerManagerEvent]
  (let [ l_layerManagerEvent (volatile! p_layerManagerEvent) l_layerInterface (volatile! nil) l_groupInterfaceArray (volatile! nil) l_size (volatile! nil) l_id (volatile! nil) l_groupList (volatile! nil) l_index (volatile! nil)]
        (vreset! l_layerInterface (JR/invoke @l_layerManagerEvent :jm_getLayerInterface_0))
        (vreset! l_groupInterfaceArray (JR/invoke @l_layerInterface :jm_getGroupInterface_0))
        (vreset! l_size (JR/alen @l_groupInterfaceArray))
        (vreset! l_id 0)
        (vreset! l_groupList nil)
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (vreset! l_id (JR/invoke (JR/aget* @l_groupInterfaceArray @l_index) :jm_getGroupId_0))
            (vreset! l_groupList (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_id))
            (JR/invoke @l_groupList :jm_remove_1 @l_layerInterface)))))

    
(defn jm_log_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_GROUP (volatile! nil) l_SPACE (volatile! nil) l_TOTAL_LABEL (volatile! nil) l_size (volatile! nil) l_groupList (volatile! nil) l_index (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_GROUP "Group: ")
        (vreset! l_SPACE (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (vreset! l_TOTAL_LABEL (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :TOTAL_LABEL))
        (vreset! l_size (JR/invoke (JR/fget this :list) :jm_size_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract @l_size 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_groupList (JR/aget* (JR/fget (JR/fget this :list) :objectArray) @l_index))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_GROUP)
            (JR/invoke @l_stringBuffer :jm_appendint_1 @l_index)
            (JR/invoke @l_stringBuffer :jm_append_1 @l_SPACE)
            (JR/invoke @l_stringBuffer :jm_append_1 @l_TOTAL_LABEL)
            (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke @l_groupList :jm_size_0))
            (JR/invoke @l_stringBuffer :jm_append_1 @l_SPACE)))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of @l_stringBuffer) this "log")))



