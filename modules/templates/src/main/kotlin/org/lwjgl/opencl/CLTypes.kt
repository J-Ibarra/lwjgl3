/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl

import org.lwjgl.generator.*

val OPENCL_PACKAGE = "org.lwjgl.opencl"

// numeric

val cl_char = IntegerType("cl_char", PrimitiveMapping.BYTE)
val cl_uchar = IntegerType("cl_uchar", PrimitiveMapping.BYTE, unsigned = true)
val cl_short = IntegerType("cl_short", PrimitiveMapping.SHORT)
val cl_ushort = IntegerType("cl_ushort", PrimitiveMapping.SHORT, unsigned = true)
val cl_int = IntegerType("cl_int", PrimitiveMapping.INT)
val cl_uint = IntegerType("cl_uint", PrimitiveMapping.INT, unsigned = true)
val cl_long = IntegerType("cl_long", PrimitiveMapping.LONG)
val cl_ulong = IntegerType("cl_ulong", PrimitiveMapping.LONG, unsigned = true)
val cl_half = PrimitiveType("cl_half", PrimitiveMapping.SHORT)
val cl_float = PrimitiveType("cl_float", PrimitiveMapping.FLOAT)
val cl_double = PrimitiveType("cl_double", PrimitiveMapping.DOUBLE)

val cl_uchar_p = cl_uchar.p
val cl_int_p = cl_int.p
val cl_uint_p = cl_uint.p
val cl_long_p = cl_long.p
val cl_ulong_p = cl_ulong.p
val cl_half_p = cl_half.p
val cl_float_p = cl_float.p
val cl_double_p = cl_double.p

val cl_uchar_pp = cl_uchar_p.p

// objects

val cl_platform_id = "cl_platform_id".opaque_p
val cl_device_id = "cl_device_id".opaque_p
val cl_context = "cl_context".opaque_p
val cl_command_queue = "cl_command_queue".opaque_p
val cl_mem = "cl_mem".opaque_p
val cl_program = "cl_program".opaque_p
val cl_kernel = "cl_kernel".opaque_p
val cl_event = "cl_event".opaque_p
val cl_sampler = "cl_sampler".opaque_p

val cl_platform_id_p = cl_platform_id.p
val cl_device_id_p = cl_device_id.p
val cl_context_p = cl_context.p
val cl_command_queue_p = cl_command_queue.p
val cl_mem_p = cl_mem.p
val cl_program_p = cl_program.p
val cl_kernel_p = cl_kernel.p
val cl_event_p = cl_event.p
val cl_sampler_p = cl_sampler.p

// typedefs

val cl_bool = typedef(cl_uint, "cl_bool");
val cl_bitfield = typedef(cl_ulong, "cl_bitfield")
val cl_device_type = typedef(cl_bitfield, "cl_device_type")
val cl_platform_info = typedef(cl_uint, "cl_platform_info")
val cl_device_info = typedef(cl_uint, "cl_device_info")
val cl_device_fp_config = typedef(cl_bitfield, "cl_device_fp_config")
val cl_device_mem_cache_type = typedef(cl_uint, "cl_device_mem_cache_type")
val cl_device_local_mem_type = typedef(cl_uint, "cl_device_local_mem_type")
val cl_device_exec_capabilities = typedef(cl_bitfield, "cl_device_exec_capabilities")
val cl_command_queue_properties = typedef(cl_bitfield, "cl_command_queue_properties")
val cl_device_partition_property = PointerType("cl_device_partition_property", PointerMapping.DATA_POINTER)
val cl_device_affinity_domain = typedef(cl_bitfield, "cl_device_affinity_domain")

val cl_context_properties = PrimitiveType("cl_context_properties", PrimitiveMapping.POINTER)
val cl_context_info = typedef(cl_uint, "cl_context_info")
val cl_command_queue_info = typedef(cl_uint, "cl_command_queue_info")
val cl_channel_order = typedef(cl_uint, "cl_channel_order")
val cl_channel_type = typedef(cl_uint, "cl_channel_type")
val cl_mem_flags = typedef(cl_bitfield, "cl_mem_flags")
val cl_mem_object_type = typedef(cl_uint, "cl_mem_object_type")
val cl_mem_info = typedef(cl_uint, "cl_mem_info")
val cl_mem_migration_flags = typedef(cl_bitfield, "cl_mem_migration_flags")
val cl_image_info = typedef(cl_uint, "cl_image_info")
val cl_buffer_create_type = typedef(cl_uint, "cl_buffer_create_type")
val cl_addressing_mode = typedef(cl_uint, "cl_addressing_mode")
val cl_filter_mode = typedef(cl_uint, "cl_filter_mode")
val cl_sampler_info = typedef(cl_uint, "cl_sampler_info")
val cl_map_flags = typedef(cl_bitfield, "cl_map_flags")
val cl_program_info = typedef(cl_uint, "cl_program_info")
val cl_program_build_info = typedef(cl_uint, "cl_program_build_info")
val cl_program_binary_type = typedef(cl_uint, "cl_program_binary_type")
val cl_build_status = typedef(cl_int, "cl_build_status")
val cl_kernel_info = typedef(cl_uint, "cl_kernel_info")
val cl_kernel_arg_info = typedef(cl_uint, "cl_kernel_arg_info")
val cl_kernel_arg_address_qualifier = typedef(cl_uint, "cl_kernel_arg_address_qualifier")
val cl_kernel_arg_access_qualifier = typedef(cl_uint, "cl_kernel_arg_access_qualifier")
val cl_kernel_arg_type_qualifier = typedef(cl_bitfield, "cl_kernel_arg_type_qualifier")
val cl_kernel_work_group_info = typedef(cl_uint, "cl_kernel_work_group_info")
val cl_kernel_sub_group_info = typedef(cl_uint, "cl_kernel_sub_group_info")
val cl_event_info = typedef(cl_uint, "cl_event_info")
val cl_command_type = typedef(cl_uint, "cl_command_type")
val cl_profiling_info = typedef(cl_uint, "cl_profiling_info")

val cl_context_properties_p = cl_context_properties.p

// OpenCL 2.0
val cl_command_queue_properties_p = cl_command_queue_properties.p

val cl_sampler_properties = typedef(cl_uint, "cl_sampler_properties")
val cl_sampler_properties_p = cl_sampler_properties.p

val cl_pipe_properties = typedef(cl_uint, "cl_pipe_properties")
val cl_pipe_properties_p = cl_pipe_properties.p
val cl_pipe_info = typedef(cl_uint, "cl_pipe_info")

val cl_kernel_exec_info = typedef(cl_uint, "cl_kernel_exec_info")
val cl_svm_mem_flags = typedef(cl_bitfield, "cl_svm_mem_flags")

// strings

val cl_charASCII_p = CharSequenceType(name = "cl_char", charMapping = CharMapping.ASCII)
val cl_charASCII_pp = cl_charASCII_p.p

val cl_charUTF8_p = CharSequenceType(name = "cl_char", charMapping = CharMapping.UTF8)
val cl_charUTF8_pp = cl_charUTF8_p.p

// structs

val cl_image_format_p = struct_p(OPENCL_PACKAGE, "CLImageFormat", nativeName = "cl_image_format") {
	documentation = "The image format descriptor struct."

	cl_channel_order.member(
		"image_channel_order",
		"specifies the number of channels and the channel layout i.e. the memory layout in which channels are stored in the image"
	)
	cl_channel_type.member(
		"image_channel_data_type",
		"""
		describes the size of the channel data type. The number of bits per element determined by the {@code image_channel_data_type} and
		{@code image_channel_order} must be a power of two.
		"""
	)
}

val cl_image_desc_p = struct_p(OPENCL_PACKAGE, "CLImageDesc", nativeName = "cl_image_desc") {
	documentation = "Describes the type and dimensions of the image or image array."

	cl_mem_object_type.member("image_type", "describes the image type")
	size_t.member(
		"image_width",
		"""
		the width of the image in pixels. For a 2D image and image array, the image width must be &le; CL10#CL_DEVICE_IMAGE2D_MAX_WIDTH. For a 3D image, the
		image width must be &le; CL10#CL_DEVICE_IMAGE3D_MAX_WIDTH. For a 1D image buffer, the image width must be &le; #DEVICE_IMAGE_MAX_BUFFER_SIZE.
		For a 1D image and 1D image array, the image width must be &le; CL10#CL_DEVICE_IMAGE2D_MAX_WIDTH.
		"""
	)
	size_t.member(
		"image_height",
		"""
		the height of the image in pixels. This is only used if the image is a 2D, 3D or 2D image array. For a 2D image or image array, the image height must
		be &le; CL10#CL_DEVICE_IMAGE2D_MAX_HEIGHT. For a 3D image, the image height must be &le; CL10#CL_DEVICE_IMAGE3D_MAX_HEIGHT.
		"""
	)
	size_t.member(
		"image_depth",
		"the depth of the image in pixels. This is only used if the image is a 3D image and must be a value &ge; 1 and &le; CL10#CL_DEVICE_IMAGE3D_MAX_DEPTH."
	)
	size_t.member(
		"image_array_size",
		"""
		the number of images in the image array. This is only used if the image is a 1D or 2D image array. The values for {@code image_array_size}, if
		specified, must be a value &ge; 1 and &le; #DEVICE_IMAGE_MAX_ARRAY_SIZE.

		Note that reading and writing 2D image arrays from a kernel with {@code image_array_size = 1} may be lower performance than 2D images.
		"""
	)
	size_t.member(
		"image_row_pitch",
		"""
		the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is $NULL and can be either 0 or &ge; {@code image_width * size} of element in bytes if
		{@code host_ptr} is not $NULL. If {@code host_ptr} is not $NULL and {@code image_row_pitch = 0}, {@code image_row_pitch} is calculated as
		{@code image_width * size} of element in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
		"""
	)
	size_t.member(
		"image_slice_pitch",
		"""
		the size in bytes of each 2D slice in the 3D image or the size in bytes of each image in a 1D or 2D image array. This must be 0 if {@code host_ptr} is
		$NULL. If {@code host_ptr} is not $NULL, {@code image_slice_pitch} can be either 0 or &ge; {@code image_row_pitch * image_height} for a 2D image array
		or 3D image and can be either 0 or &ge; {@code image_row_pitch} for a 1D image array. If {@code host_ptr} is not $NULL and
		{@code image_slice_pitch = 0}, {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height} for a 2D image array or 3D image and
		{@code image_row_pitch} for a 1D image array. If {@code image_slice_pitch} is not 0, it must be a multiple of the {@code image_row_pitch}.
		"""
	)
	cl_uint.member("num_mip_levels", "must be 0")
	cl_uint.member("num_samples", "must be 0")
	nullable..cl_mem.member(
		"buffer",
		"""
		refers to a valid buffer memory object if {@code image_type} is CL10#CL_MEM_OBJECT_IMAGE1D_BUFFER. Otherwise it must be $NULL. For a 1D image buffer
		object, the image pixels are taken from the buffer object's data store. When the contents of a buffer object's data store are modified, those changes
		are reflected in the contents of the 1D image buffer object and vice-versa at corresponding sychronization points. The {@code image_width * size} of
		element in bytes must be &le; size of buffer object data store.
		"""
	)
}

val cl_bus_address_amd_p = struct_p(OPENCL_PACKAGE, "CLBusAddressAMD", nativeName = "cl_bus_address_amd") {
	documentation = "Bus address information used in #EnqueueMakeBuffersResidentAMD()."

	cl_long.member(
		"surfbusaddress",
		"contains the page aligned physical starting address of the backing store preallocated by the application on a remote device"
	)
	cl_long.member(
		"signalbusaddress",
		"contains the page aligned physical starting address of preallocated signaling surface"
	)
}

fun config() {
	packageInfo(
		OPENCL_PACKAGE,
		"""
		Contains bindings to the <a href="https://www.khronos.org/opencl/">OpenCL</a> cross-platform parallel programming API.

		The <a href="https://www.khronos.org/registry/cl/">Khronos OpenCL registry</a> is a useful online resource that contains the OpenCL specification, as
		well as the specifications of OpenCL extensions.
		"""
	)

	struct(OPENCL_PACKAGE, "CLBufferRegion", nativeName = "cl_buffer_region") {
		documentation = "Buffer region struct."

		size_t.member("origin", "the region offset, in bytes")
		size_t.member("size", "the region size, in bytes")
	}

	union(OPENCL_PACKAGE, "CLDeviceTopologyAMD", nativeName = "cl_device_topology_amd", mutable = false) {
		documentation =
			"The struct returned by #GetDeviceInfo() with {@code param_name} set to #DEVICE_TOPOLOGY_AMD."

		struct("raw", "") {
			cl_uint.member("type", "")
			cl_uint.array("data", "", size = 5)
		}
		struct("pcie", "") {
			cl_uint.member("type", "")
			padding(17)
			cl_char.member("bus", "")
			cl_char.member("device", "")
			cl_char.member("function", "")
		}
	}

	struct(OPENCL_PACKAGE, "CLMotionEstimationDescINTEL", nativeName = "cl_motion_estimation_desc_intel") {
		documentation = "Describes the configuration of the motion estimation algorithm."

		cl_uint.member("mb_block_type", "describes the size of the blocks described by the motion estimator")
		cl_uint.member("subpixel_mode", "defines the search precision (and hence, the precision of the returned motion vectors)")
		cl_uint.member("sad_adjust_mode", "specifies distortion measure adjustment used for the motion search SAD comparison")
		cl_uint.member(
			"search_path_type",
			"""
			specifies the search path and search radius when matching blocks in the neighborhood of each pixel block (optionally offset by the predicted motion
			vector). Currently, all search algorithms match the source block with pixel blocks in the reference area exhaustively within a {@code [Rx, Ry]}
			radius from the current source pixel block location (optionally offset by the predicted motion vector)
			"""
		)
	}
}

// callback functions
val cl_context_callback = "cl_context_callback".callback(
	OPENCL_PACKAGE, void, "CLContextCallback",
	"Will be called when a debug message is generated.",
	NullTerminated..const..cl_charUTF8_p.IN("errinfo", "a pointer to the message string representation"),
	const..void_p.IN(
		"private_info",
		"a pointer to binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in debugging the error"
	),
	AutoSize("private_info")..size_t.IN("cb", "the number of bytes in the {@code private_info} pointer"),
	void_p.IN("user_data", "the user-specified value that was passed when calling #CreateContext() or #CreateContextFromType()")
) {
	documentation = "Instances of this interface may be passed to the #CreateContext() and #CreateContextFromType() methods."
	useSystemCallConvention()
}

val cl_program_callback = "cl_program_callback".callback(
	OPENCL_PACKAGE, void, "CLProgramCallback",
	"Will be called when the program is built, compiled or linked.",
	cl_program.IN("program", "the program that was built, compiled or linked"),
	void_p.IN(
		"user_data",
		"the user-specified value that was passed when calling #BuildProgram(), #CompileProgram() or #LinkProgram()"
	)
) {
	documentation = "Instances of this interface may be passed to the #BuildProgram(), #CompileProgram() and #LinkProgram() methods."
	useSystemCallConvention()
}

val cl_native_kernel = "cl_native_kernel".callback(
	OPENCL_PACKAGE, void, "CLNativeKernel",
	"Will be called by the OpenCL using #EnqueueNativeKernel().",
	void_p.IN("args", "a pointer to the arguments list")
) {
	documentation = "Instances of this interface may be passed to the #EnqueueNativeKernel() method."
	useSystemCallConvention()
}

val cl_mem_object_destructor_callback = "cl_mem_object_destructor_callback".callback(
	OPENCL_PACKAGE, void, "CLMemObjectDestructorCallback",
	"Will be called when a memory object is deleted.",
	cl_mem.IN("memobj", "the memory object that was deleted"),
	void_p.IN("user_data", "the user-specified value that was passed when calling #SetMemObjectDestructorCallback()")
) {
	documentation = "Instances of this interface may be passed to the #SetMemObjectDestructorCallback() method."
	useSystemCallConvention()
}

val cl_event_callback = "cl_event_callback".callback(
	OPENCL_PACKAGE, void, "CLEventCallback",
	"""
	Will be called when the execution status of the command associated with {@code event} changes to an execution status equal or past the status specified by
	{@code command_exec_status}."
	""",
	cl_event.IN("event", "the event"),
	cl_int.IN(
		"event_command_exec_status",
		"""
	    represents the execution status of command for which this callback function is invoked. If the callback is called as the result of the command
	    associated with event being abnormally terminated, an appropriate error code for the error that caused the termination will be passed to
	    {@code event_command_exec_status} instead.
	    """
	),
	void_p.IN("user_data", "the user-specified value that was passed when calling #SetEventCallback()")
) {
	documentation = "Instances of this interface may be passed to the #SetEventCallback() method."
	useSystemCallConvention()
}

val cl_svmfree_callback = "cl_svmfree_callback".callback(
	OPENCL_PACKAGE, void, "CLSVMFreeCallback",
	"Will be called to free shared virtual memory pointers.",
	cl_command_queue.IN("queue", "a valid host command-queue"),
	AutoSize("svm_pointers")..cl_uint.IN("num_svm_pointers", "the number of pointers in the {@code svm_pointers} array"),
	void_pp.IN("svm_pointers", "an array of shared virtual memory pointers to be freed"),
	void_p.IN("user_data", "the user-specified value that was passed when calling #EnqueueSVMFree()")
) {
	documentation = "Instances of this interface may be passed to the #EnqueueSVMFree() method."
	useSystemCallConvention()
}

// OpenGL interop

val cl_gl_context_info = IntegerType("cl_gl_context_info", PrimitiveMapping.INT)
val cl_gl_platform_info = IntegerType("cl_gl_platform_info", PrimitiveMapping.INT)

val cl_gl_object_type = IntegerType("cl_gl_object_type", PrimitiveMapping.INT)
val cl_gl_object_type_p = cl_gl_object_type.p

val cl_gl_texture_info = IntegerType("cl_gl_texture_info", PrimitiveMapping.INT)

// EGL interop

val CLeglImageKHR = "CLeglImageKHR".opaque_p
val CLeglDisplayKHR = "CLeglDisplayKHR".opaque_p
val CLeglSyncKHR = "CLeglSyncKHR".opaque_p

val cl_egl_image_properties_khr = typedef(intptr_t, "cl_egl_image_properties_khr")
val cl_egl_image_properties_khr_p = cl_egl_image_properties_khr.p

// APPLE

val cl_queue_properties_APPLE = typedef(intptr_t, "cl_queue_properties_APPLE")
val cl_queue_properties_APPLE_p = cl_queue_properties_APPLE.p

// EXT

val cl_report_live_objects_altera_callback = "cl_report_live_objects_altera".callback(
	OPENCL_PACKAGE, void, "CLReportLiveObjectsAlteraCallback",
	"Reports a live OpenCL API object.",
	void_p.IN("user_data", "the {@code user_data} argument specified to #ReportLiveObjectsAltera()"),
	void_p.IN("obj_ptr", "a pointer to the live object"),
	const..charASCII_p.IN(
		"type_name",
		"a C string corresponding to the OpenCL API object type. For example, a leaked {@code cl_mem} object will have \"cl_mem\" as its type string."
	),
	cl_uint.IN("refcount", "an instantaneous reference count for the object. Consider it to be immediately stale.")
) {
	documentation = "Instances of this interface may be passed to the #ReportLiveObjectsAltera() method."
	useSystemCallConvention()
}

val cl_device_partition_property_ext = typedef(cl_bitfield, "cl_device_partition_property_ext")
val cl_device_partition_property_ext_p = cl_device_partition_property_ext.p
val cl_mem_migration_flags_ext = typedef(cl_bitfield, "cl_mem_migration_flags_ext")

val cl_image_pitch_info_qcom = typedef(cl_uint, "cl_image_pitch_info_qcom")
val cl_mem_ext_host_ptr = struct_p(OPENCL_PACKAGE, "CLMemEXTHostPtr", nativeName = "cl_mem_ext_host_ptr") {
	documentation = "Accepted by the {@code host_ptr} argument of CL10#clCreateBuffer(), CL10#clCreateImage2D() and CL10#clCreateImage3D()."

	cl_uint.member("allocation_type", "type of external memory allocation. Legal values will be defined in layered extensions.")
	cl_uint.member("host_cache_policy", "host cache policy for this external memory allocation")
}

// INTEL

val cl_accelerator_intel = "cl_accelerator_intel".opaque_p
val cl_accelerator_type_intel = typedef(cl_uint, "cl_accelerator_type_intel")
val cl_accelerator_info_intel = typedef(cl_uint, "cl_accelerator_info_intel")

val cl_va_api_device_source_intel = typedef(cl_uint, "cl_va_api_device_source_intel")
val cl_va_api_device_set_intel = typedef(cl_uint, "cl_va_api_device_set_intel")
val VASurfaceID = typedef(unsigned_int, "VASurfaceID")
val VASurfaceID_p = VASurfaceID.p