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

(ns AnimationFrameToImageUtil)

(JR/register 'AnimationFrameToImageUtil nil '[])

(def jsv_instance (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_instance [] (JR/ensure-init jclinit-state jclinit) @jsv_instance)
(defn jstatic_set_instance [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_instance v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_instance (AnimationFrameToImageUtil/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'AnimationFrameToImageUtil)] (jinit_0 o) o))

    
(defn jm_getInstance_0 []
  (let [this nil]
        (AnimationFrameToImageUtil/jstatic_instance)))

    
(defn jm_getInstanceTranslate_3 [this p_width p_height p_animationInterface]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_animationInterface (volatile! p_animationInterface) l_image (volatile! nil) l_graphics (volatile! nil) l_tranlateX (volatile! nil) l_tranlateY (volatile! nil)]
        (vreset! l_image (JR/invoke (JR/scall 'GameFeatureImageCacheFactory :jm_getInstance_0) :jm_get_3 (JR/class-name (AnimationFrameToImageUtil/jstatic_instance)) (JR/ishr (unchecked-int (unchecked-multiply @l_width 3)) 1) (JR/ishr (unchecked-int (unchecked-multiply @l_height 3)) 1)))
        (vreset! l_graphics (JR/invoke @l_image :jm_getGraphics_0))
        (vreset! l_tranlateX (JR/ishr @l_width 2))
        (vreset! l_tranlateY (JR/ishr @l_height 2))
        (JR/invoke @l_graphics :jm_translate_2 @l_tranlateX @l_tranlateY)
        (JR/invoke @l_animationInterface :jm_paintXY_3 @l_graphics 0 0)
        (JR/invoke @l_graphics :jm_translate_2 (unchecked-int (unchecked-negate (JR/c2i @l_tranlateX))) (unchecked-int (unchecked-negate (JR/c2i @l_tranlateY))))
        @l_image))

    
(defn jm_getInstanceWH_3 [this p_width p_height p_animationInterface]
  (let [ l_width (volatile! p_width) l_height (volatile! p_height) l_animationInterface (volatile! p_animationInterface) l_image (volatile! nil) l_graphics (volatile! nil)]
        (vreset! l_image (JR/invoke (JR/scall 'GameFeatureImageCacheFactory :jm_getInstance_0) :jm_get_3 (JR/class-name (AnimationFrameToImageUtil/jstatic_instance)) @l_width @l_height))
        (vreset! l_graphics (JR/invoke @l_image :jm_getGraphics_0))
        (JR/invoke @l_animationInterface :jm_paintXY_3 @l_graphics 0 0)
        @l_image))



