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
;; package org.allbinary.game.terrain

(ns TerrainEvent)

(JR/register 'TerrainEvent 'AllBinaryEventObject '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :basicTerrainInfo nil)
    (JR/fset this :basicTerrainInfo (JR/sget 'BasicTerrainInfo "NULL_BASIC_TERRAIN_INFO"))
  this)

    
(defn jinit_1 [this p_basicTerrainInfo]
  (let [ l_basicTerrainInfo (volatile! p_basicTerrainInfo)]
        (AllBinaryEventObject/jinit_1 this @l_basicTerrainInfo) (jinitfields this)
        (JR/invoke this :jm_setBasicTerrainInfo_1 (JR/fget this :basicTerrainInfo)))
  this)

(defn jnew_1 [p_basicTerrainInfo ]
  (let [o (JR/alloc 'TerrainEvent)] (jinit_1 o p_basicTerrainInfo) o))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "TerrainEvent: \n")
        (JR/invoke @l_stringBuffer :jm_append_1 "LayerInterface: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/to-string-of (JR/fget this :basicTerrainInfo)))
        (JR/to-string-of @l_stringBuffer)))

    
(defn jm_getBasicTerrainInfo_0 [this]
  (let []
        (JR/fget this :basicTerrainInfo)))

    
(defn jm_setBasicTerrainInfo_1 [this p_basicTerrainInfo]
  (let [ l_basicTerrainInfo (volatile! p_basicTerrainInfo)]
        (JR/fset this :basicTerrainInfo @l_basicTerrainInfo)))

    
(defn jm_setBasicTerrainInfoForCircularStaticPool_1 [this p_basicTerrainInfo]
  (let [ l_basicTerrainInfo (volatile! p_basicTerrainInfo)]
        (JR/fset this :basicTerrainInfo @l_basicTerrainInfo)))



