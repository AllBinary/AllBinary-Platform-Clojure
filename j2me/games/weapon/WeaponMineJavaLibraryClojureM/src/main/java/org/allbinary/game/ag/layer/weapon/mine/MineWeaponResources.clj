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
;; package org.allbinary.game.ag.layer.weapon.mine

(ns MineWeaponResources)

(JR/register 'MineWeaponResources 'BasicGameResources '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
    nil))

(defn jinitfields [this]
  (JR/fset this :DROP_TEXT_RESOURCE nil)
  (JR/fset this :DROP_RESOURCE nil)
  (JR/fset this :DROP_ICON_RESOURCE nil)
    (JR/fset this :DROP_TEXT_RESOURCE "/mine_drop_text_20_by_20.png")
    (JR/fset this :DROP_RESOURCE "/mine_drop_20_by_20.png")
    (JR/fset this :DROP_ICON_RESOURCE "/mine_drop_icon_20_by_20.png")
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (if (JR/eq (MineWeaponResources/jstatic_instance) (JR/fget (JR/scall 'NullUtil :jm_getInstance_0) :NULL_OBJECT))
            (do
            (MineWeaponResources/jstatic_set_instance (MineWeaponResources/jnew_0))))
        (MineWeaponResources/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_ROOT (volatile! nil) l_SMALL (volatile! nil) l_MEDIUM (volatile! nil) l_SIZE_FOUR (volatile! nil) l_SIZE_FIVE (volatile! nil) l_SIZE_SIX (volatile! nil) l_SIZE (volatile! nil)]
    (BasicGameResources/jinit_0 this) (jinitfields this)
        (vreset! l_ROOT "/mine")
        (vreset! l_SMALL "_20_by_20.png")
        (vreset! l_MEDIUM @l_SMALL)
        (vreset! l_SIZE_FOUR @l_SMALL)
        (vreset! l_SIZE_FIVE @l_SMALL)
        (vreset! l_SIZE_SIX @l_SMALL)
        (vreset! l_SIZE (JR/afrom "String" 1 [@l_SMALL @l_MEDIUM @l_SIZE_FOUR @l_SIZE_FIVE @l_SIZE_SIX]))
        (JR/invoke-super 'BasicGameResources this :jm_init_2 @l_ROOT @l_SIZE))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'MineWeaponResources)] (jinit_0 o) o))



