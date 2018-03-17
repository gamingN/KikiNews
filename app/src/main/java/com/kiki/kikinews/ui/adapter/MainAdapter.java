package com.kiki.kikinews.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.kiki.kikinews.ui.fragment.CaijingFragment;
import com.kiki.kikinews.ui.fragment.JunshiFragment;
import com.kiki.kikinews.ui.fragment.KejiFragment;
import com.kiki.kikinews.ui.fragment.ShehuiFragment;
import com.kiki.kikinews.ui.fragment.TiyuFragment;
import com.kiki.kikinews.ui.fragment.ToutiaoFragment;
import com.kiki.kikinews.ui.fragment.YuleFragment;

/**
 * Created by Administrator on 2017/9/17.
 */

public class MainAdapter extends FragmentPagerAdapter{

    private String[] newstitle={"头条","社会","娱乐","体育","军事","科技","财经"};

    public MainAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ToutiaoFragment();
        }else if(position==1){
            return new ShehuiFragment();
        }else if(position==2){
            return new YuleFragment();
        }else if(position==3){
            return new TiyuFragment();
        }else if(position==4){
            return new JunshiFragment();
        }else if(position==5){
            return new KejiFragment();
        }else{
            return new CaijingFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return newstitle[position];
    }

    @Override
    public int getCount() {
        return newstitle.length;
    }
}
