/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class sun_nio_fs_MacOSXNativeDispatcher */

#ifndef _Included_sun_nio_fs_MacOSXNativeDispatcher
#define _Included_sun_nio_fs_MacOSXNativeDispatcher
#ifdef __cplusplus
extern "C" {
#endif
#undef sun_nio_fs_MacOSXNativeDispatcher_SUPPORTS_OPENAT
#define sun_nio_fs_MacOSXNativeDispatcher_SUPPORTS_OPENAT 2L
#undef sun_nio_fs_MacOSXNativeDispatcher_SUPPORTS_FUTIMES
#define sun_nio_fs_MacOSXNativeDispatcher_SUPPORTS_FUTIMES 4L
#undef sun_nio_fs_MacOSXNativeDispatcher_SUPPORTS_BIRTHTIME
#define sun_nio_fs_MacOSXNativeDispatcher_SUPPORTS_BIRTHTIME 65536L
#undef sun_nio_fs_MacOSXNativeDispatcher_kCFStringNormalizationFormC
#define sun_nio_fs_MacOSXNativeDispatcher_kCFStringNormalizationFormC 2L
#undef sun_nio_fs_MacOSXNativeDispatcher_kCFStringNormalizationFormD
#define sun_nio_fs_MacOSXNativeDispatcher_kCFStringNormalizationFormD 0L
/*
 * Class:     sun_nio_fs_MacOSXNativeDispatcher
 * Method:    normalizepath
 * Signature: ([CI)[C
 */
JNIEXPORT jcharArray JNICALL Java_sun_nio_fs_MacOSXNativeDispatcher_normalizepath
  (JNIEnv *, jclass, jcharArray, jint);

#ifdef __cplusplus
}
#endif
#endif