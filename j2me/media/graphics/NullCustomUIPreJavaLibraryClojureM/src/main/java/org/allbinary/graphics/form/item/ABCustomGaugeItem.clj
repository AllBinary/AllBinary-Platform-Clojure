;; Generated Code Do Not Modify
;; package org.allbinary.graphics.form.item

(ns ABCustomGaugeItem)

(JR/register 'ABCustomGaugeItem 'ABCustomItem '[])

(def jsv_NULL_GAUGE_ITEM (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_GAUGE_ITEM [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_GAUGE_ITEM)
(defn jstatic_set_NULL_GAUGE_ITEM [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_GAUGE_ITEM v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_GAUGE_ITEM (ABCustomGaugeItem/jnew_5 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING) 1 0 (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLACK) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE)))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_5 [this p_label p_maxValue p_initialValue p_backgroundBasicColor p_foregroundBasicColor]
  (let [ l_label (volatile! p_label) l_maxValue (volatile! p_maxValue) l_initialValue (volatile! p_initialValue) l_backgroundBasicColor (volatile! p_backgroundBasicColor) l_foregroundBasicColor (volatile! p_foregroundBasicColor)]
        (ABCustomItem/jinit_3 this @l_label @l_backgroundBasicColor @l_foregroundBasicColor) (jinitfields this))
  this)

(defn jnew_5 [p_label p_maxValue p_initialValue p_backgroundBasicColor p_foregroundBasicColor ]
  (let [o (JR/alloc 'ABCustomGaugeItem)] (jinit_5 o p_label p_maxValue p_initialValue p_backgroundBasicColor p_foregroundBasicColor) o))



