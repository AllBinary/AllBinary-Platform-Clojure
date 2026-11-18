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
;; package org.allbinary.direction

(ns DirectionFactory)

(JR/register 'DirectionFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (DirectionFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NAME nil)
  (JR/fset this :LEFT nil)
  (JR/fset this :RIGHT nil)
  (JR/fset this :DOWN nil)
  (JR/fset this :UP nil)
  (JR/fset this :UP_LEFT nil)
  (JR/fset this :UP_RIGHT nil)
  (JR/fset this :DOWN_LEFT nil)
  (JR/fset this :DOWN_RIGHT nil)
  (JR/fset this :NOT_BORDERED_WITH nil)
  (JR/fset this :NO_DIRECTION nil)
  (JR/fset this :TOP nil)
  (JR/fset this :BOTTOM nil)
  (JR/fset this :ALL_DIRECTION nil)
    (JR/fset this :NAME "DIRECTION")
    (JR/fset this :LEFT (Direction/jnew_4 (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :LEFT) "WEST" 0 1))
    (JR/fset this :RIGHT (Direction/jnew_4 (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :RIGHT) "EAST" 1 0))
    (JR/fset this :DOWN (Direction/jnew_4 (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :DOWN) "SOUTH" 2 0))
    (JR/fset this :UP (Direction/jnew_4 (JR/fget (JR/scall 'CommonPhoneStrings :jm_getInstance_0) :UP) "NORTH" 3 0))
    (JR/fset this :NOT_BORDERED_WITH (Direction/jnew_4 "NOT_BORDERED_WITH" "NOT_BORDERED_WITH" 8 0))
    (JR/fset this :NO_DIRECTION (Direction/jnew_4 "NO_DIRECTION" "NO_DIRECTION" 9 0))
    (JR/fset this :TOP (Direction/jnew_4 "TOP" "TOP" 10 0))
    (JR/fset this :BOTTOM (Direction/jnew_4 "BOTTOM" "BOTTOM" 11 0))
    (JR/fset this :ALL_DIRECTION (Direction/jnew_4 "ALL_DIRECTION" "ALL_DIRECTION" 12 0))
  this)

    
(defn jm_getInstance_0 []
  (let [this nil]
        (DirectionFactory/jstatic_instance)))

    
(defn jinit_0 [this]
  (let [ l_stringBuffer (volatile! nil) l_commonSeps (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (vreset! l_commonSeps (JR/scall 'CommonSeps :jm_getInstance_0))
        (JR/fset this :UP_LEFT (Direction/jnew_4 "UP LEFT" (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :UP) :jm_getOtherName_0)) :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/invoke (JR/fget this :LEFT) :jm_getOtherName_0))) 4 0))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/fset this :UP_RIGHT (Direction/jnew_4 "UP RIGHT" (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :UP) :jm_getOtherName_0)) :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/invoke (JR/fget this :RIGHT) :jm_getOtherName_0))) 5 0))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/fset this :DOWN_LEFT (Direction/jnew_4 "DOWN LEFT" (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :DOWN) :jm_getOtherName_0)) :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/invoke (JR/fget this :LEFT) :jm_getOtherName_0))) 6 0))
        (JR/invoke @l_stringBuffer :jm_delete_2 0 (JR/invoke @l_stringBuffer :jm_length_0))
        (JR/fset this :DOWN_RIGHT (Direction/jnew_4 "DOWN RIGHT" (JR/to-string-of (JR/invoke (JR/invoke (JR/invoke @l_stringBuffer :jm_append_1 (JR/invoke (JR/fget this :DOWN) :jm_getOtherName_0)) :jm_append_1 (JR/fget @l_commonSeps :SPACE)) :jm_append_1 (JR/invoke (JR/fget this :RIGHT) :jm_getOtherName_0))) 7 0)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'DirectionFactory)] (jinit_0 o) o))



