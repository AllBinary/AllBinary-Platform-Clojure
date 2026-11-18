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
;; package org.allbinary.game.input

(ns LocalPlayerInputIdFactory)

(JR/register 'LocalPlayerInputIdFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (LocalPlayerInputIdFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :logUtil nil)
  (JR/fset this :MAX_NUMBER_OF_PLAYERS 0)
  (JR/fset this :MAX_FAST_DEVICEID 0)
  (JR/fset this :deviceIdToplayerId nil)
  (JR/fset this :playerIdToDeviceId nil)
  (JR/fset this :playersInPlay nil)
  (JR/fset this :totalDevicesMapped 0)
    (JR/fset this :logUtil (JR/scall 'LogUtil :jm_getInstance_0))
    (JR/fset this :MAX_NUMBER_OF_PLAYERS 6)
    (JR/fset this :MAX_FAST_DEVICEID 65)
    (JR/fset this :deviceIdToplayerId (JR/anew "INT" 1 (JR/fget this :MAX_FAST_DEVICEID)))
    (JR/fset this :playerIdToDeviceId (JR/anew "INT" 1 (JR/fget this :MAX_NUMBER_OF_PLAYERS)))
    (JR/fset this :playersInPlay (JR/anew "BOOLEAN" 1 (JR/fget this :MAX_NUMBER_OF_PLAYERS)))
    (JR/fset this :totalDevicesMapped 0)
  this)

    
(defn jinit_0 [this]
  (let [ l_index (volatile! nil)]
    nil (jinitfields this)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :deviceIdToplayerId)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :deviceIdToplayerId) @l_index (unchecked-int (unchecked-negate (JR/c2i 1)))))))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'LocalPlayerInputIdFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (LocalPlayerInputIdFactory/jstatic_instance)))

    
(defn jm_getDeviceId_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId)]
        (JR/aget* (JR/fget this :playerIdToDeviceId) @l_playerInputId)))

    
(defn jm_getPlayerForDevice_1 [this p_deviceId]
  (let [ l_deviceId (volatile! p_deviceId) l_index (volatile! nil) l_playerInputId (volatile! nil)](JR/method
        (vreset! l_index 0)
        (if (< @l_deviceId (JR/fget this :MAX_FAST_DEVICEID))
            (do
            (vreset! l_playerInputId (JR/aget* (JR/fget this :deviceIdToplayerId) @l_deviceId))
            (if (not (== @l_playerInputId (unchecked-int (unchecked-negate (JR/c2i 1)))))
                (do
                (JR/jreturn @l_playerInputId))))
            (do
            (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/fget this :totalDevicesMapped) 1)))
                (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
                (if (== (JR/aget* (JR/fget this :playerIdToDeviceId) @l_index) @l_deviceId)
                    (do
                    (JR/jreturn @l_index)))))))
        (vreset! l_index (JR/fget this :totalDevicesMapped))
        (if (< @l_deviceId (JR/fget this :MAX_FAST_DEVICEID))
            (do
            (JR/aset* (JR/fget this :deviceIdToplayerId) @l_deviceId @l_index))
            (do
            (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Added DeviceId: ") :jm_appendint_1 @l_deviceId) :jm_append_1 " beyond fast Id list")) this "getPlayerForDevice")))
        (JR/aset* (JR/fget this :playerIdToDeviceId) @l_index @l_deviceId)
        (JR/invoke (JR/scall 'AnalogLocationInputFactory :jm_getInstance_0) :jm_addPlayer_1 (JR/fget this :totalDevicesMapped))
        (JR/finc this :totalDevicesMapped 1 :int false)
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Added DeviceId: ") :jm_appendint_1 @l_deviceId) :jm_append_1 " at: ") :jm_appendint_1 @l_index) :jm_append_1 " Total: ") :jm_appendint_1 (JR/fget this :totalDevicesMapped))) this "getPlayerForDevice")
        @l_index)))

    
(defn jm_getTotalDevicesInPlay_0 [this]
  (let [ l_total (volatile! nil) l_index (volatile! nil)]
        (vreset! l_total 0)
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/fget this :totalDevicesMapped) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (if (= (JR/aget* (JR/fget this :playersInPlay) @l_index) true)
                (do
                (JR/vinc l_total 1 :int false)))))
        @l_total))

    
(defn jm_isPlayerInPlay_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId)]
        (JR/aget* (JR/fget this :playersInPlay) @l_playerInputId)))

    
(defn jm_setPlayerInPlay_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Setting PlayerInPlay with playerInputId: ") :jm_appendint_1 @l_playerInputId)) this "setPlayerInPlay")
        (JR/aset* (JR/fget this :playersInPlay) @l_playerInputId true)))

    
(defn jm_setPlayerOutOfPlay_1 [this p_playerInputId]
  (let [ l_playerInputId (volatile! p_playerInputId)]
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Setting PlayerOutOfPlay with playerInputId: ") :jm_appendint_1 @l_playerInputId)) this "setPlayerOutOfPlay")
        (JR/aset* (JR/fget this :playersInPlay) @l_playerInputId false)))

    
(defn jm_getPlayersInPlay_0 [this]
  (let []
        (JR/fget this :playersInPlay)))



