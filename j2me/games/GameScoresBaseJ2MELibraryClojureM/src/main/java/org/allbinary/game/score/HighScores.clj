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

(ns HighScores)

(JR/register 'HighScores nil '[HighScoresInterface])

(def jclinit-state (atom 0))
(declare jclinit)

(defn jclinit []
  (let [this nil]
    nil))

(defn jinitfields [this]
  (JR/fset this :orderedHighScoresList nil)
  (JR/fset this :name nil)
  (JR/fset this :heading nil)
  (JR/fset this :columnOneHeading nil)
  (JR/fset this :columnTwoHeading nil)
    (JR/fset this :orderedHighScoresList (BasicArrayListD/jnew_0))
    (JR/fset this :columnOneHeading "Name")
  this)

    
(defn jinit_3 [this p_name p_heading p_columnTwoHeading]
  (let [ l_name (volatile! p_name) l_heading (volatile! p_heading) l_columnTwoHeading (volatile! p_columnTwoHeading)]
    nil (jinitfields this)
        (JR/fset this :name @l_name)
        (JR/fset this :heading @l_heading)
        (JR/fset this :columnTwoHeading @l_columnTwoHeading))
  this)

(defn jnew_3 [p_name p_heading p_columnTwoHeading ]
  (let [o (JR/alloc 'HighScores)] (jinit_3 o p_name p_heading p_columnTwoHeading) o))

    
(defn jm_setList_1 [this p_orderedHighScoresList]
  (let [ l_orderedHighScoresList (volatile! p_orderedHighScoresList)]
        (JR/fset this :orderedHighScoresList @l_orderedHighScoresList)))

    
(defn jm_getList_0 [this]
  (let []
        (JR/fget this :orderedHighScoresList)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/fget this :name)))

    
(defn jm_getTotal_0 [this]
  (let []
        (JR/invoke (JR/invoke this :jm_getList_0) :jm_size_0)))

    
(defn jm_addHighScore_1 [this p_newHighScore]
  (let [ l_newHighScore (volatile! p_newHighScore)]
        (JR/invoke (JR/fget this :orderedHighScoresList) :jm_add_1 @l_newHighScore)))

    
(defn jm_getHeading_0 [this]
  (let []
        (JR/fget this :heading)))

    
(defn jm_getColumnOneHeading_0 [this]
  (let []
        (JR/fget this :columnOneHeading)))

    
(defn jm_getColumnTwoHeading_0 [this]
  (let []
        (JR/fget this :columnTwoHeading)))

    
(defn jm_isBestScore_1 [this p_newHighScore]
  (let [ l_newHighScore (volatile! p_newHighScore)]
        false))

    
(defn jm_toString_0 [this]
  (let [ l_stringBuffer (volatile! nil)]
        (vreset! l_stringBuffer (StringMaker/jnew_0))
        (JR/invoke @l_stringBuffer :jm_append_1 "HighScores: ")
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget this :heading))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonSeps :jm_getInstance_0) :SPACE))
        (JR/invoke @l_stringBuffer :jm_append_1 (JR/fget (JR/scall 'CommonLabels :jm_getInstance_0) :TOTAL_LABEL))
        (JR/invoke @l_stringBuffer :jm_appendint_1 (JR/invoke (JR/fget this :orderedHighScoresList) :jm_size_0))
        (JR/to-string-of @l_stringBuffer)))



