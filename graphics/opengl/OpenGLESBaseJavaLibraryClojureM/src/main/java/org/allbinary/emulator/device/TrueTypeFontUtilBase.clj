;; 
;; AllBinary Open License Version 1 
;; Copyright (c) 2025 AllBinary 
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
;; package org.allbinary.emulator.device

(ns TrueTypeFontUtilBase)

(JR/register 'TrueTypeFontUtilBase nil '[])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :shortPattern nil)
  (JR/fset this :patternAsBytes nil)
  (JR/fset this :pattern nil)
  (JR/fset this :charArray nil)
  (JR/fset this :_characterWidth nil)
  (JR/fset this :characterArray nil)
  (JR/fset this :size 0)
  (JR/fset this :lastCapIndex 0)
  (JR/fset this :currentFont nil)
  (JR/fset this :scale 0)
  (JR/fset this :CELLS_PER_ROW 0)
  (JR/fset this :fontSize 0)
  (JR/fset this :baseCharWidth 0)
  (JR/fset this :cellSize 0)
  (JR/fset this :textureSize 0)
  (JR/fset this :actualCellsPerRow 0)
    (JR/fset this :patternAsBytes (JR/afrom "BYTE" 1 [32 48 49 50 51 52 53 54 55 56 57 65 66 32 32 32 67 68 69 70 71 72 73 74 75 76 77 78 79 32 32 32 80 81 82 83 84 85 86 87 88 89 90 97 98 32 32 32 99 100 101 102 103 104 105 106 107 108 109 110 111 32 32 32 112 113 114 115 116 117 118 119 120 121 122 46 63 32 32 32 33 36 37 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 84)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 84)))) 34 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 93)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 93)))) 94 38 42 40 32 32 32 41 95 43 45 61 91 93 123 125 59 39 35 58 32 32 32 64 126 44 47 60 62 92 124 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 87)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 87))))]))
    (JR/fset this :pattern (JR/new-string (JR/fget this :patternAsBytes)))
    (JR/fset this :charArray (JR/afrom "SHORT" 1 [(unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x6f) (unchecked-int 0x50) (unchecked-int 0x56) (unchecked-int 0x6b) (unchecked-int 0x51) (unchecked-int 0x52) (unchecked-int 0x5a) (unchecked-int 0x6a) (unchecked-int 0x5c) (unchecked-int 0x60) (unchecked-int 0x5b) (unchecked-int 0x62) (unchecked-int 0x72) (unchecked-int 0x63) (unchecked-int 0x4b) (unchecked-int 0x73) (unchecked-int 0x1) (unchecked-int 0x2) (unchecked-int 0x3) (unchecked-int 0x4) (unchecked-int 0x5) (unchecked-int 0x6) (unchecked-int 0x7) (unchecked-int 0x8) (unchecked-int 0x9) (unchecked-int 0xa) (unchecked-int 0x6c) (unchecked-int 0x69) (unchecked-int 0x74) (unchecked-int 0x64) (unchecked-int 0x75) (unchecked-int 0x4c) (unchecked-int 0x70) (unchecked-int 0xb) (unchecked-int 0xc) (unchecked-int 0x10) (unchecked-int 0x11) (unchecked-int 0x12) (unchecked-int 0x13) (unchecked-int 0x14) (unchecked-int 0x15) (unchecked-int 0x16) (unchecked-int 0x17) (unchecked-int 0x18) (unchecked-int 0x19) (unchecked-int 0x1a) (unchecked-int 0x1b) (unchecked-int 0x1c) (unchecked-int 0x20) (unchecked-int 0x21) (unchecked-int 0x22) (unchecked-int 0x23) (unchecked-int 0x24) (unchecked-int 0x25) (unchecked-int 0x26) (unchecked-int 0x27) (unchecked-int 0x28) (unchecked-int 0x29) (unchecked-int 0x2a) (unchecked-int 0x65) (unchecked-int 0x76) (unchecked-int 0x66) (unchecked-int 0x59) (unchecked-int 0x61) (unchecked-int 0x53) (unchecked-int 0x2b) (unchecked-int 0x2c) (unchecked-int 0x30) (unchecked-int 0x31) (unchecked-int 0x32) (unchecked-int 0x33) (unchecked-int 0x34) (unchecked-int 0x35) (unchecked-int 0x36) (unchecked-int 0x37) (unchecked-int 0x38) (unchecked-int 0x39) (unchecked-int 0x3a) (unchecked-int 0x3b) (unchecked-int 0x3c) (unchecked-int 0x40) (unchecked-int 0x41) (unchecked-int 0x42) (unchecked-int 0x43) (unchecked-int 0x44) (unchecked-int 0x45) (unchecked-int 0x46) (unchecked-int 0x47) (unchecked-int 0x48) (unchecked-int 0x49) (unchecked-int 0x4a) (unchecked-int 0x67) (unchecked-int 0x77) (unchecked-int 0x68) (unchecked-int 0x71) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x58) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x7b) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x55) (unchecked-int 0x0) (unchecked-int 0x79) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0) (unchecked-int 0x0)]))
    (JR/fset this :_characterWidth (JR/anew "INT" 1 (JR/slength (JR/fget this :pattern))))
    (JR/fset this :characterArray (JR/anew "CHAR" 1 1))
    (JR/fset this :size (JR/slength (JR/fget this :pattern)))
    (JR/fset this :lastCapIndex (JR/invoke (JR/fget this :pattern) :jm_indexOf_1 \Z))
    (JR/fset this :currentFont (JR/scall 'Font :jm_getDefaultFont_0))
  this)

    
(defn jinit_1 [this p_scale]
  (let [ l_scale (volatile! p_scale) l_shortPattern (volatile! nil) l_shortPatterAsByteArray (volatile! nil)]
    nil (jinitfields this)
        (vreset! l_shortPattern (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING))
        (if (JR/scall 'AvianUtil :jm_isAvian_0)
            (do
            (vreset! l_shortPatterAsByteArray (JR/afrom "BYTE" 1 [32 48 49 50 51 52 53 54 55 56 57 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 46 63 33 36 37 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 84)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 84)))) 34 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 93)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 93)))) 94 38 42 40 41 95 43 45 61 91 93 123 125 59 39 35 58 64 126 44 47 60 62 92 124 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 87)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 87))))]))
            (vreset! l_shortPattern (JR/new-string @l_shortPatterAsByteArray)))
            (do
            (vreset! l_shortPatterAsByteArray (JR/afrom "BYTE" 1 [32 48 49 50 51 52 53 54 55 56 57 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 46 63 33 36 37 96 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 84)))) 34 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 93)))) 94 38 42 40 41 95 43 45 61 91 93 123 125 59 39 35 58 64 126 44 47 60 62 92 124 (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 82)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 62)))) (JR/i8 (unchecked-int (unchecked-negate (JR/c2i 87))))]))
            (vreset! l_shortPattern (JR/new-string @l_shortPatterAsByteArray))))
        (JR/fset this :shortPattern @l_shortPattern)
        (JR/fset this :scale @l_scale)
        (JR/fset this :CELLS_PER_ROW 16)
        (JR/fset this :fontSize (unchecked-int (unchecked-multiply (unchecked-int (unchecked-add 20 6)) (JR/fget this :scale))))
        (JR/fset this :baseCharWidth (unchecked-int (unchecked-add (JR/fget this :fontSize) (unchecked-int (unchecked-multiply 6 (JR/fget this :scale))))))
        (JR/fset this :cellSize (unchecked-int (unchecked-add (JR/fget this :fontSize) (unchecked-int (unchecked-multiply 6 (JR/fget this :scale))))))
        (JR/fset this :textureSize (JR/invoke this :jm_getAsTextureSize_1 (unchecked-int (unchecked-multiply (JR/fget this :CELLS_PER_ROW) (JR/fget this :cellSize)))))
        (JR/fset this :actualCellsPerRow (JR/idiv (JR/fget this :textureSize) (JR/fget this :cellSize))))
  this)

(defn jnew_1 [p_scale ]
  (let [o (JR/alloc 'TrueTypeFontUtilBase)] (jinit_1 o p_scale) o))

    
(defn jm_getAsTextureSize_1 [this p_textureSize]
  (let [ l_textureSize (volatile! p_textureSize)]
        (if (<= @l_textureSize 64)
            (do
            (vreset! l_textureSize 64))
            (if (<= @l_textureSize 128)
            (do
            (vreset! l_textureSize 128))
            (if (<= @l_textureSize 256)
            (do
            (vreset! l_textureSize 256))
            (if (<= @l_textureSize 512)
            (do
            (vreset! l_textureSize 512))
            (if (<= @l_textureSize 1024)
            (do
            (vreset! l_textureSize 1024)))))))
        @l_textureSize))

    
(defn jm_getCellSize_1 [this p_cellSize]
  (let [ l_cellSize (volatile! p_cellSize)]
        (if (<= @l_cellSize 16)
            (do
            (vreset! l_cellSize 16))
            (if (<= @l_cellSize 32)
            (do
            (vreset! l_cellSize 32))
            (if (<= @l_cellSize 64)
            (do
            (vreset! l_cellSize 64))
            (if (<= @l_cellSize 128)
            (do
            (vreset! l_cellSize 128))
            (if (<= @l_cellSize 256)
            (do
            (vreset! l_cellSize 256)))))))
        @l_cellSize))

    
(defn jm_getYOffset_0 [this]
  (let []
        (unchecked-int (unchecked-multiply (unchecked-int (unchecked-subtract (JR/fget this :scale) 1)) (JR/fget this :cellSize)))))



