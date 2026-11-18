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

(ns ImageCache)

(JR/register 'ImageCache 'ImageCacheBase '[])

(def jsv_NULL_IMAGE_CACHE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_IMAGE_CACHE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_IMAGE_CACHE)
(defn jstatic_set_NULL_IMAGE_CACHE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_IMAGE_CACHE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_IMAGE_CACHE (ImageCache/jnew_0))
    nil))

(defn jinitfields [this]
  (JR/fset this :commonStrings nil)
  (JR/fset this :tsUtil nil)
    (JR/fset this :commonStrings (JR/scall 'CommonStrings :jm_getInstance_0))
    (JR/fset this :tsUtil (JR/scall 'TsUtil :jm_getInstance_0))
  this)

    
(defn jinit_0 [this]
  (let []
    (ImageCacheBase/jinit_0 this) (jinitfields this)
        nil)
  this)

(defn jnew_0 []
  (let [o (JR/alloc 'ImageCache)] (jinit_0 o) o))

    
(defn jm_addListener_1 [this p_renderer]
  (let [ l_renderer (volatile! p_renderer)]
        nil))

    
(defn jm_getIndex_1 [this p_key]
  (let [ l_key (volatile! p_key) l_gdResources (volatile! nil) l_resourceStringArray (volatile! nil) l_size (volatile! nil) l_index (volatile! nil)](JR/method
        (vreset! l_gdResources (JR/scall 'GDResources :jm_getInstance_0))
        (vreset! l_resourceStringArray (JR/fget @l_gdResources :resourceStringArray))
        (vreset! l_size (JR/alen @l_resourceStringArray))
        (do (vreset! l_index 0)
            (JR/jfor false false (< @l_index @l_size) (do (JR/vinc l_index 1 :int false))
            (if (JR/eq (JR/aget* @l_resourceStringArray @l_index) @l_key)
                (do
                (JR/jreturn @l_index)))))
        (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "unable to find key: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_key))) this (JR/fget (JR/fget this :commonStrings) :RUN))
        (JR/jthrow (new java.lang.RuntimeException)))))

    
(defn jm_get_3 [this p_caller p_width p_height]
  (let [ l_caller (volatile! p_caller) l_width (volatile! p_width) l_height (volatile! p_height) l_foundIndex (volatile! nil) l_image (volatile! nil) l_widths (volatile! nil)]
        (vreset! l_foundIndex (JR/invoke this :jm_getIndexWH_2 @l_width @l_height))
        (vreset! l_image (JR/invoke this :jm_getFromAvailable_3 @l_foundIndex @l_width @l_height))
        (if (JR/eq @l_image (JR/sget 'NullImage "NULL_IMAGE"))
            (do
            (JR/fset this :volume (+ (JR/fget this :volume) (unchecked-int (unchecked-multiply @l_width @l_height))))
            (if (> (JR/fget this :volume) 32000)
                (do
                (JR/invoke (JR/fget this :tsUtil) :jm_gc_0)
                (JR/fset this :volume 0)))
            (vreset! l_image (JR/invoke this :jm_createImage_3 @l_caller @l_width @l_height))
            (vreset! l_widths (JR/fget this :widths))
            (if (> (JR/fget this :nextIndex) (unchecked-int (unchecked-subtract (JR/alen @l_widths) 1)))
                (do
                (if (== @l_foundIndex (unchecked-int (unchecked-negate (JR/c2i 1))))
                    (do
                    (vreset! l_foundIndex (JR/fget this :nextIndex))
                    (JR/aset* @l_widths (JR/fget this :nextIndex) @l_width)
                    (JR/aset* (JR/fget this :heights) (JR/fget this :nextIndex) @l_height)
                    (JR/finc this :nextIndex 1 :any false)))
                (JR/invoke (JR/aget* (JR/fget this :listOfList) @l_foundIndex) :jm_add_1 @l_image)))))
        @l_image))

    
(defn jm_getWithKey_1 [this p_key]
  (let [ l_key (volatile! p_key) l_image (volatile! nil) l_resourceUtil (volatile! nil) l_resourceInputStream (volatile! nil) l_e (volatile! nil)]
        (vreset! l_image (JR/invoke this :jm_getImage_1 @l_key))
        (if (JR/eq @l_image (JR/sget 'NullImage "NULL_IMAGE"))
            (do
            (vreset! l_resourceUtil (JR/scall 'ResourceUtil :jm_getInstance_0))
            (vreset! l_resourceInputStream (JR/invoke @l_resourceUtil :jm_getResourceAsStream_1 @l_key))
            (if (nil? @l_resourceInputStream)
                (do
                (JR/jthrow (new java.lang.RuntimeException (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "Image resource is not available for key: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_key)))))))
            (try (do
                (vreset! l_image (JR/invoke this :jm_createImageFromInputStream_2 @l_key @l_resourceInputStream)))
                (catch Throwable jt (let [je (JR/caught jt)] (cond
                    (JR/instance-of je java.lang.Exception) (do (vreset! l_e je)
                (JR/invoke (JR/fget this :logUtil) :jm_put_4 "Exception: Trying Again After GC" this (JR/fget (JR/fget this :commonStrings) :GET) @l_e)
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/to-string-of (JR/invoke (JR/invoke (StringMaker/jnew_0) :jm_append_1 "InputStream: ") :jm_append_1 (JR/invoke (JR/scall 'StringUtil :jm_getInstance_0) :jm_toString_1 @l_resourceInputStream))) this (JR/fget (JR/fget this :commonStrings) :GET))
                (JR/invoke (JR/fget this :tsUtil) :jm_gc_0)
                (JR/invoke (JR/fget this :tsUtil) :jm_gc_0)
                (JR/invoke (JR/fget this :logUtil) :jm_putF_3 (JR/scall 'Memory :jm_getInfo_0) this (JR/fget (JR/fget this :commonStrings) :GET))
                (java.lang.Thread/sleep 100)
                (vreset! l_image (JR/invoke this :jm_createImageFromInputStream_2 @l_key @l_resourceInputStream))) :else (throw jt)))))
            (if (JR/scall 'J2MEUtil :jm_isHTML_0)
                (do
                nil)
                (do
                (JR/invoke @l_resourceInputStream :jm_close_0)))
            (JR/invoke (JR/fget this :hashtable) :jm_put_2 @l_key @l_image)))
        @l_image))

    
(defn jm_loadImageForAnimation_0 [this]
  (let []
        nil))

    
(defn jm_progressEnded_0 [this]
  (let []
        nil))

    
(defn jm_runTask_0 [this]
  (let []
        nil))

    
(defn jm_isLazy_0 [this]
  (let []
        false))



