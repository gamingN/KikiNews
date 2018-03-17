package com.kiki.kikinews.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kiki.kikinews.R;
import com.kiki.kikinews.domain.NewsBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */

public class NewsListAdapter extends BaseAdapter{
    private List<NewsBean.ResultBean.DataBean> lists;
    private Context context;

    public void setData(List<NewsBean.ResultBean.DataBean> lists){
        this.lists=lists;
    }

    public NewsListAdapter(Context context,List<NewsBean.ResultBean.DataBean> lists){
        this.context=context;
        this.lists=lists;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    View view;
    MyViewHolder myViewHolder;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            view=LayoutInflater.from(context).inflate(R.layout.item_news,null,false);
            myViewHolder=new MyViewHolder();
            myViewHolder.iv_icon=(ImageView) view.findViewById(R.id.iv_icon);
            myViewHolder.tv_title=(TextView) view.findViewById(R.id.tv_title);
            myViewHolder.tv_author=(TextView) view.findViewById(R.id.tv_author);
            myViewHolder.tv_date=(TextView) view.findViewById(R.id.tv_date);
            view.setTag(myViewHolder);
        }else {
            view=convertView;
            myViewHolder= (MyViewHolder) view.getTag();
        }
        NewsBean.ResultBean.DataBean bean=lists.get(position);
        myViewHolder.tv_title.setText(bean.getTitle());
        myViewHolder.tv_author.setText(bean.getAuthor_name());
        myViewHolder.tv_date.setText(bean.getDate());
        if(!TextUtils.isEmpty(bean.getThumbnail_pic_s())){
            Picasso.with(context).load(bean.getThumbnail_pic_s())
                    .error(R.mipmap.ic_launcher)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(myViewHolder.iv_icon);
        }
        return view;
    }

    private static class MyViewHolder {
        ImageView iv_icon;
        TextView tv_title,tv_author,tv_date;
    }
}
