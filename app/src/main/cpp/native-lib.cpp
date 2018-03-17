#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_kiki_kikinews_engine_JNI_getAppKey(
        JNIEnv *env,
        jobject instance) {
    std::string appkey="d71a81426419a35599459672300b9481";
    return env->NewStringUTF(appkey.c_str());
}
