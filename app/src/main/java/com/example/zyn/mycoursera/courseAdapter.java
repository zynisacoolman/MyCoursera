package com.example.zyn.mycoursera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;


/**
 * Created by zyn on 15-6-18.
 */
public class courseAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    int resource;
    public courseAdapter(Context context,  List<courseBean> items){
        this.mInflater=LayoutInflater.from(context);
//        this.resource=_resource;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class ViewHolder {
        TextView textViewName;
        TextView textViewUniversity;
        TextView textViewWorkload;
        ImageView ImageViewlogo;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView==null){
            vh=new ViewHolder();
            convertView = mInflater.inflate(R.layout.course_adapter, null);
            vh.ImageViewlogo = (ImageView)convertView.findViewById(R.id.icon);
            vh.textViewName = (TextView)convertView.findViewById(R.id.title);
            vh.textViewUniversity = (TextView)convertView.findViewById(R.id.info);
            vh.textViewWorkload = (TextView)convertView.findViewById(R.id.workload);
            convertView.setTag(vh);
        }
        return convertView;
    }
}
