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
;; package org.allbinary.device

(ns NullGL10)

(JR/register 'NullGL10 nil '[GL10])

(def jsv_NULL_GL10 (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_GL10 [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_GL10)
(defn jstatic_set_NULL_GL10 [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_GL10 v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_GL10 (NullGL10/jnew_0))
    nil))

(defn jinitfields [this]
  this)

(defn jinit_0 [this]
  nil
  (jinitfields this))

(defn jnew_0 []
  (let [o (JR/alloc 'NullGL10)] (jinit_0 o) o))

    
(defn jm_glActiveTexture_1 [this p_texture]
  (let [ l_texture (volatile! p_texture)]
        nil))

    
(defn jm_glAlphaFunc_2 [this p_func p_ref]
  (let [ l_func (volatile! p_func) l_ref (volatile! p_ref)]
        nil))

    
(defn jm_glBindTexture_2 [this p_target p_texture]
  (let [ l_target (volatile! p_target) l_texture (volatile! p_texture)]
        nil))

    
(defn jm_glBlendFunc_2 [this p_sfactor p_dfactor]
  (let [ l_sfactor (volatile! p_sfactor) l_dfactor (volatile! p_dfactor)]
        nil))

    
(defn jm_glClear_1 [this p_mask]
  (let [ l_mask (volatile! p_mask)]
        nil))

    
(defn jm_glClearColor_4 [this p_red p_green p_blue p_alpha]
  (let [ l_red (volatile! p_red) l_green (volatile! p_green) l_blue (volatile! p_blue) l_alpha (volatile! p_alpha)]
        nil))

    
(defn jm_glClearDepthf_1 [this p_depth]
  (let [ l_depth (volatile! p_depth)]
        nil))

    
(defn jm_glClearStencil_1 [this p_s]
  (let [ l_s (volatile! p_s)]
        nil))

    
(defn jm_glClientActiveTexture_1 [this p_texture]
  (let [ l_texture (volatile! p_texture)]
        nil))

    
(defn jm_glColor4f_4 [this p_red p_green p_blue p_alpha]
  (let [ l_red (volatile! p_red) l_green (volatile! p_green) l_blue (volatile! p_blue) l_alpha (volatile! p_alpha)]
        nil))

    
(defn jm_glColorMask_4 [this p_red p_green p_blue p_alpha]
  (let [ l_red (volatile! p_red) l_green (volatile! p_green) l_blue (volatile! p_blue) l_alpha (volatile! p_alpha)]
        nil))

    
(defn jm_glColorPointer_4 [this p_size p_type p_stride p_pointer]
  (let [ l_size (volatile! p_size) l_type (volatile! p_type) l_stride (volatile! p_stride) l_pointer (volatile! p_pointer)]
        nil))

    
(defn jm_glCompressedTexImage2D_8 [this p_target p_level p_internalformat p_width p_height p_border p_imageSize p_data]
  (let [ l_target (volatile! p_target) l_level (volatile! p_level) l_internalformat (volatile! p_internalformat) l_width (volatile! p_width) l_height (volatile! p_height) l_border (volatile! p_border) l_imageSize (volatile! p_imageSize) l_data (volatile! p_data)]
        nil))

    
(defn jm_glCompressedTexSubImage2D_9 [this p_target p_level p_xoffset p_yoffset p_width p_height p_format p_imageSize p_data]
  (let [ l_target (volatile! p_target) l_level (volatile! p_level) l_xoffset (volatile! p_xoffset) l_yoffset (volatile! p_yoffset) l_width (volatile! p_width) l_height (volatile! p_height) l_format (volatile! p_format) l_imageSize (volatile! p_imageSize) l_data (volatile! p_data)]
        nil))

    
(defn jm_glCopyTexImage2D_8 [this p_target p_level p_internalformat p_x p_y p_width p_height p_border]
  (let [ l_target (volatile! p_target) l_level (volatile! p_level) l_internalformat (volatile! p_internalformat) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height) l_border (volatile! p_border)]
        nil))

    
(defn jm_glCopyTexSubImage2D_8 [this p_target p_level p_xoffset p_yoffset p_x p_y p_width p_height]
  (let [ l_target (volatile! p_target) l_level (volatile! p_level) l_xoffset (volatile! p_xoffset) l_yoffset (volatile! p_yoffset) l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height)]
        nil))

    
(defn jm_glCullFace_1 [this p_mode]
  (let [ l_mode (volatile! p_mode)]
        nil))

    
(defn jm_glDeleteTextures_3 [this p_n p_textures p_offset]
  (let [ l_n (volatile! p_n) l_textures (volatile! p_textures) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glDeleteTextures_2 [this p_n p_textures]
  (let [ l_n (volatile! p_n) l_textures (volatile! p_textures)]
        nil))

    
(defn jm_glDepthFunc_1 [this p_func]
  (let [ l_func (volatile! p_func)]
        nil))

    
(defn jm_glDepthMask_1 [this p_flag]
  (let [ l_flag (volatile! p_flag)]
        nil))

    
(defn jm_glDepthRangef_2 [this p_zNear p_zFar]
  (let [ l_zNear (volatile! p_zNear) l_zFar (volatile! p_zFar)]
        nil))

    
(defn jm_glDisable_1 [this p_cap]
  (let [ l_cap (volatile! p_cap)]
        nil))

    
(defn jm_glDisableClientState_1 [this p_array]
  (let [ l_array (volatile! p_array)]
        nil))

    
(defn jm_glDrawArrays_3 [this p_mode p_first p_count]
  (let [ l_mode (volatile! p_mode) l_first (volatile! p_first) l_count (volatile! p_count)]
        nil))

    
(defn jm_glDrawElements_4 [this p_mode p_count p_type p_indices]
  (let [ l_mode (volatile! p_mode) l_count (volatile! p_count) l_type (volatile! p_type) l_indices (volatile! p_indices)]
        nil))

    
(defn jm_glEnable_1 [this p_cap]
  (let [ l_cap (volatile! p_cap)]
        nil))

    
(defn jm_glEnableClientState_1 [this p_array]
  (let [ l_array (volatile! p_array)]
        nil))

    
(defn jm_glFinish_0 [this]
  (let []
        nil))

    
(defn jm_glFlush_0 [this]
  (let []
        nil))

    
(defn jm_glFogf_2 [this p_pname p_param]
  (let [ l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glFogfv_3 [this p_pname p_params p_offset]
  (let [ l_pname (volatile! p_pname) l_params (volatile! p_params) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glFogfv_2 [this p_pname p_params]
  (let [ l_pname (volatile! p_pname) l_params (volatile! p_params)]
        nil))

    
(defn jm_glFrontFace_1 [this p_mode]
  (let [ l_mode (volatile! p_mode)]
        nil))

    
(defn jm_glFrustumf_6 [this p_left p_right p_bottom p_top p_zNear p_zFar]
  (let [ l_left (volatile! p_left) l_right (volatile! p_right) l_bottom (volatile! p_bottom) l_top (volatile! p_top) l_zNear (volatile! p_zNear) l_zFar (volatile! p_zFar)]
        nil))

    
(defn jm_glGenTextures_3 [this p_n p_textures p_offset]
  (let [ l_n (volatile! p_n) l_textures (volatile! p_textures) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glGenTextures_2 [this p_n p_textures]
  (let [ l_n (volatile! p_n) l_textures (volatile! p_textures)]
        nil))

    
(defn jm_glGetError_0 [this]
  (let []
        0))

    
(defn jm_glGetIntegerv_3 [this p_pname p_params p_offset]
  (let [ l_pname (volatile! p_pname) l_params (volatile! p_params) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glGetIntegerv_2 [this p_pname p_params]
  (let [ l_pname (volatile! p_pname) l_params (volatile! p_params)]
        nil))

    
(defn jm_glGetString_1 [this p_name]
  (let [ l_name (volatile! p_name)]
        (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))

    
(defn jm_glHint_2 [this p_target p_mode]
  (let [ l_target (volatile! p_target) l_mode (volatile! p_mode)]
        nil))

    
(defn jm_glLightModelf_2 [this p_pname p_param]
  (let [ l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glLightModelfv_3 [this p_pname p_params p_offset]
  (let [ l_pname (volatile! p_pname) l_params (volatile! p_params) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glLightModelfv_2 [this p_pname p_params]
  (let [ l_pname (volatile! p_pname) l_params (volatile! p_params)]
        nil))

    
(defn jm_glLightf_3 [this p_light p_pname p_param]
  (let [ l_light (volatile! p_light) l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glLightfv_4 [this p_light p_pname p_params p_offset]
  (let [ l_light (volatile! p_light) l_pname (volatile! p_pname) l_params (volatile! p_params) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glLightfv_3 [this p_light p_pname p_params]
  (let [ l_light (volatile! p_light) l_pname (volatile! p_pname) l_params (volatile! p_params)]
        nil))

    
(defn jm_glLineWidth_1 [this p_width]
  (let [ l_width (volatile! p_width)]
        nil))

    
(defn jm_glLoadIdentity_0 [this]
  (let []
        nil))

    
(defn jm_glLoadMatrixf_2 [this p_m p_offset]
  (let [ l_m (volatile! p_m) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glLoadMatrixf_1 [this p_m]
  (let [ l_m (volatile! p_m)]
        nil))

    
(defn jm_glLogicOp_1 [this p_opcode]
  (let [ l_opcode (volatile! p_opcode)]
        nil))

    
(defn jm_glMaterialf_3 [this p_face p_pname p_param]
  (let [ l_face (volatile! p_face) l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glMaterialfv_4 [this p_face p_pname p_params p_offset]
  (let [ l_face (volatile! p_face) l_pname (volatile! p_pname) l_params (volatile! p_params) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glMaterialfv_3 [this p_face p_pname p_params]
  (let [ l_face (volatile! p_face) l_pname (volatile! p_pname) l_params (volatile! p_params)]
        nil))

    
(defn jm_glMatrixMode_1 [this p_mode]
  (let [ l_mode (volatile! p_mode)]
        nil))

    
(defn jm_glMultMatrixf_2 [this p_m p_offset]
  (let [ l_m (volatile! p_m) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glMultMatrixf_1 [this p_m]
  (let [ l_m (volatile! p_m)]
        nil))

    
(defn jm_glMultiTexCoord4f_5 [this p_target p_s p_t p_r p_q]
  (let [ l_target (volatile! p_target) l_s (volatile! p_s) l_t (volatile! p_t) l_r (volatile! p_r) l_q (volatile! p_q)]
        nil))

    
(defn jm_glNormal3f_3 [this p_nx p_ny p_nz]
  (let [ l_nx (volatile! p_nx) l_ny (volatile! p_ny) l_nz (volatile! p_nz)]
        nil))

    
(defn jm_glNormalPointer_3 [this p_type p_stride p_pointer]
  (let [ l_type (volatile! p_type) l_stride (volatile! p_stride) l_pointer (volatile! p_pointer)]
        nil))

    
(defn jm_glOrthof_6 [this p_left p_right p_bottom p_top p_zNear p_zFar]
  (let [ l_left (volatile! p_left) l_right (volatile! p_right) l_bottom (volatile! p_bottom) l_top (volatile! p_top) l_zNear (volatile! p_zNear) l_zFar (volatile! p_zFar)]
        nil))

    
(defn jm_glPixelStorei_2 [this p_pname p_param]
  (let [ l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glPointSize_1 [this p_size]
  (let [ l_size (volatile! p_size)]
        nil))

    
(defn jm_glPolygonOffset_2 [this p_factor p_units]
  (let [ l_factor (volatile! p_factor) l_units (volatile! p_units)]
        nil))

    
(defn jm_glPopMatrix_0 [this]
  (let []
        nil))

    
(defn jm_glPushMatrix_0 [this]
  (let []
        nil))

    
(defn jm_glReadPixels_7 [this p_x p_y p_width p_height p_format p_type p_pixels]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height) l_format (volatile! p_format) l_type (volatile! p_type) l_pixels (volatile! p_pixels)]
        nil))

    
(defn jm_glRotatef_4 [this p_angle p_x p_y p_z]
  (let [ l_angle (volatile! p_angle) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_glRotatex_4 [this p_angle p_x p_y p_z]
  (let [ l_angle (volatile! p_angle) l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_glSampleCoverage_2 [this p_value p_invert]
  (let [ l_value (volatile! p_value) l_invert (volatile! p_invert)]
        nil))

    
(defn jm_glScalef_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_glScalex_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_glScissor_4 [this p_x p_y p_width p_height]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height)]
        nil))

    
(defn jm_glShadeModel_1 [this p_mode]
  (let [ l_mode (volatile! p_mode)]
        nil))

    
(defn jm_glStencilFunc_3 [this p_func p_ref p_mask]
  (let [ l_func (volatile! p_func) l_ref (volatile! p_ref) l_mask (volatile! p_mask)]
        nil))

    
(defn jm_glStencilMask_1 [this p_mask]
  (let [ l_mask (volatile! p_mask)]
        nil))

    
(defn jm_glStencilOp_3 [this p_fail p_zfail p_zpass]
  (let [ l_fail (volatile! p_fail) l_zfail (volatile! p_zfail) l_zpass (volatile! p_zpass)]
        nil))

    
(defn jm_glTexCoordPointer_4 [this p_size p_type p_stride p_pointer]
  (let [ l_size (volatile! p_size) l_type (volatile! p_type) l_stride (volatile! p_stride) l_pointer (volatile! p_pointer)]
        nil))

    
(defn jm_glTexEnvf_3 [this p_target p_pname p_param]
  (let [ l_target (volatile! p_target) l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glTexEnvfv_4 [this p_target p_pname p_params p_offset]
  (let [ l_target (volatile! p_target) l_pname (volatile! p_pname) l_params (volatile! p_params) l_offset (volatile! p_offset)]
        nil))

    
(defn jm_glTexEnvfv_3 [this p_target p_pname p_params]
  (let [ l_target (volatile! p_target) l_pname (volatile! p_pname) l_params (volatile! p_params)]
        nil))

    
(defn jm_glTexImage2D_9 [this p_target p_level p_internalformat p_width p_height p_border p_format p_type p_pixels]
  (let [ l_target (volatile! p_target) l_level (volatile! p_level) l_internalformat (volatile! p_internalformat) l_width (volatile! p_width) l_height (volatile! p_height) l_border (volatile! p_border) l_format (volatile! p_format) l_type (volatile! p_type) l_pixels (volatile! p_pixels)]
        nil))

    
(defn jm_glTexParameterf_3 [this p_target p_pname p_param]
  (let [ l_target (volatile! p_target) l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glTexParameteri_3 [this p_target p_pname p_param]
  (let [ l_target (volatile! p_target) l_pname (volatile! p_pname) l_param (volatile! p_param)]
        nil))

    
(defn jm_glTexSubImage2D_9 [this p_target p_level p_xoffset p_yoffset p_width p_height p_format p_type p_pixels]
  (let [ l_target (volatile! p_target) l_level (volatile! p_level) l_xoffset (volatile! p_xoffset) l_yoffset (volatile! p_yoffset) l_width (volatile! p_width) l_height (volatile! p_height) l_format (volatile! p_format) l_type (volatile! p_type) l_pixels (volatile! p_pixels)]
        nil))

    
(defn jm_glTranslatef_3 [this p_x p_y p_z]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_z (volatile! p_z)]
        nil))

    
(defn jm_glVertexPointer_4 [this p_size p_type p_stride p_pointer]
  (let [ l_size (volatile! p_size) l_type (volatile! p_type) l_stride (volatile! p_stride) l_pointer (volatile! p_pointer)]
        nil))

    
(defn jm_glViewport_4 [this p_x p_y p_width p_height]
  (let [ l_x (volatile! p_x) l_y (volatile! p_y) l_width (volatile! p_width) l_height (volatile! p_height)]
        nil))

    
(defn jm_glBegin_1 [this p_i]
  (let [ l_i (volatile! p_i)]
        nil))

    
(defn jm_glEnd_0 [this]
  (let []
        nil))

    
(defn jm_glVertex3f_3 [this p_f p_f2 p_f3]
  (let [ l_f (volatile! p_f) l_f2 (volatile! p_f2) l_f3 (volatile! p_f3)]
        nil))

    
(defn jm_glPolygonMode_2 [this p_i p_i1]
  (let [ l_i (volatile! p_i) l_i1 (volatile! p_i1)]
        nil))



