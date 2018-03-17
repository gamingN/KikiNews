package com.kiki.kikinews.engine;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.compat.BuildConfig;
import android.support.v7.app.AlertDialog;

import com.kiki.kikinews.ui.adapter.Api;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/9/18.
 */

public class NetWork {
    private static Retrofit retrofit;


    public static Retrofit getRetrofit(){
        if(retrofit==null){
            OkHttpClient client;
            OkHttpClient.Builder builder=new OkHttpClient.Builder();

            if(BuildConfig.DEBUG){
                HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor();
                loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                builder.addInterceptor(loggingInterceptor);
            }
            client=builder.build();
            retrofit=new Retrofit.Builder().baseUrl("http://v.juhe.cn/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }

    public static Api createApi(){
        return NetWork.getRetrofit().create(Api.class);
    }
}
