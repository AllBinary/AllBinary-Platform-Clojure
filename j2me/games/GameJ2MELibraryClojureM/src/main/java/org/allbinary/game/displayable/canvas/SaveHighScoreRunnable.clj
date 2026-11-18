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
;; package org.allbinary.game.displayable.canvas

(ns SaveHighScoreRunnable)

(JR/register 'SaveHighScoreRunnable nil '[java.lang.Runnable])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :progressCanvas nil)
  (JR/fset this :isLast false)
  (JR/fset this :textBox nil)
    (JR/fset this :progressCanvas (JR/scall 'ProgressCanvasFactory :jm_getInstance_0))
  this)

    
(defn jinit_2 [this p_isLast p_textBox]
  (let [ l_isLast (volatile! p_isLast) l_textBox (volatile! p_textBox)]
    nil (jinitfields this)
        (JR/fset this :isLast @l_isLast)
        (JR/fset this :textBox @l_textBox))
  this)

(defn jnew_2 [p_isLast p_textBox ]
  (let [o (JR/alloc 'SaveHighScoreRunnable)] (jinit_2 o p_isLast p_textBox) o))

    
(defn jm_run_0 [this]
  (let [ l_logUtil (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (vreset! l_logUtil (JR/scall 'LogUtil :jm_getInstance_0))
        (try (do
            (if (JR/fget this :isLast)
                (do
                (JR/invoke (JR/fget this :textBox) :jm_submit_0))
                (do
                (JR/invoke (JR/fget this :textBox) :jm_saveHighScore_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke @l_logUtil :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this "run" @l_e)
            (JR/invoke (JR/fget this :progressCanvas) :jm_end_0)) :else (throw jt)))))))



