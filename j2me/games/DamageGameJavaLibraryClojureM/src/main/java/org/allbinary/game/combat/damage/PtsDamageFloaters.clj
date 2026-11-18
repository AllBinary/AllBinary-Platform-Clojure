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
;; package org.allbinary.game.combat.damage

(ns PtsDamageFloaters)

(JR/register 'PtsDamageFloaters 'DamageFloaters '[])

(def jsv_basicColorArrayIndexer (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_basicColorArrayIndexer [] (JR/ensure-init jclinit-state jclinit) @jsv_basicColorArrayIndexer)
(defn jstatic_set_basicColorArrayIndexer [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_basicColorArrayIndexer v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_basicColorArrayIndexer (BasicColorArrayIndexer/jnew_1 (JR/afrom "Object" 1 [(JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :WHITE) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :RED) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :YELLOW) (JR/fget (JR/scall 'BasicColorFactory :jm_getInstance_0) :BLUE)])))
    nil))

(defn jinitfields [this]
  (JR/fset this :basicSetColorUtil nil)
  (JR/fset this :layerInterface nil)
  (JR/fset this :lastDamage nil)
  (JR/fset this :lastDamageString nil)
  (JR/fset this :lastDamageStringSizeArray nil)
  (JR/fset this :circularIndexUtil nil)
  (JR/fset this :primitiveLongUtil nil)
  (JR/fset this :myRandomFactory nil)
    (JR/fset this :basicSetColorUtil (JR/scall 'BasicColorSetUtil :jm_getInstance_0))
    (JR/fset this :lastDamage (JR/anew "INT" 1 5))
    (JR/fset this :lastDamageString (JR/anew "CHAR" 2 5 0))
    (JR/fset this :lastDamageStringSizeArray (JR/anew "INT" 1 5))
    (JR/fset this :circularIndexUtil (JR/scall 'CircularIndexUtil :jm_createInstance_1 5))
    (JR/fset this :myRandomFactory (JR/scall 'MyRandomFactory :jm_getInstance_0))
  this)

    
(defn jinit_1 [this p_layerInterface]
  (let [ l_layerInterface (volatile! p_layerInterface) l_CHAR_ARRAY (volatile! nil) l_index (volatile! nil)]
    (DamageFloaters/jinit_0 this) (jinitfields this)
        (JR/fset this :primitiveLongUtil (JR/scall 'PrimitiveLongUtil :jm_createPowerOfTen_1 100000))
        (JR/fset this :layerInterface @l_layerInterface)
        (vreset! l_CHAR_ARRAY (JR/invoke (JR/scall 'CharArrayFactory :jm_getInstance_0) :jm_getZeroCharArray_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :lastDamageString)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (JR/aset* (JR/fget this :lastDamageString) @l_index @l_CHAR_ARRAY))))
  this)

(defn jnew_1 [p_layerInterface ]
  (let [o (JR/alloc 'PtsDamageFloaters)] (jinit_1 o p_layerInterface) o))

    
(defn jm_add_1 [this p_damage]
  (let [ l_damage (volatile! p_damage) l_index (volatile! nil)]
        (vreset! l_index (JR/invoke (JR/fget this :circularIndexUtil) :jm_getIndex_0))
        (JR/aset* (JR/fget this :lastDamage) @l_index @l_damage)
        (JR/aset* (JR/fget this :lastDamageString) @l_index (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCharArray_1 (JR/aget* (JR/fget this :lastDamage) @l_index)))
        (JR/aset* (JR/fget this :lastDamageStringSizeArray) @l_index (JR/invoke (JR/fget this :primitiveLongUtil) :jm_getCurrentTotalDigits_0))
        (JR/invoke (JR/fget this :circularIndexUtil) :jm_next_0)))

    
(defn jm_paint_1 [this p_graphics]
  (let [ l_graphics (volatile! p_graphics) l_viewPosition (volatile! nil) l_x (volatile! nil) l_y (volatile! nil) l_delta (volatile! nil) l_index (volatile! nil)]
        (vreset! l_viewPosition (JR/invoke (JR/fget this :layerInterface) :jm_getViewPosition_0))
        (vreset! l_x (JR/invoke @l_viewPosition :jm_getX_0))
        (vreset! l_y (JR/invoke @l_viewPosition :jm_getY_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/alen (JR/fget this :lastDamage)) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (if (not (== (JR/aget* (JR/fget this :lastDamage) @l_index) 0))
                (do
                (vreset! l_delta (unchecked-int (unchecked-multiply 10 (unchecked-int (unchecked-add @l_index 2)))))
                (JR/invoke (JR/fget this :basicSetColorUtil) :jm_setBasicColorP_2 @l_graphics (JR/invoke (PtsDamageFloaters/jstatic_basicColorArrayIndexer) :jm_get_0))
                (JR/invoke @l_graphics :jm_drawChars_6 (JR/aget* (JR/fget this :lastDamageString) @l_index) 0 (JR/aget* (JR/fget this :lastDamageStringSizeArray) @l_index) (unchecked-int (unchecked-subtract @l_x (JR/invoke (JR/fget this :myRandomFactory) :jm_getNextInt_1 @l_delta))) (unchecked-int (unchecked-subtract @l_y @l_delta)) 0)
                (JR/invoke (PtsDamageFloaters/jstatic_basicColorArrayIndexer) :jm_next_0)))
            (JR/aset* (JR/fget this :lastDamage) @l_index 0)))))



