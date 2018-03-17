package com.kiki.kikinews.ui.activity;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.kiki.kikinews.R;
import com.kiki.kikinews.utils.PerUtils;
import com.rd.PageIndicatorView;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Button button;
    private int [] imageIds={R.mipmap.indicator1,
            R.mipmap.indicator2,
            R.mipmap.indicator3,
            R.mipmap.indicator4};
    private List<ImageView> lists=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_guide);
        viewPager=(ViewPager) findViewById(R.id.vp_1);
        button=(Button) findViewById(R.id.guide_bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PerUtils.putBoolean(GuideActivity.this,"isfrist",false);
                Intent intent=new Intent(GuideActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        initImage();
        GuideAdapter gudieAdapter=new GuideAdapter();
        viewPager.setAdapter(gudieAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position==imageIds.length-1){
                    button.setVisibility(View.VISIBLE);
                }else{
                    button.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void initImage() {
        for(int i=0;i<imageIds.length;i++){
            ImageView image=new ImageView(this);
            image.setImageResource(imageIds[i]);
            image.setScaleType(ImageView.ScaleType.CENTER_CROP);
            lists.add(image);
        }
    }

    public class GuideAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return lists.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView nimage=lists.get(position);
            container.addView(nimage);
            return nimage;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
