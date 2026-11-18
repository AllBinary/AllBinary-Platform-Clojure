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
;; package org.allbinary.logic.io

(ns StreamUtil)

(JR/register 'StreamUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (StreamUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (StreamUtil/jstatic_instance)))

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'StreamUtil)] (jinit_0 o) o))

    
(defn jm_get_3 [this p_inputStream p_outputStream p_buffer]
  (let [ l_inputStream (volatile! p_inputStream) l_outputStream (volatile! p_outputStream) l_buffer (volatile! p_buffer) l_len (volatile! nil)]
        (vreset! l_len 0)
        (JR/jwhile true false true
            (vreset! l_len (JR/invoke @l_inputStream :jm_read_3 @l_buffer 0 (JR/alen @l_buffer)))
            (if (not (== @l_len (unchecked-int (unchecked-negate (JR/c2i 1)))))
                (do
                nil)
                (do
                (JR/jbreak)))
            (JR/invoke @l_outputStream :jm_write_3 @l_buffer 0 @l_len))
        @l_outputStream))

    
(defn jm_getByteArray_3 [this p_inputStream p_outputStream2 p_byteArray]
  (let [ l_inputStream (volatile! p_inputStream) l_outputStream2 (volatile! p_outputStream2) l_byteArray (volatile! p_byteArray) l_outputStream (volatile! nil) l_e (volatile! nil)](JR/method
        (vreset! l_outputStream @l_outputStream2)
        (try (do
            (JR/invoke this :jm_get_3 @l_inputStream @l_outputStream @l_byteArray)
            (JR/jreturn (JR/invoke @l_outputStream :jm_toByteArray_0)))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (JR/jthrow @l_e)) :else (throw jt))))
            (finally
            (JR/invoke this :jm_close_1 @l_outputStream))))))

    
(defn jm_close_1 [this p_closeable]
  (let [ l_closeable (volatile! p_closeable) l_commonStrings (volatile! nil) l_e (volatile! nil)](JR/method
        (try (do
            (if (some? @l_closeable)
                (do
                (JR/invoke @l_closeable :jm_close_0)))
            (JR/jreturn true))
            (catch Throwable jt (let [je (JR/caught jt)] (cond
                (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
            (vreset! l_commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
            (JR/invoke (JR/fget this :logUtil) :jm_put_4 (JR/fget @l_commonStrings :EXCEPTION) this (JR/fget @l_commonStrings :CLOSE) @l_e)
            (JR/jreturn false)) :else (throw jt))))))))



