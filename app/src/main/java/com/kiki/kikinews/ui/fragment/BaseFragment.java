package com.kiki.kikinews.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.kiki.kikinews.R;
import com.kiki.kikinews.domain.NewsBean;
import com.kiki.kikinews.engine.JNI;
import com.kiki.kikinews.engine.NetWork;
import com.kiki.kikinews.ui.activity.WebViewActivity;
import com.kiki.kikinews.ui.adapter.NewsListAdapter;
import com.kiki.kikinews.utils.RefreshLayout;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/9/19.
 */

public abstract class BaseFragment extends Fragment{
    List<NewsBean.ResultBean.DataBean> lists;
    ListView listView;
    RefreshLayout refreshLayout;
    ProgressBar progressBar;
    ImageView iv_error;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_base,container,false);
        refreshLayout=(RefreshLayout) view.findViewById(R.id.refresh_layout);
        listView=(ListView) view.findViewById(R.id.list_view);
        progressBar=(ProgressBar) view.findViewById(R.id.pb_frag);
        iv_error=(ImageView) view.findViewById(R.id.iv_error);
        initview();
        initdata();
        return  view;

    }

    private void initdata() {
        progressBar.setVisibility(View.VISIBLE);
        iv_error.setVisibility(View.GONE);
        refresh();
    }


    ArrayAdapter<String> adapter;

    private void initview() {
        refreshLayout.setColorSchemeResources(R.color.colorAccent);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refresh();
            }
        });
        refreshLayout.setHasmore(false);
        iv_error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initdata();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NewsBean.ResultBean.DataBean bean =lists.get(position);
                WebViewActivity.newInstance(getActivity(),bean.getUrl());
            }
        });
    }

    private void refresh() {
        NetWork.createApi().getNews(JNI.getAppKey(),getType())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<NewsBean>() {
                    @Override
                    public void call(NewsBean newsBean) {
                        refreshLayout.setEnabled(true);//允许下啦
                        progressBar.setVisibility(View.GONE);
                        refreshLayout.setRefreshing(false);//停止下拉刷新
                        lists=newsBean.getResult().getData();
                        listView.setAdapter(new NewsListAdapter(getContext(),lists));
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        iv_error.setVisibility(View.VISIBLE);
                        refreshLayout.setEnabled(false);
                        progressBar.setVisibility(View.GONE);
                        refreshLayout.setRefreshing(false);
                        Toast.makeText(getContext(),"请求失败",Toast.LENGTH_SHORT).show();
                        throwable.printStackTrace();
                    }
                });
    }

    public abstract String getType();
}
