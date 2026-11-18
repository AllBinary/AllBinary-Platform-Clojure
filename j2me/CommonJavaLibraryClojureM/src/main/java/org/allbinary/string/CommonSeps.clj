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
;; package org.allbinary.string

(ns CommonSeps)

(JR/register 'CommonSeps nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (CommonSeps/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :NEW_LINE nil)
  (JR/fset this :SEMICOLON nil)
  (JR/fset this :EQUALS nil)
  (JR/fset this :SPACE nil)
  (JR/fset this :COMMA nil)
  (JR/fset this :COLON nil)
  (JR/fset this :PERIOD nil)
  (JR/fset this :UNDERSCORE nil)
  (JR/fset this :COLON_SEP nil)
  (JR/fset this :COMMA_SEP nil)
  (JR/fset this :PARENTHESIS_OPEN nil)
  (JR/fset this :PARENTHESIS_CLOSE nil)
  (JR/fset this :BRACE_OPEN nil)
  (JR/fset this :BRACE_CLOSE nil)
  (JR/fset this :BRACKET_OPEN nil)
  (JR/fset this :BRACKET_CLOSE nil)
  (JR/fset this :DASH nil)
  (JR/fset this :PERCENT nil)
  (JR/fset this :AMPERSAND nil)
  (JR/fset this :FORWARD_SLASH nil)
  (JR/fset this :BACK_SLASH nil)
  (JR/fset this :QUESTION nil)
  (JR/fset this :QUOTE nil)
  (JR/fset this :QUOTE_END nil)
  (JR/fset this :COMMENT nil)
  (JR/fset this :INDENT nil)
    (JR/fset this :NEW_LINE "\n")
    (JR/fset this :SEMICOLON ";")
    (JR/fset this :EQUALS "=")
    (JR/fset this :SPACE " ")
    (JR/fset this :COMMA ",")
    (JR/fset this :COLON ":")
    (JR/fset this :PERIOD ".")
    (JR/fset this :UNDERSCORE "_")
    (JR/fset this :COLON_SEP (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :COLON)) :jm_append_1 (JR/fget this :SPACE))))
    (JR/fset this :COMMA_SEP (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 (JR/fget this :COMMA)) :jm_append_1 (JR/fget this :SPACE))))
    (JR/fset this :PARENTHESIS_OPEN "(")
    (JR/fset this :PARENTHESIS_CLOSE ")")
    (JR/fset this :BRACE_OPEN "{")
    (JR/fset this :BRACE_CLOSE "}")
    (JR/fset this :BRACKET_OPEN "[")
    (JR/fset this :BRACKET_CLOSE "]")
    (JR/fset this :DASH "-")
    (JR/fset this :PERCENT "%")
    (JR/fset this :AMPERSAND "&")
    (JR/fset this :FORWARD_SLASH "/")
    (JR/fset this :BACK_SLASH "\\")
    (JR/fset this :QUESTION "?")
    (JR/fset this :QUOTE "\"")
    (JR/fset this :QUOTE_END "\",")
    (JR/fset this :COMMENT "//")
    (JR/fset this :INDENT "    ")
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'CommonSeps)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (CommonSeps/jstatic_instance)))



