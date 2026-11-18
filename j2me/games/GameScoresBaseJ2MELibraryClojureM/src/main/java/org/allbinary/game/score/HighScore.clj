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
;; package org.allbinary.game.score

(ns HighScore)

(JR/register 'HighScore nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :id 0)
  (JR/fset this :name nil)
  (JR/fset this :gameInfo nil)
  (JR/fset this :score 0)
  (JR/fset this :scoreString nil)
  this)

    
(defn jinit_4 [this p_id p_name p_gameInfo p_score]
  (let [ l_id (volatile! p_id) l_name (volatile! p_name) l_gameInfo (volatile! p_gameInfo) l_score (volatile! p_score)]
    nil (jinitfields this)
        (JR/fset this :id @l_id)
        (JR/fset this :name @l_name)
        (JR/fset this :gameInfo @l_gameInfo)
        (JR/fset this :score @l_score)
        (JR/fset this :scoreString (JR/s (JR/fget this :score))))
  this)

(defn jnew_4 [p_id p_name p_gameInfo p_score ]
  (let [o (JR/alloc 'HighScore)] (jinit_4 o p_id p_name p_gameInfo p_score) o))

    
(defn jm_getId_0 [this]
  (let []
        (JR/fget this :id)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_getScore_0 [this]
  (let []
        (JR/fget this :score)))

    
(defn jm_getAsBytes_0 [this]
  (let [ l_byteArrayOutputStream (volatile! nil) l_outputStream (volatile! nil)]
        (vreset! l_byteArrayOutputStream (new java.io.ByteArrayOutputStream))
        (vreset! l_outputStream (new java.io.DataOutputStream @l_byteArrayOutputStream))
        (JR/invoke @l_outputStream :jm_writeUTF_1 (JR/invoke this :jm_getName_0))
        (JR/invoke @l_outputStream :jm_writeLong_1 (JR/invoke this :jm_getScore_0))
        (JR/invoke @l_byteArrayOutputStream :jm_toByteArray_0)))

    
(defn jm_getGameInfo_0 [this]
  (let []
        (JR/fget this :gameInfo)))

    
(defn jm_getScoreString_0 [this]
  (let []
        (JR/fget this :scoreString)))

    
(defn jm_setName_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/fset this :name @l_name)))

    
(defn jm_toString_0 [this]
  (let [ l_commonSeps (volatile! nil)]
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :name)) :jm_append_1 (JR/fget @l_commonSeps :COLON)) :jm_appendlong_1 (JR/fget this :score)) :jm_append_1 (JR/fget @l_commonSeps :FORWARD_SLASH)) :jm_append_1 (JR/fget this :scoreString)))))



