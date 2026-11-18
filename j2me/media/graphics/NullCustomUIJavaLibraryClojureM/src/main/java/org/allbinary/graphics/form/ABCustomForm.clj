;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form

(ns ABCustomForm)

(JR/register 'ABCustomForm 'CustomScreen '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
  this)

    
(defn jinit_4 [this p_title p_items p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_title (volatile! p_title) l_items (volatile! p_items) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
    (CustomScreen/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_4 [p_title p_items p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ABCustomForm)] (jinit_4 o p_title p_items p_backgroundBasicColor p_foregroundBasicColor) o))

    
(defn jm_getAllitems_0 [this]
  (let []
        (JR/anew "Object" 1 0)))

    
(defn jm_size_0 [this]
  (let []
        0))

    
(defn jm_setSelectedIndex_1 [this p_index]
  (let [ l_index (volatile! p_index)]
        nil))

    
(defn jm_getSelectedIndex_0 [this]
  (let []
        0))

    
(defn jm_deleteAll_0 [this]
  (let []
        nil))

    
(defn jm_delete_1 [this p_itemNum]
  (let [ l_itemNum (volatile! p_itemNum)]
        nil))

    
(defn jm_append_1 [this p_item]
  (let [ l_item (volatile! p_item)]
        (unchecked-int (unchecked-negate (JR/c2i 1)))))

    
(defn jm_insert_2 [this p_itemNum p_item]
  (let [ l_itemNum (volatile! p_itemNum) l_item (volatile! p_item)]
        nil))

    
(defn jm_set_2 [this p_itemNum p_item]
  (let [ l_itemNum (volatile! p_itemNum) l_item (volatile! p_item)]
        nil))

    
(defn jm_get_1 [this p_itemNum]
  (let [ l_itemNum (volatile! p_itemNum)]
        (JR/scall 'ABCustomItem :jm_getNullInstance_0)))

    
(defn jm_getWidth_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_getTitle_0 [this]
  (let []
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))



