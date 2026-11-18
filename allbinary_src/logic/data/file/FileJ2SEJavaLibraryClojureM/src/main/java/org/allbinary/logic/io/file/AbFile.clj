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
;; package org.allbinary.logic.io.file

(ns AbFile)

(JR/register 'AbFile nil '[AbFileInterface])

(def jsv_NULL_FILE (atom nil))
(def jclinit-state (atom 0))
(declare jclinit)
(defn jstatic_NULL_FILE [] (JR/ensure-init jclinit-state jclinit) @jsv_NULL_FILE)
(defn jstatic_set_NULL_FILE [v] (JR/ensure-init jclinit-state jclinit) (reset! jsv_NULL_FILE v))

(defn jclinit []
  (let [this nil]
    (reset! jsv_NULL_FILE (AbFile/jm_createAbFileFromRawPath_1 (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)))
    nil))

(defn jinitfields [this]
  (JR/fset this :file nil)
  this)

    
(defn jm_createAbFileWithChild_2 [p_file p_childPathName]
  (let [this nil l_file (volatile! p_file) l_childPathName (volatile! p_childPathName)]
        (AbFile/jnew_1 (new java.io.File (JR/invoke @l_file :jm_getFile_0) @l_childPathName))))

    
(defn jm_createAbFile_1 [p_filePath]
  (let [this nil l_filePath (volatile! p_filePath)]
        (AbFile/jnew_1 (new java.io.File (JR/invoke (AbPath/jnew_2 @l_filePath (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)) :jm_toFileSystemString_0)))))

    
(defn jm_createAbFilePathAndName_2 [p_filePath p_fileName]
  (let [this nil l_filePath (volatile! p_filePath) l_fileName (volatile! p_fileName)]
        (AbFile/jnew_1 (new java.io.File (JR/invoke (AbPath/jnew_2 @l_filePath (JR/fget (JR/scall 'StringUtil :jm_getInstance_0) :EMPTY_STRING)) :jm_toFileSystemString_0) @l_fileName))))

    
(defn jm_createAbFileFromAbPath_1 [p_abPath]
  (let [this nil l_abPath (volatile! p_abPath)]
        (AbFile/jnew_1 (new java.io.File (JR/invoke @l_abPath :jm_toFileSystemString_0)))))

    
(defn jm_createAbFileFromRawPath_1 [p_filePath]
  (let [this nil l_filePath (volatile! p_filePath)]
        (AbFile/jnew_1 (new java.io.File @l_filePath))))

    
(defn jinit_1 [this p_file]
  (let [ l_file (volatile! p_file)]
    nil (jinitfields this)
        (JR/fset this :file @l_file))
  this)

(defn jnew_1 [p_file ]
  (let [o (JR/alloc 'AbFile)] (jinit_1 o p_file) o))

    
(defn jm_getFile_0 [this]
  (let []
        (JR/fget this :file)))

    
(defn jm_getName_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getName_0)))

    
(defn jm_getParent_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getParent_0)))

    
(defn jm_getParentFile_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getParentFile_0)))

    
(defn jm_getPath_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getPath_0)))

    
(defn jm_isAbsolute_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_isAbsolute_0)))

    
(defn jm_getAbsolutePath_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getAbsolutePath_0)))

    
(defn jm_getAbsoluteFile_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getAbsoluteFile_0)))

    
(defn jm_getCanonicalPath_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getCanonicalPath_0)))

    
(defn jm_getCanonicalFile_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getCanonicalFile_0)))

    
(defn jm_toURI_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_toURI_0)))

    
(defn jm_canRead_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_canRead_0)))

    
(defn jm_canWrite_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_canWrite_0)))

    
(defn jm_exists_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_exists_0)))

    
(defn jm_isDirectory_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_isDirectory_0)))

    
(defn jm_isFile_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_isFile_0)))

    
(defn jm_isHidden_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_isHidden_0)))

    
(defn jm_lastModified_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_lastModified_0)))

    
(defn jm_length_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_length_0)))

    
(defn jm_createNewFile_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_createNewFile_0)))

    
(defn jm_delete_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_delete_0)))

    
(defn jm_deleteOnExit_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_deleteOnExit_0)))

    
(defn jm_list_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_list_0)))

    
(defn jm_listWithFilter_1 [this p_filter]
  (let [ l_filter (volatile! p_filter)]
        (JR/invoke (JR/fget this :file) :jm_list_1 @l_filter)))

    
(defn jm_listFiles_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_listFiles_0)))

    
(defn jm_listFilesFileNameFilter_1 [this p_filter]
  (let [ l_filter (volatile! p_filter)]
        (JR/invoke (JR/fget this :file) :jm_listFiles_1 @l_filter)))

    
(defn jm_listFilesFileFilter_1 [this p_filter]
  (let [ l_filter (volatile! p_filter)]
        (JR/invoke (JR/fget this :file) :jm_listFiles_1 @l_filter)))

    
(defn jm_mkdir_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_mkdir_0)))

    
(defn jm_mkdirs_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_mkdirs_0)))

    
(defn jm_renameTo_1 [this p_dest]
  (let [ l_dest (volatile! p_dest)]
        (JR/invoke (JR/fget this :file) :jm_renameTo_1 (JR/invoke @l_dest :jm_getFile_0))))

    
(defn jm_setLastModified_1 [this p_time]
  (let [ l_time (volatile! p_time)]
        (JR/invoke (JR/fget this :file) :jm_setLastModified_1 @l_time)))

    
(defn jm_setReadOnly_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_setReadOnly_0)))

    
(defn jm_setWritable_2 [this p_writable p_ownerOnly]
  (let [ l_writable (volatile! p_writable) l_ownerOnly (volatile! p_ownerOnly)]
        (JR/invoke (JR/fget this :file) :jm_setExecutable_2 @l_writable @l_ownerOnly)))

    
(defn jm_setWritable_1 [this p_writable]
  (let [ l_writable (volatile! p_writable)]
        (JR/invoke (JR/fget this :file) :jm_setWritable_1 @l_writable)))

    
(defn jm_setReadable_2 [this p_readable p_ownerOnly]
  (let [ l_readable (volatile! p_readable) l_ownerOnly (volatile! p_ownerOnly)]
        (JR/invoke (JR/fget this :file) :jm_setReadable_2 @l_readable @l_ownerOnly)))

    
(defn jm_setReadable_1 [this p_readable]
  (let [ l_readable (volatile! p_readable)]
        (JR/invoke (JR/fget this :file) :jm_setReadable_1 @l_readable)))

    
(defn jm_setExecutable_2 [this p_executable p_ownerOnly]
  (let [ l_executable (volatile! p_executable) l_ownerOnly (volatile! p_ownerOnly)]
        (JR/invoke (JR/fget this :file) :jm_setExecutable_2 @l_executable @l_ownerOnly)))

    
(defn jm_setExecutable_1 [this p_executable]
  (let [ l_executable (volatile! p_executable)]
        (JR/invoke (JR/fget this :file) :jm_setExecutable_1 @l_executable)))

    
(defn jm_canExecute_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_canExecute_0)))

    
(defn jm_getTotalSpace_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getTotalSpace_0)))

    
(defn jm_getFreeSpace_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getFreeSpace_0)))

    
(defn jm_getUsableSpace_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_getUsableSpace_0)))

    
(defn jm_compareTo_1 [this p_pathname]
  (let [ l_pathname (volatile! p_pathname)]
        (JR/invoke (JR/fget this :file) :jm_compareTo_1 @l_pathname)))

    
(defn jm_equals_1 [this p_obj]
  (let [ l_obj (volatile! p_obj)]
        (JR/invoke (JR/scall 'TsUtil :jm_getInstance_0) :jm_equalsNotstring_2 (JR/fget this :file) @l_obj)))

    
(defn jm_hashCode_0 [this]
  (let []
        (JR/invoke (JR/fget this :file) :jm_hashCode_0)))

    
(defn jm_toString_0 [this]
  (let []
        (JR/to-string-of (JR/fget this :file))))



