;; Generated Code Do Not Modify
;; package javax.microedition.lcdui

(ns NullCommandListener)

(JR/register 'NullCommandListener nil '[CommandListener])

(def jsv_NULL_COMMAND_LISTENER (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_COMMAND_LISTENER [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_COMMAND_LISTENER)
(defn jstatic_set_NULL_COMMAND_LISTENER [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_COMMAND_LISTENER v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_COMMAND_LISTENER (NullCommandListener/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullCommandListener)] (jinit_0 o) o))

    
(defn jm_commandAction_2 [this p_c p_d]
  (let [ l_c (volatile! p_c) l_d (volatile! p_d)]
        nil))



