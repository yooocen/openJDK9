/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_sun_management_internal_DiagnosticCommandImpl */

#ifndef _Included_com_sun_management_internal_DiagnosticCommandImpl
#define _Included_com_sun_management_internal_DiagnosticCommandImpl
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_sun_management_internal_DiagnosticCommandImpl
 * Method:    setNotificationEnabled
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL Java_com_sun_management_internal_DiagnosticCommandImpl_setNotificationEnabled
  (JNIEnv *, jobject, jboolean);

/*
 * Class:     com_sun_management_internal_DiagnosticCommandImpl
 * Method:    getDiagnosticCommands
 * Signature: ()[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_com_sun_management_internal_DiagnosticCommandImpl_getDiagnosticCommands
  (JNIEnv *, jobject);

/*
 * Class:     com_sun_management_internal_DiagnosticCommandImpl
 * Method:    getDiagnosticCommandInfo
 * Signature: ([Ljava/lang/String;)[Lcom/sun/management/internal/DiagnosticCommandInfo;
 */
JNIEXPORT jobjectArray JNICALL Java_com_sun_management_internal_DiagnosticCommandImpl_getDiagnosticCommandInfo
  (JNIEnv *, jobject, jobjectArray);

/*
 * Class:     com_sun_management_internal_DiagnosticCommandImpl
 * Method:    executeDiagnosticCommand
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_sun_management_internal_DiagnosticCommandImpl_executeDiagnosticCommand
  (JNIEnv *, jobject, jstring);

#ifdef __cplusplus
}
#endif
#endif