package com.kiki.kikinews.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
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
 * A simple {@link Fragment} subclass.
 */
public class ToutiaoFragment extends BaseFragment {


    @Override
    public String getType() {
        return "top";
    }
}
