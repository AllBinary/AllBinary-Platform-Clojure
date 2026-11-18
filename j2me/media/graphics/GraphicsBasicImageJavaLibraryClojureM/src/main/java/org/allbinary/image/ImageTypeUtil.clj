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
;; package org.allbinary.image

(ns ImageTypeUtil)

(JR/register 'ImageTypeUtil nil '[])

(def jsv_SINGLETON (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_SINGLETON [] (JR/ensure-init jclinit-state jclinit) @jsv_SINGLETON)
(defn jstatic_set_SINGLETON [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_SINGLETON v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_SINGLETON (ImageTypeUtil/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :PNG nil)
  (JR/fset this :JPG nil)
  (JR/fset this :GIF nil)
  (JR/fset this :list nil)
    (JR/fset this :PNG "png")
    (JR/fset this :JPG "jpg")
    (JR/fset this :GIF "gif")
    (JR/fset this :list (BasicArrayListD/jnew_0))
  this)

    
(defn jinit_0 [this]
  (let []
    nil (jinitfields this)
        (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :JPG))
        (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :GIF))
        (JR/invoke (JR/fget this :list) :jm_add_1 (JR/fget this :PNG)))
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ImageTypeUtil)] (jinit_0 o) o))

    
(defn jm_isSupported_1 [this p_mediaFileType]
  (let [ l_mediaFileType (volatile! p_mediaFileType) l_name (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_mediaFileType (JR/invoke @l_mediaFileType :jm_toLowerCase_0))
        (do (vreset! l_index (unchecked-int (unchecked-subtract (JR/invoke (JR/fget this :list) :jm_size_0) 1)))
            (JR/jfor false false (>= @l_index 0) (do (JR/vinc l_index -1 :int false))
            (vreset! l_name (JR/invoke (JR/fget this :list) :jm_get_1 @l_index))
            (if (JR/eq (JR/invoke @l_mediaFileType :jm_compareTo_1 @l_name) 0)
                (do
                (JR/jreturn true)))))
        false)))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (ImageTypeUtil/jstatic_SINGLETON)))



