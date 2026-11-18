;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2022 AllBinary 
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
;; package javax.microedition.lcdui

(ns ChoiceGroupImageFactory)

(JR/register 'ChoiceGroupImageFactory nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (ChoiceGroupImageFactory/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :multiOff nil)
  (JR/fset this :multiOn nil)
  (JR/fset this :radioOff nil)
  (JR/fset this :radioOn nil)
  (JR/fset this :midpUtil nil)
  (JR/fset this :imgMultiOffO nil)
  (JR/fset this :imgMultiOnO nil)
  (JR/fset this :imgRadioOffO nil)
  (JR/fset this :imgRadioOnO nil)
  (JR/fset this :imgMultiOff nil)
  (JR/fset this :imgMultiOn nil)
  (JR/fset this :imgRadioOff nil)
  (JR/fset this :imgRadioOn nil)
  (JR/fset this :imageArray nil)
    (JR/fset this :multiOff (JR/afrom "BYTE" 1 [(JR/i8 (unchecked-int (unchecked-negate (JR/c2i 119)))) 80 78 71 13 10 26 10 0 0 0 13 73 72 68 82 0 0 0 10 0 0 0 11 2 3 0 0 0 59 0 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 12)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 117)))) 0 0 0 6 80 76 84 69 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 57)))) 75 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 33)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 8)))) 0 0 0 30 73 68 65 84 120 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 38)))) 99 96 96 96 96 12 101 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 8)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 51)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 32)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 64)))) 32 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 64)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 60)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 64)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 64)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 128)))) 11 51 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 122)))) 50 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 4)))) 6 0 63 116 3 1 53 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 108)))) 39 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 26)))) 0 0 0 0 73 69 78 68 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) 66 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 126))))]))
    (JR/fset this :multiOn (JR/afrom "BYTE" 1 [(JR/i8 (unchecked-int (unchecked-negate (JR/c2i 119)))) 80 78 71 13 10 26 10 0 0 0 13 73 72 68 82 0 0 0 10 0 0 0 11 2 3 0 0 0 59 0 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 12)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 117)))) 0 0 0 12 80 76 84 69 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) 106 106 106 2 2 2 106 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 103)))) 14 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 47)))) 0 0 0 53 73 68 65 84 120 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 38)))) 99 96 96 124 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 64)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 16)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 77)))) 3 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 45)))) 65 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 111)))) 15 76 12 108 12 76 12 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 4)))) 12 76 12 18 12 76 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 68)))) 127 24 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 104)))) 126 45 96 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 7)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 11)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 109)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 127)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 23)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 65)))) 3 3 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 29)))) 127 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 122)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 113)))) 0 5 37 12 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 34)))) 1 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 99)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 83)))) 100 0 0 0 0 73 69 78 68 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) 66 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 126))))]))
    (JR/fset this :radioOff (JR/afrom "BYTE" 1 [(JR/i8 (unchecked-int (unchecked-negate (JR/c2i 119)))) 80 78 71 13 10 26 10 0 0 0 13 73 72 68 82 0 0 0 11 0 0 0 11 2 3 0 0 0 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 44)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 97)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 75)))) 0 0 0 9 80 76 84 69 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) 106 106 106 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 44)))) 13 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 24)))) 0 0 0 42 73 68 65 84 120 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 38)))) 99 96 90 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 59)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 64)))) 32 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 63)))) 48 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 127)))) 65 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 127)))) 65 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 127)))) 41 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 127)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 31)))) 5 19 3 3 3 50 102 80 96 80 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 6)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 63)))) 80 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 64)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 64)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 76)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 118)))) 1 0 113 24 5 61 73 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 68)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 100)))) 98 0 0 0 0 73 69 78 68 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) 66 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 126))))]))
    (JR/fset this :radioOn (JR/afrom "BYTE" 1 [(JR/i8 (unchecked-int (unchecked-negate (JR/c2i 119)))) 80 78 71 13 10 26 10 0 0 0 13 73 72 68 82 0 0 0 11 0 0 0 11 2 3 0 0 0 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 44)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 97)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 75)))) 0 0 0 12 80 76 84 69 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 1)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 69)))) 106 106 106 2 2 2 106 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 103)))) 14 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 47)))) 0 0 0 50 73 68 65 84 120 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 38)))) 5 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 63)))) 65 13 0 32 12 4 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 63)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 19)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 11)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 117)))) 1 18 68 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 100)))) 10 52 19 94 72 64 17 101 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 122)))) 44 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 44)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 29)))) 98 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 52)))) 89 77 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 102)))) 40 2 85 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 95)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 73)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 63)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 104)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 63)))) 37 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 117)))) 15 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 40)))) 119 10 41 78 26 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 79)))) 59 0 0 0 0 73 69 78 68 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) 66 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 126))))]))
    (JR/fset this :midpUtil (JR/scall 'MIDPUtil :jm_getInstance_0))
    (JR/fset this :imgMultiOffO (JR/invoke (JR/fget this :midpUtil) :jm_createImageFromByteArray_3 (JR/fget this :multiOff) 0 (JR/alen (JR/fget this :multiOff))))
    (JR/fset this :imgMultiOnO (JR/invoke (JR/fget this :midpUtil) :jm_createImageFromByteArray_3 (JR/fget this :multiOn) 0 (JR/alen (JR/fget this :multiOn))))
    (JR/fset this :imgRadioOffO (JR/invoke (JR/fget this :midpUtil) :jm_createImageFromByteArray_3 (JR/fget this :radioOff) 0 (JR/alen (JR/fget this :radioOff))))
    (JR/fset this :imgRadioOnO (JR/invoke (JR/fget this :midpUtil) :jm_createImageFromByteArray_3 (JR/fget this :radioOn) 0 (JR/alen (JR/fget this :radioOn))))
    (JR/fset this :imgMultiOff (JR/fget this :imgMultiOffO))
    (JR/fset this :imgMultiOn (JR/fget this :imgMultiOnO))
    (JR/fset this :imgRadioOff (JR/fget this :imgRadioOffO))
    (JR/fset this :imgRadioOn (JR/fget this :imgRadioOnO))
    (JR/fset this :imageArray (JR/afrom "Object" 1 [(JR/fget this :imgMultiOff) (JR/fget this :imgMultiOn) (JR/fget this :imgRadioOff) (JR/fget this :imgRadioOn)]))
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'ChoiceGroupImageFactory)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ChoiceGroupImageFactory/jstatic_instance)))

    
(defn jm_getImageArray_0 [this]
  (let []
        (JR/fget this :imageArray)))

    
(defn jm_init_1 [this p_imageArray]
  (let [ l_imageArray (volatile! p_imageArray)]
        (JR/fset this :imgMultiOff (JR/aget* @l_imageArray 0))
        (JR/aset* (JR/fget this :imageArray) 0 (JR/fget this :imgMultiOff))
        (JR/fset this :imgMultiOn (JR/aget* @l_imageArray 1))
        (JR/aset* (JR/fget this :imageArray) 1 (JR/fget this :imgMultiOn))
        (JR/fset this :imgRadioOff (JR/aget* @l_imageArray 2))
        (JR/aset* (JR/fget this :imageArray) 2 (JR/fget this :imgRadioOff))
        (JR/fset this :imgRadioOn (JR/aget* @l_imageArray 3))
        (JR/aset* (JR/fget this :imageArray) 3 (JR/fget this :imgRadioOn))))



