package com.kiki.kikinews.ui.adapter;

import com.kiki.kikinews.domain.NewsBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/9/18.
 */

public interface Api {
    @GET("toutiao/index")
    Observable<NewsBean> getNews(@Query("key") String key, @Query("type")String type);
}
