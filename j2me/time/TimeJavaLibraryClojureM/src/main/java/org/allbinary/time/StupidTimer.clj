;; Generated Code Do Not Modify
;; package org.allbinary.time

(ns StupidTimer)

(JR/register 'StupidTimer nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :commonStrings nil)
  (JR/fset this :nullUtil nil)
  (JR/fset this :threadObjectUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :nullUtil (JR/scall 'NullUtil :jm_getInstance_0))
    (JR/fset this :threadObjectUtil (JR/scall 'ThreadObjectUtil :jm_getInstance_0))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'StupidTimer)] (jinit_0 o) o))

    
(defn jm_visitBool_1 [this p_visitorInterface]
  (let [ l_visitorInterface (volatile! p_visitorInterface) l_result (volatile! nil) l_result2 (volatile! nil)]
        (vreset! l_result (JR/invoke @l_visitorInterface :jm_visit_1 (JR/fget (JR/fget this :nullUtil) :NULL_OBJECT)))
        (vreset! l_result2 (JR/invoke @l_result :jm_booleanValue_0))
        @l_result2))

    
(defn jm_visit_2 [this p_visitorInterface p_timeDelayHelper]
  (let [ l_visitorInterface (volatile! p_visitorInterface) l_timeDelayHelper (volatile! p_timeDelayHelper) l_tookTooLong (volatile! nil) l_WAITING_FOR (volatile! nil) l_index (volatile! nil)]
        (vreset! l_tookTooLong false)
        (vreset! l_WAITING_FOR "Waiting for: ")
        (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_WAITING_FOR) :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_visitorInterface))) this (JR/fget (JR/fget this :commonStrings) :VISIT))
        (vreset! l_index 0)
        (JR/jwhile true false (JR/invoke this :jm_visitBool_1 @l_visitorInterface)
            (if (== (rem @l_index 10) 0)
                (do
                (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 @l_WAITING_FOR) :jm_appendint_1 @l_index)) this (JR/fget (JR/fget this :commonStrings) :VISIT))))
            (JR/vinc l_index 1 :int false)
            (locking this
                (JR/invoke (JR/fget this :threadObjectUtil) :jm_waitObjectFor_2 this 1800))
            (if (JR/invoke @l_timeDelayHelper :jm_isTimeTNT_0)
                (do
                (vreset! l_tookTooLong true)
                (JR/jbreak))))
        (if @l_tookTooLong
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget (JR/fget this :commonStrings) :EXCEPTION) this (JR/fget (JR/fget this :commonStrings) :VISIT) (new java.lang.Exception (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Took Too Long: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_visitorInterface))))))
            (do
            (JR/scall 'PreLogUtil :jm_put_3 (JR/to-string-of @l_timeDelayHelper) this (JR/fget (JR/fget this :commonStrings) :VISIT))))))

    
(defn jm_stopWaiting_0 [this]
  (let []
        (locking this
            (JR/invoke (JR/fget this :threadObjectUtil) :jm_notifyObject_1 this))))



