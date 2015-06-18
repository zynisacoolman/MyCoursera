package com.example.zyn.mycoursera;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by zyn on 15-6-18.
 */
public class courseAdapter extends BaseAdapter {

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

    }
}
