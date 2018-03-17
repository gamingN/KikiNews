package com.kiki.kikinews.utils;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import com.kiki.kikinews.R;

/**
 * Created by Administrator on 2017/9/17.
 */

public class RefreshLayout extends SwipeRefreshLayout implements AbsListView.OnScrollListener{
    private ListView mListView;
    private OnLoadListener monLoadListener;
    private boolean hasmore=true;
    private boolean isloading =false;
    private View listfooter;


    public RefreshLayout(Context context) {
        super(context,null);
    }

    public RefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        listfooter= LayoutInflater.from(context).inflate(R.layout.footer,null,false);

    }

    public interface OnLoadListener{
        public void onLoad();
    }

    public void setOnloadListener(OnLoadListener monLoadListener){
        this.monLoadListener=monLoadListener;
    }

    public void setHasmore(boolean hasmore){
        this.hasmore=hasmore;
    }


    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if(mListView==null){
            getListView();
        }
    }

    public void getListView(){
        int childs=getChildCount();
        if(childs>0){
            View childView=getChildAt(0);
            if(childView instanceof ListView) {
                mListView = (ListView) childView;
                mListView.setOnScrollListener(RefreshLayout.this);
            }
        }
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

        if(hasmore && mListView.getLastVisiblePosition()==mListView.getAdapter().getCount()-1 && isloading==false){
            setOnload(true);
            monLoadListener.onLoad();
        }
    }

    public void setOnload(boolean b) {
        isloading=b;
        if(isloading){
            mListView.addFooterView(listfooter);
        }else{
            mListView.removeFooterView(listfooter);
        }
    }
}
