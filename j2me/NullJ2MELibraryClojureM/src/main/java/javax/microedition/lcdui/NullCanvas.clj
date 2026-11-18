;; Generated Code Do Not Modify
;; package javax.microedition.lcdui

(ns NullCanvas)

(JR/register 'NullCanvas 'Canvas '[])

(def jsv_NULL_CANVAS (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_CANVAS [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_CANVAS)
(defn jstatic_set_NULL_CANVAS [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_CANVAS v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_CANVAS (NullCanvas/jnew_0))
    nil))

(defn jinitfields [this]
  this)

    
(defn jinit_0 [this]
  (let []
    (Canvas/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'NullCanvas)] (jinit_0 o) o))

    
(defn jm_setFullScreenMode_1 [this p_mode]
  (let [ l_mode (volatile! p_mode)]
        nil))

    
(defn jm_sizeChanged_2 [this p_w p_h]
  (let [ l_w (volatile! p_w) l_h (volatile! p_h)]
        nil))

    
(defn jm_getCommandStack_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_isCommand_1 [this p_command]
  (let [ l_command (volatile! p_command)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_addCommand_1 [this p_command]
  (let [ l_command (volatile! p_command)]
        nil))

    
(defn jm_removeCommand_1 [this p_command]
  (let [ l_command (volatile! p_command)]
        nil))

    
(defn jm_removeAllCommands_0 [this]
  (let []
        nil))

    
(defn jm_setCommandListener_1 [this p_l]
  (let [ l_l (volatile! p_l)]
        nil))

    
(defn jm_getCustomCommandListener_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_isPaused_0 [this]
  (let []
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_removePauseCommand_0 [this]
  (let []
        nil))

    
(defn jm_pause_0 [this]
  (let []
        nil))

    
(defn jm_unPause_0 [this]
  (let []
        nil))

    
(defn jm_process_0 [this]
  (let []
        nil))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics)]
        nil))

    
(defn jm_destroy_0 [this]
  (let []
        nil))

    
(defn jm_setPaused_1 [this p_isPaused]
  (let [ l_isPaused (volatile! p_isPaused)]
        (JR/jthrow (new java.lang.RuntimeException))))

    
(defn jm_pointerDragged_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_pointerPressed_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))

    
(defn jm_pointerReleased_2 [this p_x p_y]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y)]
        nil))



