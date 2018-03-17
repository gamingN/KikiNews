package com.kiki.kikinews.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2017/9/16.
 */

public class PerUtils {
    public static final String PREF_NAME="news";
    public static SharedPreferences sp;

    public static void putBoolean(Context context,String key,Boolean value){
        if(sp==null){
            sp=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        }
        sp.edit().putBoolean(key,value).apply();
    }

    public static void putString(Context context,String key,String value){
        if(sp==null){
            sp=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        }
        sp.edit().putString(key,value).apply();
    }

    public static boolean getBoolean(Context context,String key,Boolean defvalue){
        if(sp==null){
            sp=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        }
        return sp.getBoolean(key,defvalue);
    }

    public static String getString(Context context,String key,String defvalue){
        if(sp==null){
            sp=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        }
        return sp.getString(key,defvalue);
    }
}
