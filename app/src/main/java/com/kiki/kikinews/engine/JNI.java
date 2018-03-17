package com.kiki.kikinews.engine;

/**
 * Created by Administrator on 2017/9/18.
 */

public class JNI {
    static {
        System.loadLibrary("native-lib");
    }
    public static native String getAppKey();
}
