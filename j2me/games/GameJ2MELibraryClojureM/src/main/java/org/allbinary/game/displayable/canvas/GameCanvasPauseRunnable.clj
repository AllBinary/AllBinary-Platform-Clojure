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

(ns GameCanvasPauseRunnable)

(JR/register 'GameCanvasPauseRunnable 'GameRunnable '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :allBinaryGameCanvas nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_allBinaryGameCanvas]
  (let [ l_allBinaryGameCanvas (volatile! p_allBinaryGameCanvas)]
    (GameRunnable/jinit_0 this) (jinitfields this)
        (JR/fset this :allBinaryGameCanvas @l_allBinaryGameCanvas))
  this)

(defn jnew_1 [p_allBinaryGameCanvas ]
  (let [o (JR/alloc 'GameCanvasPauseRunnable)] (jinit_1 o p_allBinaryGameCanvas) o))

    
(defn jm_run_0 [this]
  (let []
        nil))

    
(defn jm_processLoopSleep_0 [this]
  (let [ l_features (volatile! nil) l_isOpenGL (volatile! nil) l_commonStrings (volatile! nil) l_e (volatile! nil)]
        (try (do
            (vreset! l_features (JR/scall 'Features :jm_getInstance_0))
            (vreset! l_isOpenGL (JR/invoke @l_features :jm_isDefault_1 (JR/fget (JR/scall 'OpenGLFeatureFactory :jm_getInstance_0) :OPENGL)))
            (if @l_isOpenGL
                (do
                (JR/invoke (JR/fget this :allBinaryGameCanvas) :jm_processSleep_0))))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :RUN) @l_e)) :else (throw jt)))))))



